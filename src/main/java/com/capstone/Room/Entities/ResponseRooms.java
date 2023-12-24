package com.capstone.Room.Entities;

import com.capstone.Room.DTOs.ResponseFacility;

import java.math.BigDecimal;
import java.util.List;

public class ResponseRooms {
    private Integer room_id;
    private String room_name;
    private String room_size;
    private Integer room_bed_quantity;
    private Integer room_capacity;
    private String file_url;
    private List<ResponseFacility> facilities;
    private BigDecimal room_price;

    public ResponseRooms() {
    }

    public ResponseRooms(Integer room_id, String room_name, String room_size, Integer room_bed_quantity, Integer room_capacity, String file_url, List<ResponseFacility> facilities, BigDecimal room_price) {
        this.room_id = room_id;
        this.room_name = room_name;
        this.room_size = room_size;
        this.room_bed_quantity = room_bed_quantity;
        this.room_capacity = room_capacity;
        this.file_url = file_url;
        this.facilities = facilities;
        this.room_price = room_price;
    }

    public ResponseRooms(Integer room_id, String room_name, String room_size, Integer room_bed_quantity, Integer room_capacity, String file_url, BigDecimal room_price) {
        this.room_id = room_id;
        this.room_name = room_name;
        this.room_size = room_size;
        this.room_bed_quantity = room_bed_quantity;
        this.room_capacity = room_capacity;
        this.file_url = file_url;
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

    public List<ResponseFacility> getfacilities() {
        return facilities;
    }

    public void setfacilities(List<ResponseFacility> facilities) {
        this.facilities = facilities;
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
                ", room_size='" + room_size + '\'' +
                ", room_bed_quantity=" + room_bed_quantity +
                ", room_capacity=" + room_capacity +
                ", file_url='" + file_url + '\'' +
                ", facilities='" + facilities + '\'' +
                ", room_price=" + room_price +
                '}';
    }
}
