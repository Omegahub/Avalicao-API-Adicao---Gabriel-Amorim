package br.com.etechoracio.avaliacao;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ProjetoAPIService {
    @GET("funcoes/adicao")
    Call<String> getAdicao(@Query("num1")String num1,@Query("num2")String num2);


}
