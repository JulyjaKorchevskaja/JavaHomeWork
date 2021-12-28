package com.pb.korchevskaja.hw11;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;

import java.lang.reflect.Constructor;
import java.time.LocalDate;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Person {
    public Person(String name, LocalDate birthday, Map phone, String address){
        this.name = name;
        this.birthday = birthday;
        this.phone = phone;
        this.address = address;
        Date date = new Date();
        this.timeEdit = date.toString();
    }
    protected String name;
    protected LocalDate birthday;
    protected Map phone;
    protected String address;
    protected String timeEdit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Map getPhone() {
        return phone;
    }

    public void setPhone(Map phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTimeEdit() {
        return timeEdit;
    }

    public void setTimeEdit(String timeEdit) {
        this.timeEdit = timeEdit;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                ", timeEdit=" + timeEdit +
                '}';
    }


}
