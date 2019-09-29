package com.kafka.spark.cassandra.message;

import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kafka.spark.cassandra.domain.InboundPayment;

@Component
public class MessageMapper implements  Serializable	 {


	private static final long serialVersionUID = -827819120970147976L;
	
	
	private static ObjectMapper mapper = new ObjectMapper();

	public InboundPayment map(String v1) throws Exception {
		InboundPayment obj = null;

		try { 
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
			obj = mapper.readValue(v1, InboundPayment.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}

}
