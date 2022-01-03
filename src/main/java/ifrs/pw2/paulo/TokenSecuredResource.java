package ifrs.pw2.paulo;

import javax.annotation.security.PermitAll;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

import org.eclipse.microprofile.jwt.JsonWebToken;

import io.smallrye.jwt.build.Jwt;

@Path("/secured")
public class TokenSecuredResource {

    @Inject
    JsonWebToken token;

    @GET
    @Path("/jwt")
    @PermitAll
    @Produces(MediaType.TEXT_PLAIN)
    public String generate(@Context SecurityContext ctx) {
        return Jwt.issuer("http://localhost:8080")
                .upn("Antonio").sign();
    }

}