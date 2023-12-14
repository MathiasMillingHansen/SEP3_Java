package UserSystemStack.BusinessTier.Application.Logic.Interfaces;

import UserSystemStack.Shared.DTOs.LoginDto;
import UserSystemStack.Shared.DTOs.RegisterDto;

public interface IUserLogic {

    boolean register(RegisterDto registerDto);

    boolean login(LoginDto loginDto);
}
