package com.nisa.doaharian.Services;

import com.nisa.doaharian.Models.DaftarDzikirPagi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DaftarDzikirPagiService {
    @GET("/NisaNH/doa-harian-muslim-server/dzikir_pagi")
    Call<List<DaftarDzikirPagi>> getDzikirPagi();
}
