package mx.melisa.crisara.crisara.Api;

import mx.melisa.crisara.crisara.Api.Account.GetInformationResponse;
import mx.melisa.crisara.crisara.Api.ShoppingCart.AddItemResponse;
import mx.melisa.crisara.crisara.Api.ShoppingCart.DeleteResponse;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by nerine on 11/07/17.
 */

public interface EndPointsInterface {

    @GET("shoppingcart")
    Call<ShoppingCartResponse> getShoppingCart();

    @FormUrlEncoded
    @POST("shoppingcart")
    Call<AddItemResponse> addItemShoppingCart(
            @Field("idProduct") Integer idProduct,
            @Field("quantity") Integer quantity
    );

    @DELETE("shoppingcart/{id}")
    Call<DeleteResponse> deleteItemShoppingCart(@Path("id") Integer id);

    @FormUrlEncoded
    @POST("auth/login")
    Call<DefaultResponse> login(
            @Field("email") String email,
            @Field("password") String password
    );

    @GET("account")
    Call<GetInformationResponse> accountGetInformation();

    @GET("auth/logout")
    Call<DefaultResponse> logout();

}
