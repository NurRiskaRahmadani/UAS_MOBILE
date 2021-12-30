package id.rahmadani.nurriska.proyek_praresponsi.retrofit

import id.rahmadani.nurriska.proyek_praresponsi.MainModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiEndpoint {

    @GET("data.php")
    fun data(): Call<MainModel>
}