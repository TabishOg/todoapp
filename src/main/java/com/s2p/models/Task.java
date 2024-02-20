package com.s2p.models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Entity
@Table(name = "Mytask")
public class Task {

//    to make id as primary key
    @Id

//    for auto increment
      @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column (name="mytitle")
    String title;
    String description;
    double CreatedOn;
    double UpdatedOn;

    public Task(){}

    public Task(int i, String d, double c, double u, String t){
        id = i;
        description = d;
        CreatedOn = c;
        UpdatedOn = u;
        title=t;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getUpdatedOn() {
        return UpdatedOn;
    }

    public double getCreatedOn() {
        return CreatedOn;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreatedOn(double createdOn) {
        CreatedOn = createdOn;
    }

    public void setUpdatedOn(double updatedOn) {
        UpdatedOn = updatedOn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString(){
        String str = "";
        str= "Id"+ id+ "Description"+ description+ "CreatedOn"+ CreatedOn+ "UpdatedOn"+ UpdatedOn+"Title"+ title;
        return str;
    }
}

