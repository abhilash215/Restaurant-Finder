
package com.example.abhiu.tnapp.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class FResponse {

    @SerializedName("data")
    @Expose
    private List<Restaurant> data = new ArrayList<Restaurant>();
    @SerializedName("included_rows")
    @Expose
    private Integer includedRows;

    /**
     * 
     * @return
     *     The data
     */
    public List<Restaurant> getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    public void setData(List<Restaurant> data) {
        this.data = data;
    }

    /**
     * 
     * @return
     *     The includedRows
     */
    public Integer getIncludedRows() {
        return includedRows;
    }

    /**
     * 
     * @param includedRows
     *     The included_rows
     */
    public void setIncludedRows(Integer includedRows) {
        this.includedRows = includedRows;
    }

}
