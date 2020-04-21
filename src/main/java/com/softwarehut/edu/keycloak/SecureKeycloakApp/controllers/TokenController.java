package com.softwarehut.edu.keycloak.SecureKeycloakApp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softwarehut.edu.keycloak.SecureKeycloakApp.security.utils.TokenUtils;

@RestController
public class TokenController {
    @RequestMapping("/token")
    public String getToken(){
        return TokenUtils.getJWTToken();
    }
}
