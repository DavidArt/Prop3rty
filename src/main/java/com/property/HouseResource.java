package com.property;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by D on 1/24/2016.
 */
@Path("house")
public class HouseResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getHouse(@PathParam("id") int id){
        HouseDao houseDao = new HouseDaoImpl();
        House house = houseDao.read(id);
        return Response.status(200).entity(house).build();
    }

}
