package UserSystemStack.BusinessTier.Application.DAOs.Interfaces;

import UserSystemStack.Shared.DTOs.LoginDto;
import UserSystemStack.Shared.DTOs.RegisterDto;
import UserSystemStack.Shared.DTOs.UserInfoDto;

public interface IUserDao {

    boolean register(RegisterDto registerDto);

    boolean login(LoginDto loginDto);

    UserInfoDto getUserInformation(String username);

}
