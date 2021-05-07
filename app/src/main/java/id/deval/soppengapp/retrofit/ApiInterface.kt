package id.deval.soppengapp.Retrofit

import id.deval.soppengapp.Model.GlobalResult
import id.deval.soppengapp.Model.ModelListWrapper
import id.deval.soppengapp.Models.WisataSejarah
import io.reactivex.Observable
import retrofit2.http.*


interface ApiInterface {
    //BACKGROUND TREAD (COROUTINE)
//    @GET("api/kasir/menu")
//    suspend fun getMenuAsync(@Header("Authorization") authToken: String, @Query("outlet_id") outlet_id: Int, @Query("nomor_urut") nomor_urut: Int): Response<ModelWrapper<Menu>>

//    @FormUrlEncoded
//    @POST("api/kasir/pelanggan")
//    suspend fun addPelanggan(
//            @Header("Authorization") authToken: String,
//            @Field("unique_id") unique_id: String,
//            @Field("email") email: String?,
//            @Field("nama_pelanggan") nama_pelanggan: String,
//            @Field("no_hp") no_hp: String?,
//            @Field("jk") jk: String?
//    ) : Response<GlobalResult>

    @GET("api/ongkir/{id}")
    fun ongkir(
        @Path("id") idDesa: Int
    ): Observable<GlobalResult>

    //Kode diatas untuk contoh
    //Kode untuk aplikasi mulai dari sini



    @GET("travel/")
    fun getAllWisata(
        @Query("page") page:Int
    ):Observable<ModelListWrapper<WisataSejarah>>

    @GET("travel/{slug}")
    fun getQR(
        @Path("slug") slug: String
    ):Observable<ModelListWrapper<WisataSejarah>>

    @GET("travel/")
    fun getWisata(
        @Query("search") search:String
    ):Observable<ModelListWrapper<WisataSejarah>>
}
