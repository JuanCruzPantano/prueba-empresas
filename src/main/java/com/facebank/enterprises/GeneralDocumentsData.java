package com.facebank.enterprises;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class GeneralDocumentsData implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private DocumentTypeDataList evidence;
	private DocumentTypeDataList scannedIdentifications;
	private DocumentTypeDataList affidavit;

	private com.facebank.enterprises.DocumentTypeDataList affidavitNotRelatedToGovernmentVenezuela;

	public GeneralDocumentsData() {
	}

	public com.facebank.enterprises.DocumentTypeDataList getEvidence() {
		return this.evidence;
	}

	public void setEvidence(
			com.facebank.enterprises.DocumentTypeDataList evidence) {
		this.evidence = evidence;
	}

	public com.facebank.enterprises.DocumentTypeDataList getScannedIdentifications() {
		return this.scannedIdentifications;
	}

	public void setScannedIdentifications(
			com.facebank.enterprises.DocumentTypeDataList scannedIdentifications) {
		this.scannedIdentifications = scannedIdentifications;
	}

	public com.facebank.enterprises.DocumentTypeDataList getAffidavit() {
		return this.affidavit;
	}

	public void setAffidavit(
			com.facebank.enterprises.DocumentTypeDataList affidavit) {
		this.affidavit = affidavit;
	}

	public com.facebank.enterprises.DocumentTypeDataList getAffidavitNotRelatedToGovernmentVenezuela() {
		return this.affidavitNotRelatedToGovernmentVenezuela;
	}

	public void setAffidavitNotRelatedToGovernmentVenezuela(
			com.facebank.enterprises.DocumentTypeDataList affidavitNotRelatedToGovernmentVenezuela) {
		this.affidavitNotRelatedToGovernmentVenezuela = affidavitNotRelatedToGovernmentVenezuela;
	}

	public GeneralDocumentsData(
			com.facebank.enterprises.DocumentTypeDataList evidence,
			com.facebank.enterprises.DocumentTypeDataList scannedIdentifications,
			com.facebank.enterprises.DocumentTypeDataList affidavit,
			com.facebank.enterprises.DocumentTypeDataList affidavitNotRelatedToGovernmentVenezuela) {
		this.evidence = evidence;
		this.scannedIdentifications = scannedIdentifications;
		this.affidavit = affidavit;
		this.affidavitNotRelatedToGovernmentVenezuela = affidavitNotRelatedToGovernmentVenezuela;
	}

}