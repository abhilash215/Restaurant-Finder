
package com.example.abhiu.tnapp.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FactualResponse {

    @SerializedName("version")
    @Expose
    private Integer version;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("response")
    @Expose
    private FResponse response;

    /**
     * 
     * @return
     *     The version
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 
     * @param version
     *     The version
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The response
     */
    public FResponse getResponse() {
        return response;
    }

    /**
     * 
     * @param response
     *     The response
     */
    public void setResponse(FResponse response) {
        this.response = response;
    }

}
