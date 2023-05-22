package com.example.tasklist.services;

import com.example.tasklist.web.dto.authentifiaction.JwtRequest;
import com.example.tasklist.web.dto.authentifiaction.JwtResponse;

public interface AuthService {

    JwtResponse login(JwtRequest loginRequest);

    JwtResponse refresh(String refreshToken);

}
