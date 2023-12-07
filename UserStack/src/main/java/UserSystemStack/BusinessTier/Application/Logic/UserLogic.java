package UserSystemStack.BusinessTier.Application.Logic;

import UserSystemStack.BusinessTier.Application.DAOs.Interfaces.IUserDao;
import UserSystemStack.BusinessTier.Application.Logic.Interfaces.IUserInfoLogic;
import UserSystemStack.BusinessTier.Application.Logic.Interfaces.IUserLogic;
import UserSystemStack.Shared.DTOs.LoginDto;
import UserSystemStack.Shared.DTOs.RegisterDto;
import UserSystemStack.Shared.DTOs.UserInfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class UserLogic implements IUserLogic, IUserInfoLogic {

    private IUserDao userDao;

    @Autowired
    public UserLogic(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean userExists(String username) {
        return userDao.userExists(username);
    }

    @Override
    public boolean register(RegisterDto registerDto) {
        return userDao.register(registerDto);
    }

    @Override
    public boolean login(LoginDto loginDto) {
        return userDao.login(loginDto);
    }

    @Override
    public UserInfoDto getUserInformation(String username) {
        return userDao.getUserInformation(username);
    }
}
