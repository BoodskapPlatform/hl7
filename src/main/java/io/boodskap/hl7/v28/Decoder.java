package io.boodskap.hl7.v28;

import org.json.JSONObject;

import ca.uhn.hl7v2.HapiContext;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.Structure;
import ca.uhn.hl7v2.model.v28.group.*;
import ca.uhn.hl7v2.model.v28.message.*;
import ca.uhn.hl7v2.model.v28.segment.*;
import ca.uhn.hl7v2.parser.Parser;
import io.boodskap.hl7.MessageDecoder;


public class Decoder implements MessageDecoder {

	@SuppressWarnings("unused")
	@Override
	public void decode(HapiContext context, Parser parser, Message msg, JSONObject json, String data) throws Exception {

		for (String type : msg.getNames()) {

			Structure s = msg.get(type);


			if(s instanceof RPR_I03_PROVIDER){
				RPR_I03_PROVIDER v = (RPR_I03_PROVIDER) s;
			} 

			else if(s instanceof SCP){
				SCP v = (SCP) s;
			} 

			else if(s instanceof PEX_P07_OBSERVATION){
				PEX_P07_OBSERVATION v = (PEX_P07_OBSERVATION) s;
			} 

			else if(s instanceof OUL_R24_COMMON_ORDER){
				OUL_R24_COMMON_ORDER v = (OUL_R24_COMMON_ORDER) s;
			} 

			else if(s instanceof ORU_R01_SPECIMEN_OBSERVATION){
				ORU_R01_SPECIMEN_OBSERVATION v = (ORU_R01_SPECIMEN_OBSERVATION) s;
			} 

			else if(s instanceof DEO_O45_DONOR_OBSERVATION){
				DEO_O45_DONOR_OBSERVATION v = (DEO_O45_DONOR_OBSERVATION) s;
			} 

			else if(s instanceof OML_O21_TIMING){
				OML_O21_TIMING v = (OML_O21_TIMING) s;
			} 

			else if(s instanceof OPL_O37_PATIENT){
				OPL_O37_PATIENT v = (OPL_O37_PATIENT) s;
			} 

			else if(s instanceof RGV_O15_OBSERVATION){
				RGV_O15_OBSERVATION v = (RGV_O15_OBSERVATION) s;
			} 

			else if(s instanceof DG1){
				DG1 v = (DG1) s;
			} 

			else if(s instanceof CCR_I16_RESOURCE_OBSERVATION){
				CCR_I16_RESOURCE_OBSERVATION v = (CCR_I16_RESOURCE_OBSERVATION) s;
			} 

			else if(s instanceof RSP_Z88_QUERY_RESPONSE){
				RSP_Z88_QUERY_RESPONSE v = (RSP_Z88_QUERY_RESPONSE) s;
			} 

			else if(s instanceof SDD){
				SDD v = (SDD) s;
			} 

			else if(s instanceof PEX_P07_STUDY){
				PEX_P07_STUDY v = (PEX_P07_STUDY) s;
			} 

			else if(s instanceof RQI_I01){
				RQI_I01 v = (RQI_I01) s;
			} 

			else if(s instanceof OMI_O23){
				OMI_O23 v = (OMI_O23) s;
			} 

			else if(s instanceof BAR_P02_PATIENT){
				BAR_P02_PATIENT v = (BAR_P02_PATIENT) s;
			} 

			else if(s instanceof BAR_P01_INSURANCE){
				BAR_P01_INSURANCE v = (BAR_P01_INSURANCE) s;
			} 

			else if(s instanceof RTB_Knn){
				RTB_Knn v = (RTB_Knn) s;
			} 

			else if(s instanceof OPL_O37_GUARANTOR){
				OPL_O37_GUARANTOR v = (OPL_O37_GUARANTOR) s;
			} 

			else if(s instanceof RSP_K32_QUERY_RESPONSE){
				RSP_K32_QUERY_RESPONSE v = (RSP_K32_QUERY_RESPONSE) s;
			} 

			else if(s instanceof CCM_I21_PROBLEM_OBSERVATION){
				CCM_I21_PROBLEM_OBSERVATION v = (CCM_I21_PROBLEM_OBSERVATION) s;
			} 

			else if(s instanceof OML_O35_PATIENT_PRIOR){
				OML_O35_PATIENT_PRIOR v = (OML_O35_PATIENT_PRIOR) s;
			} 

			else if(s instanceof PPG_PCG_ORDER_DETAIL){
				PPG_PCG_ORDER_DETAIL v = (PPG_PCG_ORDER_DETAIL) s;
			} 

			else if(s instanceof RRE_O12_TIMING_ENCODED){
				RRE_O12_TIMING_ENCODED v = (RRE_O12_TIMING_ENCODED) s;
			} 

			else if(s instanceof RSP_K31_ADDITIONAL_DEMOGRAPHICS){
				RSP_K31_ADDITIONAL_DEMOGRAPHICS v = (RSP_K31_ADDITIONAL_DEMOGRAPHICS) s;
			} 

			else if(s instanceof RDR_RDR_ENCODING){
				RDR_RDR_ENCODING v = (RDR_RDR_ENCODING) s;
			} 

			else if(s instanceof RRI_I12_PROCEDURE){
				RRI_I12_PROCEDURE v = (RRI_I12_PROCEDURE) s;
			} 

			else if(s instanceof CCI_I22){
				CCI_I22 v = (CCI_I22) s;
			} 

			else if(s instanceof CQU_I19_CLINICAL_HISTORY){
				CQU_I19_CLINICAL_HISTORY v = (CQU_I19_CLINICAL_HISTORY) s;
			} 

			else if(s instanceof RRI_I12_RESULTS_NOTES){
				RRI_I12_RESULTS_NOTES v = (RRI_I12_RESULTS_NOTES) s;
			} 

			else if(s instanceof QAK){
				QAK v = (QAK) s;
			} 

			else if(s instanceof ORL_O40_RESPONSE){
				ORL_O40_RESPONSE v = (ORL_O40_RESPONSE) s;
			} 

			else if(s instanceof CCU_I20_APPOINTMENT_HISTORY){
				CCU_I20_APPOINTMENT_HISTORY v = (CCU_I20_APPOINTMENT_HISTORY) s;
			} 

			else if(s instanceof CCR_I16_ROLE_CLINICAL_HISTORY){
				CCR_I16_ROLE_CLINICAL_HISTORY v = (CCR_I16_ROLE_CLINICAL_HISTORY) s;
			} 

			else if(s instanceof ORI_O24_ORDER){
				ORI_O24_ORDER v = (ORI_O24_ORDER) s;
			} 

			else if(s instanceof CQU_I19_RESOURCE_OBSERVATION){
				CQU_I19_RESOURCE_OBSERVATION v = (CQU_I19_RESOURCE_OBSERVATION) s;
			} 

			else if(s instanceof OUL_R23_COMMON_ORDER){
				OUL_R23_COMMON_ORDER v = (OUL_R23_COMMON_ORDER) s;
			} 

			else if(s instanceof RSP_Z86_GIVE){
				RSP_Z86_GIVE v = (RSP_Z86_GIVE) s;
			} 

			else if(s instanceof OUL_R24_VISIT){
				OUL_R24_VISIT v = (OUL_R24_VISIT) s;
			} 

			else if(s instanceof ORN_O08){
				ORN_O08 v = (ORN_O08) s;
			} 

			else if(s instanceof CCI_I22_APPOINTMENT_HISTORY){
				CCI_I22_APPOINTMENT_HISTORY v = (CCI_I22_APPOINTMENT_HISTORY) s;
			} 

			else if(s instanceof BRT_O32_TIMING){
				BRT_O32_TIMING v = (BRT_O32_TIMING) s;
			} 

			else if(s instanceof CCI_I22_GOAL){
				CCI_I22_GOAL v = (CCI_I22_GOAL) s;
			} 

			else if(s instanceof DEO_O45){
				DEO_O45 v = (DEO_O45) s;
			} 

			else if(s instanceof CQU_I19_INSURANCE){
				CQU_I19_INSURANCE v = (CQU_I19_INSURANCE) s;
			} 

			else if(s instanceof CCU_I20_PROVIDER_CONTACT){
				CCU_I20_PROVIDER_CONTACT v = (CCU_I20_PROVIDER_CONTACT) s;
			} 

			else if(s instanceof CCU_I20_MEDICATION_ADMINISTRATION_OBSERVATION){
				CCU_I20_MEDICATION_ADMINISTRATION_OBSERVATION v = (CCU_I20_MEDICATION_ADMINISTRATION_OBSERVATION) s;
			} 

			else if(s instanceof ORB_O28_ORDER){
				ORB_O28_ORDER v = (ORB_O28_ORDER) s;
			} 

			else if(s instanceof ADT_A05_INSURANCE){
				ADT_A05_INSURANCE v = (ADT_A05_INSURANCE) s;
			} 

			else if(s instanceof BRP_O30_TIMING){
				BRP_O30_TIMING v = (BRP_O30_TIMING) s;
			} 

			else if(s instanceof SFT){
				SFT v = (SFT) s;
			} 

			else if(s instanceof DFT_P03_FINANCIAL_ORDER){
				DFT_P03_FINANCIAL_ORDER v = (DFT_P03_FINANCIAL_ORDER) s;
			} 

			else if(s instanceof RRD_O14){
				RRD_O14 v = (RRD_O14) s;
			} 

			else if(s instanceof EHC_E01_INSURANCE){
				EHC_E01_INSURANCE v = (EHC_E01_INSURANCE) s;
			} 

			else if(s instanceof MFN_M05_MF_LOCATION){
				MFN_M05_MF_LOCATION v = (MFN_M05_MF_LOCATION) s;
			} 

			else if(s instanceof OPU_R25_SPECIMEN_OBSERVATION){
				OPU_R25_SPECIMEN_OBSERVATION v = (OPU_R25_SPECIMEN_OBSERVATION) s;
			} 

			else if(s instanceof RAS_O17_ORDER){
				RAS_O17_ORDER v = (RAS_O17_ORDER) s;
			} 

			else if(s instanceof RSP_Z90_COMMON_ORDER){
				RSP_Z90_COMMON_ORDER v = (RSP_Z90_COMMON_ORDER) s;
			} 

			else if(s instanceof OMQ_O42_PATIENT){
				OMQ_O42_PATIENT v = (OMQ_O42_PATIENT) s;
			} 

			else if(s instanceof SGH){
				SGH v = (SGH) s;
			} 

			else if(s instanceof CCU_I20_MEDICATION_HISTORY){
				CCU_I20_MEDICATION_HISTORY v = (CCU_I20_MEDICATION_HISTORY) s;
			} 

			else if(s instanceof CCR_I16_CLINICAL_HISTORY){
				CCR_I16_CLINICAL_HISTORY v = (CCR_I16_CLINICAL_HISTORY) s;
			} 

			else if(s instanceof OPR_O38){
				OPR_O38 v = (OPR_O38) s;
			} 

			else if(s instanceof OPR_O38_SPECIMEN){
				OPR_O38_SPECIMEN v = (OPR_O38_SPECIMEN) s;
			} 

			else if(s instanceof OMQ_O42_PATIENT_PRIOR){
				OMQ_O42_PATIENT_PRIOR v = (OMQ_O42_PATIENT_PRIOR) s;
			} 

			else if(s instanceof RRA_O18_TREATMENT){
				RRA_O18_TREATMENT v = (RRA_O18_TREATMENT) s;
			} 

			else if(s instanceof MFN_M07){
				MFN_M07 v = (MFN_M07) s;
			} 

			else if(s instanceof MFN_M08){
				MFN_M08 v = (MFN_M08) s;
			} 

			else if(s instanceof PPR_PC1_PATIENT_VISIT){
				PPR_PC1_PATIENT_VISIT v = (PPR_PC1_PATIENT_VISIT) s;
			} 

			else if(s instanceof SGT){
				SGT v = (SGT) s;
			} 

			else if(s instanceof OML_O21_TIMING_PRIOR){
				OML_O21_TIMING_PRIOR v = (OML_O21_TIMING_PRIOR) s;
			} 

			else if(s instanceof MFN_M05){
				MFN_M05 v = (MFN_M05) s;
			} 

			else if(s instanceof MFN_M06){
				MFN_M06 v = (MFN_M06) s;
			} 

			else if(s instanceof NMD_N02){
				NMD_N02 v = (NMD_N02) s;
			} 

			else if(s instanceof EHC_E13_RESPONSE){
				EHC_E13_RESPONSE v = (EHC_E13_RESPONSE) s;
			} 

			else if(s instanceof MFN_M09){
				MFN_M09 v = (MFN_M09) s;
			} 

			else if(s instanceof RPL_I02){
				RPL_I02 v = (RPL_I02) s;
			} 

			else if(s instanceof ORG_O20_PATIENT){
				ORG_O20_PATIENT v = (ORG_O20_PATIENT) s;
			} 

			else if(s instanceof RSP_K31_OBSERVATION){
				RSP_K31_OBSERVATION v = (RSP_K31_OBSERVATION) s;
			} 

			else if(s instanceof MFN_M04){
				MFN_M04 v = (MFN_M04) s;
			} 

			else if(s instanceof CCM_I21_MEDICATION_ORDER_OBSERVATION){
				CCM_I21_MEDICATION_ORDER_OBSERVATION v = (CCM_I21_MEDICATION_ORDER_OBSERVATION) s;
			} 

			else if(s instanceof MFN_M02){
				MFN_M02 v = (MFN_M02) s;
			} 

			else if(s instanceof PGL_PC6_PROBLEM_OBSERVATION){
				PGL_PC6_PROBLEM_OBSERVATION v = (PGL_PC6_PROBLEM_OBSERVATION) s;
			} 

			else if(s instanceof EHC_E04_PRODUCT_SERVICE_SECTION){
				EHC_E04_PRODUCT_SERVICE_SECTION v = (EHC_E04_PRODUCT_SERVICE_SECTION) s;
			} 

			else if(s instanceof ORU_R30){
				ORU_R30 v = (ORU_R30) s;
			} 

			else if(s instanceof CQU_I19_PROVIDER_CONTACT){
				CQU_I19_PROVIDER_CONTACT v = (CQU_I19_PROVIDER_CONTACT) s;
			} 

			else if(s instanceof CQU_I19_ROLE_PATHWAY){
				CQU_I19_ROLE_PATHWAY v = (CQU_I19_ROLE_PATHWAY) s;
			} 

			else if(s instanceof OMQ_O42_ORDER){
				OMQ_O42_ORDER v = (OMQ_O42_ORDER) s;
			} 

			else if(s instanceof SHP){
				SHP v = (SHP) s;
			} 

			else if(s instanceof ORI_O24_RESPONSE){
				ORI_O24_RESPONSE v = (ORI_O24_RESPONSE) s;
			} 

			else if(s instanceof RSP_Z82_ORDER_DETAIL){
				RSP_Z82_ORDER_DETAIL v = (RSP_Z82_ORDER_DETAIL) s;
			} 

			else if(s instanceof RSP_Z82_COMMON_ORDER){
				RSP_Z82_COMMON_ORDER v = (RSP_Z82_COMMON_ORDER) s;
			} 

			else if(s instanceof OPL_O37_PRIOR_RESULT){
				OPL_O37_PRIOR_RESULT v = (OPL_O37_PRIOR_RESULT) s;
			} 

			else if(s instanceof BTS_O31){
				BTS_O31 v = (BTS_O31) s;
			} 

			else if(s instanceof OML_O21_OBSERVATION){
				OML_O21_OBSERVATION v = (OML_O21_OBSERVATION) s;
			} 

			else if(s instanceof CCU_I20_CLINICAL_HISTORY){
				CCU_I20_CLINICAL_HISTORY v = (CCU_I20_CLINICAL_HISTORY) s;
			} 

			else if(s instanceof RPA_I08_OBSERVATION){
				RPA_I08_OBSERVATION v = (RPA_I08_OBSERVATION) s;
			} 

			else if(s instanceof OML_O33_ORDER_PRIOR){
				OML_O33_ORDER_PRIOR v = (OML_O33_ORDER_PRIOR) s;
			} 

			else if(s instanceof OML_O35_ORDER_PRIOR){
				OML_O35_ORDER_PRIOR v = (OML_O35_ORDER_PRIOR) s;
			} 

			else if(s instanceof OML_O33_SPECIMEN){
				OML_O33_SPECIMEN v = (OML_O33_SPECIMEN) s;
			} 

			else if(s instanceof ORL_O22_SPECIMEN){
				ORL_O22_SPECIMEN v = (ORL_O22_SPECIMEN) s;
			} 

			else if(s instanceof SID){
				SID v = (SID) s;
			} 

			else if(s instanceof BPS_O29_PRODUCT){
				BPS_O29_PRODUCT v = (BPS_O29_PRODUCT) s;
			} 

			else if(s instanceof CCI_I22_RESOURCE_DETAIL){
				CCI_I22_RESOURCE_DETAIL v = (CCI_I22_RESOURCE_DETAIL) s;
			} 

			else if(s instanceof ADT_A01_INSURANCE){
				ADT_A01_INSURANCE v = (ADT_A01_INSURANCE) s;
			} 

			else if(s instanceof RSP_Z86_QUERY_RESPONSE){
				RSP_Z86_QUERY_RESPONSE v = (RSP_Z86_QUERY_RESPONSE) s;
			} 

			else if(s instanceof RRD_O14_DISPENSE){
				RRD_O14_DISPENSE v = (RRD_O14_DISPENSE) s;
			} 

			else if(s instanceof PEX_P07_RX_ADMINISTRATION){
				PEX_P07_RX_ADMINISTRATION v = (PEX_P07_RX_ADMINISTRATION) s;
			} 

			else if(s instanceof PEX_P07_VISIT){
				PEX_P07_VISIT v = (PEX_P07_VISIT) s;
			} 

			else if(s instanceof OMI_O23_OBSERVATION){
				OMI_O23_OBSERVATION v = (OMI_O23_OBSERVATION) s;
			} 

			else if(s instanceof ADT_A60_ADVERSE_REACTION_GROUP){
				ADT_A60_ADVERSE_REACTION_GROUP v = (ADT_A60_ADVERSE_REACTION_GROUP) s;
			} 

			else if(s instanceof RSP_Z88_TIMING_ENCODED){
				RSP_Z88_TIMING_ENCODED v = (RSP_Z88_TIMING_ENCODED) s;
			} 

			else if(s instanceof BAR_P05_INSURANCE){
				BAR_P05_INSURANCE v = (BAR_P05_INSURANCE) s;
			} 

			else if(s instanceof OUL_R22_COMMON_ORDER){
				OUL_R22_COMMON_ORDER v = (OUL_R22_COMMON_ORDER) s;
			} 

			else if(s instanceof CCR_I16_PROVIDER_CONTACT){
				CCR_I16_PROVIDER_CONTACT v = (CCR_I16_PROVIDER_CONTACT) s;
			} 

			else if(s instanceof OPR_O38_TIMING){
				OPR_O38_TIMING v = (OPR_O38_TIMING) s;
			} 

			else if(s instanceof OML_O33_OBSERVATION_PRIOR){
				OML_O33_OBSERVATION_PRIOR v = (OML_O33_OBSERVATION_PRIOR) s;
			} 

			else if(s instanceof OML_O35_ORDER){
				OML_O35_ORDER v = (OML_O35_ORDER) s;
			} 

			else if(s instanceof SRR_S01_SERVICE){
				SRR_S01_SERVICE v = (SRR_S01_SERVICE) s;
			} 

			else if(s instanceof CCR_I16_CLINICAL_HISTORY_OBSERVATION){
				CCR_I16_CLINICAL_HISTORY_OBSERVATION v = (CCR_I16_CLINICAL_HISTORY_OBSERVATION) s;
			} 

			else if(s instanceof BHS){
				BHS v = (BHS) s;
			} 

			else if(s instanceof PPP_PCB_GOAL_ROLE){
				PPP_PCB_GOAL_ROLE v = (PPP_PCB_GOAL_ROLE) s;
			} 

			else if(s instanceof EAR_U08_SPECIMEN_CONTAINER){
				EAR_U08_SPECIMEN_CONTAINER v = (EAR_U08_SPECIMEN_CONTAINER) s;
			} 

			else if(s instanceof PGL_PC6_PATHWAY){
				PGL_PC6_PATHWAY v = (PGL_PC6_PATHWAY) s;
			} 

			else if(s instanceof OMP_O09_PATIENT_VISIT){
				OMP_O09_PATIENT_VISIT v = (OMP_O09_PATIENT_VISIT) s;
			} 

			else if(s instanceof EAC_U07){
				EAC_U07 v = (EAC_U07) s;
			} 

			else if(s instanceof PGL_PC6_ORDER){
				PGL_PC6_ORDER v = (PGL_PC6_ORDER) s;
			} 

			else if(s instanceof RRE_O12){
				RRE_O12 v = (RRE_O12) s;
			} 

			else if(s instanceof RGV_O15_ORDER_DETAIL_SUPPLEMENT){
				RGV_O15_ORDER_DETAIL_SUPPLEMENT v = (RGV_O15_ORDER_DETAIL_SUPPLEMENT) s;
			} 

			else if(s instanceof ORL_O34_SPECIMEN){
				ORL_O34_SPECIMEN v = (ORL_O34_SPECIMEN) s;
			} 

			else if(s instanceof OUL_R24_CONTAINER){
				OUL_R24_CONTAINER v = (OUL_R24_CONTAINER) s;
			} 

			else if(s instanceof CCU_I20_RESOURCE_DETAIL){
				CCU_I20_RESOURCE_DETAIL v = (CCU_I20_RESOURCE_DETAIL) s;
			} 

			else if(s instanceof Zxx){
				Zxx v = (Zxx) s;
			} 

			else if(s instanceof OBR){
				OBR v = (OBR) s;
			} 

			else if(s instanceof VXU_V04_PATIENT_VISIT){
				VXU_V04_PATIENT_VISIT v = (VXU_V04_PATIENT_VISIT) s;
			} 

			else if(s instanceof DMI){
				DMI v = (DMI) s;
			} 

			else if(s instanceof OPL_O37_CONTAINER_OBSERVATION){
				OPL_O37_CONTAINER_OBSERVATION v = (OPL_O37_CONTAINER_OBSERVATION) s;
			} 

			else if(s instanceof MFN_M16){
				MFN_M16 v = (MFN_M16) s;
			} 

			else if(s instanceof MFN_M17){
				MFN_M17 v = (MFN_M17) s;
			} 

			else if(s instanceof OBX){
				OBX v = (OBX) s;
			} 

			else if(s instanceof EAC_U07_COMMAND){
				EAC_U07_COMMAND v = (EAC_U07_COMMAND) s;
			} 

			else if(s instanceof ADT_A44_PATIENT){
				ADT_A44_PATIENT v = (ADT_A44_PATIENT) s;
			} 

			else if(s instanceof MFN_M10){
				MFN_M10 v = (MFN_M10) s;
			} 

			else if(s instanceof MFN_M11){
				MFN_M11 v = (MFN_M11) s;
			} 

			else if(s instanceof BAR_P05_PROCEDURE){
				BAR_P05_PROCEDURE v = (BAR_P05_PROCEDURE) s;
			} 

			else if(s instanceof MFN_M15){
				MFN_M15 v = (MFN_M15) s;
			} 

			else if(s instanceof MFN_M12){
				MFN_M12 v = (MFN_M12) s;
			} 

			else if(s instanceof MFN_M13){
				MFN_M13 v = (MFN_M13) s;
			} 

			else if(s instanceof VXU_V04_PERSON_OBSERVATION){
				VXU_V04_PERSON_OBSERVATION v = (VXU_V04_PERSON_OBSERVATION) s;
			} 

			else if(s instanceof RQA_I08_VISIT){
				RQA_I08_VISIT v = (RQA_I08_VISIT) s;
			} 

			else if(s instanceof CSU_C09_STUDY_OBSERVATION_ORDER){
				CSU_C09_STUDY_OBSERVATION_ORDER v = (CSU_C09_STUDY_OBSERVATION_ORDER) s;
			} 

			else if(s instanceof RPA_I08_INSURANCE){
				RPA_I08_INSURANCE v = (RPA_I08_INSURANCE) s;
			} 

			else if(s instanceof OPU_R25_PATIENT_OBSERVATION){
				OPU_R25_PATIENT_OBSERVATION v = (OPU_R25_PATIENT_OBSERVATION) s;
			} 

			else if(s instanceof OSM_R26_SPECIMEN_OBSERVATION){
				OSM_R26_SPECIMEN_OBSERVATION v = (OSM_R26_SPECIMEN_OBSERVATION) s;
			} 

			else if(s instanceof OML_O39_SPECIMEN_SHIPMENT){
				OML_O39_SPECIMEN_SHIPMENT v = (OML_O39_SPECIMEN_SHIPMENT) s;
			} 

			else if(s instanceof OMQ_O42_PRIOR_RESULT){
				OMQ_O42_PRIOR_RESULT v = (OMQ_O42_PRIOR_RESULT) s;
			} 

			else if(s instanceof ORN_O08_TIMING){
				ORN_O08_TIMING v = (ORN_O08_TIMING) s;
			} 

			else if(s instanceof OMP_O09_INSURANCE){
				OMP_O09_INSURANCE v = (OMP_O09_INSURANCE) s;
			} 

			else if(s instanceof EHC_E01_PRODUCT_SERVICE_LINE_ITEM){
				EHC_E01_PRODUCT_SERVICE_LINE_ITEM v = (EHC_E01_PRODUCT_SERVICE_LINE_ITEM) s;
			} 

			else if(s instanceof PEX_P07_PEX_CAUSE){
				PEX_P07_PEX_CAUSE v = (PEX_P07_PEX_CAUSE) s;
			} 

			else if(s instanceof RDE_O11){
				RDE_O11 v = (RDE_O11) s;
			} 

			else if(s instanceof RDR_RDR_DISPENSE){
				RDR_RDR_DISPENSE v = (RDR_RDR_DISPENSE) s;
			} 

			else if(s instanceof OML_O35_INSURANCE){
				OML_O35_INSURANCE v = (OML_O35_INSURANCE) s;
			} 

			else if(s instanceof PPG_PCG_ORDER){
				PPG_PCG_ORDER v = (PPG_PCG_ORDER) s;
			} 

			else if(s instanceof ORL_O34_OBSERVATION_REQUEST){
				ORL_O34_OBSERVATION_REQUEST v = (ORL_O34_OBSERVATION_REQUEST) s;
			} 

			else if(s instanceof OUL_R24){
				OUL_R24 v = (OUL_R24) s;
			} 

			else if(s instanceof OUL_R23){
				OUL_R23 v = (OUL_R23) s;
			} 

			else if(s instanceof OUL_R22){
				OUL_R22 v = (OUL_R22) s;
			} 

			else if(s instanceof CCR_I16_CLINICAL_ORDER){
				CCR_I16_CLINICAL_ORDER v = (CCR_I16_CLINICAL_ORDER) s;
			} 

			else if(s instanceof CCM_I21_MEDICATION_ENCODING_DETAIL){
				CCM_I21_MEDICATION_ENCODING_DETAIL v = (CCM_I21_MEDICATION_ENCODING_DETAIL) s;
			} 

			else if(s instanceof CCR_I16_CLINICAL_ORDER_DETAIL){
				CCR_I16_CLINICAL_ORDER_DETAIL v = (CCR_I16_CLINICAL_ORDER_DETAIL) s;
			} 

			else if(s instanceof ORL_O40_SPECIMEN_SHIPMENT){
				ORL_O40_SPECIMEN_SHIPMENT v = (ORL_O40_SPECIMEN_SHIPMENT) s;
			} 

			else if(s instanceof RDE_O11_TIMING_ENCODED){
				RDE_O11_TIMING_ENCODED v = (RDE_O11_TIMING_ENCODED) s;
			} 

			else if(s instanceof CCM_I21_RESOURCES){
				CCM_I21_RESOURCES v = (CCM_I21_RESOURCES) s;
			} 

			else if(s instanceof OMD_O03_INSURANCE){
				OMD_O03_INSURANCE v = (OMD_O03_INSURANCE) s;
			} 

			else if(s instanceof RAS_O17_PATIENT_VISIT){
				RAS_O17_PATIENT_VISIT v = (RAS_O17_PATIENT_VISIT) s;
			} 

			else if(s instanceof OMI_O23_TIMING){
				OMI_O23_TIMING v = (OMI_O23_TIMING) s;
			} 

			else if(s instanceof SLT){
				SLT v = (SLT) s;
			} 

			else if(s instanceof CCR_I16_APPOINTMENT_HISTORY){
				CCR_I16_APPOINTMENT_HISTORY v = (CCR_I16_APPOINTMENT_HISTORY) s;
			} 

			else if(s instanceof ODT){
				ODT v = (ODT) s;
			} 

			else if(s instanceof OMG_O19_INSURANCE){
				OMG_O19_INSURANCE v = (OMG_O19_INSURANCE) s;
			} 

			else if(s instanceof OUL_R24_RESULT){
				OUL_R24_RESULT v = (OUL_R24_RESULT) s;
			} 

			else if(s instanceof ODS){
				ODS v = (ODS) s;
			} 

			else if(s instanceof RSP_Z82_TREATMENT){
				RSP_Z82_TREATMENT v = (RSP_Z82_TREATMENT) s;
			} 

			else if(s instanceof BPS_O29_ORDER){
				BPS_O29_ORDER v = (BPS_O29_ORDER) s;
			} 

			else if(s instanceof FT1){
				FT1 v = (FT1) s;
			} 

			else if(s instanceof DON){
				DON v = (DON) s;
			} 

			else if(s instanceof OUL_R22_TIMING_QTY){
				OUL_R22_TIMING_QTY v = (OUL_R22_TIMING_QTY) s;
			} 

			else if(s instanceof OUL_R24_ORDER_DOCUMENT){
				OUL_R24_ORDER_DOCUMENT v = (OUL_R24_ORDER_DOCUMENT) s;
			} 

			else if(s instanceof ORU_R01_VISIT){
				ORU_R01_VISIT v = (ORU_R01_VISIT) s;
			} 

			else if(s instanceof DFT_P03_FINANCIAL_TIMING_QUANTITY){
				DFT_P03_FINANCIAL_TIMING_QUANTITY v = (DFT_P03_FINANCIAL_TIMING_QUANTITY) s;
			} 

			else if(s instanceof OML_O21_SPECIMEN){
				OML_O21_SPECIMEN v = (OML_O21_SPECIMEN) s;
			} 

			else if(s instanceof OML_O33_OBSERVATION){
				OML_O33_OBSERVATION v = (OML_O33_OBSERVATION) s;
			} 

			else if(s instanceof OMG_O19){
				OMG_O19 v = (OMG_O19) s;
			} 

			else if(s instanceof RRI_I12){
				RRI_I12 v = (RRI_I12) s;
			} 

			else if(s instanceof QID){
				QID v = (QID) s;
			} 

			else if(s instanceof OMI_O23_PATIENT_VISIT){
				OMI_O23_PATIENT_VISIT v = (OMI_O23_PATIENT_VISIT) s;
			} 

			else if(s instanceof CCU_I20_PATHWAY_OBSERVATION){
				CCU_I20_PATHWAY_OBSERVATION v = (CCU_I20_PATHWAY_OBSERVATION) s;
			} 

			else if(s instanceof ORL_O40_PATIENT){
				ORL_O40_PATIENT v = (ORL_O40_PATIENT) s;
			} 

			else if(s instanceof PPG_PCG_PATHWAY_ROLE){
				PPG_PCG_PATHWAY_ROLE v = (PPG_PCG_PATHWAY_ROLE) s;
			} 

			else if(s instanceof CCU_I20_PATHWAY){
				CCU_I20_PATHWAY v = (CCU_I20_PATHWAY) s;
			} 

			else if(s instanceof REF_I12_PROCEDURE){
				REF_I12_PROCEDURE v = (REF_I12_PROCEDURE) s;
			} 

			else if(s instanceof OMP_O09_TIMING){
				OMP_O09_TIMING v = (OMP_O09_TIMING) s;
			} 

			else if(s instanceof RRG_O16_TIMING){
				RRG_O16_TIMING v = (RRG_O16_TIMING) s;
			} 

			else if(s instanceof ORU_R01){
				ORU_R01 v = (ORU_R01) s;
			} 

			else if(s instanceof DFT_P11_OBSERVATION){
				DFT_P11_OBSERVATION v = (DFT_P11_OBSERVATION) s;
			} 

			else if(s instanceof BLC){
				BLC v = (BLC) s;
			} 

			else if(s instanceof BLG){
				BLG v = (BLG) s;
			} 

			else if(s instanceof EAR_U08){
				EAR_U08 v = (EAR_U08) s;
			} 

			else if(s instanceof RSP_Z86_DISPENSE){
				RSP_Z86_DISPENSE v = (RSP_Z86_DISPENSE) s;
			} 

			else if(s instanceof CCR_I16_ROLE_PATHWAY){
				CCR_I16_ROLE_PATHWAY v = (CCR_I16_ROLE_PATHWAY) s;
			} 

			else if(s instanceof ADT_A61){
				ADT_A61 v = (ADT_A61) s;
			} 

			else if(s instanceof FTS){
				FTS v = (FTS) s;
			} 

			else if(s instanceof OML_O35_TIMING){
				OML_O35_TIMING v = (OML_O35_TIMING) s;
			} 

			else if(s instanceof URD){
				URD v = (URD) s;
			} 

			else if(s instanceof RRD_O14_RESPONSE){
				RRD_O14_RESPONSE v = (RRD_O14_RESPONSE) s;
			} 

			else if(s instanceof ADT_A60){
				ADT_A60 v = (ADT_A60) s;
			} 

			else if(s instanceof EHC_E24_PSL_ITEM_INFO){
				EHC_E24_PSL_ITEM_INFO v = (EHC_E24_PSL_ITEM_INFO) s;
			} 

			else if(s instanceof CQU_I19_PATHWAY_OBSERVATION){
				CQU_I19_PATHWAY_OBSERVATION v = (CQU_I19_PATHWAY_OBSERVATION) s;
			} 

			else if(s instanceof DFT_P11_FINANCIAL_TIMING_QUANTITY){
				DFT_P11_FINANCIAL_TIMING_QUANTITY v = (DFT_P11_FINANCIAL_TIMING_QUANTITY) s;
			} 

			else if(s instanceof OPL_O37_ORDER_PRIOR){
				OPL_O37_ORDER_PRIOR v = (OPL_O37_ORDER_PRIOR) s;
			} 

			else if(s instanceof PGL_PC6_PROBLEM_ROLE){
				PGL_PC6_PROBLEM_ROLE v = (PGL_PC6_PROBLEM_ROLE) s;
			} 

			else if(s instanceof DEO_O45_DONOR){
				DEO_O45_DONOR v = (DEO_O45_DONOR) s;
			} 

			else if(s instanceof BTS_O31_PATIENT_VISIT){
				BTS_O31_PATIENT_VISIT v = (BTS_O31_PATIENT_VISIT) s;
			} 

			else if(s instanceof CCI_I22_MEDICATION_ENCODING_DETAIL){
				CCI_I22_MEDICATION_ENCODING_DETAIL v = (CCI_I22_MEDICATION_ENCODING_DETAIL) s;
			} 

			else if(s instanceof URS){
				URS v = (URS) s;
			} 

			else if(s instanceof PPG_PCG_PROBLEM_OBSERVATION){
				PPG_PCG_PROBLEM_OBSERVATION v = (PPG_PCG_PROBLEM_OBSERVATION) s;
			} 

			else if(s instanceof RRD_O14_PATIENT){
				RRD_O14_PATIENT v = (RRD_O14_PATIENT) s;
			} 

			else if(s instanceof CQU_I19_PATHWAY){
				CQU_I19_PATHWAY v = (CQU_I19_PATHWAY) s;
			} 

			else if(s instanceof SRM_S01){
				SRM_S01 v = (SRM_S01) s;
			} 

			else if(s instanceof OUL_R23_SPECIMEN){
				OUL_R23_SPECIMEN v = (OUL_R23_SPECIMEN) s;
			} 

			else if(s instanceof CQU_I19_MEDICATION_ORDER_OBSERVATION){
				CQU_I19_MEDICATION_ORDER_OBSERVATION v = (CQU_I19_MEDICATION_ORDER_OBSERVATION) s;
			} 

			else if(s instanceof BRP_O30_PATIENT){
				BRP_O30_PATIENT v = (BRP_O30_PATIENT) s;
			} 

			else if(s instanceof RSP_Z86_ORDER_DETAIL){
				RSP_Z86_ORDER_DETAIL v = (RSP_Z86_ORDER_DETAIL) s;
			} 

			else if(s instanceof DFT_P11_ORDER){
				DFT_P11_ORDER v = (DFT_P11_ORDER) s;
			} 

			else if(s instanceof RSP_K23_QUERY_RESPONSE){
				RSP_K23_QUERY_RESPONSE v = (RSP_K23_QUERY_RESPONSE) s;
			} 

			else if(s instanceof CCM_I21_MEDICATION_HISTORY){
				CCM_I21_MEDICATION_HISTORY v = (CCM_I21_MEDICATION_HISTORY) s;
			} 

			else if(s instanceof OPR_O38_RESPONSE){
				OPR_O38_RESPONSE v = (OPR_O38_RESPONSE) s;
			} 

			else if(s instanceof EHC_E02_PRODUCT_SERVICE_SECTION){
				EHC_E02_PRODUCT_SERVICE_SECTION v = (EHC_E02_PRODUCT_SERVICE_SECTION) s;
			} 

			else if(s instanceof OSM_R26_PATIENT_OBSERVATION){
				OSM_R26_PATIENT_OBSERVATION v = (OSM_R26_PATIENT_OBSERVATION) s;
			} 

			else if(s instanceof RGV_O15_ORDER){
				RGV_O15_ORDER v = (RGV_O15_ORDER) s;
			} 

			else if(s instanceof RDS_O13_PATIENT){
				RDS_O13_PATIENT v = (RDS_O13_PATIENT) s;
			} 

			else if(s instanceof RSP_Z90_TIMING){
				RSP_Z90_TIMING v = (RSP_Z90_TIMING) s;
			} 

			else if(s instanceof DRG){
				DRG v = (DRG) s;
			} 

			else if(s instanceof CCR_I16_MEDICATION_ORDER_OBSERVATION){
				CCR_I16_MEDICATION_ORDER_OBSERVATION v = (CCR_I16_MEDICATION_ORDER_OBSERVATION) s;
			} 

			else if(s instanceof BAR_P01_VISIT){
				BAR_P01_VISIT v = (BAR_P01_VISIT) s;
			} 

			else if(s instanceof OPU_R25){
				OPU_R25 v = (OPU_R25) s;
			} 

			else if(s instanceof DFT_P11_INSURANCE){
				DFT_P11_INSURANCE v = (DFT_P11_INSURANCE) s;
			} 

			else if(s instanceof EHC_E02_PSG){
				EHC_E02_PSG v = (EHC_E02_PSG) s;
			} 

			else if(s instanceof DFT_P03_FINANCIAL_PROCEDURE){
				DFT_P03_FINANCIAL_PROCEDURE v = (DFT_P03_FINANCIAL_PROCEDURE) s;
			} 

			else if(s instanceof ORL_O40_TIMING){
				ORL_O40_TIMING v = (ORL_O40_TIMING) s;
			} 

			else if(s instanceof SIU_S12_SERVICE){
				SIU_S12_SERVICE v = (SIU_S12_SERVICE) s;
			} 

			else if(s instanceof MFN_M09_MF_TEST_CATEGORICAL){
				MFN_M09_MF_TEST_CATEGORICAL v = (MFN_M09_MF_TEST_CATEGORICAL) s;
			} 

			else if(s instanceof SPM){
				SPM v = (SPM) s;
			} 

			else if(s instanceof DRG_O43_DONOR){
				DRG_O43_DONOR v = (DRG_O43_DONOR) s;
			} 

			else if(s instanceof DFT_P03_ORDER){
				DFT_P03_ORDER v = (DFT_P03_ORDER) s;
			} 

			else if(s instanceof DSC){
				DSC v = (DSC) s;
			} 

			else if(s instanceof MFN_M16_MATERIAL_LOCATION){
				MFN_M16_MATERIAL_LOCATION v = (MFN_M16_MATERIAL_LOCATION) s;
			} 

			else if(s instanceof QSB_Q16){
				QSB_Q16 v = (QSB_Q16) s;
			} 

			else if(s instanceof DSP){
				DSP v = (DSP) s;
			} 

			else if(s instanceof DFT_P11){
				DFT_P11 v = (DFT_P11) s;
			} 

			else if(s instanceof RGV_O15_TIMING){
				RGV_O15_TIMING v = (RGV_O15_TIMING) s;
			} 

			else if(s instanceof EHC_E20_PAT_INFO){
				EHC_E20_PAT_INFO v = (EHC_E20_PAT_INFO) s;
			} 

			else if(s instanceof CCU_I20_GOAL_OBSERVATION){
				CCU_I20_GOAL_OBSERVATION v = (CCU_I20_GOAL_OBSERVATION) s;
			} 

			else if(s instanceof CCU_I20_ROLE_CLINICAL_HISTORY){
				CCU_I20_ROLE_CLINICAL_HISTORY v = (CCU_I20_ROLE_CLINICAL_HISTORY) s;
			} 

			else if(s instanceof ORP_O10){
				ORP_O10 v = (ORP_O10) s;
			} 

			else if(s instanceof ORU_R01_PATIENT_OBSERVATION){
				ORU_R01_PATIENT_OBSERVATION v = (ORU_R01_PATIENT_OBSERVATION) s;
			} 

			else if(s instanceof OUL_R23_PATIENT){
				OUL_R23_PATIENT v = (OUL_R23_PATIENT) s;
			} 

			else if(s instanceof DRC_O47){
				DRC_O47 v = (DRC_O47) s;
			} 

			else if(s instanceof RDS_O13_ORDER_DETAIL){
				RDS_O13_ORDER_DETAIL v = (RDS_O13_ORDER_DETAIL) s;
			} 

			else if(s instanceof DBC_O41_DONOR){
				DBC_O41_DONOR v = (DBC_O41_DONOR) s;
			} 

			else if(s instanceof RRG_O16){
				RRG_O16 v = (RRG_O16) s;
			} 

			else if(s instanceof CCI_I22_MEDICATION_ORDER_OBSERVATION){
				CCI_I22_MEDICATION_ORDER_OBSERVATION v = (CCI_I22_MEDICATION_ORDER_OBSERVATION) s;
			} 

			else if(s instanceof ORL_O36_RESPONSE){
				ORL_O36_RESPONSE v = (ORL_O36_RESPONSE) s;
			} 

			else if(s instanceof BPO){
				BPO v = (BPO) s;
			} 

			else if(s instanceof DFT_P03){
				DFT_P03 v = (DFT_P03) s;
			} 

			else if(s instanceof PPR_PC1_PATHWAY){
				PPR_PC1_PATHWAY v = (PPR_PC1_PATHWAY) s;
			} 

			else if(s instanceof CCR_I16_PATHWAY_OBSERVATION){
				CCR_I16_PATHWAY_OBSERVATION v = (CCR_I16_PATHWAY_OBSERVATION) s;
			} 

			else if(s instanceof RAS_O17_ADMINISTRATION){
				RAS_O17_ADMINISTRATION v = (RAS_O17_ADMINISTRATION) s;
			} 

			else if(s instanceof BAR_P10_PROCEDURE){
				BAR_P10_PROCEDURE v = (BAR_P10_PROCEDURE) s;
			} 

			else if(s instanceof CCM_I21_INSURANCE){
				CCM_I21_INSURANCE v = (CCM_I21_INSURANCE) s;
			} 

			else if(s instanceof MFA){
				MFA v = (MFA) s;
			} 

			else if(s instanceof RTB_K13){
				RTB_K13 v = (RTB_K13) s;
			} 

			else if(s instanceof BPX){
				BPX v = (BPX) s;
			} 

			else if(s instanceof MFE){
				MFE v = (MFE) s;
			} 

			else if(s instanceof OPL_O37_TIMING){
				OPL_O37_TIMING v = (OPL_O37_TIMING) s;
			} 

			else if(s instanceof BAR_P05_VISIT){
				BAR_P05_VISIT v = (BAR_P05_VISIT) s;
			} 

			else if(s instanceof MFI){
				MFI v = (MFI) s;
			} 

			else if(s instanceof DBC_O42_DONOR){
				DBC_O42_DONOR v = (DBC_O42_DONOR) s;
			} 

			else if(s instanceof CCM_I21_ROLE_GOAL){
				CCM_I21_ROLE_GOAL v = (CCM_I21_ROLE_GOAL) s;
			} 

			else if(s instanceof ORU_R01_ORDER_DOCUMENT){
				ORU_R01_ORDER_DOCUMENT v = (ORU_R01_ORDER_DOCUMENT) s;
			} 

			else if(s instanceof REF_I12){
				REF_I12 v = (REF_I12) s;
			} 

			else if(s instanceof RSP_Z86_TIMING_ENCODED){
				RSP_Z86_TIMING_ENCODED v = (RSP_Z86_TIMING_ENCODED) s;
			} 

			else if(s instanceof OMG_O19_SPECIMEN_OBSERVATION){
				OMG_O19_SPECIMEN_OBSERVATION v = (OMG_O19_SPECIMEN_OBSERVATION) s;
			} 

			else if(s instanceof QBP_Q11_QBP){
				QBP_Q11_QBP v = (QBP_Q11_QBP) s;
			} 

			else if(s instanceof RPI_I01){
				RPI_I01 v = (RPI_I01) s;
			} 

			else if(s instanceof ORL_O36_SPECIMEN){
				ORL_O36_SPECIMEN v = (ORL_O36_SPECIMEN) s;
			} 

			else if(s instanceof RDS_O13_TIMING){
				RDS_O13_TIMING v = (RDS_O13_TIMING) s;
			} 

			else if(s instanceof EAC_U07_SPECIMEN_CONTAINER){
				EAC_U07_SPECIMEN_CONTAINER v = (EAC_U07_SPECIMEN_CONTAINER) s;
			} 

			else if(s instanceof RRI_I12_PATIENT_VISIT){
				RRI_I12_PATIENT_VISIT v = (RRI_I12_PATIENT_VISIT) s;
			} 

			else if(s instanceof RPI_I04){
				RPI_I04 v = (RPI_I04) s;
			} 

			else if(s instanceof CQU_I19_MEDICATION_ADMINISTRATION_DETAIL){
				CQU_I19_MEDICATION_ADMINISTRATION_DETAIL v = (CQU_I19_MEDICATION_ADMINISTRATION_DETAIL) s;
			} 

			else if(s instanceof ORG_O20_TIMING){
				ORG_O20_TIMING v = (ORG_O20_TIMING) s;
			} 

			else if(s instanceof MFN_M09_MF_TEST_CAT_DETAIL){
				MFN_M09_MF_TEST_CAT_DETAIL v = (MFN_M09_MF_TEST_CAT_DETAIL) s;
			} 

			else if(s instanceof MFN_M11_MF_TEST_CALCULATED){
				MFN_M11_MF_TEST_CALCULATED v = (MFN_M11_MF_TEST_CALCULATED) s;
			} 

			else if(s instanceof OMD_O03_TIMING_DIET){
				OMD_O03_TIMING_DIET v = (OMD_O03_TIMING_DIET) s;
			} 

			else if(s instanceof OMQ_O42_OBSERVATION){
				OMQ_O42_OBSERVATION v = (OMQ_O42_OBSERVATION) s;
			} 

			else if(s instanceof EHC_E21_PSL_ITEM_INFO){
				EHC_E21_PSL_ITEM_INFO v = (EHC_E21_PSL_ITEM_INFO) s;
			} 

			else if(s instanceof CCI_I22_CLINICAL_HISTORY_OBSERVATION){
				CCI_I22_CLINICAL_HISTORY_OBSERVATION v = (CCI_I22_CLINICAL_HISTORY_OBSERVATION) s;
			} 

			else if(s instanceof BTS_O31_ORDER){
				BTS_O31_ORDER v = (BTS_O31_ORDER) s;
			} 

			else if(s instanceof STF){
				STF v = (STF) s;
			} 

			else if(s instanceof QPD){
				QPD v = (QPD) s;
			} 

			else if(s instanceof DEL_O46_DONOR){
				DEL_O46_DONOR v = (DEL_O46_DONOR) s;
			} 

			else if(s instanceof CQU_I19_APPOINTMENT_HISTORY){
				CQU_I19_APPOINTMENT_HISTORY v = (CQU_I19_APPOINTMENT_HISTORY) s;
			} 

			else if(s instanceof PPR_PC1_PROBLEM){
				PPR_PC1_PROBLEM v = (PPR_PC1_PROBLEM) s;
			} 

			else if(s instanceof CCM_I21){
				CCM_I21 v = (CCM_I21) s;
			} 

			else if(s instanceof PEX_P07_ASSOCIATED_RX_ORDER){
				PEX_P07_ASSOCIATED_RX_ORDER v = (PEX_P07_ASSOCIATED_RX_ORDER) s;
			} 

			else if(s instanceof CCU_I20_PROBLEM){
				CCU_I20_PROBLEM v = (CCU_I20_PROBLEM) s;
			} 

			else if(s instanceof ORU_R01_SPECIMEN){
				ORU_R01_SPECIMEN v = (ORU_R01_SPECIMEN) s;
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

			else if(s instanceof RRA_O18){
				RRA_O18 v = (RRA_O18) s;
			} 

			else if(s instanceof PGL_PC6_GOAL_ROLE){
				PGL_PC6_GOAL_ROLE v = (PGL_PC6_GOAL_ROLE) s;
			} 

			else if(s instanceof OM3){
				OM3 v = (OM3) s;
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

			else if(s instanceof OM7){
				OM7 v = (OM7) s;
			} 

			else if(s instanceof STZ){
				STZ v = (STZ) s;
			} 

			else if(s instanceof OM6){
				OM6 v = (OM6) s;
			} 

			else if(s instanceof ORL_O40_ORDER){
				ORL_O40_ORDER v = (ORL_O40_ORDER) s;
			} 

			else if(s instanceof DFT_P03_TIMING_QUANTITY){
				DFT_P03_TIMING_QUANTITY v = (DFT_P03_TIMING_QUANTITY) s;
			} 

			else if(s instanceof ADT_A03){
				ADT_A03 v = (ADT_A03) s;
			} 

			else if(s instanceof OMB_O27_OBSERVATION){
				OMB_O27_OBSERVATION v = (OMB_O27_OBSERVATION) s;
			} 

			else if(s instanceof ORD_O04_RESPONSE){
				ORD_O04_RESPONSE v = (ORD_O04_RESPONSE) s;
			} 

			else if(s instanceof ADT_A01){
				ADT_A01 v = (ADT_A01) s;
			} 

			else if(s instanceof ADT_A02){
				ADT_A02 v = (ADT_A02) s;
			} 

			else if(s instanceof RQI_I01_GUARANTOR_INSURANCE){
				RQI_I01_GUARANTOR_INSURANCE v = (RQI_I01_GUARANTOR_INSURANCE) s;
			} 

			else if(s instanceof OPL_O37_CONTAINER){
				OPL_O37_CONTAINER v = (OPL_O37_CONTAINER) s;
			} 

			else if(s instanceof RDY_Z80){
				RDY_Z80 v = (RDY_Z80) s;
			} 

			else if(s instanceof MFK_M01){
				MFK_M01 v = (MFK_M01) s;
			} 

			else if(s instanceof PPR_PC1_GOAL_ROLE){
				PPR_PC1_GOAL_ROLE v = (PPR_PC1_GOAL_ROLE) s;
			} 

			else if(s instanceof EHC_E13_REQUEST){
				EHC_E13_REQUEST v = (EHC_E13_REQUEST) s;
			} 

			else if(s instanceof RSP_E22_AUTHORIZATION_INFO){
				RSP_E22_AUTHORIZATION_INFO v = (RSP_E22_AUTHORIZATION_INFO) s;
			} 

			else if(s instanceof BRT_O32){
				BRT_O32 v = (BRT_O32) s;
			} 

			else if(s instanceof OUL_R22_SPECIMEN){
				OUL_R22_SPECIMEN v = (OUL_R22_SPECIMEN) s;
			} 

			else if(s instanceof CCU_I20_MEDICATION_ORDER_DETAIL){
				CCU_I20_MEDICATION_ORDER_DETAIL v = (CCU_I20_MEDICATION_ORDER_DETAIL) s;
			} 

			else if(s instanceof OMQ_O42_PATIENT_VISIT){
				OMQ_O42_PATIENT_VISIT v = (OMQ_O42_PATIENT_VISIT) s;
			} 

			else if(s instanceof RQA_I08_PROCEDURE){
				RQA_I08_PROCEDURE v = (RQA_I08_PROCEDURE) s;
			} 

			else if(s instanceof RDE_O11_PATIENT){
				RDE_O11_PATIENT v = (RDE_O11_PATIENT) s;
			} 

			else if(s instanceof ADT_A16){
				ADT_A16 v = (ADT_A16) s;
			} 

			else if(s instanceof ADT_A17){
				ADT_A17 v = (ADT_A17) s;
			} 

			else if(s instanceof IAM){
				IAM v = (IAM) s;
			} 

			else if(s instanceof MDM_T02_TIMING){
				MDM_T02_TIMING v = (MDM_T02_TIMING) s;
			} 

			else if(s instanceof ORI_O24_TIMING){
				ORI_O24_TIMING v = (ORI_O24_TIMING) s;
			} 

			else if(s instanceof RSP_Z88_ORDER_ENCODED){
				RSP_Z88_ORDER_ENCODED v = (RSP_Z88_ORDER_ENCODED) s;
			} 

			else if(s instanceof PPG_PCG){
				PPG_PCG v = (PPG_PCG) s;
			} 

			else if(s instanceof ORB_O28_TIMING){
				ORB_O28_TIMING v = (ORB_O28_TIMING) s;
			} 

			else if(s instanceof RDS_O13_TIMING_ENCODED){
				RDS_O13_TIMING_ENCODED v = (RDS_O13_TIMING_ENCODED) s;
			} 

			else if(s instanceof IAR){
				IAR v = (IAR) s;
			} 

			else if(s instanceof ADT_A15){
				ADT_A15 v = (ADT_A15) s;
			} 

			else if(s instanceof ORL_O22_RESPONSE){
				ORL_O22_RESPONSE v = (ORL_O22_RESPONSE) s;
			} 

			else if(s instanceof TCU_U10_TEST_CONFIGURATION){
				TCU_U10_TEST_CONFIGURATION v = (TCU_U10_TEST_CONFIGURATION) s;
			} 

			else if(s instanceof ADT_A12){
				ADT_A12 v = (ADT_A12) s;
			} 

			else if(s instanceof ORL_O36_SPECIMEN_CONTAINER){
				ORL_O36_SPECIMEN_CONTAINER v = (ORL_O36_SPECIMEN_CONTAINER) s;
			} 

			else if(s instanceof BTS){
				BTS v = (BTS) s;
			} 

			else if(s instanceof QRD){
				QRD v = (QRD) s;
			} 

			else if(s instanceof RRE_O12_TIMING){
				RRE_O12_TIMING v = (RRE_O12_TIMING) s;
			} 

			else if(s instanceof QRF){
				QRF v = (QRF) s;
			} 

			else if(s instanceof OML_O33_PATIENT){
				OML_O33_PATIENT v = (OML_O33_PATIENT) s;
			} 

			else if(s instanceof BTX){
				BTX v = (BTX) s;
			} 

			else if(s instanceof EHC_E10_PRODUCT_SERVICE_LINE_INFO){
				EHC_E10_PRODUCT_SERVICE_LINE_INFO v = (EHC_E10_PRODUCT_SERVICE_LINE_INFO) s;
			} 

			else if(s instanceof QRI){
				QRI v = (QRI) s;
			} 

			else if(s instanceof RSP_Z86_PATIENT){
				RSP_Z86_PATIENT v = (RSP_Z86_PATIENT) s;
			} 

			else if(s instanceof PPG_PCG_PROBLEM){
				PPG_PCG_PROBLEM v = (PPG_PCG_PROBLEM) s;
			} 

			else if(s instanceof RPA_I08_PROCEDURE){
				RPA_I08_PROCEDURE v = (RPA_I08_PROCEDURE) s;
			} 

			else if(s instanceof CCU_I20_RESOURCE_OBSERVATION){
				CCU_I20_RESOURCE_OBSERVATION v = (CCU_I20_RESOURCE_OBSERVATION) s;
			} 

			else if(s instanceof ORS_O06_PATIENT){
				ORS_O06_PATIENT v = (ORS_O06_PATIENT) s;
			} 

			else if(s instanceof ORL_O34_TIMING){
				ORL_O34_TIMING v = (ORL_O34_TIMING) s;
			} 

			else if(s instanceof MFN_M05_MF_LOC_DEPT){
				MFN_M05_MF_LOC_DEPT v = (MFN_M05_MF_LOC_DEPT) s;
			} 

			else if(s instanceof RQA_I08_AUTHORIZATION){
				RQA_I08_AUTHORIZATION v = (RQA_I08_AUTHORIZATION) s;
			} 

			else if(s instanceof DER_O44){
				DER_O44 v = (DER_O44) s;
			} 

			else if(s instanceof BUI){
				BUI v = (BUI) s;
			} 

			else if(s instanceof CCR_I16_PROBLEM){
				CCR_I16_PROBLEM v = (CCR_I16_PROBLEM) s;
			} 

			else if(s instanceof NMD_N02_APP_STATS){
				NMD_N02_APP_STATS v = (NMD_N02_APP_STATS) s;
			} 

			else if(s instanceof PPP_PCB_GOAL){
				PPP_PCB_GOAL v = (PPP_PCB_GOAL) s;
			} 

			else if(s instanceof SRM_S01_LOCATION_RESOURCE){
				SRM_S01_LOCATION_RESOURCE v = (SRM_S01_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof MFN_M16_PURCHASING_VENDOR){
				MFN_M16_PURCHASING_VENDOR v = (MFN_M16_PURCHASING_VENDOR) s;
			} 

			else if(s instanceof RSP_Z82_QUERY_RESPONSE){
				RSP_Z82_QUERY_RESPONSE v = (RSP_Z82_QUERY_RESPONSE) s;
			} 

			else if(s instanceof CQU_I19_ROLE_PROBLEM){
				CQU_I19_ROLE_PROBLEM v = (CQU_I19_ROLE_PROBLEM) s;
			} 

			else if(s instanceof RSP_Z88_ORDER_DETAIL){
				RSP_Z88_ORDER_DETAIL v = (RSP_Z88_ORDER_DETAIL) s;
			} 

			else if(s instanceof ORP_O10_ORDER){
				ORP_O10_ORDER v = (ORP_O10_ORDER) s;
			} 

			else if(s instanceof PPG_PCG_GOAL_OBSERVATION){
				PPG_PCG_GOAL_OBSERVATION v = (PPG_PCG_GOAL_OBSERVATION) s;
			} 

			else if(s instanceof OUL_R23_VISIT){
				OUL_R23_VISIT v = (OUL_R23_VISIT) s;
			} 

			else if(s instanceof SRR_S01){
				SRR_S01 v = (SRR_S01) s;
			} 

			else if(s instanceof OML_O21_INSURANCE){
				OML_O21_INSURANCE v = (OML_O21_INSURANCE) s;
			} 

			else if(s instanceof REF_I12_PROVIDER_CONTACT){
				REF_I12_PROVIDER_CONTACT v = (REF_I12_PROVIDER_CONTACT) s;
			} 

			else if(s instanceof CQU_I19_GOAL){
				CQU_I19_GOAL v = (CQU_I19_GOAL) s;
			} 

			else if(s instanceof ORI_O24_PATIENT){
				ORI_O24_PATIENT v = (ORI_O24_PATIENT) s;
			} 

			else if(s instanceof RDR_RDR){
				RDR_RDR v = (RDR_RDR) s;
			} 

			else if(s instanceof ORU_R01_COMMON_ORDER){
				ORU_R01_COMMON_ORDER v = (ORU_R01_COMMON_ORDER) s;
			} 

			else if(s instanceof RSP_Z90_SPECIMEN){
				RSP_Z90_SPECIMEN v = (RSP_Z90_SPECIMEN) s;
			} 

			else if(s instanceof OML_O39_SPECIMEN_IN_PACKAGE){
				OML_O39_SPECIMEN_IN_PACKAGE v = (OML_O39_SPECIMEN_IN_PACKAGE) s;
			} 

			else if(s instanceof EHC_E15_PAYMENT_REMITTANCE_DETAIL_INFO){
				EHC_E15_PAYMENT_REMITTANCE_DETAIL_INFO v = (EHC_E15_PAYMENT_REMITTANCE_DETAIL_INFO) s;
			} 

			else if(s instanceof OMN_O07_OBSERVATION){
				OMN_O07_OBSERVATION v = (OMN_O07_OBSERVATION) s;
			} 

			else if(s instanceof PPG_PCG_ORDER_OBSERVATION){
				PPG_PCG_ORDER_OBSERVATION v = (PPG_PCG_ORDER_OBSERVATION) s;
			} 

			else if(s instanceof OUL_R23_CONTAINER){
				OUL_R23_CONTAINER v = (OUL_R23_CONTAINER) s;
			} 

			else if(s instanceof RSP_Z88_VISIT){
				RSP_Z88_VISIT v = (RSP_Z88_VISIT) s;
			} 

			else if(s instanceof OML_O33_PATIENT_VISIT){
				OML_O33_PATIENT_VISIT v = (OML_O33_PATIENT_VISIT) s;
			} 

			else if(s instanceof CCR_I16_GOAL_OBSERVATION){
				CCR_I16_GOAL_OBSERVATION v = (CCR_I16_GOAL_OBSERVATION) s;
			} 

			else if(s instanceof SRR_S01_GENERAL_RESOURCE){
				SRR_S01_GENERAL_RESOURCE v = (SRR_S01_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof RRI_I12_PROVIDER_CONTACT){
				RRI_I12_PROVIDER_CONTACT v = (RRI_I12_PROVIDER_CONTACT) s;
			} 

			else if(s instanceof CCM_I21_APPOINTMENT_HISTORY){
				CCM_I21_APPOINTMENT_HISTORY v = (CCM_I21_APPOINTMENT_HISTORY) s;
			} 

			else if(s instanceof EHC_E04_PRODUCT_SERVICE_GROUP){
				EHC_E04_PRODUCT_SERVICE_GROUP v = (EHC_E04_PRODUCT_SERVICE_GROUP) s;
			} 

			else if(s instanceof RSP_K31_ORDER){
				RSP_K31_ORDER v = (RSP_K31_ORDER) s;
			} 

			else if(s instanceof ADT_A43){
				ADT_A43 v = (ADT_A43) s;
			} 

			else if(s instanceof CCU_I20_PROBLEM_OBSERVATION){
				CCU_I20_PROBLEM_OBSERVATION v = (CCU_I20_PROBLEM_OBSERVATION) s;
			} 

			else if(s instanceof ADT_A44){
				ADT_A44 v = (ADT_A44) s;
			} 

			else if(s instanceof RAS_O17){
				RAS_O17 v = (RAS_O17) s;
			} 

			else if(s instanceof ADT_A45){
				ADT_A45 v = (ADT_A45) s;
			} 

			else if(s instanceof CCU_I20_ROLE_GOAL){
				CCU_I20_ROLE_GOAL v = (CCU_I20_ROLE_GOAL) s;
			} 

			else if(s instanceof ADT_A50){
				ADT_A50 v = (ADT_A50) s;
			} 

			else if(s instanceof ORP_O10_PATIENT){
				ORP_O10_PATIENT v = (ORP_O10_PATIENT) s;
			} 

			else if(s instanceof CQU_I19_PROBLEM){
				CQU_I19_PROBLEM v = (CQU_I19_PROBLEM) s;
			} 

			else if(s instanceof CQU_I19_MEDICATION_ORDER_DETAIL){
				CQU_I19_MEDICATION_ORDER_DETAIL v = (CQU_I19_MEDICATION_ORDER_DETAIL) s;
			} 

			else if(s instanceof ORL_O36_SPECIMEN_OBSERVATION){
				ORL_O36_SPECIMEN_OBSERVATION v = (ORL_O36_SPECIMEN_OBSERVATION) s;
			} 

			else if(s instanceof RQA_I08_RESULTS){
				RQA_I08_RESULTS v = (RQA_I08_RESULTS) s;
			} 

			else if(s instanceof CQU_I19_GOAL_OBSERVATION){
				CQU_I19_GOAL_OBSERVATION v = (CQU_I19_GOAL_OBSERVATION) s;
			} 

			else if(s instanceof OML_O39_INSURANCE){
				OML_O39_INSURANCE v = (OML_O39_INSURANCE) s;
			} 

			else if(s instanceof RDR_RDR_ORDER){
				RDR_RDR_ORDER v = (RDR_RDR_ORDER) s;
			} 

			else if(s instanceof ESU_U01){
				ESU_U01 v = (ESU_U01) s;
			} 

			else if(s instanceof ADT_A54){
				ADT_A54 v = (ADT_A54) s;
			} 

			else if(s instanceof ADT_A52){
				ADT_A52 v = (ADT_A52) s;
			} 

			else if(s instanceof PPP_PCB_GOAL_OBSERVATION){
				PPP_PCB_GOAL_OBSERVATION v = (PPP_PCB_GOAL_OBSERVATION) s;
			} 

			else if(s instanceof OMG_O19_TIMING_PRIOR){
				OMG_O19_TIMING_PRIOR v = (OMG_O19_TIMING_PRIOR) s;
			} 

			else if(s instanceof CCR_I16_MEDICATION_HISTORY){
				CCR_I16_MEDICATION_HISTORY v = (CCR_I16_MEDICATION_HISTORY) s;
			} 

			else if(s instanceof OMS_O05_TIMING){
				OMS_O05_TIMING v = (OMS_O05_TIMING) s;
			} 

			else if(s instanceof ORC){
				ORC v = (ORC) s;
			} 

			else if(s instanceof CCM_I21_RESOURCE_DETAIL){
				CCM_I21_RESOURCE_DETAIL v = (CCM_I21_RESOURCE_DETAIL) s;
			} 

			else if(s instanceof ORG){
				ORG v = (ORG) s;
			} 

			else if(s instanceof RSP_Z88_COMPONENT){
				RSP_Z88_COMPONENT v = (RSP_Z88_COMPONENT) s;
			} 

			else if(s instanceof RQP_I04_PROVIDER){
				RQP_I04_PROVIDER v = (RQP_I04_PROVIDER) s;
			} 

			else if(s instanceof OPU_R25_COMMON_ORDER){
				OPU_R25_COMMON_ORDER v = (OPU_R25_COMMON_ORDER) s;
			} 

			else if(s instanceof OMB_O27_TIMING){
				OMB_O27_TIMING v = (OMB_O27_TIMING) s;
			} 

			else if(s instanceof OMN_O07_PATIENT){
				OMN_O07_PATIENT v = (OMN_O07_PATIENT) s;
			} 

			else if(s instanceof OSM_R26){
				OSM_R26 v = (OSM_R26) s;
			} 

			else if(s instanceof PPP_PCB_PROBLEM_ROLE){
				PPP_PCB_PROBLEM_ROLE v = (PPP_PCB_PROBLEM_ROLE) s;
			} 

			else if(s instanceof ADT_A21){
				ADT_A21 v = (ADT_A21) s;
			} 

			else if(s instanceof CCI_I22_CLINICAL_HISTORY){
				CCI_I22_CLINICAL_HISTORY v = (CCI_I22_CLINICAL_HISTORY) s;
			} 

			else if(s instanceof ORN_O08_RESPONSE){
				ORN_O08_RESPONSE v = (ORN_O08_RESPONSE) s;
			} 

			else if(s instanceof OML_O35_PATIENT_VISIT){
				OML_O35_PATIENT_VISIT v = (OML_O35_PATIENT_VISIT) s;
			} 

			else if(s instanceof QBP_Z73){
				QBP_Z73 v = (QBP_Z73) s;
			} 

			else if(s instanceof ADT_A20){
				ADT_A20 v = (ADT_A20) s;
			} 

			else if(s instanceof RTB_Z74){
				RTB_Z74 v = (RTB_Z74) s;
			} 

			else if(s instanceof ADT_A24){
				ADT_A24 v = (ADT_A24) s;
			} 

			else if(s instanceof CCR_I16_CLINICAL_HISTORY_DETAIL){
				CCR_I16_CLINICAL_HISTORY_DETAIL v = (CCR_I16_CLINICAL_HISTORY_DETAIL) s;
			} 

			else if(s instanceof EHC_E15_PRODUCT_SERVICE_SECTION){
				EHC_E15_PRODUCT_SERVICE_SECTION v = (EHC_E15_PRODUCT_SERVICE_SECTION) s;
			} 

			else if(s instanceof DFT_P11_FINANCIAL_OBSERVATION){
				DFT_P11_FINANCIAL_OBSERVATION v = (DFT_P11_FINANCIAL_OBSERVATION) s;
			} 

			else if(s instanceof PPR_PC1_ORDER_DETAIL){
				PPR_PC1_ORDER_DETAIL v = (PPR_PC1_ORDER_DETAIL) s;
			} 

			else if(s instanceof SSU_U03){
				SSU_U03 v = (SSU_U03) s;
			} 

			else if(s instanceof OMN_O07){
				OMN_O07 v = (OMN_O07) s;
			} 

			else if(s instanceof RRE_O12_RESPONSE){
				RRE_O12_RESPONSE v = (RRE_O12_RESPONSE) s;
			} 

			else if(s instanceof ORU_R01_PATIENT){
				ORU_R01_PATIENT v = (ORU_R01_PATIENT) s;
			} 

			else if(s instanceof RGV_O15_TIMING_ENCODED){
				RGV_O15_TIMING_ENCODED v = (RGV_O15_TIMING_ENCODED) s;
			} 

			else if(s instanceof ORD_O04){
				ORD_O04 v = (ORD_O04) s;
			} 

			else if(s instanceof CCI_I22_MEDICATION_HISTORY){
				CCI_I22_MEDICATION_HISTORY v = (CCI_I22_MEDICATION_HISTORY) s;
			} 

			else if(s instanceof ADT_A38){
				ADT_A38 v = (ADT_A38) s;
			} 

			else if(s instanceof DER_O44_DONOR_ORDER){
				DER_O44_DONOR_ORDER v = (DER_O44_DONOR_ORDER) s;
			} 

			else if(s instanceof RDS_O13_ENCODING){
				RDS_O13_ENCODING v = (RDS_O13_ENCODING) s;
			} 

			else if(s instanceof ADT_A39){
				ADT_A39 v = (ADT_A39) s;
			} 

			else if(s instanceof DBC_O41){
				DBC_O41 v = (DBC_O41) s;
			} 

			else if(s instanceof EHC_E20_DIAGNOSIS){
				EHC_E20_DIAGNOSIS v = (EHC_E20_DIAGNOSIS) s;
			} 

			else if(s instanceof DBC_O42){
				DBC_O42 v = (DBC_O42) s;
			} 

			else if(s instanceof MFN_M10_MF_TEST_BATT_DETAIL){
				MFN_M10_MF_TEST_BATT_DETAIL v = (MFN_M10_MF_TEST_BATT_DETAIL) s;
			} 

			else if(s instanceof PGL_PC6_PATIENT_VISIT){
				PGL_PC6_PATIENT_VISIT v = (PGL_PC6_PATIENT_VISIT) s;
			} 

			else if(s instanceof OUL_R24_PATIENT_OBSERVATION){
				OUL_R24_PATIENT_OBSERVATION v = (OUL_R24_PATIENT_OBSERVATION) s;
			} 

			else if(s instanceof ADT_A37){
				ADT_A37 v = (ADT_A37) s;
			} 

			else if(s instanceof RSP_Z86_OBSERVATION){
				RSP_Z86_OBSERVATION v = (RSP_Z86_OBSERVATION) s;
			} 

			else if(s instanceof SRM_S01_PATIENT){
				SRM_S01_PATIENT v = (SRM_S01_PATIENT) s;
			} 

			else if(s instanceof CQU_I19_ROLE_CLINICAL_HISTORY){
				CQU_I19_ROLE_CLINICAL_HISTORY v = (CQU_I19_ROLE_CLINICAL_HISTORY) s;
			} 

			else if(s instanceof RRA_O18_TIMING){
				RRA_O18_TIMING v = (RRA_O18_TIMING) s;
			} 

			else if(s instanceof VAR){
				VAR v = (VAR) s;
			} 

			else if(s instanceof RGV_O15_ORDER_DETAIL){
				RGV_O15_ORDER_DETAIL v = (RGV_O15_ORDER_DETAIL) s;
			} 

			else if(s instanceof MFN_M08_MF_TEST_NUMERIC){
				MFN_M08_MF_TEST_NUMERIC v = (MFN_M08_MF_TEST_NUMERIC) s;
			} 

			else if(s instanceof BAR_P06_PATIENT){
				BAR_P06_PATIENT v = (BAR_P06_PATIENT) s;
			} 

			else if(s instanceof ORS_O06){
				ORS_O06 v = (ORS_O06) s;
			} 

			else if(s instanceof OML_O39_OBSERVATION){
				OML_O39_OBSERVATION v = (OML_O39_OBSERVATION) s;
			} 

			else if(s instanceof SRR_S01_PERSONNEL_RESOURCE){
				SRR_S01_PERSONNEL_RESOURCE v = (SRR_S01_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof CQU_I19_MEDICATION_ADMINISTRATION_OBSERVATION){
				CQU_I19_MEDICATION_ADMINISTRATION_OBSERVATION v = (CQU_I19_MEDICATION_ADMINISTRATION_OBSERVATION) s;
			} 

			else if(s instanceof OMP_O09_COMPONENT){
				OMP_O09_COMPONENT v = (OMP_O09_COMPONENT) s;
			} 

			else if(s instanceof CSU_C09_PATIENT){
				CSU_C09_PATIENT v = (CSU_C09_PATIENT) s;
			} 

			else if(s instanceof OPL_O37_SPECIMEN){
				OPL_O37_SPECIMEN v = (OPL_O37_SPECIMEN) s;
			} 

			else if(s instanceof MFN_Znn){
				MFN_Znn v = (MFN_Znn) s;
			} 

			else if(s instanceof OUL_R22_SPECIMEN_OBSERVATION){
				OUL_R22_SPECIMEN_OBSERVATION v = (OUL_R22_SPECIMEN_OBSERVATION) s;
			} 

			else if(s instanceof CCR_I16_MEDICATION_ENCODING_DETAIL){
				CCR_I16_MEDICATION_ENCODING_DETAIL v = (CCR_I16_MEDICATION_ENCODING_DETAIL) s;
			} 

			else if(s instanceof OUL_R22_RESULT){
				OUL_R22_RESULT v = (OUL_R22_RESULT) s;
			} 

			else if(s instanceof RSP_Z90_QUERY_RESPONSE){
				RSP_Z90_QUERY_RESPONSE v = (RSP_Z90_QUERY_RESPONSE) s;
			} 

			else if(s instanceof DPR_O48_DONATION_ORDER){
				DPR_O48_DONATION_ORDER v = (DPR_O48_DONATION_ORDER) s;
			} 

			else if(s instanceof DFT_P03_OBSERVATION){
				DFT_P03_OBSERVATION v = (DFT_P03_OBSERVATION) s;
			} 

			else if(s instanceof RAS_O17_PATIENT){
				RAS_O17_PATIENT v = (RAS_O17_PATIENT) s;
			} 

			else if(s instanceof QBP_E03){
				QBP_E03 v = (QBP_E03) s;
			} 

			else if(s instanceof RDE_O11_COMPONENTS){
				RDE_O11_COMPONENTS v = (RDE_O11_COMPONENTS) s;
			} 

			else if(s instanceof CCU_I20_CLINICAL_HISTORY_OBSERVATION){
				CCU_I20_CLINICAL_HISTORY_OBSERVATION v = (CCU_I20_CLINICAL_HISTORY_OBSERVATION) s;
			} 

			else if(s instanceof IIM){
				IIM v = (IIM) s;
			} 

			else if(s instanceof PMU_B07_CERTIFICATE){
				PMU_B07_CERTIFICATE v = (PMU_B07_CERTIFICATE) s;
			} 

			else if(s instanceof RSP_K25_STAFF){
				RSP_K25_STAFF v = (RSP_K25_STAFF) s;
			} 

			else if(s instanceof OUL_R23_TIMING_QTY){
				OUL_R23_TIMING_QTY v = (OUL_R23_TIMING_QTY) s;
			} 

			else if(s instanceof OML_O21_ORDER_PRIOR){
				OML_O21_ORDER_PRIOR v = (OML_O21_ORDER_PRIOR) s;
			} 

			else if(s instanceof CCR_I16_GOAL){
				CCR_I16_GOAL v = (CCR_I16_GOAL) s;
			} 

			else if(s instanceof CQU_I19_ROLE_GOAL){
				CQU_I19_ROLE_GOAL v = (CQU_I19_ROLE_GOAL) s;
			} 

			else if(s instanceof OUL_R23_SPECIMEN_OBSERVATION){
				OUL_R23_SPECIMEN_OBSERVATION v = (OUL_R23_SPECIMEN_OBSERVATION) s;
			} 

			else if(s instanceof RGV_O15_TIMING_GIVE){
				RGV_O15_TIMING_GIVE v = (RGV_O15_TIMING_GIVE) s;
			} 

			else if(s instanceof CCM_I21_GOAL){
				CCM_I21_GOAL v = (CCM_I21_GOAL) s;
			} 

			else if(s instanceof ORD_O04_ORDER_TRAY){
				ORD_O04_ORDER_TRAY v = (ORD_O04_ORDER_TRAY) s;
			} 

			else if(s instanceof MRG){
				MRG v = (MRG) s;
			} 

			else if(s instanceof ZL7){
				ZL7 v = (ZL7) s;
			} 

			else if(s instanceof DFT_P11_FINANCIAL_COMMON_ORDER){
				DFT_P11_FINANCIAL_COMMON_ORDER v = (DFT_P11_FINANCIAL_COMMON_ORDER) s;
			} 

			else if(s instanceof SIU_S12_PATIENT){
				SIU_S12_PATIENT v = (SIU_S12_PATIENT) s;
			} 

			else if(s instanceof OVR){
				OVR v = (OVR) s;
			} 

			else if(s instanceof ORG_O20_SPECIMEN){
				ORG_O20_SPECIMEN v = (ORG_O20_SPECIMEN) s;
			} 

			else if(s instanceof OML_O39_OBSERVATION_REQUEST){
				OML_O39_OBSERVATION_REQUEST v = (OML_O39_OBSERVATION_REQUEST) s;
			} 

			else if(s instanceof OML_O39_TIMING){
				OML_O39_TIMING v = (OML_O39_TIMING) s;
			} 

			else if(s instanceof RSP_Z90_PATIENT){
				RSP_Z90_PATIENT v = (RSP_Z90_PATIENT) s;
			} 

			else if(s instanceof RDS_O13){
				RDS_O13 v = (RDS_O13) s;
			} 

			else if(s instanceof MFN_M16_STERILIZATION){
				MFN_M16_STERILIZATION v = (MFN_M16_STERILIZATION) s;
			} 

			else if(s instanceof MSA){
				MSA v = (MSA) s;
			} 

			else if(s instanceof DFT_P11_FINANCIAL){
				DFT_P11_FINANCIAL v = (DFT_P11_FINANCIAL) s;
			} 

			else if(s instanceof ORU_R01_OBSERVATION){
				ORU_R01_OBSERVATION v = (ORU_R01_OBSERVATION) s;
			} 

			else if(s instanceof MSH){
				MSH v = (MSH) s;
			} 

			else if(s instanceof MDM_T02_COMMON_ORDER){
				MDM_T02_COMMON_ORDER v = (MDM_T02_COMMON_ORDER) s;
			} 

			else if(s instanceof ORG_O20_ORDER){
				ORG_O20_ORDER v = (ORG_O20_ORDER) s;
			} 

			else if(s instanceof ECD){
				ECD v = (ECD) s;
			} 

			else if(s instanceof QBP_E22){
				QBP_E22 v = (QBP_E22) s;
			} 

			else if(s instanceof OPL_O37_PATIENT_VISIT_PRIOR){
				OPL_O37_PATIENT_VISIT_PRIOR v = (OPL_O37_PATIENT_VISIT_PRIOR) s;
			} 

			else if(s instanceof MFN_M15_MF_INV_ITEM){
				MFN_M15_MF_INV_ITEM v = (MFN_M15_MF_INV_ITEM) s;
			} 

			else if(s instanceof ADT_A16_PROCEDURE){
				ADT_A16_PROCEDURE v = (ADT_A16_PROCEDURE) s;
			} 

			else if(s instanceof RQI_I01_PROVIDER){
				RQI_I01_PROVIDER v = (RQI_I01_PROVIDER) s;
			} 

			else if(s instanceof ECR){
				ECR v = (ECR) s;
			} 

			else if(s instanceof OMP_O09_OBSERVATION){
				OMP_O09_OBSERVATION v = (OMP_O09_OBSERVATION) s;
			} 

			else if(s instanceof OMS_O05_OBSERVATION){
				OMS_O05_OBSERVATION v = (OMS_O05_OBSERVATION) s;
			} 

			else if(s instanceof BAR_P01_PROCEDURE){
				BAR_P01_PROCEDURE v = (BAR_P01_PROCEDURE) s;
			} 

			else if(s instanceof OMG_O19_TIMING){
				OMG_O19_TIMING v = (OMG_O19_TIMING) s;
			} 

			else if(s instanceof RSP_Z82_VISIT){
				RSP_Z82_VISIT v = (RSP_Z82_VISIT) s;
			} 

			else if(s instanceof ORL_O40_OBSERVATION_REQUEST){
				ORL_O40_OBSERVATION_REQUEST v = (ORL_O40_OBSERVATION_REQUEST) s;
			} 

			else if(s instanceof RDS_O13_ORDER){
				RDS_O13_ORDER v = (RDS_O13_ORDER) s;
			} 

			else if(s instanceof RQA_I08){
				RQA_I08 v = (RQA_I08) s;
			} 

			else if(s instanceof ORD_O04_ORDER_DIET){
				ORD_O04_ORDER_DIET v = (ORD_O04_ORDER_DIET) s;
			} 

			else if(s instanceof RSP_K31_PATIENT){
				RSP_K31_PATIENT v = (RSP_K31_PATIENT) s;
			} 

			else if(s instanceof SRR_S01_PATIENT){
				SRR_S01_PATIENT v = (SRR_S01_PATIENT) s;
			} 

			else if(s instanceof SDR_S32){
				SDR_S32 v = (SDR_S32) s;
			} 

			else if(s instanceof CCR_I16_MEDICATION_ADMINISTRATION_OBSERVATION){
				CCR_I16_MEDICATION_ADMINISTRATION_OBSERVATION v = (CCR_I16_MEDICATION_ADMINISTRATION_OBSERVATION) s;
			} 

			else if(s instanceof SDR_S31){
				SDR_S31 v = (SDR_S31) s;
			} 

			else if(s instanceof PPR_PC1_GOAL_OBSERVATION){
				PPR_PC1_GOAL_OBSERVATION v = (PPR_PC1_GOAL_OBSERVATION) s;
			} 

			else if(s instanceof CCI_I22_ROLE_CLINICAL_HISTORY){
				CCI_I22_ROLE_CLINICAL_HISTORY v = (CCI_I22_ROLE_CLINICAL_HISTORY) s;
			} 

			else if(s instanceof RRI_I12_AUTHORIZATION_CONTACT2){
				RRI_I12_AUTHORIZATION_CONTACT2 v = (RRI_I12_AUTHORIZATION_CONTACT2) s;
			} 

			else if(s instanceof ILT){
				ILT v = (ILT) s;
			} 

			else if(s instanceof OML_O33){
				OML_O33 v = (OML_O33) s;
			} 

			else if(s instanceof RSP_Z82_TIMING_ENCODED){
				RSP_Z82_TIMING_ENCODED v = (RSP_Z82_TIMING_ENCODED) s;
			} 

			else if(s instanceof RQA_I08_INSURANCE){
				RQA_I08_INSURANCE v = (RQA_I08_INSURANCE) s;
			} 

			else if(s instanceof EDU){
				EDU v = (EDU) s;
			} 

			else if(s instanceof OML_O35_OBSERVATION_REQUEST){
				OML_O35_OBSERVATION_REQUEST v = (OML_O35_OBSERVATION_REQUEST) s;
			} 

			else if(s instanceof RAS_O17_ENCODING){
				RAS_O17_ENCODING v = (RAS_O17_ENCODING) s;
			} 

			else if(s instanceof MFN_M11_MF_TEST_CALC_DETAIL){
				MFN_M11_MF_TEST_CALC_DETAIL v = (MFN_M11_MF_TEST_CALC_DETAIL) s;
			} 

			else if(s instanceof ORB_O28){
				ORB_O28 v = (ORB_O28) s;
			} 

			else if(s instanceof EHC_E20_INSURANCE){
				EHC_E20_INSURANCE v = (EHC_E20_INSURANCE) s;
			} 

			else if(s instanceof ORU_R30_VISIT){
				ORU_R30_VISIT v = (ORU_R30_VISIT) s;
			} 

			else if(s instanceof CCR_I16_PATIENT_VISITS){
				CCR_I16_PATIENT_VISITS v = (CCR_I16_PATIENT_VISITS) s;
			} 

			else if(s instanceof OPL_O37_INSURANCE){
				OPL_O37_INSURANCE v = (OPL_O37_INSURANCE) s;
			} 

			else if(s instanceof CCU_I20_RESOURCES){
				CCU_I20_RESOURCES v = (CCU_I20_RESOURCES) s;
			} 

			else if(s instanceof CCM_I21_GOAL_OBSERVATION){
				CCM_I21_GOAL_OBSERVATION v = (CCM_I21_GOAL_OBSERVATION) s;
			} 

			else if(s instanceof BRT_O32_ORDER){
				BRT_O32_ORDER v = (BRT_O32_ORDER) s;
			} 

			else if(s instanceof OML_O39){
				OML_O39 v = (OML_O39) s;
			} 

			else if(s instanceof CCU_I20_CLINICAL_HISTORY_DETAIL){
				CCU_I20_CLINICAL_HISTORY_DETAIL v = (CCU_I20_CLINICAL_HISTORY_DETAIL) s;
			} 

			else if(s instanceof BTS_O31_PATIENT){
				BTS_O31_PATIENT v = (BTS_O31_PATIENT) s;
			} 

			else if(s instanceof OML_O35){
				OML_O35 v = (OML_O35) s;
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

			else if(s instanceof IN3){
				IN3 v = (IN3) s;
			} 

			else if(s instanceof TCD){
				TCD v = (TCD) s;
			} 

			else if(s instanceof TCC){
				TCC v = (TCC) s;
			} 

			else if(s instanceof RSP_Z82_TIMING){
				RSP_Z82_TIMING v = (RSP_Z82_TIMING) s;
			} 

			else if(s instanceof OPL_O37_OBSERVATION_RESULT_GROUP){
				OPL_O37_OBSERVATION_RESULT_GROUP v = (OPL_O37_OBSERVATION_RESULT_GROUP) s;
			} 

			else if(s instanceof OML_O33_PATIENT_VISIT_PRIOR){
				OML_O33_PATIENT_VISIT_PRIOR v = (OML_O33_PATIENT_VISIT_PRIOR) s;
			} 

			else if(s instanceof OUL_R24_ORDER){
				OUL_R24_ORDER v = (OUL_R24_ORDER) s;
			} 

			else if(s instanceof OMP_O09_PATIENT){
				OMP_O09_PATIENT v = (OMP_O09_PATIENT) s;
			} 

			else if(s instanceof OMS_O05_INSURANCE){
				OMS_O05_INSURANCE v = (OMS_O05_INSURANCE) s;
			} 

			else if(s instanceof OML_O35_PRIOR_RESULT){
				OML_O35_PRIOR_RESULT v = (OML_O35_PRIOR_RESULT) s;
			} 

			else if(s instanceof PEX_P07_TIMING_QTY){
				PEX_P07_TIMING_QTY v = (PEX_P07_TIMING_QTY) s;
			} 

			else if(s instanceof PPP_PCB_PATHWAY){
				PPP_PCB_PATHWAY v = (PPP_PCB_PATHWAY) s;
			} 

			else if(s instanceof INV){
				INV v = (INV) s;
			} 

			else if(s instanceof OMD_O03_PATIENT){
				OMD_O03_PATIENT v = (OMD_O03_PATIENT) s;
			} 

			else if(s instanceof ORL_O40_SPECIMEN_IN_PACKAGE){
				ORL_O40_SPECIMEN_IN_PACKAGE v = (ORL_O40_SPECIMEN_IN_PACKAGE) s;
			} 

			else if(s instanceof RQA_I08_OBSERVATION){
				RQA_I08_OBSERVATION v = (RQA_I08_OBSERVATION) s;
			} 

			else if(s instanceof OUL_R23_ORDER){
				OUL_R23_ORDER v = (OUL_R23_ORDER) s;
			} 

			else if(s instanceof OMN_O07_PATIENT_VISIT){
				OMN_O07_PATIENT_VISIT v = (OMN_O07_PATIENT_VISIT) s;
			} 

			else if(s instanceof CCR_I16_INSURANCE){
				CCR_I16_INSURANCE v = (CCR_I16_INSURANCE) s;
			} 

			else if(s instanceof BTS_O31_PRODUCT_STATUS){
				BTS_O31_PRODUCT_STATUS v = (BTS_O31_PRODUCT_STATUS) s;
			} 

			else if(s instanceof ESR_U02){
				ESR_U02 v = (ESR_U02) s;
			} 

			else if(s instanceof SRM_S01_SERVICE){
				SRM_S01_SERVICE v = (SRM_S01_SERVICE) s;
			} 

			else if(s instanceof EAN_U09){
				EAN_U09 v = (EAN_U09) s;
			} 

			else if(s instanceof OUL_R22_ORDER){
				OUL_R22_ORDER v = (OUL_R22_ORDER) s;
			} 

			else if(s instanceof OPU_R25_PATIENT_VISIT_OBSERVATION){
				OPU_R25_PATIENT_VISIT_OBSERVATION v = (OPU_R25_PATIENT_VISIT_OBSERVATION) s;
			} 

			else if(s instanceof DER_O44_DONOR_REGISTRATION){
				DER_O44_DONOR_REGISTRATION v = (DER_O44_DONOR_REGISTRATION) s;
			} 

			else if(s instanceof CCR_I16_MEDICATION_ORDER_DETAIL){
				CCR_I16_MEDICATION_ORDER_DETAIL v = (CCR_I16_MEDICATION_ORDER_DETAIL) s;
			} 

			else if(s instanceof OSM_R26_SHIPMENT){
				OSM_R26_SHIPMENT v = (OSM_R26_SHIPMENT) s;
			} 

			else if(s instanceof RAS_O17_ORDER_DETAIL_SUPPLEMENT){
				RAS_O17_ORDER_DETAIL_SUPPLEMENT v = (RAS_O17_ORDER_DETAIL_SUPPLEMENT) s;
			} 

			else if(s instanceof PGL_PC6){
				PGL_PC6 v = (PGL_PC6) s;
			} 

			else if(s instanceof CQU_I19_RESOURCES){
				CQU_I19_RESOURCES v = (CQU_I19_RESOURCES) s;
			} 

			else if(s instanceof OML_O21_OBSERVATION_PRIOR){
				OML_O21_OBSERVATION_PRIOR v = (OML_O21_OBSERVATION_PRIOR) s;
			} 

			else if(s instanceof DPR_O48_DONATION){
				DPR_O48_DONATION v = (DPR_O48_DONATION) s;
			} 

			else if(s instanceof OML_O21){
				OML_O21 v = (OML_O21) s;
			} 

			else if(s instanceof BRP_O30){
				BRP_O30 v = (BRP_O30) s;
			} 

			else if(s instanceof EHC_E10_INVOICE_PROCESSING_RESULTS_INFO){
				EHC_E10_INVOICE_PROCESSING_RESULTS_INFO v = (EHC_E10_INVOICE_PROCESSING_RESULTS_INFO) s;
			} 

			else if(s instanceof LSU_U12){
				LSU_U12 v = (LSU_U12) s;
			} 

			else if(s instanceof OPU_R25_PATIENT){
				OPU_R25_PATIENT v = (OPU_R25_PATIENT) s;
			} 

			else if(s instanceof ADT_A39_PATIENT){
				ADT_A39_PATIENT v = (ADT_A39_PATIENT) s;
			} 

			else if(s instanceof OMG_O19_PATIENT){
				OMG_O19_PATIENT v = (OMG_O19_PATIENT) s;
			} 

			else if(s instanceof OMG_O19_OBSERVATION){
				OMG_O19_OBSERVATION v = (OMG_O19_OBSERVATION) s;
			} 

			else if(s instanceof IPC){
				IPC v = (IPC) s;
			} 

			else if(s instanceof OPL_O37_OBSERVATIONS_ON_PATIENT){
				OPL_O37_OBSERVATIONS_ON_PATIENT v = (OPL_O37_OBSERVATIONS_ON_PATIENT) s;
			} 

			else if(s instanceof OML_O35_SPECIMEN){
				OML_O35_SPECIMEN v = (OML_O35_SPECIMEN) s;
			} 

			else if(s instanceof DEO_O45_DONOR_ORDER){
				DEO_O45_DONOR_ORDER v = (DEO_O45_DONOR_ORDER) s;
			} 

			else if(s instanceof OMB_O27){
				OMB_O27 v = (OMB_O27) s;
			} 

			else if(s instanceof IPR){
				IPR v = (IPR) s;
			} 

			else if(s instanceof CDM){
				CDM v = (CDM) s;
			} 

			else if(s instanceof OMP_O09){
				OMP_O09 v = (OMP_O09) s;
			} 

			else if(s instanceof CDO){
				CDO v = (CDO) s;
			} 

			else if(s instanceof ADT_A03_INSURANCE){
				ADT_A03_INSURANCE v = (ADT_A03_INSURANCE) s;
			} 

			else if(s instanceof OMQ_O42){
				OMQ_O42 v = (OMQ_O42) s;
			} 

			else if(s instanceof PPR_PC1){
				PPR_PC1 v = (PPR_PC1) s;
			} 

			else if(s instanceof CCI_I22_ROLE_PROBLEM){
				CCI_I22_ROLE_PROBLEM v = (CCI_I22_ROLE_PROBLEM) s;
			} 

			else if(s instanceof RGV_O15_GIVE){
				RGV_O15_GIVE v = (RGV_O15_GIVE) s;
			} 

			else if(s instanceof OUL_R23_RESULT){
				OUL_R23_RESULT v = (OUL_R23_RESULT) s;
			} 

			else if(s instanceof OPL_O37_ORDER_RELATED_OBSERVATION){
				OPL_O37_ORDER_RELATED_OBSERVATION v = (OPL_O37_ORDER_RELATED_OBSERVATION) s;
			} 

			else if(s instanceof OMD_O03_PATIENT_VISIT){
				OMD_O03_PATIENT_VISIT v = (OMD_O03_PATIENT_VISIT) s;
			} 

			else if(s instanceof MFN_Znn_MF_SITE_DEFINED){
				MFN_Znn_MF_SITE_DEFINED v = (MFN_Znn_MF_SITE_DEFINED) s;
			} 

			else if(s instanceof CCM_I21_CLINICAL_HISTORY){
				CCM_I21_CLINICAL_HISTORY v = (CCM_I21_CLINICAL_HISTORY) s;
			} 

			else if(s instanceof CCR_I16_CLINICAL_ORDER_OBSERVATION){
				CCR_I16_CLINICAL_ORDER_OBSERVATION v = (CCR_I16_CLINICAL_ORDER_OBSERVATION) s;
			} 

			else if(s instanceof RPI_I04_INSURANCE){
				RPI_I04_INSURANCE v = (RPI_I04_INSURANCE) s;
			} 

			else if(s instanceof RDS_O13_ORDER_DETAIL_SUPPLEMENT){
				RDS_O13_ORDER_DETAIL_SUPPLEMENT v = (RDS_O13_ORDER_DETAIL_SUPPLEMENT) s;
			} 

			else if(s instanceof OMN_O07_TIMING){
				OMN_O07_TIMING v = (OMN_O07_TIMING) s;
			} 

			else if(s instanceof DFT_P03_COMMON_ORDER){
				DFT_P03_COMMON_ORDER v = (DFT_P03_COMMON_ORDER) s;
			} 

			else if(s instanceof CER){
				CER v = (CER) s;
			} 

			else if(s instanceof VXU_V04){
				VXU_V04 v = (VXU_V04) s;
			} 

			else if(s instanceof OMB_O27_PATIENT){
				OMB_O27_PATIENT v = (OMB_O27_PATIENT) s;
			} 

			else if(s instanceof CCU_I20_MEDICATION_ADMINISTRATION_DETAIL){
				CCU_I20_MEDICATION_ADMINISTRATION_DETAIL v = (CCU_I20_MEDICATION_ADMINISTRATION_DETAIL) s;
			} 

			else if(s instanceof RQP_I04){
				RQP_I04 v = (RQP_I04) s;
			} 

			else if(s instanceof OPU_R25_SPECIMEN){
				OPU_R25_SPECIMEN v = (OPU_R25_SPECIMEN) s;
			} 

			else if(s instanceof RCP){
				RCP v = (RCP) s;
			} 

			else if(s instanceof RSP_O34_DONATION){
				RSP_O34_DONATION v = (RSP_O34_DONATION) s;
			} 

			else if(s instanceof EHC_E21){
				EHC_E21 v = (EHC_E21) s;
			} 

			else if(s instanceof EHC_E20){
				EHC_E20 v = (EHC_E20) s;
			} 

			else if(s instanceof OPU_R25_CONTAINER){
				OPU_R25_CONTAINER v = (OPU_R25_CONTAINER) s;
			} 

			else if(s instanceof OSU_O41_ORDER_STATUS){
				OSU_O41_ORDER_STATUS v = (OSU_O41_ORDER_STATUS) s;
			} 

			else if(s instanceof CCI_I22_MEDICATION_ENCODING_OBSERVATION){
				CCI_I22_MEDICATION_ENCODING_OBSERVATION v = (CCI_I22_MEDICATION_ENCODING_OBSERVATION) s;
			} 

			else if(s instanceof EHC_E24){
				EHC_E24 v = (EHC_E24) s;
			} 

			else if(s instanceof EAN_U09_NOTIFICATION){
				EAN_U09_NOTIFICATION v = (EAN_U09_NOTIFICATION) s;
			} 

			else if(s instanceof ABS){
				ABS v = (ABS) s;
			} 

			else if(s instanceof RDF){
				RDF v = (RDF) s;
			} 

			else if(s instanceof RPA_I08_PROVIDER){
				RPA_I08_PROVIDER v = (RPA_I08_PROVIDER) s;
			} 

			else if(s instanceof QBP_Q15){
				QBP_Q15 v = (QBP_Q15) s;
			} 

			else if(s instanceof RRG_O16_ORDER){
				RRG_O16_ORDER v = (RRG_O16_ORDER) s;
			} 

			else if(s instanceof OML_O21_OBSERVATION_REQUEST){
				OML_O21_OBSERVATION_REQUEST v = (OML_O21_OBSERVATION_REQUEST) s;
			} 

			else if(s instanceof ISD){
				ISD v = (ISD) s;
			} 

			else if(s instanceof QBP_Q11){
				QBP_Q11 v = (QBP_Q11) s;
			} 

			else if(s instanceof QBP_Q13){
				QBP_Q13 v = (QBP_Q13) s;
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

			else if(s instanceof OSM_R26_CONTAINER){
				OSM_R26_CONTAINER v = (OSM_R26_CONTAINER) s;
			} 

			else if(s instanceof GP2){
				GP2 v = (GP2) s;
			} 

			else if(s instanceof GP1){
				GP1 v = (GP1) s;
			} 

			else if(s instanceof ACK){
				ACK v = (ACK) s;
			} 

			else if(s instanceof DPR_O48_DONOR){
				DPR_O48_DONOR v = (DPR_O48_DONOR) s;
			} 

			else if(s instanceof RGV_O15_PATIENT){
				RGV_O15_PATIENT v = (RGV_O15_PATIENT) s;
			} 

			else if(s instanceof OML_O39_PATIENT_VISIT){
				OML_O39_PATIENT_VISIT v = (OML_O39_PATIENT_VISIT) s;
			} 

			else if(s instanceof PAC){
				PAC v = (PAC) s;
			} 

			else if(s instanceof CQU_I19_MEDICATION_ENCODING_DETAIL){
				CQU_I19_MEDICATION_ENCODING_DETAIL v = (CQU_I19_MEDICATION_ENCODING_DETAIL) s;
			} 

			else if(s instanceof REF_I12_RESULTS_NOTES){
				REF_I12_RESULTS_NOTES v = (REF_I12_RESULTS_NOTES) s;
			} 

			else if(s instanceof REL){
				REL v = (REL) s;
			} 

			else if(s instanceof OMI_O23_INSURANCE){
				OMI_O23_INSURANCE v = (OMI_O23_INSURANCE) s;
			} 

			else if(s instanceof OML_O33_ORDER){
				OML_O33_ORDER v = (OML_O33_ORDER) s;
			} 

			else if(s instanceof RF1){
				RF1 v = (RF1) s;
			} 

			else if(s instanceof ORS_O06_RESPONSE){
				ORS_O06_RESPONSE v = (ORS_O06_RESPONSE) s;
			} 

			else if(s instanceof QBP_Q21){
				QBP_Q21 v = (QBP_Q21) s;
			} 

			else if(s instanceof EHC_E01){
				EHC_E01 v = (EHC_E01) s;
			} 

			else if(s instanceof RSP_Z86_TIMING){
				RSP_Z86_TIMING v = (RSP_Z86_TIMING) s;
			} 

			else if(s instanceof ADD){
				ADD v = (ADD) s;
			} 

			else if(s instanceof CCI_I22_INSURANCE){
				CCI_I22_INSURANCE v = (CCI_I22_INSURANCE) s;
			} 

			else if(s instanceof EHC_E15_PRODUCT_SERVICE_GROUP){
				EHC_E15_PRODUCT_SERVICE_GROUP v = (EHC_E15_PRODUCT_SERVICE_GROUP) s;
			} 

			else if(s instanceof ITM){
				ITM v = (ITM) s;
			} 

			else if(s instanceof CCR_I16_ROLE_PROBLEM){
				CCR_I16_ROLE_PROBLEM v = (CCR_I16_ROLE_PROBLEM) s;
			} 

			else if(s instanceof RAS_O17_TIMING_ENCODED){
				RAS_O17_TIMING_ENCODED v = (RAS_O17_TIMING_ENCODED) s;
			} 

			else if(s instanceof CQU_I19_PATIENT){
				CQU_I19_PATIENT v = (CQU_I19_PATIENT) s;
			} 

			else if(s instanceof ADJ){
				ADJ v = (ADJ) s;
			} 

			else if(s instanceof VND){
				VND v = (VND) s;
			} 

			else if(s instanceof EHC_E04){
				EHC_E04 v = (EHC_E04) s;
			} 

			else if(s instanceof EHC_E02){
				EHC_E02 v = (EHC_E02) s;
			} 

			else if(s instanceof RFI){
				RFI v = (RFI) s;
			} 

			else if(s instanceof RDE_O11_OBSERVATION){
				RDE_O11_OBSERVATION v = (RDE_O11_OBSERVATION) s;
			} 

			else if(s instanceof RGV_O15_ENCODING){
				RGV_O15_ENCODING v = (RGV_O15_ENCODING) s;
			} 

			else if(s instanceof CCU_I20_INSURANCE){
				CCU_I20_INSURANCE v = (CCU_I20_INSURANCE) s;
			} 

			else if(s instanceof BPS_O29_PATIENT){
				BPS_O29_PATIENT v = (BPS_O29_PATIENT) s;
			} 

			else if(s instanceof CCR_I16_MEDICATION_ENCODING_OBSERVATION){
				CCR_I16_MEDICATION_ENCODING_OBSERVATION v = (CCR_I16_MEDICATION_ENCODING_OBSERVATION) s;
			} 

			else if(s instanceof OMG_O19_PATIENT_VISIT_PRIOR){
				OMG_O19_PATIENT_VISIT_PRIOR v = (OMG_O19_PATIENT_VISIT_PRIOR) s;
			} 

			else if(s instanceof RPI_I01_GUARANTOR_INSURANCE){
				RPI_I01_GUARANTOR_INSURANCE v = (RPI_I01_GUARANTOR_INSURANCE) s;
			} 

			else if(s instanceof EHC_E12){
				EHC_E12 v = (EHC_E12) s;
			} 

			else if(s instanceof SIU_S12_LOCATION_RESOURCE){
				SIU_S12_LOCATION_RESOURCE v = (SIU_S12_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof OML_O21_CONTAINER){
				OML_O21_CONTAINER v = (OML_O21_CONTAINER) s;
			} 

			else if(s instanceof OMG_O19_PATIENT_PRIOR){
				OMG_O19_PATIENT_PRIOR v = (OMG_O19_PATIENT_PRIOR) s;
			} 

			else if(s instanceof EHC_E10){
				EHC_E10 v = (EHC_E10) s;
			} 

			else if(s instanceof OML_O35_SPECIMEN_OBSERVATION){
				OML_O35_SPECIMEN_OBSERVATION v = (OML_O35_SPECIMEN_OBSERVATION) s;
			} 

			else if(s instanceof OML_O21_PATIENT_VISIT){
				OML_O21_PATIENT_VISIT v = (OML_O21_PATIENT_VISIT) s;
			} 

			else if(s instanceof CCI_I22_PROBLEM){
				CCI_I22_PROBLEM v = (CCI_I22_PROBLEM) s;
			} 

			else if(s instanceof PEX_P07_EXPERIENCE){
				PEX_P07_EXPERIENCE v = (PEX_P07_EXPERIENCE) s;
			} 

			else if(s instanceof SRM_S01_RESOURCES){
				SRM_S01_RESOURCES v = (SRM_S01_RESOURCES) s;
			} 

			else if(s instanceof CCI_I22_ROLE_GOAL){
				CCI_I22_ROLE_GOAL v = (CCI_I22_ROLE_GOAL) s;
			} 

			else if(s instanceof EHC_E15){
				EHC_E15 v = (EHC_E15) s;
			} 

			else if(s instanceof ORL_O36_TIMING){
				ORL_O36_TIMING v = (ORL_O36_TIMING) s;
			} 

			else if(s instanceof ORX_O43_RESPONSE){
				ORX_O43_RESPONSE v = (ORX_O43_RESPONSE) s;
			} 

			else if(s instanceof EHC_E13){
				EHC_E13 v = (EHC_E13) s;
			} 

			else if(s instanceof PCE){
				PCE v = (PCE) s;
			} 

			else if(s instanceof BRP_O30_ORDER){
				BRP_O30_ORDER v = (BRP_O30_ORDER) s;
			} 

			else if(s instanceof SLR_S28){
				SLR_S28 v = (SLR_S28) s;
			} 

			else if(s instanceof IVC){
				IVC v = (IVC) s;
			} 

			else if(s instanceof PD1){
				PD1 v = (PD1) s;
			} 

			else if(s instanceof PCR){
				PCR v = (PCR) s;
			} 

			else if(s instanceof CCR_I16_MEDICATION_ADMINISTRATION_DETAIL){
				CCR_I16_MEDICATION_ADMINISTRATION_DETAIL v = (CCR_I16_MEDICATION_ADMINISTRATION_DETAIL) s;
			} 

			else if(s instanceof BPS_O29_PATIENT_VISIT){
				BPS_O29_PATIENT_VISIT v = (BPS_O29_PATIENT_VISIT) s;
			} 

			else if(s instanceof RGS){
				RGS v = (RGS) s;
			} 

			else if(s instanceof PPP_PCB_PATHWAY_ROLE){
				PPP_PCB_PATHWAY_ROLE v = (PPP_PCB_PATHWAY_ROLE) s;
			} 

			else if(s instanceof AFF){
				AFF v = (AFF) s;
			} 

			else if(s instanceof RSP_E22){
				RSP_E22 v = (RSP_E22) s;
			} 

			else if(s instanceof OML_O33_PRIOR_RESULT){
				OML_O33_PRIOR_RESULT v = (OML_O33_PRIOR_RESULT) s;
			} 

			else if(s instanceof IVT){
				IVT v = (IVT) s;
			} 

			else if(s instanceof RSP_O33_DONOR){
				RSP_O33_DONOR v = (RSP_O33_DONOR) s;
			} 

			else if(s instanceof RSP_K31_TIMING_ENCODED){
				RSP_K31_TIMING_ENCODED v = (RSP_K31_TIMING_ENCODED) s;
			} 

			else if(s instanceof DFT_P11_COMMON_ORDER){
				DFT_P11_COMMON_ORDER v = (DFT_P11_COMMON_ORDER) s;
			} 

			else if(s instanceof RTB_K13_ROW_DEFINITION){
				RTB_K13_ROW_DEFINITION v = (RTB_K13_ROW_DEFINITION) s;
			} 

			else if(s instanceof OML_O35_PATIENT){
				OML_O35_PATIENT v = (OML_O35_PATIENT) s;
			} 

			else if(s instanceof CCI_I22_RESOURCE_OBSERVATION){
				CCI_I22_RESOURCE_OBSERVATION v = (CCI_I22_RESOURCE_OBSERVATION) s;
			} 

			else if(s instanceof OML_O33_INSURANCE){
				OML_O33_INSURANCE v = (OML_O33_INSURANCE) s;
			} 

			else if(s instanceof PDA){
				PDA v = (PDA) s;
			} 

			else if(s instanceof ORS_O06_TIMING){
				ORS_O06_TIMING v = (ORS_O06_TIMING) s;
			} 

			else if(s instanceof PDC){
				PDC v = (PDC) s;
			} 

			else if(s instanceof RSP_K31_RESPONSE){
				RSP_K31_RESPONSE v = (RSP_K31_RESPONSE) s;
			} 

			else if(s instanceof OSM_R26_SPECIMEN){
				OSM_R26_SPECIMEN v = (OSM_R26_SPECIMEN) s;
			} 

			else if(s instanceof OPL_O37){
				OPL_O37 v = (OPL_O37) s;
			} 

			else if(s instanceof OSM_R26_PATIENT_VISIT_OBSERVATION){
				OSM_R26_PATIENT_VISIT_OBSERVATION v = (OSM_R26_PATIENT_VISIT_OBSERVATION) s;
			} 

			else if(s instanceof SIU_S12_PERSONNEL_RESOURCE){
				SIU_S12_PERSONNEL_RESOURCE v = (SIU_S12_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof CQU_I19_MEDICATION_ENCODING_OBSERVATION){
				CQU_I19_MEDICATION_ENCODING_OBSERVATION v = (CQU_I19_MEDICATION_ENCODING_OBSERVATION) s;
			} 

			else if(s instanceof RSP_Z88_PATIENT){
				RSP_Z88_PATIENT v = (RSP_Z88_PATIENT) s;
			} 

			else if(s instanceof CCM_I21_PATHWAY_OBSERVATION){
				CCM_I21_PATHWAY_OBSERVATION v = (CCM_I21_PATHWAY_OBSERVATION) s;
			} 

			else if(s instanceof ORL_O22_ORDER){
				ORL_O22_ORDER v = (ORL_O22_ORDER) s;
			} 

			else if(s instanceof EHC_E15_PSL_ITEM_INFO){
				EHC_E15_PSL_ITEM_INFO v = (EHC_E15_PSL_ITEM_INFO) s;
			} 

			else if(s instanceof OMD_O03_ORDER_TRAY){
				OMD_O03_ORDER_TRAY v = (OMD_O03_ORDER_TRAY) s;
			} 

			else if(s instanceof CCM_I21_PATHWAY){
				CCM_I21_PATHWAY v = (CCM_I21_PATHWAY) s;
			} 

			else if(s instanceof VXU_V04_OBSERVATION){
				VXU_V04_OBSERVATION v = (VXU_V04_OBSERVATION) s;
			} 

			else if(s instanceof GT1){
				GT1 v = (GT1) s;
			} 

			else if(s instanceof RRA_O18_ADMINISTRATION){
				RRA_O18_ADMINISTRATION v = (RRA_O18_ADMINISTRATION) s;
			} 

			else if(s instanceof ORU_R30_OBSERVATION){
				ORU_R30_OBSERVATION v = (ORU_R30_OBSERVATION) s;
			} 

			else if(s instanceof OMQ_O42_ORDER_PRIOR){
				OMQ_O42_ORDER_PRIOR v = (OMQ_O42_ORDER_PRIOR) s;
			} 

			else if(s instanceof MDM_T01_COMMON_ORDER){
				MDM_T01_COMMON_ORDER v = (MDM_T01_COMMON_ORDER) s;
			} 

			else if(s instanceof OMG_O19_CONTAINER){
				OMG_O19_CONTAINER v = (OMG_O19_CONTAINER) s;
			} 

			else if(s instanceof RSP_Z90_VISIT){
				RSP_Z90_VISIT v = (RSP_Z90_VISIT) s;
			} 

			else if(s instanceof CCR_I16_PATHWAY){
				CCR_I16_PATHWAY v = (CCR_I16_PATHWAY) s;
			} 

			else if(s instanceof OUL_R24_SPECIMEN){
				OUL_R24_SPECIMEN v = (OUL_R24_SPECIMEN) s;
			} 

			else if(s instanceof EHC_E10_PSSPSGPSLADJ){
				EHC_E10_PSSPSGPSLADJ v = (EHC_E10_PSSPSGPSLADJ) s;
			} 

			else if(s instanceof PPP_PCB_ORDER_DETAIL){
				PPP_PCB_ORDER_DETAIL v = (PPP_PCB_ORDER_DETAIL) s;
			} 

			else if(s instanceof OMD_O03_DIET){
				OMD_O03_DIET v = (OMD_O03_DIET) s;
			} 

			else if(s instanceof OUL_R24_PATIENT){
				OUL_R24_PATIENT v = (OUL_R24_PATIENT) s;
			} 

			else if(s instanceof PEO){
				PEO v = (PEO) s;
			} 

			else if(s instanceof CCI_I22_PATIENT_VISITS){
				CCI_I22_PATIENT_VISITS v = (CCI_I22_PATIENT_VISITS) s;
			} 

			else if(s instanceof OML_O33_SPECIMEN_OBSERVATION){
				OML_O33_SPECIMEN_OBSERVATION v = (OML_O33_SPECIMEN_OBSERVATION) s;
			} 

			else if(s instanceof MFN_M17_MF_DRG){
				MFN_M17_MF_DRG v = (MFN_M17_MF_DRG) s;
			} 

			else if(s instanceof EHC_E10_PSGPSLADJ){
				EHC_E10_PSGPSLADJ v = (EHC_E10_PSGPSLADJ) s;
			} 

			else if(s instanceof ORG_O20_OBSERVATION_GROUP){
				ORG_O20_OBSERVATION_GROUP v = (ORG_O20_OBSERVATION_GROUP) s;
			} 

			else if(s instanceof PES){
				PES v = (PES) s;
			} 

			else if(s instanceof BAR_P12_PROCEDURE){
				BAR_P12_PROCEDURE v = (BAR_P12_PROCEDURE) s;
			} 

			else if(s instanceof QBP_O33){
				QBP_O33 v = (QBP_O33) s;
			} 

			else if(s instanceof OMI_O23_ORDER){
				OMI_O23_ORDER v = (OMI_O23_ORDER) s;
			} 

			else if(s instanceof CM1){
				CM1 v = (CM1) s;
			} 

			else if(s instanceof CM0){
				CM0 v = (CM0) s;
			} 

			else if(s instanceof OUL_R22_PATIENT_OBSERVATION){
				OUL_R22_PATIENT_OBSERVATION v = (OUL_R22_PATIENT_OBSERVATION) s;
			} 

			else if(s instanceof CM2){
				CM2 v = (CM2) s;
			} 

			else if(s instanceof REF_I12_OBSERVATION){
				REF_I12_OBSERVATION v = (REF_I12_OBSERVATION) s;
			} 

			else if(s instanceof RSP_E03){
				RSP_E03 v = (RSP_E03) s;
			} 

			else if(s instanceof RDY_K15){
				RDY_K15 v = (RDY_K15) s;
			} 

			else if(s instanceof RSP_Z86_ADMINISTRATION){
				RSP_Z86_ADMINISTRATION v = (RSP_Z86_ADMINISTRATION) s;
			} 

			else if(s instanceof RRG_O16_GIVE){
				RRG_O16_GIVE v = (RRG_O16_GIVE) s;
			} 

			else if(s instanceof UDM_Q05){
				UDM_Q05 v = (UDM_Q05) s;
			} 

			else if(s instanceof RSP_Z90){
				RSP_Z90 v = (RSP_Z90) s;
			} 

			else if(s instanceof CQU_I19_CLINICAL_HISTORY_DETAIL){
				CQU_I19_CLINICAL_HISTORY_DETAIL v = (CQU_I19_CLINICAL_HISTORY_DETAIL) s;
			} 

			else if(s instanceof RSP_Z90_OBSERVATION){
				RSP_Z90_OBSERVATION v = (RSP_Z90_OBSERVATION) s;
			} 

			else if(s instanceof QBP_O34){
				QBP_O34 v = (QBP_O34) s;
			} 

			else if(s instanceof DRG_O43_DONOR_REGISTRATION){
				DRG_O43_DONOR_REGISTRATION v = (DRG_O43_DONOR_REGISTRATION) s;
			} 

			else if(s instanceof AIG){
				AIG v = (AIG) s;
			} 

			else if(s instanceof RSP_O34_DONOR){
				RSP_O34_DONOR v = (RSP_O34_DONOR) s;
			} 

			else if(s instanceof RDE_O11_TIMING){
				RDE_O11_TIMING v = (RDE_O11_TIMING) s;
			} 

			else if(s instanceof OMD_O03_ORDER_DIET){
				OMD_O03_ORDER_DIET v = (OMD_O03_ORDER_DIET) s;
			} 

			else if(s instanceof OPL_O37_SPECIMEN_OBSERVATION){
				OPL_O37_SPECIMEN_OBSERVATION v = (OPL_O37_SPECIMEN_OBSERVATION) s;
			} 

			else if(s instanceof AIL){
				AIL v = (AIL) s;
			} 

			else if(s instanceof RAS_O17_COMPONENTS){
				RAS_O17_COMPONENTS v = (RAS_O17_COMPONENTS) s;
			} 

			else if(s instanceof DEL_O46_DONOR_REGISTRATION){
				DEL_O46_DONOR_REGISTRATION v = (DEL_O46_DONOR_REGISTRATION) s;
			} 

			else if(s instanceof EQP){
				EQP v = (EQP) s;
			} 

			else if(s instanceof CCR_I16){
				CCR_I16 v = (CCR_I16) s;
			} 

			else if(s instanceof AIP){
				AIP v = (AIP) s;
			} 

			else if(s instanceof EQU){
				EQU v = (EQU) s;
			} 

			else if(s instanceof AIS){
				AIS v = (AIS) s;
			} 

			else if(s instanceof ADT_A43_PATIENT){
				ADT_A43_PATIENT v = (ADT_A43_PATIENT) s;
			} 

			else if(s instanceof RSP_Z82){
				RSP_Z82 v = (RSP_Z82) s;
			} 

			else if(s instanceof CCI_I22_MEDICATION_ADMINISTRATION_OBSERVATION){
				CCI_I22_MEDICATION_ADMINISTRATION_OBSERVATION v = (CCI_I22_MEDICATION_ADMINISTRATION_OBSERVATION) s;
			} 

			else if(s instanceof RSP_Z84){
				RSP_Z84 v = (RSP_Z84) s;
			} 

			else if(s instanceof OSU_O41){
				OSU_O41 v = (OSU_O41) s;
			} 

			else if(s instanceof NCK){
				NCK v = (NCK) s;
			} 

			else if(s instanceof OML_O21_SPECIMEN_OBSERVATION){
				OML_O21_SPECIMEN_OBSERVATION v = (OML_O21_SPECIMEN_OBSERVATION) s;
			} 

			else if(s instanceof RSP_K31_COMPONENTS){
				RSP_K31_COMPONENTS v = (RSP_K31_COMPONENTS) s;
			} 

			else if(s instanceof BPS_O29_TIMING){
				BPS_O29_TIMING v = (BPS_O29_TIMING) s;
			} 

			else if(s instanceof RSP_Z86){
				RSP_Z86 v = (RSP_Z86) s;
			} 

			else if(s instanceof RSP_Z88){
				RSP_Z88 v = (RSP_Z88) s;
			} 

			else if(s instanceof DEO_O45_DONOR_REGISTRATION){
				DEO_O45_DONOR_REGISTRATION v = (DEO_O45_DONOR_REGISTRATION) s;
			} 

			else if(s instanceof RQA_I08_PROVIDER){
				RQA_I08_PROVIDER v = (RQA_I08_PROVIDER) s;
			} 

			else if(s instanceof PGL_PC6_ORDER_DETAIL){
				PGL_PC6_ORDER_DETAIL v = (PGL_PC6_ORDER_DETAIL) s;
			} 

			else if(s instanceof ERR){
				ERR v = (ERR) s;
			} 

			else if(s instanceof CSU_C09_STUDY_PHASE){
				CSU_C09_STUDY_PHASE v = (CSU_C09_STUDY_PHASE) s;
			} 

			else if(s instanceof RRI_I12_OBSERVATION){
				RRI_I12_OBSERVATION v = (RRI_I12_OBSERVATION) s;
			} 

			else if(s instanceof REF_I12_PATIENT_VISIT){
				REF_I12_PATIENT_VISIT v = (REF_I12_PATIENT_VISIT) s;
			} 

			else if(s instanceof Hxx){
				Hxx v = (Hxx) s;
			} 

			else if(s instanceof CNS){
				CNS v = (CNS) s;
			} 

			else if(s instanceof TQ2){
				TQ2 v = (TQ2) s;
			} 

			else if(s instanceof TQ1){
				TQ1 v = (TQ1) s;
			} 

			else if(s instanceof ORX_O43){
				ORX_O43 v = (ORX_O43) s;
			} 

			else if(s instanceof ORL_O40_PACKAGE){
				ORL_O40_PACKAGE v = (ORL_O40_PACKAGE) s;
			} 

			else if(s instanceof NDS){
				NDS v = (NDS) s;
			} 

			else if(s instanceof CSU_C09_STUDY_PHARM){
				CSU_C09_STUDY_PHARM v = (CSU_C09_STUDY_PHARM) s;
			} 

			else if(s instanceof RDR_RDR_DEFINITION){
				RDR_RDR_DEFINITION v = (RDR_RDR_DEFINITION) s;
			} 

			else if(s instanceof RDE_O11_ORDER_DETAIL){
				RDE_O11_ORDER_DETAIL v = (RDE_O11_ORDER_DETAIL) s;
			} 

			else if(s instanceof OUL_R22_CONTAINER){
				OUL_R22_CONTAINER v = (OUL_R22_CONTAINER) s;
			} 

			else if(s instanceof OMD_O03_OBSERVATION){
				OMD_O03_OBSERVATION v = (OMD_O03_OBSERVATION) s;
			} 

			else if(s instanceof OSM_R26_SUBJECT_POPULATION_LOCATION_IDENTIFICATION){
				OSM_R26_SUBJECT_POPULATION_LOCATION_IDENTIFICATION v = (OSM_R26_SUBJECT_POPULATION_LOCATION_IDENTIFICATION) s;
			} 

			else if(s instanceof AL1){
				AL1 v = (AL1) s;
			} 

			else if(s instanceof OPL_O37_PATIENT_PRIOR){
				OPL_O37_PATIENT_PRIOR v = (OPL_O37_PATIENT_PRIOR) s;
			} 

			else if(s instanceof SRM_S01_PERSONNEL_RESOURCE){
				SRM_S01_PERSONNEL_RESOURCE v = (SRM_S01_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof RSP_K31_TIMING){
				RSP_K31_TIMING v = (RSP_K31_TIMING) s;
			} 

			else if(s instanceof RSP_Z88_ALLERGY){
				RSP_Z88_ALLERGY v = (RSP_Z88_ALLERGY) s;
			} 

			else if(s instanceof PID){
				PID v = (PID) s;
			} 

			else if(s instanceof ORL_O22_OBSERVATION_REQUEST){
				ORL_O22_OBSERVATION_REQUEST v = (ORL_O22_OBSERVATION_REQUEST) s;
			} 

			else if(s instanceof RMI){
				RMI v = (RMI) s;
			} 

			else if(s instanceof RSP_O34_DONOR_REGISTRATION){
				RSP_O34_DONOR_REGISTRATION v = (RSP_O34_DONOR_REGISTRATION) s;
			} 

			else if(s instanceof OSM_R26_SUBJECT_PERSON_ANIMAL_IDENTIFICATION){
				OSM_R26_SUBJECT_PERSON_ANIMAL_IDENTIFICATION v = (OSM_R26_SUBJECT_PERSON_ANIMAL_IDENTIFICATION) s;
			} 

			else if(s instanceof RRA_O18_RESPONSE){
				RRA_O18_RESPONSE v = (RRA_O18_RESPONSE) s;
			} 

			else if(s instanceof PEX_P07_ASSOCIATED_OBSERVATION){
				PEX_P07_ASSOCIATED_OBSERVATION v = (PEX_P07_ASSOCIATED_OBSERVATION) s;
			} 

			else if(s instanceof EHC_E15_ADJUSTMENT_PAYEE){
				EHC_E15_ADJUSTMENT_PAYEE v = (EHC_E15_ADJUSTMENT_PAYEE) s;
			} 

			else if(s instanceof DPR_O48_BLOOD_UNIT){
				DPR_O48_BLOOD_UNIT v = (DPR_O48_BLOOD_UNIT) s;
			} 

			else if(s instanceof LAN){
				LAN v = (LAN) s;
			} 

			else if(s instanceof RSP_Z82_PATIENT){
				RSP_Z82_PATIENT v = (RSP_Z82_PATIENT) s;
			} 

			else if(s instanceof NMD_N02_APP_STATUS){
				NMD_N02_APP_STATUS v = (NMD_N02_APP_STATUS) s;
			} 

			else if(s instanceof PPP_PCB_PROBLEM){
				PPP_PCB_PROBLEM v = (PPP_PCB_PROBLEM) s;
			} 

			else if(s instanceof ORB_O28_PATIENT){
				ORB_O28_PATIENT v = (ORB_O28_PATIENT) s;
			} 

			else if(s instanceof ORL_O34_SPECIMEN_OBSERVATION){
				ORL_O34_SPECIMEN_OBSERVATION v = (ORL_O34_SPECIMEN_OBSERVATION) s;
			} 

			else if(s instanceof ORB_O28_RESPONSE){
				ORB_O28_RESPONSE v = (ORB_O28_RESPONSE) s;
			} 

			else if(s instanceof MFN_M12_MF_OBS_ATTRIBUTES){
				MFN_M12_MF_OBS_ATTRIBUTES v = (MFN_M12_MF_OBS_ATTRIBUTES) s;
			} 

			else if(s instanceof CCI_I22_GOAL_OBSERVATION){
				CCI_I22_GOAL_OBSERVATION v = (CCI_I22_GOAL_OBSERVATION) s;
			} 

			else if(s instanceof ORN_O08_ORDER){
				ORN_O08_ORDER v = (ORN_O08_ORDER) s;
			} 

			else if(s instanceof PGL_PC6_ORDER_OBSERVATION){
				PGL_PC6_ORDER_OBSERVATION v = (PGL_PC6_ORDER_OBSERVATION) s;
			} 

			else if(s instanceof RSP_K31_ENCODING){
				RSP_K31_ENCODING v = (RSP_K31_ENCODING) s;
			} 

			else if(s instanceof CCU_I20_GOAL){
				CCU_I20_GOAL v = (CCU_I20_GOAL) s;
			} 

			else if(s instanceof QVR_Q17){
				QVR_Q17 v = (QVR_Q17) s;
			} 

			else if(s instanceof OUL_R22_VISIT){
				OUL_R22_VISIT v = (OUL_R22_VISIT) s;
			} 

			else if(s instanceof CQU_I19_RESOURCE_DETAIL){
				CQU_I19_RESOURCE_DETAIL v = (CQU_I19_RESOURCE_DETAIL) s;
			} 

			else if(s instanceof OML_O39_SHIPMENT_OBSERVATION){
				OML_O39_SHIPMENT_OBSERVATION v = (OML_O39_SHIPMENT_OBSERVATION) s;
			} 

			else if(s instanceof DRC_O47_DONOR_REGISTRATION){
				DRC_O47_DONOR_REGISTRATION v = (DRC_O47_DONOR_REGISTRATION) s;
			} 

			else if(s instanceof OUL_R23_ORDER_DOCUMENT){
				OUL_R23_ORDER_DOCUMENT v = (OUL_R23_ORDER_DOCUMENT) s;
			} 

			else if(s instanceof RPA_I08){
				RPA_I08 v = (RPA_I08) s;
			} 

			else if(s instanceof OSM_R26_PACKAGE){
				OSM_R26_PACKAGE v = (OSM_R26_PACKAGE) s;
			} 

			else if(s instanceof RRE_O12_ENCODING){
				RRE_O12_ENCODING v = (RRE_O12_ENCODING) s;
			} 

			else if(s instanceof ORP_O10_COMPONENT){
				ORP_O10_COMPONENT v = (ORP_O10_COMPONENT) s;
			} 

			else if(s instanceof OML_O21_PRIOR_RESULT){
				OML_O21_PRIOR_RESULT v = (OML_O21_PRIOR_RESULT) s;
			} 

			else if(s instanceof CCR_I16_CLINICAL_ORDER_TIMING){
				CCR_I16_CLINICAL_ORDER_TIMING v = (CCR_I16_CLINICAL_ORDER_TIMING) s;
			} 

			else if(s instanceof LCC){
				LCC v = (LCC) s;
			} 

			else if(s instanceof PKG){
				PKG v = (PKG) s;
			} 

			else if(s instanceof ROL){
				ROL v = (ROL) s;
			} 

			else if(s instanceof PPG_PCG_GOAL_ROLE){
				PPG_PCG_GOAL_ROLE v = (PPG_PCG_GOAL_ROLE) s;
			} 

			else if(s instanceof VXU_V04_TIMING){
				VXU_V04_TIMING v = (VXU_V04_TIMING) s;
			} 

			else if(s instanceof LCH){
				LCH v = (LCH) s;
			} 

			else if(s instanceof OMS_O05_PATIENT){
				OMS_O05_PATIENT v = (OMS_O05_PATIENT) s;
			} 

			else if(s instanceof SRR_S01_RESOURCES){
				SRR_S01_RESOURCES v = (SRR_S01_RESOURCES) s;
			} 

			else if(s instanceof SSR_U04){
				SSR_U04 v = (SSR_U04) s;
			} 

			else if(s instanceof EVN){
				EVN v = (EVN) s;
			} 

			else if(s instanceof RDE_O11_INSURANCE){
				RDE_O11_INSURANCE v = (RDE_O11_INSURANCE) s;
			} 

			else if(s instanceof BPS_O29){
				BPS_O29 v = (BPS_O29) s;
			} 

			else if(s instanceof DFT_P11_FINANCIAL_ORDER){
				DFT_P11_FINANCIAL_ORDER v = (DFT_P11_FINANCIAL_ORDER) s;
			} 

			else if(s instanceof CQU_I19_CLINICAL_HISTORY_OBSERVATION){
				CQU_I19_CLINICAL_HISTORY_OBSERVATION v = (CQU_I19_CLINICAL_HISTORY_OBSERVATION) s;
			} 

			else if(s instanceof PPG_PCG_PATIENT_VISIT){
				PPG_PCG_PATIENT_VISIT v = (PPG_PCG_PATIENT_VISIT) s;
			} 

			else if(s instanceof RRA_O18_ORDER){
				RRA_O18_ORDER v = (RRA_O18_ORDER) s;
			} 

			else if(s instanceof EHC_E01_PATIENT_INFO){
				EHC_E01_PATIENT_INFO v = (EHC_E01_PATIENT_INFO) s;
			} 

			else if(s instanceof PEX_P07_NK1_TIMING_QTY){
				PEX_P07_NK1_TIMING_QTY v = (PEX_P07_NK1_TIMING_QTY) s;
			} 

			else if(s instanceof QVR_Q17_QBP){
				QVR_Q17_QBP v = (QVR_Q17_QBP) s;
			} 

			else if(s instanceof CCM_I21_RESOURCE_OBSERVATION){
				CCM_I21_RESOURCE_OBSERVATION v = (CCM_I21_RESOURCE_OBSERVATION) s;
			} 

			else if(s instanceof CCQ_I19_PROVIDER_CONTACT){
				CCQ_I19_PROVIDER_CONTACT v = (CCQ_I19_PROVIDER_CONTACT) s;
			} 

			else if(s instanceof RGV_O15_COMPONENTS){
				RGV_O15_COMPONENTS v = (RGV_O15_COMPONENTS) s;
			} 

			else if(s instanceof RDS_O13_ADDITIONAL_DEMOGRAPHICS){
				RDS_O13_ADDITIONAL_DEMOGRAPHICS v = (RDS_O13_ADDITIONAL_DEMOGRAPHICS) s;
			} 

			else if(s instanceof PEX_P07_ASSOCIATED_PERSON){
				PEX_P07_ASSOCIATED_PERSON v = (PEX_P07_ASSOCIATED_PERSON) s;
			} 

			else if(s instanceof ADT_A16_INSURANCE){
				ADT_A16_INSURANCE v = (ADT_A16_INSURANCE) s;
			} 

			else if(s instanceof EHC_E20_PSL_ITEM_INFO){
				EHC_E20_PSL_ITEM_INFO v = (EHC_E20_PSL_ITEM_INFO) s;
			} 

			else if(s instanceof CQU_I19_PATIENT_VISITS){
				CQU_I19_PATIENT_VISITS v = (CQU_I19_PATIENT_VISITS) s;
			} 

			else if(s instanceof RAS_O17_ADDITIONAL_DEMOGRAPHICS){
				RAS_O17_ADDITIONAL_DEMOGRAPHICS v = (RAS_O17_ADDITIONAL_DEMOGRAPHICS) s;
			} 

			else if(s instanceof RQ1){
				RQ1 v = (RQ1) s;
			} 

			else if(s instanceof RPR_I03){
				RPR_I03 v = (RPR_I03) s;
			} 

			else if(s instanceof OUL_R24_SPECIMEN_OBSERVATION){
				OUL_R24_SPECIMEN_OBSERVATION v = (OUL_R24_SPECIMEN_OBSERVATION) s;
			} 

			else if(s instanceof CCQ_I19){
				CCQ_I19 v = (CCQ_I19) s;
			} 

			else if(s instanceof MFN_M12_MF_OBS_OTHER_ATTRIBUTES){
				MFN_M12_MF_OBS_OTHER_ATTRIBUTES v = (MFN_M12_MF_OBS_OTHER_ATTRIBUTES) s;
			} 

			else if(s instanceof OMQ_O42_TIMING_PRIOR){
				OMQ_O42_TIMING_PRIOR v = (OMQ_O42_TIMING_PRIOR) s;
			} 

			else if(s instanceof CCI_I22_RESOURCES){
				CCI_I22_RESOURCES v = (CCI_I22_RESOURCES) s;
			} 

			else if(s instanceof OMS_O05_ORDER){
				OMS_O05_ORDER v = (OMS_O05_ORDER) s;
			} 

			else if(s instanceof LDP){
				LDP v = (LDP) s;
			} 

			else if(s instanceof OMP_O09_ADDITIONAL_DEMOGRAPHICS){
				OMP_O09_ADDITIONAL_DEMOGRAPHICS v = (OMP_O09_ADDITIONAL_DEMOGRAPHICS) s;
			} 

			else if(s instanceof SSR_U04_SPECIMEN_CONTAINER){
				SSR_U04_SPECIMEN_CONTAINER v = (SSR_U04_SPECIMEN_CONTAINER) s;
			} 

			else if(s instanceof ORG_O20){
				ORG_O20 v = (ORG_O20) s;
			} 

			else if(s instanceof OML_O39_SPECIMEN_OBSERVATION){
				OML_O39_SPECIMEN_OBSERVATION v = (OML_O39_SPECIMEN_OBSERVATION) s;
			} 

			else if(s instanceof RPA_I08_VISIT){
				RPA_I08_VISIT v = (RPA_I08_VISIT) s;
			} 

			else if(s instanceof CSP){
				CSP v = (CSP) s;
			} 

			else if(s instanceof EHC_E12_REQUEST){
				EHC_E12_REQUEST v = (EHC_E12_REQUEST) s;
			} 

			else if(s instanceof CSS){
				CSS v = (CSS) s;
			} 

			else if(s instanceof CCM_I21_MEDICATION_ORDER_DETAIL){
				CCM_I21_MEDICATION_ORDER_DETAIL v = (CCM_I21_MEDICATION_ORDER_DETAIL) s;
			} 

			else if(s instanceof CSR){
				CSR v = (CSR) s;
			} 

			else if(s instanceof RQD){
				RQD v = (RQD) s;
			} 

			else if(s instanceof OMB_O27_ORDER){
				OMB_O27_ORDER v = (OMB_O27_ORDER) s;
			} 

			else if(s instanceof RDE_O11_PHARMACY_TREATMENT_INFUSION_ORDER){
				RDE_O11_PHARMACY_TREATMENT_INFUSION_ORDER v = (RDE_O11_PHARMACY_TREATMENT_INFUSION_ORDER) s;
			} 

			else if(s instanceof ORU_R01_TIMING_QTY){
				ORU_R01_TIMING_QTY v = (ORU_R01_TIMING_QTY) s;
			} 

			else if(s instanceof RAS_O17_ORDER_DETAIL){
				RAS_O17_ORDER_DETAIL v = (RAS_O17_ORDER_DETAIL) s;
			} 

			else if(s instanceof PPG_PCG_PROBLEM_ROLE){
				PPG_PCG_PROBLEM_ROLE v = (PPG_PCG_PROBLEM_ROLE) s;
			} 

			else if(s instanceof CTD){
				CTD v = (CTD) s;
			} 

			else if(s instanceof PMT){
				PMT v = (PMT) s;
			} 

			else if(s instanceof RAS_O17_TIMING){
				RAS_O17_TIMING v = (RAS_O17_TIMING) s;
			} 

			else if(s instanceof CQU_I19_PROBLEM_OBSERVATION){
				CQU_I19_PROBLEM_OBSERVATION v = (CQU_I19_PROBLEM_OBSERVATION) s;
			} 

			else if(s instanceof PEX_P07_PEX_OBSERVATION){
				PEX_P07_PEX_OBSERVATION v = (PEX_P07_PEX_OBSERVATION) s;
			} 

			else if(s instanceof CTI){
				CTI v = (CTI) s;
			} 

			else if(s instanceof RGV_O15){
				RGV_O15 v = (RGV_O15) s;
			} 

			else if(s instanceof DFT_P11_TIMING_QUANTITY){
				DFT_P11_TIMING_QUANTITY v = (DFT_P11_TIMING_QUANTITY) s;
			} 

			else if(s instanceof OMS_O05_PATIENT_VISIT){
				OMS_O05_PATIENT_VISIT v = (OMS_O05_PATIENT_VISIT) s;
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

			else if(s instanceof BRT_O32_RESPONSE){
				BRT_O32_RESPONSE v = (BRT_O32_RESPONSE) s;
			} 

			else if(s instanceof PPP_PCB_PROBLEM_OBSERVATION){
				PPP_PCB_PROBLEM_OBSERVATION v = (PPP_PCB_PROBLEM_OBSERVATION) s;
			} 

			else if(s instanceof OPL_O37_ORDER){
				OPL_O37_ORDER v = (OPL_O37_ORDER) s;
			} 

			else if(s instanceof ADT_A01_PROCEDURE){
				ADT_A01_PROCEDURE v = (ADT_A01_PROCEDURE) s;
			} 

			else if(s instanceof RRD_O14_TIMING){
				RRD_O14_TIMING v = (RRD_O14_TIMING) s;
			} 

			else if(s instanceof OUL_R23_PATIENT_OBSERVATION){
				OUL_R23_PATIENT_OBSERVATION v = (OUL_R23_PATIENT_OBSERVATION) s;
			} 

			else if(s instanceof RRG_O16_TIMING_GIVE){
				RRG_O16_TIMING_GIVE v = (RRG_O16_TIMING_GIVE) s;
			} 

			else if(s instanceof NK1){
				NK1 v = (NK1) s;
			} 

			else if(s instanceof CSU_C09_TIMING_QTY){
				CSU_C09_TIMING_QTY v = (CSU_C09_TIMING_QTY) s;
			} 

			else if(s instanceof CCM_I21_ROLE_CLINICAL_HISTORY){
				CCM_I21_ROLE_CLINICAL_HISTORY v = (CCM_I21_ROLE_CLINICAL_HISTORY) s;
			} 

			else if(s instanceof OMB_O27_PATIENT_VISIT){
				OMB_O27_PATIENT_VISIT v = (OMB_O27_PATIENT_VISIT) s;
			} 

			else if(s instanceof ORU_R01_PATIENT_RESULT){
				ORU_R01_PATIENT_RESULT v = (ORU_R01_PATIENT_RESULT) s;
			} 

			else if(s instanceof EHC_E01_PRODUCT_SERVICE_SECTION){
				EHC_E01_PRODUCT_SERVICE_SECTION v = (EHC_E01_PRODUCT_SERVICE_SECTION) s;
			} 

			else if(s instanceof CCU_I20_MEDICATION_ENCODING_DETAIL){
				CCU_I20_MEDICATION_ENCODING_DETAIL v = (CCU_I20_MEDICATION_ENCODING_DETAIL) s;
			} 

			else if(s instanceof SIU_S12){
				SIU_S12 v = (SIU_S12) s;
			} 

			else if(s instanceof RDR_RDR_TIMING){
				RDR_RDR_TIMING v = (RDR_RDR_TIMING) s;
			} 

			else if(s instanceof QCN_J01){
				QCN_J01 v = (QCN_J01) s;
			} 

			else if(s instanceof OML_O39_CONTAINER_OBSERVATION){
				OML_O39_CONTAINER_OBSERVATION v = (OML_O39_CONTAINER_OBSERVATION) s;
			} 

			else if(s instanceof RSP_K31){
				RSP_K31 v = (RSP_K31) s;
			} 

			else if(s instanceof RSP_K32){
				RSP_K32 v = (RSP_K32) s;
			} 

			else if(s instanceof CCR_I16_ROLE_GOAL){
				CCR_I16_ROLE_GOAL v = (CCR_I16_ROLE_GOAL) s;
			} 

			else if(s instanceof ORU_R01_ORDER_OBSERVATION){
				ORU_R01_ORDER_OBSERVATION v = (ORU_R01_ORDER_OBSERVATION) s;
			} 

			else if(s instanceof NMD_N02_CLOCK){
				NMD_N02_CLOCK v = (NMD_N02_CLOCK) s;
			} 

			else if(s instanceof RSP_Z88_COMMON_ORDER){
				RSP_Z88_COMMON_ORDER v = (RSP_Z88_COMMON_ORDER) s;
			} 

			else if(s instanceof OMP_O09_ORDER){
				OMP_O09_ORDER v = (OMP_O09_ORDER) s;
			} 

			else if(s instanceof PGL_PC6_PROBLEM){
				PGL_PC6_PROBLEM v = (PGL_PC6_PROBLEM) s;
			} 

			else if(s instanceof ORD_O04_TIMING_TRAY){
				ORD_O04_TIMING_TRAY v = (ORD_O04_TIMING_TRAY) s;
			} 

			else if(s instanceof TXA){
				TXA v = (TXA) s;
			} 

			else if(s instanceof CCU_I20_ROLE_PATHWAY){
				CCU_I20_ROLE_PATHWAY v = (CCU_I20_ROLE_PATHWAY) s;
			} 

			else if(s instanceof ARQ){
				ARQ v = (ARQ) s;
			} 

			else if(s instanceof SSU_U03_SPECIMEN){
				SSU_U03_SPECIMEN v = (SSU_U03_SPECIMEN) s;
			} 

			else if(s instanceof ARV){
				ARV v = (ARV) s;
			} 

			else if(s instanceof RSP_K23){
				RSP_K23 v = (RSP_K23) s;
			} 

			else if(s instanceof RSP_K25){
				RSP_K25 v = (RSP_K25) s;
			} 

			else if(s instanceof OUL_R22_PATIENT){
				OUL_R22_PATIENT v = (OUL_R22_PATIENT) s;
			} 

			else if(s instanceof RSP_K21){
				RSP_K21 v = (RSP_K21) s;
			} 

			else if(s instanceof OML_O39_ORDER){
				OML_O39_ORDER v = (OML_O39_ORDER) s;
			} 

			else if(s instanceof RSP_K22){
				RSP_K22 v = (RSP_K22) s;
			} 

			else if(s instanceof RRA_O18_PATIENT){
				RRA_O18_PATIENT v = (RRA_O18_PATIENT) s;
			} 

			else if(s instanceof RPI_I01_INSURANCE){
				RPI_I01_INSURANCE v = (RPI_I01_INSURANCE) s;
			} 

			else if(s instanceof RDR_RDR_PATIENT){
				RDR_RDR_PATIENT v = (RDR_RDR_PATIENT) s;
			} 

			else if(s instanceof CCM_I21_CLINICAL_HISTORY_OBSERVATION){
				CCM_I21_CLINICAL_HISTORY_OBSERVATION v = (CCM_I21_CLINICAL_HISTORY_OBSERVATION) s;
			} 

			else if(s instanceof ORP_O10_ORDER_DETAIL){
				ORP_O10_ORDER_DETAIL v = (ORP_O10_ORDER_DETAIL) s;
			} 

			else if(s instanceof OML_O21_PATIENT_PRIOR){
				OML_O21_PATIENT_PRIOR v = (OML_O21_PATIENT_PRIOR) s;
			} 

			else if(s instanceof PPR_PC1_ORDER){
				PPR_PC1_ORDER v = (PPR_PC1_ORDER) s;
			} 

			else if(s instanceof CCM_I21_ROLE_PROBLEM){
				CCM_I21_ROLE_PROBLEM v = (CCM_I21_ROLE_PROBLEM) s;
			} 

			else if(s instanceof PPR_PC1_ORDER_OBSERVATION){
				PPR_PC1_ORDER_OBSERVATION v = (PPR_PC1_ORDER_OBSERVATION) s;
			} 

			else if(s instanceof RRG_O16_RESPONSE){
				RRG_O16_RESPONSE v = (RRG_O16_RESPONSE) s;
			} 

			else if(s instanceof BTS_O31_TIMING){
				BTS_O31_TIMING v = (BTS_O31_TIMING) s;
			} 

			else if(s instanceof DRG_O43){
				DRG_O43 v = (DRG_O43) s;
			} 

			else if(s instanceof OML_O21_ORDER){
				OML_O21_ORDER v = (OML_O21_ORDER) s;
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

			else if(s instanceof RSP_K11){
				RSP_K11 v = (RSP_K11) s;
			} 

			else if(s instanceof OML_O39_SPECIMEN_CONTAINER_IN_PACKAGE){
				OML_O39_SPECIMEN_CONTAINER_IN_PACKAGE v = (OML_O39_SPECIMEN_CONTAINER_IN_PACKAGE) s;
			} 

			else if(s instanceof RQA_I08_GUARANTOR_INSURANCE){
				RQA_I08_GUARANTOR_INSURANCE v = (RQA_I08_GUARANTOR_INSURANCE) s;
			} 

			else if(s instanceof RSP_Z84_ROW_DEFINITION){
				RSP_Z84_ROW_DEFINITION v = (RSP_Z84_ROW_DEFINITION) s;
			} 

			else if(s instanceof CCU_I20_MEDICATION_ENCODING_OBSERVATION){
				CCU_I20_MEDICATION_ENCODING_OBSERVATION v = (CCU_I20_MEDICATION_ENCODING_OBSERVATION) s;
			} 

			else if(s instanceof SRM_S01_GENERAL_RESOURCE){
				SRM_S01_GENERAL_RESOURCE v = (SRM_S01_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof ORG_O20_RESPONSE){
				ORG_O20_RESPONSE v = (ORG_O20_RESPONSE) s;
			} 

			else if(s instanceof PRA){
				PRA v = (PRA) s;
			} 

			else if(s instanceof RSP_Znn){
				RSP_Znn v = (RSP_Znn) s;
			} 

			else if(s instanceof PRC){
				PRC v = (PRC) s;
			} 

			else if(s instanceof CCU_I20_MEDICATION_ORDER_OBSERVATION){
				CCU_I20_MEDICATION_ORDER_OBSERVATION v = (CCU_I20_MEDICATION_ORDER_OBSERVATION) s;
			} 

			else if(s instanceof PRB){
				PRB v = (PRB) s;
			} 

			else if(s instanceof CCI_I22_PROBLEM_OBSERVATION){
				CCI_I22_PROBLEM_OBSERVATION v = (CCI_I22_PROBLEM_OBSERVATION) s;
			} 

			else if(s instanceof PRD){
				PRD v = (PRD) s;
			} 

			else if(s instanceof OMN_O07_INSURANCE){
				OMN_O07_INSURANCE v = (OMN_O07_INSURANCE) s;
			} 

			else if(s instanceof DPR_O48_DONOR_REGISTRATION){
				DPR_O48_DONOR_REGISTRATION v = (DPR_O48_DONOR_REGISTRATION) s;
			} 

			else if(s instanceof CSU_C09){
				CSU_C09 v = (CSU_C09) s;
			} 

			else if(s instanceof PEX_P07_RX_ORDER){
				PEX_P07_RX_ORDER v = (PEX_P07_RX_ORDER) s;
			} 

			else if(s instanceof CCM_I21_MEDICATION_ADMINISTRATION_OBSERVATION){
				CCM_I21_MEDICATION_ADMINISTRATION_OBSERVATION v = (CCM_I21_MEDICATION_ADMINISTRATION_OBSERVATION) s;
			} 

			else if(s instanceof RSP_Z86_COMMON_ORDER){
				RSP_Z86_COMMON_ORDER v = (RSP_Z86_COMMON_ORDER) s;
			} 

			else if(s instanceof PRT){
				PRT v = (PRT) s;
			} 

			else if(s instanceof OML_O21_PATIENT_VISIT_PRIOR){
				OML_O21_PATIENT_VISIT_PRIOR v = (OML_O21_PATIENT_VISIT_PRIOR) s;
			} 

			else if(s instanceof CCM_I21_MEDICATION_ENCODING_OBSERVATION){
				CCM_I21_MEDICATION_ENCODING_OBSERVATION v = (CCM_I21_MEDICATION_ENCODING_OBSERVATION) s;
			} 

			else if(s instanceof CRM_C01_PATIENT){
				CRM_C01_PATIENT v = (CRM_C01_PATIENT) s;
			} 

			else if(s instanceof OML_O21_CONTAINER_OBSERVATION){
				OML_O21_CONTAINER_OBSERVATION v = (OML_O21_CONTAINER_OBSERVATION) s;
			} 

			else if(s instanceof MDM_T01){
				MDM_T01 v = (MDM_T01) s;
			} 

			else if(s instanceof CCI_I22_MEDICATION_ADMINISTRATION_DETAIL){
				CCI_I22_MEDICATION_ADMINISTRATION_DETAIL v = (CCI_I22_MEDICATION_ADMINISTRATION_DETAIL) s;
			} 

			else if(s instanceof PPP_PCB_ORDER_OBSERVATION){
				PPP_PCB_ORDER_OBSERVATION v = (PPP_PCB_ORDER_OBSERVATION) s;
			} 

			else if(s instanceof MDM_T02){
				MDM_T02 v = (MDM_T02) s;
			} 

			else if(s instanceof AUT){
				AUT v = (AUT) s;
			} 

			else if(s instanceof RRE_O12_PATIENT){
				RRE_O12_PATIENT v = (RRE_O12_PATIENT) s;
			} 

			else if(s instanceof PSH){
				PSH v = (PSH) s;
			} 

			else if(s instanceof PSG){
				PSG v = (PSG) s;
			} 

			else if(s instanceof OMD_O03){
				OMD_O03 v = (OMD_O03) s;
			} 

			else if(s instanceof OMS_O05){
				OMS_O05 v = (OMS_O05) s;
			} 

			else if(s instanceof CSU_C09_COMMON_ORDER){
				CSU_C09_COMMON_ORDER v = (CSU_C09_COMMON_ORDER) s;
			} 

			else if(s instanceof PSL){
				PSL v = (PSL) s;
			} 

			else if(s instanceof BRP_O30_RESPONSE){
				BRP_O30_RESPONSE v = (BRP_O30_RESPONSE) s;
			} 

			else if(s instanceof CSU_C09_RX_ADMIN){
				CSU_C09_RX_ADMIN v = (CSU_C09_RX_ADMIN) s;
			} 

			else if(s instanceof CSU_C09_VISIT){
				CSU_C09_VISIT v = (CSU_C09_VISIT) s;
			} 

			else if(s instanceof PSS){
				PSS v = (PSS) s;
			} 

			else if(s instanceof ORL_O34_RESPONSE){
				ORL_O34_RESPONSE v = (ORL_O34_RESPONSE) s;
			} 

			else if(s instanceof RXA){
				RXA v = (RXA) s;
			} 

			else if(s instanceof OMD_O03_TIMING_TRAY){
				OMD_O03_TIMING_TRAY v = (OMD_O03_TIMING_TRAY) s;
			} 

			else if(s instanceof OMQ_O42_PATIENT_VISIT_PRIOR){
				OMQ_O42_PATIENT_VISIT_PRIOR v = (OMQ_O42_PATIENT_VISIT_PRIOR) s;
			} 

			else if(s instanceof PGL_PC6_GOAL){
				PGL_PC6_GOAL v = (PGL_PC6_GOAL) s;
			} 

			else if(s instanceof RXC){
				RXC v = (RXC) s;
			} 

			else if(s instanceof OPR_O38_SPECIMEN_OBSERVATION){
				OPR_O38_SPECIMEN_OBSERVATION v = (OPR_O38_SPECIMEN_OBSERVATION) s;
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

			else if(s instanceof RDR_RDR_TIMING_ENCODED){
				RDR_RDR_TIMING_ENCODED v = (RDR_RDR_TIMING_ENCODED) s;
			} 

			else if(s instanceof DPR_O48){
				DPR_O48 v = (DPR_O48) s;
			} 

			else if(s instanceof DFT_P11_FINANCIAL_PROCEDURE){
				DFT_P11_FINANCIAL_PROCEDURE v = (DFT_P11_FINANCIAL_PROCEDURE) s;
			} 

			else if(s instanceof OUL_R22_ORDER_DOCUMENT){
				OUL_R22_ORDER_DOCUMENT v = (OUL_R22_ORDER_DOCUMENT) s;
			} 

			else if(s instanceof PTH){
				PTH v = (PTH) s;
			} 

			else if(s instanceof VXU_V04_ORDER){
				VXU_V04_ORDER v = (VXU_V04_ORDER) s;
			} 

			else if(s instanceof RXO){
				RXO v = (RXO) s;
			} 

			else if(s instanceof CQU_I19){
				CQU_I19 v = (CQU_I19) s;
			} 

			else if(s instanceof RXR){
				RXR v = (RXR) s;
			} 

			else if(s instanceof MFN_M10_MF_TEST_BATTERIES){
				MFN_M10_MF_TEST_BATTERIES v = (MFN_M10_MF_TEST_BATTERIES) s;
			} 

			else if(s instanceof PMU_B01){
				PMU_B01 v = (PMU_B01) s;
			} 

			else if(s instanceof RSP_Z82_OBSERVATION){
				RSP_Z82_OBSERVATION v = (RSP_Z82_OBSERVATION) s;
			} 

			else if(s instanceof PMU_B04){
				PMU_B04 v = (PMU_B04) s;
			} 

			else if(s instanceof PMU_B03){
				PMU_B03 v = (PMU_B03) s;
			} 

			else if(s instanceof DRC_O47_DONATION_ORDER){
				DRC_O47_DONATION_ORDER v = (DRC_O47_DONATION_ORDER) s;
			} 

			else if(s instanceof RXV){
				RXV v = (RXV) s;
			} 

			else if(s instanceof NPU){
				NPU v = (NPU) s;
			} 

			else if(s instanceof BAR_P12){
				BAR_P12 v = (BAR_P12) s;
			} 

			else if(s instanceof BAR_P10){
				BAR_P10 v = (BAR_P10) s;
			} 

			else if(s instanceof DFT_P03_FINANCIAL_COMMON_ORDER){
				DFT_P03_FINANCIAL_COMMON_ORDER v = (DFT_P03_FINANCIAL_COMMON_ORDER) s;
			} 

			else if(s instanceof MFN_M07_MF_CLIN_STUDY_SCHED){
				MFN_M07_MF_CLIN_STUDY_SCHED v = (MFN_M07_MF_CLIN_STUDY_SCHED) s;
			} 

			else if(s instanceof RSP_K22_QUERY_RESPONSE){
				RSP_K22_QUERY_RESPONSE v = (RSP_K22_QUERY_RESPONSE) s;
			} 

			else if(s instanceof DFT_P03_FINANCIAL){
				DFT_P03_FINANCIAL v = (DFT_P03_FINANCIAL) s;
			} 

			else if(s instanceof INR_U06){
				INR_U06 v = (INR_U06) s;
			} 

			else if(s instanceof REF_I12_INSURANCE){
				REF_I12_INSURANCE v = (REF_I12_INSURANCE) s;
			} 

			else if(s instanceof ORL_O36_OBSERVATION_REQUEST){
				ORL_O36_OBSERVATION_REQUEST v = (ORL_O36_OBSERVATION_REQUEST) s;
			} 

			else if(s instanceof SRR_S01_LOCATION_RESOURCE){
				SRR_S01_LOCATION_RESOURCE v = (SRR_S01_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof CCM_I21_CLINICAL_HISTORY_DETAIL){
				CCM_I21_CLINICAL_HISTORY_DETAIL v = (CCM_I21_CLINICAL_HISTORY_DETAIL) s;
			} 

			else if(s instanceof PPR_PC1_GOAL){
				PPR_PC1_GOAL v = (PPR_PC1_GOAL) s;
			} 

			else if(s instanceof RSP_Z88_OBSERVATION){
				RSP_Z88_OBSERVATION v = (RSP_Z88_OBSERVATION) s;
			} 

			else if(s instanceof ADT_A06_INSURANCE){
				ADT_A06_INSURANCE v = (ADT_A06_INSURANCE) s;
			} 

			else if(s instanceof RSP_K31_ORDER_DETAIL){
				RSP_K31_ORDER_DETAIL v = (RSP_K31_ORDER_DETAIL) s;
			} 

			else if(s instanceof OMG_O19_SPECIMEN){
				OMG_O19_SPECIMEN v = (OMG_O19_SPECIMEN) s;
			} 

			else if(s instanceof FAC){
				FAC v = (FAC) s;
			} 

			else if(s instanceof PV1){
				PV1 v = (PV1) s;
			} 

			else if(s instanceof CCF_I22){
				CCF_I22 v = (CCF_I22) s;
			} 

			else if(s instanceof OMG_O19_ORDER_PRIOR){
				OMG_O19_ORDER_PRIOR v = (OMG_O19_ORDER_PRIOR) s;
			} 

			else if(s instanceof PV2){
				PV2 v = (PV2) s;
			} 

			else if(s instanceof DFT_P03_FINANCIAL_OBSERVATION){
				DFT_P03_FINANCIAL_OBSERVATION v = (DFT_P03_FINANCIAL_OBSERVATION) s;
			} 

			else if(s instanceof PPR_PC1_PROBLEM_ROLE){
				PPR_PC1_PROBLEM_ROLE v = (PPR_PC1_PROBLEM_ROLE) s;
			} 

			else if(s instanceof BAR_P02){
				BAR_P02 v = (BAR_P02) s;
			} 

			else if(s instanceof OSM_R26_SHIPPING_OBSERVATION){
				OSM_R26_SHIPPING_OBSERVATION v = (OSM_R26_SHIPPING_OBSERVATION) s;
			} 

			else if(s instanceof RDS_O13_COMPONENT){
				RDS_O13_COMPONENT v = (RDS_O13_COMPONENT) s;
			} 

			else if(s instanceof ORI_O24){
				ORI_O24 v = (ORI_O24) s;
			} 

			else if(s instanceof BAR_P01){
				BAR_P01 v = (BAR_P01) s;
			} 

			else if(s instanceof PPG_PCG_PATHWAY){
				PPG_PCG_PATHWAY v = (PPG_PCG_PATHWAY) s;
			} 

			else if(s instanceof BAR_P06){
				BAR_P06 v = (BAR_P06) s;
			} 

			else if(s instanceof OML_O35_TIMING_PRIOR){
				OML_O35_TIMING_PRIOR v = (OML_O35_TIMING_PRIOR) s;
			} 

			else if(s instanceof PEX_P07_ASSOCIATED_RX_ADMIN){
				PEX_P07_ASSOCIATED_RX_ADMIN v = (PEX_P07_ASSOCIATED_RX_ADMIN) s;
			} 

			else if(s instanceof BAR_P05){
				BAR_P05 v = (BAR_P05) s;
			} 

			else if(s instanceof OPU_R25_TIMING_QTY){
				OPU_R25_TIMING_QTY v = (OPU_R25_TIMING_QTY) s;
			} 

			else if(s instanceof OPR_O38_OBSERVATION_REQUEST){
				OPR_O38_OBSERVATION_REQUEST v = (OPR_O38_OBSERVATION_REQUEST) s;
			} 

			else if(s instanceof OPU_R25_RESULT){
				OPU_R25_RESULT v = (OPU_R25_RESULT) s;
			} 

			else if(s instanceof ORL_O22_TIMING){
				ORL_O22_TIMING v = (ORL_O22_TIMING) s;
			} 

			else if(s instanceof ORL_O36_ORDER){
				ORL_O36_ORDER v = (ORL_O36_ORDER) s;
			} 

			else if(s instanceof OML_O35_SPECIMEN_CONTAINER){
				OML_O35_SPECIMEN_CONTAINER v = (OML_O35_SPECIMEN_CONTAINER) s;
			} 

			else if(s instanceof ORL_O22){
				ORL_O22 v = (ORL_O22) s;
			} 

			else if(s instanceof CCU_I20_ROLE_PROBLEM){
				CCU_I20_ROLE_PROBLEM v = (CCU_I20_ROLE_PROBLEM) s;
			} 

			else if(s instanceof OMG_O19_OBSERVATION_PRIOR){
				OMG_O19_OBSERVATION_PRIOR v = (OMG_O19_OBSERVATION_PRIOR) s;
			} 

			else if(s instanceof OMI_O23_PATIENT){
				OMI_O23_PATIENT v = (OMI_O23_PATIENT) s;
			} 

			else if(s instanceof RSP_O34){
				RSP_O34 v = (RSP_O34) s;
			} 

			else if(s instanceof OMQ_O42_INSURANCE){
				OMQ_O42_INSURANCE v = (OMQ_O42_INSURANCE) s;
			} 

			else if(s instanceof ORS_O06_ORDER){
				ORS_O06_ORDER v = (ORS_O06_ORDER) s;
			} 

			else if(s instanceof OMB_O27_INSURANCE){
				OMB_O27_INSURANCE v = (OMB_O27_INSURANCE) s;
			} 

			else if(s instanceof RPA_I08_AUTHORIZATION){
				RPA_I08_AUTHORIZATION v = (RPA_I08_AUTHORIZATION) s;
			} 

			else if(s instanceof MFN_M16_MATERIAL_ITEM_RECORD){
				MFN_M16_MATERIAL_ITEM_RECORD v = (MFN_M16_MATERIAL_ITEM_RECORD) s;
			} 

			else if(s instanceof ORP_O10_TIMING){
				ORP_O10_TIMING v = (ORP_O10_TIMING) s;
			} 

			else if(s instanceof CRM_C01){
				CRM_C01 v = (CRM_C01) s;
			} 

			else if(s instanceof RPI_I04_PROVIDER){
				RPI_I04_PROVIDER v = (RPI_I04_PROVIDER) s;
			} 

			else if(s instanceof OSM_R26_CONTAINER_OBSERVATION){
				OSM_R26_CONTAINER_OBSERVATION v = (OSM_R26_CONTAINER_OBSERVATION) s;
			} 

			else if(s instanceof NSC){
				NSC v = (NSC) s;
			} 

			else if(s instanceof CCU_I20_PATIENT_VISITS){
				CCU_I20_PATIENT_VISITS v = (CCU_I20_PATIENT_VISITS) s;
			} 

			else if(s instanceof MFN_M16_PACKAGING){
				MFN_M16_PACKAGING v = (MFN_M16_PACKAGING) s;
			} 

			else if(s instanceof LOC){
				LOC v = (LOC) s;
			} 

			else if(s instanceof CCM_I21_ROLE_PATHWAY){
				CCM_I21_ROLE_PATHWAY v = (CCM_I21_ROLE_PATHWAY) s;
			} 

			else if(s instanceof CON_){
				CON_ v = (CON_) s;
			} 

			else if(s instanceof CCI_I22_PATHWAY_OBSERVATION){
				CCI_I22_PATHWAY_OBSERVATION v = (CCI_I22_PATHWAY_OBSERVATION) s;
			} 

			else if(s instanceof MFN_M06_MF_CLIN_STUDY){
				MFN_M06_MF_CLIN_STUDY v = (MFN_M06_MF_CLIN_STUDY) s;
			} 

			else if(s instanceof RTB_Z74_ROW_DEFINITION){
				RTB_Z74_ROW_DEFINITION v = (RTB_Z74_ROW_DEFINITION) s;
			} 

			else if(s instanceof RGV_O15_PATIENT_VISIT){
				RGV_O15_PATIENT_VISIT v = (RGV_O15_PATIENT_VISIT) s;
			} 

			else if(s instanceof ORL_O36){
				ORL_O36 v = (ORL_O36) s;
			} 

			else if(s instanceof DFT_P11_FINANCIAL_INSURANCE){
				DFT_P11_FINANCIAL_INSURANCE v = (DFT_P11_FINANCIAL_INSURANCE) s;
			} 

			else if(s instanceof RSP_O33){
				RSP_O33 v = (RSP_O33) s;
			} 

			else if(s instanceof CCI_I22_CLINICAL_HISTORY_DETAIL){
				CCI_I22_CLINICAL_HISTORY_DETAIL v = (CCI_I22_CLINICAL_HISTORY_DETAIL) s;
			} 

			else if(s instanceof NST){
				NST v = (NST) s;
			} 

			else if(s instanceof ORL_O34){
				ORL_O34 v = (ORL_O34) s;
			} 

			else if(s instanceof SSU_U03_SPECIMEN_CONTAINER){
				SSU_U03_SPECIMEN_CONTAINER v = (SSU_U03_SPECIMEN_CONTAINER) s;
			} 

			else if(s instanceof PMU_B08){
				PMU_B08 v = (PMU_B08) s;
			} 

			else if(s instanceof PMU_B07){
				PMU_B07 v = (PMU_B07) s;
			} 

			else if(s instanceof OPL_O37_OBSERVATION_REQUEST){
				OPL_O37_OBSERVATION_REQUEST v = (OPL_O37_OBSERVATION_REQUEST) s;
			} 

			else if(s instanceof UAC){
				UAC v = (UAC) s;
			} 

			else if(s instanceof SIU_S12_GENERAL_RESOURCE){
				SIU_S12_GENERAL_RESOURCE v = (SIU_S12_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof OMG_O19_CONTAINER_OBSERVATION){
				OMG_O19_CONTAINER_OBSERVATION v = (OMG_O19_CONTAINER_OBSERVATION) s;
			} 

			else if(s instanceof OMQ_O42_OBSERVATION_PRIOR){
				OMQ_O42_OBSERVATION_PRIOR v = (OMQ_O42_OBSERVATION_PRIOR) s;
			} 

			else if(s instanceof OML_O35_OBSERVATION){
				OML_O35_OBSERVATION v = (OML_O35_OBSERVATION) s;
			} 

			else if(s instanceof NTE){
				NTE v = (NTE) s;
			} 

			else if(s instanceof RDE_O11_ORDER){
				RDE_O11_ORDER v = (RDE_O11_ORDER) s;
			} 

			else if(s instanceof ADT_A06_PROCEDURE){
				ADT_A06_PROCEDURE v = (ADT_A06_PROCEDURE) s;
			} 

			else if(s instanceof OML_O35_PATIENT_VISIT_PRIOR){
				OML_O35_PATIENT_VISIT_PRIOR v = (OML_O35_PATIENT_VISIT_PRIOR) s;
			} 

			else if(s instanceof UB2){
				UB2 v = (UB2) s;
			} 

			else if(s instanceof UB1){
				UB1 v = (UB1) s;
			} 

			else if(s instanceof CCR_I16_PATIENT){
				CCR_I16_PATIENT v = (CCR_I16_PATIENT) s;
			} 

			else if(s instanceof REF_I12_AUTHORIZATION_CONTACT2){
				REF_I12_AUTHORIZATION_CONTACT2 v = (REF_I12_AUTHORIZATION_CONTACT2) s;
			} 

			else if(s instanceof PPP_PCB){
				PPP_PCB v = (PPP_PCB) s;
			} 

			else if(s instanceof REF_I12_AUTHORIZATION_CONTACT1){
				REF_I12_AUTHORIZATION_CONTACT1 v = (REF_I12_AUTHORIZATION_CONTACT1) s;
			} 

			else if(s instanceof ORD_O04_TIMING_DIET){
				ORD_O04_TIMING_DIET v = (ORD_O04_TIMING_DIET) s;
			} 

			else if(s instanceof ORX_O43_PATIENT){
				ORX_O43_PATIENT v = (ORX_O43_PATIENT) s;
			} 

			else if(s instanceof MDM_T02_OBXNTE){
				MDM_T02_OBXNTE v = (MDM_T02_OBXNTE) s;
			} 

			else if(s instanceof CCM_I21_MEDICATION_ADMINISTRATION_DETAIL){
				CCM_I21_MEDICATION_ADMINISTRATION_DETAIL v = (CCM_I21_MEDICATION_ADMINISTRATION_DETAIL) s;
			} 

			else if(s instanceof CCR_I16_ROLE_OBSERVATION){
				CCR_I16_ROLE_OBSERVATION v = (CCR_I16_ROLE_OBSERVATION) s;
			} 

			else if(s instanceof OMG_O19_PATIENT_VISIT){
				OMG_O19_PATIENT_VISIT v = (OMG_O19_PATIENT_VISIT) s;
			} 

			else if(s instanceof RSP_K11_SEGMENT_PATTERN){
				RSP_K11_SEGMENT_PATTERN v = (RSP_K11_SEGMENT_PATTERN) s;
			} 

			else if(s instanceof ORD_O04_PATIENT){
				ORD_O04_PATIENT v = (ORD_O04_PATIENT) s;
			} 

			else if(s instanceof PPG_PCG_GOAL){
				PPG_PCG_GOAL v = (PPG_PCG_GOAL) s;
			} 

			else if(s instanceof ORU_R30_PATIENT_OBSERVATION){
				ORU_R30_PATIENT_OBSERVATION v = (ORU_R30_PATIENT_OBSERVATION) s;
			} 

			else if(s instanceof MFN_M02_MF_STAFF){
				MFN_M02_MF_STAFF v = (MFN_M02_MF_STAFF) s;
			} 

			else if(s instanceof ORX_O43_ORDER){
				ORX_O43_ORDER v = (ORX_O43_ORDER) s;
			} 

			else if(s instanceof RSP_Z82_ENCODED_ORDER){
				RSP_Z82_ENCODED_ORDER v = (RSP_Z82_ENCODED_ORDER) s;
			} 

			else if(s instanceof SRM_S01_OBXPRT){
				SRM_S01_OBXPRT v = (SRM_S01_OBXPRT) s;
			} 

			else if(s instanceof PYE){
				PYE v = (PYE) s;
			} 

			else if(s instanceof CCR_I16_RESOURCES){
				CCR_I16_RESOURCES v = (CCR_I16_RESOURCES) s;
			} 

			else if(s instanceof ADT_A45_MERGE_INFO){
				ADT_A45_MERGE_INFO v = (ADT_A45_MERGE_INFO) s;
			} 

			else if(s instanceof CCM_I21_PROBLEM){
				CCM_I21_PROBLEM v = (CCM_I21_PROBLEM) s;
			} 

			else if(s instanceof CRM_C01_PATIENT_VISIT){
				CRM_C01_PATIENT_VISIT v = (CRM_C01_PATIENT_VISIT) s;
			} 

			else if(s instanceof CCI_I22_ROLE_PATHWAY){
				CCI_I22_ROLE_PATHWAY v = (CCI_I22_ROLE_PATHWAY) s;
			} 

			else if(s instanceof EAR_U08_COMMAND_RESPONSE){
				EAR_U08_COMMAND_RESPONSE v = (EAR_U08_COMMAND_RESPONSE) s;
			} 

			else if(s instanceof DB1){
				DB1 v = (DB1) s;
			} 

			else if(s instanceof EHC_E01_DIAGNOSIS){
				EHC_E01_DIAGNOSIS v = (EHC_E01_DIAGNOSIS) s;
			} 

			else if(s instanceof MDM_T01_TIMING){
				MDM_T01_TIMING v = (MDM_T01_TIMING) s;
			} 

			else if(s instanceof TCU_U10){
				TCU_U10 v = (TCU_U10) s;
			} 

			else if(s instanceof RSP_K21_QUERY_RESPONSE){
				RSP_K21_QUERY_RESPONSE v = (RSP_K21_QUERY_RESPONSE) s;
			} 

			else if(s instanceof LRL){
				LRL v = (LRL) s;
			} 

			else if(s instanceof OPU_R25_ACCESSION_DETAIL){
				OPU_R25_ACCESSION_DETAIL v = (OPU_R25_ACCESSION_DETAIL) s;
			} 

			else if(s instanceof ORA_R33){
				ORA_R33 v = (ORA_R33) s;
			} 

			else if(s instanceof CCM_I21_PATIENT_VISITS){
				CCM_I21_PATIENT_VISITS v = (CCM_I21_PATIENT_VISITS) s;
			} 

			else if(s instanceof CCU_I20){
				CCU_I20 v = (CCU_I20) s;
			} 

			else if(s instanceof OUL_R24_TIMING_QTY){
				OUL_R24_TIMING_QTY v = (OUL_R24_TIMING_QTY) s;
			} 

			else if(s instanceof ORL_O40_SPECIMEN_CONTAINER_IN_PACKAGE){
				ORL_O40_SPECIMEN_CONTAINER_IN_PACKAGE v = (ORL_O40_SPECIMEN_CONTAINER_IN_PACKAGE) s;
			} 

			else if(s instanceof RRD_O14_ORDER){
				RRD_O14_ORDER v = (RRD_O14_ORDER) s;
			} 

			else if(s instanceof OML_O21_PATIENT){
				OML_O21_PATIENT v = (OML_O21_PATIENT) s;
			} 

			else if(s instanceof RSP_E22_PSL_ITEM_INFO){
				RSP_E22_PSL_ITEM_INFO v = (RSP_E22_PSL_ITEM_INFO) s;
			} 

			else if(s instanceof RPI_I01_PROVIDER){
				RPI_I01_PROVIDER v = (RPI_I01_PROVIDER) s;
			} 

			else if(s instanceof DER_O44_DONOR){
				DER_O44_DONOR v = (DER_O44_DONOR) s;
			} 

			else if(s instanceof CCI_I22_MEDICATION_ORDER_DETAIL){
				CCI_I22_MEDICATION_ORDER_DETAIL v = (CCI_I22_MEDICATION_ORDER_DETAIL) s;
			} 

			else if(s instanceof CCR_I16_RESOURCE_DETAIL){
				CCR_I16_RESOURCE_DETAIL v = (CCR_I16_RESOURCE_DETAIL) s;
			} 

			else if(s instanceof RDE_O11_PATIENT_VISIT){
				RDE_O11_PATIENT_VISIT v = (RDE_O11_PATIENT_VISIT) s;
			} 

			else if(s instanceof OML_O39_PACKAGE){
				OML_O39_PACKAGE v = (OML_O39_PACKAGE) s;
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

			else if(s instanceof EHC_E01_PRODUCT_SERVICE_GROUP){
				EHC_E01_PRODUCT_SERVICE_GROUP v = (EHC_E01_PRODUCT_SERVICE_GROUP) s;
			} 

			else if(s instanceof ADT_A05_PROCEDURE){
				ADT_A05_PROCEDURE v = (ADT_A05_PROCEDURE) s;
			} 

			else if(s instanceof RRE_O12_ORDER){
				RRE_O12_ORDER v = (RRE_O12_ORDER) s;
			} 

			else if(s instanceof DRC_O47_DONOR){
				DRC_O47_DONOR v = (DRC_O47_DONOR) s;
			} 

			else if(s instanceof RPA_I08_RESULTS){
				RPA_I08_RESULTS v = (RPA_I08_RESULTS) s;
			} 

			else if(s instanceof PEX_P07){
				PEX_P07 v = (PEX_P07) s;
			} 

			else if(s instanceof NMD_N02_CLOCK_AND_STATS_WITH_NOTES){
				NMD_N02_CLOCK_AND_STATS_WITH_NOTES v = (NMD_N02_CLOCK_AND_STATS_WITH_NOTES) s;
			} 

			else if(s instanceof INU_U05){
				INU_U05 v = (INU_U05) s;
			} 

			else if(s instanceof OMG_O19_ORDER){
				OMG_O19_ORDER v = (OMG_O19_ORDER) s;
			} 

			else if(s instanceof DFT_P03_INSURANCE){
				DFT_P03_INSURANCE v = (DFT_P03_INSURANCE) s;
			} 

			else if(s instanceof SAC){
				SAC v = (SAC) s;
			} 

			else if(s instanceof RDS_O13_PATIENT_VISIT){
				RDS_O13_PATIENT_VISIT v = (RDS_O13_PATIENT_VISIT) s;
			} 

			else if(s instanceof EHC_E01_PROCEDURE){
				EHC_E01_PROCEDURE v = (EHC_E01_PROCEDURE) s;
			} 

			else if(s instanceof RSP_Z88_TIMING){
				RSP_Z88_TIMING v = (RSP_Z88_TIMING) s;
			} 

			else if(s instanceof ORP_O10_RESPONSE){
				ORP_O10_RESPONSE v = (ORP_O10_RESPONSE) s;
			} 

			else if(s instanceof OML_O35_OBSERVATION_PRIOR){
				OML_O35_OBSERVATION_PRIOR v = (OML_O35_OBSERVATION_PRIOR) s;
			} 

			else if(s instanceof OMN_O07_ORDER){
				OMN_O07_ORDER v = (OMN_O07_ORDER) s;
			} 

			else if(s instanceof ORL_O40){
				ORL_O40 v = (ORL_O40) s;
			} 

			else if(s instanceof PPR_PC1_PROBLEM_OBSERVATION){
				PPR_PC1_PROBLEM_OBSERVATION v = (PPR_PC1_PROBLEM_OBSERVATION) s;
			} 

			else if(s instanceof RSP_Z86_ENCODED_ORDER){
				RSP_Z86_ENCODED_ORDER v = (RSP_Z86_ENCODED_ORDER) s;
			} 

			else if(s instanceof OML_O33_OBSERVATION_REQUEST){
				OML_O33_OBSERVATION_REQUEST v = (OML_O33_OBSERVATION_REQUEST) s;
			} 

			else if(s instanceof CQU_I19_MEDICATION_HISTORY){
				CQU_I19_MEDICATION_HISTORY v = (CQU_I19_MEDICATION_HISTORY) s;
			} 

			else if(s instanceof OML_O33_TIMING){
				OML_O33_TIMING v = (OML_O33_TIMING) s;
			} 

			else if(s instanceof OMG_O19_PRIOR_RESULT){
				OMG_O19_PRIOR_RESULT v = (OMG_O19_PRIOR_RESULT) s;
			} 

			else if(s instanceof OML_O33_PATIENT_PRIOR){
				OML_O33_PATIENT_PRIOR v = (OML_O33_PATIENT_PRIOR) s;
			} 

			else if(s instanceof FHS){
				FHS v = (FHS) s;
			} 

			else if(s instanceof ORN_O08_PATIENT){
				ORN_O08_PATIENT v = (ORN_O08_PATIENT) s;
			} 

			else if(s instanceof OML_O39_PATIENT){
				OML_O39_PATIENT v = (OML_O39_PATIENT) s;
			} 

			else if(s instanceof CSU_C09_STUDY_OBSERVATION){
				CSU_C09_STUDY_OBSERVATION v = (CSU_C09_STUDY_OBSERVATION) s;
			} 

			else if(s instanceof OPU_R25_ORDER){
				OPU_R25_ORDER v = (OPU_R25_ORDER) s;
			} 

			else if(s instanceof CCU_I20_PATIENT){
				CCU_I20_PATIENT v = (CCU_I20_PATIENT) s;
			} 

			else if(s instanceof CCI_I22_PATHWAY){
				CCI_I22_PATHWAY v = (CCI_I22_PATHWAY) s;
			} 

			else if(s instanceof RAS_O17_OBSERVATION){
				RAS_O17_OBSERVATION v = (RAS_O17_OBSERVATION) s;
			} 

			else if(s instanceof PPP_PCB_PATIENT_VISIT){
				PPP_PCB_PATIENT_VISIT v = (PPP_PCB_PATIENT_VISIT) s;
			} 

			else if(s instanceof STC_S33){
				STC_S33 v = (STC_S33) s;
			} 

			else if(s instanceof VXU_V04_INSURANCE){
				VXU_V04_INSURANCE v = (VXU_V04_INSURANCE) s;
			} 

			else if(s instanceof MFN_M04_MF_CDM){
				MFN_M04_MF_CDM v = (MFN_M04_MF_CDM) s;
			} 

			else if(s instanceof RRG_O16_PATIENT){
				RRG_O16_PATIENT v = (RRG_O16_PATIENT) s;
			} 

			else if(s instanceof ORA_R41){
				ORA_R41 v = (ORA_R41) s;
			} 

			else if(s instanceof SCD){
				SCD v = (SCD) s;
			} 

			else if(s instanceof ORU_R30_TIMING_QTY){
				ORU_R30_TIMING_QTY v = (ORU_R30_TIMING_QTY) s;
			} 

			else if(s instanceof RDS_O13_OBSERVATION){
				RDS_O13_OBSERVATION v = (RDS_O13_OBSERVATION) s;
			} 

			else if(s instanceof SRR_S01_SCHEDULE){
				SRR_S01_SCHEDULE v = (SRR_S01_SCHEDULE) s;
			} 

			else if(s instanceof SCH){
				SCH v = (SCH) s;
			} 

			else if(s instanceof OML_O33_TIMING_PRIOR){
				OML_O33_TIMING_PRIOR v = (OML_O33_TIMING_PRIOR) s;
			} 

			else if(s instanceof DEL_O46){
				DEL_O46 v = (DEL_O46) s;
			} 

			else if(s instanceof QBP_Qnn){
				QBP_Qnn v = (QBP_Qnn) s;
			} 

			else if(s instanceof RSP_K31_PATIENT_VISIT){
				RSP_K31_PATIENT_VISIT v = (RSP_K31_PATIENT_VISIT) s;
			} 

			else if(s instanceof ORL_O34_ORDER){
				ORL_O34_ORDER v = (ORL_O34_ORDER) s;
			} 


		}

	}

}
