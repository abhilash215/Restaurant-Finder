
package com.example.abhiu.tnapp.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("alcohol")
    @Expose
    private Boolean alcohol;
    @SerializedName("alcohol_bar")
    @Expose
    private Boolean alcoholBar;
    @SerializedName("alcohol_beer_wine")
    @Expose
    private Boolean alcoholBeerWine;
    @SerializedName("attire")
    @Expose
    private String attire;
    @SerializedName("category_ids")
    @Expose
    private List<Integer> categoryIds = new ArrayList<Integer>();
    @SerializedName("category_labels")
    @Expose
    private List<List<String>> categoryLabels = new ArrayList<List<String>>();
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("cuisine")
    @Expose
    private List<String> cuisine = new ArrayList<String>();
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("factual_id")
    @Expose
    private String factualId;
    @SerializedName("fax")
    @Expose
    private String fax;
    @SerializedName("groups_goodfor")
    @Expose
    private Boolean groupsGoodfor;
    @SerializedName("hours")
    @Expose
    private Hours hours;
    @SerializedName("hours_display")
    @Expose
    private String hoursDisplay;
    @SerializedName("kids_goodfor")
    @Expose
    private Boolean kidsGoodfor;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("locality")
    @Expose
    private String locality;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("meal_cater")
    @Expose
    private Boolean mealCater;
    @SerializedName("meal_deliver")
    @Expose
    private Boolean mealDeliver;
    @SerializedName("meal_dinner")
    @Expose
    private Boolean mealDinner;
    @SerializedName("meal_lunch")
    @Expose
    private Boolean mealLunch;
    @SerializedName("meal_takeout")
    @Expose
    private Boolean mealTakeout;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("neighborhood")
    @Expose
    private List<String> neighborhood = new ArrayList<String>();
    @SerializedName("open_24hrs")
    @Expose
    private Boolean open24hrs;
    @SerializedName("parking")
    @Expose
    private Boolean parking;
    @SerializedName("parking_street")
    @Expose
    private Boolean parkingStreet;
    @SerializedName("payment_cashonly")
    @Expose
    private Boolean paymentCashonly;
    @SerializedName("postcode")
    @Expose
    private String postcode;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("rating")
    @Expose
    private Double rating;
    @SerializedName("region")
    @Expose
    private String region;
    @SerializedName("seating_outdoor")
    @Expose
    private Boolean seatingOutdoor;
    @SerializedName("tel")
    @Expose
    private String tel;
    @SerializedName("website")
    @Expose
    private String website;
    @SerializedName("accessible_wheelchair")
    @Expose
    private Boolean accessibleWheelchair;
    @SerializedName("reservations")
    @Expose
    private Boolean reservations;
    @SerializedName("alcohol_byob")
    @Expose
    private Boolean alcoholByob;
    @SerializedName("kids_menu")
    @Expose
    private Boolean kidsMenu;
    @SerializedName("meal_breakfast")
    @Expose
    private Boolean mealBreakfast;
    @SerializedName("options_healthy")
    @Expose
    private Boolean optionsHealthy;
    @SerializedName("options_lowfat")
    @Expose
    private Boolean optionsLowfat;
    @SerializedName("options_vegetarian")
    @Expose
    private Boolean optionsVegetarian;
    @SerializedName("wifi")
    @Expose
    private Boolean wifi;
    @SerializedName("parking_lot")
    @Expose
    private Boolean parkingLot;

    /**
     * 
     * @return
     *     The address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 
     * @param address
     *     The address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 
     * @return
     *     The alcohol
     */
    public Boolean getAlcohol() {
        return alcohol;
    }

    /**
     * 
     * @param alcohol
     *     The alcohol
     */
    public void setAlcohol(Boolean alcohol) {
        this.alcohol = alcohol;
    }

    /**
     * 
     * @return
     *     The alcoholBar
     */
    public Boolean getAlcoholBar() {
        return alcoholBar;
    }

    /**
     * 
     * @param alcoholBar
     *     The alcohol_bar
     */
    public void setAlcoholBar(Boolean alcoholBar) {
        this.alcoholBar = alcoholBar;
    }

    /**
     * 
     * @return
     *     The alcoholBeerWine
     */
    public Boolean getAlcoholBeerWine() {
        return alcoholBeerWine;
    }

    /**
     * 
     * @param alcoholBeerWine
     *     The alcohol_beer_wine
     */
    public void setAlcoholBeerWine(Boolean alcoholBeerWine) {
        this.alcoholBeerWine = alcoholBeerWine;
    }

    /**
     * 
     * @return
     *     The attire
     */
    public String getAttire() {
        return attire;
    }

    /**
     * 
     * @param attire
     *     The attire
     */
    public void setAttire(String attire) {
        this.attire = attire;
    }

    /**
     * 
     * @return
     *     The categoryIds
     */
    public List<Integer> getCategoryIds() {
        return categoryIds;
    }

    /**
     * 
     * @param categoryIds
     *     The category_ids
     */
    public void setCategoryIds(List<Integer> categoryIds) {
        this.categoryIds = categoryIds;
    }

    /**
     * 
     * @return
     *     The categoryLabels
     */
    public List<List<String>> getCategoryLabels() {
        return categoryLabels;
    }

    /**
     * 
     * @param categoryLabels
     *     The category_labels
     */
    public void setCategoryLabels(List<List<String>> categoryLabels) {
        this.categoryLabels = categoryLabels;
    }

    /**
     * 
     * @return
     *     The country
     */
    public String getCountry() {
        return country;
    }

    /**
     * 
     * @param country
     *     The country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     * @return
     *     The cuisine
     */
    public List<String> getCuisine() {
        return cuisine;
    }

    /**
     * 
     * @param cuisine
     *     The cuisine
     */
    public void setCuisine(List<String> cuisine) {
        this.cuisine = cuisine;
    }

    /**
     * 
     * @return
     *     The email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email
     *     The email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     * @return
     *     The factualId
     */
    public String getFactualId() {
        return factualId;
    }

    /**
     * 
     * @param factualId
     *     The factual_id
     */
    public void setFactualId(String factualId) {
        this.factualId = factualId;
    }

    /**
     * 
     * @return
     *     The fax
     */
    public String getFax() {
        return fax;
    }

    /**
     * 
     * @param fax
     *     The fax
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * 
     * @return
     *     The groupsGoodfor
     */
    public Boolean getGroupsGoodfor() {
        return groupsGoodfor;
    }

    /**
     * 
     * @param groupsGoodfor
     *     The groups_goodfor
     */
    public void setGroupsGoodfor(Boolean groupsGoodfor) {
        this.groupsGoodfor = groupsGoodfor;
    }

    /**
     * 
     * @return
     *     The hours
     */
    public Hours getHours() {
        return hours;
    }

    /**
     * 
     * @param hours
     *     The hours
     */
    public void setHours(Hours hours) {
        this.hours = hours;
    }

    /**
     * 
     * @return
     *     The hoursDisplay
     */
    public String getHoursDisplay() {
        return hoursDisplay;
    }

    /**
     * 
     * @param hoursDisplay
     *     The hours_display
     */
    public void setHoursDisplay(String hoursDisplay) {
        this.hoursDisplay = hoursDisplay;
    }

    /**
     * 
     * @return
     *     The kidsGoodfor
     */
    public Boolean getKidsGoodfor() {
        return kidsGoodfor;
    }

    /**
     * 
     * @param kidsGoodfor
     *     The kids_goodfor
     */
    public void setKidsGoodfor(Boolean kidsGoodfor) {
        this.kidsGoodfor = kidsGoodfor;
    }

    /**
     * 
     * @return
     *     The latitude
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * 
     * @param latitude
     *     The latitude
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * 
     * @return
     *     The locality
     */
    public String getLocality() {
        return locality;
    }

    /**
     * 
     * @param locality
     *     The locality
     */
    public void setLocality(String locality) {
        this.locality = locality;
    }

    /**
     * 
     * @return
     *     The longitude
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * 
     * @param longitude
     *     The longitude
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * 
     * @return
     *     The mealCater
     */
    public Boolean getMealCater() {
        return mealCater;
    }

    /**
     * 
     * @param mealCater
     *     The meal_cater
     */
    public void setMealCater(Boolean mealCater) {
        this.mealCater = mealCater;
    }

    /**
     * 
     * @return
     *     The mealDeliver
     */
    public Boolean getMealDeliver() {
        return mealDeliver;
    }

    /**
     * 
     * @param mealDeliver
     *     The meal_deliver
     */
    public void setMealDeliver(Boolean mealDeliver) {
        this.mealDeliver = mealDeliver;
    }

    /**
     * 
     * @return
     *     The mealDinner
     */
    public Boolean getMealDinner() {
        return mealDinner;
    }

    /**
     * 
     * @param mealDinner
     *     The meal_dinner
     */
    public void setMealDinner(Boolean mealDinner) {
        this.mealDinner = mealDinner;
    }

    /**
     * 
     * @return
     *     The mealLunch
     */
    public Boolean getMealLunch() {
        return mealLunch;
    }

    /**
     * 
     * @param mealLunch
     *     The meal_lunch
     */
    public void setMealLunch(Boolean mealLunch) {
        this.mealLunch = mealLunch;
    }

    /**
     * 
     * @return
     *     The mealTakeout
     */
    public Boolean getMealTakeout() {
        return mealTakeout;
    }

    /**
     * 
     * @param mealTakeout
     *     The meal_takeout
     */
    public void setMealTakeout(Boolean mealTakeout) {
        this.mealTakeout = mealTakeout;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The neighborhood
     */
    public List<String> getNeighborhood() {
        return neighborhood;
    }

    /**
     * 
     * @param neighborhood
     *     The neighborhood
     */
    public void setNeighborhood(List<String> neighborhood) {
        this.neighborhood = neighborhood;
    }

    /**
     * 
     * @return
     *     The open24hrs
     */
    public Boolean getOpen24hrs() {
        return open24hrs;
    }

    /**
     * 
     * @param open24hrs
     *     The open_24hrs
     */
    public void setOpen24hrs(Boolean open24hrs) {
        this.open24hrs = open24hrs;
    }

    /**
     * 
     * @return
     *     The parking
     */
    public Boolean getParking() {
        return parking;
    }

    /**
     * 
     * @param parking
     *     The parking
     */
    public void setParking(Boolean parking) {
        this.parking = parking;
    }

    /**
     * 
     * @return
     *     The parkingStreet
     */
    public Boolean getParkingStreet() {
        return parkingStreet;
    }

    /**
     * 
     * @param parkingStreet
     *     The parking_street
     */
    public void setParkingStreet(Boolean parkingStreet) {
        this.parkingStreet = parkingStreet;
    }

    /**
     * 
     * @return
     *     The paymentCashonly
     */
    public Boolean getPaymentCashonly() {
        return paymentCashonly;
    }

    /**
     * 
     * @param paymentCashonly
     *     The payment_cashonly
     */
    public void setPaymentCashonly(Boolean paymentCashonly) {
        this.paymentCashonly = paymentCashonly;
    }

    /**
     * 
     * @return
     *     The postcode
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * 
     * @param postcode
     *     The postcode
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     * 
     * @return
     *     The price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * 
     * @return
     *     The rating
     */
    public Double getRating() {
        return rating;
    }

    /**
     * 
     * @param rating
     *     The rating
     */
    public void setRating(Double rating) {
        this.rating = rating;
    }

    /**
     * 
     * @return
     *     The region
     */
    public String getRegion() {
        return region;
    }

    /**
     * 
     * @param region
     *     The region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * 
     * @return
     *     The seatingOutdoor
     */
    public Boolean getSeatingOutdoor() {
        return seatingOutdoor;
    }

    /**
     * 
     * @param seatingOutdoor
     *     The seating_outdoor
     */
    public void setSeatingOutdoor(Boolean seatingOutdoor) {
        this.seatingOutdoor = seatingOutdoor;
    }

    /**
     * 
     * @return
     *     The tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * 
     * @param tel
     *     The tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * 
     * @return
     *     The website
     */
    public String getWebsite() {
        return website;
    }

    /**
     * 
     * @param website
     *     The website
     */
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     * 
     * @return
     *     The accessibleWheelchair
     */
    public Boolean getAccessibleWheelchair() {
        return accessibleWheelchair;
    }

    /**
     * 
     * @param accessibleWheelchair
     *     The accessible_wheelchair
     */
    public void setAccessibleWheelchair(Boolean accessibleWheelchair) {
        this.accessibleWheelchair = accessibleWheelchair;
    }

    /**
     * 
     * @return
     *     The reservations
     */
    public Boolean getReservations() {
        return reservations;
    }

    /**
     * 
     * @param reservations
     *     The reservations
     */
    public void setReservations(Boolean reservations) {
        this.reservations = reservations;
    }

    /**
     * 
     * @return
     *     The alcoholByob
     */
    public Boolean getAlcoholByob() {
        return alcoholByob;
    }

    /**
     * 
     * @param alcoholByob
     *     The alcohol_byob
     */
    public void setAlcoholByob(Boolean alcoholByob) {
        this.alcoholByob = alcoholByob;
    }

    /**
     * 
     * @return
     *     The kidsMenu
     */
    public Boolean getKidsMenu() {
        return kidsMenu;
    }

    /**
     * 
     * @param kidsMenu
     *     The kids_menu
     */
    public void setKidsMenu(Boolean kidsMenu) {
        this.kidsMenu = kidsMenu;
    }

    /**
     * 
     * @return
     *     The mealBreakfast
     */
    public Boolean getMealBreakfast() {
        return mealBreakfast;
    }

    /**
     * 
     * @param mealBreakfast
     *     The meal_breakfast
     */
    public void setMealBreakfast(Boolean mealBreakfast) {
        this.mealBreakfast = mealBreakfast;
    }

    /**
     * 
     * @return
     *     The optionsHealthy
     */
    public Boolean getOptionsHealthy() {
        return optionsHealthy;
    }

    /**
     * 
     * @param optionsHealthy
     *     The options_healthy
     */
    public void setOptionsHealthy(Boolean optionsHealthy) {
        this.optionsHealthy = optionsHealthy;
    }

    /**
     * 
     * @return
     *     The optionsLowfat
     */
    public Boolean getOptionsLowfat() {
        return optionsLowfat;
    }

    /**
     * 
     * @param optionsLowfat
     *     The options_lowfat
     */
    public void setOptionsLowfat(Boolean optionsLowfat) {
        this.optionsLowfat = optionsLowfat;
    }

    /**
     * 
     * @return
     *     The optionsVegetarian
     */
    public Boolean getOptionsVegetarian() {
        return optionsVegetarian;
    }

    /**
     * 
     * @param optionsVegetarian
     *     The options_vegetarian
     */
    public void setOptionsVegetarian(Boolean optionsVegetarian) {
        this.optionsVegetarian = optionsVegetarian;
    }

    /**
     * 
     * @return
     *     The wifi
     */
    public Boolean getWifi() {
        return wifi;
    }

    /**
     * 
     * @param wifi
     *     The wifi
     */
    public void setWifi(Boolean wifi) {
        this.wifi = wifi;
    }

    /**
     * 
     * @return
     *     The parkingLot
     */
    public Boolean getParkingLot() {
        return parkingLot;
    }

    /**
     * 
     * @param parkingLot
     *     The parking_lot
     */
    public void setParkingLot(Boolean parkingLot) {
        this.parkingLot = parkingLot;
    }

}
