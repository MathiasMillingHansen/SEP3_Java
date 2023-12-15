package UserSystemStack.BusinessTier.Server.WebAPI.Controllers;

import UserSystemStack.BusinessTier.Application.Logic.Interfaces.IUserLogic;
import UserSystemStack.Shared.DTOs.LoginDto;
import UserSystemStack.Shared.DTOs.RegisterDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final IUserLogic userLogic;

    @Autowired
    public UserController(IUserLogic userLogic) {
        this.userLogic = userLogic;
    }

    @PostMapping("/register")
    public ResponseEntity<Boolean> register(@RequestBody RegisterDto registerDto) {
        return ResponseEntity.ok(userLogic.register(registerDto));
    }

    @GetMapping("/login")
    public ResponseEntity<Boolean> login(@RequestBody LoginDto loginDto) {
        return ResponseEntity.ok(userLogic.login(loginDto));
    }
}
