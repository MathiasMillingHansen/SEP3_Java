package UserSystemStack.BusinessTier.Application.DAOs.Interfaces;

import UserSystemStack.Shared.DTOs.LoginDto;
import UserSystemStack.Shared.DTOs.RegisterDto;
import UserSystemStack.Shared.DTOs.UserInfoformationDto;
import org.springframework.stereotype.Component;

public interface IUserDao {

    boolean register(RegisterDto registerDto);

    boolean login(LoginDto loginDto);

    UserInfoformationDto getUserInformation(String username);

}
