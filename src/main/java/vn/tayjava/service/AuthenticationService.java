package vn.tayjava.service;

import vn.tayjava.dto.request.SignInRequest;
import vn.tayjava.dto.response.TokenResponse;

public interface AuthenticationService {

    TokenResponse getAccessToken(SignInRequest request);

    TokenResponse getRefreshToken(String request);
}