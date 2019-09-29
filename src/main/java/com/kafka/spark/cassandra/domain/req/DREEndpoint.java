package com.kafka.spark.cassandra.domain.req;

public enum DREEndpoint {
    SCORE("score");

    private String code;

    private DREEndpoint(String message) {
        this.code = message;
    }

    /**
     * @return the message
     */
    public String getCode() {
        return code;
    }

}
