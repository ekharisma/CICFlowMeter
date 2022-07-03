package pens.ce.kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

public class BaseKafka {
    private KafkaProducer<Object, Object> kafkaProducer;

    public KafkaProducer<Object, Object> getKafkaProducer(String host) {
        if (kafkaProducer == null){
            Properties properties = new Properties();
            properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, host);
            properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
            properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
            this.kafkaProducer = new KafkaProducer<>(properties);
        }
        return this.kafkaProducer;
    }

    public void sendPayload(Producer<Object, Object> producer, String topic, String message) {
        producer.send(new ProducerRecord<>(topic, message));
        producer.close();
    }
}
