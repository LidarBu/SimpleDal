package com.main.mod;

import java.util.HashMap;
import java.util.List;


public class ODSResponse {

    private ODSHeader header;
    private List<HashMap> body;

    public ODSResponse() {
        header = new ODSHeader();
    }

    public ODSResponse(List<HashMap> body) {
        header = new ODSHeader();
        System.out.println(header.getDescription());
        this.body = body;
    }

    public ODSHeader getHeader() {
        return new ODSHeader(this.header);
    }

    public void setHeader(ODSHeader header) {
        this.header = header;
    }

    public List<HashMap> getBody() {
        return body;
    }

    public void setBody(List<HashMap> body) {
        this.body = body;
    }
}
