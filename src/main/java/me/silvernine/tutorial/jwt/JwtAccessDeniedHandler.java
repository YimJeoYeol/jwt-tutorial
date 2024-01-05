package me.silvernine.tutorial.jwt;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.stereotype.Component;
import org.springframework.security.web.access.AccessDeniedHandler;

import java.io.IOException;

@Component
public class JwtAccessDeniedHandler implements AccessDeniedHandler{

    public void handle(HttpServletRequest request,
                       HttpServletResponse response,
                       AccessDeniedException accessDeniedException) throws IOException {
        response.sendError(HttpServletResponse.SC_FORBIDDEN);
    }
}