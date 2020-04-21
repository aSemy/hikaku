package test.jaxrs.queryparameters.onfunction

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.QueryParam

@Path("/todos")
class QueryParameterOnFunction {

    @GET
    @Suppress("UNUSED_PARAMETER")
    fun todo(@QueryParam("filter") filter: String) { }
}
