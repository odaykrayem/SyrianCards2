package com.mrmindteam.syriancards.models;

public class Request {
    private int id;
    private String message;
    private int amount;
    private int status;
    private int type;
    private String create_at;
    private String update_at;

    public Request(int id, String message, int amount, int status, int type, String create_at, String update_at) {
        this.id = id;
        this.message = message;
        this.amount = amount;
        this.status = status;
        this.type = type;
        this.create_at = create_at;
        this.update_at = update_at;
    }

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public int getAmount() {
        return amount;
    }

    public int getStatus() {
        return status;
    }

    public int getType() {
        return type;
    }

    public String getCreate_at() {
        return create_at;
    }

    public String getUpdate_at() {
        return update_at;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setCreate_at(String create_at) {
        this.create_at = create_at;
    }

    public void setUpdate_at(String update_at) {
        this.update_at = update_at;
    }
}
