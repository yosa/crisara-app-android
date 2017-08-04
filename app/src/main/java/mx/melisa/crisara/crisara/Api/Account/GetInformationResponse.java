package mx.melisa.crisara.crisara.Api.Account;

import com.google.gson.annotations.SerializedName;

import mx.melisa.crisara.crisara.Api.DefaultResponse;

/**
 * Created by nerine on 4/08/17.
 */

public class GetInformationResponse extends DefaultResponse {

    @SerializedName("data")
    private InformationResponse data;
}
