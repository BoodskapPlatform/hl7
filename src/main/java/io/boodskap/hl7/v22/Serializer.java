package io.boodskap.hl7.v22;

import org.json.JSONArray;
import org.json.JSONObject;

import ca.uhn.hl7v2.model.v22.datatype.AD;
import ca.uhn.hl7v2.model.v22.datatype.CE;
import ca.uhn.hl7v2.model.v22.datatype.CK;
import ca.uhn.hl7v2.model.v22.datatype.CM_AUI;
import ca.uhn.hl7v2.model.v22.datatype.CM_DDI;
import ca.uhn.hl7v2.model.v22.datatype.CM_DLD;
import ca.uhn.hl7v2.model.v22.datatype.CM_DTN;
import ca.uhn.hl7v2.model.v22.datatype.CM_FINANCE;
import ca.uhn.hl7v2.model.v22.datatype.CM_INTERNAL_LOCATION;
import ca.uhn.hl7v2.model.v22.datatype.CM_LICENSE_NO;
import ca.uhn.hl7v2.model.v22.datatype.CM_PAT_ID;
import ca.uhn.hl7v2.model.v22.datatype.CM_PAT_ID_0192;
import ca.uhn.hl7v2.model.v22.datatype.CM_PCF;
import ca.uhn.hl7v2.model.v22.datatype.CM_PEN;
import ca.uhn.hl7v2.model.v22.datatype.CM_PTA;
import ca.uhn.hl7v2.model.v22.datatype.CN;
import ca.uhn.hl7v2.model.v22.datatype.DT;
import ca.uhn.hl7v2.model.v22.datatype.ID;
import ca.uhn.hl7v2.model.v22.datatype.NM;
import ca.uhn.hl7v2.model.v22.datatype.PN;
import ca.uhn.hl7v2.model.v22.datatype.SI;
import ca.uhn.hl7v2.model.v22.datatype.ST;
import ca.uhn.hl7v2.model.v22.datatype.TN;
import ca.uhn.hl7v2.model.v22.datatype.TS;
import ca.uhn.hl7v2.model.v22.segment.IN1;
import ca.uhn.hl7v2.model.v22.segment.IN2;
import ca.uhn.hl7v2.model.v22.segment.IN3;
import io.boodskap.hl7.FieldMapping;

public class Serializer {

