package com.capstone.Room.DTOs;

public class ResponseImage {
    private String file_url;
    private Integer room_id;

    public ResponseImage() {
    }

    public ResponseImage(String file_url, Integer room_id) {
        this.file_url = file_url;
        this.room_id = room_id;
    }

    public String getFile_url() {
        return file_url;
    }

    public void setFile_url(String file_url) {
        this.file_url = file_url;
    }

    public Integer getRoom_id() {
        return room_id;
    }

    public void setRoom_id(Integer room_id) {
        this.room_id = room_id;
    }

    @Override
    public String toString() {
        return "ResponseImage{" +
                "file_url='" + file_url + '\'' +
                ", room_id=" + room_id +
                '}';
    }
}
