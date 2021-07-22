package com.main.mod;

import java.util.Date;

public class ODSHeader {

    private Date date;
    private final String description;


    public ODSHeader() {
        this.date = new Date();
        this.description = Values.getDescription();


    }

    public ODSHeader(ODSHeader header) {
        this.date = header.date;
        this.description = Values.getDescription();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }
}
