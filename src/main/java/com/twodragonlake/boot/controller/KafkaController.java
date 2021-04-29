package com.twodragonlake.boot.controller;

import com.twodragonlake.boot.kafka.KafkaMessage;
import com.twodragonlake.boot.kafka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Date;

/**
 * Description.
 *
 * @author : CeaserWang
 * @version : 1.0
 * @since : 2019/8/10 13:23
 */

//@RestController
//@RequestMapping(value = "/kafka", produces =  MediaType.APPLICATION_JSON_UTF8_VALUE)
public class KafkaController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @RequestMapping(value = "message", method = RequestMethod.GET)
    public KafkaMessage sendKafkaMessages(@RequestParam(name = "id") long id,
                                          @RequestParam(name = "username") String username,
                                          @RequestParam(name = "password") String password){
        System.out.println("send kafka message invoked!");
        KafkaMessage kafkaMessage = new KafkaMessage();
        kafkaMessage.setId(id);;
        kafkaMessage.setUsername(username);
        kafkaMessage.setPasseord(password);
        kafkaMessage.setDate(new Date());
        kafkaProducer.sendKafkaMessage(kafkaMessage);
        return kafkaMessage;
    }

    @RequestMapping(value = "sendMessage2", method = RequestMethod.POST)
    public KafkaMessage sendMessage2(@RequestBody KafkaMessage kafkaMessage){
        System.out.println("send kafka message2 invoked!");
        kafkaMessage.setDate(new Date());
        this.kafkaProducer.sendKafkaMessage(kafkaMessage);
        return kafkaMessage;
    }

}
