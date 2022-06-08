package com.moringaschool.adoptpet;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PetfinderApi {
    @GET("animals")
    Call<PetSearchResponse> getType(
            @Query("type") String type
    );
}