	public static void convert(JSONObject json, String name, IN1 v) {
		
		JSONObject j = new JSONObject();
		
		Serializer.convert(j, "assignment_of_benefits", v.getAssignmentOfBenefits());
		Serializer.convert(j, "billing_status", v.getBillingStatus());
		Serializer.convert(j, "company_plan_code", v.getCompanyPlanCode());
		Serializer.convert(j, "coordination_of_benifits", v.getCoordinationOfBenefits());
		Serializer.convert(j, "coordination_of_benifits_priority", v.getCoordinationOfBenefitsPriority());
		Serializer.convert(j, "delay_before_lifetime_reserve_days", v.getDelayBeforeLifetimeReserveDays());
		Serializer.convert(j, "group_name", v.getGroupName());
		Serializer.convert(j, "group_number", v.getGroupNumber());
		Serializer.convert(j, "insurance_company_address", v.getInsuranceCompanyAddress());
		Serializer.convert(j, "insurance_company_contact_pers", v.getInsuranceCompanyContactPers());
		Serializer.convert(j, "insurance_company_id", v.getInsuranceCompanyID());
		Serializer.convert(j, "insurance_company_name", v.getInsuranceCompanyName());
		Serializer.convert(j, "insurance_plan_id", v.getInsurancePlanID());
		Serializer.convert(j, "prior_insurance_plan_id", v.getPriorInsurancePlanID());
		Serializer.convert(j, "insured_address", v.getInsuredSAddress());
		Serializer.convert(j, "insured_date_of_birth", v.getInsuredSDateOfBirth());
		Serializer.convert(j, "insured_employer_address", v.getInsuredSEmployerAddress());
		Serializer.convert(j, "insured_employment_status", v.getInsuredSEmploymentStatus());
		Serializer.convert(j, "insured_group_employer_id", v.getInsuredSGroupEmployerID());
		Serializer.convert(j, "insured_group_employer_name", v.getInsuredSGroupEmployerName());
		Serializer.convert(j, "insured_relationship_to_patient", v.getInsuredSRelationshipToPatient());
		Serializer.convert(j, "insured_sex", v.getInsuredSSex());
		Serializer.convert(j, "name_of_insured", v.getNameOfInsured());
		Serializer.convert(j, "insurance_company_phone_number", v.getInsuranceCompanyPhoneNumber());
		Serializer.convert(j, "authorization_information", v.getAuthorizationInformation());
		Serializer.convert(j, "verification_status", v.getVerificationStatus());
		Serializer.convert(j, "verification_date_time", v.getVerificationDateTime());
		Serializer.convert(j, "verification_by", v.getVerificationBy());
		Serializer.convert(j, "type_of_agreement_code", v.getTypeOfAgreementCode());
		Serializer.convert(j, "set_id_insurance", v.getSetIDInsurance());
		Serializer.convert(j, "room-rate_semi_private", v.getRoomRateSemiPrivate());
		Serializer.convert(j, "room_rate_private", v.getRoomRatePrivate());
		Serializer.convert(j, "report_of_eligibility_date", v.getReportOfEligibilityDate());
		Serializer.convert(j, "report_of_eligibility_code", v.getReportOfEligibilityCode());
		Serializer.convert(j, "release_information_code", v.getReleaseInformationCode());
		Serializer.convert(j, "pre_admit_certification", v.getPreAdmitCertification());
		Serializer.convert(j, "policy_number", v.getPolicyNumber());
		Serializer.convert(j, "policy_limit_days", v.getPolicyLimitDays());
		Serializer.convert(j, "policy_limit_amount", v.getPolicyLimitAmount());
		Serializer.convert(j, "policy_deductible", v.getPolicyDeductible());
		Serializer.convert(j, "plan_type", v.getPlanType());
		Serializer.convert(j, "plan_effective_date", v.getPlanEffectiveDate());
		Serializer.convert(j, "expiration_date", v.getPlanExpirationDate());
		Serializer.convert(j, "notice_of_admission_date", v.getNoticeOfAdmissionDate());
		Serializer.convert(j, "notice_of_admission_code", v.getNoticeOfAdmissionCode());
		Serializer.convert(j, "lifetime_reservation_days", v.getLifetimeReserveDays());
		
		if(j.length() > 0) json.accumulate(name, j);
	}
	
	public static void convert(JSONObject json, String name, IN2 v) {
		
		JSONObject j = new JSONObject();
		
		Serializer.convert(j, "baby_coverage", v.getBabyCoverage());
		Serializer.convert(j, "blood_deductible", v.getBloodDeductible());
		Serializer.convert(j, "champus_id_number", v.getChampusIDNumber());
		Serializer.convert(j, "champus_organization", v.getChampusOrganization());
		Serializer.convert(j, "champus_rank_grade", v.getChampusRankGrade());
		Serializer.convert(j, "champus_retire_date", v.getChampusRetireDate());
		Serializer.convert(j, "champus_service", v.getChampusService());
		Serializer.convert(j, "champus_sponsor_name", v.getChampusSponsorName());
		Serializer.convert(j, "champus_station", v.getChampusStation());
		Serializer.convert(j, "champus_status", v.getChampusStatus());
		Serializer.convert(j, "combine_baby_bill", v.getCombineBabyBill());
		Serializer.convert(j, "dependent_of_champus_receipient", v.getDependentOfChampusRecipient());
		Serializer.convert(j, "eligibility_source", v.getEligibilitySource());
		Serializer.convert(j, "employer_information_date", v.getEmployerInformationData());
		Serializer.convert(j, "champus_non_availability_certification_on_file", v.getChampusNonAvailabilityCertificationOnFile());
		Serializer.convert(j, "insured_employee_id", v.getInsuredSEmployeeID());
		Serializer.convert(j, "insured_employer_name", v.getInsuredSEmployerName());
		Serializer.convert(j, "insured_ssn", v.getInsuredSSocialSecurityNumber());
		Serializer.convert(j, "mail_claim_party", v.getMailClaimParty());
		Serializer.convert(j, "medicaid_case_name", v.getMedicaidCaseName());
		Serializer.convert(j, "medicaid_case_number", v.getMedicaidCaseNumber());
		Serializer.convert(j, "medicare_health_insurance_card_number", v.getMedicareHealthInsuranceCardNumber());
		Serializer.convert(j, "non_covered_insurance_code", v.getNonCoveredInsuranceCode());
		Serializer.convert(j, "payor_id", v.getPayorID());
		Serializer.convert(j, "payer_subscriber_id", v.getPayorSubscriberID());
		Serializer.convert(j, "special_coverage_approval_name", v.getSpecialCoverageApprovalName());
		Serializer.convert(j, "special_coverage_approval_title", v.getSpecialCoverageApprovalTitle());
		Serializer.convert(j, "daily_deductible", v.getDailyDeductible());
		Serializer.convert(j, "policy_type_amount", v.getPolicyTypeAmount());

		
		if(j.length() > 0) json.accumulate(name, j);
}
	
