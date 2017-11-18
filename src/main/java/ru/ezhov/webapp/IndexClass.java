package ru.ezhov.webapp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class IndexClass {
    @GET
    public String index() {
        return "hello";
    }
}
