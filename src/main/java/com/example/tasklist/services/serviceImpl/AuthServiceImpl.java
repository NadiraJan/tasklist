package com.example.tasklist.services.serviceImpl;

import com.example.tasklist.services.AuthService;
import com.example.tasklist.web.dto.authentifiaction.JwtRequest;
import com.example.tasklist.web.dto.authentifiaction.JwtResponse;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {


    @Override
    public JwtResponse login(JwtRequest loginRequest) {
        return null;
    }

    @Override
    public JwtResponse refresh(String refreshToken) {
        return null;
    }
}
