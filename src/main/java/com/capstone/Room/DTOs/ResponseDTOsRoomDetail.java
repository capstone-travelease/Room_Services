package com.capstone.Room.DTOs;

import com.capstone.Room.Entities.ResponseRoomDetail;

import java.util.List;

public class ResponseDTOsRoomDetail {
    private Integer code;
    private List<ResponseRoomDetail> data;
    private String message;

    public ResponseDTOsRoomDetail() {
    }

    public ResponseDTOsRoomDetail(Integer code, List<ResponseRoomDetail> data, String message) {
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

    public List<ResponseRoomDetail> getData() {
        return data;
    }

    public void setData(List<ResponseRoomDetail> data) {
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
