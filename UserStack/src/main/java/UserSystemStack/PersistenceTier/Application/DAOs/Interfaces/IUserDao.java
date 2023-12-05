package UserSystemStack.PersistenceTier.Application.DAOs.Interfaces;

import UserSystemStack.Shared.DTOs.LoginDto;
import UserSystemStack.Shared.DTOs.RegisterDto;
import UserSystemStack.Shared.DTOs.UserDto;
import UserSystemStack.Shared.DTOs.UserInfoformationDto;
import org.springframework.stereotype.Component;

public interface IUserDao {

    UserInfoformationDto getUserInfo(UserDto userDto);

    boolean login(LoginDto loginDto);

    boolean register(RegisterDto registerDto);
}
