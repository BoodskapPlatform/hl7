package io.boodskap.hl7.v251;

import org.json.JSONObject;

import ca.uhn.hl7v2.HapiContext;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.Structure;
import ca.uhn.hl7v2.model.v251.group.*;
import ca.uhn.hl7v2.model.v251.message.*;
import ca.uhn.hl7v2.model.v251.segment.*;
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

			else if(s instanceof PPT_PCL_PATHWAY_ROLE){
				PPT_PCL_PATHWAY_ROLE v = (PPT_PCL_PATHWAY_ROLE) s;
			} 

			else if(s instanceof OML_O21_TIMING){
				OML_O21_TIMING v = (OML_O21_TIMING) s;
			} 

			else if(s instanceof RGV_O15_OBSERVATION){
				RGV_O15_OBSERVATION v = (RGV_O15_OBSERVATION) s;
			} 

			else if(s instanceof DG1){
				DG1 v = (DG1) s;
			} 

			else if(s instanceof RSP_Z88_QUERY_RESPONSE){
				RSP_Z88_QUERY_RESPONSE v = (RSP_Z88_QUERY_RESPONSE) s;
			} 

			else if(s instanceof PEX_P07_STUDY){
				PEX_P07_STUDY v = (PEX_P07_STUDY) s;
			} 

			else if(s instanceof RQI_I01){
				RQI_I01 v = (RQI_I01) s;
			} 

			else if(s instanceof ADT_AXX_INSURANCE){
				ADT_AXX_INSURANCE v = (ADT_AXX_INSURANCE) s;
			} 

			else if(s instanceof OMI_O23){
				OMI_O23 v = (OMI_O23) s;
			} 

			else if(s instanceof SQR_S25_LOCATION_RESOURCE){
				SQR_S25_LOCATION_RESOURCE v = (SQR_S25_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof PPV_PCA_ORDER_OBSERVATION){
				PPV_PCA_ORDER_OBSERVATION v = (PPV_PCA_ORDER_OBSERVATION) s;
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

			else if(s instanceof OML_O35_PATIENT_PRIOR){
				OML_O35_PATIENT_PRIOR v = (OML_O35_PATIENT_PRIOR) s;
			} 

			else if(s instanceof PPG_PCG_ORDER_DETAIL){
				PPG_PCG_ORDER_DETAIL v = (PPG_PCG_ORDER_DETAIL) s;
			} 

			else if(s instanceof RRE_O12_TIMING_ENCODED){
				RRE_O12_TIMING_ENCODED v = (RRE_O12_TIMING_ENCODED) s;
			} 

			else if(s instanceof RRI_I12_PROCEDURE){
				RRI_I12_PROCEDURE v = (RRI_I12_PROCEDURE) s;
			} 

			else if(s instanceof RRI_I12_RESULTS_NOTES){
				RRI_I12_RESULTS_NOTES v = (RRI_I12_RESULTS_NOTES) s;
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

			else if(s instanceof ORI_O24_ORDER){
				ORI_O24_ORDER v = (ORI_O24_ORDER) s;
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

			else if(s instanceof BRT_O32_TIMING){
				BRT_O32_TIMING v = (BRT_O32_TIMING) s;
			} 

			else if(s instanceof REF_I12_AUTHORIZATION_CONTACT){
				REF_I12_AUTHORIZATION_CONTACT v = (REF_I12_AUTHORIZATION_CONTACT) s;
			} 

			else if(s instanceof ORB_O28_ORDER){
				ORB_O28_ORDER v = (ORB_O28_ORDER) s;
			} 

			else if(s instanceof ADT_A05_INSURANCE){
				ADT_A05_INSURANCE v = (ADT_A05_INSURANCE) s;
			} 

			else if(s instanceof SFT){
				SFT v = (SFT) s;
			} 

			else if(s instanceof BRP_O30_TIMING){
				BRP_O30_TIMING v = (BRP_O30_TIMING) s;
			} 

			else if(s instanceof DFT_P03_FINANCIAL_ORDER){
				DFT_P03_FINANCIAL_ORDER v = (DFT_P03_FINANCIAL_ORDER) s;
			} 

			else if(s instanceof RRD_O14){
				RRD_O14 v = (RRD_O14) s;
			} 

			else if(s instanceof MFN_M05_MF_LOCATION){
				MFN_M05_MF_LOCATION v = (MFN_M05_MF_LOCATION) s;
			} 

			else if(s instanceof RAS_O17_ORDER){
				RAS_O17_ORDER v = (RAS_O17_ORDER) s;
			} 

			else if(s instanceof RSP_Z90_COMMON_ORDER){
				RSP_Z90_COMMON_ORDER v = (RSP_Z90_COMMON_ORDER) s;
			} 

			else if(s instanceof ADT_AXX_PATIENT){
				ADT_AXX_PATIENT v = (ADT_AXX_PATIENT) s;
			} 

			else if(s instanceof PRR_PC5_PATIENT_VISIT){
				PRR_PC5_PATIENT_VISIT v = (PRR_PC5_PATIENT_VISIT) s;
			} 

			else if(s instanceof PPV_PCA_PROBLEM_ROLE){
				PPV_PCA_PROBLEM_ROLE v = (PPV_PCA_PROBLEM_ROLE) s;
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

			else if(s instanceof ORU_R30){
				ORU_R30 v = (ORU_R30) s;
			} 

			else if(s instanceof PRR_PC5_PROBLEM_PATHWAY){
				PRR_PC5_PROBLEM_PATHWAY v = (PRR_PC5_PROBLEM_PATHWAY) s;
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

			else if(s instanceof RAR_RAR){
				RAR_RAR v = (RAR_RAR) s;
			} 

			else if(s instanceof MFR_M07_MF_QUERY){
				MFR_M07_MF_QUERY v = (MFR_M07_MF_QUERY) s;
			} 

			else if(s instanceof BTS_O31){
				BTS_O31 v = (BTS_O31) s;
			} 

			else if(s instanceof OML_O21_OBSERVATION){
				OML_O21_OBSERVATION v = (OML_O21_OBSERVATION) s;
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

			else if(s instanceof SID){
				SID v = (SID) s;
			} 

			else if(s instanceof ORL_O22_SPECIMEN){
				ORL_O22_SPECIMEN v = (ORL_O22_SPECIMEN) s;
			} 

			else if(s instanceof BPS_O29_PRODUCT){
				BPS_O29_PRODUCT v = (BPS_O29_PRODUCT) s;
			} 

			else if(s instanceof ADT_A01_INSURANCE){
				ADT_A01_INSURANCE v = (ADT_A01_INSURANCE) s;
			} 

			else if(s instanceof RRD_O14_DISPENSE){
				RRD_O14_DISPENSE v = (RRD_O14_DISPENSE) s;
			} 

			else if(s instanceof RSP_Z86_QUERY_RESPONSE){
				RSP_Z86_QUERY_RESPONSE v = (RSP_Z86_QUERY_RESPONSE) s;
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

			else if(s instanceof BAR_P05_INSURANCE){
				BAR_P05_INSURANCE v = (BAR_P05_INSURANCE) s;
			} 

			else if(s instanceof RSP_Z88_TIMING_ENCODED){
				RSP_Z88_TIMING_ENCODED v = (RSP_Z88_TIMING_ENCODED) s;
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

			else if(s instanceof BHS){
				BHS v = (BHS) s;
			} 

			else if(s instanceof PPP_PCB_GOAL_ROLE){
				PPP_PCB_GOAL_ROLE v = (PPP_PCB_GOAL_ROLE) s;
			} 

			else if(s instanceof PRR_PC5_ORDER_OBSERVATION){
				PRR_PC5_ORDER_OBSERVATION v = (PRR_PC5_ORDER_OBSERVATION) s;
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

			else if(s instanceof ORL_O34_SPECIMEN){
				ORL_O34_SPECIMEN v = (ORL_O34_SPECIMEN) s;
			} 

			else if(s instanceof RGV_O15_ORDER_DETAIL_SUPPLEMENT){
				RGV_O15_ORDER_DETAIL_SUPPLEMENT v = (RGV_O15_ORDER_DETAIL_SUPPLEMENT) s;
			} 

			else if(s instanceof OUL_R24_CONTAINER){
				OUL_R24_CONTAINER v = (OUL_R24_CONTAINER) s;
			} 

			else if(s instanceof OBR){
				OBR v = (OBR) s;
			} 

			else if(s instanceof OBX){
				OBX v = (OBX) s;
			} 

			else if(s instanceof EAC_U07_COMMAND){
				EAC_U07_COMMAND v = (EAC_U07_COMMAND) s;
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

			else if(s instanceof RER_RER_DEFINITION){
				RER_RER_DEFINITION v = (RER_RER_DEFINITION) s;
			} 

			else if(s instanceof PRR_PC5_PROBLEM){
				PRR_PC5_PROBLEM v = (PRR_PC5_PROBLEM) s;
			} 

			else if(s instanceof RQA_I08_VISIT){
				RQA_I08_VISIT v = (RQA_I08_VISIT) s;
			} 

			else if(s instanceof ORM_O01){
				ORM_O01 v = (ORM_O01) s;
			} 

			else if(s instanceof RPA_I08_INSURANCE){
				RPA_I08_INSURANCE v = (RPA_I08_INSURANCE) s;
			} 

			else if(s instanceof RER_RER_ORDER){
				RER_RER_ORDER v = (RER_RER_ORDER) s;
			} 

			else if(s instanceof ORL_O34_PATIENT){
				ORL_O34_PATIENT v = (ORL_O34_PATIENT) s;
			} 

			else if(s instanceof ORN_O08_TIMING){
				ORN_O08_TIMING v = (ORN_O08_TIMING) s;
			} 

			else if(s instanceof PEX_P07_PEX_CAUSE){
				PEX_P07_PEX_CAUSE v = (PEX_P07_PEX_CAUSE) s;
			} 

			else if(s instanceof RSP_Q11_QUERY_RESULT_CLUSTER){
				RSP_Q11_QUERY_RESULT_CLUSTER v = (RSP_Q11_QUERY_RESULT_CLUSTER) s;
			} 

			else if(s instanceof OMP_O09_INSURANCE){
				OMP_O09_INSURANCE v = (OMP_O09_INSURANCE) s;
			} 

			else if(s instanceof RDE_O11){
				RDE_O11 v = (RDE_O11) s;
			} 

			else if(s instanceof PPG_PCG_ORDER){
				PPG_PCG_ORDER v = (PPG_PCG_ORDER) s;
			} 

			else if(s instanceof ORL_O34_OBSERVATION_REQUEST){
				ORL_O34_OBSERVATION_REQUEST v = (ORL_O34_OBSERVATION_REQUEST) s;
			} 

			else if(s instanceof OML_O35_INSURANCE){
				OML_O35_INSURANCE v = (OML_O35_INSURANCE) s;
			} 

			else if(s instanceof ORF_R04_QUERY_RESPONSE){
				ORF_R04_QUERY_RESPONSE v = (ORF_R04_QUERY_RESPONSE) s;
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

			else if(s instanceof OUL_R21){
				OUL_R21 v = (OUL_R21) s;
			} 

			else if(s instanceof PPT_PCL_ORDER_DETAIL){
				PPT_PCL_ORDER_DETAIL v = (PPT_PCL_ORDER_DETAIL) s;
			} 

			else if(s instanceof RDE_O11_TIMING_ENCODED){
				RDE_O11_TIMING_ENCODED v = (RDE_O11_TIMING_ENCODED) s;
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

			else if(s instanceof ORM_O01_OBSERVATION){
				ORM_O01_OBSERVATION v = (ORM_O01_OBSERVATION) s;
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

			else if(s instanceof BPS_O29_ORDER){
				BPS_O29_ORDER v = (BPS_O29_ORDER) s;
			} 

			else if(s instanceof RSP_Z82_TREATMENT){
				RSP_Z82_TREATMENT v = (RSP_Z82_TREATMENT) s;
			} 

			else if(s instanceof FT1){
				FT1 v = (FT1) s;
			} 

			else if(s instanceof OUL_R22_TIMING_QTY){
				OUL_R22_TIMING_QTY v = (OUL_R22_TIMING_QTY) s;
			} 

			else if(s instanceof DFT_P03_FINANCIAL_TIMING_QUANTITY){
				DFT_P03_FINANCIAL_TIMING_QUANTITY v = (DFT_P03_FINANCIAL_TIMING_QUANTITY) s;
			} 

			else if(s instanceof ORU_R01_VISIT){
				ORU_R01_VISIT v = (ORU_R01_VISIT) s;
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

			else if(s instanceof PPG_PCG_PATHWAY_ROLE){
				PPG_PCG_PATHWAY_ROLE v = (PPG_PCG_PATHWAY_ROLE) s;
			} 

			else if(s instanceof REF_I12_PROCEDURE){
				REF_I12_PROCEDURE v = (REF_I12_PROCEDURE) s;
			} 

			else if(s instanceof OMP_O09_TIMING){
				OMP_O09_TIMING v = (OMP_O09_TIMING) s;
			} 

			else if(s instanceof ORU_R01){
				ORU_R01 v = (ORU_R01) s;
			} 

			else if(s instanceof RRG_O16_TIMING){
				RRG_O16_TIMING v = (RRG_O16_TIMING) s;
			} 

			else if(s instanceof DFT_P11_OBSERVATION){
				DFT_P11_OBSERVATION v = (DFT_P11_OBSERVATION) s;
			} 

			else if(s instanceof NMR_N01){
				NMR_N01 v = (NMR_N01) s;
			} 

			else if(s instanceof BLC){
				BLC v = (BLC) s;
			} 

			else if(s instanceof EAR_U08){
				EAR_U08 v = (EAR_U08) s;
			} 

			else if(s instanceof BLG){
				BLG v = (BLG) s;
			} 

			else if(s instanceof RSP_Z86_DISPENSE){
				RSP_Z86_DISPENSE v = (RSP_Z86_DISPENSE) s;
			} 

			else if(s instanceof PRR_PC5_GOAL){
				PRR_PC5_GOAL v = (PRR_PC5_GOAL) s;
			} 

			else if(s instanceof FTS){
				FTS v = (FTS) s;
			} 

			else if(s instanceof ADT_A61){
				ADT_A61 v = (ADT_A61) s;
			} 

			else if(s instanceof OML_O35_TIMING){
				OML_O35_TIMING v = (OML_O35_TIMING) s;
			} 

			else if(s instanceof SQR_S25){
				SQR_S25 v = (SQR_S25) s;
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

			else if(s instanceof DFT_P11_FINANCIAL_TIMING_QUANTITY){
				DFT_P11_FINANCIAL_TIMING_QUANTITY v = (DFT_P11_FINANCIAL_TIMING_QUANTITY) s;
			} 

			else if(s instanceof PGL_PC6_PROBLEM_ROLE){
				PGL_PC6_PROBLEM_ROLE v = (PGL_PC6_PROBLEM_ROLE) s;
			} 

			else if(s instanceof BTS_O31_PATIENT_VISIT){
				BTS_O31_PATIENT_VISIT v = (BTS_O31_PATIENT_VISIT) s;
			} 

			else if(s instanceof ADR_A19){
				ADR_A19 v = (ADR_A19) s;
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

			else if(s instanceof ORF_R04){
				ORF_R04 v = (ORF_R04) s;
			} 

			else if(s instanceof ORR_O02_RESPONSE){
				ORR_O02_RESPONSE v = (ORR_O02_RESPONSE) s;
			} 

			else if(s instanceof SRM_S01){
				SRM_S01 v = (SRM_S01) s;
			} 

			else if(s instanceof OUL_R23_SPECIMEN){
				OUL_R23_SPECIMEN v = (OUL_R23_SPECIMEN) s;
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

			else if(s instanceof SQM_S25_PERSONNEL_RESOURCE){
				SQM_S25_PERSONNEL_RESOURCE v = (SQM_S25_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof MFQ_M01){
				MFQ_M01 v = (MFQ_M01) s;
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

			else if(s instanceof BAR_P01_VISIT){
				BAR_P01_VISIT v = (BAR_P01_VISIT) s;
			} 

			else if(s instanceof DFT_P11_INSURANCE){
				DFT_P11_INSURANCE v = (DFT_P11_INSURANCE) s;
			} 

			else if(s instanceof DFT_P03_FINANCIAL_PROCEDURE){
				DFT_P03_FINANCIAL_PROCEDURE v = (DFT_P03_FINANCIAL_PROCEDURE) s;
			} 

			else if(s instanceof RGR_RGR_PATIENT){
				RGR_RGR_PATIENT v = (RGR_RGR_PATIENT) s;
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

			else if(s instanceof SPR){
				SPR v = (SPR) s;
			} 

			else if(s instanceof DFT_P03_ORDER){
				DFT_P03_ORDER v = (DFT_P03_ORDER) s;
			} 

			else if(s instanceof DSC){
				DSC v = (DSC) s;
			} 

			else if(s instanceof QSB_Q16){
				QSB_Q16 v = (QSB_Q16) s;
			} 

			else if(s instanceof DSP){
				DSP v = (DSP) s;
			} 

			else if(s instanceof VXR_V03_TIMING){
				VXR_V03_TIMING v = (VXR_V03_TIMING) s;
			} 

			else if(s instanceof DFT_P11){
				DFT_P11 v = (DFT_P11) s;
			} 

			else if(s instanceof RGV_O15_TIMING){
				RGV_O15_TIMING v = (RGV_O15_TIMING) s;
			} 

			else if(s instanceof NMQ_N01){
				NMQ_N01 v = (NMQ_N01) s;
			} 

			else if(s instanceof ORP_O10){
				ORP_O10 v = (ORP_O10) s;
			} 

			else if(s instanceof OUL_R23_PATIENT){
				OUL_R23_PATIENT v = (OUL_R23_PATIENT) s;
			} 

			else if(s instanceof ORM_O01_PATIENT_VISIT){
				ORM_O01_PATIENT_VISIT v = (ORM_O01_PATIENT_VISIT) s;
			} 

			else if(s instanceof RDS_O13_ORDER_DETAIL){
				RDS_O13_ORDER_DETAIL v = (RDS_O13_ORDER_DETAIL) s;
			} 

			else if(s instanceof RRG_O16){
				RRG_O16 v = (RRG_O16) s;
			} 

			else if(s instanceof BPO){
				BPO v = (BPO) s;
			} 

			else if(s instanceof ORL_O36_RESPONSE){
				ORL_O36_RESPONSE v = (ORL_O36_RESPONSE) s;
			} 

			else if(s instanceof PPR_PC1_PATHWAY){
				PPR_PC1_PATHWAY v = (PPR_PC1_PATHWAY) s;
			} 

			else if(s instanceof DFT_P03){
				DFT_P03 v = (DFT_P03) s;
			} 

			else if(s instanceof RAS_O17_ADMINISTRATION){
				RAS_O17_ADMINISTRATION v = (RAS_O17_ADMINISTRATION) s;
			} 

			else if(s instanceof PTR_PCF_PATHWAY_ROLE){
				PTR_PCF_PATHWAY_ROLE v = (PTR_PCF_PATHWAY_ROLE) s;
			} 

			else if(s instanceof BAR_P10_PROCEDURE){
				BAR_P10_PROCEDURE v = (BAR_P10_PROCEDURE) s;
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

			else if(s instanceof OUL_R21_CONTAINER){
				OUL_R21_CONTAINER v = (OUL_R21_CONTAINER) s;
			} 

			else if(s instanceof MFE){
				MFE v = (MFE) s;
			} 

			else if(s instanceof MFI){
				MFI v = (MFI) s;
			} 

			else if(s instanceof BAR_P05_VISIT){
				BAR_P05_VISIT v = (BAR_P05_VISIT) s;
			} 

			else if(s instanceof PTR_PCF_PROBLEM_ROLE){
				PTR_PCF_PROBLEM_ROLE v = (PTR_PCF_PROBLEM_ROLE) s;
			} 

			else if(s instanceof REF_I12){
				REF_I12 v = (REF_I12) s;
			} 

			else if(s instanceof RSP_Z86_TIMING_ENCODED){
				RSP_Z86_TIMING_ENCODED v = (RSP_Z86_TIMING_ENCODED) s;
			} 

			else if(s instanceof PTR_PCF_GOAL_OBSERVATION){
				PTR_PCF_GOAL_OBSERVATION v = (PTR_PCF_GOAL_OBSERVATION) s;
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

			else if(s instanceof RRI_I12_PATIENT_VISIT){
				RRI_I12_PATIENT_VISIT v = (RRI_I12_PATIENT_VISIT) s;
			} 

			else if(s instanceof EAC_U07_SPECIMEN_CONTAINER){
				EAC_U07_SPECIMEN_CONTAINER v = (EAC_U07_SPECIMEN_CONTAINER) s;
			} 

			else if(s instanceof EDR_R07){
				EDR_R07 v = (EDR_R07) s;
			} 

			else if(s instanceof RPI_I04){
				RPI_I04 v = (RPI_I04) s;
			} 

			else if(s instanceof ORG_O20_TIMING){
				ORG_O20_TIMING v = (ORG_O20_TIMING) s;
			} 

			else if(s instanceof MFN_M09_MF_TEST_CAT_DETAIL){
				MFN_M09_MF_TEST_CAT_DETAIL v = (MFN_M09_MF_TEST_CAT_DETAIL) s;
			} 

			else if(s instanceof OMD_O03_TIMING_DIET){
				OMD_O03_TIMING_DIET v = (OMD_O03_TIMING_DIET) s;
			} 

			else if(s instanceof MFN_M11_MF_TEST_CALCULATED){
				MFN_M11_MF_TEST_CALCULATED v = (MFN_M11_MF_TEST_CALCULATED) s;
			} 

			else if(s instanceof ADT_AXX_PROCEDURE){
				ADT_AXX_PROCEDURE v = (ADT_AXX_PROCEDURE) s;
			} 

			else if(s instanceof BTS_O31_ORDER){
				BTS_O31_ORDER v = (BTS_O31_ORDER) s;
			} 

			else if(s instanceof DSR_Q03){
				DSR_Q03 v = (DSR_Q03) s;
			} 

			else if(s instanceof SQM_S25){
				SQM_S25 v = (SQM_S25) s;
			} 

			else if(s instanceof STF){
				STF v = (STF) s;
			} 

			else if(s instanceof QPD){
				QPD v = (QPD) s;
			} 

			else if(s instanceof PPR_PC1_PROBLEM){
				PPR_PC1_PROBLEM v = (PPR_PC1_PROBLEM) s;
			} 

			else if(s instanceof PEX_P07_ASSOCIATED_RX_ORDER){
				PEX_P07_ASSOCIATED_RX_ORDER v = (PEX_P07_ASSOCIATED_RX_ORDER) s;
			} 

			else if(s instanceof DSR_Q01){
				DSR_Q01 v = (DSR_Q01) s;
			} 

			else if(s instanceof ORU_R01_SPECIMEN){
				ORU_R01_SPECIMEN v = (ORU_R01_SPECIMEN) s;
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

			else if(s instanceof PGL_PC6_GOAL_ROLE){
				PGL_PC6_GOAL_ROLE v = (PGL_PC6_GOAL_ROLE) s;
			} 

			else if(s instanceof RRA_O18){
				RRA_O18 v = (RRA_O18) s;
			} 

			else if(s instanceof OM2){
				OM2 v = (OM2) s;
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

			else if(s instanceof OM7){
				OM7 v = (OM7) s;
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

			else if(s instanceof DFT_P03_TIMING_QUANTITY){
				DFT_P03_TIMING_QUANTITY v = (DFT_P03_TIMING_QUANTITY) s;
			} 

			else if(s instanceof QRY_A19){
				QRY_A19 v = (QRY_A19) s;
			} 

			else if(s instanceof PPV_PCA){
				PPV_PCA v = (PPV_PCA) s;
			} 

			else if(s instanceof OMB_O27_OBSERVATION){
				OMB_O27_OBSERVATION v = (OMB_O27_OBSERVATION) s;
			} 

			else if(s instanceof ADT_A03){
				ADT_A03 v = (ADT_A03) s;
			} 

			else if(s instanceof DOC_T12){
				DOC_T12 v = (DOC_T12) s;
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

			else if(s instanceof MFK_M01){
				MFK_M01 v = (MFK_M01) s;
			} 

			else if(s instanceof PPR_PC1_GOAL_ROLE){
				PPR_PC1_GOAL_ROLE v = (PPR_PC1_GOAL_ROLE) s;
			} 

			else if(s instanceof BRT_O32){
				BRT_O32 v = (BRT_O32) s;
			} 

			else if(s instanceof OUL_R22_SPECIMEN){
				OUL_R22_SPECIMEN v = (OUL_R22_SPECIMEN) s;
			} 

			else if(s instanceof ADT_A18){
				ADT_A18 v = (ADT_A18) s;
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

			else if(s instanceof QCK_Q02){
				QCK_Q02 v = (QCK_Q02) s;
			} 

			else if(s instanceof ORB_O28_TIMING){
				ORB_O28_TIMING v = (ORB_O28_TIMING) s;
			} 

			else if(s instanceof RDS_O13_TIMING_ENCODED){
				RDS_O13_TIMING_ENCODED v = (RDS_O13_TIMING_ENCODED) s;
			} 

			else if(s instanceof ORL_O22_RESPONSE){
				ORL_O22_RESPONSE v = (ORL_O22_RESPONSE) s;
			} 

			else if(s instanceof TCU_U10_TEST_CONFIGURATION){
				TCU_U10_TEST_CONFIGURATION v = (TCU_U10_TEST_CONFIGURATION) s;
			} 

			else if(s instanceof ADT_A15){
				ADT_A15 v = (ADT_A15) s;
			} 

			else if(s instanceof ORL_O36_SPECIMEN_CONTAINER){
				ORL_O36_SPECIMEN_CONTAINER v = (ORL_O36_SPECIMEN_CONTAINER) s;
			} 

			else if(s instanceof ADT_A12){
				ADT_A12 v = (ADT_A12) s;
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

			else if(s instanceof RRE_O12_TIMING){
				RRE_O12_TIMING v = (RRE_O12_TIMING) s;
			} 

			else if(s instanceof QRF){
				QRF v = (QRF) s;
			} 

			else if(s instanceof BTX){
				BTX v = (BTX) s;
			} 

			else if(s instanceof OML_O33_PATIENT){
				OML_O33_PATIENT v = (OML_O33_PATIENT) s;
			} 

			else if(s instanceof ADR_A19_QUERY_RESPONSE){
				ADR_A19_QUERY_RESPONSE v = (ADR_A19_QUERY_RESPONSE) s;
			} 

			else if(s instanceof QRI){
				QRI v = (QRI) s;
			} 

			else if(s instanceof PPG_PCG_PROBLEM){
				PPG_PCG_PROBLEM v = (PPG_PCG_PROBLEM) s;
			} 

			else if(s instanceof RSP_Z86_PATIENT){
				RSP_Z86_PATIENT v = (RSP_Z86_PATIENT) s;
			} 

			else if(s instanceof PPV_PCA_PROBLEM){
				PPV_PCA_PROBLEM v = (PPV_PCA_PROBLEM) s;
			} 

			else if(s instanceof PPV_PCA_GOAL_OBSERVATION){
				PPV_PCA_GOAL_OBSERVATION v = (PPV_PCA_GOAL_OBSERVATION) s;
			} 

			else if(s instanceof RPA_I08_PROCEDURE){
				RPA_I08_PROCEDURE v = (RPA_I08_PROCEDURE) s;
			} 

			else if(s instanceof ORL_O34_TIMING){
				ORL_O34_TIMING v = (ORL_O34_TIMING) s;
			} 

			else if(s instanceof ORS_O06_PATIENT){
				ORS_O06_PATIENT v = (ORS_O06_PATIENT) s;
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

			else if(s instanceof QRY){
				QRY v = (QRY) s;
			} 

			else if(s instanceof PPT_PCL_PROBLEM_OBSERVATION){
				PPT_PCL_PROBLEM_OBSERVATION v = (PPT_PCL_PROBLEM_OBSERVATION) s;
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

			else if(s instanceof OSR_Q06_ORDER){
				OSR_Q06_ORDER v = (OSR_Q06_ORDER) s;
			} 

			else if(s instanceof RSP_Z82_QUERY_RESPONSE){
				RSP_Z82_QUERY_RESPONSE v = (RSP_Z82_QUERY_RESPONSE) s;
			} 

			else if(s instanceof TBR_R08){
				TBR_R08 v = (TBR_R08) s;
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

			else if(s instanceof VXX_V02){
				VXX_V02 v = (VXX_V02) s;
			} 

			else if(s instanceof SRR_S01){
				SRR_S01 v = (SRR_S01) s;
			} 

			else if(s instanceof OML_O21_INSURANCE){
				OML_O21_INSURANCE v = (OML_O21_INSURANCE) s;
			} 

			else if(s instanceof RCI_I05_OBSERVATION){
				RCI_I05_OBSERVATION v = (RCI_I05_OBSERVATION) s;
			} 

			else if(s instanceof REF_I12_PROVIDER_CONTACT){
				REF_I12_PROVIDER_CONTACT v = (REF_I12_PROVIDER_CONTACT) s;
			} 

			else if(s instanceof ORI_O24_PATIENT){
				ORI_O24_PATIENT v = (ORI_O24_PATIENT) s;
			} 

			else if(s instanceof RSP_Z90_SPECIMEN){
				RSP_Z90_SPECIMEN v = (RSP_Z90_SPECIMEN) s;
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

			else if(s instanceof OML_O33_PATIENT_VISIT){
				OML_O33_PATIENT_VISIT v = (OML_O33_PATIENT_VISIT) s;
			} 

			else if(s instanceof RSP_Z88_VISIT){
				RSP_Z88_VISIT v = (RSP_Z88_VISIT) s;
			} 

			else if(s instanceof ORR_O02){
				ORR_O02 v = (ORR_O02) s;
			} 

			else if(s instanceof SRR_S01_GENERAL_RESOURCE){
				SRR_S01_GENERAL_RESOURCE v = (SRR_S01_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof RRI_I12_PROVIDER_CONTACT){
				RRI_I12_PROVIDER_CONTACT v = (RRI_I12_PROVIDER_CONTACT) s;
			} 

			else if(s instanceof MFN_M03_MF_TEST){
				MFN_M03_MF_TEST v = (MFN_M03_MF_TEST) s;
			} 

			else if(s instanceof PRR_PC5_PATIENT){
				PRR_PC5_PATIENT v = (PRR_PC5_PATIENT) s;
			} 

			else if(s instanceof PRR_PC5_PROBLEM_OBSERVATION){
				PRR_PC5_PROBLEM_OBSERVATION v = (PRR_PC5_PROBLEM_OBSERVATION) s;
			} 

			else if(s instanceof RSP_K31_ORDER){
				RSP_K31_ORDER v = (RSP_K31_ORDER) s;
			} 

			else if(s instanceof ADT_A43){
				ADT_A43 v = (ADT_A43) s;
			} 

			else if(s instanceof RAS_O17){
				RAS_O17 v = (RAS_O17) s;
			} 

			else if(s instanceof ADT_A45){
				ADT_A45 v = (ADT_A45) s;
			} 

			else if(s instanceof ADT_A50){
				ADT_A50 v = (ADT_A50) s;
			} 

			else if(s instanceof ORP_O10_PATIENT){
				ORP_O10_PATIENT v = (ORP_O10_PATIENT) s;
			} 

			else if(s instanceof RQA_I08_RESULTS){
				RQA_I08_RESULTS v = (RQA_I08_RESULTS) s;
			} 

			else if(s instanceof ESU_U01){
				ESU_U01 v = (ESU_U01) s;
			} 

			else if(s instanceof QRY_R02){
				QRY_R02 v = (QRY_R02) s;
			} 

			else if(s instanceof ADT_A54){
				ADT_A54 v = (ADT_A54) s;
			} 

			else if(s instanceof PPP_PCB_GOAL_OBSERVATION){
				PPP_PCB_GOAL_OBSERVATION v = (PPP_PCB_GOAL_OBSERVATION) s;
			} 

			else if(s instanceof ADT_A52){
				ADT_A52 v = (ADT_A52) s;
			} 

			else if(s instanceof OMG_O19_TIMING_PRIOR){
				OMG_O19_TIMING_PRIOR v = (OMG_O19_TIMING_PRIOR) s;
			} 

			else if(s instanceof PPT_PCL_GOAL_OBSERVATION){
				PPT_PCL_GOAL_OBSERVATION v = (PPT_PCL_GOAL_OBSERVATION) s;
			} 

			else if(s instanceof ORC){
				ORC v = (ORC) s;
			} 

			else if(s instanceof OMS_O05_TIMING){
				OMS_O05_TIMING v = (OMS_O05_TIMING) s;
			} 

			else if(s instanceof RQC_I05_PROVIDER){
				RQC_I05_PROVIDER v = (RQC_I05_PROVIDER) s;
			} 

			else if(s instanceof ORG){
				ORG v = (ORG) s;
			} 

			else if(s instanceof RQP_I04_PROVIDER){
				RQP_I04_PROVIDER v = (RQP_I04_PROVIDER) s;
			} 

			else if(s instanceof RSP_Z88_COMPONENT){
				RSP_Z88_COMPONENT v = (RSP_Z88_COMPONENT) s;
			} 

			else if(s instanceof OMB_O27_TIMING){
				OMB_O27_TIMING v = (OMB_O27_TIMING) s;
			} 

			else if(s instanceof OMN_O07_PATIENT){
				OMN_O07_PATIENT v = (OMN_O07_PATIENT) s;
			} 

			else if(s instanceof RQQ_Q09){
				RQQ_Q09 v = (RQQ_Q09) s;
			} 

			else if(s instanceof ADR_A19_PROCEDURE){
				ADR_A19_PROCEDURE v = (ADR_A19_PROCEDURE) s;
			} 

			else if(s instanceof PPP_PCB_PROBLEM_ROLE){
				PPP_PCB_PROBLEM_ROLE v = (PPP_PCB_PROBLEM_ROLE) s;
			} 

			else if(s instanceof ADT_A21){
				ADT_A21 v = (ADT_A21) s;
			} 

			else if(s instanceof OML_O35_PATIENT_VISIT){
				OML_O35_PATIENT_VISIT v = (OML_O35_PATIENT_VISIT) s;
			} 

			else if(s instanceof ORN_O08_RESPONSE){
				ORN_O08_RESPONSE v = (ORN_O08_RESPONSE) s;
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

			else if(s instanceof DFT_P11_FINANCIAL_OBSERVATION){
				DFT_P11_FINANCIAL_OBSERVATION v = (DFT_P11_FINANCIAL_OBSERVATION) s;
			} 

			else if(s instanceof OMN_O07){
				OMN_O07 v = (OMN_O07) s;
			} 

			else if(s instanceof PPR_PC1_ORDER_DETAIL){
				PPR_PC1_ORDER_DETAIL v = (PPR_PC1_ORDER_DETAIL) s;
			} 

			else if(s instanceof SSU_U03){
				SSU_U03 v = (SSU_U03) s;
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

			else if(s instanceof RDS_O13_ENCODING){
				RDS_O13_ENCODING v = (RDS_O13_ENCODING) s;
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

			else if(s instanceof MFN_M10_MF_TEST_BATT_DETAIL){
				MFN_M10_MF_TEST_BATT_DETAIL v = (MFN_M10_MF_TEST_BATT_DETAIL) s;
			} 

			else if(s instanceof PGL_PC6_PATIENT_VISIT){
				PGL_PC6_PATIENT_VISIT v = (PGL_PC6_PATIENT_VISIT) s;
			} 

			else if(s instanceof ADT_A30){
				ADT_A30 v = (ADT_A30) s;
			} 

			else if(s instanceof PRR_PC5){
				PRR_PC5 v = (PRR_PC5) s;
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

			else if(s instanceof SUR_P09_FACILITY){
				SUR_P09_FACILITY v = (SUR_P09_FACILITY) s;
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

			else if(s instanceof SRR_S01_PERSONNEL_RESOURCE){
				SRR_S01_PERSONNEL_RESOURCE v = (SRR_S01_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof OUL_R21_PATIENT){
				OUL_R21_PATIENT v = (OUL_R21_PATIENT) s;
			} 

			else if(s instanceof OMP_O09_COMPONENT){
				OMP_O09_COMPONENT v = (OMP_O09_COMPONENT) s;
			} 

			else if(s instanceof CSU_C09_PATIENT){
				CSU_C09_PATIENT v = (CSU_C09_PATIENT) s;
			} 

			else if(s instanceof MFN_Znn){
				MFN_Znn v = (MFN_Znn) s;
			} 

			else if(s instanceof OUL_R22_RESULT){
				OUL_R22_RESULT v = (OUL_R22_RESULT) s;
			} 

			else if(s instanceof RSP_Z90_QUERY_RESPONSE){
				RSP_Z90_QUERY_RESPONSE v = (RSP_Z90_QUERY_RESPONSE) s;
			} 

			else if(s instanceof DFT_P03_OBSERVATION){
				DFT_P03_OBSERVATION v = (DFT_P03_OBSERVATION) s;
			} 

			else if(s instanceof RAS_O17_PATIENT){
				RAS_O17_PATIENT v = (RAS_O17_PATIENT) s;
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

			else if(s instanceof RGV_O15_TIMING_GIVE){
				RGV_O15_TIMING_GIVE v = (RGV_O15_TIMING_GIVE) s;
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

			else if(s instanceof OVR){
				OVR v = (OVR) s;
			} 

			else if(s instanceof SIU_S12_PATIENT){
				SIU_S12_PATIENT v = (SIU_S12_PATIENT) s;
			} 

			else if(s instanceof ORG_O20_SPECIMEN){
				ORG_O20_SPECIMEN v = (ORG_O20_SPECIMEN) s;
			} 

			else if(s instanceof OSR_Q06_TIMING){
				OSR_Q06_TIMING v = (OSR_Q06_TIMING) s;
			} 

			else if(s instanceof SQM_S25_LOCATION_RESOURCE){
				SQM_S25_LOCATION_RESOURCE v = (SQM_S25_LOCATION_RESOURCE) s;
			} 

			else if(s instanceof RSP_Z90_PATIENT){
				RSP_Z90_PATIENT v = (RSP_Z90_PATIENT) s;
			} 

			else if(s instanceof RDS_O13){
				RDS_O13 v = (RDS_O13) s;
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

			else if(s instanceof RAR_RAR_ENCODING){
				RAR_RAR_ENCODING v = (RAR_RAR_ENCODING) s;
			} 

			else if(s instanceof MFN_M15_MF_INV_ITEM){
				MFN_M15_MF_INV_ITEM v = (MFN_M15_MF_INV_ITEM) s;
			} 

			else if(s instanceof ADT_A16_PROCEDURE){
				ADT_A16_PROCEDURE v = (ADT_A16_PROCEDURE) s;
			} 

			else if(s instanceof MFR_M05_MF_QUERY){
				MFR_M05_MF_QUERY v = (MFR_M05_MF_QUERY) s;
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

			else if(s instanceof VQQ_Q07){
				VQQ_Q07 v = (VQQ_Q07) s;
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

			else if(s instanceof PPR_PC1_GOAL_OBSERVATION){
				PPR_PC1_GOAL_OBSERVATION v = (PPR_PC1_GOAL_OBSERVATION) s;
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

			else if(s instanceof OML_O35_OBSERVATION_REQUEST){
				OML_O35_OBSERVATION_REQUEST v = (OML_O35_OBSERVATION_REQUEST) s;
			} 

			else if(s instanceof EDU){
				EDU v = (EDU) s;
			} 

			else if(s instanceof MFN_M11_MF_TEST_CALC_DETAIL){
				MFN_M11_MF_TEST_CALC_DETAIL v = (MFN_M11_MF_TEST_CALC_DETAIL) s;
			} 

			else if(s instanceof RAS_O17_ENCODING){
				RAS_O17_ENCODING v = (RAS_O17_ENCODING) s;
			} 

			else if(s instanceof ORU_R30_VISIT){
				ORU_R30_VISIT v = (ORU_R30_VISIT) s;
			} 

			else if(s instanceof ORB_O28){
				ORB_O28 v = (ORB_O28) s;
			} 

			else if(s instanceof BRT_O32_ORDER){
				BRT_O32_ORDER v = (BRT_O32_ORDER) s;
			} 

			else if(s instanceof BTS_O31_PATIENT){
				BTS_O31_PATIENT v = (BTS_O31_PATIENT) s;
			} 

			else if(s instanceof IN2){
				IN2 v = (IN2) s;
			} 

			else if(s instanceof OML_O35){
				OML_O35 v = (OML_O35) s;
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

			else if(s instanceof PRR_PC5_PROBLEM_ROLE){
				PRR_PC5_PROBLEM_ROLE v = (PRR_PC5_PROBLEM_ROLE) s;
			} 

			else if(s instanceof TCC){
				TCC v = (TCC) s;
			} 

			else if(s instanceof RSP_Z82_TIMING){
				RSP_Z82_TIMING v = (RSP_Z82_TIMING) s;
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

			else if(s instanceof VXR_V03_INSURANCE){
				VXR_V03_INSURANCE v = (VXR_V03_INSURANCE) s;
			} 

			else if(s instanceof PPP_PCB_PATHWAY){
				PPP_PCB_PATHWAY v = (PPP_PCB_PATHWAY) s;
			} 

			else if(s instanceof OMD_O03_PATIENT){
				OMD_O03_PATIENT v = (OMD_O03_PATIENT) s;
			} 

			else if(s instanceof INV){
				INV v = (INV) s;
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

			else if(s instanceof RAS_O17_ORDER_DETAIL_SUPPLEMENT){
				RAS_O17_ORDER_DETAIL_SUPPLEMENT v = (RAS_O17_ORDER_DETAIL_SUPPLEMENT) s;
			} 

			else if(s instanceof PGL_PC6){
				PGL_PC6 v = (PGL_PC6) s;
			} 

			else if(s instanceof OML_O21_OBSERVATION_PRIOR){
				OML_O21_OBSERVATION_PRIOR v = (OML_O21_OBSERVATION_PRIOR) s;
			} 

			else if(s instanceof BRP_O30){
				BRP_O30 v = (BRP_O30) s;
			} 

			else if(s instanceof OML_O21){
				OML_O21 v = (OML_O21) s;
			} 

			else if(s instanceof LSU_U12){
				LSU_U12 v = (LSU_U12) s;
			} 

			else if(s instanceof ORM_O01_PATIENT){
				ORM_O01_PATIENT v = (ORM_O01_PATIENT) s;
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

			else if(s instanceof OML_O35_SPECIMEN){
				OML_O35_SPECIMEN v = (OML_O35_SPECIMEN) s;
			} 

			else if(s instanceof OMB_O27){
				OMB_O27 v = (OMB_O27) s;
			} 

			else if(s instanceof CDM){
				CDM v = (CDM) s;
			} 

			else if(s instanceof OMP_O09){
				OMP_O09 v = (OMP_O09) s;
			} 

			else if(s instanceof ADT_A03_INSURANCE){
				ADT_A03_INSURANCE v = (ADT_A03_INSURANCE) s;
			} 

			else if(s instanceof RAR_RAR_PATIENT){
				RAR_RAR_PATIENT v = (RAR_RAR_PATIENT) s;
			} 

			else if(s instanceof PPR_PC1){
				PPR_PC1 v = (PPR_PC1) s;
			} 

			else if(s instanceof OSR_Q06){
				OSR_Q06 v = (OSR_Q06) s;
			} 

			else if(s instanceof RGV_O15_GIVE){
				RGV_O15_GIVE v = (RGV_O15_GIVE) s;
			} 

			else if(s instanceof OUL_R23_RESULT){
				OUL_R23_RESULT v = (OUL_R23_RESULT) s;
			} 

			else if(s instanceof OMD_O03_PATIENT_VISIT){
				OMD_O03_PATIENT_VISIT v = (OMD_O03_PATIENT_VISIT) s;
			} 

			else if(s instanceof MFN_Znn_MF_SITE_DEFINED){
				MFN_Znn_MF_SITE_DEFINED v = (MFN_Znn_MF_SITE_DEFINED) s;
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

			else if(s instanceof ADR_A19_INSURANCE){
				ADR_A19_INSURANCE v = (ADR_A19_INSURANCE) s;
			} 

			else if(s instanceof RRI_I12_AUTHORIZATION_CONTACT){
				RRI_I12_AUTHORIZATION_CONTACT v = (RRI_I12_AUTHORIZATION_CONTACT) s;
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

			else if(s instanceof RQP_I04){
				RQP_I04 v = (RQP_I04) s;
			} 

			else if(s instanceof PPV_PCA_GOAL){
				PPV_PCA_GOAL v = (PPV_PCA_GOAL) s;
			} 

			else if(s instanceof RCP){
				RCP v = (RCP) s;
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

			else if(s instanceof ISD){
				ISD v = (ISD) s;
			} 

			else if(s instanceof OML_O21_OBSERVATION_REQUEST){
				OML_O21_OBSERVATION_REQUEST v = (OML_O21_OBSERVATION_REQUEST) s;
			} 

			else if(s instanceof QBP_Q11){
				QBP_Q11 v = (QBP_Q11) s;
			} 

			else if(s instanceof PTR_PCF_PATIENT_VISIT){
				PTR_PCF_PATIENT_VISIT v = (PTR_PCF_PATIENT_VISIT) s;
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

			else if(s instanceof GP2){
				GP2 v = (GP2) s;
			} 

			else if(s instanceof GP1){
				GP1 v = (GP1) s;
			} 

			else if(s instanceof ACK){
				ACK v = (ACK) s;
			} 

			else if(s instanceof RGV_O15_PATIENT){
				RGV_O15_PATIENT v = (RGV_O15_PATIENT) s;
			} 

			else if(s instanceof ROR_ROR_PATIENT){
				ROR_ROR_PATIENT v = (ROR_ROR_PATIENT) s;
			} 

			else if(s instanceof REF_I12_RESULTS_NOTES){
				REF_I12_RESULTS_NOTES v = (REF_I12_RESULTS_NOTES) s;
			} 

			else if(s instanceof OMI_O23_INSURANCE){
				OMI_O23_INSURANCE v = (OMI_O23_INSURANCE) s;
			} 

			else if(s instanceof OML_O33_ORDER){
				OML_O33_ORDER v = (OML_O33_ORDER) s;
			} 

			else if(s instanceof ORS_O06_RESPONSE){
				ORS_O06_RESPONSE v = (ORS_O06_RESPONSE) s;
			} 

			else if(s instanceof QBP_Q21){
				QBP_Q21 v = (QBP_Q21) s;
			} 

			else if(s instanceof RF1){
				RF1 v = (RF1) s;
			} 

			else if(s instanceof RSP_Z86_TIMING){
				RSP_Z86_TIMING v = (RSP_Z86_TIMING) s;
			} 

			else if(s instanceof ADD){
				ADD v = (ADD) s;
			} 

			else if(s instanceof RAS_O17_TIMING_ENCODED){
				RAS_O17_TIMING_ENCODED v = (RAS_O17_TIMING_ENCODED) s;
			} 

			else if(s instanceof PTR_PCF_ORDER_OBSERVATION){
				PTR_PCF_ORDER_OBSERVATION v = (PTR_PCF_ORDER_OBSERVATION) s;
			} 

			else if(s instanceof MFR_M01_MF_QUERY){
				MFR_M01_MF_QUERY v = (MFR_M01_MF_QUERY) s;
			} 

			else if(s instanceof RER_RER){
				RER_RER v = (RER_RER) s;
			} 

			else if(s instanceof OSQ_Q06){
				OSQ_Q06 v = (OSQ_Q06) s;
			} 

			else if(s instanceof RDE_O11_OBSERVATION){
				RDE_O11_OBSERVATION v = (RDE_O11_OBSERVATION) s;
			} 

			else if(s instanceof RGV_O15_ENCODING){
				RGV_O15_ENCODING v = (RGV_O15_ENCODING) s;
			} 

			else if(s instanceof OUL_R21_TIMING_QTY){
				OUL_R21_TIMING_QTY v = (OUL_R21_TIMING_QTY) s;
			} 

			else if(s instanceof PPT_PCL_PATIENT_VISIT){
				PPT_PCL_PATIENT_VISIT v = (PPT_PCL_PATIENT_VISIT) s;
			} 

			else if(s instanceof ORM_O01_ORDER_DETAIL){
				ORM_O01_ORDER_DETAIL v = (ORM_O01_ORDER_DETAIL) s;
			} 

			else if(s instanceof BPS_O29_PATIENT){
				BPS_O29_PATIENT v = (BPS_O29_PATIENT) s;
			} 

			else if(s instanceof OMG_O19_PATIENT_VISIT_PRIOR){
				OMG_O19_PATIENT_VISIT_PRIOR v = (OMG_O19_PATIENT_VISIT_PRIOR) s;
			} 

			else if(s instanceof RPI_I01_GUARANTOR_INSURANCE){
				RPI_I01_GUARANTOR_INSURANCE v = (RPI_I01_GUARANTOR_INSURANCE) s;
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

			else if(s instanceof OML_O21_PATIENT_VISIT){
				OML_O21_PATIENT_VISIT v = (OML_O21_PATIENT_VISIT) s;
			} 

			else if(s instanceof PEX_P07_EXPERIENCE){
				PEX_P07_EXPERIENCE v = (PEX_P07_EXPERIENCE) s;
			} 

			else if(s instanceof SRM_S01_RESOURCES){
				SRM_S01_RESOURCES v = (SRM_S01_RESOURCES) s;
			} 

			else if(s instanceof ORL_O36_TIMING){
				ORL_O36_TIMING v = (ORL_O36_TIMING) s;
			} 

			else if(s instanceof BRP_O30_ORDER){
				BRP_O30_ORDER v = (BRP_O30_ORDER) s;
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

			else if(s instanceof BPS_O29_PATIENT_VISIT){
				BPS_O29_PATIENT_VISIT v = (BPS_O29_PATIENT_VISIT) s;
			} 

			else if(s instanceof NMQ_N01_CLOCK_AND_STATISTICS){
				NMQ_N01_CLOCK_AND_STATISTICS v = (NMQ_N01_CLOCK_AND_STATISTICS) s;
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

			else if(s instanceof OML_O33_PRIOR_RESULT){
				OML_O33_PRIOR_RESULT v = (OML_O33_PRIOR_RESULT) s;
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

			else if(s instanceof SIU_S12_PERSONNEL_RESOURCE){
				SIU_S12_PERSONNEL_RESOURCE v = (SIU_S12_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof RSP_Z88_PATIENT){
				RSP_Z88_PATIENT v = (RSP_Z88_PATIENT) s;
			} 

			else if(s instanceof ORL_O22_ORDER){
				ORL_O22_ORDER v = (ORL_O22_ORDER) s;
			} 

			else if(s instanceof RQC_I05){
				RQC_I05 v = (RQC_I05) s;
			} 

			else if(s instanceof OMD_O03_ORDER_TRAY){
				OMD_O03_ORDER_TRAY v = (OMD_O03_ORDER_TRAY) s;
			} 

			else if(s instanceof RRA_O18_ADMINISTRATION){
				RRA_O18_ADMINISTRATION v = (RRA_O18_ADMINISTRATION) s;
			} 

			else if(s instanceof GT1){
				GT1 v = (GT1) s;
			} 

			else if(s instanceof VXU_V04_OBSERVATION){
				VXU_V04_OBSERVATION v = (VXU_V04_OBSERVATION) s;
			} 

			else if(s instanceof ORU_R30_OBSERVATION){
				ORU_R30_OBSERVATION v = (ORU_R30_OBSERVATION) s;
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

			else if(s instanceof SQR_S25_RESOURCES){
				SQR_S25_RESOURCES v = (SQR_S25_RESOURCES) s;
			} 

			else if(s instanceof MFN_M01_MF){
				MFN_M01_MF v = (MFN_M01_MF) s;
			} 

			else if(s instanceof OUL_R24_SPECIMEN){
				OUL_R24_SPECIMEN v = (OUL_R24_SPECIMEN) s;
			} 

			else if(s instanceof PPP_PCB_ORDER_DETAIL){
				PPP_PCB_ORDER_DETAIL v = (PPP_PCB_ORDER_DETAIL) s;
			} 

			else if(s instanceof ORL_O22_PATIENT){
				ORL_O22_PATIENT v = (ORL_O22_PATIENT) s;
			} 

			else if(s instanceof PPT_PCL_ORDER){
				PPT_PCL_ORDER v = (PPT_PCL_ORDER) s;
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

			else if(s instanceof PES){
				PES v = (PES) s;
			} 

			else if(s instanceof BAR_P12_PROCEDURE){
				BAR_P12_PROCEDURE v = (BAR_P12_PROCEDURE) s;
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

			else if(s instanceof CM2){
				CM2 v = (CM2) s;
			} 

			else if(s instanceof REF_I12_OBSERVATION){
				REF_I12_OBSERVATION v = (REF_I12_OBSERVATION) s;
			} 

			else if(s instanceof PPT_PCL){
				PPT_PCL v = (PPT_PCL) s;
			} 

			else if(s instanceof RDY_K15){
				RDY_K15 v = (RDY_K15) s;
			} 

			else if(s instanceof OUL_R21_OBSERVATION){
				OUL_R21_OBSERVATION v = (OUL_R21_OBSERVATION) s;
			} 

			else if(s instanceof RSP_Z86_ADMINISTRATION){
				RSP_Z86_ADMINISTRATION v = (RSP_Z86_ADMINISTRATION) s;
			} 

			else if(s instanceof PPT_PCL_PATIENT){
				PPT_PCL_PATIENT v = (PPT_PCL_PATIENT) s;
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

			else if(s instanceof ROR_ROR_ORDER){
				ROR_ROR_ORDER v = (ROR_ROR_ORDER) s;
			} 

			else if(s instanceof MDM_T02_OBSERVATION){
				MDM_T02_OBSERVATION v = (MDM_T02_OBSERVATION) s;
			} 

			else if(s instanceof ROR_ROR){
				ROR_ROR v = (ROR_ROR) s;
			} 

			else if(s instanceof NMR_N01_CLOCK_AND_STATS_WITH_NOTES_ALT){
				NMR_N01_CLOCK_AND_STATS_WITH_NOTES_ALT v = (NMR_N01_CLOCK_AND_STATS_WITH_NOTES_ALT) s;
			} 

			else if(s instanceof ADT_AXX){
				ADT_AXX v = (ADT_AXX) s;
			} 

			else if(s instanceof RSP_Z90_OBSERVATION){
				RSP_Z90_OBSERVATION v = (RSP_Z90_OBSERVATION) s;
			} 

			else if(s instanceof VXU_V04_PATIENT){
				VXU_V04_PATIENT v = (VXU_V04_PATIENT) s;
			} 

			else if(s instanceof RSP_Q11_MF_LOC_DEPT){
				RSP_Q11_MF_LOC_DEPT v = (RSP_Q11_MF_LOC_DEPT) s;
			} 

			else if(s instanceof AIG){
				AIG v = (AIG) s;
			} 

			else if(s instanceof EQL){
				EQL v = (EQL) s;
			} 

			else if(s instanceof RDE_O11_TIMING){
				RDE_O11_TIMING v = (RDE_O11_TIMING) s;
			} 

			else if(s instanceof OMD_O03_ORDER_DIET){
				OMD_O03_ORDER_DIET v = (OMD_O03_ORDER_DIET) s;
			} 

			else if(s instanceof RAS_O17_COMPONENTS){
				RAS_O17_COMPONENTS v = (RAS_O17_COMPONENTS) s;
			} 

			else if(s instanceof AIL){
				AIL v = (AIL) s;
			} 

			else if(s instanceof EQP){
				EQP v = (EQP) s;
			} 

			else if(s instanceof OUL_R21_VISIT){
				OUL_R21_VISIT v = (OUL_R21_VISIT) s;
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

			else if(s instanceof NCK){
				NCK v = (NCK) s;
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

			else if(s instanceof RQA_I08_PROVIDER){
				RQA_I08_PROVIDER v = (RQA_I08_PROVIDER) s;
			} 

			else if(s instanceof RAR_RAR_DEFINITION){
				RAR_RAR_DEFINITION v = (RAR_RAR_DEFINITION) s;
			} 

			else if(s instanceof PGL_PC6_ORDER_DETAIL){
				PGL_PC6_ORDER_DETAIL v = (PGL_PC6_ORDER_DETAIL) s;
			} 

			else if(s instanceof ERR){
				ERR v = (ERR) s;
			} 

			else if(s instanceof ERQ){
				ERQ v = (ERQ) s;
			} 

			else if(s instanceof RRI_I12_OBSERVATION){
				RRI_I12_OBSERVATION v = (RRI_I12_OBSERVATION) s;
			} 

			else if(s instanceof CSU_C09_STUDY_PHASE){
				CSU_C09_STUDY_PHASE v = (CSU_C09_STUDY_PHASE) s;
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

			else if(s instanceof ORF_R04_OBSERVATION){
				ORF_R04_OBSERVATION v = (ORF_R04_OBSERVATION) s;
			} 

			else if(s instanceof VTQ){
				VTQ v = (VTQ) s;
			} 

			else if(s instanceof TQ2){
				TQ2 v = (TQ2) s;
			} 

			else if(s instanceof TQ1){
				TQ1 v = (TQ1) s;
			} 

			else if(s instanceof SQM_S25_GENERAL_RESOURCE){
				SQM_S25_GENERAL_RESOURCE v = (SQM_S25_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof NDS){
				NDS v = (NDS) s;
			} 

			else if(s instanceof SQR_S25_SERVICE){
				SQR_S25_SERVICE v = (SQR_S25_SERVICE) s;
			} 

			else if(s instanceof CSU_C09_STUDY_PHARM){
				CSU_C09_STUDY_PHARM v = (CSU_C09_STUDY_PHARM) s;
			} 

			else if(s instanceof PPV_PCA_ORDER_DETAIL){
				PPV_PCA_ORDER_DETAIL v = (PPV_PCA_ORDER_DETAIL) s;
			} 

			else if(s instanceof ORF_R04_TIMING_QTY){
				ORF_R04_TIMING_QTY v = (ORF_R04_TIMING_QTY) s;
			} 

			else if(s instanceof OUL_R22_CONTAINER){
				OUL_R22_CONTAINER v = (OUL_R22_CONTAINER) s;
			} 

			else if(s instanceof OMD_O03_OBSERVATION){
				OMD_O03_OBSERVATION v = (OMD_O03_OBSERVATION) s;
			} 

			else if(s instanceof RDE_O11_ORDER_DETAIL){
				RDE_O11_ORDER_DETAIL v = (RDE_O11_ORDER_DETAIL) s;
			} 

			else if(s instanceof AL1){
				AL1 v = (AL1) s;
			} 

			else if(s instanceof RSP_K31_TIMING){
				RSP_K31_TIMING v = (RSP_K31_TIMING) s;
			} 

			else if(s instanceof SRM_S01_PERSONNEL_RESOURCE){
				SRM_S01_PERSONNEL_RESOURCE v = (SRM_S01_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof PRR_PC5_GOAL_OBSERVATION){
				PRR_PC5_GOAL_OBSERVATION v = (PRR_PC5_GOAL_OBSERVATION) s;
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

			else if(s instanceof RRA_O18_RESPONSE){
				RRA_O18_RESPONSE v = (RRA_O18_RESPONSE) s;
			} 

			else if(s instanceof PPT_PCL_PROBLEM_ROLE){
				PPT_PCL_PROBLEM_ROLE v = (PPT_PCL_PROBLEM_ROLE) s;
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

			else if(s instanceof ORB_O28_RESPONSE){
				ORB_O28_RESPONSE v = (ORB_O28_RESPONSE) s;
			} 

			else if(s instanceof MFN_M12_MF_OBS_ATTRIBUTES){
				MFN_M12_MF_OBS_ATTRIBUTES v = (MFN_M12_MF_OBS_ATTRIBUTES) s;
			} 

			else if(s instanceof ORN_O08_ORDER){
				ORN_O08_ORDER v = (ORN_O08_ORDER) s;
			} 

			else if(s instanceof RSP_K31_ENCODING){
				RSP_K31_ENCODING v = (RSP_K31_ENCODING) s;
			} 

			else if(s instanceof PGL_PC6_ORDER_OBSERVATION){
				PGL_PC6_ORDER_OBSERVATION v = (PGL_PC6_ORDER_OBSERVATION) s;
			} 

			else if(s instanceof QVR_Q17){
				QVR_Q17 v = (QVR_Q17) s;
			} 

			else if(s instanceof OUL_R22_VISIT){
				OUL_R22_VISIT v = (OUL_R22_VISIT) s;
			} 

			else if(s instanceof PRR_PC5_ORDER){
				PRR_PC5_ORDER v = (PRR_PC5_ORDER) s;
			} 

			else if(s instanceof RPA_I08){
				RPA_I08 v = (RPA_I08) s;
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

			else if(s instanceof RRE_O12_ENCODING){
				RRE_O12_ENCODING v = (RRE_O12_ENCODING) s;
			} 

			else if(s instanceof OUL_R21_ORDER_OBSERVATION){
				OUL_R21_ORDER_OBSERVATION v = (OUL_R21_ORDER_OBSERVATION) s;
			} 

			else if(s instanceof ORP_O10_COMPONENT){
				ORP_O10_COMPONENT v = (ORP_O10_COMPONENT) s;
			} 

			else if(s instanceof ORF_R04_ORDER){
				ORF_R04_ORDER v = (ORF_R04_ORDER) s;
			} 

			else if(s instanceof OML_O21_PRIOR_RESULT){
				OML_O21_PRIOR_RESULT v = (OML_O21_PRIOR_RESULT) s;
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

			else if(s instanceof ADT_AXX_MERGE_INFO){
				ADT_AXX_MERGE_INFO v = (ADT_AXX_MERGE_INFO) s;
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

			else if(s instanceof ORM_O01_INSURANCE){
				ORM_O01_INSURANCE v = (ORM_O01_INSURANCE) s;
			} 

			else if(s instanceof BPS_O29){
				BPS_O29 v = (BPS_O29) s;
			} 

			else if(s instanceof DFT_P11_FINANCIAL_ORDER){
				DFT_P11_FINANCIAL_ORDER v = (DFT_P11_FINANCIAL_ORDER) s;
			} 

			else if(s instanceof PPG_PCG_PATIENT_VISIT){
				PPG_PCG_PATIENT_VISIT v = (PPG_PCG_PATIENT_VISIT) s;
			} 

			else if(s instanceof PTR_PCF_ORDER_DETAIL){
				PTR_PCF_ORDER_DETAIL v = (PTR_PCF_ORDER_DETAIL) s;
			} 

			else if(s instanceof RRA_O18_ORDER){
				RRA_O18_ORDER v = (RRA_O18_ORDER) s;
			} 

			else if(s instanceof PEX_P07_NK1_TIMING_QTY){
				PEX_P07_NK1_TIMING_QTY v = (PEX_P07_NK1_TIMING_QTY) s;
			} 

			else if(s instanceof PPV_PCA_GOAL_ROLE){
				PPV_PCA_GOAL_ROLE v = (PPV_PCA_GOAL_ROLE) s;
			} 

			else if(s instanceof QVR_Q17_QBP){
				QVR_Q17_QBP v = (QVR_Q17_QBP) s;
			} 

			else if(s instanceof RGV_O15_COMPONENTS){
				RGV_O15_COMPONENTS v = (RGV_O15_COMPONENTS) s;
			} 

			else if(s instanceof PEX_P07_ASSOCIATED_PERSON){
				PEX_P07_ASSOCIATED_PERSON v = (PEX_P07_ASSOCIATED_PERSON) s;
			} 

			else if(s instanceof ADT_A16_INSURANCE){
				ADT_A16_INSURANCE v = (ADT_A16_INSURANCE) s;
			} 

			else if(s instanceof RPR_I03){
				RPR_I03 v = (RPR_I03) s;
			} 

			else if(s instanceof RQ1){
				RQ1 v = (RQ1) s;
			} 

			else if(s instanceof OMS_O05_ORDER){
				OMS_O05_ORDER v = (OMS_O05_ORDER) s;
			} 

			else if(s instanceof VXR_V03){
				VXR_V03 v = (VXR_V03) s;
			} 

			else if(s instanceof LDP){
				LDP v = (LDP) s;
			} 

			else if(s instanceof SSR_U04_SPECIMEN_CONTAINER){
				SSR_U04_SPECIMEN_CONTAINER v = (SSR_U04_SPECIMEN_CONTAINER) s;
			} 

			else if(s instanceof ORG_O20){
				ORG_O20 v = (ORG_O20) s;
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

			else if(s instanceof OMB_O27_ORDER){
				OMB_O27_ORDER v = (OMB_O27_ORDER) s;
			} 

			else if(s instanceof ORU_R01_TIMING_QTY){
				ORU_R01_TIMING_QTY v = (ORU_R01_TIMING_QTY) s;
			} 

			else if(s instanceof VXR_V03_OBSERVATION){
				VXR_V03_OBSERVATION v = (VXR_V03_OBSERVATION) s;
			} 

			else if(s instanceof RAS_O17_ORDER_DETAIL){
				RAS_O17_ORDER_DETAIL v = (RAS_O17_ORDER_DETAIL) s;
			} 

			else if(s instanceof PPG_PCG_PROBLEM_ROLE){
				PPG_PCG_PROBLEM_ROLE v = (PPG_PCG_PROBLEM_ROLE) s;
			} 

			else if(s instanceof MFR_M06_MF_QUERY){
				MFR_M06_MF_QUERY v = (MFR_M06_MF_QUERY) s;
			} 

			else if(s instanceof CTD){
				CTD v = (CTD) s;
			} 

			else if(s instanceof RAS_O17_TIMING){
				RAS_O17_TIMING v = (RAS_O17_TIMING) s;
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

			else if(s instanceof PPT_PCL_GOAL_ROLE){
				PPT_PCL_GOAL_ROLE v = (PPT_PCL_GOAL_ROLE) s;
			} 

			else if(s instanceof DFT_P11_TIMING_QUANTITY){
				DFT_P11_TIMING_QUANTITY v = (DFT_P11_TIMING_QUANTITY) s;
			} 

			else if(s instanceof CSU_C09_STUDY_SCHEDULE){
				CSU_C09_STUDY_SCHEDULE v = (CSU_C09_STUDY_SCHEDULE) s;
			} 

			else if(s instanceof OMS_O05_PATIENT_VISIT){
				OMS_O05_PATIENT_VISIT v = (OMS_O05_PATIENT_VISIT) s;
			} 

			else if(s instanceof PPV_PCA_PROBLEM_OBSERVATION){
				PPV_PCA_PROBLEM_OBSERVATION v = (PPV_PCA_PROBLEM_OBSERVATION) s;
			} 

			else if(s instanceof APR){
				APR v = (APR) s;
			} 

			else if(s instanceof MFN_M06_MF_PHASE_SCHED_DETAIL){
				MFN_M06_MF_PHASE_SCHED_DETAIL v = (MFN_M06_MF_PHASE_SCHED_DETAIL) s;
			} 

			else if(s instanceof MFR_M04_MF_QUERY){
				MFR_M04_MF_QUERY v = (MFR_M04_MF_QUERY) s;
			} 

			else if(s instanceof BRT_O32_RESPONSE){
				BRT_O32_RESPONSE v = (BRT_O32_RESPONSE) s;
			} 

			else if(s instanceof PPP_PCB_PROBLEM_OBSERVATION){
				PPP_PCB_PROBLEM_OBSERVATION v = (PPP_PCB_PROBLEM_OBSERVATION) s;
			} 

			else if(s instanceof ADT_A01_PROCEDURE){
				ADT_A01_PROCEDURE v = (ADT_A01_PROCEDURE) s;
			} 

			else if(s instanceof RRD_O14_TIMING){
				RRD_O14_TIMING v = (RRD_O14_TIMING) s;
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

			else if(s instanceof OMB_O27_PATIENT_VISIT){
				OMB_O27_PATIENT_VISIT v = (OMB_O27_PATIENT_VISIT) s;
			} 

			else if(s instanceof ORU_R01_PATIENT_RESULT){
				ORU_R01_PATIENT_RESULT v = (ORU_R01_PATIENT_RESULT) s;
			} 

			else if(s instanceof PTR_PCF_GOAL_ROLE){
				PTR_PCF_GOAL_ROLE v = (PTR_PCF_GOAL_ROLE) s;
			} 

			else if(s instanceof SIU_S12){
				SIU_S12 v = (SIU_S12) s;
			} 

			else if(s instanceof QCN_J01){
				QCN_J01 v = (QCN_J01) s;
			} 

			else if(s instanceof RSP_K31){
				RSP_K31 v = (RSP_K31) s;
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

			else if(s instanceof PRR_PC5_GOAL_ROLE){
				PRR_PC5_GOAL_ROLE v = (PRR_PC5_GOAL_ROLE) s;
			} 

			else if(s instanceof ORD_O04_TIMING_TRAY){
				ORD_O04_TIMING_TRAY v = (ORD_O04_TIMING_TRAY) s;
			} 

			else if(s instanceof TXA){
				TXA v = (TXA) s;
			} 

			else if(s instanceof ARQ){
				ARQ v = (ARQ) s;
			} 

			else if(s instanceof SSU_U03_SPECIMEN){
				SSU_U03_SPECIMEN v = (SSU_U03_SPECIMEN) s;
			} 

			else if(s instanceof VXQ_V01){
				VXQ_V01 v = (VXQ_V01) s;
			} 

			else if(s instanceof NMQ_N01_QRY_WITH_DETAIL){
				NMQ_N01_QRY_WITH_DETAIL v = (NMQ_N01_QRY_WITH_DETAIL) s;
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

			else if(s instanceof ERP_R09){
				ERP_R09 v = (ERP_R09) s;
			} 

			else if(s instanceof RRA_O18_PATIENT){
				RRA_O18_PATIENT v = (RRA_O18_PATIENT) s;
			} 

			else if(s instanceof ORR_O02_ORDER){
				ORR_O02_ORDER v = (ORR_O02_ORDER) s;
			} 

			else if(s instanceof RPI_I01_INSURANCE){
				RPI_I01_INSURANCE v = (RPI_I01_INSURANCE) s;
			} 

			else if(s instanceof SUR_P09_PRODUCT){
				SUR_P09_PRODUCT v = (SUR_P09_PRODUCT) s;
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

			else if(s instanceof PPR_PC1_ORDER_OBSERVATION){
				PPR_PC1_ORDER_OBSERVATION v = (PPR_PC1_ORDER_OBSERVATION) s;
			} 

			else if(s instanceof RRG_O16_RESPONSE){
				RRG_O16_RESPONSE v = (RRG_O16_RESPONSE) s;
			} 

			else if(s instanceof BTS_O31_TIMING){
				BTS_O31_TIMING v = (BTS_O31_TIMING) s;
			} 

			else if(s instanceof RCL_I06){
				RCL_I06 v = (RCL_I06) s;
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

			else if(s instanceof QRY_Q01){
				QRY_Q01 v = (QRY_Q01) s;
			} 

			else if(s instanceof RQA_I08_GUARANTOR_INSURANCE){
				RQA_I08_GUARANTOR_INSURANCE v = (RQA_I08_GUARANTOR_INSURANCE) s;
			} 

			else if(s instanceof QRY_Q02){
				QRY_Q02 v = (QRY_Q02) s;
			} 

			else if(s instanceof SRM_S01_GENERAL_RESOURCE){
				SRM_S01_GENERAL_RESOURCE v = (SRM_S01_GENERAL_RESOURCE) s;
			} 

			else if(s instanceof ORG_O20_RESPONSE){
				ORG_O20_RESPONSE v = (ORG_O20_RESPONSE) s;
			} 

			else if(s instanceof SQR_S25_PATIENT){
				SQR_S25_PATIENT v = (SQR_S25_PATIENT) s;
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

			else if(s instanceof PRB){
				PRB v = (PRB) s;
			} 

			else if(s instanceof PRD){
				PRD v = (PRD) s;
			} 

			else if(s instanceof OMN_O07_INSURANCE){
				OMN_O07_INSURANCE v = (OMN_O07_INSURANCE) s;
			} 

			else if(s instanceof SQM_S25_REQUEST){
				SQM_S25_REQUEST v = (SQM_S25_REQUEST) s;
			} 

			else if(s instanceof CSU_C09){
				CSU_C09 v = (CSU_C09) s;
			} 

			else if(s instanceof RSP_Z86_COMMON_ORDER){
				RSP_Z86_COMMON_ORDER v = (RSP_Z86_COMMON_ORDER) s;
			} 

			else if(s instanceof PEX_P07_RX_ORDER){
				PEX_P07_RX_ORDER v = (PEX_P07_RX_ORDER) s;
			} 

			else if(s instanceof RCI_I05_RESULTS){
				RCI_I05_RESULTS v = (RCI_I05_RESULTS) s;
			} 

			else if(s instanceof OML_O21_PATIENT_VISIT_PRIOR){
				OML_O21_PATIENT_VISIT_PRIOR v = (OML_O21_PATIENT_VISIT_PRIOR) s;
			} 

			else if(s instanceof CRM_C01_PATIENT){
				CRM_C01_PATIENT v = (CRM_C01_PATIENT) s;
			} 

			else if(s instanceof MDM_T01){
				MDM_T01 v = (MDM_T01) s;
			} 

			else if(s instanceof MDM_T02){
				MDM_T02 v = (MDM_T02) s;
			} 

			else if(s instanceof PPP_PCB_ORDER_OBSERVATION){
				PPP_PCB_ORDER_OBSERVATION v = (PPP_PCB_ORDER_OBSERVATION) s;
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

			else if(s instanceof OMS_O05){
				OMS_O05 v = (OMS_O05) s;
			} 

			else if(s instanceof OMD_O03){
				OMD_O03 v = (OMD_O03) s;
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

			else if(s instanceof ORL_O34_RESPONSE){
				ORL_O34_RESPONSE v = (ORL_O34_RESPONSE) s;
			} 

			else if(s instanceof OMD_O03_TIMING_TRAY){
				OMD_O03_TIMING_TRAY v = (OMD_O03_TIMING_TRAY) s;
			} 

			else if(s instanceof RXA){
				RXA v = (RXA) s;
			} 

			else if(s instanceof RXC){
				RXC v = (RXC) s;
			} 

			else if(s instanceof PGL_PC6_GOAL){
				PGL_PC6_GOAL v = (PGL_PC6_GOAL) s;
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

			else if(s instanceof RXG){
				RXG v = (RXG) s;
			} 

			else if(s instanceof DFT_P11_FINANCIAL_PROCEDURE){
				DFT_P11_FINANCIAL_PROCEDURE v = (DFT_P11_FINANCIAL_PROCEDURE) s;
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

			else if(s instanceof MFR_M04){
				MFR_M04 v = (MFR_M04) s;
			} 

			else if(s instanceof MFR_M01){
				MFR_M01 v = (MFR_M01) s;
			} 

			else if(s instanceof MFR_M07){
				MFR_M07 v = (MFR_M07) s;
			} 

			else if(s instanceof PMU_B01){
				PMU_B01 v = (PMU_B01) s;
			} 

			else if(s instanceof MFN_M10_MF_TEST_BATTERIES){
				MFN_M10_MF_TEST_BATTERIES v = (MFN_M10_MF_TEST_BATTERIES) s;
			} 

			else if(s instanceof RXR){
				RXR v = (RXR) s;
			} 

			else if(s instanceof RSP_Z82_OBSERVATION){
				RSP_Z82_OBSERVATION v = (RSP_Z82_OBSERVATION) s;
			} 

			else if(s instanceof MFR_M05){
				MFR_M05 v = (MFR_M05) s;
			} 

			else if(s instanceof PMU_B04){
				PMU_B04 v = (PMU_B04) s;
			} 

			else if(s instanceof MFR_M06){
				MFR_M06 v = (MFR_M06) s;
			} 

			else if(s instanceof PMU_B03){
				PMU_B03 v = (PMU_B03) s;
			} 

			else if(s instanceof PTR_PCF_ORDER){
				PTR_PCF_ORDER v = (PTR_PCF_ORDER) s;
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

			else if(s instanceof DFT_P03_FINANCIAL){
				DFT_P03_FINANCIAL v = (DFT_P03_FINANCIAL) s;
			} 

			else if(s instanceof PPT_PCL_ORDER_OBSERVATION){
				PPT_PCL_ORDER_OBSERVATION v = (PPT_PCL_ORDER_OBSERVATION) s;
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

			else if(s instanceof PTR_PCF_PATHWAY){
				PTR_PCF_PATHWAY v = (PTR_PCF_PATHWAY) s;
			} 

			else if(s instanceof PPR_PC1_GOAL){
				PPR_PC1_GOAL v = (PPR_PC1_GOAL) s;
			} 

			else if(s instanceof RSP_Z88_OBSERVATION){
				RSP_Z88_OBSERVATION v = (RSP_Z88_OBSERVATION) s;
			} 

			else if(s instanceof RSP_K31_ORDER_DETAIL){
				RSP_K31_ORDER_DETAIL v = (RSP_K31_ORDER_DETAIL) s;
			} 

			else if(s instanceof ADT_A06_INSURANCE){
				ADT_A06_INSURANCE v = (ADT_A06_INSURANCE) s;
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

			else if(s instanceof PV2){
				PV2 v = (PV2) s;
			} 

			else if(s instanceof OMG_O19_ORDER_PRIOR){
				OMG_O19_ORDER_PRIOR v = (OMG_O19_ORDER_PRIOR) s;
			} 

			else if(s instanceof DFT_P03_FINANCIAL_OBSERVATION){
				DFT_P03_FINANCIAL_OBSERVATION v = (DFT_P03_FINANCIAL_OBSERVATION) s;
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

			else if(s instanceof PPV_PCA_PATIENT){
				PPV_PCA_PATIENT v = (PPV_PCA_PATIENT) s;
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

			else if(s instanceof ORL_O22_TIMING){
				ORL_O22_TIMING v = (ORL_O22_TIMING) s;
			} 

			else if(s instanceof OML_O35_SPECIMEN_CONTAINER){
				OML_O35_SPECIMEN_CONTAINER v = (OML_O35_SPECIMEN_CONTAINER) s;
			} 

			else if(s instanceof ORL_O36_ORDER){
				ORL_O36_ORDER v = (ORL_O36_ORDER) s;
			} 

			else if(s instanceof ORL_O22){
				ORL_O22 v = (ORL_O22) s;
			} 

			else if(s instanceof OMG_O19_OBSERVATION_PRIOR){
				OMG_O19_OBSERVATION_PRIOR v = (OMG_O19_OBSERVATION_PRIOR) s;
			} 

			else if(s instanceof OMI_O23_PATIENT){
				OMI_O23_PATIENT v = (OMI_O23_PATIENT) s;
			} 

			else if(s instanceof EQQ_Q04){
				EQQ_Q04 v = (EQQ_Q04) s;
			} 

			else if(s instanceof OMB_O27_INSURANCE){
				OMB_O27_INSURANCE v = (OMB_O27_INSURANCE) s;
			} 

			else if(s instanceof ORS_O06_ORDER){
				ORS_O06_ORDER v = (ORS_O06_ORDER) s;
			} 

			else if(s instanceof RPA_I08_AUTHORIZATION){
				RPA_I08_AUTHORIZATION v = (RPA_I08_AUTHORIZATION) s;
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

			else if(s instanceof SQR_S25_PERSONNEL_RESOURCE){
				SQR_S25_PERSONNEL_RESOURCE v = (SQR_S25_PERSONNEL_RESOURCE) s;
			} 

			else if(s instanceof NSC){
				NSC v = (NSC) s;
			} 

			else if(s instanceof LOC){
				LOC v = (LOC) s;
			} 

			else if(s instanceof CON_){
				CON_ v = (CON_) s;
			} 

			else if(s instanceof MFN_M06_MF_CLIN_STUDY){
				MFN_M06_MF_CLIN_STUDY v = (MFN_M06_MF_CLIN_STUDY) s;
			} 

			else if(s instanceof SPQ_Q08){
				SPQ_Q08 v = (SPQ_Q08) s;
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

			else if(s instanceof ORL_O34_OBSERVATION_REQUEST_SPECIMEN){
				ORL_O34_OBSERVATION_REQUEST_SPECIMEN v = (ORL_O34_OBSERVATION_REQUEST_SPECIMEN) s;
			} 

			else if(s instanceof SIU_S12_GENERAL_RESOURCE){
				SIU_S12_GENERAL_RESOURCE v = (SIU_S12_GENERAL_RESOURCE) s;
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

			else if(s instanceof RGR_RGR_DEFINITION){
				RGR_RGR_DEFINITION v = (RGR_RGR_DEFINITION) s;
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

			else if(s instanceof ORL_O36_PATIENT){
				ORL_O36_PATIENT v = (ORL_O36_PATIENT) s;
			} 

			else if(s instanceof PPP_PCB){
				PPP_PCB v = (PPP_PCB) s;
			} 

			else if(s instanceof ORD_O04_TIMING_DIET){
				ORD_O04_TIMING_DIET v = (ORD_O04_TIMING_DIET) s;
			} 

			else if(s instanceof ORR_O02_PATIENT){
				ORR_O02_PATIENT v = (ORR_O02_PATIENT) s;
			} 

			else if(s instanceof OMG_O19_PATIENT_VISIT){
				OMG_O19_PATIENT_VISIT v = (OMG_O19_PATIENT_VISIT) s;
			} 

			else if(s instanceof ORD_O04_PATIENT){
				ORD_O04_PATIENT v = (ORD_O04_PATIENT) s;
			} 

			else if(s instanceof PPG_PCG_GOAL){
				PPG_PCG_GOAL v = (PPG_PCG_GOAL) s;
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

			else if(s instanceof RSP_Z82_ENCODED_ORDER){
				RSP_Z82_ENCODED_ORDER v = (RSP_Z82_ENCODED_ORDER) s;
			} 

			else if(s instanceof PPT_PCL_PATHWAY){
				PPT_PCL_PATHWAY v = (PPT_PCL_PATHWAY) s;
			} 

			else if(s instanceof ADT_A45_MERGE_INFO){
				ADT_A45_MERGE_INFO v = (ADT_A45_MERGE_INFO) s;
			} 

			else if(s instanceof EAR_U08_COMMAND_RESPONSE){
				EAR_U08_COMMAND_RESPONSE v = (EAR_U08_COMMAND_RESPONSE) s;
			} 

			else if(s instanceof SQM_S25_SERVICE){
				SQM_S25_SERVICE v = (SQM_S25_SERVICE) s;
			} 

			else if(s instanceof DB1){
				DB1 v = (DB1) s;
			} 

			else if(s instanceof PPV_PCA_PATIENT_VISIT){
				PPV_PCA_PATIENT_VISIT v = (PPV_PCA_PATIENT_VISIT) s;
			} 

			else if(s instanceof RCL_I06_PROVIDER){
				RCL_I06_PROVIDER v = (RCL_I06_PROVIDER) s;
			} 

			else if(s instanceof VXR_V03_PATIENT_VISIT){
				VXR_V03_PATIENT_VISIT v = (VXR_V03_PATIENT_VISIT) s;
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

			else if(s instanceof PTR_PCF_PROBLEM){
				PTR_PCF_PROBLEM v = (PTR_PCF_PROBLEM) s;
			} 

			else if(s instanceof OUL_R24_TIMING_QTY){
				OUL_R24_TIMING_QTY v = (OUL_R24_TIMING_QTY) s;
			} 

			else if(s instanceof RRD_O14_ORDER){
				RRD_O14_ORDER v = (RRD_O14_ORDER) s;
			} 

			else if(s instanceof OML_O21_PATIENT){
				OML_O21_PATIENT v = (OML_O21_PATIENT) s;
			} 

			else if(s instanceof RPI_I01_PROVIDER){
				RPI_I01_PROVIDER v = (RPI_I01_PROVIDER) s;
			} 

			else if(s instanceof PTR_PCF_GOAL){
				PTR_PCF_GOAL v = (PTR_PCF_GOAL) s;
			} 

			else if(s instanceof RDE_O11_PATIENT_VISIT){
				RDE_O11_PATIENT_VISIT v = (RDE_O11_PATIENT_VISIT) s;
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

			else if(s instanceof RRE_O12_ORDER){
				RRE_O12_ORDER v = (RRE_O12_ORDER) s;
			} 

			else if(s instanceof SUR_P09){
				SUR_P09 v = (SUR_P09) s;
			} 

			else if(s instanceof OSR_Q06_PATIENT){
				OSR_Q06_PATIENT v = (OSR_Q06_PATIENT) s;
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

			else if(s instanceof RSP_Z88_TIMING){
				RSP_Z88_TIMING v = (RSP_Z88_TIMING) s;
			} 

			else if(s instanceof ORP_O10_RESPONSE){
				ORP_O10_RESPONSE v = (ORP_O10_RESPONSE) s;
			} 

			else if(s instanceof RAR_RAR_ORDER){
				RAR_RAR_ORDER v = (RAR_RAR_ORDER) s;
			} 

			else if(s instanceof OML_O35_OBSERVATION_PRIOR){
				OML_O35_OBSERVATION_PRIOR v = (OML_O35_OBSERVATION_PRIOR) s;
			} 

			else if(s instanceof PTR_PCF_PROBLEM_OBSERVATION){
				PTR_PCF_PROBLEM_OBSERVATION v = (PTR_PCF_PROBLEM_OBSERVATION) s;
			} 

			else if(s instanceof OMN_O07_ORDER){
				OMN_O07_ORDER v = (OMN_O07_ORDER) s;
			} 

			else if(s instanceof RSP_Z86_ENCODED_ORDER){
				RSP_Z86_ENCODED_ORDER v = (RSP_Z86_ENCODED_ORDER) s;
			} 

			else if(s instanceof PPR_PC1_PROBLEM_OBSERVATION){
				PPR_PC1_PROBLEM_OBSERVATION v = (PPR_PC1_PROBLEM_OBSERVATION) s;
			} 

			else if(s instanceof RCI_I05){
				RCI_I05 v = (RCI_I05) s;
			} 

			else if(s instanceof OML_O33_OBSERVATION_REQUEST){
				OML_O33_OBSERVATION_REQUEST v = (OML_O33_OBSERVATION_REQUEST) s;
			} 

			else if(s instanceof PRR_PC5_ORDER_DETAIL){
				PRR_PC5_ORDER_DETAIL v = (PRR_PC5_ORDER_DETAIL) s;
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

			else if(s instanceof PPV_PCA_GOAL_PATHWAY){
				PPV_PCA_GOAL_PATHWAY v = (PPV_PCA_GOAL_PATHWAY) s;
			} 

			else if(s instanceof RSP_Q11){
				RSP_Q11 v = (RSP_Q11) s;
			} 

			else if(s instanceof CSU_C09_STUDY_OBSERVATION){
				CSU_C09_STUDY_OBSERVATION v = (CSU_C09_STUDY_OBSERVATION) s;
			} 

			else if(s instanceof RDE_O11_COMPONENT){
				RDE_O11_COMPONENT v = (RDE_O11_COMPONENT) s;
			} 

			else if(s instanceof VXR_V03_ORDER){
				VXR_V03_ORDER v = (VXR_V03_ORDER) s;
			} 

			else if(s instanceof RSP_K11_ROW_DEFINITION){
				RSP_K11_ROW_DEFINITION v = (RSP_K11_ROW_DEFINITION) s;
			} 

			else if(s instanceof QRY_PC4){
				QRY_PC4 v = (QRY_PC4) s;
			} 

			else if(s instanceof RAS_O17_OBSERVATION){
				RAS_O17_OBSERVATION v = (RAS_O17_OBSERVATION) s;
			} 

			else if(s instanceof PPP_PCB_PATIENT_VISIT){
				PPP_PCB_PATIENT_VISIT v = (PPP_PCB_PATIENT_VISIT) s;
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

			else if(s instanceof RDS_O13_OBSERVATION){
				RDS_O13_OBSERVATION v = (RDS_O13_OBSERVATION) s;
			} 

			else if(s instanceof ORU_R30_TIMING_QTY){
				ORU_R30_TIMING_QTY v = (ORU_R30_TIMING_QTY) s;
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
