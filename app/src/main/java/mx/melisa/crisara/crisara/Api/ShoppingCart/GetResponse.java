package mx.melisa.crisara.crisara.Api.ShoppingCart;

import com.google.gson.annotations.SerializedName;

/**
 * Created by nerine on 11/07/17.
 */

public class GetResponse {

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

