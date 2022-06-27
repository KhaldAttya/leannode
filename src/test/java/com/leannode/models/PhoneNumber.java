package com.leannode.models;

public class PhoneNumber {

    private String country = "";
    private String phoneNumber = "";

    public PhoneNumber() {
    }

    public PhoneNumber(String country, String phoneNumber) {
        this.country = country;
        this.phoneNumber = phoneNumber;
    }

    public PhoneNumber country(String country) {
        this.country = country;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public PhoneNumber phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public PhoneNumber build() {
        return new PhoneNumber(country, phoneNumber);
    }
}