	public static void convert(JSONObject json, String name, IN3 v) {
		
		JSONObject j = new JSONObject();
	
		Serializer.convert(j, "appeal_reason", v.getAppealReason());
		Serializer.convert(j, "case_manager", v.getCaseManager());
		Serializer.convert(j, "certification_agency", v.getCertificationAgency());
		Serializer.convert(j, "certification_agency_phone_number", v.getCertificationAgencyPhoneNumber());
		Serializer.convert(j, "certification_begin_date", v.getCertificationBeginDate());
		Serializer.convert(j, "certification_contact", v.getCertificationContact());
		Serializer.convert(j, "certification_contact_phone_number", v.getCertificationContactPhoneNumber());
		Serializer.convert(j, "certification_date_time", v.getCertificationDateTime());
		Serializer.convert(j, "certification_end_date", v.getCertificationEndDate());
		Serializer.convert(j, "certification_modify_date_time", v.getCertificationModifyDateTime());
		Serializer.convert(j, "cdrtification_number", v.getCertificationNumber());
		Serializer.convert(j, "certification_required", v.getCertificationRequired());
		Serializer.convert(j, "certified_by", v.getCertifiedBy());
		Serializer.convert(j, "non_concur_code_description", v.getNonConcurCodeDescription());
		Serializer.convert(j, "non_concur_effective_date_time", v.getNonConcurEffectiveDateTime());
		Serializer.convert(j, "operator", v.getOperator());
		Serializer.convert(j, "second_opinion_documentation_received", v.getSecondOpinionDocumentationReceived());
		Serializer.convert(j, "second_opinion_date", v.getSecondOpinionDate());
		Serializer.convert(j, "second_opinion_practitioner", v.getSecondOpinionPractitioner());
		Serializer.convert(j, "second_opinion_status", v.getSecondOpinionStatus());
		Serializer.convert(j, "set_id_insurance_certification", v.getSetIDInsuranceCertification());
		Serializer.convert(j, "days", v.getDays());
		Serializer.convert(j, "physician_reviewer", v.getPhysicianReviewer());
		Serializer.convert(j, "penalty", v.getPenalty());
		Serializer.convert(j, "precertification_required_window", v.getPreCertificationRequiredWindow());
		
		if(j.length() > 0) json.accumulate(name, j);
		
	}

	public static void convert(JSONObject j, String name, CM_PCF[] vals) {
		
		JSONArray a = new JSONArray();
		
		for(CM_PCF v : vals) {
			JSONObject e = new JSONObject();
			
			convert(e, "precertification_patient_type", v.getCm_pcf1_PreCertificationPatientType());
			convert(e, "precertification_required", v.getCm_pcf2_PreCerticationRequired());
			convert(e, "precertification_window", v.getCm_pcf3_PreCertificationWindow());
			
			if(e.length() > 0) a.put(e);
		}
		
		if(a.length() > 0) j.accumulate(FieldMapping.get(name), a);
	}

	public static void convert(JSONObject j, String name, CM_PEN v) {
		
		JSONObject e = new JSONObject();
		
		convert(e, "penalty_id", v.getPenaltyID());
		convert(e, "penalty_amount", v.getPenaltyAmount());
		
		if(e.length() > 0) j.accumulate(FieldMapping.get(name), e);
	}

	public static void convert(JSONObject j, String name, CM_DTN v) {
		
		JSONObject e = new JSONObject();
		
		convert(e, "data_type", v.getDayType());
		convert(e, "number_of_days", v.getNumberOfDays());
		
		if(e.length() > 0) j.accumulate(FieldMapping.get(name), e);
	}

	public static void convert(JSONObject j, String name, CM_PTA[] vals) {
		
		JSONArray a = new JSONArray();
		
		for(CM_PTA v : vals) {
			JSONObject e = new JSONObject();
			
			convert(e, "amount", v.getAmount());
			convert(e, "amount_class", v.getAmountClass());
			convert(e, "policy_type", v.getPolicyType());
			
			if(e.length() > 0) a.put(e);
		}
		
		if(a.length() > 0) j.accumulate(FieldMapping.get(name), a);
	}

