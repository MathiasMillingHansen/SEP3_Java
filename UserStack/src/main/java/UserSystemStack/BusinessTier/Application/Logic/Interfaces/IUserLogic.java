package UserSystemStack.BusinessTier.Application.Logic.Interfaces;

import UserSystemStack.Shared.DTOs.LoginDto;
import UserSystemStack.Shared.DTOs.RegisterDto;
import UserSystemStack.Shared.DTOs.UserInfoDto;

public interface IUserLogic {

    boolean register(RegisterDto registerDto);

    boolean login(LoginDto loginDto);
}
