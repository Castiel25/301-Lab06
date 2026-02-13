package com.example.listycity;

import java.util.Objects;

/**
 * class that defines a City
 */
public class City implements Comparable<City> {

    private String city;

    private String province;

    /**
     * constructor
     *
     * @param city     city name
     * @param province province name
     */
    public City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * getter for city name
     *
     * @return city name
     */
    public String getCityName() {
        return this.city;
    }

    /**
     * getter for province name
     *
     * @return province name
     */
    public String getProvinceName() {
        return this.province;
    }

    /**
     * this is a comparator that compares the city name
     *
     * @param city city to compare
     * @return 0 if the city name is the same
     */
    @Override
    public int compareTo(City city) {
        return this.city.compareTo(((City) city).getCityName());
    }

    /**
     *
     * @param obj   the reference object with which to compare.
     * @return true if this object is the same as the obj argument; false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        City other = (City) obj;
        return Objects.equals(this.city, other.city) &&
                Objects.equals(this.province, other.province);
    }
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}

