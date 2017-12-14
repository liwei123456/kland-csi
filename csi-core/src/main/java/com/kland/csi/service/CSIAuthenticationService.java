package com.kland.csi.service;

import com.kland.csi.api.identity.AuthenticateRequest;
import com.kland.csi.api.identity.AuthenticateResponse;
import com.kland.csi.api.identity.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by xiangli.
 */
@Controller
@Path("/authentication")
public class CSIAuthenticationService {
    private AuthenticationService authenticationService;

    @Autowired
    public CSIAuthenticationService(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public AuthenticateResponse authenticate(AuthenticateRequest authenticateRequest) {
        return authenticationService.authenticate(authenticateRequest);
    }

    @POST
    @Path("/logout")
    @Produces(MediaType.APPLICATION_JSON)
    public AuthenticateResponse logout(){
        return authenticationService.logout();
    }

    @POST
    @Path("/forgetPassword")
    @Produces(MediaType.APPLICATION_JSON)
    public AuthenticateResponse forgetPassword(AuthenticateRequest authenticateRequest){
        return authenticationService.forgetPassword(authenticateRequest);
    }
}