	public static void convert(JSONObject j, String name, CM_DDI v) {
		
		JSONObject e = new JSONObject();
		
		convert(e, "amount", v.getAmount());
		convert(e, "delay_days", v.getDelayDays());
		convert(e, "number_of_days", v.getNumberOfDays());
		
		if(e.length() > 0) j.accumulate(FieldMapping.get(name), e);
	}

	public static void convert(JSONObject j, String name, CM_FINANCE[] vals) {
		
		JSONArray a = new JSONArray();
		
		for(CM_FINANCE v : vals) {
			JSONObject e = new JSONObject();
			
			convert(e, "finance_class_id", v.getCm_finance1_FinancialClassID());
			convert(e, "effective_date", v.getCm_finance2_EffectiveDate());
			
			if(e.length() > 0) a.put(e);
		}
		
		if(a.length() > 0) j.accumulate(FieldMapping.get(name), a);
	}

	public static void convert(JSONObject j, String name, CM_FINANCE v) {
		
		JSONObject e = new JSONObject();
		
		convert(e, "finance_class_id", v.getCm_finance1_FinancialClassID());
		convert(e, "effective_date", v.getCm_finance2_EffectiveDate());
		
		if(e.length() > 0) j.accumulate(FieldMapping.get(name), e);
	}

	public static void convert(JSONObject j, String name, CM_AUI v) {
		
		JSONObject e = new JSONObject();
		
		convert(e, "authorization_number", v.getAuthorizationNumber());
		convert(e, "date", v.getDate());
		convert(e, "source", v.getSource());
		
		if(e.length() > 0) j.accumulate(FieldMapping.get(name), e);
	}

	public static void convert(JSONObject j, String name, CM_DLD v) {
		
		JSONObject e = new JSONObject();
		
		convert(e, "discharge_location", v.getCm_dld1_DischargeLocation());
		convert(e, "effective_date", v.getCm_dld2_EffectiveDate());
		
		if(e.length() > 0) j.accumulate(FieldMapping.get(name), e);
	}

	public static void convert(JSONObject j, String name, CM_PAT_ID_0192 v) {
		
		JSONObject e = new JSONObject();
		
		convert(e, "check_digit", v.getCheckDigit());
		convert(e, "check_digit_scheme", v.getCheckDigitScheme());
		convert(e, "facility_id", v.getFacilityID());
		convert(e, "id_number", v.getIDNumber());
		convert(e, "type", v.getType());
		
		if(e.length() > 0) j.accumulate(FieldMapping.get(name), e);
	}
	public static void convert(JSONObject j, String name, CM_PAT_ID v) {
		
		JSONObject e = new JSONObject();
		
		convert(e, "check_digit_scheme", v.getCm_pat_id3_CheckDigitScheme());
		convert(e, "facility_id", v.getCm_pat_id4_FacilityID());
		convert(e, "type", v.getCm_pat_id5_Type());
		convert(e, "check_digit", v.getCm_pat_id2_CheckDigit());
		convert(e, "id_number", v.getCm_pat_id1_IDNumber());
		
		if(e.length() > 0) j.accumulate(FieldMapping.get(name), e);
	}

	public static void convert(JSONObject j, String name, CN v) {
		
		JSONObject e = new JSONObject();
		
		convert(e, "adresse", v.getAdresse());
		convert(e, "degree_eg_md", v.getDegreeEgMD());
		convert(e, "email", v.getEMail());
		convert(e, "family_name", v.getFamilyName());
		convert(e, "fax_number", v.getFaxnummer());
		convert(e, "given_name", v.getGivenName());
		convert(e, "id_number", v.getIDNumber());
		convert(e, "middle_name", v.getMiddleInitialOrName());
		convert(e, "online_number", v.getOnlineNummer());
		convert(e, "prefix_eg_dr", v.getPrefixEgDR());
		convert(e, "source_table_id", v.getSourceTableId());
		convert(e, "suffix_eg_jr_iii", v.getSuffixEgJRorIII());
		convert(e, "telephone", v.getTelefon());
		
		if(e.length() > 0) j.accumulate(FieldMapping.get(name), e);
		
	}

