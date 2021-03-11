package io.boodskap.hl7.v23;

import org.json.JSONObject;

import ca.uhn.hl7v2.HapiContext;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.Structure;
import ca.uhn.hl7v2.model.v23.group.*;
import ca.uhn.hl7v2.model.v23.message.*;
import ca.uhn.hl7v2.model.v23.segment.*;
import ca.uhn.hl7v2.parser.Parser;
import io.boodskap.hl7.MessageDecoder;


public class Decoder implements MessageDecoder {

	@SuppressWarnings("unused")
	@Override
	public void decode(HapiContext context, Parser parser, Message msg, JSONObject json, String data) throws Exception {

		for (String type : msg.getNames()) {

			Structure s = msg.get(type);


			if(s instanceof REF_I14_AUTHORIZATION){
				REF_I14_AUTHORIZATION v = (REF_I14_AUTHORIZATION) s;
			} 

			else if(s instanceof RPR_I03_PROVIDER){
				RPR_I03_PROVIDER v = (RPR_I03_PROVIDER) s;
			} 

			else if(s instanceof SIU_S19_LOCATION_RESOURCE){
				SIU_S19_LOCATION_RESOURCE v = (SIU_S19_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof SRR_S04_SERVICE){
				SRR_S04_SERVICE v = (SRR_S04_SERVICE) s;
			} 

			else if(s instanceof PPT_PCL_PATHWAY_ROLE){
				PPT_PCL_PATHWAY_ROLE v = (PPT_PCL_PATHWAY_ROLE) s;
			} 

			else if(s instanceof SRM_S04_SERVICE){
				SRM_S04_SERVICE v = (SRM_S04_SERVICE) s;
			} 

			else if(s instanceof DG1){
				DG1 v = (DG1) s;
			} 

			else if(s instanceof RRI_I14_VISIT){
				RRI_I14_VISIT v = (RRI_I14_VISIT) s;
			} 

			else if(s instanceof SRR_S02_GENERAL_RESOURCE){
				SRR_S02_GENERAL_RESOURCE v = (SRR_S02_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof PEX_P07_STUDY){
				PEX_P07_STUDY v = (PEX_P07_STUDY) s;
			} 

			else if(s instanceof ADT_AXX_INSURANCE){
				ADT_AXX_INSURANCE v = (ADT_AXX_INSURANCE) s;
			} 

			else if(s instanceof RQI_I01){
				RQI_I01 v = (RQI_I01) s;
			} 

			else if(s instanceof SIU_S15_PERSONNEL_RESOURCE){
				SIU_S15_PERSONNEL_RESOURCE v = (SIU_S15_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof RQI_I02){
				RQI_I02 v = (RQI_I02) s;
			} 

			else if(s instanceof RQI_I03){
				RQI_I03 v = (RQI_I03) s;
			} 

			else if(s instanceof SQR_S25_LOCATION_RESOURCE){
				SQR_S25_LOCATION_RESOURCE v = (SQR_S25_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof PPV_PCA_ORDER_OBSERVATION){
				PPV_PCA_ORDER_OBSERVATION v = (PPV_PCA_ORDER_OBSERVATION) s;
			} 

			else if(s instanceof PPP_PCD_PATIENT_VISIT){
				PPP_PCD_PATIENT_VISIT v = (PPP_PCD_PATIENT_VISIT) s;
			} 

			else if(s instanceof SIU_S22_PATIENT){
				SIU_S22_PATIENT v = (SIU_S22_PATIENT) s;
			} 

			else if(s instanceof PPG_PCH_ORDER_DETAIL){
				PPG_PCH_ORDER_DETAIL v = (PPG_PCH_ORDER_DETAIL) s;
			} 

			else if(s instanceof BAR_P02_PATIENT){
				BAR_P02_PATIENT v = (BAR_P02_PATIENT) s;
			} 

			else if(s instanceof BAR_P01_INSURANCE){
				BAR_P01_INSURANCE v = (BAR_P01_INSURANCE) s;
			} 

			else if(s instanceof PPG_PCG_ORDER_DETAIL){
				PPG_PCG_ORDER_DETAIL v = (PPG_PCG_ORDER_DETAIL) s;
			} 

			else if(s instanceof RRI_I12_PROCEDURE){
				RRI_I12_PROCEDURE v = (RRI_I12_PROCEDURE) s;
			} 

			else if(s instanceof RDR_RDR_ENCODING){
				RDR_RDR_ENCODING v = (RDR_RDR_ENCODING) s;
			} 

			else if(s instanceof REF_I12_VISIT){
				REF_I12_VISIT v = (REF_I12_VISIT) s;
			} 

			else if(s instanceof QAK){
				QAK v = (QAK) s;
			} 

			else if(s instanceof PPT_PCL_PROBLEM){
				PPT_PCL_PROBLEM v = (PPT_PCL_PROBLEM) s;
			} 

			else if(s instanceof PTR_PCF){
				PTR_PCF v = (PTR_PCF) s;
			} 

			else if(s instanceof OSR_Q06_RESPONSE){
				OSR_Q06_RESPONSE v = (OSR_Q06_RESPONSE) s;
			} 

			else if(s instanceof SRM_S07_SERVICE){
				SRM_S07_SERVICE v = (SRM_S07_SERVICE) s;
			} 

			else if(s instanceof RRD_O02){
				RRD_O02 v = (RRD_O02) s;
			} 

			else if(s instanceof PPG_PCH_PATHWAY){
				PPG_PCH_PATHWAY v = (PPG_PCH_PATHWAY) s;
			} 

			else if(s instanceof SIU_S19_GENERAL_RESOURCE){
				SIU_S19_GENERAL_RESOURCE v = (SIU_S19_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof SRR_S10_LOCATION_RESOURCE){
				SRR_S10_LOCATION_RESOURCE v = (SRR_S10_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof ORF_R02_ORDER){
				ORF_R02_ORDER v = (ORF_R02_ORDER) s;
			} 

			else if(s instanceof RQA_I11_VISIT){
				RQA_I11_VISIT v = (RQA_I11_VISIT) s;
			} 

			else if(s instanceof ADT_A05_INSURANCE){
				ADT_A05_INSURANCE v = (ADT_A05_INSURANCE) s;
			} 

			else if(s instanceof PPG_PCH_PROBLEM_OBSERVATION){
				PPG_PCH_PROBLEM_OBSERVATION v = (PPG_PCH_PROBLEM_OBSERVATION) s;
			} 

			else if(s instanceof MFN_M05_MF_LOCATION){
				MFN_M05_MF_LOCATION v = (MFN_M05_MF_LOCATION) s;
			} 

			else if(s instanceof ORN_O02){
				ORN_O02 v = (ORN_O02) s;
			} 

			else if(s instanceof REF_I15_AUTHORIZATION){
				REF_I15_AUTHORIZATION v = (REF_I15_AUTHORIZATION) s;
			} 

			else if(s instanceof SRM_S05_PERSONNEL_RESOURCE){
				SRM_S05_PERSONNEL_RESOURCE v = (SRM_S05_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof PGL_PC7_GOAL_ROLE){
				PGL_PC7_GOAL_ROLE v = (PGL_PC7_GOAL_ROLE) s;
			} 

			else if(s instanceof RQI_I03_GUARANTOR_INSURANCE){
				RQI_I03_GUARANTOR_INSURANCE v = (RQI_I03_GUARANTOR_INSURANCE) s;
			} 

			else if(s instanceof ADT_AXX_PATIENT){
				ADT_AXX_PATIENT v = (ADT_AXX_PATIENT) s;
			} 

			else if(s instanceof PPR_PC3_GOAL){
				PPR_PC3_GOAL v = (PPR_PC3_GOAL) s;
			} 

			else if(s instanceof PRR_PC5_PATIENT_VISIT){
				PRR_PC5_PATIENT_VISIT v = (PRR_PC5_PATIENT_VISIT) s;
			} 

			else if(s instanceof QCK){
				QCK v = (QCK) s;
			} 

			else if(s instanceof RGV_O01_OBSERVATION){
				RGV_O01_OBSERVATION v = (RGV_O01_OBSERVATION) s;
			} 

			else if(s instanceof SIU_S24_GENERAL_RESOURCE){
				SIU_S24_GENERAL_RESOURCE v = (SIU_S24_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof PPV_PCA_PROBLEM_ROLE){
				PPV_PCA_PROBLEM_ROLE v = (PPV_PCA_PROBLEM_ROLE) s;
			} 

			else if(s instanceof MFN_M07){
				MFN_M07 v = (MFN_M07) s;
			} 

			else if(s instanceof PPR_PC1_PATIENT_VISIT){
				PPR_PC1_PATIENT_VISIT v = (PPR_PC1_PATIENT_VISIT) s;
			} 

			else if(s instanceof MFN_M08){
				MFN_M08 v = (MFN_M08) s;
			} 

			else if(s instanceof MFN_M05){
				MFN_M05 v = (MFN_M05) s;
			} 

			else if(s instanceof MFN_M06){
				MFN_M06 v = (MFN_M06) s;
			} 

			else if(s instanceof MFN_M09){
				MFN_M09 v = (MFN_M09) s;
			} 

			else if(s instanceof RPL_I02){
				RPL_I02 v = (RPL_I02) s;
			} 

			else if(s instanceof SRM_S09_PATIENT){
				SRM_S09_PATIENT v = (SRM_S09_PATIENT) s;
			} 

			else if(s instanceof MFN_M03){
				MFN_M03 v = (MFN_M03) s;
			} 

			else if(s instanceof MFN_M04){
				MFN_M04 v = (MFN_M04) s;
			} 

			else if(s instanceof MFN_M01){
				MFN_M01 v = (MFN_M01) s;
			} 

			else if(s instanceof MFN_M02){
				MFN_M02 v = (MFN_M02) s;
			} 

			else if(s instanceof PGL_PC6_PROBLEM_OBSERVATION){
				PGL_PC6_PROBLEM_OBSERVATION v = (PGL_PC6_PROBLEM_OBSERVATION) s;
			} 

			else if(s instanceof SIU_S16_LOCATIONL_RESOURCE){
				SIU_S16_LOCATIONL_RESOURCE v = (SIU_S16_LOCATIONL_RESOURCE) s;
			} 

			else if(s instanceof RGV_O01_ORDER){
				RGV_O01_ORDER v = (RGV_O01_ORDER) s;
			} 

			else if(s instanceof RDS_O01_COMPONENT){
				RDS_O01_COMPONENT v = (RDS_O01_COMPONENT) s;
			} 

			else if(s instanceof PRR_PC5_PROBLEM_PATHWAY){
				PRR_PC5_PROBLEM_PATHWAY v = (PRR_PC5_PROBLEM_PATHWAY) s;
			} 

			else if(s instanceof CSU_C11_VISIT){
				CSU_C11_VISIT v = (CSU_C11_VISIT) s;
			} 

			else if(s instanceof SRR_S03_PERSONNEL_RESOURCE){
				SRR_S03_PERSONNEL_RESOURCE v = (SRR_S03_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof RAR_RAR){
				RAR_RAR v = (RAR_RAR) s;
			} 

			else if(s instanceof PPG_PCJ_ORDER_DETAIL){
				PPG_PCJ_ORDER_DETAIL v = (PPG_PCJ_ORDER_DETAIL) s;
			} 

			else if(s instanceof RPA_I08_OBSERVATION){
				RPA_I08_OBSERVATION v = (RPA_I08_OBSERVATION) s;
			} 

			else if(s instanceof REF_I13_AUTHORIZATION){
				REF_I13_AUTHORIZATION v = (REF_I13_AUTHORIZATION) s;
			} 

			else if(s instanceof ADT_A14_INSURANCE){
				ADT_A14_INSURANCE v = (ADT_A14_INSURANCE) s;
			} 

			else if(s instanceof RPA_I10_PROCEDURE){
				RPA_I10_PROCEDURE v = (RPA_I10_PROCEDURE) s;
			} 

			else if(s instanceof ADT_A01_INSURANCE){
				ADT_A01_INSURANCE v = (ADT_A01_INSURANCE) s;
			} 

			else if(s instanceof ADT_A41_PATIENT){
				ADT_A41_PATIENT v = (ADT_A41_PATIENT) s;
			} 

			else if(s instanceof PEX_P07_VISIT){
				PEX_P07_VISIT v = (PEX_P07_VISIT) s;
			} 

			else if(s instanceof PEX_P07_RX_ADMINISTRATION){
				PEX_P07_RX_ADMINISTRATION v = (PEX_P07_RX_ADMINISTRATION) s;
			} 

			else if(s instanceof PPG_PCJ_PATHWAY_ROLE){
				PPG_PCJ_PATHWAY_ROLE v = (PPG_PCJ_PATHWAY_ROLE) s;
			} 

			else if(s instanceof BAR_P05_INSURANCE){
				BAR_P05_INSURANCE v = (BAR_P05_INSURANCE) s;
			} 

			else if(s instanceof SIU_S20_PERSONNEL_RESOURCE){
				SIU_S20_PERSONNEL_RESOURCE v = (SIU_S20_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof SIU_S14_PATIENT){
				SIU_S14_PATIENT v = (SIU_S14_PATIENT) s;
			} 

			else if(s instanceof SRR_S01_SERVICE){
				SRR_S01_SERVICE v = (SRR_S01_SERVICE) s;
			} 

			else if(s instanceof PRR_PC5_ORDER_OBSERVATION){
				PRR_PC5_ORDER_OBSERVATION v = (PRR_PC5_ORDER_OBSERVATION) s;
			} 

			else if(s instanceof PPP_PCB_GOAL_ROLE){
				PPP_PCB_GOAL_ROLE v = (PPP_PCB_GOAL_ROLE) s;
			} 

			else if(s instanceof BHS){
				BHS v = (BHS) s;
			} 

			else if(s instanceof MFN_M07_MF_CLIN_STUDY){
				MFN_M07_MF_CLIN_STUDY v = (MFN_M07_MF_CLIN_STUDY) s;
			} 

			else if(s instanceof SRR_S06_SCHEDULE){
				SRR_S06_SCHEDULE v = (SRR_S06_SCHEDULE) s;
			} 

			else if(s instanceof PGL_PC6_PATHWAY){
				PGL_PC6_PATHWAY v = (PGL_PC6_PATHWAY) s;
			} 

			else if(s instanceof RDS_O01_ORDER_DETAIL){
				RDS_O01_ORDER_DETAIL v = (RDS_O01_ORDER_DETAIL) s;
			} 

			else if(s instanceof PGL_PC6_ORDER){
				PGL_PC6_ORDER v = (PGL_PC6_ORDER) s;
			} 

			else if(s instanceof SRR_S07_SERVICE){
				SRR_S07_SERVICE v = (SRR_S07_SERVICE) s;
			} 

			else if(s instanceof SIU_S14_RESOURCES){
				SIU_S14_RESOURCES v = (SIU_S14_RESOURCES) s;
			} 

			else if(s instanceof SRR_S09_PERSONNEL_RESOURCE){
				SRR_S09_PERSONNEL_RESOURCE v = (SRR_S09_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof SRR_S04_PERSONNEL_RESOURCE){
				SRR_S04_PERSONNEL_RESOURCE v = (SRR_S04_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof OBR){
				OBR v = (OBR) s;
			} 

			else if(s instanceof RPA_I09_PROCEDURE){
				RPA_I09_PROCEDURE v = (RPA_I09_PROCEDURE) s;
			} 

			else if(s instanceof OBX){
				OBX v = (OBX) s;
			} 

			else if(s instanceof ADT_A44_PATIENT){
				ADT_A44_PATIENT v = (ADT_A44_PATIENT) s;
			} 

			else if(s instanceof RRI_I13_PROVIDER){
				RRI_I13_PROVIDER v = (RRI_I13_PROVIDER) s;
			} 

			else if(s instanceof PGL_PC7_PROBLEM){
				PGL_PC7_PROBLEM v = (PGL_PC7_PROBLEM) s;
			} 

			else if(s instanceof MFN_M10){
				MFN_M10 v = (MFN_M10) s;
			} 

			else if(s instanceof MFN_M08_xx){
				MFN_M08_xx v = (MFN_M08_xx) s;
			} 

			else if(s instanceof MFN_M11){
				MFN_M11 v = (MFN_M11) s;
			} 

			else if(s instanceof BAR_P05_PROCEDURE){
				BAR_P05_PROCEDURE v = (BAR_P05_PROCEDURE) s;
			} 

			else if(s instanceof RER_RER_DEFINITION){
				RER_RER_DEFINITION v = (RER_RER_DEFINITION) s;
			} 

			else if(s instanceof PRR_PC5_PROBLEM){
				PRR_PC5_PROBLEM v = (PRR_PC5_PROBLEM) s;
			} 

			else if(s instanceof RQA_I08_VISIT){
				RQA_I08_VISIT v = (RQA_I08_VISIT) s;
			} 

			else if(s instanceof RRE_O01){
				RRE_O01 v = (RRE_O01) s;
			} 

			else if(s instanceof SIU_S26_PERSONNEL_RESOURCE){
				SIU_S26_PERSONNEL_RESOURCE v = (SIU_S26_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof ORM_O01){
				ORM_O01 v = (ORM_O01) s;
			} 

			else if(s instanceof RPA_I08_INSURANCE){
				RPA_I08_INSURANCE v = (RPA_I08_INSURANCE) s;
			} 

			else if(s instanceof SIU_S15_LOCATION_RESOURCE){
				SIU_S15_LOCATION_RESOURCE v = (SIU_S15_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof RER_RER_ORDER){
				RER_RER_ORDER v = (RER_RER_ORDER) s;
			} 

			else if(s instanceof PPG_PCH_ORDER){
				PPG_PCH_ORDER v = (PPG_PCH_ORDER) s;
			} 

			else if(s instanceof PEX_P07_PEX_CAUSE){
				PEX_P07_PEX_CAUSE v = (PEX_P07_PEX_CAUSE) s;
			} 

			else if(s instanceof OMD_O01_ORDER_TRAY){
				OMD_O01_ORDER_TRAY v = (OMD_O01_ORDER_TRAY) s;
			} 

			else if(s instanceof RDR_RDR_DISPENSE){
				RDR_RDR_DISPENSE v = (RDR_RDR_DISPENSE) s;
			} 

			else if(s instanceof PPG_PCG_ORDER){
				PPG_PCG_ORDER v = (PPG_PCG_ORDER) s;
			} 

			else if(s instanceof ORF_R04_QUERY_RESPONSE){
				ORF_R04_QUERY_RESPONSE v = (ORF_R04_QUERY_RESPONSE) s;
			} 

			else if(s instanceof RDO_O01_INSURANCE){
				RDO_O01_INSURANCE v = (RDO_O01_INSURANCE) s;
			} 

			else if(s instanceof SRR_S10_GENERAL_RESOURCE){
				SRR_S10_GENERAL_RESOURCE v = (SRR_S10_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof PIN_I07_PROVIDER){
				PIN_I07_PROVIDER v = (PIN_I07_PROVIDER) s;
			} 

			else if(s instanceof PPT_PCL_ORDER_DETAIL){
				PPT_PCL_ORDER_DETAIL v = (PPT_PCL_ORDER_DETAIL) s;
			} 

			else if(s instanceof REF_I14_INSURANCE){
				REF_I14_INSURANCE v = (REF_I14_INSURANCE) s;
			} 

			else if(s instanceof PPR_PC2_PATIENT_VISIT){
				PPR_PC2_PATIENT_VISIT v = (PPR_PC2_PATIENT_VISIT) s;
			} 

			else if(s instanceof ORM_O01_OBSERVATION){
				ORM_O01_OBSERVATION v = (ORM_O01_OBSERVATION) s;
			} 

			else if(s instanceof SRR_S03_PATIENT){
				SRR_S03_PATIENT v = (SRR_S03_PATIENT) s;
			} 

			else if(s instanceof ODT){
				ODT v = (ODT) s;
			} 

			else if(s instanceof RAS_O01_OBSERVATION){
				RAS_O01_OBSERVATION v = (RAS_O01_OBSERVATION) s;
			} 

			else if(s instanceof ODS){
				ODS v = (ODS) s;
			} 

			else if(s instanceof FT1){
				FT1 v = (FT1) s;
			} 

			else if(s instanceof ORU_R01_VISIT){
				ORU_R01_VISIT v = (ORU_R01_VISIT) s;
			} 

			else if(s instanceof SIU_S23_SERVICE){
				SIU_S23_SERVICE v = (SIU_S23_SERVICE) s;
			} 

			else if(s instanceof RRI_I13){
				RRI_I13 v = (RRI_I13) s;
			} 

			else if(s instanceof RRI_I12){
				RRI_I12 v = (RRI_I12) s;
			} 

			else if(s instanceof RRI_I15){
				RRI_I15 v = (RRI_I15) s;
			} 

			else if(s instanceof RRI_I14){
				RRI_I14 v = (RRI_I14) s;
			} 

			else if(s instanceof REF_I15_INSURANCE){
				REF_I15_INSURANCE v = (REF_I15_INSURANCE) s;
			} 

			else if(s instanceof PPG_PCG_PATHWAY_ROLE){
				PPG_PCG_PATHWAY_ROLE v = (PPG_PCG_PATHWAY_ROLE) s;
			} 

			else if(s instanceof PPG_PCH_PATHWAY_ROLE){
				PPG_PCH_PATHWAY_ROLE v = (PPG_PCH_PATHWAY_ROLE) s;
			} 

			else if(s instanceof SRR_S09_GENERAL_RESOURCE){
				SRR_S09_GENERAL_RESOURCE v = (SRR_S09_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof REF_I12_PROCEDURE){
				REF_I12_PROCEDURE v = (REF_I12_PROCEDURE) s;
			} 

			else if(s instanceof REF_I14_RESULTS){
				REF_I14_RESULTS v = (REF_I14_RESULTS) s;
			} 

			else if(s instanceof ORU_R01){
				ORU_R01 v = (ORU_R01) s;
			} 

			else if(s instanceof REF_I12_AUTHORIZATION){
				REF_I12_AUTHORIZATION v = (REF_I12_AUTHORIZATION) s;
			} 

			else if(s instanceof SIU_S18_RESOURCES){
				SIU_S18_RESOURCES v = (SIU_S18_RESOURCES) s;
			} 

			else if(s instanceof BLG){
				BLG v = (BLG) s;
			} 

			else if(s instanceof SRM_S10){
				SRM_S10 v = (SRM_S10) s;
			} 

			else if(s instanceof RRD_O02_DISPENSE){
				RRD_O02_DISPENSE v = (RRD_O02_DISPENSE) s;
			} 

			else if(s instanceof SRM_S11){
				SRM_S11 v = (SRM_S11) s;
			} 

			else if(s instanceof PRR_PC5_GOAL){
				PRR_PC5_GOAL v = (PRR_PC5_GOAL) s;
			} 

			else if(s instanceof FTS){
				FTS v = (FTS) s;
			} 

			else if(s instanceof URD){
				URD v = (URD) s;
			} 

			else if(s instanceof SQR_S25){
				SQR_S25 v = (SQR_S25) s;
			} 

			else if(s instanceof SRR_S02_LOCATION_RESOURCE){
				SRR_S02_LOCATION_RESOURCE v = (SRR_S02_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof SRM_S11_RESOURCES){
				SRM_S11_RESOURCES v = (SRM_S11_RESOURCES) s;
			} 

			else if(s instanceof PGL_PC6_PROBLEM_ROLE){
				PGL_PC6_PROBLEM_ROLE v = (PGL_PC6_PROBLEM_ROLE) s;
			} 

			else if(s instanceof CSU_C11_RX_ADMIN){
				CSU_C11_RX_ADMIN v = (CSU_C11_RX_ADMIN) s;
			} 

			else if(s instanceof SRM_S10_PERSONNEL_RESOURCE){
				SRM_S10_PERSONNEL_RESOURCE v = (SRM_S10_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof PEX_P08_ASSOCIATED_PERSON){
				PEX_P08_ASSOCIATED_PERSON v = (PEX_P08_ASSOCIATED_PERSON) s;
			} 

			else if(s instanceof SRM_S06){
				SRM_S06 v = (SRM_S06) s;
			} 

			else if(s instanceof SRM_S07){
				SRM_S07 v = (SRM_S07) s;
			} 

			else if(s instanceof PIN_I07_INSURANCE){
				PIN_I07_INSURANCE v = (PIN_I07_INSURANCE) s;
			} 

			else if(s instanceof SRM_S08){
				SRM_S08 v = (SRM_S08) s;
			} 

			else if(s instanceof ADR_A19){
				ADR_A19 v = (ADR_A19) s;
			} 

			else if(s instanceof SRM_S09){
				SRM_S09 v = (SRM_S09) s;
			} 

			else if(s instanceof URS){
				URS v = (URS) s;
			} 

			else if(s instanceof ORF_R02){
				ORF_R02 v = (ORF_R02) s;
			} 

			else if(s instanceof PPG_PCG_PROBLEM_OBSERVATION){
				PPG_PCG_PROBLEM_OBSERVATION v = (PPG_PCG_PROBLEM_OBSERVATION) s;
			} 

			else if(s instanceof SRM_S02){
				SRM_S02 v = (SRM_S02) s;
			} 

			else if(s instanceof SRM_S03){
				SRM_S03 v = (SRM_S03) s;
			} 

			else if(s instanceof ORF_R04){
				ORF_R04 v = (ORF_R04) s;
			} 

			else if(s instanceof SRM_S04){
				SRM_S04 v = (SRM_S04) s;
			} 

			else if(s instanceof SRM_S05){
				SRM_S05 v = (SRM_S05) s;
			} 

			else if(s instanceof RRI_I15_RESULTS){
				RRI_I15_RESULTS v = (RRI_I15_RESULTS) s;
			} 

			else if(s instanceof ORR_O02_RESPONSE){
				ORR_O02_RESPONSE v = (ORR_O02_RESPONSE) s;
			} 

			else if(s instanceof SRM_S01){
				SRM_S01 v = (SRM_S01) s;
			} 

			else if(s instanceof SIU_S16_GENERAL_RESOURCE){
				SIU_S16_GENERAL_RESOURCE v = (SIU_S16_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof RQA_I10_RESULTS){
				RQA_I10_RESULTS v = (RQA_I10_RESULTS) s;
			} 

			else if(s instanceof RDE_O01){
				RDE_O01 v = (RDE_O01) s;
			} 

			else if(s instanceof PEX_P08_PEX_CAUSE){
				PEX_P08_PEX_CAUSE v = (PEX_P08_PEX_CAUSE) s;
			} 

			else if(s instanceof RPA_I11_OBSERVATION){
				RPA_I11_OBSERVATION v = (RPA_I11_OBSERVATION) s;
			} 

			else if(s instanceof PGL_PC7_ORDER_OBSERVATION){
				PGL_PC7_ORDER_OBSERVATION v = (PGL_PC7_ORDER_OBSERVATION) s;
			} 

			else if(s instanceof SQM_S25_PERSONNEL_RESOURCE){
				SQM_S25_PERSONNEL_RESOURCE v = (SQM_S25_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof RAS_O01_COMPONENTS){
				RAS_O01_COMPONENTS v = (RAS_O01_COMPONENTS) s;
			} 

			else if(s instanceof SRM_S03_PATIENT){
				SRM_S03_PATIENT v = (SRM_S03_PATIENT) s;
			} 

			else if(s instanceof RRG_O02_GIVE){
				RRG_O02_GIVE v = (RRG_O02_GIVE) s;
			} 

			else if(s instanceof DRG){
				DRG v = (DRG) s;
			} 

			else if(s instanceof BAR_P01_VISIT){
				BAR_P01_VISIT v = (BAR_P01_VISIT) s;
			} 

			else if(s instanceof OMS_O01_ORDER){
				OMS_O01_ORDER v = (OMS_O01_ORDER) s;
			} 

			else if(s instanceof RRO_O02_RESPONSE){
				RRO_O02_RESPONSE v = (RRO_O02_RESPONSE) s;
			} 

			else if(s instanceof RGR_RGR_PATIENT){
				RGR_RGR_PATIENT v = (RGR_RGR_PATIENT) s;
			} 

			else if(s instanceof SRM_S08_LOCATION_RESOURCE){
				SRM_S08_LOCATION_RESOURCE v = (SRM_S08_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof DFT_P03_FINANCIAL_PROCEDURE){
				DFT_P03_FINANCIAL_PROCEDURE v = (DFT_P03_FINANCIAL_PROCEDURE) s;
			} 

			else if(s instanceof SIU_S12_SERVICE){
				SIU_S12_SERVICE v = (SIU_S12_SERVICE) s;
			} 

			else if(s instanceof RPA_I09_VISIT){
				RPA_I09_VISIT v = (RPA_I09_VISIT) s;
			} 

			else if(s instanceof MFN_M09_MF_TEST_CATEGORICAL){
				MFN_M09_MF_TEST_CATEGORICAL v = (MFN_M09_MF_TEST_CATEGORICAL) s;
			} 

			else if(s instanceof RDS_O01_OBSERVATION){
				RDS_O01_OBSERVATION v = (RDS_O01_OBSERVATION) s;
			} 

			else if(s instanceof SPR){
				SPR v = (SPR) s;
			} 

			else if(s instanceof DSC){
				DSC v = (DSC) s;
			} 

			else if(s instanceof RRG_O02_RESPONSE){
				RRG_O02_RESPONSE v = (RRG_O02_RESPONSE) s;
			} 

			else if(s instanceof RAS_O02_PATIENT){
				RAS_O02_PATIENT v = (RAS_O02_PATIENT) s;
			} 

			else if(s instanceof RRG_O02){
				RRG_O02 v = (RRG_O02) s;
			} 

			else if(s instanceof SIU_S13_GENERAL_RESOURCE){
				SIU_S13_GENERAL_RESOURCE v = (SIU_S13_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof RQA_I09_GUARANTOR_INSURANCE){
				RQA_I09_GUARANTOR_INSURANCE v = (RQA_I09_GUARANTOR_INSURANCE) s;
			} 

			else if(s instanceof SRR_S08_SCHEDULE){
				SRR_S08_SCHEDULE v = (SRR_S08_SCHEDULE) s;
			} 

			else if(s instanceof DSP){
				DSP v = (DSP) s;
			} 

			else if(s instanceof SRR_S10_SCHEDULE){
				SRR_S10_SCHEDULE v = (SRR_S10_SCHEDULE) s;
			} 

			else if(s instanceof REF_I12_PROVIDER){
				REF_I12_PROVIDER v = (REF_I12_PROVIDER) s;
			} 

			else if(s instanceof CRM_C08_PATIENT){
				CRM_C08_PATIENT v = (CRM_C08_PATIENT) s;
			} 

			else if(s instanceof RPA_I09_OBSERVATION){
				RPA_I09_OBSERVATION v = (RPA_I09_OBSERVATION) s;
			} 

			else if(s instanceof CSU_C12_STUDY_OBSERVATION){
				CSU_C12_STUDY_OBSERVATION v = (CSU_C12_STUDY_OBSERVATION) s;
			} 

			else if(s instanceof ORM_O01_PATIENT_VISIT){
				ORM_O01_PATIENT_VISIT v = (ORM_O01_PATIENT_VISIT) s;
			} 

			else if(s instanceof SRR_S09_PATIENT){
				SRR_S09_PATIENT v = (SRR_S09_PATIENT) s;
			} 

			else if(s instanceof PPP_PCC_PROBLEM){
				PPP_PCC_PROBLEM v = (PPP_PCC_PROBLEM) s;
			} 

			else if(s instanceof PPR_PC1_PATHWAY){
				PPR_PC1_PATHWAY v = (PPR_PC1_PATHWAY) s;
			} 

			else if(s instanceof DFT_P03){
				DFT_P03 v = (DFT_P03) s;
			} 

			else if(s instanceof SRR_S04_PATIENT){
				SRR_S04_PATIENT v = (SRR_S04_PATIENT) s;
			} 

			else if(s instanceof PTR_PCF_PATHWAY_ROLE){
				PTR_PCF_PATHWAY_ROLE v = (PTR_PCF_PATHWAY_ROLE) s;
			} 

			else if(s instanceof MFA){
				MFA v = (MFA) s;
			} 

			else if(s instanceof MFE){
				MFE v = (MFE) s;
			} 

			else if(s instanceof BAR_P05_VISIT){
				BAR_P05_VISIT v = (BAR_P05_VISIT) s;
			} 

			else if(s instanceof MFI){
				MFI v = (MFI) s;
			} 

			else if(s instanceof SIU_S17_LOCATION_RESOURCE){
				SIU_S17_LOCATION_RESOURCE v = (SIU_S17_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof CRM_C02_PATIENT){
				CRM_C02_PATIENT v = (CRM_C02_PATIENT) s;
			} 

			else if(s instanceof SIU_S23_LOCATION_RESOURCE){
				SIU_S23_LOCATION_RESOURCE v = (SIU_S23_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof PTR_PCF_PROBLEM_ROLE){
				PTR_PCF_PROBLEM_ROLE v = (PTR_PCF_PROBLEM_ROLE) s;
			} 

			else if(s instanceof SIU_S17_SERVICE){
				SIU_S17_SERVICE v = (SIU_S17_SERVICE) s;
			} 

			else if(s instanceof REF_I12){
				REF_I12 v = (REF_I12) s;
			} 

			else if(s instanceof REF_I13){
				REF_I13 v = (REF_I13) s;
			} 

			else if(s instanceof RDO_O01){
				RDO_O01 v = (RDO_O01) s;
			} 

			else if(s instanceof ADT_A31_INSURANCE){
				ADT_A31_INSURANCE v = (ADT_A31_INSURANCE) s;
			} 

			else if(s instanceof PTR_PCF_GOAL_OBSERVATION){
				PTR_PCF_GOAL_OBSERVATION v = (PTR_PCF_GOAL_OBSERVATION) s;
			} 

			else if(s instanceof REF_I14){
				REF_I14 v = (REF_I14) s;
			} 

			else if(s instanceof RPI_I01){
				RPI_I01 v = (RPI_I01) s;
			} 

			else if(s instanceof REF_I15){
				REF_I15 v = (REF_I15) s;
			} 

			else if(s instanceof CSU_C10_STUDY_SCHEDULE){
				CSU_C10_STUDY_SCHEDULE v = (CSU_C10_STUDY_SCHEDULE) s;
			} 

			else if(s instanceof SIU_S17_RESOURCES){
				SIU_S17_RESOURCES v = (SIU_S17_RESOURCES) s;
			} 

			else if(s instanceof RPI_I04){
				RPI_I04 v = (RPI_I04) s;
			} 

			else if(s instanceof MFN_M09_MF_TEST_CAT_DETAIL){
				MFN_M09_MF_TEST_CAT_DETAIL v = (MFN_M09_MF_TEST_CAT_DETAIL) s;
			} 

			else if(s instanceof MFN_M11_MF_TEST_CALCULATED){
				MFN_M11_MF_TEST_CALCULATED v = (MFN_M11_MF_TEST_CALCULATED) s;
			} 

			else if(s instanceof PPG_PCH_GOAL_ROLE){
				PPG_PCH_GOAL_ROLE v = (PPG_PCH_GOAL_ROLE) s;
			} 

			else if(s instanceof ADT_AXX_PROCEDURE){
				ADT_AXX_PROCEDURE v = (ADT_AXX_PROCEDURE) s;
			} 

			else if(s instanceof REF_I15_PROVIDER){
				REF_I15_PROVIDER v = (REF_I15_PROVIDER) s;
			} 

			else if(s instanceof REF_I15_RESULTS){
				REF_I15_RESULTS v = (REF_I15_RESULTS) s;
			} 

			else if(s instanceof DSR_Q03){
				DSR_Q03 v = (DSR_Q03) s;
			} 

			else if(s instanceof SQM_S25){
				SQM_S25 v = (SQM_S25) s;
			} 

			else if(s instanceof SRR_S10){
				SRR_S10 v = (SRR_S10) s;
			} 

			else if(s instanceof STF){
				STF v = (STF) s;
			} 

			else if(s instanceof SRR_S11){
				SRR_S11 v = (SRR_S11) s;
			} 

			else if(s instanceof PPR_PC1_PROBLEM){
				PPR_PC1_PROBLEM v = (PPR_PC1_PROBLEM) s;
			} 

			else if(s instanceof SRM_S03_LOCATION_RESOURCE){
				SRM_S03_LOCATION_RESOURCE v = (SRM_S03_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof PEX_P07_ASSOCIATED_RX_ORDER){
				PEX_P07_ASSOCIATED_RX_ORDER v = (PEX_P07_ASSOCIATED_RX_ORDER) s;
			} 

			else if(s instanceof SIU_S21_LOCATION_RESOURCE){
				SIU_S21_LOCATION_RESOURCE v = (SIU_S21_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof DSR_Q01){
				DSR_Q01 v = (DSR_Q01) s;
			} 

			else if(s instanceof ADT_A07){
				ADT_A07 v = (ADT_A07) s;
			} 

			else if(s instanceof SIU_S20_LOCATION_RESOURCE){
				SIU_S20_LOCATION_RESOURCE v = (SIU_S20_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof ADT_A08){
				ADT_A08 v = (ADT_A08) s;
			} 

			else if(s instanceof ADT_A05){
				ADT_A05 v = (ADT_A05) s;
			} 

			else if(s instanceof OM1){
				OM1 v = (OM1) s;
			} 

			else if(s instanceof ADT_A06){
				ADT_A06 v = (ADT_A06) s;
			} 

			else if(s instanceof RRA_O02_RESPONSE){
				RRA_O02_RESPONSE v = (RRA_O02_RESPONSE) s;
			} 

			else if(s instanceof OM3){
				OM3 v = (OM3) s;
			} 

			else if(s instanceof PGL_PC6_GOAL_ROLE){
				PGL_PC6_GOAL_ROLE v = (PGL_PC6_GOAL_ROLE) s;
			} 

			else if(s instanceof OM2){
				OM2 v = (OM2) s;
			} 

			else if(s instanceof ADT_A09){
				ADT_A09 v = (ADT_A09) s;
			} 

			else if(s instanceof OM5){
				OM5 v = (OM5) s;
			} 

			else if(s instanceof OM4){
				OM4 v = (OM4) s;
			} 

			else if(s instanceof PPP_PCB_ORDER){
				PPP_PCB_ORDER v = (PPP_PCB_ORDER) s;
			} 

			else if(s instanceof OM6){
				OM6 v = (OM6) s;
			} 

			else if(s instanceof ROR_ROR_DEFINITION){
				ROR_ROR_DEFINITION v = (ROR_ROR_DEFINITION) s;
			} 

			else if(s instanceof QRY_A19){
				QRY_A19 v = (QRY_A19) s;
			} 

			else if(s instanceof PPV_PCA){
				PPV_PCA v = (PPV_PCA) s;
			} 

			else if(s instanceof ADT_A03){
				ADT_A03 v = (ADT_A03) s;
			} 

			else if(s instanceof RPA_I09_INSURANCE){
				RPA_I09_INSURANCE v = (RPA_I09_INSURANCE) s;
			} 

			else if(s instanceof ADT_A04){
				ADT_A04 v = (ADT_A04) s;
			} 

			else if(s instanceof DOC_T12){
				DOC_T12 v = (DOC_T12) s;
			} 

			else if(s instanceof SRR_S05_PERSONNEL_RESOURCE){
				SRR_S05_PERSONNEL_RESOURCE v = (SRR_S05_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof ADT_A01){
				ADT_A01 v = (ADT_A01) s;
			} 

			else if(s instanceof SRM_S04_LOCATION_RESOURCE){
				SRM_S04_LOCATION_RESOURCE v = (SRM_S04_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof ADT_A02){
				ADT_A02 v = (ADT_A02) s;
			} 

			else if(s instanceof RQI_I01_GUARANTOR_INSURANCE){
				RQI_I01_GUARANTOR_INSURANCE v = (RQI_I01_GUARANTOR_INSURANCE) s;
			} 

			else if(s instanceof MFK_M01){
				MFK_M01 v = (MFK_M01) s;
			} 

			else if(s instanceof MFK_M02){
				MFK_M02 v = (MFK_M02) s;
			} 

			else if(s instanceof PPR_PC1_GOAL_ROLE){
				PPR_PC1_GOAL_ROLE v = (PPR_PC1_GOAL_ROLE) s;
			} 

			else if(s instanceof SIU_S22_LOCATION_RESOURCE){
				SIU_S22_LOCATION_RESOURCE v = (SIU_S22_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof MFK_M03){
				MFK_M03 v = (MFK_M03) s;
			} 

			else if(s instanceof MFK_M04){
				MFK_M04 v = (MFK_M04) s;
			} 

			else if(s instanceof SRR_S09_LOCATION_RESOURCE){
				SRR_S09_LOCATION_RESOURCE v = (SRR_S09_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof MFK_M05){
				MFK_M05 v = (MFK_M05) s;
			} 

			else if(s instanceof MFK_M07){
				MFK_M07 v = (MFK_M07) s;
			} 

			else if(s instanceof ADT_A18){
				ADT_A18 v = (ADT_A18) s;
			} 

			else if(s instanceof RQA_I08_PROCEDURE){
				RQA_I08_PROCEDURE v = (RQA_I08_PROCEDURE) s;
			} 

			else if(s instanceof ADT_A16){
				ADT_A16 v = (ADT_A16) s;
			} 

			else if(s instanceof ADT_A17){
				ADT_A17 v = (ADT_A17) s;
			} 

			else if(s instanceof PPG_PCJ){
				PPG_PCJ v = (PPG_PCJ) s;
			} 

			else if(s instanceof PPG_PCH){
				PPG_PCH v = (PPG_PCH) s;
			} 

			else if(s instanceof QCK_Q02){
				QCK_Q02 v = (QCK_Q02) s;
			} 

			else if(s instanceof PPG_PCG){
				PPG_PCG v = (PPG_PCG) s;
			} 

			else if(s instanceof PPR_PC3_PATHWAY){
				PPR_PC3_PATHWAY v = (PPR_PC3_PATHWAY) s;
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

			else if(s instanceof ADT_A15){
				ADT_A15 v = (ADT_A15) s;
			} 

			else if(s instanceof PGL_PC8_PATIENT_VISIT){
				PGL_PC8_PATIENT_VISIT v = (PGL_PC8_PATIENT_VISIT) s;
			} 

			else if(s instanceof ADT_A12){
				ADT_A12 v = (ADT_A12) s;
			} 

			else if(s instanceof ADT_A13){
				ADT_A13 v = (ADT_A13) s;
			} 

			else if(s instanceof RRA_O02){
				RRA_O02 v = (RRA_O02) s;
			} 

			else if(s instanceof BTS){
				BTS v = (BTS) s;
			} 

			else if(s instanceof PPT_PCL_GOAL){
				PPT_PCL_GOAL v = (PPT_PCL_GOAL) s;
			} 

			else if(s instanceof QRD){
				QRD v = (QRD) s;
			} 

			else if(s instanceof SRR_S09_SCHEDULE){
				SRR_S09_SCHEDULE v = (SRR_S09_SCHEDULE) s;
			} 

			else if(s instanceof QRF){
				QRF v = (QRF) s;
			} 

			else if(s instanceof PPP_PCD_ORDER_OBSERVATION){
				PPP_PCD_ORDER_OBSERVATION v = (PPP_PCD_ORDER_OBSERVATION) s;
			} 

			else if(s instanceof CSU_C10_VISIT){
				CSU_C10_VISIT v = (CSU_C10_VISIT) s;
			} 

			else if(s instanceof ADR_A19_QUERY_RESPONSE){
				ADR_A19_QUERY_RESPONSE v = (ADR_A19_QUERY_RESPONSE) s;
			} 

			else if(s instanceof OMD_O01_ORDER_DIET){
				OMD_O01_ORDER_DIET v = (OMD_O01_ORDER_DIET) s;
			} 

			else if(s instanceof PGL_PC8_PROBLEM_ROLE){
				PGL_PC8_PROBLEM_ROLE v = (PGL_PC8_PROBLEM_ROLE) s;
			} 

			else if(s instanceof PPG_PCG_PROBLEM){
				PPG_PCG_PROBLEM v = (PPG_PCG_PROBLEM) s;
			} 

			else if(s instanceof PPV_PCA_PROBLEM){
				PPV_PCA_PROBLEM v = (PPV_PCA_PROBLEM) s;
			} 

			else if(s instanceof SRM_S05_LOCATION_RESOURCE){
				SRM_S05_LOCATION_RESOURCE v = (SRM_S05_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof RPA_I08_PROCEDURE){
				RPA_I08_PROCEDURE v = (RPA_I08_PROCEDURE) s;
			} 

			else if(s instanceof PPV_PCA_GOAL_OBSERVATION){
				PPV_PCA_GOAL_OBSERVATION v = (PPV_PCA_GOAL_OBSERVATION) s;
			} 

			else if(s instanceof MFN_M05_MF_LOC_DEPT){
				MFN_M05_MF_LOC_DEPT v = (MFN_M05_MF_LOC_DEPT) s;
			} 

			else if(s instanceof RGR_RGR_ORDER){
				RGR_RGR_ORDER v = (RGR_RGR_ORDER) s;
			} 

			else if(s instanceof RQA_I08_AUTHORIZATION){
				RQA_I08_AUTHORIZATION v = (RQA_I08_AUTHORIZATION) s;
			} 

			else if(s instanceof SQR_S25_GENERAL_RESOURCE){
				SQR_S25_GENERAL_RESOURCE v = (SQR_S25_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof RRA_O02_ORDER){
				RRA_O02_ORDER v = (RRA_O02_ORDER) s;
			} 

			else if(s instanceof PPT_PCL_PROBLEM_OBSERVATION){
				PPT_PCL_PROBLEM_OBSERVATION v = (PPT_PCL_PROBLEM_OBSERVATION) s;
			} 

			else if(s instanceof OMD_O01_PATIENT){
				OMD_O01_PATIENT v = (OMD_O01_PATIENT) s;
			} 

			else if(s instanceof PPP_PCB_GOAL){
				PPP_PCB_GOAL v = (PPP_PCB_GOAL) s;
			} 

			else if(s instanceof SRM_S01_LOCATION_RESOURCE){
				SRM_S01_LOCATION_RESOURCE v = (SRM_S01_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof SRR_S07_LOCATION_RESOURCE){
				SRR_S07_LOCATION_RESOURCE v = (SRR_S07_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof CRM_C07_PATIENT){
				CRM_C07_PATIENT v = (CRM_C07_PATIENT) s;
			} 

			else if(s instanceof SRR_S03_GENERAL_RESOURCE){
				SRR_S03_GENERAL_RESOURCE v = (SRR_S03_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof OSR_Q06_ORDER){
				OSR_Q06_ORDER v = (OSR_Q06_ORDER) s;
			} 

			else if(s instanceof ADT_A42_PATIENT){
				ADT_A42_PATIENT v = (ADT_A42_PATIENT) s;
			} 

			else if(s instanceof SRR_S03){
				SRR_S03 v = (SRR_S03) s;
			} 

			else if(s instanceof PPG_PCG_GOAL_OBSERVATION){
				PPG_PCG_GOAL_OBSERVATION v = (PPG_PCG_GOAL_OBSERVATION) s;
			} 

			else if(s instanceof PPR_PC3_GOAL_ROLE){
				PPR_PC3_GOAL_ROLE v = (PPR_PC3_GOAL_ROLE) s;
			} 

			else if(s instanceof VXX_V02){
				VXX_V02 v = (VXX_V02) s;
			} 

			else if(s instanceof SRR_S04){
				SRR_S04 v = (SRR_S04) s;
			} 

			else if(s instanceof SRR_S01){
				SRR_S01 v = (SRR_S01) s;
			} 

			else if(s instanceof PPR_PC2_PROBLEM_ROLE){
				PPR_PC2_PROBLEM_ROLE v = (PPR_PC2_PROBLEM_ROLE) s;
			} 

			else if(s instanceof SRR_S02){
				SRR_S02 v = (SRR_S02) s;
			} 

			else if(s instanceof SRR_S07){
				SRR_S07 v = (SRR_S07) s;
			} 

			else if(s instanceof SRR_S08){
				SRR_S08 v = (SRR_S08) s;
			} 

			else if(s instanceof SRR_S05){
				SRR_S05 v = (SRR_S05) s;
			} 

			else if(s instanceof SRR_S06){
				SRR_S06 v = (SRR_S06) s;
			} 

			else if(s instanceof ORN_O02_RESPONSE){
				ORN_O02_RESPONSE v = (ORN_O02_RESPONSE) s;
			} 

			else if(s instanceof RCI_I05_OBSERVATION){
				RCI_I05_OBSERVATION v = (RCI_I05_OBSERVATION) s;
			} 

			else if(s instanceof PPR_PC3_PROBLEM_OBSERVATION){
				PPR_PC3_PROBLEM_OBSERVATION v = (PPR_PC3_PROBLEM_OBSERVATION) s;
			} 

			else if(s instanceof SRR_S09){
				SRR_S09 v = (SRR_S09) s;
			} 

			else if(s instanceof SRM_S06_PERSONNEL_RESOURCE){
				SRM_S06_PERSONNEL_RESOURCE v = (SRM_S06_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof SRM_S03_PERSONNEL_RESOURCE){
				SRM_S03_PERSONNEL_RESOURCE v = (SRM_S03_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof PGL_PC7_OBSERVATION){
				PGL_PC7_OBSERVATION v = (PGL_PC7_OBSERVATION) s;
			} 

			else if(s instanceof RDR_RDR){
				RDR_RDR v = (RDR_RDR) s;
			} 

			else if(s instanceof PGL_PC8_OBSERVATION){
				PGL_PC8_OBSERVATION v = (PGL_PC8_OBSERVATION) s;
			} 

			else if(s instanceof PPR_PC2_GOAL_OBSERVATION){
				PPR_PC2_GOAL_OBSERVATION v = (PPR_PC2_GOAL_OBSERVATION) s;
			} 

			else if(s instanceof SRR_S05_LOCATION_RESOURCE){
				SRR_S05_LOCATION_RESOURCE v = (SRR_S05_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof PPG_PCG_ORDER_OBSERVATION){
				PPG_PCG_ORDER_OBSERVATION v = (PPG_PCG_ORDER_OBSERVATION) s;
			} 

			else if(s instanceof ADT_A40){
				ADT_A40 v = (ADT_A40) s;
			} 

			else if(s instanceof ORR_O02){
				ORR_O02 v = (ORR_O02) s;
			} 

			else if(s instanceof PGL_PC7_ORDER){
				PGL_PC7_ORDER v = (PGL_PC7_ORDER) s;
			} 

			else if(s instanceof SRR_S01_GENERAL_RESOURCE){
				SRR_S01_GENERAL_RESOURCE v = (SRR_S01_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof MFN_M03_MF_TEST){
				MFN_M03_MF_TEST v = (MFN_M03_MF_TEST) s;
			} 

			else if(s instanceof SIU_S19_PATIENT){
				SIU_S19_PATIENT v = (SIU_S19_PATIENT) s;
			} 

			else if(s instanceof ADT_A49){
				ADT_A49 v = (ADT_A49) s;
			} 

			else if(s instanceof PRR_PC5_PATIENT){
				PRR_PC5_PATIENT v = (PRR_PC5_PATIENT) s;
			} 

			else if(s instanceof PRR_PC5_PROBLEM_OBSERVATION){
				PRR_PC5_PROBLEM_OBSERVATION v = (PRR_PC5_PROBLEM_OBSERVATION) s;
			} 

			else if(s instanceof RPA_I11_PROCEDURE){
				RPA_I11_PROCEDURE v = (RPA_I11_PROCEDURE) s;
			} 

			else if(s instanceof CSU_C12_STUDY_PHASE){
				CSU_C12_STUDY_PHASE v = (CSU_C12_STUDY_PHASE) s;
			} 

			else if(s instanceof ADT_A43){
				ADT_A43 v = (ADT_A43) s;
			} 

			else if(s instanceof SRM_S02_RESOURCES){
				SRM_S02_RESOURCES v = (SRM_S02_RESOURCES) s;
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

			else if(s instanceof RQC_I06_PROVIDER){
				RQC_I06_PROVIDER v = (RQC_I06_PROVIDER) s;
			} 

			else if(s instanceof ADT_A47){
				ADT_A47 v = (ADT_A47) s;
			} 

			else if(s instanceof SRR_S11_GENERAL_RESOURCE){
				SRR_S11_GENERAL_RESOURCE v = (SRR_S11_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof ADT_A48){
				ADT_A48 v = (ADT_A48) s;
			} 

			else if(s instanceof SRR_S04_LOCATION_RESOURCE){
				SRR_S04_LOCATION_RESOURCE v = (SRR_S04_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof ADT_A45){
				ADT_A45 v = (ADT_A45) s;
			} 

			else if(s instanceof ADT_A46){
				ADT_A46 v = (ADT_A46) s;
			} 

			else if(s instanceof ADT_A50){
				ADT_A50 v = (ADT_A50) s;
			} 

			else if(s instanceof ADT_A51){
				ADT_A51 v = (ADT_A51) s;
			} 

			else if(s instanceof SIU_S20_PATIENT){
				SIU_S20_PATIENT v = (SIU_S20_PATIENT) s;
			} 

			else if(s instanceof RQA_I08_RESULTS){
				RQA_I08_RESULTS v = (RQA_I08_RESULTS) s;
			} 

			else if(s instanceof RDR_RDR_ORDER){
				RDR_RDR_ORDER v = (RDR_RDR_ORDER) s;
			} 

			else if(s instanceof RAS_O02){
				RAS_O02 v = (RAS_O02) s;
			} 

			else if(s instanceof RAS_O01){
				RAS_O01 v = (RAS_O01) s;
			} 

			else if(s instanceof PPP_PCD_ORDER){
				PPP_PCD_ORDER v = (PPP_PCD_ORDER) s;
			} 

			else if(s instanceof OMS_O01_INSURANCE){
				OMS_O01_INSURANCE v = (OMS_O01_INSURANCE) s;
			} 

			else if(s instanceof QRY_R02){
				QRY_R02 v = (QRY_R02) s;
			} 

			else if(s instanceof SRM_S06_LOCATION_RESOURCE){
				SRM_S06_LOCATION_RESOURCE v = (SRM_S06_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof PPP_PCC_GOAL_ROLE){
				PPP_PCC_GOAL_ROLE v = (PPP_PCC_GOAL_ROLE) s;
			} 

			else if(s instanceof PEX_P08_STUDY){
				PEX_P08_STUDY v = (PEX_P08_STUDY) s;
			} 

			else if(s instanceof PPP_PCB_GOAL_OBSERVATION){
				PPP_PCB_GOAL_OBSERVATION v = (PPP_PCB_GOAL_OBSERVATION) s;
			} 

			else if(s instanceof PIN_I07){
				PIN_I07 v = (PIN_I07) s;
			} 

			else if(s instanceof PPT_PCL_GOAL_OBSERVATION){
				PPT_PCL_GOAL_OBSERVATION v = (PPT_PCL_GOAL_OBSERVATION) s;
			} 

			else if(s instanceof PGL_PC8_PROBLEM_OBSERVATION){
				PGL_PC8_PROBLEM_OBSERVATION v = (PGL_PC8_PROBLEM_OBSERVATION) s;
			} 

			else if(s instanceof RDS_O01_ORDER_DETAIL_SUPPLEMENT){
				RDS_O01_ORDER_DETAIL_SUPPLEMENT v = (RDS_O01_ORDER_DETAIL_SUPPLEMENT) s;
			} 

			else if(s instanceof ORC){
				ORC v = (ORC) s;
			} 

			else if(s instanceof RQC_I05_PROVIDER){
				RQC_I05_PROVIDER v = (RQC_I05_PROVIDER) s;
			} 

			else if(s instanceof PPG_PCJ_ORDER_OBSERVATION){
				PPG_PCJ_ORDER_OBSERVATION v = (PPG_PCJ_ORDER_OBSERVATION) s;
			} 

			else if(s instanceof SRM_S07_RESOURCES){
				SRM_S07_RESOURCES v = (SRM_S07_RESOURCES) s;
			} 

			else if(s instanceof RQP_I04_PROVIDER){
				RQP_I04_PROVIDER v = (RQP_I04_PROVIDER) s;
			} 

			else if(s instanceof SRR_S03_SCHEDULE){
				SRR_S03_SCHEDULE v = (SRR_S03_SCHEDULE) s;
			} 

			else if(s instanceof SIU_S22_RESOURCES){
				SIU_S22_RESOURCES v = (SIU_S22_RESOURCES) s;
			} 

			else if(s instanceof SRM_S04_PATIENT){
				SRM_S04_PATIENT v = (SRM_S04_PATIENT) s;
			} 

			else if(s instanceof SRR_S08_LOCATION_RESOURCE){
				SRR_S08_LOCATION_RESOURCE v = (SRR_S08_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof CSU_C11_STUDY_OBSERVATION){
				CSU_C11_STUDY_OBSERVATION v = (CSU_C11_STUDY_OBSERVATION) s;
			} 

			else if(s instanceof PGL_PC8_GOAL_ROLE){
				PGL_PC8_GOAL_ROLE v = (PGL_PC8_GOAL_ROLE) s;
			} 

			else if(s instanceof ADT_A29){
				ADT_A29 v = (ADT_A29) s;
			} 

			else if(s instanceof ADT_A14_PROCEDURE){
				ADT_A14_PROCEDURE v = (ADT_A14_PROCEDURE) s;
			} 

			else if(s instanceof ADT_A27){
				ADT_A27 v = (ADT_A27) s;
			} 

			else if(s instanceof ADT_A28){
				ADT_A28 v = (ADT_A28) s;
			} 

			else if(s instanceof ADR_A19_PROCEDURE){
				ADR_A19_PROCEDURE v = (ADR_A19_PROCEDURE) s;
			} 

			else if(s instanceof QRY_T12){
				QRY_T12 v = (QRY_T12) s;
			} 

			else if(s instanceof PPP_PCB_PROBLEM_ROLE){
				PPP_PCB_PROBLEM_ROLE v = (PPP_PCB_PROBLEM_ROLE) s;
			} 

			else if(s instanceof RQA_I09_VISIT){
				RQA_I09_VISIT v = (RQA_I09_VISIT) s;
			} 

			else if(s instanceof ADT_A21){
				ADT_A21 v = (ADT_A21) s;
			} 

			else if(s instanceof ADT_A22){
				ADT_A22 v = (ADT_A22) s;
			} 

			else if(s instanceof ADT_A20){
				ADT_A20 v = (ADT_A20) s;
			} 

			else if(s instanceof RAS_O01_PATIENT){
				RAS_O01_PATIENT v = (RAS_O01_PATIENT) s;
			} 

			else if(s instanceof SRR_S02_PERSONNEL_RESOURCE){
				SRR_S02_PERSONNEL_RESOURCE v = (SRR_S02_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof ADT_A25){
				ADT_A25 v = (ADT_A25) s;
			} 

			else if(s instanceof RQQ_Q01){
				RQQ_Q01 v = (RQQ_Q01) s;
			} 

			else if(s instanceof ADT_A26){
				ADT_A26 v = (ADT_A26) s;
			} 

			else if(s instanceof ADT_A23){
				ADT_A23 v = (ADT_A23) s;
			} 

			else if(s instanceof SIU_S16_PERSONNEL_RESOURCE){
				SIU_S16_PERSONNEL_RESOURCE v = (SIU_S16_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof ADT_A24){
				ADT_A24 v = (ADT_A24) s;
			} 

			else if(s instanceof CSU_C12_RX_ADMIN){
				CSU_C12_RX_ADMIN v = (CSU_C12_RX_ADMIN) s;
			} 

			else if(s instanceof RDO_O01_PATIENT_VISIT){
				RDO_O01_PATIENT_VISIT v = (RDO_O01_PATIENT_VISIT) s;
			} 

			else if(s instanceof SIU_S22_SERVICE){
				SIU_S22_SERVICE v = (SIU_S22_SERVICE) s;
			} 

			else if(s instanceof SIU_S23_PATIENT){
				SIU_S23_PATIENT v = (SIU_S23_PATIENT) s;
			} 

			else if(s instanceof OMN_O01){
				OMN_O01 v = (OMN_O01) s;
			} 

			else if(s instanceof RPA_I09_RESULTS){
				RPA_I09_RESULTS v = (RPA_I09_RESULTS) s;
			} 

			else if(s instanceof RPA_I10_RESULTS){
				RPA_I10_RESULTS v = (RPA_I10_RESULTS) s;
			} 

			else if(s instanceof PEX_P08_VISIT){
				PEX_P08_VISIT v = (PEX_P08_VISIT) s;
			} 

			else if(s instanceof PPR_PC1_ORDER_DETAIL){
				PPR_PC1_ORDER_DETAIL v = (PPR_PC1_ORDER_DETAIL) s;
			} 

			else if(s instanceof ORU_R01_PATIENT){
				ORU_R01_PATIENT v = (ORU_R01_PATIENT) s;
			} 

			else if(s instanceof SRM_S09_GENERAL_RESOURCE){
				SRM_S09_GENERAL_RESOURCE v = (SRM_S09_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof SRM_S02_LOCATION_RESOURCE){
				SRM_S02_LOCATION_RESOURCE v = (SRM_S02_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof PGL_PC8_ORDER_OBSERVATION){
				PGL_PC8_ORDER_OBSERVATION v = (PGL_PC8_ORDER_OBSERVATION) s;
			} 

			else if(s instanceof ADT_A38){
				ADT_A38 v = (ADT_A38) s;
			} 

			else if(s instanceof ADT_A39){
				ADT_A39 v = (ADT_A39) s;
			} 

			else if(s instanceof RGR_RGR_ENCODING){
				RGR_RGR_ENCODING v = (RGR_RGR_ENCODING) s;
			} 

			else if(s instanceof ORD_O02){
				ORD_O02 v = (ORD_O02) s;
			} 

			else if(s instanceof PGL_PC6_PATIENT_VISIT){
				PGL_PC6_PATIENT_VISIT v = (PGL_PC6_PATIENT_VISIT) s;
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

			else if(s instanceof PRR_PC5){
				PRR_PC5 v = (PRR_PC5) s;
			} 

			else if(s instanceof ADT_A37){
				ADT_A37 v = (ADT_A37) s;
			} 

			else if(s instanceof CSU_C12_VISIT){
				CSU_C12_VISIT v = (CSU_C12_VISIT) s;
			} 

			else if(s instanceof ADT_A34){
				ADT_A34 v = (ADT_A34) s;
			} 

			else if(s instanceof CSU_C12_STUDY_PHARM){
				CSU_C12_STUDY_PHARM v = (CSU_C12_STUDY_PHARM) s;
			} 

			else if(s instanceof ADT_A35){
				ADT_A35 v = (ADT_A35) s;
			} 

			else if(s instanceof SRM_S01_PATIENT){
				SRM_S01_PATIENT v = (SRM_S01_PATIENT) s;
			} 

			else if(s instanceof SUR_P09_FACILITY){
				SUR_P09_FACILITY v = (SUR_P09_FACILITY) s;
			} 

			else if(s instanceof SIU_S24_RESOURCES){
				SIU_S24_RESOURCES v = (SIU_S24_RESOURCES) s;
			} 

			else if(s instanceof SIU_S14_SERVICE){
				SIU_S14_SERVICE v = (SIU_S14_SERVICE) s;
			} 

			else if(s instanceof SRM_S08_SERVICE){
				SRM_S08_SERVICE v = (SRM_S08_SERVICE) s;
			} 

			else if(s instanceof VAR){
				VAR v = (VAR) s;
			} 

			else if(s instanceof RDE_O01_COMPONENT){
				RDE_O01_COMPONENT v = (RDE_O01_COMPONENT) s;
			} 

			else if(s instanceof REF_I14_OBSERVATION){
				REF_I14_OBSERVATION v = (REF_I14_OBSERVATION) s;
			} 

			else if(s instanceof SRM_S05_RESOURCES){
				SRM_S05_RESOURCES v = (SRM_S05_RESOURCES) s;
			} 

			else if(s instanceof MFN_M08_MF_TEST_NUMERIC){
				MFN_M08_MF_TEST_NUMERIC v = (MFN_M08_MF_TEST_NUMERIC) s;
			} 

			else if(s instanceof RDE_O01_INSURANCE){
				RDE_O01_INSURANCE v = (RDE_O01_INSURANCE) s;
			} 

			else if(s instanceof SRR_S08_SERVICE){
				SRR_S08_SERVICE v = (SRR_S08_SERVICE) s;
			} 

			else if(s instanceof BAR_P06_PATIENT){
				BAR_P06_PATIENT v = (BAR_P06_PATIENT) s;
			} 

			else if(s instanceof SRR_S01_PERSONNEL_RESOURCE){
				SRR_S01_PERSONNEL_RESOURCE v = (SRR_S01_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof RPA_I10_INSURANCE){
				RPA_I10_INSURANCE v = (RPA_I10_INSURANCE) s;
			} 

			else if(s instanceof RDO_O01_COMPONENT){
				RDO_O01_COMPONENT v = (RDO_O01_COMPONENT) s;
			} 

			else if(s instanceof CSU_C09_PATIENT){
				CSU_C09_PATIENT v = (CSU_C09_PATIENT) s;
			} 

			else if(s instanceof SIU_S19_PERSONNEL_RESOURCE){
				SIU_S19_PERSONNEL_RESOURCE v = (SIU_S19_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof CSU_C10_STUDY_OBSERVATION){
				CSU_C10_STUDY_OBSERVATION v = (CSU_C10_STUDY_OBSERVATION) s;
			} 

			else if(s instanceof SRM_S03_GENERAL_RESOURCE){
				SRM_S03_GENERAL_RESOURCE v = (SRM_S03_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof PPP_PCC_PROBLEM_OBSERVATION){
				PPP_PCC_PROBLEM_OBSERVATION v = (PPP_PCC_PROBLEM_OBSERVATION) s;
			} 

			else if(s instanceof MFN_M07_MF_PHASE_SCHED_DETAIL){
				MFN_M07_MF_PHASE_SCHED_DETAIL v = (MFN_M07_MF_PHASE_SCHED_DETAIL) s;
			} 

			else if(s instanceof PPR_PC2_GOAL){
				PPR_PC2_GOAL v = (PPR_PC2_GOAL) s;
			} 

			else if(s instanceof RDS_O01){
				RDS_O01 v = (RDS_O01) s;
			} 

			else if(s instanceof SIU_S17_PATIENT){
				SIU_S17_PATIENT v = (SIU_S17_PATIENT) s;
			} 

			else if(s instanceof RQA_I11_OBSERVATION){
				RQA_I11_OBSERVATION v = (RQA_I11_OBSERVATION) s;
			} 

			else if(s instanceof RQA_I10_INSURANCE){
				RQA_I10_INSURANCE v = (RQA_I10_INSURANCE) s;
			} 

			else if(s instanceof SRM_S06_PATIENT){
				SRM_S06_PATIENT v = (SRM_S06_PATIENT) s;
			} 

			else if(s instanceof MRG){
				MRG v = (MRG) s;
			} 

			else if(s instanceof ORF_R02_OBSERVATION){
				ORF_R02_OBSERVATION v = (ORF_R02_OBSERVATION) s;
			} 

			else if(s instanceof RQI_I02_GUARANTOR_INSURANCE){
				RQI_I02_GUARANTOR_INSURANCE v = (RQI_I02_GUARANTOR_INSURANCE) s;
			} 

			else if(s instanceof SIU_S12_PATIENT){
				SIU_S12_PATIENT v = (SIU_S12_PATIENT) s;
			} 

			else if(s instanceof RRI_I15_OBSERVATION){
				RRI_I15_OBSERVATION v = (RRI_I15_OBSERVATION) s;
			} 

			else if(s instanceof SIU_S19_SERVICE){
				SIU_S19_SERVICE v = (SIU_S19_SERVICE) s;
			} 

			else if(s instanceof SRR_S06_PATIENT){
				SRR_S06_PATIENT v = (SRR_S06_PATIENT) s;
			} 

			else if(s instanceof SQM_S25_LOCATION_RESOURCE){
				SQM_S25_LOCATION_RESOURCE v = (SQM_S25_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof MSA){
				MSA v = (MSA) s;
			} 

			else if(s instanceof CSU_C10_PATIENT){
				CSU_C10_PATIENT v = (CSU_C10_PATIENT) s;
			} 

			else if(s instanceof ORU_R01_OBSERVATION){
				ORU_R01_OBSERVATION v = (ORU_R01_OBSERVATION) s;
			} 

			else if(s instanceof RPA_I09_AUTHORIZATION){
				RPA_I09_AUTHORIZATION v = (RPA_I09_AUTHORIZATION) s;
			} 

			else if(s instanceof MSH){
				MSH v = (MSH) s;
			} 

			else if(s instanceof OMD_O01_OBSERVATION){
				OMD_O01_OBSERVATION v = (OMD_O01_OBSERVATION) s;
			} 

			else if(s instanceof SIU_S20_SERVICE){
				SIU_S20_SERVICE v = (SIU_S20_SERVICE) s;
			} 

			else if(s instanceof SRM_S06_RESOURCES){
				SRM_S06_RESOURCES v = (SRM_S06_RESOURCES) s;
			} 

			else if(s instanceof RAR_RAR_ENCODING){
				RAR_RAR_ENCODING v = (RAR_RAR_ENCODING) s;
			} 

			else if(s instanceof SIU_S23_RESOURCES){
				SIU_S23_RESOURCES v = (SIU_S23_RESOURCES) s;
			} 

			else if(s instanceof SRM_S04_GENERAL_RESOURCE){
				SRM_S04_GENERAL_RESOURCE v = (SRM_S04_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof RPA_I11_INSURANCE){
				RPA_I11_INSURANCE v = (RPA_I11_INSURANCE) s;
			} 

			else if(s instanceof SRM_S03_RESOURCES){
				SRM_S03_RESOURCES v = (SRM_S03_RESOURCES) s;
			} 

			else if(s instanceof PPP_PCC_ORDER_DETAIL){
				PPP_PCC_ORDER_DETAIL v = (PPP_PCC_ORDER_DETAIL) s;
			} 

			else if(s instanceof SRM_S02_PERSONNEL_RESOURCE){
				SRM_S02_PERSONNEL_RESOURCE v = (SRM_S02_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof SIU_S26_RESOURCES){
				SIU_S26_RESOURCES v = (SIU_S26_RESOURCES) s;
			} 

			else if(s instanceof PPG_PCJ_PROBLEM_ROLE){
				PPG_PCJ_PROBLEM_ROLE v = (PPG_PCJ_PROBLEM_ROLE) s;
			} 

			else if(s instanceof BAR_P01_PROCEDURE){
				BAR_P01_PROCEDURE v = (BAR_P01_PROCEDURE) s;
			} 

			else if(s instanceof VQQ_Q01){
				VQQ_Q01 v = (VQQ_Q01) s;
			} 

			else if(s instanceof REF_I14_PROCEDURE){
				REF_I14_PROCEDURE v = (REF_I14_PROCEDURE) s;
			} 

			else if(s instanceof SRM_S10_LOCATION_RESOURCE){
				SRM_S10_LOCATION_RESOURCE v = (SRM_S10_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof RQA_I09){
				RQA_I09 v = (RQA_I09) s;
			} 

			else if(s instanceof SRM_S06_SERVICE){
				SRM_S06_SERVICE v = (SRM_S06_SERVICE) s;
			} 

			else if(s instanceof RQA_I08){
				RQA_I08 v = (RQA_I08) s;
			} 

			else if(s instanceof RDO_O01_ORDER_DETAIL){
				RDO_O01_ORDER_DETAIL v = (RDO_O01_ORDER_DETAIL) s;
			} 

			else if(s instanceof SRR_S01_PATIENT){
				SRR_S01_PATIENT v = (SRR_S01_PATIENT) s;
			} 

			else if(s instanceof PPP_PCC_PATIENT_VISIT){
				PPP_PCC_PATIENT_VISIT v = (PPP_PCC_PATIENT_VISIT) s;
			} 

			else if(s instanceof SIU_S14_LOCATION_RESOURCE){
				SIU_S14_LOCATION_RESOURCE v = (SIU_S14_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof PPR_PC1_GOAL_OBSERVATION){
				PPR_PC1_GOAL_OBSERVATION v = (PPR_PC1_GOAL_OBSERVATION) s;
			} 

			else if(s instanceof RQA_I09_PROVIDER){
				RQA_I09_PROVIDER v = (RQA_I09_PROVIDER) s;
			} 

			else if(s instanceof RQA_I08_INSURANCE){
				RQA_I08_INSURANCE v = (RQA_I08_INSURANCE) s;
			} 

			else if(s instanceof SIU_S13_LOCATION_RESOURCE){
				SIU_S13_LOCATION_RESOURCE v = (SIU_S13_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof MFN_M11_MF_TEST_CALC_DETAIL){
				MFN_M11_MF_TEST_CALC_DETAIL v = (MFN_M11_MF_TEST_CALC_DETAIL) s;
			} 

			else if(s instanceof PGL_PC8_GOAL){
				PGL_PC8_GOAL v = (PGL_PC8_GOAL) s;
			} 

			else if(s instanceof ERP_Q01){
				ERP_Q01 v = (ERP_Q01) s;
			} 

			else if(s instanceof PPG_PCH_ORDER_OBSERVATION){
				PPG_PCH_ORDER_OBSERVATION v = (PPG_PCH_ORDER_OBSERVATION) s;
			} 

			else if(s instanceof REF_I15_PROCEDURE){
				REF_I15_PROCEDURE v = (REF_I15_PROCEDURE) s;
			} 

			else if(s instanceof PGL_PC7_PATHWAY){
				PGL_PC7_PATHWAY v = (PGL_PC7_PATHWAY) s;
			} 

			else if(s instanceof PPP_PCD_GOAL_ROLE){
				PPP_PCD_GOAL_ROLE v = (PPP_PCD_GOAL_ROLE) s;
			} 

			else if(s instanceof SRM_S11_LOCATION_RESOURCE){
				SRM_S11_LOCATION_RESOURCE v = (SRM_S11_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof RPA_I11_PROVIDER){
				RPA_I11_PROVIDER v = (RPA_I11_PROVIDER) s;
			} 

			else if(s instanceof IN2){
				IN2 v = (IN2) s;
			} 

			else if(s instanceof RPI_I04_GUARANTOR_INSURANCE){
				RPI_I04_GUARANTOR_INSURANCE v = (RPI_I04_GUARANTOR_INSURANCE) s;
			} 

			else if(s instanceof IN1){
				IN1 v = (IN1) s;
			} 

			else if(s instanceof PPP_PCD_PROBLEM_ROLE){
				PPP_PCD_PROBLEM_ROLE v = (PPP_PCD_PROBLEM_ROLE) s;
			} 

			else if(s instanceof IN3){
				IN3 v = (IN3) s;
			} 

			else if(s instanceof PRR_PC5_PROBLEM_ROLE){
				PRR_PC5_PROBLEM_ROLE v = (PRR_PC5_PROBLEM_ROLE) s;
			} 

			else if(s instanceof SIU_S15_GENERAL_RESOURCE){
				SIU_S15_GENERAL_RESOURCE v = (SIU_S15_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof SRR_S03_SERVICE){
				SRR_S03_SERVICE v = (SRR_S03_SERVICE) s;
			} 

			else if(s instanceof RAS_O01_ENCODING){
				RAS_O01_ENCODING v = (RAS_O01_ENCODING) s;
			} 

			else if(s instanceof ORN_O02_PATIENT){
				ORN_O02_PATIENT v = (ORN_O02_PATIENT) s;
			} 

			else if(s instanceof RDE_O01_ORDER){
				RDE_O01_ORDER v = (RDE_O01_ORDER) s;
			} 

			else if(s instanceof VXR_V03_INSURANCE){
				VXR_V03_INSURANCE v = (VXR_V03_INSURANCE) s;
			} 

			else if(s instanceof RRI_I13_RESULTS){
				RRI_I13_RESULTS v = (RRI_I13_RESULTS) s;
			} 

			else if(s instanceof PPP_PCB_PATHWAY){
				PPP_PCB_PATHWAY v = (PPP_PCB_PATHWAY) s;
			} 

			else if(s instanceof REF_I12_RESULTS){
				REF_I12_RESULTS v = (REF_I12_RESULTS) s;
			} 

			else if(s instanceof SRM_S04_RESOURCES){
				SRM_S04_RESOURCES v = (SRM_S04_RESOURCES) s;
			} 

			else if(s instanceof RQA_I08_OBSERVATION){
				RQA_I08_OBSERVATION v = (RQA_I08_OBSERVATION) s;
			} 

			else if(s instanceof SRM_S01_SERVICE){
				SRM_S01_SERVICE v = (SRM_S01_SERVICE) s;
			} 

			else if(s instanceof SRR_S08_GENERAL_RESOURCE){
				SRR_S08_GENERAL_RESOURCE v = (SRR_S08_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof SRR_S06_LOCATION_RESOURCE){
				SRR_S06_LOCATION_RESOURCE v = (SRR_S06_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof PEX_P08_RX_ORDER){
				PEX_P08_RX_ORDER v = (PEX_P08_RX_ORDER) s;
			} 

			else if(s instanceof CRM_C05_PATIENT){
				CRM_C05_PATIENT v = (CRM_C05_PATIENT) s;
			} 

			else if(s instanceof RQA_I10_AUTHORIZATION){
				RQA_I10_AUTHORIZATION v = (RQA_I10_AUTHORIZATION) s;
			} 

			else if(s instanceof RQA_I11_INSURANCE){
				RQA_I11_INSURANCE v = (RQA_I11_INSURANCE) s;
			} 

			else if(s instanceof PGL_PC6){
				PGL_PC6 v = (PGL_PC6) s;
			} 

			else if(s instanceof PGL_PC8){
				PGL_PC8 v = (PGL_PC8) s;
			} 

			else if(s instanceof RQA_I09_INSURANCE){
				RQA_I09_INSURANCE v = (RQA_I09_INSURANCE) s;
			} 

			else if(s instanceof PGL_PC7){
				PGL_PC7 v = (PGL_PC7) s;
			} 

			else if(s instanceof ADT_A39_PATIENT){
				ADT_A39_PATIENT v = (ADT_A39_PATIENT) s;
			} 

			else if(s instanceof ORM_O01_PATIENT){
				ORM_O01_PATIENT v = (ORM_O01_PATIENT) s;
			} 

			else if(s instanceof RQA_I11){
				RQA_I11 v = (RQA_I11) s;
			} 

			else if(s instanceof RQA_I10){
				RQA_I10 v = (RQA_I10) s;
			} 

			else if(s instanceof ADT_A40_PATIENT){
				ADT_A40_PATIENT v = (ADT_A40_PATIENT) s;
			} 

			else if(s instanceof PPP_PCC_PATHWAY_ROLE){
				PPP_PCC_PATHWAY_ROLE v = (PPP_PCC_PATHWAY_ROLE) s;
			} 

			else if(s instanceof RRA_O02_ADMINISTRATION){
				RRA_O02_ADMINISTRATION v = (RRA_O02_ADMINISTRATION) s;
			} 

			else if(s instanceof RRI_I14_RESULTS){
				RRI_I14_RESULTS v = (RRI_I14_RESULTS) s;
			} 

			else if(s instanceof SIU_S14_GENERAL_RESOURCE){
				SIU_S14_GENERAL_RESOURCE v = (SIU_S14_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof RRI_I12_PROVIDER){
				RRI_I12_PROVIDER v = (RRI_I12_PROVIDER) s;
			} 

			else if(s instanceof CDM){
				CDM v = (CDM) s;
			} 

			else if(s instanceof OMN_O01_PATIENT_VISIT){
				OMN_O01_PATIENT_VISIT v = (OMN_O01_PATIENT_VISIT) s;
			} 

			else if(s instanceof RAR_RAR_PATIENT){
				RAR_RAR_PATIENT v = (RAR_RAR_PATIENT) s;
			} 

			else if(s instanceof PPR_PC2){
				PPR_PC2 v = (PPR_PC2) s;
			} 

			else if(s instanceof RQA_I09_PROCEDURE){
				RQA_I09_PROCEDURE v = (RQA_I09_PROCEDURE) s;
			} 

			else if(s instanceof PPR_PC3){
				PPR_PC3 v = (PPR_PC3) s;
			} 

			else if(s instanceof PPR_PC1){
				PPR_PC1 v = (PPR_PC1) s;
			} 

			else if(s instanceof OSR_Q06){
				OSR_Q06 v = (OSR_Q06) s;
			} 

			else if(s instanceof CSU_C10_RX_ADMIN){
				CSU_C10_RX_ADMIN v = (CSU_C10_RX_ADMIN) s;
			} 

			else if(s instanceof SRR_S11_LOCATION_RESOURCE){
				SRR_S11_LOCATION_RESOURCE v = (SRR_S11_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof RQA_I10_PROVIDER){
				RQA_I10_PROVIDER v = (RQA_I10_PROVIDER) s;
			} 

			else if(s instanceof RRI_I14_AUTHORIZATION){
				RRI_I14_AUTHORIZATION v = (RRI_I14_AUTHORIZATION) s;
			} 

			else if(s instanceof MFK_M01_MF){
				MFK_M01_MF v = (MFK_M01_MF) s;
			} 

			else if(s instanceof RPI_I04_INSURANCE){
				RPI_I04_INSURANCE v = (RPI_I04_INSURANCE) s;
			} 

			else if(s instanceof RQA_I11_RESULTS){
				RQA_I11_RESULTS v = (RQA_I11_RESULTS) s;
			} 

			else if(s instanceof PGL_PC8_ORDER){
				PGL_PC8_ORDER v = (PGL_PC8_ORDER) s;
			} 

			else if(s instanceof ADR_A19_INSURANCE){
				ADR_A19_INSURANCE v = (ADR_A19_INSURANCE) s;
			} 

			else if(s instanceof PPG_PCJ_ORDER){
				PPG_PCJ_ORDER v = (PPG_PCJ_ORDER) s;
			} 

			else if(s instanceof VXU_V04){
				VXU_V04 v = (VXU_V04) s;
			} 

			else if(s instanceof RQP_I04){
				RQP_I04 v = (RQP_I04) s;
			} 

			else if(s instanceof PPP_PCD_PROBLEM_OBSERVATION){
				PPP_PCD_PROBLEM_OBSERVATION v = (PPP_PCD_PROBLEM_OBSERVATION) s;
			} 

			else if(s instanceof SIU_S18_LOCATION_RESOURCE){
				SIU_S18_LOCATION_RESOURCE v = (SIU_S18_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof SRM_S05_GENERAL_RESOURCE){
				SRM_S05_GENERAL_RESOURCE v = (SRM_S05_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof PPG_PCJ_GOAL_ROLE){
				PPG_PCJ_GOAL_ROLE v = (PPG_PCJ_GOAL_ROLE) s;
			} 

			else if(s instanceof PPR_PC2_ORDER){
				PPR_PC2_ORDER v = (PPR_PC2_ORDER) s;
			} 

			else if(s instanceof PPV_PCA_GOAL){
				PPV_PCA_GOAL v = (PPV_PCA_GOAL) s;
			} 

			else if(s instanceof SRR_S02_PATIENT){
				SRR_S02_PATIENT v = (SRR_S02_PATIENT) s;
			} 

			else if(s instanceof RPA_I10_VISIT){
				RPA_I10_VISIT v = (RPA_I10_VISIT) s;
			} 

			else if(s instanceof RRD_O02_ORDER){
				RRD_O02_ORDER v = (RRD_O02_ORDER) s;
			} 

			else if(s instanceof RRO_O02_ORDER){
				RRO_O02_ORDER v = (RRO_O02_ORDER) s;
			} 

			else if(s instanceof RRI_I14_PROCEDURE){
				RRI_I14_PROCEDURE v = (RRI_I14_PROCEDURE) s;
			} 

			else if(s instanceof ORD_O02_RESPONSE){
				ORD_O02_RESPONSE v = (ORD_O02_RESPONSE) s;
			} 

			else if(s instanceof ORU_R01_RESPONSE){
				ORU_R01_RESPONSE v = (ORU_R01_RESPONSE) s;
			} 

			else if(s instanceof SRR_S07_GENERAL_RESOURCE){
				SRR_S07_GENERAL_RESOURCE v = (SRR_S07_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof RDF){
				RDF v = (RDF) s;
			} 

			else if(s instanceof RPA_I08_PROVIDER){
				RPA_I08_PROVIDER v = (RPA_I08_PROVIDER) s;
			} 

			else if(s instanceof PTR_PCF_PATIENT_VISIT){
				PTR_PCF_PATIENT_VISIT v = (PTR_PCF_PATIENT_VISIT) s;
			} 

			else if(s instanceof ACC){
				ACC v = (ACC) s;
			} 

			else if(s instanceof RDT){
				RDT v = (RDT) s;
			} 

			else if(s instanceof GOL){
				GOL v = (GOL) s;
			} 

			else if(s instanceof ACK){
				ACK v = (ACK) s;
			} 

			else if(s instanceof SRR_S02_SCHEDULE){
				SRR_S02_SCHEDULE v = (SRR_S02_SCHEDULE) s;
			} 

			else if(s instanceof ROR_ROR_PATIENT){
				ROR_ROR_PATIENT v = (ROR_ROR_PATIENT) s;
			} 

			else if(s instanceof SIU_S24_SERVICE){
				SIU_S24_SERVICE v = (SIU_S24_SERVICE) s;
			} 

			else if(s instanceof SRM_S08_PERSONNEL_RESOURCE){
				SRM_S08_PERSONNEL_RESOURCE v = (SRM_S08_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof RF1){
				RF1 v = (RF1) s;
			} 

			else if(s instanceof PEX_P08_RX_ADMINISTRATION){
				PEX_P08_RX_ADMINISTRATION v = (PEX_P08_RX_ADMINISTRATION) s;
			} 

			else if(s instanceof ADD){
				ADD v = (ADD) s;
			} 

			else if(s instanceof ADT_A07_INSURANCE){
				ADT_A07_INSURANCE v = (ADT_A07_INSURANCE) s;
			} 

			else if(s instanceof SRR_S05_PATIENT){
				SRR_S05_PATIENT v = (SRR_S05_PATIENT) s;
			} 

			else if(s instanceof RRG_O02_PATIENT){
				RRG_O02_PATIENT v = (RRG_O02_PATIENT) s;
			} 

			else if(s instanceof SIU_S23_PERSONNEL_RESOURCE){
				SIU_S23_PERSONNEL_RESOURCE v = (SIU_S23_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof RQI_I02_INSURANCE){
				RQI_I02_INSURANCE v = (RQI_I02_INSURANCE) s;
			} 

			else if(s instanceof PTR_PCF_ORDER_OBSERVATION){
				PTR_PCF_ORDER_OBSERVATION v = (PTR_PCF_ORDER_OBSERVATION) s;
			} 

			else if(s instanceof SRR_S09_RESOURCES){
				SRR_S09_RESOURCES v = (SRR_S09_RESOURCES) s;
			} 

			else if(s instanceof REF_I13_RESULTS){
				REF_I13_RESULTS v = (REF_I13_RESULTS) s;
			} 

			else if(s instanceof PPR_PC3_PROBLEM){
				PPR_PC3_PROBLEM v = (PPR_PC3_PROBLEM) s;
			} 

			else if(s instanceof RRA_O02_PATIENT){
				RRA_O02_PATIENT v = (RRA_O02_PATIENT) s;
			} 

			else if(s instanceof RER_RER){
				RER_RER v = (RER_RER) s;
			} 

			else if(s instanceof RAS_O01_ORDER_DETAIL){
				RAS_O01_ORDER_DETAIL v = (RAS_O01_ORDER_DETAIL) s;
			} 

			else if(s instanceof SRR_S02_RESOURCES){
				SRR_S02_RESOURCES v = (SRR_S02_RESOURCES) s;
			} 

			else if(s instanceof OSQ_Q06){
				OSQ_Q06 v = (OSQ_Q06) s;
			} 

			else if(s instanceof ORM_O01_ORDER_DETAIL){
				ORM_O01_ORDER_DETAIL v = (ORM_O01_ORDER_DETAIL) s;
			} 

			else if(s instanceof PPT_PCL_PATIENT_VISIT){
				PPT_PCL_PATIENT_VISIT v = (PPT_PCL_PATIENT_VISIT) s;
			} 

			else if(s instanceof SRM_S10_RESOURCES){
				SRM_S10_RESOURCES v = (SRM_S10_RESOURCES) s;
			} 

			else if(s instanceof SIU_S16_SERVICE){
				SIU_S16_SERVICE v = (SIU_S16_SERVICE) s;
			} 

			else if(s instanceof RPI_I01_GUARANTOR_INSURANCE){
				RPI_I01_GUARANTOR_INSURANCE v = (RPI_I01_GUARANTOR_INSURANCE) s;
			} 

			else if(s instanceof SIU_S12_LOCATION_RESOURCE){
				SIU_S12_LOCATION_RESOURCE v = (SIU_S12_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof SRR_S06_PERSONNEL_RESOURCE){
				SRR_S06_PERSONNEL_RESOURCE v = (SRR_S06_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof OMN_O01_ORDER){
				OMN_O01_ORDER v = (OMN_O01_ORDER) s;
			} 

			else if(s instanceof PEX_P07_EXPERIENCE){
				PEX_P07_EXPERIENCE v = (PEX_P07_EXPERIENCE) s;
			} 

			else if(s instanceof SRM_S01_RESOURCES){
				SRM_S01_RESOURCES v = (SRM_S01_RESOURCES) s;
			} 

			else if(s instanceof PPR_PC3_GOAL_OBSERVATION){
				PPR_PC3_GOAL_OBSERVATION v = (PPR_PC3_GOAL_OBSERVATION) s;
			} 

			else if(s instanceof REF_I13_PROVIDER){
				REF_I13_PROVIDER v = (REF_I13_PROVIDER) s;
			} 

			else if(s instanceof SIU_S21_RESOURCES){
				SIU_S21_RESOURCES v = (SIU_S21_RESOURCES) s;
			} 

			else if(s instanceof RPA_I10_PROVIDER){
				RPA_I10_PROVIDER v = (RPA_I10_PROVIDER) s;
			} 

			else if(s instanceof PTR_PCF_PATIENT){
				PTR_PCF_PATIENT v = (PTR_PCF_PATIENT) s;
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

			else if(s instanceof SRM_S08_RESOURCES){
				SRM_S08_RESOURCES v = (SRM_S08_RESOURCES) s;
			} 

			else if(s instanceof PPP_PCB_PATHWAY_ROLE){
				PPP_PCB_PATHWAY_ROLE v = (PPP_PCB_PATHWAY_ROLE) s;
			} 

			else if(s instanceof PPG_PCH_GOAL){
				PPG_PCH_GOAL v = (PPG_PCH_GOAL) s;
			} 

			else if(s instanceof PEX_P08_ASSOCIATED_RX_ADMIN){
				PEX_P08_ASSOCIATED_RX_ADMIN v = (PEX_P08_ASSOCIATED_RX_ADMIN) s;
			} 

			else if(s instanceof SRR_S11_RESOURCES){
				SRR_S11_RESOURCES v = (SRR_S11_RESOURCES) s;
			} 

			else if(s instanceof SIU_S22_PERSONNEL_RESOURCE){
				SIU_S22_PERSONNEL_RESOURCE v = (SIU_S22_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof RRI_I12_VISIT){
				RRI_I12_VISIT v = (RRI_I12_VISIT) s;
			} 

			else if(s instanceof CSU_C12_PATIENT){
				CSU_C12_PATIENT v = (CSU_C12_PATIENT) s;
			} 

			else if(s instanceof RRE_O01_ORDER){
				RRE_O01_ORDER v = (RRE_O01_ORDER) s;
			} 

			else if(s instanceof PDC){
				PDC v = (PDC) s;
			} 

			else if(s instanceof SIU_S13_SERVICE){
				SIU_S13_SERVICE v = (SIU_S13_SERVICE) s;
			} 

			else if(s instanceof PPR_PC2_GOAL_ROLE){
				PPR_PC2_GOAL_ROLE v = (PPR_PC2_GOAL_ROLE) s;
			} 

			else if(s instanceof SIU_S17_GENERAL_RESOURCE){
				SIU_S17_GENERAL_RESOURCE v = (SIU_S17_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof RGV_O01_ORDER_DETAIL_SUPPLEMENT){
				RGV_O01_ORDER_DETAIL_SUPPLEMENT v = (RGV_O01_ORDER_DETAIL_SUPPLEMENT) s;
			} 

			else if(s instanceof REF_I13_PROCEDURE){
				REF_I13_PROCEDURE v = (REF_I13_PROCEDURE) s;
			} 

			else if(s instanceof RDE_O01_OBSERVATION){
				RDE_O01_OBSERVATION v = (RDE_O01_OBSERVATION) s;
			} 

			else if(s instanceof SIU_S12_PERSONNEL_RESOURCE){
				SIU_S12_PERSONNEL_RESOURCE v = (SIU_S12_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof SIU_S18_PERSONNEL_RESOURCE){
				SIU_S18_PERSONNEL_RESOURCE v = (SIU_S18_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof SRM_S10_PATIENT){
				SRM_S10_PATIENT v = (SRM_S10_PATIENT) s;
			} 

			else if(s instanceof SRR_S07_PERSONNEL_RESOURCE){
				SRR_S07_PERSONNEL_RESOURCE v = (SRR_S07_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof PPG_PCH_GOAL_OBSERVATION){
				PPG_PCH_GOAL_OBSERVATION v = (PPG_PCH_GOAL_OBSERVATION) s;
			} 

			else if(s instanceof RQC_I05){
				RQC_I05 v = (RQC_I05) s;
			} 

			else if(s instanceof RGV_O01_PATIENT){
				RGV_O01_PATIENT v = (RGV_O01_PATIENT) s;
			} 

			else if(s instanceof GT1){
				GT1 v = (GT1) s;
			} 

			else if(s instanceof VXU_V04_OBSERVATION){
				VXU_V04_OBSERVATION v = (VXU_V04_OBSERVATION) s;
			} 

			else if(s instanceof RQC_I06){
				RQC_I06 v = (RQC_I06) s;
			} 

			else if(s instanceof SRR_S11_PERSONNEL_RESOURCE){
				SRR_S11_PERSONNEL_RESOURCE v = (SRR_S11_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof ORF_R02_PATIENT){
				ORF_R02_PATIENT v = (ORF_R02_PATIENT) s;
			} 

			else if(s instanceof SQR_S25_RESOURCES){
				SQR_S25_RESOURCES v = (SQR_S25_RESOURCES) s;
			} 

			else if(s instanceof PPP_PCC_ORDER){
				PPP_PCC_ORDER v = (PPP_PCC_ORDER) s;
			} 

			else if(s instanceof MFN_M01_MF){
				MFN_M01_MF v = (MFN_M01_MF) s;
			} 

			else if(s instanceof SRR_S08_PATIENT){
				SRR_S08_PATIENT v = (SRR_S08_PATIENT) s;
			} 

			else if(s instanceof PPP_PCB_ORDER_DETAIL){
				PPP_PCB_ORDER_DETAIL v = (PPP_PCB_ORDER_DETAIL) s;
			} 

			else if(s instanceof PPT_PCL_ORDER){
				PPT_PCL_ORDER v = (PPT_PCL_ORDER) s;
			} 

			else if(s instanceof PEO){
				PEO v = (PEO) s;
			} 

			else if(s instanceof OMD_O01_PATIENT_VISIT){
				OMD_O01_PATIENT_VISIT v = (OMD_O01_PATIENT_VISIT) s;
			} 

			else if(s instanceof PES){
				PES v = (PES) s;
			} 

			else if(s instanceof CM1){
				CM1 v = (CM1) s;
			} 

			else if(s instanceof CM0){
				CM0 v = (CM0) s;
			} 

			else if(s instanceof REF_I15_OBSERVATION){
				REF_I15_OBSERVATION v = (REF_I15_OBSERVATION) s;
			} 

			else if(s instanceof CM2){
				CM2 v = (CM2) s;
			} 

			else if(s instanceof REF_I12_OBSERVATION){
				REF_I12_OBSERVATION v = (REF_I12_OBSERVATION) s;
			} 

			else if(s instanceof PPT_PCL){
				PPT_PCL v = (PPT_PCL) s;
			} 

			else if(s instanceof SIU_S16_RESOURCES){
				SIU_S16_RESOURCES v = (SIU_S16_RESOURCES) s;
			} 

			else if(s instanceof PGL_PC7_ORDER_DETAIL){
				PGL_PC7_ORDER_DETAIL v = (PGL_PC7_ORDER_DETAIL) s;
			} 

			else if(s instanceof PPT_PCL_PATIENT){
				PPT_PCL_PATIENT v = (PPT_PCL_PATIENT) s;
			} 

			else if(s instanceof CSU_C11_STUDY_SCHEDULE){
				CSU_C11_STUDY_SCHEDULE v = (CSU_C11_STUDY_SCHEDULE) s;
			} 

			else if(s instanceof UDM_Q05){
				UDM_Q05 v = (UDM_Q05) s;
			} 

			else if(s instanceof SIU_S26_PATIENT){
				SIU_S26_PATIENT v = (SIU_S26_PATIENT) s;
			} 

			else if(s instanceof ROR_ROR_ORDER){
				ROR_ROR_ORDER v = (ROR_ROR_ORDER) s;
			} 

			else if(s instanceof ROR_ROR){
				ROR_ROR v = (ROR_ROR) s;
			} 

			else if(s instanceof CRM_C03_PATIENT){
				CRM_C03_PATIENT v = (CRM_C03_PATIENT) s;
			} 

			else if(s instanceof ADT_A08_PROCEDURE){
				ADT_A08_PROCEDURE v = (ADT_A08_PROCEDURE) s;
			} 

			else if(s instanceof SRR_S05_SCHEDULE){
				SRR_S05_SCHEDULE v = (SRR_S05_SCHEDULE) s;
			} 

			else if(s instanceof ADT_AXX){
				ADT_AXX v = (ADT_AXX) s;
			} 

			else if(s instanceof VXU_V04_PATIENT){
				VXU_V04_PATIENT v = (VXU_V04_PATIENT) s;
			} 

			else if(s instanceof AIG){
				AIG v = (AIG) s;
			} 

			else if(s instanceof EQL){
				EQL v = (EQL) s;
			} 

			else if(s instanceof AIL){
				AIL v = (AIL) s;
			} 

			else if(s instanceof PPR_PC2_PROBLEM_OBSERVATION){
				PPR_PC2_PROBLEM_OBSERVATION v = (PPR_PC2_PROBLEM_OBSERVATION) s;
			} 

			else if(s instanceof AIP){
				AIP v = (AIP) s;
			} 

			else if(s instanceof RRE_O01_ENCODING){
				RRE_O01_ENCODING v = (RRE_O01_ENCODING) s;
			} 

			else if(s instanceof AIS){
				AIS v = (AIS) s;
			} 

			else if(s instanceof SRM_S08_GENERAL_RESOURCE){
				SRM_S08_GENERAL_RESOURCE v = (SRM_S08_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof ADT_A43_PATIENT){
				ADT_A43_PATIENT v = (ADT_A43_PATIENT) s;
			} 

			else if(s instanceof SIU_S15_RESOURCES){
				SIU_S15_RESOURCES v = (SIU_S15_RESOURCES) s;
			} 

			else if(s instanceof SRR_S04_GENERAL_RESOURCE){
				SRR_S04_GENERAL_RESOURCE v = (SRR_S04_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof NCK){
				NCK v = (NCK) s;
			} 

			else if(s instanceof RQA_I08_PROVIDER){
				RQA_I08_PROVIDER v = (RQA_I08_PROVIDER) s;
			} 

			else if(s instanceof PGL_PC6_ORDER_DETAIL){
				PGL_PC6_ORDER_DETAIL v = (PGL_PC6_ORDER_DETAIL) s;
			} 

			else if(s instanceof RAR_RAR_DEFINITION){
				RAR_RAR_DEFINITION v = (RAR_RAR_DEFINITION) s;
			} 

			else if(s instanceof ERR){
				ERR v = (ERR) s;
			} 

			else if(s instanceof ERQ){
				ERQ v = (ERQ) s;
			} 

			else if(s instanceof SRR_S05_SERVICE){
				SRR_S05_SERVICE v = (SRR_S05_SERVICE) s;
			} 

			else if(s instanceof PPP_PCD_PATHWAY){
				PPP_PCD_PATHWAY v = (PPP_PCD_PATHWAY) s;
			} 

			else if(s instanceof CSU_C09_STUDY_PHASE){
				CSU_C09_STUDY_PHASE v = (CSU_C09_STUDY_PHASE) s;
			} 

			else if(s instanceof RRI_I12_OBSERVATION){
				RRI_I12_OBSERVATION v = (RRI_I12_OBSERVATION) s;
			} 

			else if(s instanceof Hxx){
				Hxx v = (Hxx) s;
			} 

			else if(s instanceof RQA_I11_PROCEDURE){
				RQA_I11_PROCEDURE v = (RQA_I11_PROCEDURE) s;
			} 

			else if(s instanceof ADT_A28_INSURANCE){
				ADT_A28_INSURANCE v = (ADT_A28_INSURANCE) s;
			} 

			else if(s instanceof RRI_I13_OBSERVATION){
				RRI_I13_OBSERVATION v = (RRI_I13_OBSERVATION) s;
			} 

			else if(s instanceof ORF_R04_OBSERVATION){
				ORF_R04_OBSERVATION v = (ORF_R04_OBSERVATION) s;
			} 

			else if(s instanceof VTQ){
				VTQ v = (VTQ) s;
			} 

			else if(s instanceof SRM_S03_SERVICE){
				SRM_S03_SERVICE v = (SRM_S03_SERVICE) s;
			} 

			else if(s instanceof RQA_I10_PROCEDURE){
				RQA_I10_PROCEDURE v = (RQA_I10_PROCEDURE) s;
			} 

			else if(s instanceof SQM_S25_GENERAL_RESOURCE){
				SQM_S25_GENERAL_RESOURCE v = (SQM_S25_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof SQR_S25_SERVICE){
				SQR_S25_SERVICE v = (SQR_S25_SERVICE) s;
			} 

			else if(s instanceof RDR_RDR_DEFINITION){
				RDR_RDR_DEFINITION v = (RDR_RDR_DEFINITION) s;
			} 

			else if(s instanceof CSU_C09_STUDY_PHARM){
				CSU_C09_STUDY_PHARM v = (CSU_C09_STUDY_PHARM) s;
			} 

			else if(s instanceof PPV_PCA_ORDER_DETAIL){
				PPV_PCA_ORDER_DETAIL v = (PPV_PCA_ORDER_DETAIL) s;
			} 

			else if(s instanceof RDS_O01_PATIENT){
				RDS_O01_PATIENT v = (RDS_O01_PATIENT) s;
			} 

			else if(s instanceof SIU_S19_RESOURCES){
				SIU_S19_RESOURCES v = (SIU_S19_RESOURCES) s;
			} 

			else if(s instanceof SRR_S11_SERVICE){
				SRR_S11_SERVICE v = (SRR_S11_SERVICE) s;
			} 

			else if(s instanceof AL1){
				AL1 v = (AL1) s;
			} 

			else if(s instanceof SRM_S01_PERSONNEL_RESOURCE){
				SRM_S01_PERSONNEL_RESOURCE v = (SRM_S01_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof PRR_PC5_GOAL_OBSERVATION){
				PRR_PC5_GOAL_OBSERVATION v = (PRR_PC5_GOAL_OBSERVATION) s;
			} 

			else if(s instanceof SRM_S11_SERVICE){
				SRM_S11_SERVICE v = (SRM_S11_SERVICE) s;
			} 

			else if(s instanceof RQA_I09_RESULTS){
				RQA_I09_RESULTS v = (RQA_I09_RESULTS) s;
			} 

			else if(s instanceof PID){
				PID v = (PID) s;
			} 

			else if(s instanceof PPG_PCH_PROBLEM_ROLE){
				PPG_PCH_PROBLEM_ROLE v = (PPG_PCH_PROBLEM_ROLE) s;
			} 

			else if(s instanceof SIU_S21_PATIENT){
				SIU_S21_PATIENT v = (SIU_S21_PATIENT) s;
			} 

			else if(s instanceof RPA_I11_VISIT){
				RPA_I11_VISIT v = (RPA_I11_VISIT) s;
			} 

			else if(s instanceof PPT_PCL_PROBLEM_ROLE){
				PPT_PCL_PROBLEM_ROLE v = (PPT_PCL_PROBLEM_ROLE) s;
			} 

			else if(s instanceof RRI_I12_AUTHORIZATION){
				RRI_I12_AUTHORIZATION v = (RRI_I12_AUTHORIZATION) s;
			} 

			else if(s instanceof RDO_O01_PATIENT){
				RDO_O01_PATIENT v = (RDO_O01_PATIENT) s;
			} 

			else if(s instanceof ADT_A13_PROCEDURE){
				ADT_A13_PROCEDURE v = (ADT_A13_PROCEDURE) s;
			} 

			else if(s instanceof SRM_S07_PERSONNEL_RESOURCE){
				SRM_S07_PERSONNEL_RESOURCE v = (SRM_S07_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof PPP_PCB_PROBLEM){
				PPP_PCB_PROBLEM v = (PPP_PCB_PROBLEM) s;
			} 

			else if(s instanceof SRM_S09_PERSONNEL_RESOURCE){
				SRM_S09_PERSONNEL_RESOURCE v = (SRM_S09_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof PPR_PC2_PATHWAY){
				PPR_PC2_PATHWAY v = (PPR_PC2_PATHWAY) s;
			} 

			else if(s instanceof REF_I13_INSURANCE){
				REF_I13_INSURANCE v = (REF_I13_INSURANCE) s;
			} 

			else if(s instanceof RDE_O01_ORDER_DETAIL){
				RDE_O01_ORDER_DETAIL v = (RDE_O01_ORDER_DETAIL) s;
			} 

			else if(s instanceof SIU_S15_PATIENT){
				SIU_S15_PATIENT v = (SIU_S15_PATIENT) s;
			} 

			else if(s instanceof SRM_S09_RESOURCES){
				SRM_S09_RESOURCES v = (SRM_S09_RESOURCES) s;
			} 

			else if(s instanceof PGL_PC6_ORDER_OBSERVATION){
				PGL_PC6_ORDER_OBSERVATION v = (PGL_PC6_ORDER_OBSERVATION) s;
			} 

			else if(s instanceof RRI_I15_PROVIDER){
				RRI_I15_PROVIDER v = (RRI_I15_PROVIDER) s;
			} 

			else if(s instanceof CSU_C11_STUDY_PHASE){
				CSU_C11_STUDY_PHASE v = (CSU_C11_STUDY_PHASE) s;
			} 

			else if(s instanceof PPG_PCJ_PATIENT_VISIT){
				PPG_PCJ_PATIENT_VISIT v = (PPG_PCJ_PATIENT_VISIT) s;
			} 

			else if(s instanceof RQA_I11_GUARANTOR_INSURANCE){
				RQA_I11_GUARANTOR_INSURANCE v = (RQA_I11_GUARANTOR_INSURANCE) s;
			} 

			else if(s instanceof RRD_O02_PATIENT){
				RRD_O02_PATIENT v = (RRD_O02_PATIENT) s;
			} 

			else if(s instanceof RPA_I11_AUTHORIZATION){
				RPA_I11_AUTHORIZATION v = (RPA_I11_AUTHORIZATION) s;
			} 

			else if(s instanceof SRR_S06_SERVICE){
				SRR_S06_SERVICE v = (SRR_S06_SERVICE) s;
			} 

			else if(s instanceof PRR_PC5_ORDER){
				PRR_PC5_ORDER v = (PRR_PC5_ORDER) s;
			} 

			else if(s instanceof SIU_S23_GENERAL_RESOURCE){
				SIU_S23_GENERAL_RESOURCE v = (SIU_S23_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof RRO_O02_PATIENT){
				RRO_O02_PATIENT v = (RRO_O02_PATIENT) s;
			} 

			else if(s instanceof RPA_I09){
				RPA_I09 v = (RPA_I09) s;
			} 

			else if(s instanceof RPA_I08){
				RPA_I08 v = (RPA_I08) s;
			} 

			else if(s instanceof RRI_I13_AUTHORIZATION){
				RRI_I13_AUTHORIZATION v = (RRI_I13_AUTHORIZATION) s;
			} 

			else if(s instanceof VXX_V02_PATIENT){
				VXX_V02_PATIENT v = (VXX_V02_PATIENT) s;
			} 

			else if(s instanceof ORF_R04_PATIENT){
				ORF_R04_PATIENT v = (ORF_R04_PATIENT) s;
			} 

			else if(s instanceof DOC_T12_RESULT){
				DOC_T12_RESULT v = (DOC_T12_RESULT) s;
			} 

			else if(s instanceof SIU_S20_RESOURCES){
				SIU_S20_RESOURCES v = (SIU_S20_RESOURCES) s;
			} 

			else if(s instanceof EDR_Q01){
				EDR_Q01 v = (EDR_Q01) s;
			} 

			else if(s instanceof SRM_S07_LOCATION_RESOURCE){
				SRM_S07_LOCATION_RESOURCE v = (SRM_S07_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof SRR_S10_PATIENT){
				SRR_S10_PATIENT v = (SRR_S10_PATIENT) s;
			} 

			else if(s instanceof PPP_PCD_GOAL){
				PPP_PCD_GOAL v = (PPP_PCD_GOAL) s;
			} 

			else if(s instanceof RPA_I11_RESULTS){
				RPA_I11_RESULTS v = (RPA_I11_RESULTS) s;
			} 

			else if(s instanceof ORF_R04_ORDER){
				ORF_R04_ORDER v = (ORF_R04_ORDER) s;
			} 

			else if(s instanceof PGL_PC8_PROBLEM){
				PGL_PC8_PROBLEM v = (PGL_PC8_PROBLEM) s;
			} 

			else if(s instanceof SRR_S03_LOCATION_RESOURCE){
				SRR_S03_LOCATION_RESOURCE v = (SRR_S03_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof SRM_S02_GENERAL_RESOURCE){
				SRM_S02_GENERAL_RESOURCE v = (SRM_S02_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof RGR_RGR){
				RGR_RGR v = (RGR_RGR) s;
			} 

			else if(s instanceof LCC){
				LCC v = (LCC) s;
			} 

			else if(s instanceof ROL){
				ROL v = (ROL) s;
			} 

			else if(s instanceof RPA_I10){
				RPA_I10 v = (RPA_I10) s;
			} 

			else if(s instanceof PPG_PCG_GOAL_ROLE){
				PPG_PCG_GOAL_ROLE v = (PPG_PCG_GOAL_ROLE) s;
			} 

			else if(s instanceof RPA_I11){
				RPA_I11 v = (RPA_I11) s;
			} 

			else if(s instanceof LCH){
				LCH v = (LCH) s;
			} 

			else if(s instanceof SRM_S02_PATIENT){
				SRM_S02_PATIENT v = (SRM_S02_PATIENT) s;
			} 

			else if(s instanceof PPP_PCC_ORDER_OBSERVATION){
				PPP_PCC_ORDER_OBSERVATION v = (PPP_PCC_ORDER_OBSERVATION) s;
			} 

			else if(s instanceof SRR_S01_RESOURCES){
				SRR_S01_RESOURCES v = (SRR_S01_RESOURCES) s;
			} 

			else if(s instanceof ADT_AXX_MERGE_INFO){
				ADT_AXX_MERGE_INFO v = (ADT_AXX_MERGE_INFO) s;
			} 

			else if(s instanceof EVN){
				EVN v = (EVN) s;
			} 

			else if(s instanceof RRG_O02_ORDER){
				RRG_O02_ORDER v = (RRG_O02_ORDER) s;
			} 

			else if(s instanceof ORM_O01_INSURANCE){
				ORM_O01_INSURANCE v = (ORM_O01_INSURANCE) s;
			} 

			else if(s instanceof PPG_PCG_PATIENT_VISIT){
				PPG_PCG_PATIENT_VISIT v = (PPG_PCG_PATIENT_VISIT) s;
			} 

			else if(s instanceof SRM_S08_PATIENT){
				SRM_S08_PATIENT v = (SRM_S08_PATIENT) s;
			} 

			else if(s instanceof PTR_PCF_ORDER_DETAIL){
				PTR_PCF_ORDER_DETAIL v = (PTR_PCF_ORDER_DETAIL) s;
			} 

			else if(s instanceof PPV_PCA_GOAL_ROLE){
				PPV_PCA_GOAL_ROLE v = (PPV_PCA_GOAL_ROLE) s;
			} 

			else if(s instanceof PPP_PCC_GOAL_OBSERVATION){
				PPP_PCC_GOAL_OBSERVATION v = (PPP_PCC_GOAL_OBSERVATION) s;
			} 

			else if(s instanceof RQI_I02_PROVIDER){
				RQI_I02_PROVIDER v = (RQI_I02_PROVIDER) s;
			} 

			else if(s instanceof PEX_P07_ASSOCIATED_PERSON){
				PEX_P07_ASSOCIATED_PERSON v = (PEX_P07_ASSOCIATED_PERSON) s;
			} 

			else if(s instanceof RPR_I03){
				RPR_I03 v = (RPR_I03) s;
			} 

			else if(s instanceof RQ1){
				RQ1 v = (RQ1) s;
			} 

			else if(s instanceof VXR_V03){
				VXR_V03 v = (VXR_V03) s;
			} 

			else if(s instanceof LDP){
				LDP v = (LDP) s;
			} 

			else if(s instanceof SIU_S26_GENERAL_RESOURCE){
				SIU_S26_GENERAL_RESOURCE v = (SIU_S26_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof RRI_I15_AUTHORIZATION){
				RRI_I15_AUTHORIZATION v = (RRI_I15_AUTHORIZATION) s;
			} 

			else if(s instanceof RGV_O01){
				RGV_O01 v = (RGV_O01) s;
			} 

			else if(s instanceof RPA_I08_VISIT){
				RPA_I08_VISIT v = (RPA_I08_VISIT) s;
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

			else if(s instanceof PPR_PC3_PROBLEM_ROLE){
				PPR_PC3_PROBLEM_ROLE v = (PPR_PC3_PROBLEM_ROLE) s;
			} 

			else if(s instanceof RRE_O01_RESPONSE){
				RRE_O01_RESPONSE v = (RRE_O01_RESPONSE) s;
			} 

			else if(s instanceof ORD_O02_PATIENT){
				ORD_O02_PATIENT v = (ORD_O02_PATIENT) s;
			} 

			else if(s instanceof PPG_PCH_PATIENT_VISIT){
				PPG_PCH_PATIENT_VISIT v = (PPG_PCH_PATIENT_VISIT) s;
			} 

			else if(s instanceof RPA_I10_AUTHORIZATION){
				RPA_I10_AUTHORIZATION v = (RPA_I10_AUTHORIZATION) s;
			} 

			else if(s instanceof VXR_V03_OBSERVATION){
				VXR_V03_OBSERVATION v = (VXR_V03_OBSERVATION) s;
			} 

			else if(s instanceof PPG_PCG_PROBLEM_ROLE){
				PPG_PCG_PROBLEM_ROLE v = (PPG_PCG_PROBLEM_ROLE) s;
			} 

			else if(s instanceof CTD){
				CTD v = (CTD) s;
			} 

			else if(s instanceof PPR_PC3_ORDER_DETAIL){
				PPR_PC3_ORDER_DETAIL v = (PPR_PC3_ORDER_DETAIL) s;
			} 

			else if(s instanceof ORD_O02_ORDER_DIET){
				ORD_O02_ORDER_DIET v = (ORD_O02_ORDER_DIET) s;
			} 

			else if(s instanceof PEX_P07_PEX_OBSERVATION){
				PEX_P07_PEX_OBSERVATION v = (PEX_P07_PEX_OBSERVATION) s;
			} 

			else if(s instanceof CTI){
				CTI v = (CTI) s;
			} 

			else if(s instanceof PPT_PCL_GOAL_ROLE){
				PPT_PCL_GOAL_ROLE v = (PPT_PCL_GOAL_ROLE) s;
			} 

			else if(s instanceof CSU_C11_STUDY_PHARM){
				CSU_C11_STUDY_PHARM v = (CSU_C11_STUDY_PHARM) s;
			} 

			else if(s instanceof SIU_S21_PERSONNEL_RESOURCE){
				SIU_S21_PERSONNEL_RESOURCE v = (SIU_S21_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof RGV_O01_COMPONENTS){
				RGV_O01_COMPONENTS v = (RGV_O01_COMPONENTS) s;
			} 

			else if(s instanceof PPV_PCA_PROBLEM_OBSERVATION){
				PPV_PCA_PROBLEM_OBSERVATION v = (PPV_PCA_PROBLEM_OBSERVATION) s;
			} 

			else if(s instanceof CSU_C09_STUDY_SCHEDULE){
				CSU_C09_STUDY_SCHEDULE v = (CSU_C09_STUDY_SCHEDULE) s;
			} 

			else if(s instanceof APR){
				APR v = (APR) s;
			} 

			else if(s instanceof MFN_M06_MF_PHASE_SCHED_DETAIL){
				MFN_M06_MF_PHASE_SCHED_DETAIL v = (MFN_M06_MF_PHASE_SCHED_DETAIL) s;
			} 

			else if(s instanceof PPP_PCD_PROBLEM){
				PPP_PCD_PROBLEM v = (PPP_PCD_PROBLEM) s;
			} 

			else if(s instanceof RQI_I01_PRDCTD){
				RQI_I01_PRDCTD v = (RQI_I01_PRDCTD) s;
			} 

			else if(s instanceof PPP_PCB_PROBLEM_OBSERVATION){
				PPP_PCB_PROBLEM_OBSERVATION v = (PPP_PCB_PROBLEM_OBSERVATION) s;
			} 

			else if(s instanceof SIU_S18_SERVICE){
				SIU_S18_SERVICE v = (SIU_S18_SERVICE) s;
			} 

			else if(s instanceof PPP_PCC_PATHWAY){
				PPP_PCC_PATHWAY v = (PPP_PCC_PATHWAY) s;
			} 

			else if(s instanceof SIU_S13_PATIENT){
				SIU_S13_PATIENT v = (SIU_S13_PATIENT) s;
			} 

			else if(s instanceof PPG_PCJ_PROBLEM_OBSERVATION){
				PPG_PCJ_PROBLEM_OBSERVATION v = (PPG_PCJ_PROBLEM_OBSERVATION) s;
			} 

			else if(s instanceof ADT_A01_PROCEDURE){
				ADT_A01_PROCEDURE v = (ADT_A01_PROCEDURE) s;
			} 

			else if(s instanceof NK1){
				NK1 v = (NK1) s;
			} 

			else if(s instanceof RDS_O01_ENCODING){
				RDS_O01_ENCODING v = (RDS_O01_ENCODING) s;
			} 

			else if(s instanceof RRI_I13_PROCEDURE){
				RRI_I13_PROCEDURE v = (RRI_I13_PROCEDURE) s;
			} 

			else if(s instanceof RGV_O01_GIVE){
				RGV_O01_GIVE v = (RGV_O01_GIVE) s;
			} 

			else if(s instanceof CSU_C11_PATIENT){
				CSU_C11_PATIENT v = (CSU_C11_PATIENT) s;
			} 

			else if(s instanceof SRR_S08_PERSONNEL_RESOURCE){
				SRR_S08_PERSONNEL_RESOURCE v = (SRR_S08_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof SRM_S07_PATIENT){
				SRM_S07_PATIENT v = (SRM_S07_PATIENT) s;
			} 

			else if(s instanceof OMD_O01_DIET){
				OMD_O01_DIET v = (OMD_O01_DIET) s;
			} 

			else if(s instanceof SIU_S13){
				SIU_S13 v = (SIU_S13) s;
			} 

			else if(s instanceof SIU_S12){
				SIU_S12 v = (SIU_S12) s;
			} 

			else if(s instanceof PTR_PCF_GOAL_ROLE){
				PTR_PCF_GOAL_ROLE v = (PTR_PCF_GOAL_ROLE) s;
			} 

			else if(s instanceof SIU_S15){
				SIU_S15 v = (SIU_S15) s;
			} 

			else if(s instanceof SRR_S10_SERVICE){
				SRR_S10_SERVICE v = (SRR_S10_SERVICE) s;
			} 

			else if(s instanceof SIU_S14){
				SIU_S14 v = (SIU_S14) s;
			} 

			else if(s instanceof SIU_S17){
				SIU_S17 v = (SIU_S17) s;
			} 

			else if(s instanceof SIU_S16){
				SIU_S16 v = (SIU_S16) s;
			} 

			else if(s instanceof SIU_S19){
				SIU_S19 v = (SIU_S19) s;
			} 

			else if(s instanceof SIU_S18){
				SIU_S18 v = (SIU_S18) s;
			} 

			else if(s instanceof TBR_Q01){
				TBR_Q01 v = (TBR_Q01) s;
			} 

			else if(s instanceof ORU_R01_ORDER_OBSERVATION){
				ORU_R01_ORDER_OBSERVATION v = (ORU_R01_ORDER_OBSERVATION) s;
			} 

			else if(s instanceof RDO_O01_OBSERVATION){
				RDO_O01_OBSERVATION v = (RDO_O01_OBSERVATION) s;
			} 

			else if(s instanceof SRR_S07_PATIENT){
				SRR_S07_PATIENT v = (SRR_S07_PATIENT) s;
			} 

			else if(s instanceof PGL_PC6_PROBLEM){
				PGL_PC6_PROBLEM v = (PGL_PC6_PROBLEM) s;
			} 

			else if(s instanceof SRR_S04_SCHEDULE){
				SRR_S04_SCHEDULE v = (SRR_S04_SCHEDULE) s;
			} 

			else if(s instanceof ADT_A04_INSURANCE){
				ADT_A04_INSURANCE v = (ADT_A04_INSURANCE) s;
			} 

			else if(s instanceof PRR_PC5_GOAL_ROLE){
				PRR_PC5_GOAL_ROLE v = (PRR_PC5_GOAL_ROLE) s;
			} 

			else if(s instanceof TXA){
				TXA v = (TXA) s;
			} 

			else if(s instanceof SRM_S10_SERVICE){
				SRM_S10_SERVICE v = (SRM_S10_SERVICE) s;
			} 

			else if(s instanceof SIU_S20_GENERAL_RESOURCE){
				SIU_S20_GENERAL_RESOURCE v = (SIU_S20_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof SIU_S20){
				SIU_S20 v = (SIU_S20) s;
			} 

			else if(s instanceof ARQ){
				ARQ v = (ARQ) s;
			} 

			else if(s instanceof PPG_PCJ_GOAL_OBSERVATION){
				PPG_PCJ_GOAL_OBSERVATION v = (PPG_PCJ_GOAL_OBSERVATION) s;
			} 

			else if(s instanceof SIU_S22){
				SIU_S22 v = (SIU_S22) s;
			} 

			else if(s instanceof RAS_O01_PATIENT_VISIT){
				RAS_O01_PATIENT_VISIT v = (RAS_O01_PATIENT_VISIT) s;
			} 

			else if(s instanceof SIU_S21){
				SIU_S21 v = (SIU_S21) s;
			} 

			else if(s instanceof VXQ_V01){
				VXQ_V01 v = (VXQ_V01) s;
			} 

			else if(s instanceof SIU_S15_SERVICE){
				SIU_S15_SERVICE v = (SIU_S15_SERVICE) s;
			} 

			else if(s instanceof OMN_O01_PATIENT){
				OMN_O01_PATIENT v = (OMN_O01_PATIENT) s;
			} 

			else if(s instanceof SIU_S24){
				SIU_S24 v = (SIU_S24) s;
			} 

			else if(s instanceof SIU_S23){
				SIU_S23 v = (SIU_S23) s;
			} 

			else if(s instanceof SIU_S26){
				SIU_S26 v = (SIU_S26) s;
			} 

			else if(s instanceof SRR_S06_GENERAL_RESOURCE){
				SRR_S06_GENERAL_RESOURCE v = (SRR_S06_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof SIU_S24_LOCATION_RESOURCE){
				SIU_S24_LOCATION_RESOURCE v = (SIU_S24_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof SRM_S09_SERVICE){
				SRM_S09_SERVICE v = (SRM_S09_SERVICE) s;
			} 

			else if(s instanceof RRO_O02){
				RRO_O02 v = (RRO_O02) s;
			} 

			else if(s instanceof RPI_I01_INSURANCE){
				RPI_I01_INSURANCE v = (RPI_I01_INSURANCE) s;
			} 

			else if(s instanceof ORR_O02_ORDER){
				ORR_O02_ORDER v = (ORR_O02_ORDER) s;
			} 

			else if(s instanceof REF_I13_VISIT){
				REF_I13_VISIT v = (REF_I13_VISIT) s;
			} 

			else if(s instanceof RDR_RDR_PATIENT){
				RDR_RDR_PATIENT v = (RDR_RDR_PATIENT) s;
			} 

			else if(s instanceof PPP_PCD_GOAL_OBSERVATION){
				PPP_PCD_GOAL_OBSERVATION v = (PPP_PCD_GOAL_OBSERVATION) s;
			} 

			else if(s instanceof SUR_P09_PRODUCT){
				SUR_P09_PRODUCT v = (SUR_P09_PRODUCT) s;
			} 

			else if(s instanceof PPR_PC1_ORDER){
				PPR_PC1_ORDER v = (PPR_PC1_ORDER) s;
			} 

			else if(s instanceof PGL_PC8_PATHWAY){
				PGL_PC8_PATHWAY v = (PGL_PC8_PATHWAY) s;
			} 

			else if(s instanceof PPR_PC1_ORDER_OBSERVATION){
				PPR_PC1_ORDER_OBSERVATION v = (PPR_PC1_ORDER_OBSERVATION) s;
			} 

			else if(s instanceof RDO_O01_ORDER){
				RDO_O01_ORDER v = (RDO_O01_ORDER) s;
			} 

			else if(s instanceof OMS_O01_PATIENT){
				OMS_O01_PATIENT v = (OMS_O01_PATIENT) s;
			} 

			else if(s instanceof SRR_S09_SERVICE){
				SRR_S09_SERVICE v = (SRR_S09_SERVICE) s;
			} 

			else if(s instanceof RGV_O01_ENCODING){
				RGV_O01_ENCODING v = (RGV_O01_ENCODING) s;
			} 

			else if(s instanceof SRR_S11_PATIENT){
				SRR_S11_PATIENT v = (SRR_S11_PATIENT) s;
			} 

			else if(s instanceof PGL_PC7_GOAL){
				PGL_PC7_GOAL v = (PGL_PC7_GOAL) s;
			} 

			else if(s instanceof PPR_PC3_ORDER_OBSERVATION){
				PPR_PC3_ORDER_OBSERVATION v = (PPR_PC3_ORDER_OBSERVATION) s;
			} 

			else if(s instanceof RCL_I06){
				RCL_I06 v = (RCL_I06) s;
			} 

			else if(s instanceof SRM_S11_PATIENT){
				SRM_S11_PATIENT v = (SRM_S11_PATIENT) s;
			} 

			else if(s instanceof PGL_PC6_OBSERVATION){
				PGL_PC6_OBSERVATION v = (PGL_PC6_OBSERVATION) s;
			} 

			else if(s instanceof ADT_A03_PROCEDURE){
				ADT_A03_PROCEDURE v = (ADT_A03_PROCEDURE) s;
			} 

			else if(s instanceof PR1){
				PR1 v = (PR1) s;
			} 

			else if(s instanceof RQA_I08_GUARANTOR_INSURANCE){
				RQA_I08_GUARANTOR_INSURANCE v = (RQA_I08_GUARANTOR_INSURANCE) s;
			} 

			else if(s instanceof PPR_PC2_ORDER_DETAIL){
				PPR_PC2_ORDER_DETAIL v = (PPR_PC2_ORDER_DETAIL) s;
			} 

			else if(s instanceof QRY_Q01){
				QRY_Q01 v = (QRY_Q01) s;
			} 

			else if(s instanceof QRY_Q02){
				QRY_Q02 v = (QRY_Q02) s;
			} 

			else if(s instanceof RQA_I10_VISIT){
				RQA_I10_VISIT v = (RQA_I10_VISIT) s;
			} 

			else if(s instanceof RRI_I15_VISIT){
				RRI_I15_VISIT v = (RRI_I15_VISIT) s;
			} 

			else if(s instanceof SRM_S01_GENERAL_RESOURCE){
				SRM_S01_GENERAL_RESOURCE v = (SRM_S01_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof OMN_O01_ORDER_DETAIL){
				OMN_O01_ORDER_DETAIL v = (OMN_O01_ORDER_DETAIL) s;
			} 

			else if(s instanceof SIU_S16_PATIENT){
				SIU_S16_PATIENT v = (SIU_S16_PATIENT) s;
			} 

			else if(s instanceof PPG_PCJ_PROBLEM){
				PPG_PCJ_PROBLEM v = (PPG_PCJ_PROBLEM) s;
			} 

			else if(s instanceof RQA_I09_AUTHORIZATION){
				RQA_I09_AUTHORIZATION v = (RQA_I09_AUTHORIZATION) s;
			} 

			else if(s instanceof RRI_I14_PROVIDER){
				RRI_I14_PROVIDER v = (RRI_I14_PROVIDER) s;
			} 

			else if(s instanceof SQR_S25_PATIENT){
				SQR_S25_PATIENT v = (SQR_S25_PATIENT) s;
			} 

			else if(s instanceof RGV_O01_ORDER_DETAIL){
				RGV_O01_ORDER_DETAIL v = (RGV_O01_ORDER_DETAIL) s;
			} 

			else if(s instanceof RER_RER_PATIENT){
				RER_RER_PATIENT v = (RER_RER_PATIENT) s;
			} 

			else if(s instanceof PRA){
				PRA v = (PRA) s;
			} 

			else if(s instanceof SQM_S25_RESOURCES){
				SQM_S25_RESOURCES v = (SQM_S25_RESOURCES) s;
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

			else if(s instanceof PRD){
				PRD v = (PRD) s;
			} 

			else if(s instanceof MDM_T06){
				MDM_T06 v = (MDM_T06) s;
			} 

			else if(s instanceof MDM_T09){
				MDM_T09 v = (MDM_T09) s;
			} 

			else if(s instanceof OMN_O01_OBSERVATION){
				OMN_O01_OBSERVATION v = (OMN_O01_OBSERVATION) s;
			} 

			else if(s instanceof SRM_S11_PERSONNEL_RESOURCE){
				SRM_S11_PERSONNEL_RESOURCE v = (SRM_S11_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof RRI_I12_RESULTS){
				RRI_I12_RESULTS v = (RRI_I12_RESULTS) s;
			} 

			else if(s instanceof PGL_PC7_PROBLEM_ROLE){
				PGL_PC7_PROBLEM_ROLE v = (PGL_PC7_PROBLEM_ROLE) s;
			} 

			else if(s instanceof SQM_S25_REQUEST){
				SQM_S25_REQUEST v = (SQM_S25_REQUEST) s;
			} 

			else if(s instanceof CSU_C10_STUDY_PHASE){
				CSU_C10_STUDY_PHASE v = (CSU_C10_STUDY_PHASE) s;
			} 

			else if(s instanceof RDS_O01_PATIENT_VISIT){
				RDS_O01_PATIENT_VISIT v = (RDS_O01_PATIENT_VISIT) s;
			} 

			else if(s instanceof CSU_C09){
				CSU_C09 v = (CSU_C09) s;
			} 

			else if(s instanceof PEX_P07_RX_ORDER){
				PEX_P07_RX_ORDER v = (PEX_P07_RX_ORDER) s;
			} 

			else if(s instanceof SRM_S02_SERVICE){
				SRM_S02_SERVICE v = (SRM_S02_SERVICE) s;
			} 

			else if(s instanceof SIU_S13_PERSONNEL_RESOURCE){
				SIU_S13_PERSONNEL_RESOURCE v = (SIU_S13_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof RCI_I05_RESULTS){
				RCI_I05_RESULTS v = (RCI_I05_RESULTS) s;
			} 

			else if(s instanceof MDM_T03){
				MDM_T03 v = (MDM_T03) s;
			} 

			else if(s instanceof CRM_C01_PATIENT){
				CRM_C01_PATIENT v = (CRM_C01_PATIENT) s;
			} 

			else if(s instanceof MDM_T04){
				MDM_T04 v = (MDM_T04) s;
			} 

			else if(s instanceof MDM_T01){
				MDM_T01 v = (MDM_T01) s;
			} 

			else if(s instanceof PPP_PCB_ORDER_OBSERVATION){
				PPP_PCB_ORDER_OBSERVATION v = (PPP_PCB_ORDER_OBSERVATION) s;
			} 

			else if(s instanceof SIU_S17_PERSONNEL_RESOURCE){
				SIU_S17_PERSONNEL_RESOURCE v = (SIU_S17_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof MDM_T02){
				MDM_T02 v = (MDM_T02) s;
			} 

			else if(s instanceof AUT){
				AUT v = (AUT) s;
			} 

			else if(s instanceof RRI_I15_PROCEDURE){
				RRI_I15_PROCEDURE v = (RRI_I15_PROCEDURE) s;
			} 

			else if(s instanceof ORN_O02_ORDER){
				ORN_O02_ORDER v = (ORN_O02_ORDER) s;
			} 

			else if(s instanceof PSH){
				PSH v = (PSH) s;
			} 

			else if(s instanceof RQI_I03_PROVIDER){
				RQI_I03_PROVIDER v = (RQI_I03_PROVIDER) s;
			} 

			else if(s instanceof SRR_S10_RESOURCES){
				SRR_S10_RESOURCES v = (SRR_S10_RESOURCES) s;
			} 

			else if(s instanceof OMS_O01){
				OMS_O01 v = (OMS_O01) s;
			} 

			else if(s instanceof OMD_O01){
				OMD_O01 v = (OMD_O01) s;
			} 

			else if(s instanceof CSU_C09_RX_ADMIN){
				CSU_C09_RX_ADMIN v = (CSU_C09_RX_ADMIN) s;
			} 

			else if(s instanceof CSU_C09_VISIT){
				CSU_C09_VISIT v = (CSU_C09_VISIT) s;
			} 

			else if(s instanceof RRI_I13_VISIT){
				RRI_I13_VISIT v = (RRI_I13_VISIT) s;
			} 

			else if(s instanceof SRR_S08_RESOURCES){
				SRR_S08_RESOURCES v = (SRR_S08_RESOURCES) s;
			} 

			else if(s instanceof CRM_C04_PATIENT){
				CRM_C04_PATIENT v = (CRM_C04_PATIENT) s;
			} 

			else if(s instanceof ADT_A28_PROCEDURE){
				ADT_A28_PROCEDURE v = (ADT_A28_PROCEDURE) s;
			} 

			else if(s instanceof RXA){
				RXA v = (RXA) s;
			} 

			else if(s instanceof PGL_PC6_GOAL){
				PGL_PC6_GOAL v = (PGL_PC6_GOAL) s;
			} 

			else if(s instanceof RXC){
				RXC v = (RXC) s;
			} 

			else if(s instanceof PPR_PC3_PATIENT_VISIT){
				PPR_PC3_PATIENT_VISIT v = (PPR_PC3_PATIENT_VISIT) s;
			} 

			else if(s instanceof ORD_O02_ORDER_TRAY){
				ORD_O02_ORDER_TRAY v = (ORD_O02_ORDER_TRAY) s;
			} 

			else if(s instanceof RXE){
				RXE v = (RXE) s;
			} 

			else if(s instanceof RXD){
				RXD v = (RXD) s;
			} 

			else if(s instanceof SQR_S25_SCHEDULE){
				SQR_S25_SCHEDULE v = (SQR_S25_SCHEDULE) s;
			} 

			else if(s instanceof PPG_PCJ_PATHWAY){
				PPG_PCJ_PATHWAY v = (PPG_PCJ_PATHWAY) s;
			} 

			else if(s instanceof RXG){
				RXG v = (RXG) s;
			} 

			else if(s instanceof ADT_A13_INSURANCE){
				ADT_A13_INSURANCE v = (ADT_A13_INSURANCE) s;
			} 

			else if(s instanceof PTH){
				PTH v = (PTH) s;
			} 

			else if(s instanceof SRM_S05_SERVICE){
				SRM_S05_SERVICE v = (SRM_S05_SERVICE) s;
			} 

			else if(s instanceof VXU_V04_ORDER){
				VXU_V04_ORDER v = (VXU_V04_ORDER) s;
			} 

			else if(s instanceof CSU_C12_STUDY_SCHEDULE){
				CSU_C12_STUDY_SCHEDULE v = (CSU_C12_STUDY_SCHEDULE) s;
			} 

			else if(s instanceof SIU_S24_PERSONNEL_RESOURCE){
				SIU_S24_PERSONNEL_RESOURCE v = (SIU_S24_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof RXO){
				RXO v = (RXO) s;
			} 

			else if(s instanceof RXR){
				RXR v = (RXR) s;
			} 

			else if(s instanceof MFN_M10_MF_TEST_BATTERIES){
				MFN_M10_MF_TEST_BATTERIES v = (MFN_M10_MF_TEST_BATTERIES) s;
			} 

			else if(s instanceof PPR_PC2_ORDER_OBSERVATION){
				PPR_PC2_ORDER_OBSERVATION v = (PPR_PC2_ORDER_OBSERVATION) s;
			} 

			else if(s instanceof SRM_S06_GENERAL_RESOURCE){
				SRM_S06_GENERAL_RESOURCE v = (SRM_S06_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof SIU_S14_PERSONNEL_RESOURCE){
				SIU_S14_PERSONNEL_RESOURCE v = (SIU_S14_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof SRR_S03_RESOURCES){
				SRR_S03_RESOURCES v = (SRR_S03_RESOURCES) s;
			} 

			else if(s instanceof PTR_PCF_ORDER){
				PTR_PCF_ORDER v = (PTR_PCF_ORDER) s;
			} 

			else if(s instanceof NPU){
				NPU v = (NPU) s;
			} 

			else if(s instanceof DFT_P03_FINANCIAL){
				DFT_P03_FINANCIAL v = (DFT_P03_FINANCIAL) s;
			} 

			else if(s instanceof PPT_PCL_ORDER_OBSERVATION){
				PPT_PCL_ORDER_OBSERVATION v = (PPT_PCL_ORDER_OBSERVATION) s;
			} 

			else if(s instanceof PGL_PC7_PATIENT_VISIT){
				PGL_PC7_PATIENT_VISIT v = (PGL_PC7_PATIENT_VISIT) s;
			} 

			else if(s instanceof REF_I12_INSURANCE){
				REF_I12_INSURANCE v = (REF_I12_INSURANCE) s;
			} 

			else if(s instanceof SRR_S01_LOCATION_RESOURCE){
				SRR_S01_LOCATION_RESOURCE v = (SRR_S01_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof PTR_PCF_PATHWAY){
				PTR_PCF_PATHWAY v = (PTR_PCF_PATHWAY) s;
			} 

			else if(s instanceof RQA_I09_OBSERVATION){
				RQA_I09_OBSERVATION v = (RQA_I09_OBSERVATION) s;
			} 

			else if(s instanceof PPR_PC1_GOAL){
				PPR_PC1_GOAL v = (PPR_PC1_GOAL) s;
			} 

			else if(s instanceof ADT_A06_INSURANCE){
				ADT_A06_INSURANCE v = (ADT_A06_INSURANCE) s;
			} 

			else if(s instanceof SRM_S11_GENERAL_RESOURCE){
				SRM_S11_GENERAL_RESOURCE v = (SRM_S11_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof ORF_R02_QUERY_RESPONSE){
				ORF_R02_QUERY_RESPONSE v = (ORF_R02_QUERY_RESPONSE) s;
			} 

			else if(s instanceof PGL_PC7_PROBLEM_OBSERVATION){
				PGL_PC7_PROBLEM_OBSERVATION v = (PGL_PC7_PROBLEM_OBSERVATION) s;
			} 

			else if(s instanceof FAC){
				FAC v = (FAC) s;
			} 

			else if(s instanceof PV1){
				PV1 v = (PV1) s;
			} 

			else if(s instanceof SRR_S10_PERSONNEL_RESOURCE){
				SRR_S10_PERSONNEL_RESOURCE v = (SRR_S10_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof RQI_I03_INSURANCE){
				RQI_I03_INSURANCE v = (RQI_I03_INSURANCE) s;
			} 

			else if(s instanceof PV2){
				PV2 v = (PV2) s;
			} 

			else if(s instanceof ORM_O01_ORDER){
				ORM_O01_ORDER v = (ORM_O01_ORDER) s;
			} 

			else if(s instanceof PPR_PC1_PROBLEM_ROLE){
				PPR_PC1_PROBLEM_ROLE v = (PPR_PC1_PROBLEM_ROLE) s;
			} 

			else if(s instanceof BAR_P02){
				BAR_P02 v = (BAR_P02) s;
			} 

			else if(s instanceof SRM_S09_LOCATION_RESOURCE){
				SRM_S09_LOCATION_RESOURCE v = (SRM_S09_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof RDS_O01_ORDER){
				RDS_O01_ORDER v = (RDS_O01_ORDER) s;
			} 

			else if(s instanceof BAR_P01){
				BAR_P01 v = (BAR_P01) s;
			} 

			else if(s instanceof CSU_C11){
				CSU_C11 v = (CSU_C11) s;
			} 

			else if(s instanceof CSU_C10){
				CSU_C10 v = (CSU_C10) s;
			} 

			else if(s instanceof CSU_C10_STUDY_PHARM){
				CSU_C10_STUDY_PHARM v = (CSU_C10_STUDY_PHARM) s;
			} 

			else if(s instanceof CSU_C12){
				CSU_C12 v = (CSU_C12) s;
			} 

			else if(s instanceof MDM_T10){
				MDM_T10 v = (MDM_T10) s;
			} 

			else if(s instanceof MDM_T11){
				MDM_T11 v = (MDM_T11) s;
			} 

			else if(s instanceof ADT_A07_PROCEDURE){
				ADT_A07_PROCEDURE v = (ADT_A07_PROCEDURE) s;
			} 

			else if(s instanceof PPG_PCG_PATHWAY){
				PPG_PCG_PATHWAY v = (PPG_PCG_PATHWAY) s;
			} 

			else if(s instanceof PPV_PCA_PATIENT){
				PPV_PCA_PATIENT v = (PPV_PCA_PATIENT) s;
			} 

			else if(s instanceof PIN_I07_GUARANTOR_INSURANCE){
				PIN_I07_GUARANTOR_INSURANCE v = (PIN_I07_GUARANTOR_INSURANCE) s;
			} 

			else if(s instanceof BAR_P06){
				BAR_P06 v = (BAR_P06) s;
			} 

			else if(s instanceof PEX_P07_ASSOCIATED_RX_ADMIN){
				PEX_P07_ASSOCIATED_RX_ADMIN v = (PEX_P07_ASSOCIATED_RX_ADMIN) s;
			} 

			else if(s instanceof BAR_P05){
				BAR_P05 v = (BAR_P05) s;
			} 

			else if(s instanceof SIU_S22_GENERAL_RESOURCE){
				SIU_S22_GENERAL_RESOURCE v = (SIU_S22_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof PPG_PCH_PROBLEM){
				PPG_PCH_PROBLEM v = (PPG_PCH_PROBLEM) s;
			} 

			else if(s instanceof RQA_I10_OBSERVATION){
				RQA_I10_OBSERVATION v = (RQA_I10_OBSERVATION) s;
			} 

			else if(s instanceof ADT_A31_PROCEDURE){
				ADT_A31_PROCEDURE v = (ADT_A31_PROCEDURE) s;
			} 

			else if(s instanceof RGV_O01_PATIENT_VISIT){
				RGV_O01_PATIENT_VISIT v = (RGV_O01_PATIENT_VISIT) s;
			} 

			else if(s instanceof REF_I13_OBSERVATION){
				REF_I13_OBSERVATION v = (REF_I13_OBSERVATION) s;
			} 

			else if(s instanceof CRM_C06){
				CRM_C06 v = (CRM_C06) s;
			} 

			else if(s instanceof EQQ_Q01){
				EQQ_Q01 v = (EQQ_Q01) s;
			} 

			else if(s instanceof PEX_P08_ASSOCIATED_RX_ORDER){
				PEX_P08_ASSOCIATED_RX_ORDER v = (PEX_P08_ASSOCIATED_RX_ORDER) s;
			} 

			else if(s instanceof CRM_C07){
				CRM_C07 v = (CRM_C07) s;
			} 

			else if(s instanceof CRM_C08){
				CRM_C08 v = (CRM_C08) s;
			} 

			else if(s instanceof SRR_S05_RESOURCES){
				SRR_S05_RESOURCES v = (SRR_S05_RESOURCES) s;
			} 

			else if(s instanceof RPA_I08_AUTHORIZATION){
				RPA_I08_AUTHORIZATION v = (RPA_I08_AUTHORIZATION) s;
			} 

			else if(s instanceof CRM_C01){
				CRM_C01 v = (CRM_C01) s;
			} 

			else if(s instanceof CRM_C02){
				CRM_C02 v = (CRM_C02) s;
			} 

			else if(s instanceof RPI_I04_PROVIDER){
				RPI_I04_PROVIDER v = (RPI_I04_PROVIDER) s;
			} 

			else if(s instanceof CRM_C03){
				CRM_C03 v = (CRM_C03) s;
			} 

			else if(s instanceof SQR_S25_PERSONNEL_RESOURCE){
				SQR_S25_PERSONNEL_RESOURCE v = (SQR_S25_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof CRM_C04){
				CRM_C04 v = (CRM_C04) s;
			} 

			else if(s instanceof NSC){
				NSC v = (NSC) s;
			} 

			else if(s instanceof CRM_C05){
				CRM_C05 v = (CRM_C05) s;
			} 

			else if(s instanceof LOC){
				LOC v = (LOC) s;
			} 

			else if(s instanceof MFN_M06_MF_CLIN_STUDY){
				MFN_M06_MF_CLIN_STUDY v = (MFN_M06_MF_CLIN_STUDY) s;
			} 

			else if(s instanceof CRM_C06_PATIENT){
				CRM_C06_PATIENT v = (CRM_C06_PATIENT) s;
			} 

			else if(s instanceof REF_I15_VISIT){
				REF_I15_VISIT v = (REF_I15_VISIT) s;
			} 

			else if(s instanceof SPQ_Q01){
				SPQ_Q01 v = (SPQ_Q01) s;
			} 

			else if(s instanceof NST){
				NST v = (NST) s;
			} 

			else if(s instanceof SIU_S12_GENERAL_RESOURCE){
				SIU_S12_GENERAL_RESOURCE v = (SIU_S12_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof PEX_P08_EXPERIENCE){
				PEX_P08_EXPERIENCE v = (PEX_P08_EXPERIENCE) s;
			} 

			else if(s instanceof RPA_I09_PROVIDER){
				RPA_I09_PROVIDER v = (RPA_I09_PROVIDER) s;
			} 

			else if(s instanceof SRR_S04_RESOURCES){
				SRR_S04_RESOURCES v = (SRR_S04_RESOURCES) s;
			} 

			else if(s instanceof RAS_O01_ORDER){
				RAS_O01_ORDER v = (RAS_O01_ORDER) s;
			} 

			else if(s instanceof NTE){
				NTE v = (NTE) s;
			} 

			else if(s instanceof SRR_S07_RESOURCES){
				SRR_S07_RESOURCES v = (SRR_S07_RESOURCES) s;
			} 

			else if(s instanceof PGL_PC8_ORDER_DETAIL){
				PGL_PC8_ORDER_DETAIL v = (PGL_PC8_ORDER_DETAIL) s;
			} 

			else if(s instanceof RGR_RGR_DEFINITION){
				RGR_RGR_DEFINITION v = (RGR_RGR_DEFINITION) s;
			} 

			else if(s instanceof ADT_A06_PROCEDURE){
				ADT_A06_PROCEDURE v = (ADT_A06_PROCEDURE) s;
			} 

			else if(s instanceof UB2){
				UB2 v = (UB2) s;
			} 

			else if(s instanceof UB1){
				UB1 v = (UB1) s;
			} 

			else if(s instanceof RDE_O01_PATIENT){
				RDE_O01_PATIENT v = (RDE_O01_PATIENT) s;
			} 

			else if(s instanceof RQA_I11_PROVIDER){
				RQA_I11_PROVIDER v = (RQA_I11_PROVIDER) s;
			} 

			else if(s instanceof OMS_O01_OBSERVATION){
				OMS_O01_OBSERVATION v = (OMS_O01_OBSERVATION) s;
			} 

			else if(s instanceof PPP_PCC){
				PPP_PCC v = (PPP_PCC) s;
			} 

			else if(s instanceof PPP_PCB){
				PPP_PCB v = (PPP_PCB) s;
			} 

			else if(s instanceof PPP_PCD){
				PPP_PCD v = (PPP_PCD) s;
			} 

			else if(s instanceof ORR_O02_PATIENT){
				ORR_O02_PATIENT v = (ORR_O02_PATIENT) s;
			} 

			else if(s instanceof RDE_O01_PATIENT_VISIT){
				RDE_O01_PATIENT_VISIT v = (RDE_O01_PATIENT_VISIT) s;
			} 

			else if(s instanceof RRI_I14_OBSERVATION){
				RRI_I14_OBSERVATION v = (RRI_I14_OBSERVATION) s;
			} 

			else if(s instanceof PEX_P08_PEX_OBSERVATION){
				PEX_P08_PEX_OBSERVATION v = (PEX_P08_PEX_OBSERVATION) s;
			} 

			else if(s instanceof PPG_PCG_GOAL){
				PPG_PCG_GOAL v = (PPG_PCG_GOAL) s;
			} 

			else if(s instanceof OMN_O01_INSURANCE){
				OMN_O01_INSURANCE v = (OMN_O01_INSURANCE) s;
			} 

			else if(s instanceof MFN_M02_MF_STAFF){
				MFN_M02_MF_STAFF v = (MFN_M02_MF_STAFF) s;
			} 

			else if(s instanceof RCI_I05_PROVIDER){
				RCI_I05_PROVIDER v = (RCI_I05_PROVIDER) s;
			} 

			else if(s instanceof PPV_PCA_ORDER){
				PPV_PCA_ORDER v = (PPV_PCA_ORDER) s;
			} 

			else if(s instanceof REF_I14_PROVIDER){
				REF_I14_PROVIDER v = (REF_I14_PROVIDER) s;
			} 

			else if(s instanceof SRM_S07_GENERAL_RESOURCE){
				SRM_S07_GENERAL_RESOURCE v = (SRM_S07_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof PPT_PCL_PATHWAY){
				PPT_PCL_PATHWAY v = (PPT_PCL_PATHWAY) s;
			} 

			else if(s instanceof ADT_A45_MERGE_INFO){
				ADT_A45_MERGE_INFO v = (ADT_A45_MERGE_INFO) s;
			} 

			else if(s instanceof OMD_O01_INSURANCE){
				OMD_O01_INSURANCE v = (OMD_O01_INSURANCE) s;
			} 

			else if(s instanceof RGV_O01_xx){
				RGV_O01_xx v = (RGV_O01_xx) s;
			} 

			else if(s instanceof SQM_S25_SERVICE){
				SQM_S25_SERVICE v = (SQM_S25_SERVICE) s;
			} 

			else if(s instanceof SRM_S04_PERSONNEL_RESOURCE){
				SRM_S04_PERSONNEL_RESOURCE v = (SRM_S04_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof DB1){
				DB1 v = (DB1) s;
			} 

			else if(s instanceof REF_I14_VISIT){
				REF_I14_VISIT v = (REF_I14_VISIT) s;
			} 

			else if(s instanceof RPA_I10_OBSERVATION){
				RPA_I10_OBSERVATION v = (RPA_I10_OBSERVATION) s;
			} 

			else if(s instanceof PPV_PCA_PATIENT_VISIT){
				PPV_PCA_PATIENT_VISIT v = (PPV_PCA_PATIENT_VISIT) s;
			} 

			else if(s instanceof RCL_I06_PROVIDER){
				RCL_I06_PROVIDER v = (RCL_I06_PROVIDER) s;
			} 

			else if(s instanceof SRR_S07_SCHEDULE){
				SRR_S07_SCHEDULE v = (SRR_S07_SCHEDULE) s;
			} 

			else if(s instanceof VXR_V03_PATIENT_VISIT){
				VXR_V03_PATIENT_VISIT v = (VXR_V03_PATIENT_VISIT) s;
			} 

			else if(s instanceof SIU_S13_RESOURCES){
				SIU_S13_RESOURCES v = (SIU_S13_RESOURCES) s;
			} 

			else if(s instanceof RRO_O02_ORDER_DETAIL){
				RRO_O02_ORDER_DETAIL v = (RRO_O02_ORDER_DETAIL) s;
			} 

			else if(s instanceof SRR_S02_SERVICE){
				SRR_S02_SERVICE v = (SRR_S02_SERVICE) s;
			} 

			else if(s instanceof SRM_S05_PATIENT){
				SRM_S05_PATIENT v = (SRM_S05_PATIENT) s;
			} 

			else if(s instanceof LRL){
				LRL v = (LRL) s;
			} 

			else if(s instanceof PTR_PCF_PROBLEM){
				PTR_PCF_PROBLEM v = (PTR_PCF_PROBLEM) s;
			} 

			else if(s instanceof QRY_PCK){
				QRY_PCK v = (QRY_PCK) s;
			} 

			else if(s instanceof SIU_S26_LOCATION_RESOURCE){
				SIU_S26_LOCATION_RESOURCE v = (SIU_S26_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof SIU_S21_GENERAL_RESOURCE){
				SIU_S21_GENERAL_RESOURCE v = (SIU_S21_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof ADT_A04_PROCEDURE){
				ADT_A04_PROCEDURE v = (ADT_A04_PROCEDURE) s;
			} 

			else if(s instanceof PPG_PCJ_GOAL){
				PPG_PCJ_GOAL v = (PPG_PCJ_GOAL) s;
			} 

			else if(s instanceof QRY_PCE){
				QRY_PCE v = (QRY_PCE) s;
			} 

			else if(s instanceof SRR_S11_SCHEDULE){
				SRR_S11_SCHEDULE v = (SRR_S11_SCHEDULE) s;
			} 

			else if(s instanceof RQA_I10_GUARANTOR_INSURANCE){
				RQA_I10_GUARANTOR_INSURANCE v = (RQA_I10_GUARANTOR_INSURANCE) s;
			} 

			else if(s instanceof PPP_PCC_PROBLEM_ROLE){
				PPP_PCC_PROBLEM_ROLE v = (PPP_PCC_PROBLEM_ROLE) s;
			} 

			else if(s instanceof RPI_I01_PROVIDER){
				RPI_I01_PROVIDER v = (RPI_I01_PROVIDER) s;
			} 

			else if(s instanceof SIU_S24_PATIENT){
				SIU_S24_PATIENT v = (SIU_S24_PATIENT) s;
			} 

			else if(s instanceof PTR_PCF_GOAL){
				PTR_PCF_GOAL v = (PTR_PCF_GOAL) s;
			} 

			else if(s instanceof SUR_P09_FACILITY_DETAIL){
				SUR_P09_FACILITY_DETAIL v = (SUR_P09_FACILITY_DETAIL) s;
			} 

			else if(s instanceof RPL_I02_PROVIDER){
				RPL_I02_PROVIDER v = (RPL_I02_PROVIDER) s;
			} 

			else if(s instanceof RQI_I01_INSURANCE){
				RQI_I01_INSURANCE v = (RQI_I01_INSURANCE) s;
			} 

			else if(s instanceof SIU_S12_RESOURCES){
				SIU_S12_RESOURCES v = (SIU_S12_RESOURCES) s;
			} 

			else if(s instanceof ADT_A05_PROCEDURE){
				ADT_A05_PROCEDURE v = (ADT_A05_PROCEDURE) s;
			} 

			else if(s instanceof OMS_O01_PATIENT_VISIT){
				OMS_O01_PATIENT_VISIT v = (OMS_O01_PATIENT_VISIT) s;
			} 

			else if(s instanceof PEX_P08){
				PEX_P08 v = (PEX_P08) s;
			} 

			else if(s instanceof SUR_P09){
				SUR_P09 v = (SUR_P09) s;
			} 

			else if(s instanceof ADT_A08_INSURANCE){
				ADT_A08_INSURANCE v = (ADT_A08_INSURANCE) s;
			} 

			else if(s instanceof SIU_S21_SERVICE){
				SIU_S21_SERVICE v = (SIU_S21_SERVICE) s;
			} 

			else if(s instanceof RPA_I08_RESULTS){
				RPA_I08_RESULTS v = (RPA_I08_RESULTS) s;
			} 

			else if(s instanceof PEX_P07){
				PEX_P07 v = (PEX_P07) s;
			} 

			else if(s instanceof OSR_Q06_PATIENT){
				OSR_Q06_PATIENT v = (OSR_Q06_PATIENT) s;
			} 

			else if(s instanceof SRM_S10_GENERAL_RESOURCE){
				SRM_S10_GENERAL_RESOURCE v = (SRM_S10_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof DFT_P03_INSURANCE){
				DFT_P03_INSURANCE v = (DFT_P03_INSURANCE) s;
			} 

			else if(s instanceof RAR_RAR_ORDER){
				RAR_RAR_ORDER v = (RAR_RAR_ORDER) s;
			} 

			else if(s instanceof PTR_PCF_PROBLEM_OBSERVATION){
				PTR_PCF_PROBLEM_OBSERVATION v = (PTR_PCF_PROBLEM_OBSERVATION) s;
			} 

			else if(s instanceof PPR_PC1_PROBLEM_OBSERVATION){
				PPR_PC1_PROBLEM_OBSERVATION v = (PPR_PC1_PROBLEM_OBSERVATION) s;
			} 

			else if(s instanceof RCI_I05){
				RCI_I05 v = (RCI_I05) s;
			} 

			else if(s instanceof PRR_PC5_ORDER_DETAIL){
				PRR_PC5_ORDER_DETAIL v = (PRR_PC5_ORDER_DETAIL) s;
			} 

			else if(s instanceof SRR_S05_GENERAL_RESOURCE){
				SRR_S05_GENERAL_RESOURCE v = (SRR_S05_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof PPR_PC2_PROBLEM){
				PPR_PC2_PROBLEM v = (PPR_PC2_PROBLEM) s;
			} 

			else if(s instanceof SIU_S18_PATIENT){
				SIU_S18_PATIENT v = (SIU_S18_PATIENT) s;
			} 

			else if(s instanceof RQA_I11_AUTHORIZATION){
				RQA_I11_AUTHORIZATION v = (RQA_I11_AUTHORIZATION) s;
			} 

			else if(s instanceof RRE_O01_PATIENT){
				RRE_O01_PATIENT v = (RRE_O01_PATIENT) s;
			} 

			else if(s instanceof PPP_PCD_PATHWAY_ROLE){
				PPP_PCD_PATHWAY_ROLE v = (PPP_PCD_PATHWAY_ROLE) s;
			} 

			else if(s instanceof PPP_PCD_ORDER_DETAIL){
				PPP_PCD_ORDER_DETAIL v = (PPP_PCD_ORDER_DETAIL) s;
			} 

			else if(s instanceof OMS_O01_ORDER_DETAIL){
				OMS_O01_ORDER_DETAIL v = (OMS_O01_ORDER_DETAIL) s;
			} 

			else if(s instanceof FHS){
				FHS v = (FHS) s;
			} 

			else if(s instanceof PPV_PCA_GOAL_PATHWAY){
				PPV_PCA_GOAL_PATHWAY v = (PPV_PCA_GOAL_PATHWAY) s;
			} 

			else if(s instanceof CSU_C09_STUDY_OBSERVATION){
				CSU_C09_STUDY_OBSERVATION v = (CSU_C09_STUDY_OBSERVATION) s;
			} 

			else if(s instanceof SIU_S18_GENERAL_RESOURCE){
				SIU_S18_GENERAL_RESOURCE v = (SIU_S18_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof RRD_O02_RESPONSE){
				RRD_O02_RESPONSE v = (RRD_O02_RESPONSE) s;
			} 

			else if(s instanceof VXR_V03_ORDER){
				VXR_V03_ORDER v = (VXR_V03_ORDER) s;
			} 

			else if(s instanceof PPR_PC3_ORDER){
				PPR_PC3_ORDER v = (PPR_PC3_ORDER) s;
			} 

			else if(s instanceof QRY_PC4){
				QRY_PC4 v = (QRY_PC4) s;
			} 

			else if(s instanceof QRY_PC9){
				QRY_PC9 v = (QRY_PC9) s;
			} 

			else if(s instanceof PPP_PCB_PATIENT_VISIT){
				PPP_PCB_PATIENT_VISIT v = (PPP_PCB_PATIENT_VISIT) s;
			} 

			else if(s instanceof RAS_O01_ORDER_DETAIL_SUPPLEMENT){
				RAS_O01_ORDER_DETAIL_SUPPLEMENT v = (RAS_O01_ORDER_DETAIL_SUPPLEMENT) s;
			} 

			else if(s instanceof VXU_V04_INSURANCE){
				VXU_V04_INSURANCE v = (VXU_V04_INSURANCE) s;
			} 

			else if(s instanceof MFN_M04_MF_CDM){
				MFN_M04_MF_CDM v = (MFN_M04_MF_CDM) s;
			} 

			else if(s instanceof PPP_PCC_GOAL){
				PPP_PCC_GOAL v = (PPP_PCC_GOAL) s;
			} 

			else if(s instanceof SIU_S26_SERVICE){
				SIU_S26_SERVICE v = (SIU_S26_SERVICE) s;
			} 

			else if(s instanceof SCH){
				SCH v = (SCH) s;
			} 

			else if(s instanceof SRR_S01_SCHEDULE){
				SRR_S01_SCHEDULE v = (SRR_S01_SCHEDULE) s;
			} 

			else if(s instanceof SRR_S06_RESOURCES){
				SRR_S06_RESOURCES v = (SRR_S06_RESOURCES) s;
			} 


		}
		
	}

}
