package mx.melisa.crisara.crisara.Api;

import com.google.gson.annotations.SerializedName;

import mx.melisa.crisara.crisara.Api.ShoppingCart.ShoppingCart;

/**
 * Created by nerine on 11/07/17.
 */

public class ShoppingCartResponse {

    @SerializedName("data")
    private ShoppingCart data;

    @SerializedName("success")
    private Boolean success;

    public ShoppingCart getShoppingCart() {
        return data;
    }

    public Boolean getSuccess() {
        return success;
    }

}
