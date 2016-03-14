
package com.example.abhiu.tnapp.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Hours {

    @SerializedName("monday")
    @Expose
    private List<List<String>> monday = new ArrayList<List<String>>();
    @SerializedName("tuesday")
    @Expose
    private List<List<String>> tuesday = new ArrayList<List<String>>();
    @SerializedName("wednesday")
    @Expose
    private List<List<String>> wednesday = new ArrayList<List<String>>();
    @SerializedName("thursday")
    @Expose
    private List<List<String>> thursday = new ArrayList<List<String>>();
    @SerializedName("friday")
    @Expose
    private List<List<String>> friday = new ArrayList<List<String>>();
    @SerializedName("saturday")
    @Expose
    private List<List<String>> saturday = new ArrayList<List<String>>();
    @SerializedName("sunday")
    @Expose
    private List<List<String>> sunday = new ArrayList<List<String>>();

    /**
     * 
     * @return
     *     The monday
     */
    public List<List<String>> getMonday() {
        return monday;
    }

    /**
     * 
     * @param monday
     *     The monday
     */
    public void setMonday(List<List<String>> monday) {
        this.monday = monday;
    }

    /**
     * 
     * @return
     *     The tuesday
     */
    public List<List<String>> getTuesday() {
        return tuesday;
    }

    /**
     * 
     * @param tuesday
     *     The tuesday
     */
    public void setTuesday(List<List<String>> tuesday) {
        this.tuesday = tuesday;
    }

    /**
     * 
     * @return
     *     The wednesday
     */
    public List<List<String>> getWednesday() {
        return wednesday;
    }

    /**
     * 
     * @param wednesday
     *     The wednesday
     */
    public void setWednesday(List<List<String>> wednesday) {
        this.wednesday = wednesday;
    }

    /**
     * 
     * @return
     *     The thursday
     */
    public List<List<String>> getThursday() {
        return thursday;
    }

    /**
     * 
     * @param thursday
     *     The thursday
     */
    public void setThursday(List<List<String>> thursday) {
        this.thursday = thursday;
    }

    /**
     * 
     * @return
     *     The friday
     */
    public List<List<String>> getFriday() {
        return friday;
    }

    /**
     * 
     * @param friday
     *     The friday
     */
    public void setFriday(List<List<String>> friday) {
        this.friday = friday;
    }

    /**
     * 
     * @return
     *     The saturday
     */
    public List<List<String>> getSaturday() {
        return saturday;
    }

    /**
     * 
     * @param saturday
     *     The saturday
     */
    public void setSaturday(List<List<String>> saturday) {
        this.saturday = saturday;
    }

    /**
     * 
     * @return
     *     The sunday
     */
    public List<List<String>> getSunday() {
        return sunday;
    }

    /**
     * 
     * @param sunday
     *     The sunday
     */
    public void setSunday(List<List<String>> sunday) {
        this.sunday = sunday;
    }

}
