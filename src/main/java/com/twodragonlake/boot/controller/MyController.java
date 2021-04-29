package com.twodragonlake.boot.controller;

import com.twodragonlake.boot.config.MyConfigBean;
import com.twodragonlake.boot.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Description.
 *
 * @author : CeaserWang
 * @version : 1.0
 * @since : 2019/6/7 17:32
 */

@RestController
@RequestMapping(value = "/person", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class MyController {

    @Value("${myConfig.myObject.myName}")
    private  String myName;
    @Value("${myConfig.myObject.myAge}")
    private int myAge;

    @Autowired
    private MyConfigBean myConfigBean;

    @RequestMapping(value="/getPerson", method= RequestMethod.GET)
    public Person getPerson(){
        Person person = new Person();
        person.setBithday(new Date());
        person.setId(123);
        person.setName("ceaser");
        System.out.println("myName:" +myName + ", myAge:" +myAge);
        System.out.println("-------------------------");
        System.out.println("myName:" +myConfigBean.getMyName() + ", myAge:" +myConfigBean.getMyAge());

        return person;
    }

}
