import retrofit2.http.GET
import retrofit2.http.Query

interface PokeApiService {
    @GET("pokemon")
    fun getPokemonList(@Query("offset") offset: Int, @Query("limit") limit: Int): Call<PokemonListResponse>
}
