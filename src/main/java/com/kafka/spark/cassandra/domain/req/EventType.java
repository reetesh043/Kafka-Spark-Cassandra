package com.kafka.spark.cassandra.domain.req;

public enum EventType {

    IP_SCORE("IP_SCORE");
   
    private String code;

    private EventType(String message) {
        this.code = message;
    }

    /**
     * @return the message
     */
    public String getCode() {
        return code;
    }
}
