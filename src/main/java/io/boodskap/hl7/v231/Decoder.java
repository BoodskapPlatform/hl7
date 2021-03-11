package io.boodskap.hl7.v231;

import org.json.JSONObject;

import ca.uhn.hl7v2.HapiContext;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.Structure;
import ca.uhn.hl7v2.model.v231.group.*;
import ca.uhn.hl7v2.model.v231.message.*;
import ca.uhn.hl7v2.model.v231.segment.*;
import ca.uhn.hl7v2.parser.Parser;
import io.boodskap.hl7.MessageDecoder;


public class Decoder implements MessageDecoder {

	@SuppressWarnings("unused")
	@Override
	public void decode(HapiContext context, Parser parser, Message msg, JSONObject json, String data) throws Exception {

		for (String type : msg.getNames()) {

			Structure s = msg.get(type);


			if(s instanceof RPI_I04_IN1IN2IN3){
				RPI_I04_IN1IN2IN3 v = (RPI_I04_IN1IN2IN3) s;
			} 

			else if(s instanceof CRM_C01_PIDPV1CSRCSP){
				CRM_C01_PIDPV1CSRCSP v = (CRM_C01_PIDPV1CSRCSP) s;
			} 

			else if(s instanceof RQI_I03_PRDCTD){
				RQI_I03_PRDCTD v = (RQI_I03_PRDCTD) s;
			} 

			else if(s instanceof PPV_PCA_OBRRXONTEVAROBXNTEVAR){
				PPV_PCA_OBRRXONTEVAROBXNTEVAR v = (PPV_PCA_OBRRXONTEVAROBXNTEVAR) s;
			} 

			else if(s instanceof RPL_I02_PRDCTD){
				RPL_I02_PRDCTD v = (RPL_I02_PRDCTD) s;
			} 

			else if(s instanceof RDS_O01_RXERXRRXC){
				RDS_O01_RXERXRRXC v = (RDS_O01_RXERXRRXC) s;
			} 

			else if(s instanceof BAR_P01_IN1IN2IN3){
				BAR_P01_IN1IN2IN3 v = (BAR_P01_IN1IN2IN3) s;
			} 

			else if(s instanceof CDM){
				CDM v = (CDM) s;
			} 

			else if(s instanceof RQA_I08_AUTCTD){
				RQA_I08_AUTCTD v = (RQA_I08_AUTCTD) s;
			} 

			else if(s instanceof DG1){
				DG1 v = (DG1) s;
			} 

			else if(s instanceof SQM_S25_AIPAPR){
				SQM_S25_AIPAPR v = (SQM_S25_AIPAPR) s;
			} 

			else if(s instanceof RPA_I08_AUTCTD){
				RPA_I08_AUTCTD v = (RPA_I08_AUTCTD) s;
			} 

			else if(s instanceof PPT_PCL_ORCOBRRXONTEVAROBXNTEVAR){
				PPT_PCL_ORCOBRRXONTEVAROBXNTEVAR v = (PPT_PCL_ORCOBRRXONTEVAROBXNTEVAR) s;
			} 

			else if(s instanceof PPV_PCA_GOLNTEVARROLVARPTHVAROBXNTEPRBNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR){
				PPV_PCA_GOLNTEVARROLVARPTHVAROBXNTEPRBNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR v = (PPV_PCA_GOLNTEVARROLVARPTHVAROBXNTEPRBNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR) s;
			} 

			else if(s instanceof PPP_PCB_OBXNTEVAR){
				PPP_PCB_OBXNTEVAR v = (PPP_PCB_OBXNTEVAR) s;
			} 

			else if(s instanceof PPR_PC1){
				PPR_PC1 v = (PPR_PC1) s;
			} 

			else if(s instanceof OSR_Q06){
				OSR_Q06 v = (OSR_Q06) s;
			} 

			else if(s instanceof PEX_P07_PESPEOPCRRXERXRRXARXRPRBOBXNTENK1RXERXRRXARXRPRBOBXCSRCSP){
				PEX_P07_PESPEOPCRRXERXRRXARXRPRBOBXNTENK1RXERXRRXARXRPRBOBXCSRCSP v = (PEX_P07_PESPEOPCRRXERXRRXARXRPRBOBXNTENK1RXERXRRXARXRPRBOBXCSRCSP) s;
			} 

			else if(s instanceof RQI_I01){
				RQI_I01 v = (RQI_I01) s;
			} 

			else if(s instanceof RQI_I02){
				RQI_I02 v = (RQI_I02) s;
			} 

			else if(s instanceof ORF_R04_PIDNTEORCOBRNTEOBXNTECTI){
				ORF_R04_PIDNTEORCOBRNTEOBXNTECTI v = (ORF_R04_PIDNTEORCOBRNTEOBXNTECTI) s;
			} 

			else if(s instanceof RQI_I03){
				RQI_I03 v = (RQI_I03) s;
			} 

			else if(s instanceof OMN_O01_PV1PV2){
				OMN_O01_PV1PV2 v = (OMN_O01_PV1PV2) s;
			} 

			else if(s instanceof ADT_AXX_IN1IN2IN3){
				ADT_AXX_IN1IN2IN3 v = (ADT_AXX_IN1IN2IN3) s;
			} 

			else if(s instanceof RCL_I06_PRDCTD){
				RCL_I06_PRDCTD v = (RCL_I06_PRDCTD) s;
			} 

			else if(s instanceof PPV_PCA_ORCOBRRXONTEVAROBXNTEVAR){
				PPV_PCA_ORCOBRRXONTEVAROBXNTEVAR v = (PPV_PCA_ORCOBRRXONTEVAROBXNTEVAR) s;
			} 

			else if(s instanceof VXU_V04){
				VXU_V04 v = (VXU_V04) s;
			} 

			else if(s instanceof RQP_I04){
				RQP_I04 v = (RQP_I04) s;
			} 

			else if(s instanceof PTR_PCF_PRBNTEVARROLVAROBXNTEGOLNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR){
				PTR_PCF_PRBNTEVARROLVAROBXNTEGOLNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR v = (PTR_PCF_PRBNTEVARROLVAROBXNTEGOLNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR) s;
			} 

			else if(s instanceof QAK){
				QAK v = (QAK) s;
			} 

			else if(s instanceof PTR_PCF){
				PTR_PCF v = (PTR_PCF) s;
			} 

			else if(s instanceof RDR_RDR_RXDRXRRXC){
				RDR_RDR_RXDRXRRXC v = (RDR_RDR_RXDRXRRXC) s;
			} 

			else if(s instanceof RRD_O02){
				RRD_O02 v = (RRD_O02) s;
			} 

			else if(s instanceof PTR_PCF_OBRRXONTEVAROBXNTEVAR){
				PTR_PCF_OBRRXONTEVAROBXNTEVAR v = (PTR_PCF_OBRRXONTEVAROBXNTEVAR) s;
			} 

			else if(s instanceof ORS_O02_PIDNTE){
				ORS_O02_PIDNTE v = (ORS_O02_PIDNTE) s;
			} 

			else if(s instanceof SIU_S12_RGSAISNTEAIGNTEAILNTEAIPNTE){
				SIU_S12_RGSAISNTEAIGNTEAILNTEAIPNTE v = (SIU_S12_RGSAISNTEAIGNTEAILNTEAIPNTE) s;
			} 

			else if(s instanceof REF_I12_PR1AUTCTD){
				REF_I12_PR1AUTCTD v = (REF_I12_PR1AUTCTD) s;
			} 

			else if(s instanceof ADT_A14_IN1IN2IN3){
				ADT_A14_IN1IN2IN3 v = (ADT_A14_IN1IN2IN3) s;
			} 

			else if(s instanceof ADT_A06_PR1ROL){
				ADT_A06_PR1ROL v = (ADT_A06_PR1ROL) s;
			} 

			else if(s instanceof ADR_A19_IN1IN2IN3){
				ADR_A19_IN1IN2IN3 v = (ADR_A19_IN1IN2IN3) s;
			} 

			else if(s instanceof OMS_O01_PV1PV2){
				OMS_O01_PV1PV2 v = (OMS_O01_PV1PV2) s;
			} 

			else if(s instanceof PTR_PCF_ROLVAR){
				PTR_PCF_ROLVAR v = (PTR_PCF_ROLVAR) s;
			} 

			else if(s instanceof PTR_PCF_PIDPV1PV2PTHNTEVARROLVARPRBNTEVARROLVAROBXNTEGOLNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR){
				PTR_PCF_PIDPV1PV2PTHNTEVARROLVARPRBNTEVARROLVAROBXNTEGOLNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR v = (PTR_PCF_PIDPV1PV2PTHNTEVARROLVARPRBNTEVARROLVAROBXNTEGOLNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR) s;
			} 

			else if(s instanceof RDF){
				RDF v = (RDF) s;
			} 

			else if(s instanceof OSR_Q06_PIDNTE){
				OSR_Q06_PIDNTE v = (OSR_Q06_PIDNTE) s;
			} 

			else if(s instanceof RDR_RDR_QRDQRFPIDNTEORCRXERXRRXCRXDRXRRXC){
				RDR_RDR_QRDQRFPIDNTEORCRXERXRRXCRXDRXRRXC v = (RDR_RDR_QRDQRFPIDNTEORCRXERXRRXCRXDRXRRXC) s;
			} 

			else if(s instanceof ACC){
				ACC v = (ACC) s;
			} 

			else if(s instanceof PPT_PCL_OBXNTE){
				PPT_PCL_OBXNTE v = (PPT_PCL_OBXNTE) s;
			} 

			else if(s instanceof RDT){
				RDT v = (RDT) s;
			} 

			else if(s instanceof PPT_PCL_OBXNTEVAR){
				PPT_PCL_OBXNTEVAR v = (PPT_PCL_OBXNTEVAR) s;
			} 

			else if(s instanceof GOL){
				GOL v = (GOL) s;
			} 

			else if(s instanceof ACK){
				ACK v = (ACK) s;
			} 

			else if(s instanceof RQC_I05_PRDCTD){
				RQC_I05_PRDCTD v = (RQC_I05_PRDCTD) s;
			} 

			else if(s instanceof ORN_O02){
				ORN_O02 v = (ORN_O02) s;
			} 

			else if(s instanceof ORD_O02_ORCODSNTE){
				ORD_O02_ORCODSNTE v = (ORD_O02_ORCODSNTE) s;
			} 

			else if(s instanceof RAS_O01_NTERXRRXCNTE){
				RAS_O01_NTERXRRXCNTE v = (RAS_O01_NTERXRRXCNTE) s;
			} 

			else if(s instanceof RDE_O01_PIDPD1NTEPV1PV2IN1IN2IN3GT1AL1){
				RDE_O01_PIDPD1NTEPV1PV2IN1IN2IN3GT1AL1 v = (RDE_O01_PIDPD1NTEPV1PV2IN1IN2IN3GT1AL1) s;
			} 

			else if(s instanceof PTR_PCF_PV1PV2){
				PTR_PCF_PV1PV2 v = (PTR_PCF_PV1PV2) s;
			} 

			else if(s instanceof OMD_O01_PIDPD1NTEPV1PV2IN1IN2IN3GT1AL1){
				OMD_O01_PIDPD1NTEPV1PV2IN1IN2IN3GT1AL1 v = (OMD_O01_PIDPD1NTEPV1PV2IN1IN2IN3GT1AL1) s;
			} 

			else if(s instanceof VXU_V04_IN1IN2IN3){
				VXU_V04_IN1IN2IN3 v = (VXU_V04_IN1IN2IN3) s;
			} 

			else if(s instanceof SQR_S25_SCHNTEPIDPV1PV2DG1RGSAISNTEAIGNTEAIPNTEAILNTE){
				SQR_S25_SCHNTEPIDPV1PV2DG1RGSAISNTEAIGNTEAIPNTEAILNTE v = (SQR_S25_SCHNTEPIDPV1PV2DG1RGSAISNTEAIGNTEAIPNTEAILNTE) s;
			} 

			else if(s instanceof RPA_I08_IN1IN2IN3){
				RPA_I08_IN1IN2IN3 v = (RPA_I08_IN1IN2IN3) s;
			} 

			else if(s instanceof PGL_PC6_PTHVAR){
				PGL_PC6_PTHVAR v = (PGL_PC6_PTHVAR) s;
			} 

			else if(s instanceof RF1){
				RF1 v = (RF1) s;
			} 

			else if(s instanceof RRI_I12_OBXNTE){
				RRI_I12_OBXNTE v = (RRI_I12_OBXNTE) s;
			} 

			else if(s instanceof ROR_R0R_QRDQRFPIDNTEORCRXORXRRXC){
				ROR_R0R_QRDQRFPIDNTEORCRXORXRRXC v = (ROR_R0R_QRDQRFPIDNTEORCRXORXRRXC) s;
			} 

			else if(s instanceof SIU_S12_AILNTE){
				SIU_S12_AILNTE v = (SIU_S12_AILNTE) s;
			} 

			else if(s instanceof ADD){
				ADD v = (ADD) s;
			} 

			else if(s instanceof DFT_P03_PR1ROL){
				DFT_P03_PR1ROL v = (DFT_P03_PR1ROL) s;
			} 

			else if(s instanceof MFN_M08){
				MFN_M08 v = (MFN_M08) s;
			} 

			else if(s instanceof MFN_M05){
				MFN_M05 v = (MFN_M05) s;
			} 

			else if(s instanceof NMD_N02){
				NMD_N02 v = (NMD_N02) s;
			} 

			else if(s instanceof MFN_M06){
				MFN_M06 v = (MFN_M06) s;
			} 

			else if(s instanceof SQM_S25_ARQAPRPIDRGSAISAPRAIGAPRAIPAPRAILAPR){
				SQM_S25_ARQAPRPIDRGSAISAPRAIGAPRAIPAPRAILAPR v = (SQM_S25_ARQAPRPIDRGSAISAPRAIGAPRAIPAPRAILAPR) s;
			} 

			else if(s instanceof MFN_M09){
				MFN_M09 v = (MFN_M09) s;
			} 

			else if(s instanceof RPL_I02){
				RPL_I02 v = (RPL_I02) s;
			} 

			else if(s instanceof RGV_O01_OBXNTE){
				RGV_O01_OBXNTE v = (RGV_O01_OBXNTE) s;
			} 

			else if(s instanceof MFN_M03){
				MFN_M03 v = (MFN_M03) s;
			} 

			else if(s instanceof MFN_M04){
				MFN_M04 v = (MFN_M04) s;
			} 

			else if(s instanceof OMD_O01_IN1IN2IN3){
				OMD_O01_IN1IN2IN3 v = (OMD_O01_IN1IN2IN3) s;
			} 

			else if(s instanceof ORR_O02_ORCOBRRQDRQ1RXOODSODTNTECTI){
				ORR_O02_ORCOBRRQDRQ1RXOODSODTNTECTI v = (ORR_O02_ORCOBRRQDRQ1RXOODSODTNTECTI) s;
			} 

			else if(s instanceof MFN_M01){
				MFN_M01 v = (MFN_M01) s;
			} 

			else if(s instanceof PPP_PCB_OBXNTE){
				PPP_PCB_OBXNTE v = (PPP_PCB_OBXNTE) s;
			} 

			else if(s instanceof MFN_M02){
				MFN_M02 v = (MFN_M02) s;
			} 

			else if(s instanceof RPA_I08_PRDCTD){
				RPA_I08_PRDCTD v = (RPA_I08_PRDCTD) s;
			} 

			else if(s instanceof REF_I12_OBRNTEOBXNTE){
				REF_I12_OBRNTEOBXNTE v = (REF_I12_OBRNTEOBXNTE) s;
			} 

			else if(s instanceof RER_RER){
				RER_RER v = (RER_RER) s;
			} 

			else if(s instanceof RGR_RGR_RXERXRRXC){
				RGR_RGR_RXERXRRXC v = (RGR_RGR_RXERXRRXC) s;
			} 

			else if(s instanceof OSQ_Q06){
				OSQ_Q06 v = (OSQ_Q06) s;
			} 

			else if(s instanceof CSU_C09_PV1PV2){
				CSU_C09_PV1PV2 v = (CSU_C09_PV1PV2) s;
			} 

			else if(s instanceof VXR_V03_OBXNTE){
				VXR_V03_OBXNTE v = (VXR_V03_OBXNTE) s;
			} 

			else if(s instanceof ADT_A14_PR1ROL){
				ADT_A14_PR1ROL v = (ADT_A14_PR1ROL) s;
			} 

			else if(s instanceof RAR_RAR){
				RAR_RAR v = (RAR_RAR) s;
			} 

			else if(s instanceof MFN_M11_OM6OM2){
				MFN_M11_OM6OM2 v = (MFN_M11_OM6OM2) s;
			} 

			else if(s instanceof RGV_O01_PV1PV2){
				RGV_O01_PV1PV2 v = (RGV_O01_PV1PV2) s;
			} 

			else if(s instanceof SRM_S01_RGSAISAPRNTEAIGAPRNTEAILAPRNTEAIPAPRNTE){
				SRM_S01_RGSAISAPRNTEAIGAPRNTEAILAPRNTEAIPAPRNTE v = (SRM_S01_RGSAISAPRNTEAIGAPRNTEAILAPRNTEAIPAPRNTE) s;
			} 

			else if(s instanceof ADT_A39_PIDPD1MRGPV1){
				ADT_A39_PIDPD1MRGPV1 v = (ADT_A39_PIDPD1MRGPV1) s;
			} 

			else if(s instanceof ORN_O02_PIDNTE){
				ORN_O02_PIDNTE v = (ORN_O02_PIDNTE) s;
			} 

			else if(s instanceof PPP_PCB_ROLVAR){
				PPP_PCB_ROLVAR v = (PPP_PCB_ROLVAR) s;
			} 

			else if(s instanceof ORM_O01_IN1IN2IN3){
				ORM_O01_IN1IN2IN3 v = (ORM_O01_IN1IN2IN3) s;
			} 

			else if(s instanceof RCI_I05_OBXNTE){
				RCI_I05_OBXNTE v = (RCI_I05_OBXNTE) s;
			} 

			else if(s instanceof ROR_R0R_PIDNTE){
				ROR_R0R_PIDNTE v = (ROR_R0R_PIDNTE) s;
			} 

			else if(s instanceof PD1){
				PD1 v = (PD1) s;
			} 

			else if(s instanceof PCR){
				PCR v = (PCR) s;
			} 

			else if(s instanceof RGS){
				RGS v = (RGS) s;
			} 

			else if(s instanceof RAS_O01_RXCNTE){
				RAS_O01_RXCNTE v = (RAS_O01_RXCNTE) s;
			} 

			else if(s instanceof ADT_A03_PR1ROL){
				ADT_A03_PR1ROL v = (ADT_A03_PR1ROL) s;
			} 

			else if(s instanceof OMS_O01_ORCRQDNTEOBXNTEBLG){
				OMS_O01_ORCRQDNTEOBXNTEBLG v = (OMS_O01_ORCRQDNTEOBXNTEBLG) s;
			} 

			else if(s instanceof SUR_P09_FACPDCNTE){
				SUR_P09_FACPDCNTE v = (SUR_P09_FACPDCNTE) s;
			} 

			else if(s instanceof BHS){
				BHS v = (BHS) s;
			} 

			else if(s instanceof PDC){
				PDC v = (PDC) s;
			} 

			else if(s instanceof RPA_I08_PV1PV2){
				RPA_I08_PV1PV2 v = (RPA_I08_PV1PV2) s;
			} 

			else if(s instanceof MFN_M01_MFEZxx){
				MFN_M01_MFEZxx v = (MFN_M01_MFEZxx) s;
			} 

			else if(s instanceof NMQ_N01_QRDQRF){
				NMQ_N01_QRDQRF v = (NMQ_N01_QRDQRF) s;
			} 

			else if(s instanceof MFN_M04_MFECDMPRC){
				MFN_M04_MFECDMPRC v = (MFN_M04_MFECDMPRC) s;
			} 

			else if(s instanceof RRO_O02_PIDNTE){
				RRO_O02_PIDNTE v = (RRO_O02_PIDNTE) s;
			} 

			else if(s instanceof RGV_O01_ORCRXONTERXRRXCNTERXERXRRXCRXGRXRRXCOBXNTE){
				RGV_O01_ORCRXONTERXRRXCNTERXERXRRXCRXGRXRRXCOBXNTE v = (RGV_O01_ORCRXONTERXRRXCNTERXERXRRXCRXGRXRRXCOBXNTE) s;
			} 

			else if(s instanceof PTR_PCF_ORCOBRRXONTEVAROBXNTEVAR){
				PTR_PCF_ORCOBRRXONTEVAROBXNTEVAR v = (PTR_PCF_ORCOBRRXONTEVAROBXNTEVAR) s;
			} 

			else if(s instanceof RDE_O01_RXCNTE){
				RDE_O01_RXCNTE v = (RDE_O01_RXCNTE) s;
			} 

			else if(s instanceof OMD_O01_ODSNTEOBXNTE){
				OMD_O01_ODSNTEOBXNTE v = (OMD_O01_ODSNTEOBXNTE) s;
			} 

			else if(s instanceof Zxx){
				Zxx v = (Zxx) s;
			} 

			else if(s instanceof OBR){
				OBR v = (OBR) s;
			} 

			else if(s instanceof ADT_AXX_PIDPD1MRG){
				ADT_AXX_PIDPD1MRG v = (ADT_AXX_PIDPD1MRG) s;
			} 

			else if(s instanceof RQC_I05){
				RQC_I05 v = (RQC_I05) s;
			} 

			else if(s instanceof RDS_O01_PV1PV2){
				RDS_O01_PV1PV2 v = (RDS_O01_PV1PV2) s;
			} 

			else if(s instanceof OMS_O01_OBXNTE){
				OMS_O01_OBXNTE v = (OMS_O01_OBXNTE) s;
			} 

			else if(s instanceof OBX){
				OBX v = (OBX) s;
			} 

			else if(s instanceof GT1){
				GT1 v = (GT1) s;
			} 

			else if(s instanceof ADT_A05_IN1IN2IN3){
				ADT_A05_IN1IN2IN3 v = (ADT_A05_IN1IN2IN3) s;
			} 

			else if(s instanceof RQC_I06){
				RQC_I06 v = (RQC_I06) s;
			} 

			else if(s instanceof REF_I12_OBXNTE){
				REF_I12_OBXNTE v = (REF_I12_OBXNTE) s;
			} 

			else if(s instanceof OMS_O01_RQDNTEOBXNTE){
				OMS_O01_RQDNTEOBXNTE v = (OMS_O01_RQDNTEOBXNTE) s;
			} 

			else if(s instanceof RQI_I02_IN1IN2IN3){
				RQI_I02_IN1IN2IN3 v = (RQI_I02_IN1IN2IN3) s;
			} 

			else if(s instanceof MFN_M10){
				MFN_M10 v = (MFN_M10) s;
			} 

			else if(s instanceof MFN_M11){
				MFN_M11 v = (MFN_M11) s;
			} 

			else if(s instanceof RQA_I08_PR1AUTCTD){
				RQA_I08_PR1AUTCTD v = (RQA_I08_PR1AUTCTD) s;
			} 

			else if(s instanceof PPP_PCB_PRBNTEVARROLVAROBXNTEGOLNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR){
				PPP_PCB_PRBNTEVARROLVAROBXNTEGOLNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR v = (PPP_PCB_PRBNTEVARROLVAROBXNTEGOLNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR) s;
			} 

			else if(s instanceof RRE_O02){
				RRE_O02 v = (RRE_O02) s;
			} 

			else if(s instanceof PGL_PC6_GOLNTEVARROLVARPTHVAROBXNTEPRBNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR){
				PGL_PC6_GOLNTEVARROLVARPTHVAROBXNTEPRBNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR v = (PGL_PC6_GOLNTEVARROLVARPTHVAROBXNTEPRBNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR) s;
			} 

			else if(s instanceof BAR_P01_PR1ROL){
				BAR_P01_PR1ROL v = (BAR_P01_PR1ROL) s;
			} 

			else if(s instanceof RAS_O01_RXERXRRXC){
				RAS_O01_RXERXRRXC v = (RAS_O01_RXERXRRXC) s;
			} 

			else if(s instanceof RPR_I03_PRDCTD){
				RPR_I03_PRDCTD v = (RPR_I03_PRDCTD) s;
			} 

			else if(s instanceof ORM_O01){
				ORM_O01 v = (ORM_O01) s;
			} 

			else if(s instanceof RAS_O01_ORCRXONTERXRRXCNTERXERXRRXCRXARXROBXNTECTI){
				RAS_O01_ORCRXONTERXRRXCNTERXERXRRXCRXARXROBXNTECTI v = (RAS_O01_ORCRXONTERXRRXCNTERXERXRRXCRXARXROBXNTECTI) s;
			} 

			else if(s instanceof MFN_M06_CM1CM2){
				MFN_M06_CM1CM2 v = (MFN_M06_CM1CM2) s;
			} 

			else if(s instanceof PEO){
				PEO v = (PEO) s;
			} 

			else if(s instanceof SQR_S25_AILNTE){
				SQR_S25_AILNTE v = (SQR_S25_AILNTE) s;
			} 

			else if(s instanceof MFN_M09_OM3OM4){
				MFN_M09_OM3OM4 v = (MFN_M09_OM3OM4) s;
			} 

			else if(s instanceof PES){
				PES v = (PES) s;
			} 

			else if(s instanceof SRR_S01_SCHNTEPIDPV1PV2DG1RGSAISNTEAIGNTEAILNTEAIPNTE){
				SRR_S01_SCHNTEPIDPV1PV2DG1RGSAISNTEAIGNTEAILNTEAIPNTE v = (SRR_S01_SCHNTEPIDPV1PV2DG1RGSAISNTEAIGNTEAILNTEAIPNTE) s;
			} 

			else if(s instanceof RQA_I08_OBRNTEOBXNTE){
				RQA_I08_OBRNTEOBXNTE v = (RQA_I08_OBRNTEOBXNTE) s;
			} 

			else if(s instanceof RQI_I02_PRDCTD){
				RQI_I02_PRDCTD v = (RQI_I02_PRDCTD) s;
			} 

			else if(s instanceof CM1){
				CM1 v = (CM1) s;
			} 

			else if(s instanceof ORM_O01_OBXNTE){
				ORM_O01_OBXNTE v = (ORM_O01_OBXNTE) s;
			} 

			else if(s instanceof CM0){
				CM0 v = (CM0) s;
			} 

			else if(s instanceof SRR_S01_PIDPV1PV2DG1){
				SRR_S01_PIDPV1PV2DG1 v = (SRR_S01_PIDPV1PV2DG1) s;
			} 

			else if(s instanceof CM2){
				CM2 v = (CM2) s;
			} 

			else if(s instanceof RPI_I04_PRDCTD){
				RPI_I04_PRDCTD v = (RPI_I04_PRDCTD) s;
			} 

			else if(s instanceof SIU_S12_AIPNTE){
				SIU_S12_AIPNTE v = (SIU_S12_AIPNTE) s;
			} 

			else if(s instanceof RDS_O01_ORCRXONTERXRRXCNTERXERXRRXCRXDRXRRXCOBXNTE){
				RDS_O01_ORCRXONTERXRRXCNTERXERXRRXCRXDRXRRXCOBXNTE v = (RDS_O01_ORCRXONTERXRRXCNTERXERXRRXCRXDRXRRXCOBXNTE) s;
			} 

			else if(s instanceof PPT_PCL){
				PPT_PCL v = (PPT_PCL) s;
			} 

			else if(s instanceof RDE_O01_OBXNTE){
				RDE_O01_OBXNTE v = (RDE_O01_OBXNTE) s;
			} 

			else if(s instanceof UDM_Q05){
				UDM_Q05 v = (UDM_Q05) s;
			} 

			else if(s instanceof ADT_A43_PIDPD1MRG){
				ADT_A43_PIDPD1MRG v = (ADT_A43_PIDPD1MRG) s;
			} 

			else if(s instanceof RPA_I08_PR1AUTCTD){
				RPA_I08_PR1AUTCTD v = (RPA_I08_PR1AUTCTD) s;
			} 

			else if(s instanceof RER_RER_ORCRXERXRRXC){
				RER_RER_ORCRXERXRRXC v = (RER_RER_ORCRXERXRRXC) s;
			} 

			else if(s instanceof VXX_V02_PIDNK1){
				VXX_V02_PIDNK1 v = (VXX_V02_PIDNK1) s;
			} 

			else if(s instanceof RAS_O01_PIDPD1NTEAL1PV1PV2){
				RAS_O01_PIDPD1NTEAL1PV1PV2 v = (RAS_O01_PIDPD1NTEAL1PV1PV2) s;
			} 

			else if(s instanceof ADT_AXX){
				ADT_AXX v = (ADT_AXX) s;
			} 

			else if(s instanceof ODT){
				ODT v = (ODT) s;
			} 

			else if(s instanceof RPA_I08_OBRNTEOBXNTE){
				RPA_I08_OBRNTEOBXNTE v = (RPA_I08_OBRNTEOBXNTE) s;
			} 

			else if(s instanceof ODS){
				ODS v = (ODS) s;
			} 

			else if(s instanceof AIG){
				AIG v = (AIG) s;
			} 

			else if(s instanceof EQL){
				EQL v = (EQL) s;
			} 

			else if(s instanceof MFR_M01_MFEZxx){
				MFR_M01_MFEZxx v = (MFR_M01_MFEZxx) s;
			} 

			else if(s instanceof FT1){
				FT1 v = (FT1) s;
			} 

			else if(s instanceof RQC_I06_PRDCTD){
				RQC_I06_PRDCTD v = (RQC_I06_PRDCTD) s;
			} 

			else if(s instanceof AIL){
				AIL v = (AIL) s;
			} 

			else if(s instanceof ADT_AXX_PR1ROL){
				ADT_AXX_PR1ROL v = (ADT_AXX_PR1ROL) s;
			} 

			else if(s instanceof RER_RER_PIDNTE){
				RER_RER_PIDNTE v = (RER_RER_PIDNTE) s;
			} 

			else if(s instanceof PRR_PC5_ROLVAR){
				PRR_PC5_ROLVAR v = (PRR_PC5_ROLVAR) s;
			} 

			else if(s instanceof AIP){
				AIP v = (AIP) s;
			} 

			else if(s instanceof RRI_I12){
				RRI_I12 v = (RRI_I12) s;
			} 

			else if(s instanceof ORR_O02_PIDNTEORCOBRRQDRQ1RXOODSODTNTECTI){
				ORR_O02_PIDNTEORCOBRRQDRQ1RXOODSODTNTECTI v = (ORR_O02_PIDNTEORCOBRRQDRQ1RXOODSODTNTECTI) s;
			} 

			else if(s instanceof AIS){
				AIS v = (AIS) s;
			} 

			else if(s instanceof PPT_PCL_GOLNTEVARROLVAROBXNTEPRBNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR){
				PPT_PCL_GOLNTEVARROLVAROBXNTEPRBNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR v = (PPT_PCL_GOLNTEVARROLVAROBXNTEPRBNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR) s;
			} 

			else if(s instanceof PPR_PC1_PV1PV2){
				PPR_PC1_PV1PV2 v = (PPR_PC1_PV1PV2) s;
			} 

			else if(s instanceof RRG_O02_PIDNTE){
				RRG_O02_PIDNTE v = (RRG_O02_PIDNTE) s;
			} 

			else if(s instanceof OMD_O01_PV1PV2){
				OMD_O01_PV1PV2 v = (OMD_O01_PV1PV2) s;
			} 

			else if(s instanceof PRR_PC5_PTHVAR){
				PRR_PC5_PTHVAR v = (PRR_PC5_PTHVAR) s;
			} 

			else if(s instanceof ORU_R01){
				ORU_R01 v = (ORU_R01) s;
			} 

			else if(s instanceof RDE_O01_IN1IN2IN3){
				RDE_O01_IN1IN2IN3 v = (RDE_O01_IN1IN2IN3) s;
			} 

			else if(s instanceof NCK){
				NCK v = (NCK) s;
			} 

			else if(s instanceof RPI_I01_GT1IN1IN2IN3){
				RPI_I01_GT1IN1IN2IN3 v = (RPI_I01_GT1IN1IN2IN3) s;
			} 

			else if(s instanceof NMR_N01){
				NMR_N01 v = (NMR_N01) s;
			} 

			else if(s instanceof RDO_O01_PV1PV2){
				RDO_O01_PV1PV2 v = (RDO_O01_PV1PV2) s;
			} 

			else if(s instanceof RDO_O01_PIDPD1NTEPV1PV2IN1IN2IN3GT1AL1){
				RDO_O01_PIDPD1NTEPV1PV2IN1IN2IN3GT1AL1 v = (RDO_O01_PIDPD1NTEPV1PV2IN1IN2IN3GT1AL1) s;
			} 

			else if(s instanceof CSU_C09_RXARXR){
				CSU_C09_RXARXR v = (CSU_C09_RXARXR) s;
			} 

			else if(s instanceof BLG){
				BLG v = (BLG) s;
			} 

			else if(s instanceof ADT_A01_PR1ROL){
				ADT_A01_PR1ROL v = (ADT_A01_PR1ROL) s;
			} 

			else if(s instanceof OMN_O01_OBXNTE){
				OMN_O01_OBXNTE v = (OMN_O01_OBXNTE) s;
			} 

			else if(s instanceof FTS){
				FTS v = (FTS) s;
			} 

			else if(s instanceof ERR){
				ERR v = (ERR) s;
			} 

			else if(s instanceof RQI_I01_IN1IN2IN3){
				RQI_I01_IN1IN2IN3 v = (RQI_I01_IN1IN2IN3) s;
			} 

			else if(s instanceof ERQ){
				ERQ v = (ERQ) s;
			} 

			else if(s instanceof SQR_S25){
				SQR_S25 v = (SQR_S25) s;
			} 

			else if(s instanceof URD){
				URD v = (URD) s;
			} 

			else if(s instanceof PPG_PCG_OBRRXONTEVAROBXNTEVAR){
				PPG_PCG_OBRRXONTEVAROBXNTEVAR v = (PPG_PCG_OBRRXONTEVAROBXNTEVAR) s;
			} 

			else if(s instanceof Hxx){
				Hxx v = (Hxx) s;
			} 

			else if(s instanceof RQP_I04_PRDCTD){
				RQP_I04_PRDCTD v = (RQP_I04_PRDCTD) s;
			} 

			else if(s instanceof PPT_PCL_OBRRXONTEVAROBXNTEVAR){
				PPT_PCL_OBRRXONTEVAROBXNTEVAR v = (PPT_PCL_OBRRXONTEVAROBXNTEVAR) s;
			} 

			else if(s instanceof VTQ){
				VTQ v = (VTQ) s;
			} 

			else if(s instanceof RGV_O01_PIDNTEAL1PV1PV2){
				RGV_O01_PIDNTEAL1PV1PV2 v = (RGV_O01_PIDNTEAL1PV1PV2) s;
			} 

			else if(s instanceof PPP_PCB_PV1PV2){
				PPP_PCB_PV1PV2 v = (PPP_PCB_PV1PV2) s;
			} 

			else if(s instanceof ADR_A19){
				ADR_A19 v = (ADR_A19) s;
			} 

			else if(s instanceof URS){
				URS v = (URS) s;
			} 

			else if(s instanceof ROR_R0R){
				ROR_R0R v = (ROR_R0R) s;
			} 

			else if(s instanceof PRR_PC5_OBXNTEVAR){
				PRR_PC5_OBXNTEVAR v = (PRR_PC5_OBXNTEVAR) s;
			} 

			else if(s instanceof CSU_C09_CSSORCOBROBXORCRXARXR){
				CSU_C09_CSSORCOBROBXORCRXARXR v = (CSU_C09_CSSORCOBROBXORCRXARXR) s;
			} 

			else if(s instanceof ORF_R04){
				ORF_R04 v = (ORF_R04) s;
			} 

			else if(s instanceof REF_I12_PRDCTD){
				REF_I12_PRDCTD v = (REF_I12_PRDCTD) s;
			} 

			else if(s instanceof ADT_A28_PR1ROL){
				ADT_A28_PR1ROL v = (ADT_A28_PR1ROL) s;
			} 

			else if(s instanceof SQR_S25_AISNTE){
				SQR_S25_AISNTE v = (SQR_S25_AISNTE) s;
			} 

			else if(s instanceof CSU_C09_ORCOBROBX){
				CSU_C09_ORCOBROBX v = (CSU_C09_ORCOBROBX) s;
			} 

			else if(s instanceof SRM_S01){
				SRM_S01 v = (SRM_S01) s;
			} 

			else if(s instanceof RDO_O01_RXCNTE){
				RDO_O01_RXCNTE v = (RDO_O01_RXCNTE) s;
			} 

			else if(s instanceof RDE_O01){
				RDE_O01 v = (RDE_O01) s;
			} 

			else if(s instanceof AL1){
				AL1 v = (AL1) s;
			} 

			else if(s instanceof SQM_S25_AIGAPR){
				SQM_S25_AIGAPR v = (SQM_S25_AIGAPR) s;
			} 

			else if(s instanceof PID){
				PID v = (PID) s;
			} 

			else if(s instanceof VXR_V03_IN1IN2IN3){
				VXR_V03_IN1IN2IN3 v = (VXR_V03_IN1IN2IN3) s;
			} 

			else if(s instanceof ORU_R01_OBXNTE){
				ORU_R01_OBXNTE v = (ORU_R01_OBXNTE) s;
			} 

			else if(s instanceof BAR_P02_PIDPD1PV1DB1){
				BAR_P02_PIDPD1PV1DB1 v = (BAR_P02_PIDPD1PV1DB1) s;
			} 

			else if(s instanceof ADT_A44_PIDPD1MRG){
				ADT_A44_PIDPD1MRG v = (ADT_A44_PIDPD1MRG) s;
			} 

			else if(s instanceof MFQ_M01){
				MFQ_M01 v = (MFQ_M01) s;
			} 

			else if(s instanceof SRR_S01_AILNTE){
				SRR_S01_AILNTE v = (SRR_S01_AILNTE) s;
			} 

			else if(s instanceof DRG){
				DRG v = (DRG) s;
			} 

			else if(s instanceof PRR_PC5_OBRRXONTEVAROBXNTEVAR){
				PRR_PC5_OBRRXONTEVAROBXNTEVAR v = (PRR_PC5_OBRRXONTEVAROBXNTEVAR) s;
			} 

			else if(s instanceof RRE_O02_RXERXRRXC){
				RRE_O02_RXERXRRXC v = (RRE_O02_RXERXRRXC) s;
			} 

			else if(s instanceof ADT_A08_IN1IN2IN3){
				ADT_A08_IN1IN2IN3 v = (ADT_A08_IN1IN2IN3) s;
			} 

			else if(s instanceof PPP_PCB_PTHNTEVARROLVARPRBNTEVARROLVAROBXNTEGOLNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR){
				PPP_PCB_PTHNTEVARROLVARPRBNTEVARROLVAROBXNTEGOLNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR v = (PPP_PCB_PTHNTEVARROLVARPRBNTEVARROLVAROBXNTEGOLNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR) s;
			} 

			else if(s instanceof PRR_PC5_ORCOBRRXONTEVAROBXNTEVAR){
				PRR_PC5_ORCOBRRXONTEVAROBXNTEVAR v = (PRR_PC5_ORCOBRRXONTEVAROBXNTEVAR) s;
			} 

			else if(s instanceof RQA_I08_PRDCTD){
				RQA_I08_PRDCTD v = (RQA_I08_PRDCTD) s;
			} 

			else if(s instanceof OMN_O01_IN1IN2IN3){
				OMN_O01_IN1IN2IN3 v = (OMN_O01_IN1IN2IN3) s;
			} 

			else if(s instanceof RAR_RAR_RXERXRRXC){
				RAR_RAR_RXERXRRXC v = (RAR_RAR_RXERXRRXC) s;
			} 

			else if(s instanceof RPI_I01_IN1IN2IN3){
				RPI_I01_IN1IN2IN3 v = (RPI_I01_IN1IN2IN3) s;
			} 

			else if(s instanceof SPR){
				SPR v = (SPR) s;
			} 

			else if(s instanceof DSC){
				DSC v = (DSC) s;
			} 

			else if(s instanceof RGV_O01_NTERXRRXCNTE){
				RGV_O01_NTERXRRXCNTE v = (RGV_O01_NTERXRRXCNTE) s;
			} 

			else if(s instanceof RPA_I08){
				RPA_I08 v = (RPA_I08) s;
			} 

			else if(s instanceof RGR_RGR_PIDNTE){
				RGR_RGR_PIDNTE v = (RGR_RGR_PIDNTE) s;
			} 

			else if(s instanceof RRG_O02){
				RRG_O02 v = (RRG_O02) s;
			} 

			else if(s instanceof RRI_I12_PV1PV2){
				RRI_I12_PV1PV2 v = (RRI_I12_PV1PV2) s;
			} 

			else if(s instanceof ADT_A13_PR1ROL){
				ADT_A13_PR1ROL v = (ADT_A13_PR1ROL) s;
			} 

			else if(s instanceof NMD_N02_NCKNTENSTNTENSCNTE){
				NMD_N02_NCKNTENSTNTENSCNTE v = (NMD_N02_NCKNTENSTNTENSCNTE) s;
			} 

			else if(s instanceof DSP){
				DSP v = (DSP) s;
			} 

			else if(s instanceof ADT_A07_IN1IN2IN3){
				ADT_A07_IN1IN2IN3 v = (ADT_A07_IN1IN2IN3) s;
			} 

			else if(s instanceof PPV_PCA_PIDPV1PV2GOLNTEVARROLVARPTHVAROBXNTEPRBNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR){
				PPV_PCA_PIDPV1PV2GOLNTEVARROLVARPTHVAROBXNTEPRBNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR v = (PPV_PCA_PIDPV1PV2GOLNTEVARROLVARPTHVAROBXNTEPRBNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR) s;
			} 

			else if(s instanceof RDS_O01_PIDPD1NTEAL1PV1PV2){
				RDS_O01_PIDPD1NTEAL1PV1PV2 v = (RDS_O01_PIDPD1NTEAL1PV1PV2) s;
			} 

			else if(s instanceof ORD_O02_PIDNTEORCODSNTEORCODTNTE){
				ORD_O02_PIDNTEORCODSNTEORCODTNTE v = (ORD_O02_PIDNTEORCODSNTEORCODTNTE) s;
			} 

			else if(s instanceof RGR_RGR){
				RGR_RGR v = (RGR_RGR) s;
			} 

			else if(s instanceof LCC){
				LCC v = (LCC) s;
			} 

			else if(s instanceof NMQ_N01){
				NMQ_N01 v = (NMQ_N01) s;
			} 

			else if(s instanceof ROL){
				ROL v = (ROL) s;
			} 

			else if(s instanceof LCH){
				LCH v = (LCH) s;
			} 

			else if(s instanceof PPR_PC1_GOLNTEVARROLVAROBXNTE){
				PPR_PC1_GOLNTEVARROLVAROBXNTE v = (PPR_PC1_GOLNTEVARROLVAROBXNTE) s;
			} 

			else if(s instanceof DFT_P03_IN1IN2IN3){
				DFT_P03_IN1IN2IN3 v = (DFT_P03_IN1IN2IN3) s;
			} 

			else if(s instanceof RDS_O01_RXCNTE){
				RDS_O01_RXCNTE v = (RDS_O01_RXCNTE) s;
			} 

			else if(s instanceof SQR_S25_PIDPV1PV2DG1){
				SQR_S25_PIDPV1PV2DG1 v = (SQR_S25_PIDPV1PV2DG1) s;
			} 

			else if(s instanceof REF_I12_PV1PV2){
				REF_I12_PV1PV2 v = (REF_I12_PV1PV2) s;
			} 

			else if(s instanceof EVN){
				EVN v = (EVN) s;
			} 

			else if(s instanceof BAR_P05_IN1IN2IN3){
				BAR_P05_IN1IN2IN3 v = (BAR_P05_IN1IN2IN3) s;
			} 

			else if(s instanceof DFT_P03){
				DFT_P03 v = (DFT_P03) s;
			} 

			else if(s instanceof RGR_RGR_ORCRXERXRRXCRXGRXRRXC){
				RGR_RGR_ORCRXERXRRXCRXGRXRRXC v = (RGR_RGR_ORCRXERXRRXCRXGRXRRXC) s;
			} 

			else if(s instanceof PPG_PCG_ORCOBRRXONTEVAROBXNTEVAR){
				PPG_PCG_ORCOBRRXONTEVAROBXNTEVAR v = (PPG_PCG_ORCOBRRXONTEVAROBXNTEVAR) s;
			} 

			else if(s instanceof OMD_O01_ORCODSNTEOBXNTE){
				OMD_O01_ORCODSNTEOBXNTE v = (OMD_O01_ORCODSNTEOBXNTE) s;
			} 

			else if(s instanceof MFA){
				MFA v = (MFA) s;
			} 

			else if(s instanceof RQA_I08_PV1PV2){
				RQA_I08_PV1PV2 v = (RQA_I08_PV1PV2) s;
			} 

			else if(s instanceof MFE){
				MFE v = (MFE) s;
			} 

			else if(s instanceof ORD_O02_ORCODTNTE){
				ORD_O02_ORCODTNTE v = (ORD_O02_ORCODTNTE) s;
			} 

			else if(s instanceof CSU_C09_CSPCSSORCOBROBXORCRXARXR){
				CSU_C09_CSPCSSORCOBROBXORCRXARXR v = (CSU_C09_CSPCSSORCOBROBXORCRXARXR) s;
			} 

			else if(s instanceof PPT_PCL_PIDPV1PV2PTHNTEVARROLVARGOLNTEVARROLVAROBXNTEPRBNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR){
				PPT_PCL_PIDPV1PV2PTHNTEVARROLVARGOLNTEVARROLVAROBXNTEPRBNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR v = (PPT_PCL_PIDPV1PV2PTHNTEVARROLVARGOLNTEVARROLVAROBXNTEPRBNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR) s;
			} 

			else if(s instanceof MFI){
				MFI v = (MFI) s;
			} 

			else if(s instanceof RQ1){
				RQ1 v = (RQ1) s;
			} 

			else if(s instanceof RPR_I03){
				RPR_I03 v = (RPR_I03) s;
			} 

			else if(s instanceof ADT_A07_PR1ROL){
				ADT_A07_PR1ROL v = (ADT_A07_PR1ROL) s;
			} 

			else if(s instanceof PPT_PCL_PRBNTEVARROLVAROBXNTE){
				PPT_PCL_PRBNTEVARROLVAROBXNTE v = (PPT_PCL_PRBNTEVARROLVAROBXNTE) s;
			} 

			else if(s instanceof VXR_V03){
				VXR_V03 v = (VXR_V03) s;
			} 

			else if(s instanceof LDP){
				LDP v = (LDP) s;
			} 

			else if(s instanceof REF_I12){
				REF_I12 v = (REF_I12) s;
			} 

			else if(s instanceof RGV_O01){
				RGV_O01 v = (RGV_O01) s;
			} 

			else if(s instanceof PEX_P07_RXARXR){
				PEX_P07_RXARXR v = (PEX_P07_RXARXR) s;
			} 

			else if(s instanceof SUR_P09_PSHPDC){
				SUR_P09_PSHPDC v = (SUR_P09_PSHPDC) s;
			} 

			else if(s instanceof RDO_O01){
				RDO_O01 v = (RDO_O01) s;
			} 

			else if(s instanceof CSP){
				CSP v = (CSP) s;
			} 

			else if(s instanceof CSS){
				CSS v = (CSS) s;
			} 

			else if(s instanceof CSR){
				CSR v = (CSR) s;
			} 

			else if(s instanceof RQD){
				RQD v = (RQD) s;
			} 

			else if(s instanceof RPI_I01){
				RPI_I01 v = (RPI_I01) s;
			} 

			else if(s instanceof RPI_I04){
				RPI_I04 v = (RPI_I04) s;
			} 

			else if(s instanceof EDR_R07){
				EDR_R07 v = (EDR_R07) s;
			} 

			else if(s instanceof RRI_I12_OBRNTEOBXNTE){
				RRI_I12_OBRNTEOBXNTE v = (RRI_I12_OBRNTEOBXNTE) s;
			} 

			else if(s instanceof RQA_I08_IN1IN2IN3){
				RQA_I08_IN1IN2IN3 v = (RQA_I08_IN1IN2IN3) s;
			} 

			else if(s instanceof RGV_O01_RXERXRRXC){
				RGV_O01_RXERXRRXC v = (RGV_O01_RXERXRRXC) s;
			} 

			else if(s instanceof PPG_PCG_PRBNTEVARROLVAROBXNTE){
				PPG_PCG_PRBNTEVARROLVAROBXNTE v = (PPG_PCG_PRBNTEVARROLVAROBXNTE) s;
			} 

			else if(s instanceof CTD){
				CTD v = (CTD) s;
			} 

			else if(s instanceof SUR_P09_FACPSHPDCPSHFACPDCNTE){
				SUR_P09_FACPSHPDCPSHFACPDCNTE v = (SUR_P09_FACPSHPDCPSHFACPDCNTE) s;
			} 

			else if(s instanceof RRI_I12_PRDCTD){
				RRI_I12_PRDCTD v = (RRI_I12_PRDCTD) s;
			} 

			else if(s instanceof CTI){
				CTI v = (CTI) s;
			} 

			else if(s instanceof DSR_Q03){
				DSR_Q03 v = (DSR_Q03) s;
			} 

			else if(s instanceof SQM_S25){
				SQM_S25 v = (SQM_S25) s;
			} 

			else if(s instanceof RRG_O02_RXGRXRRXC){
				RRG_O02_RXGRXRRXC v = (RRG_O02_RXGRXRRXC) s;
			} 

			else if(s instanceof RPI_I01_PRDCTD){
				RPI_I01_PRDCTD v = (RPI_I01_PRDCTD) s;
			} 

			else if(s instanceof OSR_Q06_PIDNTEORCOBRRXORQDRQ1ODSODTNTECTI){
				OSR_Q06_PIDNTEORCOBRRXORQDRQ1ODSODTNTECTI v = (OSR_Q06_PIDNTEORCOBRRXORQDRQ1ODSODTNTECTI) s;
			} 

			else if(s instanceof APR){
				APR v = (APR) s;
			} 

			else if(s instanceof STF){
				STF v = (STF) s;
			} 

			else if(s instanceof RQI_I01_PRDCTD){
				RQI_I01_PRDCTD v = (RQI_I01_PRDCTD) s;
			} 

			else if(s instanceof OMD_O01_OBXNTE){
				OMD_O01_OBXNTE v = (OMD_O01_OBXNTE) s;
			} 

			else if(s instanceof VXR_V03_ORCRXARXROBXNTE){
				VXR_V03_ORCRXARXROBXNTE v = (VXR_V03_ORCRXARXROBXNTE) s;
			} 

			else if(s instanceof RGV_O01_RXONTERXRRXCNTE){
				RGV_O01_RXONTERXRRXCNTE v = (RGV_O01_RXONTERXRRXCNTE) s;
			} 

			else if(s instanceof PPR_PC1_OBXNTE){
				PPR_PC1_OBXNTE v = (PPR_PC1_OBXNTE) s;
			} 

			else if(s instanceof VXU_V04_ORCRXARXROBXNTE){
				VXU_V04_ORCRXARXROBXNTE v = (VXU_V04_ORCRXARXROBXNTE) s;
			} 

			else if(s instanceof DSR_Q01){
				DSR_Q01 v = (DSR_Q01) s;
			} 

			else if(s instanceof ADT_A07){
				ADT_A07 v = (ADT_A07) s;
			} 

			else if(s instanceof ADT_A08){
				ADT_A08 v = (ADT_A08) s;
			} 

			else if(s instanceof ORR_O02_PIDNTE){
				ORR_O02_PIDNTE v = (ORR_O02_PIDNTE) s;
			} 

			else if(s instanceof ADT_A05){
				ADT_A05 v = (ADT_A05) s;
			} 

			else if(s instanceof OM1){
				OM1 v = (OM1) s;
			} 

			else if(s instanceof ADT_A41_PIDPD1MRGPV1){
				ADT_A41_PIDPD1MRGPV1 v = (ADT_A41_PIDPD1MRGPV1) s;
			} 

			else if(s instanceof ADT_A06){
				ADT_A06 v = (ADT_A06) s;
			} 

			else if(s instanceof OM3){
				OM3 v = (OM3) s;
			} 

			else if(s instanceof NK1){
				NK1 v = (NK1) s;
			} 

			else if(s instanceof OM2){
				OM2 v = (OM2) s;
			} 

			else if(s instanceof SIU_S12_AISNTE){
				SIU_S12_AISNTE v = (SIU_S12_AISNTE) s;
			} 

			else if(s instanceof ADT_A09){
				ADT_A09 v = (ADT_A09) s;
			} 

			else if(s instanceof OM5){
				OM5 v = (OM5) s;
			} 

			else if(s instanceof PRR_PC5_OBXNTE){
				PRR_PC5_OBXNTE v = (PRR_PC5_OBXNTE) s;
			} 

			else if(s instanceof OM4){
				OM4 v = (OM4) s;
			} 

			else if(s instanceof OM6){
				OM6 v = (OM6) s;
			} 

			else if(s instanceof QRY_A19){
				QRY_A19 v = (QRY_A19) s;
			} 

			else if(s instanceof PPV_PCA){
				PPV_PCA v = (PPV_PCA) s;
			} 

			else if(s instanceof PRR_PC5_GOLNTEVARROLVAROBXNTE){
				PRR_PC5_GOLNTEVARROLVAROBXNTE v = (PRR_PC5_GOLNTEVARROLVAROBXNTE) s;
			} 

			else if(s instanceof ADT_A03){
				ADT_A03 v = (ADT_A03) s;
			} 

			else if(s instanceof ADT_A04){
				ADT_A04 v = (ADT_A04) s;
			} 

			else if(s instanceof DOC_T12){
				DOC_T12 v = (DOC_T12) s;
			} 

			else if(s instanceof ADT_A01){
				ADT_A01 v = (ADT_A01) s;
			} 

			else if(s instanceof ADT_A02){
				ADT_A02 v = (ADT_A02) s;
			} 

			else if(s instanceof RRO_O02_RXONTERXRRXCNTE){
				RRO_O02_RXONTERXRRXCNTE v = (RRO_O02_RXONTERXRRXCNTE) s;
			} 

			else if(s instanceof MFK_M01){
				MFK_M01 v = (MFK_M01) s;
			} 

			else if(s instanceof RPA_I08_OBXNTE){
				RPA_I08_OBXNTE v = (RPA_I08_OBXNTE) s;
			} 

			else if(s instanceof ORU_R01_PIDPD1NK1NTEPV1PV2){
				ORU_R01_PIDPD1NK1NTEPV1PV2 v = (ORU_R01_PIDPD1NK1NTEPV1PV2) s;
			} 

			else if(s instanceof MFK_M04){
				MFK_M04 v = (MFK_M04) s;
			} 

			else if(s instanceof MFN_M10_MFEOM1OM5OM4){
				MFN_M10_MFEOM1OM5OM4 v = (MFN_M10_MFEOM1OM5OM4) s;
			} 

			else if(s instanceof MFK_M05){
				MFK_M05 v = (MFK_M05) s;
			} 

			else if(s instanceof ORM_O01_RXCNTE){
				ORM_O01_RXCNTE v = (ORM_O01_RXCNTE) s;
			} 

			else if(s instanceof SIU_S12){
				SIU_S12 v = (SIU_S12) s;
			} 

			else if(s instanceof MFK_M06){
				MFK_M06 v = (MFK_M06) s;
			} 

			else if(s instanceof OMS_O01_PIDPD1NTEPV1PV2IN1IN2IN3GT1AL1){
				OMS_O01_PIDPD1NTEPV1PV2IN1IN2IN3GT1AL1 v = (OMS_O01_PIDPD1NTEPV1PV2IN1IN2IN3GT1AL1) s;
			} 

			else if(s instanceof PGL_PC6_ROLVAR){
				PGL_PC6_ROLVAR v = (PGL_PC6_ROLVAR) s;
			} 

			else if(s instanceof NMD_N02_NCKNTE){
				NMD_N02_NCKNTE v = (NMD_N02_NCKNTE) s;
			} 

			else if(s instanceof ADT_A13_IN1IN2IN3){
				ADT_A13_IN1IN2IN3 v = (ADT_A13_IN1IN2IN3) s;
			} 

			else if(s instanceof RQA_I08_OBXNTE){
				RQA_I08_OBXNTE v = (RQA_I08_OBXNTE) s;
			} 

			else if(s instanceof ADT_A18){
				ADT_A18 v = (ADT_A18) s;
			} 

			else if(s instanceof RRA_O02_ORCRXARXR){
				RRA_O02_ORCRXARXR v = (RRA_O02_ORCRXARXR) s;
			} 

			else if(s instanceof PTR_PCF_PTHNTEVARROLVARPRBNTEVARROLVAROBXNTEGOLNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR){
				PTR_PCF_PTHNTEVARROLVARPRBNTEVARROLVAROBXNTEGOLNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR v = (PTR_PCF_PTHNTEVARROLVARPRBNTEVARROLVAROBXNTEGOLNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR) s;
			} 

			else if(s instanceof SIU_S12_PIDPD1PV1PV2OBXDG1){
				SIU_S12_PIDPD1PV1PV2OBXDG1 v = (SIU_S12_PIDPD1PV1PV2OBXDG1) s;
			} 

			else if(s instanceof ADT_A16){
				ADT_A16 v = (ADT_A16) s;
			} 

			else if(s instanceof MFN_M05_MFELOCLCHLRLLDPLCHLCC){
				MFN_M05_MFELOCLCHLRLLDPLCHLCC v = (MFN_M05_MFELOCLCHLRLLDPLCHLCC) s;
			} 

			else if(s instanceof ADT_A17){
				ADT_A17 v = (ADT_A17) s;
			} 

			else if(s instanceof ADR_A19_PR1ROL){
				ADR_A19_PR1ROL v = (ADR_A19_PR1ROL) s;
			} 

			else if(s instanceof SRM_S01_AISAPRNTE){
				SRM_S01_AISAPRNTE v = (SRM_S01_AISAPRNTE) s;
			} 

			else if(s instanceof PPG_PCG){
				PPG_PCG v = (PPG_PCG) s;
			} 

			else if(s instanceof QCK_Q02){
				QCK_Q02 v = (QCK_Q02) s;
			} 

			else if(s instanceof ADT_A10){
				ADT_A10 v = (ADT_A10) s;
			} 

			else if(s instanceof ADT_A11){
				ADT_A11 v = (ADT_A11) s;
			} 

			else if(s instanceof ADT_A14){
				ADT_A14 v = (ADT_A14) s;
			} 

			else if(s instanceof TXA){
				TXA v = (TXA) s;
			} 

			else if(s instanceof ADR_A19_EVNPIDPD1NK1PV1PV2DB1OBXAL1DG1DRGPR1ROLGT1IN1IN2IN3ACCUB1UB2){
				ADR_A19_EVNPIDPD1NK1PV1PV2DB1OBXAL1DG1DRGPR1ROLGT1IN1IN2IN3ACCUB1UB2 v = (ADR_A19_EVNPIDPD1NK1PV1PV2DB1OBXAL1DG1DRGPR1ROLGT1IN1IN2IN3ACCUB1UB2) s;
			} 

			else if(s instanceof ADT_A15){
				ADT_A15 v = (ADT_A15) s;
			} 

			else if(s instanceof ADT_A04_IN1IN2IN3){
				ADT_A04_IN1IN2IN3 v = (ADT_A04_IN1IN2IN3) s;
			} 

			else if(s instanceof ADT_A12){
				ADT_A12 v = (ADT_A12) s;
			} 

			else if(s instanceof RCI_I05_PRDCTD){
				RCI_I05_PRDCTD v = (RCI_I05_PRDCTD) s;
			} 

			else if(s instanceof ORM_O01_OBRRQDRQ1ODSODTRXONTEDG1RXRRXCNTEOBXNTE){
				ORM_O01_OBRRQDRQ1ODSODTRXONTEDG1RXRRXCNTEOBXNTE v = (ORM_O01_OBRRQDRQ1ODSODTRXONTEDG1RXRRXCNTEOBXNTE) s;
			} 

			else if(s instanceof RRA_O02){
				RRA_O02 v = (RRA_O02) s;
			} 

			else if(s instanceof ADT_A13){
				ADT_A13 v = (ADT_A13) s;
			} 

			else if(s instanceof RRI_I12_AUTCTD){
				RRI_I12_AUTCTD v = (RRI_I12_AUTCTD) s;
			} 

			else if(s instanceof ARQ){
				ARQ v = (ARQ) s;
			} 

			else if(s instanceof BTS){
				BTS v = (BTS) s;
			} 

			else if(s instanceof RRA_O02_PIDNTEORCRXARXR){
				RRA_O02_PIDNTEORCRXARXR v = (RRA_O02_PIDNTEORCRXARXR) s;
			} 

			else if(s instanceof QRD){
				QRD v = (QRD) s;
			} 

			else if(s instanceof DFT_P03_FT1PR1ROL){
				DFT_P03_FT1PR1ROL v = (DFT_P03_FT1PR1ROL) s;
			} 

			else if(s instanceof ADT_A06_IN1IN2IN3){
				ADT_A06_IN1IN2IN3 v = (ADT_A06_IN1IN2IN3) s;
			} 

			else if(s instanceof VXQ_V01){
				VXQ_V01 v = (VXQ_V01) s;
			} 

			else if(s instanceof QRF){
				QRF v = (QRF) s;
			} 

			else if(s instanceof PRR_PC5_PRBNTEVARROLVARPTHVAROBXNTEGOLNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR){
				PRR_PC5_PRBNTEVARROLVARPTHVAROBXNTEGOLNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR v = (PRR_PC5_PRBNTEVARROLVARPTHVAROBXNTEGOLNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR) s;
			} 

			else if(s instanceof SRM_S01_AIGAPRNTE){
				SRM_S01_AIGAPRNTE v = (SRM_S01_AIGAPRNTE) s;
			} 

			else if(s instanceof PPG_PCG_PTHNTEVARROLVARGOLNTEVARROLVAROBXNTEPRBNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR){
				PPG_PCG_PTHNTEVARROLVARGOLNTEVARROLVAROBXNTEPRBNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR v = (PPG_PCG_PTHNTEVARROLVARGOLNTEVARROLVAROBXNTEPRBNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR) s;
			} 

			else if(s instanceof RRD_O02_RXDRXRRXC){
				RRD_O02_RXDRXRRXC v = (RRD_O02_RXDRXRRXC) s;
			} 

			else if(s instanceof ERP_R09){
				ERP_R09 v = (ERP_R09) s;
			} 

			else if(s instanceof ORF_R04_ORCOBRNTEOBXNTECTI){
				ORF_R04_ORCOBRNTEOBXNTECTI v = (ORF_R04_ORCOBRNTEOBXNTECTI) s;
			} 

			else if(s instanceof ADT_A40_PIDPD1MRGPV1){
				ADT_A40_PIDPD1MRGPV1 v = (ADT_A40_PIDPD1MRGPV1) s;
			} 

			else if(s instanceof ORM_O01_PV1PV2){
				ORM_O01_PV1PV2 v = (ORM_O01_PV1PV2) s;
			} 

			else if(s instanceof RRO_O02){
				RRO_O02 v = (RRO_O02) s;
			} 

			else if(s instanceof PPP_PCB_GOLNTEVARROLVAROBXNTE){
				PPP_PCB_GOLNTEVARROLVAROBXNTE v = (PPP_PCB_GOLNTEVARROLVAROBXNTE) s;
			} 

			else if(s instanceof PPG_PCG_ROLVAR){
				PPG_PCG_ROLVAR v = (PPG_PCG_ROLVAR) s;
			} 

			else if(s instanceof MFN_M05_LDPLCHLCC){
				MFN_M05_LDPLCHLCC v = (MFN_M05_LDPLCHLCC) s;
			} 

			else if(s instanceof PEX_P07_CSRCSP){
				PEX_P07_CSRCSP v = (PEX_P07_CSRCSP) s;
			} 

			else if(s instanceof RDE_O01_RXONTERXRRXCNTE){
				RDE_O01_RXONTERXRRXCNTE v = (RDE_O01_RXONTERXRRXCNTE) s;
			} 

			else if(s instanceof ADT_A42_PIDPD1MRGPV1){
				ADT_A42_PIDPD1MRGPV1 v = (ADT_A42_PIDPD1MRGPV1) s;
			} 

			else if(s instanceof RAR_RAR_PIDNTE){
				RAR_RAR_PIDNTE v = (RAR_RAR_PIDNTE) s;
			} 

			else if(s instanceof TBR_R08){
				TBR_R08 v = (TBR_R08) s;
			} 

			else if(s instanceof RCL_I06){
				RCL_I06 v = (RCL_I06) s;
			} 

			else if(s instanceof VXX_V02){
				VXX_V02 v = (VXX_V02) s;
			} 

			else if(s instanceof SRR_S01){
				SRR_S01 v = (SRR_S01) s;
			} 

			else if(s instanceof PR1){
				PR1 v = (PR1) s;
			} 

			else if(s instanceof RAR_RAR_QRDQRFPIDNTEORCRXERXRRXCRXARXR){
				RAR_RAR_QRDQRFPIDNTEORCRXERXRRXCRXARXR v = (RAR_RAR_QRDQRFPIDNTEORCRXERXRRXCRXARXR) s;
			} 

			else if(s instanceof ORF_R04_PIDNTE){
				ORF_R04_PIDNTE v = (ORF_R04_PIDNTE) s;
			} 

			else if(s instanceof OMN_O01_RQDRQ1NTEOBXNTE){
				OMN_O01_RQDRQ1NTEOBXNTE v = (OMN_O01_RQDRQ1NTEOBXNTE) s;
			} 

			else if(s instanceof QRY_Q01){
				QRY_Q01 v = (QRY_Q01) s;
			} 

			else if(s instanceof QRY_Q02){
				QRY_Q02 v = (QRY_Q02) s;
			} 

			else if(s instanceof MFN_M08_OM2OM3OM4){
				MFN_M08_OM2OM3OM4 v = (MFN_M08_OM2OM3OM4) s;
			} 

			else if(s instanceof ORS_O02_PIDNTEORCRQDNTE){
				ORS_O02_PIDNTEORCRQDNTE v = (ORS_O02_PIDNTEORCRQDNTE) s;
			} 

			else if(s instanceof SQR_S25_AIPNTE){
				SQR_S25_AIPNTE v = (SQR_S25_AIPNTE) s;
			} 

			else if(s instanceof RDR_RDR_PIDNTE){
				RDR_RDR_PIDNTE v = (RDR_RDR_PIDNTE) s;
			} 

			else if(s instanceof RDR_RDR){
				RDR_RDR v = (RDR_RDR) s;
			} 

			else if(s instanceof PRA){
				PRA v = (PRA) s;
			} 

			else if(s instanceof PRC){
				PRC v = (PRC) s;
			} 

			else if(s instanceof MDM_T07){
				MDM_T07 v = (MDM_T07) s;
			} 

			else if(s instanceof PRB){
				PRB v = (PRB) s;
			} 

			else if(s instanceof MDM_T08){
				MDM_T08 v = (MDM_T08) s;
			} 

			else if(s instanceof MDM_T05){
				MDM_T05 v = (MDM_T05) s;
			} 

			else if(s instanceof PPV_PCA_ROLVAR){
				PPV_PCA_ROLVAR v = (PPV_PCA_ROLVAR) s;
			} 

			else if(s instanceof PRD){
				PRD v = (PRD) s;
			} 

			else if(s instanceof MDM_T06){
				MDM_T06 v = (MDM_T06) s;
			} 

			else if(s instanceof VXU_V04_OBXNTE){
				VXU_V04_OBXNTE v = (VXU_V04_OBXNTE) s;
			} 

			else if(s instanceof ADT_A40){
				ADT_A40 v = (ADT_A40) s;
			} 

			else if(s instanceof MDM_T09){
				MDM_T09 v = (MDM_T09) s;
			} 

			else if(s instanceof CSU_C09_PIDPD1NTEPV1PV2CSRCSPCSSORCOBROBXORCRXARXR){
				CSU_C09_PIDPD1NTEPV1PV2CSRCSPCSSORCOBROBXORCRXARXR v = (CSU_C09_PIDPD1NTEPV1PV2CSRCSPCSSORCOBROBXORCRXARXR) s;
			} 

			else if(s instanceof OMN_O01_PIDPD1NTEPV1PV2IN1IN2IN3GT1AL1){
				OMN_O01_PIDPD1NTEPV1PV2IN1IN2IN3GT1AL1 v = (OMN_O01_PIDPD1NTEPV1PV2IN1IN2IN3GT1AL1) s;
			} 

			else if(s instanceof ORR_O02){
				ORR_O02 v = (ORR_O02) s;
			} 

			else if(s instanceof RAS_O01_OBXNTE){
				RAS_O01_OBXNTE v = (RAS_O01_OBXNTE) s;
			} 

			else if(s instanceof CSU_C09){
				CSU_C09 v = (CSU_C09) s;
			} 

			else if(s instanceof ADT_A49){
				ADT_A49 v = (ADT_A49) s;
			} 

			else if(s instanceof RQI_I03_IN1IN2IN3){
				RQI_I03_IN1IN2IN3 v = (RQI_I03_IN1IN2IN3) s;
			} 

			else if(s instanceof ADT_A43){
				ADT_A43 v = (ADT_A43) s;
			} 

			else if(s instanceof ADT_A44){
				ADT_A44 v = (ADT_A44) s;
			} 

			else if(s instanceof ADT_A41){
				ADT_A41 v = (ADT_A41) s;
			} 

			else if(s instanceof ADT_A42){
				ADT_A42 v = (ADT_A42) s;
			} 

			else if(s instanceof MDM_T03){
				MDM_T03 v = (MDM_T03) s;
			} 

			else if(s instanceof ADT_A47){
				ADT_A47 v = (ADT_A47) s;
			} 

			else if(s instanceof MDM_T04){
				MDM_T04 v = (MDM_T04) s;
			} 

			else if(s instanceof ADT_A48){
				ADT_A48 v = (ADT_A48) s;
			} 

			else if(s instanceof RRG_O02_PIDNTEORCRXGRXRRXC){
				RRG_O02_PIDNTEORCRXGRXRRXC v = (RRG_O02_PIDNTEORCRXGRXRRXC) s;
			} 

			else if(s instanceof MDM_T01){
				MDM_T01 v = (MDM_T01) s;
			} 

			else if(s instanceof ADT_A45){
				ADT_A45 v = (ADT_A45) s;
			} 

			else if(s instanceof MDM_T02){
				MDM_T02 v = (MDM_T02) s;
			} 

			else if(s instanceof ADT_A46){
				ADT_A46 v = (ADT_A46) s;
			} 

			else if(s instanceof RAR_RAR_ORCRXERXRRXCRXARXR){
				RAR_RAR_ORCRXERXRRXCRXARXR v = (RAR_RAR_ORCRXERXRRXCRXARXR) s;
			} 

			else if(s instanceof AUT){
				AUT v = (AUT) s;
			} 

			else if(s instanceof PPG_PCG_OBXNTE){
				PPG_PCG_OBXNTE v = (PPG_PCG_OBXNTE) s;
			} 

			else if(s instanceof PSH){
				PSH v = (PSH) s;
			} 

			else if(s instanceof ADT_A50){
				ADT_A50 v = (ADT_A50) s;
			} 

			else if(s instanceof ADT_A51){
				ADT_A51 v = (ADT_A51) s;
			} 

			else if(s instanceof OMS_O01){
				OMS_O01 v = (OMS_O01) s;
			} 

			else if(s instanceof ORD_O02_PIDNTE){
				ORD_O02_PIDNTE v = (ORD_O02_PIDNTE) s;
			} 

			else if(s instanceof OMD_O01){
				OMD_O01 v = (OMD_O01) s;
			} 

			else if(s instanceof PPP_PCB_OBRRXONTEVAROBXNTEVAR){
				PPP_PCB_OBRRXONTEVAROBXNTEVAR v = (PPP_PCB_OBRRXONTEVAROBXNTEVAR) s;
			} 

			else if(s instanceof BAR_P01_PV1PV2DB1OBXAL1DG1DRGPR1ROLGT1NK1IN1IN2IN3ACCUB1UB2){
				BAR_P01_PV1PV2DB1OBXAL1DG1DRGPR1ROLGT1NK1IN1IN2IN3ACCUB1UB2 v = (BAR_P01_PV1PV2DB1OBXAL1DG1DRGPR1ROLGT1NK1IN1IN2IN3ACCUB1UB2) s;
			} 

			else if(s instanceof SIU_S12_AIGNTE){
				SIU_S12_AIGNTE v = (SIU_S12_AIGNTE) s;
			} 

			else if(s instanceof RAS_O01){
				RAS_O01 v = (RAS_O01) s;
			} 

			else if(s instanceof OMS_O01_IN1IN2IN3){
				OMS_O01_IN1IN2IN3 v = (OMS_O01_IN1IN2IN3) s;
			} 

			else if(s instanceof QRY_R02){
				QRY_R02 v = (QRY_R02) s;
			} 

			else if(s instanceof RXA){
				RXA v = (RXA) s;
			} 

			else if(s instanceof PGL_PC6_ORCOBRRXONTEVAROBXNTEVAR){
				PGL_PC6_ORCOBRRXONTEVAROBXNTEVAR v = (PGL_PC6_ORCOBRRXONTEVAROBXNTEVAR) s;
			} 

			else if(s instanceof RXC){
				RXC v = (RXC) s;
			} 

			else if(s instanceof PTR_PCF_OBXNTEVAR){
				PTR_PCF_OBXNTEVAR v = (PTR_PCF_OBXNTEVAR) s;
			} 

			else if(s instanceof PIN_I07){
				PIN_I07 v = (PIN_I07) s;
			} 

			else if(s instanceof RXE){
				RXE v = (RXE) s;
			} 

			else if(s instanceof RRG_O02_ORCRXGRXRRXC){
				RRG_O02_ORCRXGRXRRXC v = (RRG_O02_ORCRXGRXRRXC) s;
			} 

			else if(s instanceof RXD){
				RXD v = (RXD) s;
			} 

			else if(s instanceof NMD_N02_NSCNTE){
				NMD_N02_NSCNTE v = (NMD_N02_NSCNTE) s;
			} 

			else if(s instanceof RXG){
				RXG v = (RXG) s;
			} 

			else if(s instanceof ORC){
				ORC v = (ORC) s;
			} 

			else if(s instanceof SRR_S01_AISNTE){
				SRR_S01_AISNTE v = (SRR_S01_AISNTE) s;
			} 

			else if(s instanceof PTH){
				PTH v = (PTH) s;
			} 

			else if(s instanceof PPV_PCA_PV1PV2){
				PPV_PCA_PV1PV2 v = (PPV_PCA_PV1PV2) s;
			} 

			else if(s instanceof RXO){
				RXO v = (RXO) s;
			} 

			else if(s instanceof MFR_M01){
				MFR_M01 v = (MFR_M01) s;
			} 

			else if(s instanceof RXR){
				RXR v = (RXR) s;
			} 

			else if(s instanceof ADT_A29){
				ADT_A29 v = (ADT_A29) s;
			} 

			else if(s instanceof NPU){
				NPU v = (NPU) s;
			} 

			else if(s instanceof ADT_A27){
				ADT_A27 v = (ADT_A27) s;
			} 

			else if(s instanceof ADT_A28){
				ADT_A28 v = (ADT_A28) s;
			} 

			else if(s instanceof RQQ_Q09){
				RQQ_Q09 v = (RQQ_Q09) s;
			} 

			else if(s instanceof PPT_PCL_PV1PV2){
				PPT_PCL_PV1PV2 v = (PPT_PCL_PV1PV2) s;
			} 

			else if(s instanceof ADT_A08_PR1ROL){
				ADT_A08_PR1ROL v = (ADT_A08_PR1ROL) s;
			} 

			else if(s instanceof QRY_T12){
				QRY_T12 v = (QRY_T12) s;
			} 

			else if(s instanceof ADT_A21){
				ADT_A21 v = (ADT_A21) s;
			} 

			else if(s instanceof ADT_AXX_PIDPD1MRGPV1){
				ADT_AXX_PIDPD1MRGPV1 v = (ADT_AXX_PIDPD1MRGPV1) s;
			} 

			else if(s instanceof ADT_A22){
				ADT_A22 v = (ADT_A22) s;
			} 

			else if(s instanceof SQR_S25_AIGNTE){
				SQR_S25_AIGNTE v = (SQR_S25_AIGNTE) s;
			} 

			else if(s instanceof ADT_A20){
				ADT_A20 v = (ADT_A20) s;
			} 

			else if(s instanceof ADT_A25){
				ADT_A25 v = (ADT_A25) s;
			} 

			else if(s instanceof ADT_A26){
				ADT_A26 v = (ADT_A26) s;
			} 

			else if(s instanceof PIN_I07_IN1IN2IN3){
				PIN_I07_IN1IN2IN3 v = (PIN_I07_IN1IN2IN3) s;
			} 

			else if(s instanceof ADT_A23){
				ADT_A23 v = (ADT_A23) s;
			} 

			else if(s instanceof ORS_O02_ORCRQDNTE){
				ORS_O02_ORCRQDNTE v = (ORS_O02_ORCRQDNTE) s;
			} 

			else if(s instanceof RRD_O02_PIDNTE){
				RRD_O02_PIDNTE v = (RRD_O02_PIDNTE) s;
			} 

			else if(s instanceof ADT_A24){
				ADT_A24 v = (ADT_A24) s;
			} 

			else if(s instanceof OMD_O01_ORCODTNTE){
				OMD_O01_ORCODTNTE v = (OMD_O01_ORCODTNTE) s;
			} 

			else if(s instanceof PGL_PC6_PV1PV2){
				PGL_PC6_PV1PV2 v = (PGL_PC6_PV1PV2) s;
			} 

			else if(s instanceof ORU_R01_PV1PV2){
				ORU_R01_PV1PV2 v = (ORU_R01_PV1PV2) s;
			} 

			else if(s instanceof FAC){
				FAC v = (FAC) s;
			} 

			else if(s instanceof OMN_O01){
				OMN_O01 v = (OMN_O01) s;
			} 

			else if(s instanceof PV1){
				PV1 v = (PV1) s;
			} 

			else if(s instanceof RGV_O01_RXGRXRRXCOBXNTE){
				RGV_O01_RXGRXRRXCOBXNTE v = (RGV_O01_RXGRXRRXCOBXNTE) s;
			} 

			else if(s instanceof SQM_S25_AISAPR){
				SQM_S25_AISAPR v = (SQM_S25_AISAPR) s;
			} 

			else if(s instanceof RDO_O01_RXONTERXRRXCNTEOBXNTE){
				RDO_O01_RXONTERXRRXCNTEOBXNTE v = (RDO_O01_RXONTERXRRXCNTEOBXNTE) s;
			} 

			else if(s instanceof PV2){
				PV2 v = (PV2) s;
			} 

			else if(s instanceof BAR_P06_PIDPV1){
				BAR_P06_PIDPV1 v = (BAR_P06_PIDPV1) s;
			} 

			else if(s instanceof PPT_PCL_ROLVAR){
				PPT_PCL_ROLVAR v = (PPT_PCL_ROLVAR) s;
			} 

			else if(s instanceof BAR_P02){
				BAR_P02 v = (BAR_P02) s;
			} 

			else if(s instanceof ADT_A38){
				ADT_A38 v = (ADT_A38) s;
			} 

			else if(s instanceof BAR_P01){
				BAR_P01 v = (BAR_P01) s;
			} 

			else if(s instanceof ADT_A39){
				ADT_A39 v = (ADT_A39) s;
			} 

			else if(s instanceof ORM_O01_ORCOBRRQDRQ1ODSODTRXONTEDG1RXRRXCNTEOBXNTECTIBLG){
				ORM_O01_ORCOBRRQDRQ1ODSODTRXONTEDG1RXRRXCNTEOBXNTECTIBLG v = (ORM_O01_ORCOBRRQDRQ1ODSODTRXONTEDG1RXRRXCNTEOBXNTECTIBLG) s;
			} 

			else if(s instanceof ORD_O02){
				ORD_O02 v = (ORD_O02) s;
			} 

			else if(s instanceof MDM_T10){
				MDM_T10 v = (MDM_T10) s;
			} 

			else if(s instanceof ADT_A32){
				ADT_A32 v = (ADT_A32) s;
			} 

			else if(s instanceof RCI_I05_OBRNTEOBXNTE){
				RCI_I05_OBRNTEOBXNTE v = (RCI_I05_OBRNTEOBXNTE) s;
			} 

			else if(s instanceof MDM_T11){
				MDM_T11 v = (MDM_T11) s;
			} 

			else if(s instanceof ADT_A33){
				ADT_A33 v = (ADT_A33) s;
			} 

			else if(s instanceof ADT_A30){
				ADT_A30 v = (ADT_A30) s;
			} 

			else if(s instanceof SRR_S01_RGSAISNTEAIGNTEAILNTEAIPNTE){
				SRR_S01_RGSAISNTEAIGNTEAILNTEAIPNTE v = (SRR_S01_RGSAISNTEAIGNTEAILNTEAIPNTE) s;
			} 

			else if(s instanceof MFN_M11_MFEOM1OM6OM2){
				MFN_M11_MFEOM1OM6OM2 v = (MFN_M11_MFEOM1OM6OM2) s;
			} 

			else if(s instanceof ADT_A31){
				ADT_A31 v = (ADT_A31) s;
			} 

			else if(s instanceof PRR_PC5){
				PRR_PC5 v = (PRR_PC5) s;
			} 

			else if(s instanceof BAR_P06){
				BAR_P06 v = (BAR_P06) s;
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

			else if(s instanceof BAR_P05){
				BAR_P05 v = (BAR_P05) s;
			} 

			else if(s instanceof ADT_A35){
				ADT_A35 v = (ADT_A35) s;
			} 

			else if(s instanceof RQI_I02_GT1IN1IN2IN3){
				RQI_I02_GT1IN1IN2IN3 v = (RQI_I02_GT1IN1IN2IN3) s;
			} 

			else if(s instanceof SRM_S01_AIPAPRNTE){
				SRM_S01_AIPAPRNTE v = (SRM_S01_AIPAPRNTE) s;
			} 

			else if(s instanceof OMN_O01_ORCRQDRQ1NTEOBXNTEBLG){
				OMN_O01_ORCRQDRQ1NTEOBXNTEBLG v = (OMN_O01_ORCRQDRQ1NTEOBXNTEBLG) s;
			} 

			else if(s instanceof VAR){
				VAR v = (VAR) s;
			} 

			else if(s instanceof PGL_PC6_OBXNTE){
				PGL_PC6_OBXNTE v = (PGL_PC6_OBXNTE) s;
			} 

			else if(s instanceof RRE_O02_PIDNTEORCRXERXRRXC){
				RRE_O02_PIDNTEORCRXERXRRXC v = (RRE_O02_PIDNTEORCRXERXRRXC) s;
			} 

			else if(s instanceof RDS_O01_RXONTERXRRXCNTE){
				RDS_O01_RXONTERXRRXCNTE v = (RDS_O01_RXONTERXRRXCNTE) s;
			} 

			else if(s instanceof PPR_PC1_ROLVAR){
				PPR_PC1_ROLVAR v = (PPR_PC1_ROLVAR) s;
			} 

			else if(s instanceof RDR_RDR_ORCRXERXRRXCRXDRXRRXC){
				RDR_RDR_ORCRXERXRRXCRXDRXRRXC v = (RDR_RDR_ORCRXERXRRXCRXDRXRRXC) s;
			} 

			else if(s instanceof EQQ_Q04){
				EQQ_Q04 v = (EQQ_Q04) s;
			} 

			else if(s instanceof DOC_T12_EVNPIDPV1TXAOBX){
				DOC_T12_EVNPIDPV1TXAOBX v = (DOC_T12_EVNPIDPV1TXAOBX) s;
			} 

			else if(s instanceof ORS_O02){
				ORS_O02 v = (ORS_O02) s;
			} 

			else if(s instanceof ADT_A31_PR1ROL){
				ADT_A31_PR1ROL v = (ADT_A31_PR1ROL) s;
			} 

			else if(s instanceof CRM_C01){
				CRM_C01 v = (CRM_C01) s;
			} 

			else if(s instanceof PEX_P07_PCRRXERXRRXARXRPRBOBXNTENK1RXERXRRXARXRPRBOBXCSRCSP){
				PEX_P07_PCRRXERXRRXARXRPRBOBXNTENK1RXERXRRXARXRPRBOBXCSRCSP v = (PEX_P07_PCRRXERXRRXARXRPRBOBXNTENK1RXERXRRXARXRPRBOBXCSRCSP) s;
			} 

			else if(s instanceof PPR_PC1_OBXNTEVAR){
				PPR_PC1_OBXNTEVAR v = (PPR_PC1_OBXNTEVAR) s;
			} 

			else if(s instanceof PPV_PCA_PRBNTEVARROLVAROBXNTE){
				PPV_PCA_PRBNTEVARROLVAROBXNTE v = (PPV_PCA_PRBNTEVARROLVAROBXNTE) s;
			} 

			else if(s instanceof NSC){
				NSC v = (NSC) s;
			} 

			else if(s instanceof PPR_PC1_PTHVAR){
				PPR_PC1_PTHVAR v = (PPR_PC1_PTHVAR) s;
			} 

			else if(s instanceof LOC){
				LOC v = (LOC) s;
			} 

			else if(s instanceof RRO_O02_PIDNTEORCRXONTERXRRXCNTE){
				RRO_O02_PIDNTEORCRXONTERXRRXCNTE v = (RRO_O02_PIDNTEORCRXONTERXRRXCNTE) s;
			} 

			else if(s instanceof PIN_I07_PRDCTD){
				PIN_I07_PRDCTD v = (PIN_I07_PRDCTD) s;
			} 

			else if(s instanceof ROR_R0R_ORCRXORXRRXC){
				ROR_R0R_ORCRXORXRRXC v = (ROR_R0R_ORCRXORXRRXC) s;
			} 

			else if(s instanceof PRR_PC5_PV1PV2){
				PRR_PC5_PV1PV2 v = (PRR_PC5_PV1PV2) s;
			} 

			else if(s instanceof SPQ_Q08){
				SPQ_Q08 v = (SPQ_Q08) s;
			} 

			else if(s instanceof RDO_O01_IN1IN2IN3){
				RDO_O01_IN1IN2IN3 v = (RDO_O01_IN1IN2IN3) s;
			} 

			else if(s instanceof NST){
				NST v = (NST) s;
			} 

			else if(s instanceof RDS_O01){
				RDS_O01 v = (RDS_O01) s;
			} 

			else if(s instanceof CSU_C09_ORCRXARXR){
				CSU_C09_ORCRXARXR v = (CSU_C09_ORCRXARXR) s;
			} 

			else if(s instanceof PPT_PCL_PTHNTEVARROLVARGOLNTEVARROLVAROBXNTEPRBNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR){
				PPT_PCL_PTHNTEVARROLVARGOLNTEVARROLVAROBXNTEPRBNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR v = (PPT_PCL_PTHNTEVARROLVARGOLNTEVARROLVAROBXNTEPRBNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR) s;
			} 

			else if(s instanceof MFN_M10_OM5OM4){
				MFN_M10_OM5OM4 v = (MFN_M10_OM5OM4) s;
			} 

			else if(s instanceof RGR_RGR_QRDQRFPIDNTEORCRXERXRRXCRXGRXRRXC){
				RGR_RGR_QRDQRFPIDNTEORCRXERXRRXCRXGRXRRXC v = (RGR_RGR_QRDQRFPIDNTEORCRXERXRRXCRXGRXRRXC) s;
			} 

			else if(s instanceof NTE){
				NTE v = (NTE) s;
			} 

			else if(s instanceof RQI_I03_GT1IN1IN2IN3){
				RQI_I03_GT1IN1IN2IN3 v = (RQI_I03_GT1IN1IN2IN3) s;
			} 

			else if(s instanceof ORF_R04_OBXNTE){
				ORF_R04_OBXNTE v = (ORF_R04_OBXNTE) s;
			} 

			else if(s instanceof MRG){
				MRG v = (MRG) s;
			} 

			else if(s instanceof ZL7){
				ZL7 v = (ZL7) s;
			} 

			else if(s instanceof UB2){
				UB2 v = (UB2) s;
			} 

			else if(s instanceof PPR_PC1_OBRRXONTEVAROBXNTEVAR){
				PPR_PC1_OBRRXONTEVAROBXNTEVAR v = (PPR_PC1_OBRRXONTEVAROBXNTEVAR) s;
			} 

			else if(s instanceof ORN_O02_ORCRQDRQ1NTE){
				ORN_O02_ORCRQDRQ1NTE v = (ORN_O02_ORCRQDRQ1NTE) s;
			} 

			else if(s instanceof UB1){
				UB1 v = (UB1) s;
			} 

			else if(s instanceof RQI_I01_GT1IN1IN2IN3){
				RQI_I01_GT1IN1IN2IN3 v = (RQI_I01_GT1IN1IN2IN3) s;
			} 

			else if(s instanceof RRD_O02_ORCRXDRXRRXC){
				RRD_O02_ORCRXDRXRRXC v = (RRD_O02_ORCRXDRXRRXC) s;
			} 

			else if(s instanceof NMR_N01_NCKNTENSTNTENSCNTE){
				NMR_N01_NCKNTENSTNTENSCNTE v = (NMR_N01_NCKNTENSTNTENSCNTE) s;
			} 

			else if(s instanceof PPP_PCB){
				PPP_PCB v = (PPP_PCB) s;
			} 

			else if(s instanceof ADT_A05_PR1ROL){
				ADT_A05_PR1ROL v = (ADT_A05_PR1ROL) s;
			} 

			else if(s instanceof SQM_S25_RGSAISAPRAIGAPRAIPAPRAILAPR){
				SQM_S25_RGSAISAPRAIGAPRAIPAPRAILAPR v = (SQM_S25_RGSAISAPRAIGAPRAIPAPRAILAPR) s;
			} 

			else if(s instanceof SRR_S01_AIGNTE){
				SRR_S01_AIGNTE v = (SRR_S01_AIGNTE) s;
			} 

			else if(s instanceof MFN_M02_MFESTFPRA){
				MFN_M02_MFESTFPRA v = (MFN_M02_MFESTFPRA) s;
			} 

			else if(s instanceof RRA_O02_RXARXR){
				RRA_O02_RXARXR v = (RRA_O02_RXARXR) s;
			} 

			else if(s instanceof REF_I12_AUTCTD){
				REF_I12_AUTCTD v = (REF_I12_AUTCTD) s;
			} 

			else if(s instanceof PTR_PCF_GOLNTEVARROLVAROBXNTE){
				PTR_PCF_GOLNTEVARROLVAROBXNTE v = (PTR_PCF_GOLNTEVARROLVAROBXNTE) s;
			} 

			else if(s instanceof MSA){
				MSA v = (MSA) s;
			} 

			else if(s instanceof RAS_O01_RXONTERXRRXCNTE){
				RAS_O01_RXONTERXRRXCNTE v = (RAS_O01_RXONTERXRRXCNTE) s;
			} 

			else if(s instanceof PEX_P07_RXERXR){
				PEX_P07_RXERXR v = (PEX_P07_RXERXR) s;
			} 

			else if(s instanceof RQA_I08_GT1IN1IN2IN3){
				RQA_I08_GT1IN1IN2IN3 v = (RQA_I08_GT1IN1IN2IN3) s;
			} 

			else if(s instanceof VXR_V03_PV1PV2){
				VXR_V03_PV1PV2 v = (VXR_V03_PV1PV2) s;
			} 

			else if(s instanceof MSH){
				MSH v = (MSH) s;
			} 

			else if(s instanceof NMD_N02_NSTNTE){
				NMD_N02_NSTNTE v = (NMD_N02_NSTNTE) s;
			} 

			else if(s instanceof NMQ_N01_NCKNSTNSC){
				NMQ_N01_NCKNSTNSC v = (NMQ_N01_NCKNSTNSC) s;
			} 

			else if(s instanceof PPR_PC1_PRBNTEVARROLVARPTHVAROBXNTEGOLNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR){
				PPR_PC1_PRBNTEVARROLVARPTHVAROBXNTEGOLNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR v = (PPR_PC1_PRBNTEVARROLVARPTHVAROBXNTEGOLNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR) s;
			} 

			else if(s instanceof RRI_I12_PR1AUTCTD){
				RRI_I12_PR1AUTCTD v = (RRI_I12_PR1AUTCTD) s;
			} 

			else if(s instanceof SRM_S01_PIDPV1PV2OBXDG1){
				SRM_S01_PIDPV1PV2OBXDG1 v = (SRM_S01_PIDPV1PV2OBXDG1) s;
			} 

			else if(s instanceof RRE_O02_ORCRXERXRRXC){
				RRE_O02_ORCRXERXRRXC v = (RRE_O02_ORCRXERXRRXC) s;
			} 

			else if(s instanceof ORU_R01_ORCOBRNTEOBXNTECTI){
				ORU_R01_ORCOBRNTEOBXNTECTI v = (ORU_R01_ORCOBRNTEOBXNTECTI) s;
			} 

			else if(s instanceof DB1){
				DB1 v = (DB1) s;
			} 

			else if(s instanceof PGL_PC6_OBXNTEVAR){
				PGL_PC6_OBXNTEVAR v = (PGL_PC6_OBXNTEVAR) s;
			} 

			else if(s instanceof PGL_PC6_OBRRXONTEVAROBXNTEVAR){
				PGL_PC6_OBRRXONTEVAROBXNTEVAR v = (PGL_PC6_OBRRXONTEVAROBXNTEVAR) s;
			} 

			else if(s instanceof PPV_PCA_PTHVAR){
				PPV_PCA_PTHVAR v = (PPV_PCA_PTHVAR) s;
			} 

			else if(s instanceof VXU_V04_PV1PV2){
				VXU_V04_PV1PV2 v = (VXU_V04_PV1PV2) s;
			} 

			else if(s instanceof VQQ_Q07){
				VQQ_Q07 v = (VQQ_Q07) s;
			} 

			else if(s instanceof ADT_A31_IN1IN2IN3){
				ADT_A31_IN1IN2IN3 v = (ADT_A31_IN1IN2IN3) s;
			} 

			else if(s instanceof PPG_PCG_PV1PV2){
				PPG_PCG_PV1PV2 v = (PPG_PCG_PV1PV2) s;
			} 

			else if(s instanceof SQM_S25_AILAPR){
				SQM_S25_AILAPR v = (SQM_S25_AILAPR) s;
			} 

			else if(s instanceof RQA_I08){
				RQA_I08 v = (RQA_I08) s;
			} 

			else if(s instanceof ADT_AXX_MRGPV1){
				ADT_AXX_MRGPV1 v = (ADT_AXX_MRGPV1) s;
			} 

			else if(s instanceof RDR_RDR_RXERXRRXC){
				RDR_RDR_RXERXRRXC v = (RDR_RDR_RXERXRRXC) s;
			} 

			else if(s instanceof LRL){
				LRL v = (LRL) s;
			} 

			else if(s instanceof ORU_R01_PIDPD1NK1NTEPV1PV2ORCOBRNTEOBXNTECTI){
				ORU_R01_PIDPD1NK1NTEPV1PV2ORCOBRNTEOBXNTECTI v = (ORU_R01_PIDPD1NK1NTEPV1PV2ORCOBRNTEOBXNTECTI) s;
			} 

			else if(s instanceof RRE_O02_PIDNTE){
				RRE_O02_PIDNTE v = (RRE_O02_PIDNTE) s;
			} 

			else if(s instanceof PPV_PCA_OBXNTEVAR){
				PPV_PCA_OBXNTEVAR v = (PPV_PCA_OBXNTEVAR) s;
			} 

			else if(s instanceof QRY_PCK){
				QRY_PCK v = (QRY_PCK) s;
			} 

			else if(s instanceof MFN_M09_MFEOM1OM3OM4){
				MFN_M09_MFEOM1OM3OM4 v = (MFN_M09_MFEOM1OM3OM4) s;
			} 

			else if(s instanceof ADT_A01_IN1IN2IN3){
				ADT_A01_IN1IN2IN3 v = (ADT_A01_IN1IN2IN3) s;
			} 

			else if(s instanceof QRY_PCE){
				QRY_PCE v = (QRY_PCE) s;
			} 

			else if(s instanceof RDS_O01_OBXNTE){
				RDS_O01_OBXNTE v = (RDS_O01_OBXNTE) s;
			} 

			else if(s instanceof REF_I12_IN1IN2IN3){
				REF_I12_IN1IN2IN3 v = (REF_I12_IN1IN2IN3) s;
			} 

			else if(s instanceof BAR_P05_PV1PV2DB1OBXAL1DG1DRGPR1ROLGT1NK1IN1IN2IN3ACCUB1UB2){
				BAR_P05_PV1PV2DB1OBXAL1DG1DRGPR1ROLGT1NK1IN1IN2IN3ACCUB1UB2 v = (BAR_P05_PV1PV2DB1OBXAL1DG1DRGPR1ROLGT1NK1IN1IN2IN3ACCUB1UB2) s;
			} 

			else if(s instanceof PEX_P07_NK1RXERXRRXARXRPRBOBX){
				PEX_P07_NK1RXERXRRXARXRPRBOBX v = (PEX_P07_NK1RXERXRRXARXRPRBOBX) s;
			} 

			else if(s instanceof SQR_S25_RGSAISNTEAIGNTEAIPNTEAILNTE){
				SQR_S25_RGSAISNTEAIGNTEAIPNTEAILNTE v = (SQR_S25_RGSAISNTEAIGNTEAIPNTEAILNTE) s;
			} 

			else if(s instanceof PIN_I07_GT1IN1IN2IN3){
				PIN_I07_GT1IN1IN2IN3 v = (PIN_I07_GT1IN1IN2IN3) s;
			} 

			else if(s instanceof RDS_O01_NTERXRRXCNTE){
				RDS_O01_NTERXRRXCNTE v = (RDS_O01_NTERXRRXCNTE) s;
			} 

			else if(s instanceof PPV_PCA_OBXNTE){
				PPV_PCA_OBXNTE v = (PPV_PCA_OBXNTE) s;
			} 

			else if(s instanceof SUR_P09){
				SUR_P09 v = (SUR_P09) s;
			} 

			else if(s instanceof RPI_I04_GT1IN1IN2IN3){
				RPI_I04_GT1IN1IN2IN3 v = (RPI_I04_GT1IN1IN2IN3) s;
			} 

			else if(s instanceof IN2){
				IN2 v = (IN2) s;
			} 

			else if(s instanceof IN1){
				IN1 v = (IN1) s;
			} 

			else if(s instanceof PEX_P07){
				PEX_P07 v = (PEX_P07) s;
			} 

			else if(s instanceof IN3){
				IN3 v = (IN3) s;
			} 

			else if(s instanceof RDO_O01_ORCRXONTERXRRXCNTEOBXNTEBLG){
				RDO_O01_ORCRXONTERXRRXCNTEOBXNTEBLG v = (RDO_O01_ORCRXONTERXRRXCNTEOBXNTEBLG) s;
			} 

			else if(s instanceof SRM_S01_AILAPRNTE){
				SRM_S01_AILAPRNTE v = (SRM_S01_AILAPRNTE) s;
			} 

			else if(s instanceof PEX_P07_PV1PV2){
				PEX_P07_PV1PV2 v = (PEX_P07_PV1PV2) s;
			} 

			else if(s instanceof RDO_O01_OBXNTE){
				RDO_O01_OBXNTE v = (RDO_O01_OBXNTE) s;
			} 

			else if(s instanceof RCI_I05){
				RCI_I05 v = (RCI_I05) s;
			} 

			else if(s instanceof ADT_A04_PR1ROL){
				ADT_A04_PR1ROL v = (ADT_A04_PR1ROL) s;
			} 

			else if(s instanceof RRO_O02_ORCRXONTERXRRXCNTE){
				RRO_O02_ORCRXONTERXRRXCNTE v = (RRO_O02_ORCRXONTERXRRXCNTE) s;
			} 

			else if(s instanceof MFN_M03_MFEOM1Hxx){
				MFN_M03_MFEOM1Hxx v = (MFN_M03_MFEOM1Hxx) s;
			} 

			else if(s instanceof RDE_O01_ORCRXONTERXRRXCNTERXERXRRXCOBXNTECTI){
				RDE_O01_ORCRXONTERXRRXCNTERXERXRRXCOBXNTECTI v = (RDE_O01_ORCRXONTERXRRXCNTERXERXRRXCOBXNTECTI) s;
			} 

			else if(s instanceof RER_RER_QRDQRFPIDNTEORCRXERXRRXC){
				RER_RER_QRDQRFPIDNTEORCRXERXRRXC v = (RER_RER_QRDQRFPIDNTEORCRXERXRRXC) s;
			} 

			else if(s instanceof FHS){
				FHS v = (FHS) s;
			} 

			else if(s instanceof PPR_PC1_ORCOBRRXONTEVAROBXNTEVAR){
				PPR_PC1_ORCOBRRXONTEVAROBXNTEVAR v = (PPR_PC1_ORCOBRRXONTEVAROBXNTEVAR) s;
			} 

			else if(s instanceof PRR_PC5_PIDPV1PV2PRBNTEVARROLVARPTHVAROBXNTEGOLNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR){
				PRR_PC5_PIDPV1PV2PRBNTEVARROLVARPTHVAROBXNTEGOLNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR v = (PRR_PC5_PIDPV1PV2PRBNTEVARROLVARPTHVAROBXNTEGOLNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR) s;
			} 

			else if(s instanceof PPG_PCG_OBXNTEVAR){
				PPG_PCG_OBXNTEVAR v = (PPG_PCG_OBXNTEVAR) s;
			} 

			else if(s instanceof MFN_M06_MFECM0CM1CM2){
				MFN_M06_MFECM0CM1CM2 v = (MFN_M06_MFECM0CM1CM2) s;
			} 

			else if(s instanceof OSR_Q06_ORCOBRRXORQDRQ1ODSODTNTECTI){
				OSR_Q06_ORCOBRRXORQDRQ1ODSODTNTECTI v = (OSR_Q06_ORCOBRRXORQDRQ1ODSODTNTECTI) s;
			} 

			else if(s instanceof ORM_O01_PIDPD1NTEPV1PV2IN1IN2IN3GT1AL1){
				ORM_O01_PIDPD1NTEPV1PV2IN1IN2IN3GT1AL1 v = (ORM_O01_PIDPD1NTEPV1PV2IN1IN2IN3GT1AL1) s;
			} 

			else if(s instanceof PTR_PCF_OBXNTE){
				PTR_PCF_OBXNTE v = (PTR_PCF_OBXNTE) s;
			} 

			else if(s instanceof ADT_A45_MRGPV1){
				ADT_A45_MRGPV1 v = (ADT_A45_MRGPV1) s;
			} 

			else if(s instanceof QRY_PC4){
				QRY_PC4 v = (QRY_PC4) s;
			} 

			else if(s instanceof PGL_PC6_PRBNTEVARROLVAROBXNTE){
				PGL_PC6_PRBNTEVARROLVAROBXNTE v = (PGL_PC6_PRBNTEVARROLVAROBXNTE) s;
			} 

			else if(s instanceof MFN_M08_MFEOM1OM2OM3OM4){
				MFN_M08_MFEOM1OM2OM3OM4 v = (MFN_M08_MFEOM1OM2OM3OM4) s;
			} 

			else if(s instanceof QRY_PC9){
				QRY_PC9 v = (QRY_PC9) s;
			} 

			else if(s instanceof SRR_S01_AIPNTE){
				SRR_S01_AIPNTE v = (SRR_S01_AIPNTE) s;
			} 

			else if(s instanceof PPG_PCG_GOLNTEVARROLVAROBXNTEPRBNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR){
				PPG_PCG_GOLNTEVARROLVAROBXNTEPRBNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR v = (PPG_PCG_GOLNTEVARROLVAROBXNTEPRBNTEVARROLVAROBXNTEORCOBRRXONTEVAROBXNTEVAR) s;
			} 

			else if(s instanceof RDE_O01_PV1PV2){
				RDE_O01_PV1PV2 v = (RDE_O01_PV1PV2) s;
			} 

			else if(s instanceof ORN_O02_PIDNTEORCRQDRQ1NTE){
				ORN_O02_PIDNTEORCRQDRQ1NTE v = (ORN_O02_PIDNTEORCRQDRQ1NTE) s;
			} 

			else if(s instanceof PGL_PC6){
				PGL_PC6 v = (PGL_PC6) s;
			} 

			else if(s instanceof RRA_O02_PIDNTE){
				RRA_O02_PIDNTE v = (RRA_O02_PIDNTE) s;
			} 

			else if(s instanceof RAS_O01_PV1PV2){
				RAS_O01_PV1PV2 v = (RAS_O01_PV1PV2) s;
			} 

			else if(s instanceof PEX_P07_PEOPCRRXERXRRXARXRPRBOBXNTENK1RXERXRRXARXRPRBOBXCSRCSP){
				PEX_P07_PEOPCRRXERXRRXARXRPRBOBXNTENK1RXERXRRXARXRPRBOBXCSRCSP v = (PEX_P07_PEOPCRRXERXRRXARXRPRBOBXNTENK1RXERXRRXARXRPRBOBXCSRCSP) s;
			} 

			else if(s instanceof RGV_O01_RXCNTE){
				RGV_O01_RXCNTE v = (RGV_O01_RXCNTE) s;
			} 

			else if(s instanceof RRD_O02_PIDNTEORCRXDRXRRXC){
				RRD_O02_PIDNTEORCRXDRXRRXC v = (RRD_O02_PIDNTEORCRXDRXRRXC) s;
			} 

			else if(s instanceof ADT_A28_IN1IN2IN3){
				ADT_A28_IN1IN2IN3 v = (ADT_A28_IN1IN2IN3) s;
			} 

			else if(s instanceof PPP_PCB_ORCOBRRXONTEVAROBXNTEVAR){
				PPP_PCB_ORCOBRRXONTEVAROBXNTEVAR v = (PPP_PCB_ORCOBRRXONTEVAROBXNTEVAR) s;
			} 

			else if(s instanceof SCH){
				SCH v = (SCH) s;
			} 

			else if(s instanceof BAR_P05_PR1ROL){
				BAR_P05_PR1ROL v = (BAR_P05_PR1ROL) s;
			} 


		}
		
	}

}
