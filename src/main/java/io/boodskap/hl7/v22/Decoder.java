package io.boodskap.hl7.v22;

import org.json.JSONObject;

import ca.uhn.hl7v2.HapiContext;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.Structure;
import ca.uhn.hl7v2.model.v22.group.ADR_A19_INSURANCE;
import ca.uhn.hl7v2.model.v22.group.ADR_A19_QUERY_RESPONSE;
import ca.uhn.hl7v2.model.v22.group.ADT_A01_INSURANCE;
import ca.uhn.hl7v2.model.v22.group.ADT_A04_INSURANCE;
import ca.uhn.hl7v2.model.v22.group.ADT_A05_INSURANCE;
import ca.uhn.hl7v2.model.v22.group.ADT_A06_INSURANCE;
import ca.uhn.hl7v2.model.v22.group.ADT_A07_INSURANCE;
import ca.uhn.hl7v2.model.v22.group.ADT_A08_INSURANCE;
import ca.uhn.hl7v2.model.v22.group.ADT_A13_INSURANCE;
import ca.uhn.hl7v2.model.v22.group.ADT_A14_INSURANCE;
import ca.uhn.hl7v2.model.v22.group.ADT_A28_INSURANCE;
import ca.uhn.hl7v2.model.v22.group.ADT_A31_INSURANCE;
import ca.uhn.hl7v2.model.v22.group.ADT_AXX_INSURANCE;
import ca.uhn.hl7v2.model.v22.group.BAR_P01_INSURANCE;
import ca.uhn.hl7v2.model.v22.group.BAR_P01_VISIT;
import ca.uhn.hl7v2.model.v22.group.BAR_P02_PATIENT;
import ca.uhn.hl7v2.model.v22.group.MFN_M01_MF;
import ca.uhn.hl7v2.model.v22.group.MFN_M02_MF_STAFF;
import ca.uhn.hl7v2.model.v22.group.MFN_M03_MF_TEST;
import ca.uhn.hl7v2.model.v22.group.MFR_M01_MF;
import ca.uhn.hl7v2.model.v22.group.MFR_M02_MF_STAFF;
import ca.uhn.hl7v2.model.v22.group.MFR_M03_MF_TEST;
import ca.uhn.hl7v2.model.v22.group.NMD_N01_APP_STATS;
import ca.uhn.hl7v2.model.v22.group.NMD_N01_APP_STATUS;
import ca.uhn.hl7v2.model.v22.group.NMD_N01_CLOCK;
import ca.uhn.hl7v2.model.v22.group.NMD_N01_CLOCK_AND_STATS_WITH_NOTES;
import ca.uhn.hl7v2.model.v22.group.NMQ_N02_CLOCK_AND_STATISTICS;
import ca.uhn.hl7v2.model.v22.group.NMQ_N02_QRY_WITH_DETAIL;
import ca.uhn.hl7v2.model.v22.group.NMR_N02_CLOCK_AND_STATS_WITH_NOTES_ALT;
import ca.uhn.hl7v2.model.v22.group.ORF_R04_OBSERVATION;
import ca.uhn.hl7v2.model.v22.group.ORF_R04_ORDER;
import ca.uhn.hl7v2.model.v22.group.ORF_R04_QUERY_RESPONSE;
import ca.uhn.hl7v2.model.v22.group.ORM_O01_ORDER;
import ca.uhn.hl7v2.model.v22.group.ORM_O01_ORDER_DETAIL;
import ca.uhn.hl7v2.model.v22.group.ORM_O01_PATIENT;
import ca.uhn.hl7v2.model.v22.group.ORR_O02_ORDER;
import ca.uhn.hl7v2.model.v22.group.ORR_O02_ORDER_DETAIL;
import ca.uhn.hl7v2.model.v22.group.ORR_O02_PATIENT;
import ca.uhn.hl7v2.model.v22.group.ORU_R01_OBSERVATION;
import ca.uhn.hl7v2.model.v22.group.ORU_R01_ORDER_OBSERVATION;
import ca.uhn.hl7v2.model.v22.group.ORU_R01_PATIENT;
import ca.uhn.hl7v2.model.v22.group.ORU_R01_PATIENT_RESULT;
import ca.uhn.hl7v2.model.v22.group.ORU_R03_OBSERVATION;
import ca.uhn.hl7v2.model.v22.group.ORU_R03_ORDER_OBSERVATION;
import ca.uhn.hl7v2.model.v22.group.ORU_R03_PATIENT;
import ca.uhn.hl7v2.model.v22.group.ORU_R03_PATIENT_RESULT;
import ca.uhn.hl7v2.model.v22.message.ACK;
import ca.uhn.hl7v2.model.v22.message.ADR_A19;
import ca.uhn.hl7v2.model.v22.message.ADT_A01;
import ca.uhn.hl7v2.model.v22.message.ADT_A02;
import ca.uhn.hl7v2.model.v22.message.ADT_A03;
import ca.uhn.hl7v2.model.v22.message.ADT_A04;
import ca.uhn.hl7v2.model.v22.message.ADT_A05;
import ca.uhn.hl7v2.model.v22.message.ADT_A06;
import ca.uhn.hl7v2.model.v22.message.ADT_A07;
import ca.uhn.hl7v2.model.v22.message.ADT_A08;
import ca.uhn.hl7v2.model.v22.message.ADT_A09;
import ca.uhn.hl7v2.model.v22.message.ADT_A10;
import ca.uhn.hl7v2.model.v22.message.ADT_A11;
import ca.uhn.hl7v2.model.v22.message.ADT_A12;
import ca.uhn.hl7v2.model.v22.message.ADT_A13;
import ca.uhn.hl7v2.model.v22.message.ADT_A14;
import ca.uhn.hl7v2.model.v22.message.ADT_A15;
import ca.uhn.hl7v2.model.v22.message.ADT_A16;
import ca.uhn.hl7v2.model.v22.message.ADT_A17;
import ca.uhn.hl7v2.model.v22.message.ADT_A18;
import ca.uhn.hl7v2.model.v22.message.ADT_A20;
import ca.uhn.hl7v2.model.v22.message.ADT_A21;
import ca.uhn.hl7v2.model.v22.message.ADT_A22;
import ca.uhn.hl7v2.model.v22.message.ADT_A23;
import ca.uhn.hl7v2.model.v22.message.ADT_A24;
import ca.uhn.hl7v2.model.v22.message.ADT_A25;
import ca.uhn.hl7v2.model.v22.message.ADT_A26;
import ca.uhn.hl7v2.model.v22.message.ADT_A27;
import ca.uhn.hl7v2.model.v22.message.ADT_A28;
import ca.uhn.hl7v2.model.v22.message.ADT_A29;
import ca.uhn.hl7v2.model.v22.message.ADT_A30;
import ca.uhn.hl7v2.model.v22.message.ADT_A31;
import ca.uhn.hl7v2.model.v22.message.ADT_A32;
import ca.uhn.hl7v2.model.v22.message.ADT_A33;
import ca.uhn.hl7v2.model.v22.message.ADT_A34;
import ca.uhn.hl7v2.model.v22.message.ADT_A35;
import ca.uhn.hl7v2.model.v22.message.ADT_A36;
import ca.uhn.hl7v2.model.v22.message.ADT_A37;
import ca.uhn.hl7v2.model.v22.message.ADT_AXX;
import ca.uhn.hl7v2.model.v22.message.BAR_P01;
import ca.uhn.hl7v2.model.v22.message.BAR_P02;
import ca.uhn.hl7v2.model.v22.message.DFT_P03;
import ca.uhn.hl7v2.model.v22.message.DSR_P04;
import ca.uhn.hl7v2.model.v22.message.DSR_Q01;
import ca.uhn.hl7v2.model.v22.message.DSR_Q03;
import ca.uhn.hl7v2.model.v22.message.DSR_R03;
import ca.uhn.hl7v2.model.v22.message.MFD_M01;
import ca.uhn.hl7v2.model.v22.message.MFD_M02;
import ca.uhn.hl7v2.model.v22.message.MFD_M03;
import ca.uhn.hl7v2.model.v22.message.MFK_M01;
import ca.uhn.hl7v2.model.v22.message.MFK_M02;
import ca.uhn.hl7v2.model.v22.message.MFK_M03;
import ca.uhn.hl7v2.model.v22.message.MFN_M01;
import ca.uhn.hl7v2.model.v22.message.MFN_M02;
import ca.uhn.hl7v2.model.v22.message.MFN_M03;
import ca.uhn.hl7v2.model.v22.message.MFQ_M01;
import ca.uhn.hl7v2.model.v22.message.MFQ_M02;
import ca.uhn.hl7v2.model.v22.message.MFQ_M03;
import ca.uhn.hl7v2.model.v22.message.MFR_M01;
import ca.uhn.hl7v2.model.v22.message.MFR_M02;
import ca.uhn.hl7v2.model.v22.message.MFR_M03;
import ca.uhn.hl7v2.model.v22.message.NMD_N01;
import ca.uhn.hl7v2.model.v22.message.NMQ_N02;
import ca.uhn.hl7v2.model.v22.message.NMR_N02;
import ca.uhn.hl7v2.model.v22.message.ORF_R04;
import ca.uhn.hl7v2.model.v22.message.ORM_O01;
import ca.uhn.hl7v2.model.v22.message.ORR_O02;
import ca.uhn.hl7v2.model.v22.message.ORU_R01;
import ca.uhn.hl7v2.model.v22.message.ORU_R03;
import ca.uhn.hl7v2.model.v22.message.QRY_A19;
import ca.uhn.hl7v2.model.v22.message.QRY_P04;
import ca.uhn.hl7v2.model.v22.message.QRY_Q01;
import ca.uhn.hl7v2.model.v22.message.QRY_Q02;
import ca.uhn.hl7v2.model.v22.message.QRY_R02;
import ca.uhn.hl7v2.model.v22.message.UDM_Q05;
import ca.uhn.hl7v2.model.v22.segment.ACC;
import ca.uhn.hl7v2.model.v22.segment.ADD;
import ca.uhn.hl7v2.model.v22.segment.AL1;
import ca.uhn.hl7v2.model.v22.segment.BHS;
import ca.uhn.hl7v2.model.v22.segment.BLG;
import ca.uhn.hl7v2.model.v22.segment.BTS;
import ca.uhn.hl7v2.model.v22.segment.DG1;
import ca.uhn.hl7v2.model.v22.segment.DSC;
import ca.uhn.hl7v2.model.v22.segment.DSP;
import ca.uhn.hl7v2.model.v22.segment.ERR;
import ca.uhn.hl7v2.model.v22.segment.EVN;
import ca.uhn.hl7v2.model.v22.segment.FHS;
import ca.uhn.hl7v2.model.v22.segment.FT1;
import ca.uhn.hl7v2.model.v22.segment.FTS;
import ca.uhn.hl7v2.model.v22.segment.GT1;
import ca.uhn.hl7v2.model.v22.segment.MFA;
import ca.uhn.hl7v2.model.v22.segment.MFE;
import ca.uhn.hl7v2.model.v22.segment.MFI;
import ca.uhn.hl7v2.model.v22.segment.MRG;
import ca.uhn.hl7v2.model.v22.segment.MSA;
import ca.uhn.hl7v2.model.v22.segment.MSH;
import ca.uhn.hl7v2.model.v22.segment.NCK;
import ca.uhn.hl7v2.model.v22.segment.NK1;
import ca.uhn.hl7v2.model.v22.segment.NPU;
import ca.uhn.hl7v2.model.v22.segment.NSC;
import ca.uhn.hl7v2.model.v22.segment.NST;
import ca.uhn.hl7v2.model.v22.segment.NTE;
import ca.uhn.hl7v2.model.v22.segment.OBR;
import ca.uhn.hl7v2.model.v22.segment.OBX;
import ca.uhn.hl7v2.model.v22.segment.ODS;
import ca.uhn.hl7v2.model.v22.segment.ODT;
import ca.uhn.hl7v2.model.v22.segment.OM1;
import ca.uhn.hl7v2.model.v22.segment.OM2;
import ca.uhn.hl7v2.model.v22.segment.OM3;
import ca.uhn.hl7v2.model.v22.segment.OM4;
import ca.uhn.hl7v2.model.v22.segment.OM5;
import ca.uhn.hl7v2.model.v22.segment.OM6;
import ca.uhn.hl7v2.model.v22.segment.ORC;
import ca.uhn.hl7v2.model.v22.segment.PID;
import ca.uhn.hl7v2.model.v22.segment.PR1;
import ca.uhn.hl7v2.model.v22.segment.PRA;
import ca.uhn.hl7v2.model.v22.segment.PV1;
import ca.uhn.hl7v2.model.v22.segment.PV2;
import ca.uhn.hl7v2.model.v22.segment.QRD;
import ca.uhn.hl7v2.model.v22.segment.QRF;
import ca.uhn.hl7v2.model.v22.segment.RQ1;
import ca.uhn.hl7v2.model.v22.segment.RQD;
import ca.uhn.hl7v2.model.v22.segment.RXA;
import ca.uhn.hl7v2.model.v22.segment.RXC;
import ca.uhn.hl7v2.model.v22.segment.RXD;
import ca.uhn.hl7v2.model.v22.segment.RXE;
import ca.uhn.hl7v2.model.v22.segment.RXG;
import ca.uhn.hl7v2.model.v22.segment.RXO;
import ca.uhn.hl7v2.model.v22.segment.RXR;
import ca.uhn.hl7v2.model.v22.segment.STF;
import ca.uhn.hl7v2.model.v22.segment.UB1;
import ca.uhn.hl7v2.model.v22.segment.UB2;
import ca.uhn.hl7v2.model.v22.segment.URD;
import ca.uhn.hl7v2.model.v22.segment.URS;
import ca.uhn.hl7v2.model.v22.segment.Zxx;
import ca.uhn.hl7v2.parser.Parser;
import io.boodskap.hl7.MessageDecoder;


