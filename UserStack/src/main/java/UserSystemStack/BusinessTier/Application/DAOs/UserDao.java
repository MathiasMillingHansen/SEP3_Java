package UserSystemStack.BusinessTier.Application.DAOs;

import UserSystemStack.*;
import UserSystemStack.BusinessTier.Application.DAOs.Interfaces.IUserDao;
import UserSystemStack.Shared.DTOs.LoginDto;
import UserSystemStack.Shared.DTOs.RegisterDto;
import UserSystemStack.Shared.DTOs.UserInfoformationDto;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("singleton")
public class UserDao implements IUserDao {

    @Override
    public boolean register(RegisterDto registerDto) {
        UserServiceGrpc.UserServiceBlockingStub stub = getStub();

        return stub.register(registerRequest.newBuilder()
                        .setMessage(registerMessage.newBuilder()
                                .setUsername(registerDto.getUsername())
                                .setPassword(registerDto.getPassword())
                                .setEmail(registerDto.getEmail())
                                .setPhoneNumber(registerDto.getPhoneNumber())
                                .build())
                        .build())
                .getSuccess();
    }

    @Override
    public boolean login(LoginDto loginDto) {
        UserServiceGrpc.UserServiceBlockingStub stub = getStub();

        return stub.login(loginRequest.newBuilder()
                        .setMessage(loginMessage.newBuilder()
                                .setUsername(loginDto.getUsername())
                                .setPassword(loginDto.getPassword())
                                .build())
                        .build())
                .getSuccess();
    }

    @Override
    public UserInfoformationDto getUserInformation(String username) {
        UserServiceGrpc.UserServiceBlockingStub stub = getStub();

        getUserInformationResponse response = stub.getUserInformation(getUserInformationRequest.newBuilder()
                .setUsername(username)
                .build());

        return new UserInfoformationDto(response.getMessage().getUsername(),
                response.getMessage().getEmail(),
                response.getMessage().getPhoneNumber());
    }


    private ManagedChannel getChannel() {
        return ManagedChannelBuilder
                .forAddress("localhost", 4444)
                .usePlaintext()
                .build();
    }

    private UserServiceGrpc.UserServiceBlockingStub getStub() {
        return UserServiceGrpc.newBlockingStub(getChannel());
    }
}
