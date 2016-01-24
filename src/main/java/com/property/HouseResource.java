package com.property;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by D on 1/24/2016.
 */
@Path("house")
public class HouseResource {
    private HouseDao houseDao = new HouseDaoImpl();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getHouse(@PathParam("id") int id){
        List<House> house = houseDao.find(id);

        return Response.status(200).entity(house.get(0)).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createHouse(House house){
        System.out.println(house);
        houseDao.create(house);
        return Response.status(201).entity(house).build();
    }

}