	public static void convert(JSONObject j, String name, CN[] v) {
		
		if(null == v) return;
		
		JSONArray e = new JSONArray();
		
		for(CN id : v) {
			
			JSONObject cn = new JSONObject();
			
			convert(cn, "adresse", id.getAdresse());
			convert(cn, "degree_eg_md", id.getDegreeEgMD());
			convert(cn, "email", id.getEMail());
			convert(cn, "family_name", id.getFamilyName());
			convert(cn, "fax_number", id.getFaxnummer());
			convert(cn, "given_name", id.getGivenName());
			convert(cn, "id_number", id.getIDNumber());
			convert(cn, "middle_name", id.getMiddleInitialOrName());
			convert(cn, "online_number", id.getOnlineNummer());
			convert(cn, "prefix_eg_dr", id.getPrefixEgDR());
			convert(cn, "source_table_id", id.getSourceTableId());
			convert(cn, "suffix_eg_jr_iii", id.getSuffixEgJRorIII());
			convert(cn, "telephone", id.getTelefon());
			
			
			if(cn.length() > 0) e.put(cn);
			
		}
		
		if(e.length() > 0) j.accumulate(FieldMapping.get(name), e);
	}

	public static void convert(JSONObject j, String name, CM_LICENSE_NO v) {
		
		JSONObject e = new JSONObject();
		
		convert(e, "issuing_state_province_country", v.getIssuingStateProvinceCountry());
		convert(e, "license_number", v.getLicenseNumber());
		
		if(e.length() > 0) j.accumulate(FieldMapping.get(name), e);
		
	}

	public static void convert(JSONObject j, String name, CM_INTERNAL_LOCATION v) {
		
		JSONObject e = new JSONObject();
		
		convert(e, "nurse_unit_station", v.getCm_internal_location1_NurseUnitStation());
		convert(e, "room", v.getCm_internal_location2_Room());
		convert(e, "bed", v.getCm_internal_location3_Bed());
		convert(e, "facility_id", v.getCm_internal_location4_FacilityID());
		convert(e, "bed_status", v.getCm_internal_location5_BedStatus());
		convert(e, "etage", v.getCm_internal_location6_Etage());
		convert(e, "klinik", v.getCm_internal_location7_Klinik());
		convert(e, "zentrum", v.getCm_internal_location8_Zentrum());
		
		if(e.length() > 0) j.accumulate(FieldMapping.get(name), e);
		
	}

	public static void convert(JSONObject j, String name, AD[] va) {

		JSONArray a = new JSONArray();
		
		for(AD v : va) {
			
			JSONObject e = new JSONObject();
			
			convert(e, "street_address", v.getAd1_StreetAddress());
			convert(e, "other_designation", v.getAd2_OtherDesignation());
			convert(e, "city", v.getAd3_City());
			convert(e, "state_or_province", v.getAd4_StateOrProvince());
			convert(e, "zip_or_postal_code", v.getAd5_ZipOrPostalCode());
			convert(e, "country", v.getAd6_Country());
			convert(e, "type", v.getAd7_Type());
			convert(e, "other_geographic_designation", v.getAd8_OtherGeographicDesignation());
			
			if(e.length() > 0) a.put(e);
		}
		
		if(a.length() > 0) j.accumulate(FieldMapping.get(name), a);
	}

	public static void convert(JSONObject j, String name, AD v) {

		JSONObject e = new JSONObject();
		
		convert(e, "street_address", v.getAd1_StreetAddress());
		convert(e, "other_designation", v.getAd2_OtherDesignation());
		convert(e, "city", v.getAd3_City());
		convert(e, "state_or_province", v.getAd4_StateOrProvince());
		convert(e, "zip_or_postal_code", v.getAd5_ZipOrPostalCode());
		convert(e, "country", v.getAd6_Country());
		convert(e, "type", v.getAd7_Type());
		convert(e, "other_geographic_designation", v.getAd8_OtherGeographicDesignation());
		
		if(e.length() > 0) j.accumulate(FieldMapping.get(name), e);
	}

	public static void convert(JSONObject j, String name, CK v) {

		JSONObject e = new JSONObject();

		convert(e, "id_number", v.getCk1_IDNumber());
		convert(e, "check_digit", v.getCk2_CheckDigit());
		convert(e, "check_digit_scheme", v.getCk3_CheckDigitScheme());
		convert(e, "facility_id", v.getCk4_FacilityID());
		
		if(e.length() > 0) j.accumulate(FieldMapping.get(name), e);
	}

