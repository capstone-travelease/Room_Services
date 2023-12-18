package com.capstone.Room.Entities;

import java.math.BigDecimal;

public class ResponseRooms {
    private Integer room_id;
    private String room_name;
    private String room_description;
    private String room_size;
    private Integer room_bed_quantity;
    private Integer room_capacity;
    private String file_url;
    private String facility_name;
    private BigDecimal room_price;

    public ResponseRooms() {
    }

    public ResponseRooms(Integer room_id, String room_name, String room_description, String room_size, Integer room_bed_quantity, Integer room_capacity, String file_url, String facility_name, BigDecimal room_price) {
        this.room_id = room_id;
        this.room_name = room_name;
        this.room_description = room_description;
        this.room_size = room_size;
        this.room_bed_quantity = room_bed_quantity;
        this.room_capacity = room_capacity;
        this.file_url = file_url;
        this.facility_name = facility_name;
        this.room_price = room_price;
    }

    public String getRoom_name() {
        return room_name;
    }

    public void setRoom_name(String room_name) {
        this.room_name = room_name;
    }

    public Integer getRoom_id() {
        return room_id;
    }

    public void setRoom_id(Integer room_id) {
        this.room_id = room_id;
    }

    public String getRoom_description() {
        return room_description;
    }

    public void setRoom_description(String room_description) {
        this.room_description = room_description;
    }

    public String getRoom_size() {
        return room_size;
    }

    public void setRoom_size(String room_size) {
        this.room_size = room_size;
    }

    public Integer getRoom_bed_quantity() {
        return room_bed_quantity;
    }

    public void setRoom_bed_quantity(Integer room_bed_quantity) {
        this.room_bed_quantity = room_bed_quantity;
    }

    public Integer getRoom_capacity() {
        return room_capacity;
    }

    public void setRoom_capacity(Integer room_capacity) {
        this.room_capacity = room_capacity;
    }

    public String getFile_url() {
        return file_url;
    }

    public void setFile_url(String file_url) {
        this.file_url = file_url;
    }

    public String getFacility_name() {
        return facility_name;
    }

    public void setFacility_name(String facility_name) {
        this.facility_name = facility_name;
    }

    public BigDecimal getRoom_price() {
        return room_price;
    }

    public void setRoom_price(BigDecimal room_price) {
        this.room_price = room_price;
    }

    @Override
    public String toString() {
        return "ResponseRooms{" +
                "room_id=" + room_id +
                ", room_name='" + room_name + '\'' +
                ", room_description='" + room_description + '\'' +
                ", room_size='" + room_size + '\'' +
                ", room_bed_quantity=" + room_bed_quantity +
                ", room_capacity=" + room_capacity +
                ", file_url='" + file_url + '\'' +
                ", facility_name='" + facility_name + '\'' +
                ", room_price=" + room_price +
                '}';
    }
}
