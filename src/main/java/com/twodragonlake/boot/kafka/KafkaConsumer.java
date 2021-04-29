package com.twodragonlake.boot.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Description.
 *
 * @author : CeaserWang
 * @version : 1.0
 * @since : 2019/8/10 13:05
 */
//@Component
public class KafkaConsumer {

    @KafkaListener(topics = "myTopic",groupId = "myGroup")
    public void obtainMessage(ConsumerRecord<String, String> consumerRecord){
        System.out.println("ontainMessage invoked!");
        String topic =consumerRecord.topic();
        String key = consumerRecord.key();
        String value = consumerRecord.value();
        int partition = consumerRecord.partition();
        long timeStamp = consumerRecord.timestamp();

        System.out.println("topic: " + topic);
        System.out.println("key: " + key);
        System.out.println("value: " + value);
        System.out.println("partition: " + partition);
        System.out.println("timeStamp: " + timeStamp);

    }

}
