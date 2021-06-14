package models;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class ODSResponse {

    private ODSHeader header;
    private HashMap body;

    public ODSResponse() {
        header = new ODSHeader();
    }

    public ODSResponse(HashMap body) {
        header = new ODSHeader();
        this.body = body;
    }

    public ODSHeader getHeader() {
        return new ODSHeader(this.header);
    }

    public void setHeader(ODSHeader header) {
        this.header = header;
    }

    public HashMap getBody() {
        return new HashMap(this.body);
    }

    public void setBody(HashMap body) {
        this.body = body;
    }
}
