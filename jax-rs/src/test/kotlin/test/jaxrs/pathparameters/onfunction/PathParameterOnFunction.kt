package test.jaxrs.pathparameters.onfunction

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam

@Path("/todos")
@Suppress("UNUSED_PARAMETER")
class PathParameterOnFunction {

    @GET
    @Path("/{id}")
    fun todo(@PathParam("id") id: String) { }
}
