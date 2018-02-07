package com.example.kuhas.projack_01;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by kuhas on 6/2/2561.
 */

public interface ApiInterface {
    @POST("getReport")
    Call<List<Contact>> getContacts();
}