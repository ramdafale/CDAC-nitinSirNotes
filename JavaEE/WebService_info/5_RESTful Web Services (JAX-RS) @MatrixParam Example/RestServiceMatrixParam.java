package mypack; 
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
 
@Path("/customers")
public class RestServiceMatrixParam{
    
    @GET
    @Produces("text/html")
    public Response getResultByPassingValue(
                    @MatrixParam("nameKey") String name,
                    @MatrixParam("countryKey") String country,@MatrixParam("department") String dept) {
        
        String output = "Customer name - "+name+", Country - "+country+""+", department  -"+dept;
        return Response.status(200).entity(output).build();
 
    }
}

