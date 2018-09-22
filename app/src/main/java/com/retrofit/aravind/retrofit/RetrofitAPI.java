package com.retrofit.aravind.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RetrofitAPI {

    //Endpoint url's
    String objectFile = "oor0c";
    String ArrayFile = "6clks";

    @GET(objectFile)
    Call<MobileDTO> getJsonObjectData();

    @GET(ArrayFile)
    Call<List<MobileDTO>> getJsonArrayData();
}