public class Decoder implements MessageDecoder {

	@SuppressWarnings("unused")
	@Override
	public void decode(HapiContext context, Parser parser, Message msg, JSONObject json, String data) throws Exception {

		for (String type : msg.getNames()) {

			Structure s = msg.get(type);
			
			if(s instanceof DSR_Q03){
				DSR_Q03 v = (DSR_Q03) s;
			} 

			else if(s instanceof MSH){
				MSH v = (MSH) s;
				
				JSONObject msh = new JSONObject();
				
				Serializer.convert(msh, "accept_ack_type", v.getAcceptAcknowledgementType());
				Serializer.convert(msh, "application_ack_type", v.getApplicationAcknowledgementType());
				Serializer.convert(msh, "continuation_pointer", v.getContinuationPointer());
				Serializer.convert(msh, "country_code", v.getCountryCode());
				Serializer.convert(msh, "date_time", v.getDateTimeOfMessage());
				Serializer.convert(msh, "message_control_id", v.getMessageControlID());
				Serializer.convert(msh, "processing_id", v.getProcessingID());
				Serializer.convert(msh, "sequence_number", v.getSequenceNumber());
				Serializer.convert(msh, "sending_facility", v.getSendingFacility());
				Serializer.convert(msh, "sending_application", v.getSendingApplication());
				Serializer.convert(msh, "security", v.getSecurity());
				Serializer.convert(msh, "receiving_facility", v.getReceivingFacility());
				Serializer.convert(msh, "receiving_application", v.getReceivingApplication());
				Serializer.convert(msh, "processing_id", v.getProcessingID());

				
				if(msh.length() > 0) json.accumulate("msh", msh);
			} 

			else if(s instanceof PID){
				PID v = (PID) s;
				
				JSONObject pid = new JSONObject();
				
				Serializer.convert(pid, "alternate_patient_id", v.getAlternatePatientID());
				Serializer.convert(pid, "birth_order", v.getBirthOrder());
				Serializer.convert(pid, "birth_place", v.getBirthPlace());
				Serializer.convert(pid, "country_code", v.getCountyCode());
				Serializer.convert(pid, "date_of_birth", v.getDateOfBirth());
				Serializer.convert(pid, "driver_sl_license_number_patient", v.getDriverSLicenseNumberPatient());
				Serializer.convert(pid, "ethnic_group", v.getEthnicGroup());
				Serializer.convert(pid, "language_patient", v.getLanguagePatient());
				Serializer.convert(pid, "marrital_status", v.getMaritalStatus());
				Serializer.convert(pid, "patient_account_number", v.getPatientAccountNumber());
				Serializer.convert(pid, "patient_name", v.getPatientName());
				Serializer.convert(pid, "race", v.getRace());
				Serializer.convert(pid, "religion", v.getReligion());
				Serializer.convert(pid, "sex", v.getSex());
				Serializer.convert(pid, "patient_address", v.getPatientAddress());
				Serializer.convert(pid, "citizenship", v.getCitizenship());
				
				
				if(pid.length() > 0) json.accumulate("pid", pid);
				
			} 

			else if(s instanceof EVN){
				EVN v = (EVN) s;
				
				JSONObject evn = new JSONObject();
				
				Serializer.convert(evn, "event_type", v.getEvn1_EventTypeCode());
				Serializer.convert(evn, "event_time", v.getEvn2_DateTimeOfEvent());
				Serializer.convert(evn, "planned_time", v.getEvn3_DateTimePlannedEvent());
				Serializer.convert(evn, "reason", v.getEvn4_EventReasonCode());
				Serializer.convert(evn, "operator_id", v.getEvn5_OperatorID());
				
				if(evn.length() > 0) json.put("evn", evn);
				
			} 

			else if(s instanceof PV1){
				PV1 v = (PV1) s;
				
				JSONObject pv1 = new JSONObject();
				
				Serializer.convert(pv1, "account_status", v.getAccountStatus());
				Serializer.convert(pv1, "admission_type", v.getAdmissionType());
				Serializer.convert(pv1, "admit_date_time", v.getAdmitDateTime());
				Serializer.convert(pv1, "admit_source", v.getAdmitSource());
				Serializer.convert(pv1, "admitting_doctor", v.getAdmittingDoctor());
				Serializer.convert(pv1, "alternate_visit_id", v.getAlternateVisitID());
				Serializer.convert(pv1, "ambulatory_status", v.getAmbulatoryStatus());
				Serializer.convert(pv1, "assigned_patient_location", v.getAssignedPatientLocation());
				Serializer.convert(pv1, "attending_doctor", v.getAttendingDoctor());
				Serializer.convert(pv1, "bad_debt_agency_code", v.getBadDebtAgencyCode());
				Serializer.convert(pv1, "bad_debt_recovery_amount", v.getBadDebtRecoveryAmount());
				Serializer.convert(pv1, "bad_debt_transfer_amount", v.getBadDebtTransferAmount());
				Serializer.convert(pv1, "bed_status", v.getBedStatus());
				Serializer.convert(pv1, "charge_price_indicator", v.getChargePriceIndicator());
				Serializer.convert(pv1, "consulting_doctor", v.getConsultingDoctor());
				Serializer.convert(pv1, "contract_amount", v.getContractAmount());
				Serializer.convert(pv1, "contract_code", v.getContractCode());
				Serializer.convert(pv1, "contract_effective_date", v.getContractEffectiveDate());
				Serializer.convert(pv1, "contract_period", v.getContractPeriod());
				Serializer.convert(pv1, "courtesy_code", v.getCourtesyCode());
				Serializer.convert(pv1, "credit_rating", v.getCreditRating());
				Serializer.convert(pv1, "current_patient_balance", v.getCurrentPatientBalance());
				Serializer.convert(pv1, "delete_account_date", v.getDeleteAccountDate());
				Serializer.convert(pv1, "delete_account_indicator", v.getDeleteAccountIndicator());
				Serializer.convert(pv1, "diet_type", v.getDietType());
				Serializer.convert(pv1, "discharge_date_time", v.getDischargeDateTime());
				Serializer.convert(pv1, "discharge_disposition", v.getDischargeDisposition());
				Serializer.convert(pv1, "discharged_to_location", v.getDischargedToLocation());
				Serializer.convert(pv1, "financial_class", v.getFinancialClass());
				Serializer.convert(pv1, "hospital_service", v.getHospitalService());
				Serializer.convert(pv1, "interest_code", v.getInterestCode());
				Serializer.convert(pv1, "patient_class", v.getPatientClass());
				Serializer.convert(pv1, "patient_type", v.getPatientType());
				Serializer.convert(pv1, "pending_location", v.getPendingLocation());
				Serializer.convert(pv1, "preadmit_number", v.getPreadmitNumber());
				Serializer.convert(pv1, "preadmit_test_indicator", v.getPreadmitTestIndicator());
				Serializer.convert(pv1, "prior_patient_location", v.getPriorPatientLocation());
				Serializer.convert(pv1, "prior_temporary_location", v.getPriorTemporaryLocation());
				Serializer.convert(pv1, "readmission_indicator", v.getReadmissionIndicator());
				Serializer.convert(pv1, "rederring_doctor", v.getReferringDoctor());
				Serializer.convert(pv1, "servicing_facility", v.getServicingFacility());
				Serializer.convert(pv1, "set_id_patient_visit", v.getSetIDPatientVisit());
				Serializer.convert(pv1, "temporary_location", v.getTemporaryLocation());
				Serializer.convert(pv1, "total_adjustments", v.getTotalAdjustments());
				Serializer.convert(pv1, "total_charges", v.getTotalCharges());
				Serializer.convert(pv1, "total_payments", v.getTotalPayments());
				Serializer.convert(pv1, "transfer_to_bad_debt_code", v.getTransferToBadDebtCode());
				Serializer.convert(pv1, "transfer_to_bad_debt_date", v.getTransferToBadDebtDate());
				Serializer.convert(pv1, "vip_indicator", v.getVIPIndicator());
				Serializer.convert(pv1, "visit_number", v.getVisitNumber());

				
				
				if(pv1.length() > 0) json.accumulate("pv1", pv1);
			} 

			else if(s instanceof PV2){
				PV2 v = (PV2) s;
				
				JSONObject pv2 = new JSONObject();
				
				Serializer.convert(pv2, "expected_admit_date", v.getExpectedAdmitDate());
				Serializer.convert(pv2, "expected_discharge_date", v.getExpectedDischargeDate());
				Serializer.convert(pv2, "patient_valuables_location", v.getPatientValuablesLocation());
				Serializer.convert(pv2, "prior_pending_location", v.getPriorPendingLocation());
				Serializer.convert(pv2, "visit_user_code", v.getVisitUserCode());
				Serializer.convert(pv2, "accomodation_code", v.getAccommodationCode());
				Serializer.convert(pv2, "reason", v.getAdmitReason());
				Serializer.convert(pv2, "patient_valuables", v.getPatientValuables());
				Serializer.convert(pv2, "transfer_reason", v.getTransferReason());
				
				if(pv2.length() > 0) json.accumulate("pv2", pv2);

			} 

			else if(s instanceof ADT_A06_INSURANCE){
				ADT_A06_INSURANCE v = (ADT_A06_INSURANCE) s;

				JSONObject j = new JSONObject();
				
				Serializer.convert(j, "in1", v.getIN1());
				Serializer.convert(j, "in2", v.getIN2());
				Serializer.convert(j, "in3", v.getIN3());
				
				
				if(j.length() > 0) json.accumulate("ins", j);
				
			} 

			else if(s instanceof BAR_P01_INSURANCE){
				BAR_P01_INSURANCE v = (BAR_P01_INSURANCE) s;

				JSONObject j = new JSONObject();
				
				Serializer.convert(j, "in1", v.getIN1());
				Serializer.convert(j, "in2", v.getIN2());
				Serializer.convert(j, "in3", v.getIN3());
				
				
				if(j.length() > 0) json.accumulate("ins", j);
				
			} 

			else if(s instanceof ADR_A19_INSURANCE){
				ADR_A19_INSURANCE v = (ADR_A19_INSURANCE) s;

				JSONObject j = new JSONObject();
				
				Serializer.convert(j, "in1", v.getIN1());
				Serializer.convert(j, "in2", v.getIN2());
				Serializer.convert(j, "in3", v.getIN3());
				
				
				if(j.length() > 0) json.accumulate("ins", j);
				
			} 

			else if(s instanceof ADT_AXX_INSURANCE){
				ADT_AXX_INSURANCE v = (ADT_AXX_INSURANCE) s;

				JSONObject j = new JSONObject();
				
				Serializer.convert(j, "in1", v.getIN1());
				Serializer.convert(j, "in2", v.getIN2());
				Serializer.convert(j, "in3", v.getIN3());
				
				
				if(j.length() > 0) json.accumulate("ins", j);
				
			} 

			else if(s instanceof ADT_A04_INSURANCE){
				ADT_A04_INSURANCE v = (ADT_A04_INSURANCE) s;

				JSONObject j = new JSONObject();
				
				Serializer.convert(j, "in1", v.getIN1());
				Serializer.convert(j, "in2", v.getIN2());
				Serializer.convert(j, "in3", v.getIN3());
				
				
				if(j.length() > 0) json.accumulate("ins", j);
				
			} 

			else if(s instanceof ADT_A28_INSURANCE){
				ADT_A28_INSURANCE v = (ADT_A28_INSURANCE) s;

				JSONObject j = new JSONObject();
				
				Serializer.convert(j, "in1", v.getIN1());
				Serializer.convert(j, "in2", v.getIN2());
				Serializer.convert(j, "in3", v.getIN3());
				
				
				if(j.length() > 0) json.accumulate("ins", j);
				
			} 

			else if(s instanceof ADT_A05_INSURANCE){
				ADT_A05_INSURANCE v = (ADT_A05_INSURANCE) s;

				JSONObject j = new JSONObject();
				
				Serializer.convert(j, "in1", v.getIN1());
				Serializer.convert(j, "in2", v.getIN2());
				Serializer.convert(j, "in3", v.getIN3());
				
				
				if(j.length() > 0) json.accumulate("ins", j);
				
			} 

			else if(s instanceof ADT_A07_INSURANCE){
				ADT_A07_INSURANCE v = (ADT_A07_INSURANCE) s;

				JSONObject j = new JSONObject();
				
				Serializer.convert(j, "in1", v.getIN1());
				Serializer.convert(j, "in2", v.getIN2());
				Serializer.convert(j, "in3", v.getIN3());
				
				
				if(j.length() > 0) json.accumulate("ins", j);
				
			} 

			else if(s instanceof ADT_A14_INSURANCE){
				ADT_A14_INSURANCE v = (ADT_A14_INSURANCE) s;

				JSONObject j = new JSONObject();
				
				Serializer.convert(j, "in1", v.getIN1());
				Serializer.convert(j, "in2", v.getIN2());
				Serializer.convert(j, "in3", v.getIN3());
				
				
				if(j.length() > 0) json.accumulate("ins", j);
				
			} 

			else if(s instanceof ADT_A08_INSURANCE){
				ADT_A08_INSURANCE v = (ADT_A08_INSURANCE) s;

				JSONObject j = new JSONObject();
				
				Serializer.convert(j, "in1", v.getIN1());
				Serializer.convert(j, "in2", v.getIN2());
				Serializer.convert(j, "in3", v.getIN3());
				
				
				if(j.length() > 0) json.accumulate("ins", j);
				
			} 

			else if(s instanceof ADT_A13_INSURANCE){
				ADT_A13_INSURANCE v = (ADT_A13_INSURANCE) s;

				JSONObject j = new JSONObject();
				
				Serializer.convert(j, "in1", v.getIN1());
				Serializer.convert(j, "in2", v.getIN2());
				Serializer.convert(j, "in3", v.getIN3());
				
				
				if(j.length() > 0) json.accumulate("ins", j);
				
			} 

			else if(s instanceof ADT_A31_INSURANCE){
				ADT_A31_INSURANCE v = (ADT_A31_INSURANCE) s;

				JSONObject j = new JSONObject();
				
				Serializer.convert(j, "in1", v.getIN1());
				Serializer.convert(j, "in2", v.getIN2());
				Serializer.convert(j, "in3", v.getIN3());
				
				
				if(j.length() > 0) json.accumulate("ins", j);
				
			} 

			else if(s instanceof ADT_A01_INSURANCE){
				
				ADT_A01_INSURANCE v = (ADT_A01_INSURANCE) s;

				JSONObject j = new JSONObject();
				
				Serializer.convert(j, "in1", v.getIN1());
				Serializer.convert(j, "in2", v.getIN2());
				Serializer.convert(j, "in3", v.getIN3());
				
				
				if(j.length() > 0) json.accumulate("ins", j);
				
			} 

			else if(s instanceof MFD_M03){
				MFD_M03 v = (MFD_M03) s;
			} 

			else if(s instanceof STF){
				STF v = (STF) s;
			} 

			else if(s instanceof MFD_M02){
				MFD_M02 v = (MFD_M02) s;
			} 

			else if(s instanceof MFD_M01){
				MFD_M01 v = (MFD_M01) s;
			} 

			else if(s instanceof ORF_R04_QUERY_RESPONSE){
				ORF_R04_QUERY_RESPONSE v = (ORF_R04_QUERY_RESPONSE) s;
			} 

			else if(s instanceof NMD_N01_APP_STATS){
				NMD_N01_APP_STATS v = (NMD_N01_APP_STATS) s;
			} 

			else if(s instanceof DG1){
				DG1 v = (DG1) s;
			} 

			else if(s instanceof DSR_Q01){
				DSR_Q01 v = (DSR_Q01) s;
			} 

			else if(s instanceof ADT_A07){
				ADT_A07 v = (ADT_A07) s;
			} 

			else if(s instanceof UDM_Q05){
				UDM_Q05 v = (UDM_Q05) s;
			} 

			else if(s instanceof ADT_A08){
				ADT_A08 v = (ADT_A08) s;
			} 

			else if(s instanceof OM1){
				OM1 v = (OM1) s;
			} 

			else if(s instanceof ADT_A05){
				ADT_A05 v = (ADT_A05) s;
			} 

			else if(s instanceof ADT_A06){
				ADT_A06 v = (ADT_A06) s;
			} 

			else if(s instanceof OM3){
				OM3 v = (OM3) s;
			} 

			else if(s instanceof OM2){
				OM2 v = (OM2) s;
			} 

			else if(s instanceof NK1){
				NK1 v = (NK1) s;
			} 

			else if(s instanceof ORR_O02_ORDER_DETAIL){
				ORR_O02_ORDER_DETAIL v = (ORR_O02_ORDER_DETAIL) s;
			} 

			else if(s instanceof OM5){
				OM5 v = (OM5) s;
			} 

			else if(s instanceof ADT_A09){
				ADT_A09 v = (ADT_A09) s;
			} 

			else if(s instanceof OM4){
				OM4 v = (OM4) s;
			} 

			else if(s instanceof ADT_AXX){
				ADT_AXX v = (ADT_AXX) s;
			} 

			else if(s instanceof OM6){
				OM6 v = (OM6) s;
			} 

			else if(s instanceof QRY_A19){
				QRY_A19 v = (QRY_A19) s;
			} 

			else if(s instanceof ADT_A03){
				ADT_A03 v = (ADT_A03) s;
			} 

			else if(s instanceof ADT_A04){
				ADT_A04 v = (ADT_A04) s;
			} 

			else if(s instanceof ODT){
				ODT v = (ODT) s;
			} 

			else if(s instanceof ADT_A01){
				ADT_A01 v = (ADT_A01) s;
			} 

			else if(s instanceof ODS){
				ODS v = (ODS) s;
			} 

			else if(s instanceof NSC){
				NSC v = (NSC) s;
			} 

			else if(s instanceof ADT_A02){
				ADT_A02 v = (ADT_A02) s;
			} 

			else if(s instanceof MFK_M01){
				MFK_M01 v = (MFK_M01) s;
			} 

			else if(s instanceof FT1){
				FT1 v = (FT1) s;
			} 

			else if(s instanceof MFK_M02){
				MFK_M02 v = (MFK_M02) s;
			} 

			else if(s instanceof BAR_P02_PATIENT){
				BAR_P02_PATIENT v = (BAR_P02_PATIENT) s;
			} 

			else if(s instanceof MFK_M03){
				MFK_M03 v = (MFK_M03) s;
			} 

			else if(s instanceof ORU_R01_PATIENT_RESULT){
				ORU_R01_PATIENT_RESULT v = (ORU_R01_PATIENT_RESULT) s;
			} 

			else if(s instanceof NST){
				NST v = (NST) s;
			} 

			else if(s instanceof ORU_R01_ORDER_OBSERVATION){
				ORU_R01_ORDER_OBSERVATION v = (ORU_R01_ORDER_OBSERVATION) s;
			} 

			else if(s instanceof ADT_A18){
				ADT_A18 v = (ADT_A18) s;
			} 

			else if(s instanceof ADT_A16){
				ADT_A16 v = (ADT_A16) s;
			} 

			else if(s instanceof ADT_A17){
				ADT_A17 v = (ADT_A17) s;
			} 

			else if(s instanceof ORU_R01){
				ORU_R01 v = (ORU_R01) s;
			} 

			else if(s instanceof QRY_P04){
				QRY_P04 v = (QRY_P04) s;
			} 

			else if(s instanceof NCK){
				NCK v = (NCK) s;
			} 

			else if(s instanceof ADT_A10){
				ADT_A10 v = (ADT_A10) s;
			} 

			else if(s instanceof ADT_A11){
				ADT_A11 v = (ADT_A11) s;
			} 

			else if(s instanceof ORU_R03){
				ORU_R03 v = (ORU_R03) s;
			} 

			else if(s instanceof ADT_A14){
				ADT_A14 v = (ADT_A14) s;
			} 

			else if(s instanceof BLG){
				BLG v = (BLG) s;
			} 

			else if(s instanceof ADT_A15){
				ADT_A15 v = (ADT_A15) s;
			} 

			else if(s instanceof NTE){
				NTE v = (NTE) s;
			} 

			else if(s instanceof ADT_A12){
				ADT_A12 v = (ADT_A12) s;
			} 

			else if(s instanceof NMR_N02){
				NMR_N02 v = (NMR_N02) s;
			} 

			else if(s instanceof ADT_A13){
				ADT_A13 v = (ADT_A13) s;
			} 

			else if(s instanceof BTS){
				BTS v = (BTS) s;
			} 

			else if(s instanceof DSR_R03){
				DSR_R03 v = (DSR_R03) s;
			} 

			else if(s instanceof QRD){
				QRD v = (QRD) s;
			} 

			else if(s instanceof MRG){
				MRG v = (MRG) s;
			} 

			else if(s instanceof QRF){
				QRF v = (QRF) s;
			} 

			else if(s instanceof FTS){
				FTS v = (FTS) s;
			} 

			else if(s instanceof ERR){
				ERR v = (ERR) s;
			} 

			else if(s instanceof UB2){
				UB2 v = (UB2) s;
			} 

			else if(s instanceof ORU_R03_ORDER_OBSERVATION){
				ORU_R03_ORDER_OBSERVATION v = (ORU_R03_ORDER_OBSERVATION) s;
			} 

			else if(s instanceof UB1){
				UB1 v = (UB1) s;
			} 

			else if(s instanceof URD){
				URD v = (URD) s;
			} 

			else if(s instanceof ADR_A19_QUERY_RESPONSE){
				ADR_A19_QUERY_RESPONSE v = (ADR_A19_QUERY_RESPONSE) s;
			} 

			else if(s instanceof NMD_N01_CLOCK){
				NMD_N01_CLOCK v = (NMD_N01_CLOCK) s;
			} 

			else if(s instanceof ORR_O02_PATIENT){
				ORR_O02_PATIENT v = (ORR_O02_PATIENT) s;
			} 

			else if(s instanceof ORF_R04_OBSERVATION){
				ORF_R04_OBSERVATION v = (ORF_R04_OBSERVATION) s;
			} 

			else if(s instanceof ORR_O02_ORDER){
				ORR_O02_ORDER v = (ORR_O02_ORDER) s;
			} 

			else if(s instanceof ADR_A19){
				ADR_A19 v = (ADR_A19) s;
			} 

			else if(s instanceof URS){
				URS v = (URS) s;
			} 

			else if(s instanceof MFN_M02_MF_STAFF){
				MFN_M02_MF_STAFF v = (MFN_M02_MF_STAFF) s;
			} 

			else if(s instanceof ORF_R04){
				ORF_R04 v = (ORF_R04) s;
			} 

			else if(s instanceof MSA){
				MSA v = (MSA) s;
			} 

			else if(s instanceof ORU_R01_OBSERVATION){
				ORU_R01_OBSERVATION v = (ORU_R01_OBSERVATION) s;
			} 

			else if(s instanceof ACC){
				ACC v = (ACC) s;
			} 

			else if(s instanceof AL1){
				AL1 v = (AL1) s;
			} 

			else if(s instanceof ACK){
				ACK v = (ACK) s;
			} 

			else if(s instanceof MFR_M02_MF_STAFF){
				MFR_M02_MF_STAFF v = (MFR_M02_MF_STAFF) s;
			} 

			else if(s instanceof ORU_R03_OBSERVATION){
				ORU_R03_OBSERVATION v = (ORU_R03_OBSERVATION) s;
			} 

			else if(s instanceof PR1){
				PR1 v = (PR1) s;
			} 

			else if(s instanceof QRY_Q01){
				QRY_Q01 v = (QRY_Q01) s;
			} 

			else if(s instanceof MFQ_M01){
				MFQ_M01 v = (MFQ_M01) s;
			} 

			else if(s instanceof QRY_Q02){
				QRY_Q02 v = (QRY_Q02) s;
			} 

			else if(s instanceof MFQ_M02){
				MFQ_M02 v = (MFQ_M02) s;
			} 

			else if(s instanceof MFQ_M03){
				MFQ_M03 v = (MFQ_M03) s;
			} 

			else if(s instanceof BAR_P01_VISIT){
				BAR_P01_VISIT v = (BAR_P01_VISIT) s;
			} 

			else if(s instanceof PRA){
				PRA v = (PRA) s;
			} 

			else if(s instanceof NMD_N01){
				NMD_N01 v = (NMD_N01) s;
			} 

			else if(s instanceof ADD){
				ADD v = (ADD) s;
			} 

			else if(s instanceof ORR_O02){
				ORR_O02 v = (ORR_O02) s;
			} 

			else if(s instanceof NMD_N01_APP_STATUS){
				NMD_N01_APP_STATUS v = (NMD_N01_APP_STATUS) s;
			} 

			else if(s instanceof ORU_R03_PATIENT){
				ORU_R03_PATIENT v = (ORU_R03_PATIENT) s;
			} 

			else if(s instanceof MFN_M03){
				MFN_M03 v = (MFN_M03) s;
			} 

			else if(s instanceof MFN_M03_MF_TEST){
				MFN_M03_MF_TEST v = (MFN_M03_MF_TEST) s;
			} 

			else if(s instanceof MFN_M01){
				MFN_M01 v = (MFN_M01) s;
			} 

			else if(s instanceof MFN_M02){
				MFN_M02 v = (MFN_M02) s;
			} 

			else if(s instanceof DSC){
				DSC v = (DSC) s;
			} 

			else if(s instanceof ORM_O01_ORDER_DETAIL){
				ORM_O01_ORDER_DETAIL v = (ORM_O01_ORDER_DETAIL) s;
			} 

			else if(s instanceof DSP){
				DSP v = (DSP) s;
			} 

			else if(s instanceof ORF_R04_ORDER){
				ORF_R04_ORDER v = (ORF_R04_ORDER) s;
			} 

			else if(s instanceof NMQ_N02){
				NMQ_N02 v = (NMQ_N02) s;
			} 

			else if(s instanceof QRY_R02){
				QRY_R02 v = (QRY_R02) s;
			} 

			else if(s instanceof RXA){
				RXA v = (RXA) s;
			} 

			else if(s instanceof RXC){
				RXC v = (RXC) s;
			} 

			else if(s instanceof MFR_M03_MF_TEST){
				MFR_M03_MF_TEST v = (MFR_M03_MF_TEST) s;
			} 

			else if(s instanceof RXE){
				RXE v = (RXE) s;
			} 

			else if(s instanceof RXD){
				RXD v = (RXD) s;
			} 

			else if(s instanceof RXG){
				RXG v = (RXG) s;
			} 

			else if(s instanceof DSR_P04){
				DSR_P04 v = (DSR_P04) s;
			} 

			else if(s instanceof DFT_P03){
				DFT_P03 v = (DFT_P03) s;
			} 

			else if(s instanceof ORC){
				ORC v = (ORC) s;
			} 

			else if(s instanceof MFR_M03){
				MFR_M03 v = (MFR_M03) s;
			} 

			else if(s instanceof RXO){
				RXO v = (RXO) s;
			} 

			else if(s instanceof MFA){
				MFA v = (MFA) s;
			} 

			else if(s instanceof MFR_M01){
				MFR_M01 v = (MFR_M01) s;
			} 

			else if(s instanceof MFR_M02){
				MFR_M02 v = (MFR_M02) s;
			} 

			else if(s instanceof BHS){
				BHS v = (BHS) s;
			} 

			else if(s instanceof MFE){
				MFE v = (MFE) s;
			} 

			else if(s instanceof RXR){
				RXR v = (RXR) s;
			} 

			else if(s instanceof FHS){
				FHS v = (FHS) s;
			} 

			else if(s instanceof ADT_A29){
				ADT_A29 v = (ADT_A29) s;
			} 

			else if(s instanceof MFI){
				MFI v = (MFI) s;
			} 

			else if(s instanceof ADT_A27){
				ADT_A27 v = (ADT_A27) s;
			} 

			else if(s instanceof NPU){
				NPU v = (NPU) s;
			} 

			else if(s instanceof RQ1){
				RQ1 v = (RQ1) s;
			} 

			else if(s instanceof ADT_A28){
				ADT_A28 v = (ADT_A28) s;
			} 

			else if(s instanceof NMQ_N02_CLOCK_AND_STATISTICS){
				NMQ_N02_CLOCK_AND_STATISTICS v = (NMQ_N02_CLOCK_AND_STATISTICS) s;
			} 

			else if(s instanceof ADT_A21){
				ADT_A21 v = (ADT_A21) s;
			} 

			else if(s instanceof ORU_R03_PATIENT_RESULT){
				ORU_R03_PATIENT_RESULT v = (ORU_R03_PATIENT_RESULT) s;
			} 

			else if(s instanceof ADT_A22){
				ADT_A22 v = (ADT_A22) s;
			} 

			else if(s instanceof ADT_A20){
				ADT_A20 v = (ADT_A20) s;
			} 

			else if(s instanceof Zxx){
				Zxx v = (Zxx) s;
			} 

			else if(s instanceof ADT_A25){
				ADT_A25 v = (ADT_A25) s;
			} 

			else if(s instanceof ADT_A26){
				ADT_A26 v = (ADT_A26) s;
			} 

			else if(s instanceof ADT_A23){
				ADT_A23 v = (ADT_A23) s;
			} 

			else if(s instanceof OBR){
				OBR v = (OBR) s;
			} 

			else if(s instanceof ADT_A24){
				ADT_A24 v = (ADT_A24) s;
			} 

			else if(s instanceof RQD){
				RQD v = (RQD) s;
			} 

			else if(s instanceof OBX){
				OBX v = (OBX) s;
			} 

			else if(s instanceof GT1){
				GT1 v = (GT1) s;
			} 

			else if(s instanceof NMR_N02_CLOCK_AND_STATS_WITH_NOTES_ALT){
				NMR_N02_CLOCK_AND_STATS_WITH_NOTES_ALT v = (NMR_N02_CLOCK_AND_STATS_WITH_NOTES_ALT) s;
			} 

			else if(s instanceof NMQ_N02_QRY_WITH_DETAIL){
				NMQ_N02_QRY_WITH_DETAIL v = (NMQ_N02_QRY_WITH_DETAIL) s;
			} 

			else if(s instanceof ORM_O01_ORDER){
				ORM_O01_ORDER v = (ORM_O01_ORDER) s;
			} 

			else if(s instanceof MFN_M01_MF){
				MFN_M01_MF v = (MFN_M01_MF) s;
			} 

			else if(s instanceof MFR_M01_MF){
				MFR_M01_MF v = (MFR_M01_MF) s;
			} 

			else if(s instanceof ORU_R01_PATIENT){
				ORU_R01_PATIENT v = (ORU_R01_PATIENT) s;
			} 

			else if(s instanceof BAR_P02){
				BAR_P02 v = (BAR_P02) s;
			} 

			else if(s instanceof BAR_P01){
				BAR_P01 v = (BAR_P01) s;
			} 

			else if(s instanceof ORM_O01_PATIENT){
				ORM_O01_PATIENT v = (ORM_O01_PATIENT) s;
			} 

			else if(s instanceof ORM_O01){
				ORM_O01 v = (ORM_O01) s;
			} 

			else if(s instanceof ADT_A32){
				ADT_A32 v = (ADT_A32) s;
			} 

			else if(s instanceof ADT_A33){
				ADT_A33 v = (ADT_A33) s;
			} 

			else if(s instanceof ADT_A30){
				ADT_A30 v = (ADT_A30) s;
			} 

			else if(s instanceof ADT_A31){
				ADT_A31 v = (ADT_A31) s;
			} 

			else if(s instanceof ADT_A36){
				ADT_A36 v = (ADT_A36) s;
			} 

			else if(s instanceof ADT_A37){
				ADT_A37 v = (ADT_A37) s;
			} 

			else if(s instanceof ADT_A34){
				ADT_A34 v = (ADT_A34) s;
			} 

			else if(s instanceof NMD_N01_CLOCK_AND_STATS_WITH_NOTES){
				NMD_N01_CLOCK_AND_STATS_WITH_NOTES v = (NMD_N01_CLOCK_AND_STATS_WITH_NOTES) s;
			} 

			else if(s instanceof ADT_A35){
				ADT_A35 v = (ADT_A35) s;
			}
			
			else {
				throw new Exception(String.format("Unhandled structure: %s", s.getClass().getName()));
			}


		}
		
	}

}
