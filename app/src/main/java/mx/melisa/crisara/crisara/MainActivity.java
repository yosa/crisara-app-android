package mx.melisa.crisara.crisara;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;

import mx.melisa.crisara.crisara.Api.EndPointsInterface;
import mx.melisa.crisara.crisara.Api.DefaultClient;
import mx.melisa.crisara.crisara.Api.ShoppingCart.DeleteResponse;
import mx.melisa.crisara.crisara.Api.ShoppingCart.ShoppingCart;
import mx.melisa.crisara.crisara.Api.ShoppingCart.AddItemResponse;
import mx.melisa.crisara.crisara.Api.ShoppingCart.ShoppingCartAddItem;
import mx.melisa.crisara.crisara.Api.ShoppingCartResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    public final EndPointsInterface apiService = DefaultClient.getClient(this).create(EndPointsInterface.class);
    public String token = null;
    public TextView txtResult =null;
    public TextView txtInput =null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtResult = (TextView)findViewById(R.id.txtResult);
        txtInput = (TextView)findViewById(R.id.txtNumber);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case  R.id.btnAddItem: {
                addItemShoppingCart();
                break;
            }

            case R.id.btnGetShopping: {
                getShopping();
                break;
            }

            case R.id.btnDeleteItemShoppingCart: {
                deleteItemShoppingCart();
                break;
            }
        }
    }

    public void deleteItemShoppingCart()
    {
        Integer idItem = Integer.parseInt(txtInput.getText().toString());

        Call<DeleteResponse> call = apiService.deleteItemShoppingCart(idItem);
        call.enqueue(new Callback<DeleteResponse>() {
            @Override
            public void onResponse(Call<DeleteResponse> call, Response<DeleteResponse> response) {
                showResultResponse(response);
            }

            @Override
            public void onFailure(Call<DeleteResponse> call, Throwable t) {
                showResult(t.toString());
            }
        });
    }

    public void addItemShoppingCart() {
        Call<AddItemResponse> call = apiService.addItemShoppingCart(697, 1);
        call.enqueue(new Callback<AddItemResponse>() {
            @Override
            public void onResponse(Call<AddItemResponse> call, Response<AddItemResponse> response) {
                showResultResponse(response);
            }

            @Override
            public void onFailure(Call<AddItemResponse> call, Throwable t) {
                showResult(t.toString());
            }
        });
    }

    public void showResultResponse(Response response)
    {
        Gson gson = new Gson();
        txtResult.setText(gson.toJson(response.body()));
    }

    public void showResult(String response)
    {
        Gson gson = new Gson();
        txtResult.setText(gson.toJson(response));
    }

    public void getShopping()
    {
        Call<ShoppingCartResponse> call = apiService.getShoppingCart();
        call.enqueue(new Callback<ShoppingCartResponse>() {
            @Override
            public void onResponse(Call<ShoppingCartResponse> call, Response<ShoppingCartResponse> response) {
                showResultResponse(response);
            }

            @Override
            public void onFailure(Call<ShoppingCartResponse> call, Throwable t) {
                showResult(t.toString());
            }
        });
    }
}
