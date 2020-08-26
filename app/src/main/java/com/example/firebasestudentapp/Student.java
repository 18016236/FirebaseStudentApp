package com.example.firebasestudentapp;




import com.google.firebase.firestore.Exclude;
import com.google.firebase.firestore.IgnoreExtraProperties;

import java.io.Serializable;

@IgnoreExtraProperties
public class Student implements Serializable {


    private String id;
    private String name;
    private int age;

    @Exclude
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {

    }

    public Student (String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return name;
    }

}

