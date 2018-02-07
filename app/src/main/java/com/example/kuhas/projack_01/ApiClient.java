package com.example.kuhas.projack_01;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by kuhas on 6/2/2561.
 */

public class ApiClient {
    public static final String Base_Url = "http://10.0.2.2/jsonphp/reportNew_v_2.php/";
    public static Retrofit retrofit = null ;

    public static Retrofit getApiClient()
    {
        if (retrofit == null)
        {
            retrofit = new Retrofit.Builder()
                    .baseUrl(Base_Url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
