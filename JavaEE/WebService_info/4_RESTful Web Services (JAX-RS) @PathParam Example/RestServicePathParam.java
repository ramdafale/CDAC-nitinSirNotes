package mypack; 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
 
@Path("/player")
public class RestServicePathParam {
    
    @GET
    @Path("{name}/{country}")
    @Produces("text/html")
    public Response getResultByPassingValue(
                    @PathParam("name") String name,
                    @PathParam("country") String country) {
        
        String output = "Player name - "+name+", Country - "+country+"";
        return Response.status(200).entity(output).build();
 
    }
}

