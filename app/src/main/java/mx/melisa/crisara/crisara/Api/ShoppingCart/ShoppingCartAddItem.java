package mx.melisa.crisara.crisara.Api.ShoppingCart;

import com.google.gson.annotations.SerializedName;

/**
 * Created by nerine on 11/07/17.
 */

public class ShoppingCartAddItem {

    @SerializedName("idItem")
    private Integer idItem;

    @SerializedName("idShoppingCart")
    private Integer idShoppingCart;

    @SerializedName("totalItems")
    private Integer totalItems;

    @SerializedName("total")
    private Float total;

    @SerializedName("subtotal")
    private Float subtotal;

    public Float getTotal() {
        return total;
    }

    public Float getSubtotal() {
        return subtotal;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

}
