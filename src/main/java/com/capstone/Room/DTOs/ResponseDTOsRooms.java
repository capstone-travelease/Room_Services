package com.capstone.Room.DTOs;

import com.capstone.Room.Entities.ResponseRoomDetail;
import com.capstone.Room.Entities.ResponseRooms;

import java.util.List;

public class ResponseDTOsRooms {
    private Integer code;
    private List<ResponseRooms> data;
    private String message;

    public ResponseDTOsRooms() {
    }

    public ResponseDTOsRooms(Integer code, List<ResponseRooms> data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public List<ResponseRooms> getData() {
        return data;
    }

    public void setData(List<ResponseRooms> data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "SearchResponse{" +
                "code=" + code +
                ", data=" + data +
                ", message='" + message + '\'' +
                '}';
    }
}
