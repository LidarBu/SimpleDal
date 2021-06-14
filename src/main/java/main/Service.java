package main;

import DAOs.DataDAO;
import models.ODSResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.crypto.Data;
import java.util.HashMap;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    DataDAO dataDAO;


    public ODSResponse getdata() {
        HashMap body = dataDAO.getData();
        return new ODSResponse(body);
    }

    public ODSResponse getdata(Object[] params) {
        HashMap body = dataDAO.getData(params);
        return new ODSResponse(body);
    }


}
