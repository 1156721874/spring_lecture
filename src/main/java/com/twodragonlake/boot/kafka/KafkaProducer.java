package com.twodragonlake.boot.kafka;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * Description.
 *
 * @author : CeaserWang
 * @version : 1.0
 * @since : 2019/8/10 12:55
 */

//@Component
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    public void sendKafkaMessage(KafkaMessage kafkaMessage){
        this.kafkaTemplate.send("myTopic", new Gson().toJson(kafkaMessage));
    }

}
