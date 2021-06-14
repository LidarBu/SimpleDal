package com.main.models;

import java.util.Date;

public class ODSHeader {

    Date date;

    public ODSHeader() {
        this.date = new Date();
    }

    public ODSHeader(ODSHeader header) {
        this.date = header.date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
