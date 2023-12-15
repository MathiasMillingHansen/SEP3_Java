package UserSystemStack.PersistenceTier.Server;

import UserSystemStack.PersistenceTier.Application.DAOs.Interfaces.IUserDao;
import UserSystemStack.Shared.DTOs.LoginDto;
import UserSystemStack.Shared.DTOs.RegisterDto;
import UserSystemStack.Shared.DTOs.UserDto;
import UserSystemStack.Shared.DTOs.UserInfoDto;
import UserSystemStack.*;
import io.grpc.stub.StreamObserver;

public class UserDatabaseServer extends UserServiceGrpc.UserServiceImplBase {

    private final IUserDao userDao;

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
                      StreamObserver<UserSystemStack.loginResponse> responseObserver) {
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

        UserInfoDto userInfoDto = userDao.getUserInfo(dto);

        getUserInformationResponse.Builder responseBuilder = getUserInformationResponse.newBuilder();

        responseBuilder.setMessage(
                userInformationMessage.newBuilder()
                        .setUsername(userInfoDto.getUsername())
                        .setEmail(userInfoDto.getEmail())
                        .setPhoneNumber(userInfoDto.getPhoneNumber())
                        .build()
        );

        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void userValidation(UserSystemStack.userValidationRequest request,
                               StreamObserver<UserSystemStack.userValidationResponse> responseObserver) {
        String username = request.getUsername();

        boolean exists = userDao.userExists(username);

        userValidationResponse.Builder responseBuilder = userValidationResponse.newBuilder();

        responseBuilder.setSuccess(exists);

        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

}
