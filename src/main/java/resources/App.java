package resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import model.TestEntity;

@Api()
@Path("")
public class App
{
    @ApiOperation(value = "test",
                  response = TestEntity.class)
    @GET
    @Path("/")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response getAllPartners()
    {
      return Response.ok("ok").build();
    }
}