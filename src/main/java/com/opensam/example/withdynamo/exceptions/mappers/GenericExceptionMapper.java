/*
package com.opensam.example.withdynamo.exceptions.mappers;

import com.opensam.example.withdynamo.dataformat.ApiException;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class GenericExceptionMapper implements ExceptionMapper<ApiException> {

    @Override
    public Response toResponse(ApiException ex) {
        return Response.status(ex.getHttpStatus())
                .entity(ex)
                .type(MediaType.APPLICATION_JSON).
                        build();
    }
}
*/
