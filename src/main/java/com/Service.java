package com;

import com.DAOs.DataDAO;
import com.mod.ODSResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    DataDAO dataDAO;

    private Logger logger = LoggerFactory.getLogger(Service.class);


    public ResponseEntity<ODSResponse> getdata(Object[] params) {
        try { //check if the params empty or not.
            int len = params.length;
            logger.info("Request with params received");
            try {//in case the params are not empty the execute request with params
                List<HashMap> body = dataDAO.getData(params);
                ODSResponse response = new ODSResponse(body);
                return new ResponseEntity<ODSResponse>(response, HttpStatus.OK);
            } catch (Exception e) { //in case data base error occurred.
                logger.warn("The following error cant complete the request:\n {}", e.getMessage());
                HashMap body = new HashMap();
                body.put("Exception", "Exception Occurred, check your Params");
                List<HashMap> bodyList = new ArrayList<>();
                bodyList.add(body);
                ODSResponse response = new ODSResponse(bodyList);
                return new ResponseEntity<ODSResponse>(response, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        } catch (Exception e) { //in case the params empty
            logger.info("Request without params received");
            try { //in case the params empty then execute request without params
                List<HashMap> body = dataDAO.getData();
                ODSResponse response = new ODSResponse(body);
                return new ResponseEntity<ODSResponse>(response, HttpStatus.OK);
            } catch (Exception databaseE) {//in case data base error occurred.
                logger.warn("Cant complete the request, the following error occurred:\n {}", databaseE.getMessage());
                HashMap body = new HashMap();
                body.put("Exception", "Exception Occurred, check your Params");
                List<HashMap> bodyList = new ArrayList<>();
                bodyList.add(body);
                ODSResponse response = new ODSResponse(bodyList);
                return new ResponseEntity<ODSResponse>(response, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

    }


}
