package io.boodskap.hl7.v21;

import org.json.JSONObject;

import ca.uhn.hl7v2.HapiContext;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.Structure;
import ca.uhn.hl7v2.model.v21.group.ADR_A19_QUERY_RESPONSE;
import ca.uhn.hl7v2.model.v21.group.ADT_A17_PATIENT;
import ca.uhn.hl7v2.model.v21.group.ADT_AXX_PATIENT;
import ca.uhn.hl7v2.model.v21.group.BAR_P01_VISIT;
import ca.uhn.hl7v2.model.v21.group.BAR_P02_PATIENT;
import ca.uhn.hl7v2.model.v21.group.ORM_O01_ORDER;
import ca.uhn.hl7v2.model.v21.group.ORM_O01_ORDER_DETAIL;
import ca.uhn.hl7v2.model.v21.group.ORM_O01_PATIENT;
import ca.uhn.hl7v2.model.v21.group.ORR_O02_ORDER;
import ca.uhn.hl7v2.model.v21.group.ORR_O02_ORDER_DETAIL;
import ca.uhn.hl7v2.model.v21.group.ORR_O02_PATIENT;
import ca.uhn.hl7v2.model.v21.group.ORU_R01_OBSERVATION;
import ca.uhn.hl7v2.model.v21.group.ORU_R01_ORDER_OBSERVATION;
import ca.uhn.hl7v2.model.v21.group.ORU_R01_PATIENT;
import ca.uhn.hl7v2.model.v21.group.ORU_R01_PATIENT_RESULT;
import ca.uhn.hl7v2.model.v21.group.ORU_R03_OBSERVATION;
import ca.uhn.hl7v2.model.v21.group.ORU_R03_ORDER_OBSERVATION;
import ca.uhn.hl7v2.model.v21.group.ORU_R03_PATIENT;
import ca.uhn.hl7v2.model.v21.group.ORU_R03_PATIENT_RESULT;
import ca.uhn.hl7v2.model.v21.message.ACK;
import ca.uhn.hl7v2.model.v21.message.ADR_A19;
import ca.uhn.hl7v2.model.v21.message.ADT_A01;
import ca.uhn.hl7v2.model.v21.message.ADT_A02;
import ca.uhn.hl7v2.model.v21.message.ADT_A03;
import ca.uhn.hl7v2.model.v21.message.ADT_A04;
import ca.uhn.hl7v2.model.v21.message.ADT_A05;
import ca.uhn.hl7v2.model.v21.message.ADT_A06;
import ca.uhn.hl7v2.model.v21.message.ADT_A07;
import ca.uhn.hl7v2.model.v21.message.ADT_A08;
import ca.uhn.hl7v2.model.v21.message.ADT_A09;
import ca.uhn.hl7v2.model.v21.message.ADT_A10;
import ca.uhn.hl7v2.model.v21.message.ADT_A11;
import ca.uhn.hl7v2.model.v21.message.ADT_A12;
import ca.uhn.hl7v2.model.v21.message.ADT_A13;
import ca.uhn.hl7v2.model.v21.message.ADT_A14;
import ca.uhn.hl7v2.model.v21.message.ADT_A15;
import ca.uhn.hl7v2.model.v21.message.ADT_A16;
import ca.uhn.hl7v2.model.v21.message.ADT_A17;
import ca.uhn.hl7v2.model.v21.message.ADT_A18;
import ca.uhn.hl7v2.model.v21.message.ADT_A20;
import ca.uhn.hl7v2.model.v21.message.ADT_A21;
import ca.uhn.hl7v2.model.v21.message.ADT_A22;
import ca.uhn.hl7v2.model.v21.message.ADT_A23;
import ca.uhn.hl7v2.model.v21.message.ADT_A24;
import ca.uhn.hl7v2.model.v21.message.ADT_AXX;
import ca.uhn.hl7v2.model.v21.message.BAR_P01;
import ca.uhn.hl7v2.model.v21.message.BAR_P02;
import ca.uhn.hl7v2.model.v21.message.DFT_P03;
import ca.uhn.hl7v2.model.v21.message.DSR_Q01;
import ca.uhn.hl7v2.model.v21.message.DSR_Q03;
import ca.uhn.hl7v2.model.v21.message.MCF_Q02;
import ca.uhn.hl7v2.model.v21.message.ORM_O01;
import ca.uhn.hl7v2.model.v21.message.ORR_O02;
import ca.uhn.hl7v2.model.v21.message.ORU_R01;
import ca.uhn.hl7v2.model.v21.message.ORU_R03;
import ca.uhn.hl7v2.model.v21.message.QRY_A19;
import ca.uhn.hl7v2.model.v21.message.QRY_Q01;
import ca.uhn.hl7v2.model.v21.message.QRY_Q02;
import ca.uhn.hl7v2.model.v21.message.UDM_Q05;
import ca.uhn.hl7v2.model.v21.segment.ACC;
import ca.uhn.hl7v2.model.v21.segment.ADD;
import ca.uhn.hl7v2.model.v21.segment.BHS;
import ca.uhn.hl7v2.model.v21.segment.BLG;
import ca.uhn.hl7v2.model.v21.segment.BTS;
import ca.uhn.hl7v2.model.v21.segment.DG1;
import ca.uhn.hl7v2.model.v21.segment.DSC;
import ca.uhn.hl7v2.model.v21.segment.DSP;
import ca.uhn.hl7v2.model.v21.segment.ERR;
import ca.uhn.hl7v2.model.v21.segment.EVN;
import ca.uhn.hl7v2.model.v21.segment.FHS;
import ca.uhn.hl7v2.model.v21.segment.FT1;
import ca.uhn.hl7v2.model.v21.segment.FTS;
import ca.uhn.hl7v2.model.v21.segment.GT1;
import ca.uhn.hl7v2.model.v21.segment.IN1;
import ca.uhn.hl7v2.model.v21.segment.IN3;
import ca.uhn.hl7v2.model.v21.segment.MRG;
import ca.uhn.hl7v2.model.v21.segment.MSA;
import ca.uhn.hl7v2.model.v21.segment.MSH;
import ca.uhn.hl7v2.model.v21.segment.NCK;
import ca.uhn.hl7v2.model.v21.segment.NK1;
import ca.uhn.hl7v2.model.v21.segment.NPU;
import ca.uhn.hl7v2.model.v21.segment.NSC;
import ca.uhn.hl7v2.model.v21.segment.NST;
import ca.uhn.hl7v2.model.v21.segment.NTE;
import ca.uhn.hl7v2.model.v21.segment.OBR;
import ca.uhn.hl7v2.model.v21.segment.OBX;
import ca.uhn.hl7v2.model.v21.segment.ORC;
import ca.uhn.hl7v2.model.v21.segment.ORO;
import ca.uhn.hl7v2.model.v21.segment.PD1;
import ca.uhn.hl7v2.model.v21.segment.PID;
import ca.uhn.hl7v2.model.v21.segment.PR1;
import ca.uhn.hl7v2.model.v21.segment.PV1;
import ca.uhn.hl7v2.model.v21.segment.PV2;
import ca.uhn.hl7v2.model.v21.segment.QRD;
import ca.uhn.hl7v2.model.v21.segment.QRF;
import ca.uhn.hl7v2.model.v21.segment.RX1;
import ca.uhn.hl7v2.model.v21.segment.UB1;
import ca.uhn.hl7v2.model.v21.segment.URD;
import ca.uhn.hl7v2.model.v21.segment.URS;
import ca.uhn.hl7v2.parser.Parser;
import io.boodskap.hl7.MessageDecoder;


