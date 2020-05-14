package com.peigong.chapter11_proxy.protectproxy;

/**
 * @author: lilei
 * @create: 2020-05-14 11:36
 **/
public class PersonBeanImpl implements PersonBean {

    private String name;
    private String gender;
    private String interests;
    private int hotOrNotRating;
    private int ratingCount;

    public PersonBeanImpl() {
    }

    public PersonBeanImpl(String name, String gender, String interests) {
        this.name = name;
        this.gender = gender;
        this.interests = interests;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public int getHotOrNotRating() {
        return hotOrNotRating;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public void setHotOrNotRating(int rating) {
        this.hotOrNotRating += rating;
        this.ratingCount++;
    }
}
