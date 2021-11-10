package org.github.ogomezso.springkafka.infrastructure.kafka;

import org.github.ogomezso.springkafka.infrastructure.kafka.config.KafkaConfigProperties;
import org.github.ogomezso.springkafka.infrastructure.model.ticket.TicketMessage;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
class TicketProducer {

  private final KafkaConfigProperties configProperties;

  @Qualifier("ticketTemplate")
  private final KafkaTemplate<String,TicketMessage> ticketTemplate;

  TicketProducer(
      KafkaConfigProperties configProperties,
      KafkaTemplate<String, TicketMessage> ticketTemplate) {
    this.configProperties = configProperties;
    this.ticketTemplate = ticketTemplate;
  }


  void send(TicketMessage ticketMessage) {

    ListenableFuture<SendResult<String, TicketMessage>> resultFuture = ticketTemplate
        .send(configProperties.getTicketTopic() , ticketMessage);

    resultFuture.addCallback(new ListenableFutureCallback<>() {
      @Override
      public void onFailure(Throwable throwable) {
        log.error("Unable to Send ticket to kafka: {}", ticketMessage);
      }

      @Override
      public void onSuccess(SendResult<String, TicketMessage> result) {
        log.info("ticket delivered: {}. Event Offset: {}",ticketMessage,
            result.getRecordMetadata().offset());
      }
    });
  }
}
