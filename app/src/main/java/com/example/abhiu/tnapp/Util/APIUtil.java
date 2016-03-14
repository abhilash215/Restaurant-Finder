package com.example.abhiu.tnapp.Util;

import com.example.abhiu.tnapp.Interface.FactualService;
import com.example.abhiu.tnapp.entity.FactualResponse;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by abhilash on 3/11/2016.
 */
public class APIUtil {
    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://api.v3.factual.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    private static FactualService service = retrofit.create(FactualService.class);

    public static void getRestaurantsByLocality(String searchKeyword, Callback<FactualResponse> callback){
        Map<String,String> queryParams = new HashMap<>();
        //queryParams.put("KEY","BXlykcLo11hzxSISFp92ZIfLceXLyEDy0Ir51VA9");
        queryParams.put("filters", "{\"locality\":{\"$search\":\"" + searchKeyword + "\"}}");
        Call<FactualResponse> apiResponse = service.getRestaurants(queryParams);
        apiResponse.enqueue(callback);
    }
}
