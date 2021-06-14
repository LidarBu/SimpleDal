package main;

import models.ODSResponse;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    Service service;

    public ODSResponse getData() {
        return service.getdata();
    }

    public ODSResponse getData(Object[] params) {
        return service.getdata(params);
    }


}
