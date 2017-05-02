package com.fitme.fitme.model;

public class GetUserLocation {

    int id;
    String name;
    Double latitude;
    Double longitude;
    String city;
    String user_workout;
    String user_category;
    String user_uid;

    public GetUserLocation(){

    }

    public GetUserLocation(int id, String name, Double latitude, Double longitude, String city,
                           String user_workout, String user_category, String user_uid) {
        this.id = id;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.city = city;
        this.user_workout = user_workout;
        this.user_category = user_category;
        this.user_uid = user_uid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUser_workout() {
        return user_workout;
    }

    public void setUser_workout(String user_workout) {
        this.user_workout = user_workout;
    }

    public String getUser_category() {
        return user_category;
    }

    public void setUser_category(String user_category) {
        this.user_category = user_category;
    }

    public String getUser_uid() {
        return user_uid;
    }

    public void setUser_uid(String user_uid) {
        this.user_uid = user_uid;
    }
}
