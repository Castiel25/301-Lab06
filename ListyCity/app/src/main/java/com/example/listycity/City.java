package com.example.listycity;
/**
 * class that defines a City
 */
public class City implements Comparable<City> {

    private String city;

    private String province;
    /**
     * constructor
     * @param city city name
     * @param province province name
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    /**
     * getter for city name
     * @return city name
     */
    String getCityName(){
        return this.city;
    }
    /**
     * getter for province name
     * @return province name
     */
    String getProvinceName(){
        return this.province;
    }
    /**
     * this is a comparator that compares the city name
     * @param city city to compare
     * @return 0 if the city name is the same
     */
    @Override
    public int compareTo(City city) {
        return this.city.compareTo(((City) city).getCityName());
    }
}

