package com.github.karbalawms;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by bkhezry on 10/21/2016.
 */

public interface RetrofitService {
    @FormUrlEncoded
    @POST("query.asmx/search")
    Call<List<ResponsePOJO>> getResponsesService(@Field("Query") String query
    );
}
