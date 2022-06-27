package com.leannode.models;

import com.leannode.enums.*;

import java.util.Date;

public class TesterApplicationForm {

    private String name = "";
    private String email = "";
    private PhoneNumber phoneNumber;
    private Gender gender;
    private Date birthday;
    private String country;
    private String city;
    private String language;
    private LevelOfEducation levelOfEducation;
    private EducationMajor educationMajor;
    private Hobbies hobbies;
    private TechLevel techLevel;
    private MobileOS mobileOS;
    private Job job;
    private Boolean playingGames;
    private GameGenres gameGenres;
    private GamingFrequency gamingFrequency;

    public TesterApplicationForm() {
    }

    public TesterApplicationForm(String name, String email, PhoneNumber phoneNumber, Gender gender, Date birthday, String country, String city, String language, LevelOfEducation levelOfEducation, EducationMajor educationMajor, Hobbies hobbies, TechLevel techLevel, MobileOS mobileOS, Job job, Boolean playingGames, GameGenres gameGenres, GamingFrequency gamingFrequency) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.birthday = birthday;
        this.country = country;
        this.city = city;
        this.language = language;
        this.levelOfEducation = levelOfEducation;
        this.educationMajor = educationMajor;
        this.hobbies = hobbies;
        this.techLevel = techLevel;
        this.mobileOS = mobileOS;
        this.job = job;
        this.playingGames = playingGames;
        this.gameGenres = gameGenres;
        this.gamingFrequency = gamingFrequency;
    }

    public TesterApplicationForm name(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public TesterApplicationForm email(String email) {
        this.email = email;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public TesterApplicationForm phoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public TesterApplicationForm gender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public Gender getGender() {
        return gender;
    }

    public TesterApplicationForm birthDay(Date birthday) {
        this.birthday = birthday;
        return this;
    }

    public Date getBirthday() {
        return birthday;
    }

    public TesterApplicationForm country(String country) {
        this.country = country;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public TesterApplicationForm city(String city) {
        this.city = city;
        return this;
    }

    public String getCity() {
        return city;
    }

    public TesterApplicationForm language(String language) {
        this.language = language;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public TesterApplicationForm levelOfEducation(LevelOfEducation levelOfEducation) {
        this.levelOfEducation = levelOfEducation;
        return this;
    }

    public LevelOfEducation getLevelOfEducation() {
        return levelOfEducation;
    }

    public TesterApplicationForm educationMajor(EducationMajor educationMajor) {
        this.educationMajor = educationMajor;
        return this;
    }

    public EducationMajor getEducationMajor() {
        return educationMajor;
    }

    public TesterApplicationForm hobbies(Hobbies hobbies) {
        this.hobbies = hobbies;
        return this;
    }

    public Hobbies getHobbies() {
        return hobbies;
    }

    public TesterApplicationForm techLevel(TechLevel techLevel) {
        this.techLevel = techLevel;
        return this;
    }

    public TechLevel getTechLevel() {
        return techLevel;
    }

    public TesterApplicationForm mobileOS(MobileOS mobileOS) {
        this.mobileOS = mobileOS;
        return this;
    }

    public MobileOS getMobileOS() {
        return mobileOS;
    }

    public TesterApplicationForm job(Job job) {
        this.job = job;
        return this;
    }

    public Job getJob() {
        return job;
    }

    public TesterApplicationForm playingGames(Boolean playingGames) {
        this.playingGames = playingGames;
        return this;
    }

    public Boolean getPlayingGames() {
        return playingGames;
    }

    public TesterApplicationForm gameGenres(GameGenres gameGenres) {
        this.gameGenres = gameGenres;
        return this;
    }

    public GameGenres getGameGenres() {
        return gameGenres;
    }

    public TesterApplicationForm gamingFrequency(GamingFrequency gamingFrequency) {
        this.gamingFrequency = gamingFrequency;
        return this;
    }

    public GamingFrequency getGamingFrequency() {
        return gamingFrequency;
    }

    public TesterApplicationForm build() {
        return new TesterApplicationForm(name, email, phoneNumber, gender, birthday, country, city, language, levelOfEducation, educationMajor, hobbies, techLevel, mobileOS, job, playingGames, gameGenres, gamingFrequency);
    }
}