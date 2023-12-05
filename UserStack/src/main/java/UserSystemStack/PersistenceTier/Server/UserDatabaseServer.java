package UserSystemStack.PersistenceTier.Server;

import UserSystemStack.*;
import UserSystemStack.PersistenceTier.Application.DAOs.Interfaces.IUserDao;
import UserSystemStack.Shared.DTOs.LoginDto;
import UserSystemStack.Shared.DTOs.RegisterDto;
import UserSystemStack.Shared.DTOs.UserDto;
import UserSystemStack.Shared.DTOs.UserInfoformationDto;
import io.grpc.stub.StreamObserver;

public class UserDatabaseServer extends UserServiceGrpc.UserServiceImplBase {

    private IUserDao userDao;

    public UserDatabaseServer(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void register(registerRequest request,
                         StreamObserver<registerResponse> responseObserver) {
        RegisterDto dto = new RegisterDto(
                request.getMessage().getUsername(),
                request.getMessage().getPassword(),
                request.getMessage().getEmail(),
                request.getMessage().getPhoneNumber()
        );

        boolean success = userDao.register(dto);

        registerResponse.Builder responseBuilder = registerResponse.newBuilder();

        responseBuilder.setSuccess(success);

        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }


    @Override
    public void login(loginRequest request,
                      StreamObserver<loginResponse> responseObserver) {
        LoginDto dto = new LoginDto(
                request.getMessage().getUsername(),
                request.getMessage().getPassword()
        );

        boolean success = userDao.login(dto);

        loginResponse.Builder responseBuilder = loginResponse.newBuilder();

        responseBuilder.setSuccess(success);

        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }


    @Override
    public void getUserInformation(getUserInformationRequest request,
                            StreamObserver<getUserInformationResponse> responseObserver) {
        UserDto dto = new UserDto(
                request.getUsername()
        );

        UserInfoformationDto userInfoformationDto = userDao.getUserInfo(dto);

        getUserInformationResponse.Builder responseBuilder = getUserInformationResponse.newBuilder();

        responseBuilder.setMessage(
                userInformationMessage.newBuilder()
                        .setUsername(userInfoformationDto.getUsername())
                        .setEmail(userInfoformationDto.getEmail())
                        .setPhoneNumber(userInfoformationDto.getPhoneNumber())
                        .build()
        );

        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

}
