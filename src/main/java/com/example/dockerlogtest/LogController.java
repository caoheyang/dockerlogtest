package com.example.dockerlogtest;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;


@RestController
public class LogController {
    private static final Logger logger = LoggerFactory.getLogger(LogController.class);

    @GetMapping("/logger/info")
    public ResponseEntity<String> info() {
        logger.info("试一下log的实时打印");
        return ResponseEntity.status(HttpStatus.OK).body("ok");

    }

    @GetMapping("/logger/v2/info")
    public ResponseEntity<String> infov2() {
        logger.info("试一下log的实时打印");
        return ResponseEntity.status(HttpStatus.OK).body("ok");

    }
}
