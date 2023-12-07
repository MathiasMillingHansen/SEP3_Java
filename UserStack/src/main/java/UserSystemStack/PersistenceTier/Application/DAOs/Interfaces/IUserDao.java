package UserSystemStack.PersistenceTier.Application.DAOs.Interfaces;

import UserSystemStack.Shared.DTOs.LoginDto;
import UserSystemStack.Shared.DTOs.RegisterDto;
import UserSystemStack.Shared.DTOs.UserDto;
import UserSystemStack.Shared.DTOs.UserInfoDto;

public interface IUserDao {

    UserInfoDto getUserInfo(UserDto userDto);

    boolean login(LoginDto loginDto);

    boolean register(RegisterDto registerDto);

    boolean userExists(String username);
}
