package com.services.REST;

import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Context;


public abstract class RestService {
    @Context
    private HttpServletRequest httpRequest;
    
    @Context
    private HttpServletResponse httpResponse;
   
    
    public HttpServletRequest getHttpRequest(){
        return httpRequest;
    }
    
    public HttpServletResponse getHttpResponse(){
        return httpResponse;
    }
}
