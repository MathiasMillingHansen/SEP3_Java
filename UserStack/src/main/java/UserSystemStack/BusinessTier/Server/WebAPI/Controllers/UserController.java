package UserSystemStack.BusinessTier.Server.WebAPI.Controllers;

import UserSystemStack.BusinessTier.Application.DAOs.Interfaces.IUserDao;
import UserSystemStack.Shared.DTOs.LoginDto;
import UserSystemStack.Shared.DTOs.RegisterDto;
import UserSystemStack.Shared.DTOs.UserInfoformationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private IUserDao userDao;

    @Autowired
    public UserController(IUserDao userDao) {
        this.userDao = userDao;
    }

    @PostMapping("/register")
    public ResponseEntity<Boolean> register(@RequestBody RegisterDto registerDto) {
        return ResponseEntity.ok(userDao.register(registerDto));
    }

    @GetMapping("/login")
    public ResponseEntity<Boolean> login(@RequestBody LoginDto loginDto) {
        return ResponseEntity.ok(userDao.login(loginDto));
    }

    @GetMapping("/userInformation")
    public ResponseEntity<UserInfoformationDto> getUserInformation(@RequestParam("username") String username) {
        return ResponseEntity.ok(userDao.getUserInformation(username));
    }
}
