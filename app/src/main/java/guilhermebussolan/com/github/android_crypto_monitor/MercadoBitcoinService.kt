package guilhermebussolan.com.github.android_crypto_monitor

import guilhermebussolan.com.github.android_crypto_monitor.ui.theme.AndroidcryptomonitorTheme
import retrofit2.Response
import retrofit2.http.GET

interface MercadoBitcoinService {
    @GET("api/BTC/ticker/")
    suspend fun getTicker(): Response<TickerResponse>
}