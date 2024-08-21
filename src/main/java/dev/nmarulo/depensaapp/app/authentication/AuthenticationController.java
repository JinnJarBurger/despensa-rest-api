package dev.nmarulo.depensaapp.app.authentication;

import dev.nmarulo.depensaapp.app.authentication.dtos.AuthenticationReq;
import dev.nmarulo.depensaapp.app.authentication.dtos.AuthenticationRes;
import dev.nmarulo.depensaapp.app.authentication.dtos.RegisterAuthenticationReq;
import dev.nmarulo.depensaapp.app.authentication.dtos.RegisterAuthenticationRes;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
@Getter
public class AuthenticationController {
    
    private final AuthenticationService authenticationService;
    
    @PostMapping("/login")
    public ResponseEntity<AuthenticationRes> login(@RequestBody AuthenticationReq request) {
        return ResponseEntity.ok(this.authenticationService.login(request));
    }
    
    @PostMapping("/register")
    public ResponseEntity<RegisterAuthenticationRes> register(@RequestBody RegisterAuthenticationReq request) {
        return ResponseEntity.ok(this.authenticationService.register(request));
    }
    
}