package com.example.databinding;

import androidx.databinding.Bindable;
import androidx.databinding.BaseObservable;
import androidx.databinding.library.baseAdapters.BR;

public class Person extends BaseObservable{
    @Bindable
    private String name;
    private String age;
    private String email;

    public Person(String name, String age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Person() {
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }
    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);
    }
}


