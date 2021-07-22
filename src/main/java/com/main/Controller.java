package com.main;

import com.main.mod.ODSResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    Service service;

    private Logger logger = LoggerFactory.getLogger(Controller.class);

    @GetMapping("/getdata")
    public ResponseEntity<ODSResponse> getData(@RequestParam(required = false) Object[] params) {
        ResponseEntity<ODSResponse> re = service.getdata(params);
        System.out.println(re.getBody().getHeader().getDescription());
        return re;
    }


}