public class Decoder implements MessageDecoder {

	@SuppressWarnings("unused")
	@Override
	public void decode(HapiContext context, Parser parser, Message msg, JSONObject json, String data) throws Exception {

		for (String type : msg.getNames()) {

			Structure s = msg.get(type);


			if(s instanceof MSH){
				MSH v = (MSH) s;
				
				JSONObject j = new JSONObject();
				
				Serializer.convert(j, "field_separator", v.getMsh1_FIELDSEPARATOR());
				Serializer.convert(j , "version_id", v.getMsh12_VERSIONID());
				Serializer.convert(j , "sending_application", v.getMsh3_SENDINGAPPLICATION());
				

			} 

			else if(s instanceof DSR_Q03){
				DSR_Q03 v = (DSR_Q03) s;
			} 

			else if(s instanceof DSR_Q01){
				DSR_Q01 v = (DSR_Q01) s;
			} 

			else if(s instanceof DG1){
				DG1 v = (DG1) s;
			} 

			else if(s instanceof ADT_A07){
				ADT_A07 v = (ADT_A07) s;
			} 

			else if(s instanceof ADT_A08){
				ADT_A08 v = (ADT_A08) s;
			} 

			else if(s instanceof UDM_Q05){
				UDM_Q05 v = (UDM_Q05) s;
			} 

			else if(s instanceof ADT_A05){
				ADT_A05 v = (ADT_A05) s;
			} 

			else if(s instanceof ADT_A06){
				ADT_A06 v = (ADT_A06) s;
			} 

			else if(s instanceof ORR_O02_ORDER_DETAIL){
				ORR_O02_ORDER_DETAIL v = (ORR_O02_ORDER_DETAIL) s;
			} 

			else if(s instanceof NK1){
				NK1 v = (NK1) s;
			} 

			else if(s instanceof ADT_A09){
				ADT_A09 v = (ADT_A09) s;
			} 

			else if(s instanceof ADT_AXX){
				ADT_AXX v = (ADT_AXX) s;
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

			else if(s instanceof ADT_A01){
				ADT_A01 v = (ADT_A01) s;
			} 

			else if(s instanceof ADT_A02){
				ADT_A02 v = (ADT_A02) s;
			} 

			else if(s instanceof NSC){
				NSC v = (NSC) s;
			} 

			else if(s instanceof FT1){
				FT1 v = (FT1) s;
			} 

			else if(s instanceof BAR_P02_PATIENT){
				BAR_P02_PATIENT v = (BAR_P02_PATIENT) s;
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

			else if(s instanceof BLG){
				BLG v = (BLG) s;
			} 

			else if(s instanceof ADT_A14){
				ADT_A14 v = (ADT_A14) s;
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

			else if(s instanceof ADT_A13){
				ADT_A13 v = (ADT_A13) s;
			} 

			else if(s instanceof BTS){
				BTS v = (BTS) s;
			} 

			else if(s instanceof QRD){
				QRD v = (QRD) s;
			} 

			else if(s instanceof MRG){
				MRG v = (MRG) s;
			} 

			else if(s instanceof FTS){
				FTS v = (FTS) s;
			} 

			else if(s instanceof ERR){
				ERR v = (ERR) s;
			} 

			else if(s instanceof QRF){
				QRF v = (QRF) s;
			} 

			else if(s instanceof UB1){
				UB1 v = (UB1) s;
			} 

			else if(s instanceof ORU_R03_ORDER_OBSERVATION){
				ORU_R03_ORDER_OBSERVATION v = (ORU_R03_ORDER_OBSERVATION) s;
			} 

			else if(s instanceof URD){
				URD v = (URD) s;
			} 

			else if(s instanceof ADR_A19_QUERY_RESPONSE){
				ADR_A19_QUERY_RESPONSE v = (ADR_A19_QUERY_RESPONSE) s;
			} 

			else if(s instanceof ORR_O02_PATIENT){
				ORR_O02_PATIENT v = (ORR_O02_PATIENT) s;
			} 

			else if(s instanceof ORR_O02_ORDER){
				ORR_O02_ORDER v = (ORR_O02_ORDER) s;
			} 

			else if(s instanceof URS){
				URS v = (URS) s;
			} 

			else if(s instanceof ADR_A19){
				ADR_A19 v = (ADR_A19) s;
			} 

			else if(s instanceof MSA){
				MSA v = (MSA) s;
			} 

			else if(s instanceof MCF_Q02){
				MCF_Q02 v = (MCF_Q02) s;
			} 

			else if(s instanceof ORU_R01_OBSERVATION){
				ORU_R01_OBSERVATION v = (ORU_R01_OBSERVATION) s;
			} 

			else if(s instanceof ACC){
				ACC v = (ACC) s;
			} 

			else if(s instanceof ACK){
				ACK v = (ACK) s;
			} 

			else if(s instanceof PID){
				PID v = (PID) s;
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

			else if(s instanceof QRY_Q02){
				QRY_Q02 v = (QRY_Q02) s;
			} 

			else if(s instanceof ADT_AXX_PATIENT){
				ADT_AXX_PATIENT v = (ADT_AXX_PATIENT) s;
			} 

			else if(s instanceof BAR_P01_VISIT){
				BAR_P01_VISIT v = (BAR_P01_VISIT) s;
			} 

			else if(s instanceof ADD){
				ADD v = (ADD) s;
			} 

			else if(s instanceof ORR_O02){
				ORR_O02 v = (ORR_O02) s;
			} 

			else if(s instanceof ORU_R03_PATIENT){
				ORU_R03_PATIENT v = (ORU_R03_PATIENT) s;
			} 

			else if(s instanceof ADT_A17_PATIENT){
				ADT_A17_PATIENT v = (ADT_A17_PATIENT) s;
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

			else if(s instanceof RX1){
				RX1 v = (RX1) s;
			} 

			else if(s instanceof IN1){
				IN1 v = (IN1) s;
			} 

			else if(s instanceof IN3){
				IN3 v = (IN3) s;
			} 

			else if(s instanceof PD1){
				PD1 v = (PD1) s;
			} 

			else if(s instanceof EVN){
				EVN v = (EVN) s;
			} 

			else if(s instanceof DFT_P03){
				DFT_P03 v = (DFT_P03) s;
			} 

			else if(s instanceof ORC){
				ORC v = (ORC) s;
			} 

			else if(s instanceof BHS){
				BHS v = (BHS) s;
			} 

			else if(s instanceof ORO){
				ORO v = (ORO) s;
			} 

			else if(s instanceof FHS){
				FHS v = (FHS) s;
			} 

			else if(s instanceof NPU){
				NPU v = (NPU) s;
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

			else if(s instanceof OBR){
				OBR v = (OBR) s;
			} 

			else if(s instanceof ADT_A23){
				ADT_A23 v = (ADT_A23) s;
			} 

			else if(s instanceof ADT_A24){
				ADT_A24 v = (ADT_A24) s;
			} 

			else if(s instanceof OBX){
				OBX v = (OBX) s;
			} 

			else if(s instanceof GT1){
				GT1 v = (GT1) s;
			} 

			else if(s instanceof PV1){
				PV1 v = (PV1) s;
			} 

			else if(s instanceof PV2){
				PV2 v = (PV2) s;
			} 

			else if(s instanceof ORM_O01_ORDER){
				ORM_O01_ORDER v = (ORM_O01_ORDER) s;
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


		}
		
	}

}
