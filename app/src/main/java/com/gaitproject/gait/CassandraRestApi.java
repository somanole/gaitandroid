package com.gaitproject.gait;

import retrofit.client.Response;
import retrofit.http.Body;
import retrofit.http.POST;

public interface CassandraRestApi {

    @POST("/acceleration")
    public Response sendAccelerationValues(@Body Acceleration acceleration);
}
