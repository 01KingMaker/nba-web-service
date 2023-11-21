package com.nba.tpwebservice.specific;

import java.util.HashMap;

public class ApiResponse {
    public String error = "";
    public String status;
    public HashMap<String, Object> data;

    public ApiResponse(){
        this.status = "200";
        this.data = new HashMap<>();
    }

    public void addObject(String key, Object value){
        this.data.put(key, value);
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setData(HashMap<String, Object> data) {
        this.data = data;
    }

    public HashMap<String, Object> getData() {
        return data;
    }
}
