package com.retrofit.aravind.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.myjson.com/bins/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RetrofitAPI service = retrofit.create(RetrofitAPI.class);

        //{"backCamera": "21MP","frontCamera": "5MP","name": "Moto X Play","processor": "1.8GHz","rom": "32GB","screenSize": "5.5 inch"}
        Call<MobileDTO> mobileObject = service.getJsonObjectData();
        mobileObject.enqueue(new Callback<MobileDTO>() {
            @Override
            public void onResponse(Call<MobileDTO> call, Response<MobileDTO> response) {
                Log.d("Success Response is", new Gson().toJson(response.body()));
            }

            @Override
            public void onFailure(Call<MobileDTO> call, Throwable t) {
                Log.e("Failure Response", t.toString());
            }
        });

        /*[{"backCamera": "21MP","rom": "64GB","screenSize": "6 inch"},{"backCamera": "5MP","rom": "4GB","screenSize": "4.5 inch"},{"backCamera": "3MP","rom": "8GB","screenSize": "3.5 inch"}]*/
        Call<List<MobileDTO>> listOfMobileObjects = service.getJsonArrayData();
        listOfMobileObjects.enqueue(new Callback<List<MobileDTO>>() {
            @Override
            public void onResponse(Call<List<MobileDTO>> call, Response<List<MobileDTO>> response) {
                Log.d("Success Response is", new Gson().toJson(response.body()));
            }

            @Override
            public void onFailure(Call<List<MobileDTO>> call, Throwable t) {
                Log.e("Failure Response", t.toString());
            }
        });
    }
}
