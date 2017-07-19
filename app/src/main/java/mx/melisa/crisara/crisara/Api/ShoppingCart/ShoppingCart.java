package mx.melisa.crisara.crisara.Api.ShoppingCart;

import com.google.gson.annotations.SerializedName;

/**
 * Created by nerine on 11/07/17.
 */

public class ShoppingCart {

    @SerializedName("id")
    Integer id;

    @SerializedName("idToken")
    String idToken;

    @SerializedName("idStatusShoppingCart")
    Integer idStatusShoppingCart;

    @SerializedName("totalItems")
    Integer totalItems;

    @SerializedName("subtotal")
    Float subtotal;

    @SerializedName("total")
    Float total;

    public String getToken() {
        return idToken;
    }

}
