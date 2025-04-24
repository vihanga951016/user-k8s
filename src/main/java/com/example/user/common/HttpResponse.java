package com.example.user.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Calendar;
import java.util.TimeZone;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HttpResponse<T> implements Serializable {

    private String message;
    private String timestamp = Calendar.getInstance(TimeZone.getTimeZone("GMT")).getTime().toString();
    private T data;

    public HttpResponse<T> responseOk(T data) {
        message = "success";
        this.data = data;
        return this;
    }

    public HttpResponse<T> responseFail(T data) {
        message = (String) data;
        this.data = data;
        return this;
    }
}
