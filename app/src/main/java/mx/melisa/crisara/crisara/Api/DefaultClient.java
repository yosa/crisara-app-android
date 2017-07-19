package mx.melisa.crisara.crisara.Api;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import android.content.Context;

/**
 * Created by nerine on 11/07/17.
 */

public class DefaultClient {

    public static final String BASE_URL = "https://crisara.melisa.mx/api/v1/";
    private static Retrofit retrofit = null;

    public static Retrofit getClient(Context context) {
        if (retrofit==null) {

            OkHttpClient client = new OkHttpClient();
            OkHttpClient.Builder builder = new OkHttpClient.Builder();

            builder.addInterceptor(new AddCookiesInterceptor(context)); // VERY VERY IMPORTANT
            builder.addInterceptor(new ReceivedCookiesInterceptor(context)); // VERY VERY IMPORTANT
            client = builder.build();

            retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        }
        return retrofit;
    }

}
