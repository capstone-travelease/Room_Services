package com.capstone.Room.DTOs;

import jakarta.persistence.Column;

public class ResponseFacility {
    private Integer facility_id;
    private String facility_name;
    private Integer room_id;
    private String facility_image;

    public ResponseFacility() {
    }
    public ResponseFacility(Integer facility_id, String facility_name) {
        this.facility_id = facility_id;
        this.facility_name = facility_name;
    }
    public ResponseFacility(Integer facility_id, String facility_name, Integer room_id) {
        this.facility_id = facility_id;
        this.facility_name = facility_name;
        this.room_id = room_id;
    }

    public ResponseFacility(Integer facility_id, String facility_name, Integer room_id, String facility_image) {
        this.facility_id = facility_id;
        this.facility_name = facility_name;
        this.room_id = room_id;
        this.facility_image = facility_image;
    }

    public Integer getFacility_id() {
        return facility_id;
    }

    public void setFacility_id(Integer facility_id) {
        this.facility_id = facility_id;
    }

    public String getFacility_name() {
        return facility_name;
    }

    public void setFacility_name(String facility_name) {
        this.facility_name = facility_name;
    }

    public Integer getRoom_id() {
        return room_id;
    }

    public void setRoom_id(Integer room_id) {
        this.room_id = room_id;
    }

    public String getFacility_image() {
        return facility_image;
    }

    public void setFacility_image(String facility_image) {
        this.facility_image = facility_image;
    }

    @Override
    public String toString() {
        return "ResponseFacility{" +
                "facility_id=" + facility_id +
                ", facility_name='" + facility_name + '\'' +
                ", facility_image='" + facility_image + '\'' +
                '}';
    }
}
