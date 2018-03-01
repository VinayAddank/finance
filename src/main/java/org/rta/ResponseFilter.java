package org.rta;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.rta.finance.security.utills.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class ResponseFilter extends OncePerRequestFilter {

    @Value("${jwt.header}")
     private String tokenHeader;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        String token = request.getHeader("");
        if (200 == response.getStatus() && !StringUtils.isEmpty(token)) {
            String refToken = jwtTokenUtil.refreshToken(token);
            response.addHeader("token", refToken);
        }
        filterChain.doFilter(request, response);
    }

}
