package UserSystemStack.BusinessTier.Application.Logic.Interfaces;

import UserSystemStack.Shared.DTOs.UserInfoDto;

public interface IUserInfoLogic {

    boolean userExists(String username);

    UserInfoDto getUserInformation(String username);
}
