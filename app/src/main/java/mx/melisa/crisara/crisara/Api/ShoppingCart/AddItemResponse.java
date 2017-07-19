package mx.melisa.crisara.crisara.Api.ShoppingCart;

import com.google.gson.annotations.SerializedName;

/**
 * Created by nerine on 11/07/17.
 */

public class AddItemResponse {

    @SerializedName("data")
    private ShoppingCartAddItem data;

    @SerializedName("success")
    private Boolean success;

    public ShoppingCartAddItem getItem() {
        return data;
    }

    public Boolean getSuccess() {
        return success;
    }
}
