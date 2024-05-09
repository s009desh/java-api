package org.acme;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
public class RestApi {

    @GET
    @Path("/1")
    public Response getOne(){
        User user = new User("Test","one");
        return  Response.ok(user.firstName + " " +user.secondName).build();
    }
    @GET
    @Path("/2")
    public Response getTwo(){
        User user = new User("Test","Two");
        return  Response.ok(user.firstName + " " +user.secondName).build();
    }
    @GET
    @Path("/3")
    public Response getThree(){
        User user = new User("Test","Three");
        return  Response.ok(user.firstName + " " +user.secondName).build();
    }
    @GET
    @Path("/4")
    public Response getFour(){
        User user = new User("Test","Four");
        return  Response.ok(user.firstName + " "+user.secondName).build();
    }
    @GET
    @Path("/5")
    public Response getFive(){
        User user = new User("Test","Five");
        return  Response.ok(user.firstName + " " +user.secondName).build();
    }
    @GET
    @Path("/6")
    public Response getSix(){
        User user = new User("Test","Six");
        return  Response.ok(user.firstName + " " +user.secondName).build();    }
    @GET
    @Path("/7")
    public Response getSeven(){
        User user = new User("Test","Seven");
        return  Response.ok(user.firstName + " " +user.secondName).build();    }
    @GET
    @Path("/8")
    public Response getEight(){
        User user = new User("Test","Eight");
        return  Response.ok(user.firstName + " " +user.secondName).build();    }
    @GET
    @Path("/9")
    public Response getNine(){
        User user = new User("Test","Nine");
        return  Response.ok(user.firstName + " " +user.secondName).build();
    }
    @GET
    @Path("/10")
    public Response getTen(){
        User user = new User("Test","Ten");
        return  Response.ok(user.firstName + " " +user.secondName).build();
    }


}
