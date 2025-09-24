package com.example.proyectobase2.ApiRegionComuna



import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Body


data class InsertResponse(
    val success: Boolean,
    val message: String?
)

interface ApiRegionComunaServicio {
    @GET("apiduoc/consulta.php")
    suspend fun getRegionComunas(): List<RegionComunas>


}
