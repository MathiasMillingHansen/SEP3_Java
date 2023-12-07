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
        try
        {
            validUser(registerDto);
            return userDao.register(registerDto);
        }
        catch (IllegalArgumentException e)
        {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    @Override
    public boolean login(LoginDto loginDto) {
        return userDao.login(loginDto);
    }

    @Override
    public UserInfoDto getUserInformation(String username) {
        return userDao.getUserInformation(username);
    }

    private boolean validUser(RegisterDto registerDto) {
        String username = registerDto.getUsername();
        String password = registerDto.getPassword();
        String email = registerDto.getEmail();
        String phoneNumber = registerDto.getPhoneNumber();

        if (username.length()<4 || username.length()>20) {
            throw new IllegalArgumentException("Username must be between 4 and 20 characters.");
        }

        if (password.length()<4 || password.length()>20) {
            throw new IllegalArgumentException("Password must be between 4 and 20 characters.");
        }

        if (!email.contains("@") || !email.contains(".")) {
            //Add verification of domain name.
            throw new IllegalArgumentException("Invalid email address.");
        }

        if (phoneNumber.length()!=8) {
            //Deal with cases of phone numbers with country code, and other lengths.
            throw new IllegalArgumentException("Phone number must be 8 digits.");
        }

        return true;
    }
}
