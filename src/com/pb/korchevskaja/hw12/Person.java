package com.pb.korchevskaja.hw12;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Person {


        public Person(String name, LocalDate birthday, String typePhone, String numberPhone, String address){
        this.name = name;
        this.birthday = birthday;
        this.phone = Stream.of(typePhone,numberPhone)
            .collect(Collectors.toMap(
                    Function.identity(),
                    Function.identity()
            ));
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
