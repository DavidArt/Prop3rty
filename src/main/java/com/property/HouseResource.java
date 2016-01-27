package com.property;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by D on 1/24/2016.
 */
// @Path is used to define an URI matching pattern for an incoming HTTP request
// It's relative. For example this app can be found at localhost:8080/property ... so "house"
// means that the class will respond to HTTP requests from localhost:8080/property/house
@Path("house")
public class HouseResource {
    private HouseDao houseDao = new HouseDaoImpl();

    // @GET - the name of the HTTP method that the Java method will respond to
    //      - GET method is usually used to read data
    // this method will respond if the request is a GET and the URI is localhost:8080/property/house
    // @Produces(MediaType.APPLICATION_JSON) - the method will respond with a json
    // @PathParam - it's a parameter that will be passed to the method via the URI.
    //            - for example: localhost:8080/property/house/58
    //            - the PathParam, the id, is 58
    //            - there are plenty more parameters (i.e. QueryParam, FormParam)
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getHouse(@PathParam("id") int id) {
        List<House> house = houseDao.find(id);

        return Response.status(200).entity(house.get(0)).build();
    }

    // @POST - the name of the HTTP method that the Java method will respond to
    // this method will respond if the request is a POST and the URI is localhost:8080/property/house
    //       - POST method is usually used to create data
    // @Produces a Json
    // @Consumes a Json meaning that it will take data in the json format
    //          (the method parameter - house - is the object that will receive the json
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createHouse(House house) {
        System.out.println(house);
        houseDao.create(house);

        return Response.status(201).entity(house).build();
    }

    // @PUT - the name of the HTTP method that the Java method will respond to
    // this method will respond if the request is a POST and the URI is localhost:8080/property/house
    //      - PUT method is usually used to update data
    // @Produces a Json
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateHouse() {
        House house = new House();
        house.setSquareMeters(300);

        return Response.status(200).entity(house).build();
    }

    // @DELETE - the name of the HTTP method that the Java method will respond to
    //         - DELETE method is usually used to delete data
    @DELETE
    public Response deleteHouse() {
        House house = new House();
        house.setSquareMeters(300);

        return Response.status(204).entity(house).build();
    }

}
