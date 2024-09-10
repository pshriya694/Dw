package com.flipkart.RESTcontroller;

import javax.ws.rs.*;

@Path("/HelloRESTAPI")
public class HelloRESTcontroller {

    @GET
    @Path("/HelloGet")
    public String HelloGETService() {
        return "First DropWizard Service";
    }

    @POST
    @Path("/HelloPost")
    public String HelloPOSTService() {
        return "HelloPOSTService";
    }

    @PUT
    @Path("/HelloPut")
    public String HelloPutService() {
        return "HelloPutService";
    }

    @DELETE
    @Path("/HelloDelete")
    public String HelloDeleteService() {
        return "HelloDeleteService";
    }
}

