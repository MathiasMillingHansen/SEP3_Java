package PersistenceTier.Application.DAOs.DaoInterfaces;

import Shared.DTOs.LoginDto;
import Shared.DTOs.RegisterDto;
import Shared.DTOs.UserDto;
import Shared.DTOs.UserInfoDto;

public interface IUserDao {

    UserInfoDto getUserInfo(UserDto userDto);

    boolean login(LoginDto loginDto);

    String register(RegisterDto registerDto);
}