	public static void convert(JSONObject j, String name, PN[] vals) {
		
		JSONArray a = new JSONArray();
		
		for(PN v : vals) {
			
			JSONObject e = new JSONObject();

			convert(e, "degree_eg_md", v.getDegreeEgMD());
			convert(e, "family_name", v.getFamilyName());
			convert(e, "given_name", v.getGivenName());
			convert(e, "middle_name", v.getMiddleInitialOrName());
			convert(e, "prefix_eg_dr", v.getPrefixEgDR());
			convert(e, "suffix_eg_jr_iii", v.getSuffixEgJRorIII());
			
			if(e.length() > 0) a.put(e);
		}

		if(a.length() > 0) j.accumulate(FieldMapping.get(name), a);
	}

	public static void convert(JSONObject j, String name, PN v) {

		JSONObject e = new JSONObject();

		convert(e, "degree_eg_md", v.getDegreeEgMD());
		convert(e, "family_name", v.getFamilyName());
		convert(e, "given_name", v.getGivenName());
		convert(e, "middle_name", v.getMiddleInitialOrName());
		convert(e, "prefix_eg_dr", v.getPrefixEgDR());
		convert(e, "suffix_eg_jr_iii", v.getSuffixEgJRorIII());
		
		if(e.length() > 0) j.accumulate(FieldMapping.get(name), e);
	}

	public static void convert(JSONObject j, String name, CE v) {

		JSONObject e = new JSONObject();

		convert(e, "alternate_identifier", v.getAlternateIdentifier());
		convert(e, "alternate_text", v.getAlternateText());
		convert(e, "identifier", v.getIdentifier());
		convert(e, "alternate_coding_system", v.getNameOfAlternateCodingSystem());
		convert(e, "name_of_coding_system", v.getNameOfCodingSystem());
		convert(e, "text", v.getText());
		
		if(e.length() > 0) j.accumulate(FieldMapping.get(name), e);
	}

	public static void convert(JSONObject j, String name, TN[] v) {
		
		if(null == v) return;
		
		JSONArray e = new JSONArray();
		
		for(TN id : v) {
			e.put(id.getValue());
		}
		
		if(e.length() > 0) j.accumulate(FieldMapping.get(name), e);
	}

	public static void convert(JSONObject j, String name, ST[] v) {
		
		if(null == v) return;
		
		JSONArray e = new JSONArray();
		
		for(ST id : v) {
			e.put(id.getValue());
		}
		
		if(e.length() > 0) j.accumulate(FieldMapping.get(name), e);
	}

	public static void convert(JSONObject j, String name, DT[] v) {
		
		if(null == v) return;
		
		JSONArray e = new JSONArray();
		
		for(DT id : v) {
			e.put(id.getValue());
		}
		
		if(e.length() > 0) j.accumulate(FieldMapping.get(name), e);
	}

	public static void convert(JSONObject j, String name, ID[] v) {
		
		if(null == v) return;
		
		JSONArray e = new JSONArray();
		
		for(ID id : v) {
			e.put(id.getValue());
		}
		
		if(e.length() > 0) j.accumulate(FieldMapping.get(name), e);
	}

	public static void convert(JSONObject j, String name, NM[] v) {
		
		if(null == v) return;
		
		JSONArray e = new JSONArray();
		
		for(NM id : v) {
			e.put(id.getValue());
		}
		
		if(e.length() > 0) j.accumulate(FieldMapping.get(name), e);
	}

	public static void convert(JSONObject j, String name, DT v) {
		j.accumulate(FieldMapping.get(name), v.getValue());
	}

	public static void convert(JSONObject j, String name, TN v) {
		j.accumulate(FieldMapping.get(name), v.getValue());
	}

	public static void convert(JSONObject j, String name, ID v) {
		j.accumulate(FieldMapping.get(name), v.getValue());
	}

	public static void convert(JSONObject j, String name, NM v) {
		j.accumulate(FieldMapping.get(name), v.getValue());
	}

	public static void convert(JSONObject j, String name, ST v) {
		j.accumulate(FieldMapping.get(name), v.getValue());
	}

	public static void convert(JSONObject j, String name, SI v) {
		j.accumulate(FieldMapping.get(name), v.getValue());
	}

	public static void convert(JSONObject j, String name, TS v) {
		try {
			long time = v.getTs1_TimeOfAnEvent().getValueAsCalendar().getTime().getTime();
			j.accumulate(FieldMapping.get(name), time);
		} catch (Exception e) {
		}
	}

}
