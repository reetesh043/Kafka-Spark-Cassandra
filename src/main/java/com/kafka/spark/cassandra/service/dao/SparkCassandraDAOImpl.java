/**
 * 
 */
package com.kafka.spark.cassandra.service.dao;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import static com.datastax.spark.connector.japi.CassandraJavaUtil.javaFunctions;
import static com.datastax.spark.connector.japi.CassandraJavaUtil.mapToRow;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.kafka.spark.cassandra.domain.InboundPayment;
import com.kafka.spark.cassandra.domain.Notification;
import com.kafka.spark.cassandra.domain.db.InboundPaymentsData;

/**
 * @author reekumar0
 *
 */
@Service
public class SparkCassandraDAOImpl implements SparkCassandraDAO {


	@Value(value = "${cassandra.keyspace}")
	private String ks;

	@Value(value = "${cassandra.table}")
	private String table;

	private InboundPaymentsData ipData;

	@Override
	public void save(InboundPayment inboundPaymentsRequest, JavaStreamingContext sparkContext) {
		Notification notification = inboundPaymentsRequest.getNotification();
		// List<Event> events = notification.getEvent();
		try {
			ipData = new InboundPaymentsData();
			// PaymentEventDetails paymentEventDetails =
			// events.get(0).getPaymentEventDetails();
			// String paymentContext =
			// paymentEventDetails.getPaymentEventHeader().getPaymentContext();
			// ipData.setPayment_context(paymentContext);
			// ipData.setPayment_id(paymentEventDetails.getPaymentEventHeader().getPaymentUniqueId());
			/*
			 * Optional.ofNullable(paymentEventDetails.getPaymentDetails().
			 * getFIToFICstmrCdtTrf()) .ifPresent(fiToFICstmrCdtTrf -> { CdtTrfTxInf
			 * cdtTrfTxInf = fiToFICstmrCdtTrf.getCdtTrfTxInf().get(0);
			 * ipData.setBene_account_num(cdtTrfTxInf.getCdtrAcct().getId().getOthr().getId(
			 * )); ipData.setBene_sort_code(cdtTrfTxInf.getCdtrAgt().getFinInstnId().
			 * getClrSysMmbId().getMmbId()); String amount =
			 * cdtTrfTxInf.getIntrBkSttlmAmt().getAmt(); ipData.setPayment_amount(amount);
			 * ipData.setCurrency(cdtTrfTxInf.getIntrBkSttlmAmt().getCcy());
			 * ipData.setPayment_type(cdtTrfTxInf.getPmtTpInf().getLclInstrm().getPrtry());
			 * String sortCode = cdtTrfTxInf.getDbtrAgt().getFinInstnId().getBICFI();
			 * ipData.setDebt_sort_code(sortCode); String accountNumber =
			 * cdtTrfTxInf.getDbtrAcct().getId().getIBAN();
			 * ipData.setDebt_account_num(accountNumber); if (sortCode == null) {
			 * Optional.ofNullable(cdtTrfTxInf.getDbtrAgt().getFinInstnId().getClrSysMmbId()
			 * ) .ifPresent(x -> { String code = x.getMmbId();
			 * ipData.setDebt_sort_code(code); }); } if (accountNumber == null) {
			 * Optional.ofNullable(cdtTrfTxInf.getDbtrAcct().getId().getOthr()).ifPresent(x
			 * -> { String code = x.getId(); ipData.setDebt_account_num(code); }); } });
			 */
			// ipData.setSettlement_date(Instant.now().toString());
			ipData.setId(UUID.randomUUID().toString());
			ipData.setNotification(notification);
			List<InboundPaymentsData> ipDataList = Arrays.asList(ipData);
			JavaRDD<InboundPaymentsData> rdd = sparkContext.sparkContext().parallelize(ipDataList);
			javaFunctions(rdd).writerBuilder(ks, table, mapToRow(InboundPaymentsData.class)).saveToCassandra();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
