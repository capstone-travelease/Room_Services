package com.capstone.Room.Entities;

import com.capstone.Room.DTOs.ResponseFacility;
import com.capstone.Room.DTOs.ResponseImage;
import org.apache.coyote.Response;

import java.math.BigDecimal;
import java.util.List;

public class ResponseRoomDetail {
    private String room_name;
    private Integer room_id;
    private String room_description;
    private String room_size;
    private Integer room_bed_quantity;
    private Integer room_capacity;
    private List<ResponseImage> images;
    private List<ResponseFacility> facilities;
    private BigDecimal room_price;

    public ResponseRoomDetail() {
    }

    public ResponseRoomDetail(String room_name, Integer room_id, String room_description, String room_size, Integer room_bed_quantity, Integer room_capacity, BigDecimal room_price) {
        this.room_name = room_name;
        this.room_id = room_id;
        this.room_description = room_description;
        this.room_size = room_size;
        this.room_bed_quantity = room_bed_quantity;
        this.room_capacity = room_capacity;
        this.room_price = room_price;
    }

    public ResponseRoomDetail(String room_name, Integer room_id, String room_description, String room_size, Integer room_bed_quantity, Integer room_capacity, List<ResponseImage> images, BigDecimal room_price) {
        this.room_name = room_name;
        this.room_id = room_id;
        this.room_description = room_description;
        this.room_size = room_size;
        this.room_bed_quantity = room_bed_quantity;
        this.room_capacity = room_capacity;
        this.images = images;
        this.room_price = room_price;
    }

    public ResponseRoomDetail(String room_name, Integer room_id, String room_description, String room_size, Integer room_bed_quantity, Integer room_capacity, List<ResponseImage> images, List<ResponseFacility> facilities, BigDecimal room_price) {
        this.room_name = room_name;
        this.room_id = room_id;
        this.room_description = room_description;
        this.room_size = room_size;
        this.room_bed_quantity = room_bed_quantity;
        this.room_capacity = room_capacity;
        this.images = images;
        this.facilities = facilities;
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

    public List<ResponseImage> getimages() {
        return images;
    }

    public void setimages(List<ResponseImage> images) {
        this.images = images;
    }

    public List<ResponseFacility> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<ResponseFacility> facilities) {
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
        return "ResponseRoomDetail{" +
                "room_name=" + room_name +
                ", room_id=" + room_id +
                ", room_description='" + room_description + '\'' +
                ", room_size='" + room_size + '\'' +
                ", room_bed_quantity=" + room_bed_quantity +
                ", room_capacity=" + room_capacity +
                ", images='" + images + '\'' +
                ", facilities='" + facilities + '\'' +
                ", room_price='" + room_price + '\'' +
                '}';
    }
}
