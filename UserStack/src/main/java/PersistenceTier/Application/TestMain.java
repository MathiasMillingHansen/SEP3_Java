package PersistenceTier.Application;

import PersistenceTier.Application.DAOs.UserDao;
import Shared.DTOs.LoginDto;
import Shared.DTOs.RegisterDto;
import Shared.DTOs.UserDto;

public class TestMain {
    public static void main(String[] args) {

        UserDao userDao = new UserDao();

        RegisterDto registerDto = new RegisterDto("test3", "test", "test3", "test3");

        userDao.register(registerDto);

        userDao.getUserInfo(new UserDto("test"));

        System.out.println(userDao.login(new LoginDto("test3", "test")));

    }
}
