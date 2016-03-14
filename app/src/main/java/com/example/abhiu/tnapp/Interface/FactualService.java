package com.example.abhiu.tnapp.Interface;

import com.example.abhiu.tnapp.entity.FactualResponse;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface FactualService {
  @GET("t/restaurants-us?KEY=BXlykcLo11hzxSISFp92ZIfLceXLyEDy0Ir51VA9")
  Call<FactualResponse> getRestaurants(@QueryMap Map<String, String> queryParams);
}
