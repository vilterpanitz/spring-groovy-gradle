package com.panitz.techblog;

import com.panitz.techblog.groovy.MyGroovyClass;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vilterpanitz on 07/09/16.
 */
@RestController
@RequestMapping("/message")
public class MessageService {

    @RequestMapping("/java")
    public String getJavaMessage(){
        return "Hello Java World";
    }

    @RequestMapping("/groovy")
    public String getGroovyMessage(){
        return new MyGroovyClass().getMessage();
    }
}
