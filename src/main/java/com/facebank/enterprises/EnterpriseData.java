package com.facebank.enterprises;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class EnterpriseData implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(generator = "ENTERPRISEDATA_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "ENTERPRISEDATA_ID_SEQ", name = "ENTERPRISEDATA_ID_GENERATOR")
	private java.lang.Long id;

	private String startDate;

	private String nationality;

	private java.lang.String patrimonialOrigin;

	private java.lang.String legalResponsible;

	private java.lang.String nameCompany;

	@org.kie.api.definition.type.Description("J - Persona Jurídica\nF - Persona Física")
	private java.lang.String typeId;

	private Long numberId;

	private java.lang.String emailCompany;

	private String typeBusiness;

	private String typeCompany;

	@org.kie.api.definition.type.Description("Siglas")
	private java.lang.String abbreviation;

	private String reasonOpening;

	private String sourceFound;

	public EnterpriseData() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(java.lang.String startDate) {
		this.startDate = startDate;
	}

	public java.lang.String getPatrimonialOrigin() {
		return this.patrimonialOrigin;
	}

	public void setPatrimonialOrigin(java.lang.String patrimonialOrigin) {
		this.patrimonialOrigin = patrimonialOrigin;
	}

	public java.lang.String getLegalResponsible() {
		return this.legalResponsible;
	}

	public void setLegalResponsible(java.lang.String legalResponsible) {
		this.legalResponsible = legalResponsible;
	}

	public java.lang.String getNameCompany() {
		return this.nameCompany;
	}

	public void setNameCompany(java.lang.String nameCompany) {
		this.nameCompany = nameCompany;
	}

	public java.lang.String getTypeId() {
		return this.typeId;
	}

	public void setTypeId(java.lang.String typeId) {
		this.typeId = typeId;
	}

	public java.lang.String getEmailCompany() {
		return this.emailCompany;
	}

	public void setEmailCompany(java.lang.String emailCompany) {
		this.emailCompany = emailCompany;
	}

	public java.lang.String getAbbreviation() {
		return this.abbreviation;
	}

	public void setAbbreviation(java.lang.String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public java.lang.Long getNumberId() {
		return this.numberId;
	}

	public void setNumberId(java.lang.Long numberId) {
		this.numberId = numberId;
	}

	public java.lang.String getNationality() {
		return this.nationality;
	}

	public void setNationality(java.lang.String nationality) {
		this.nationality = nationality;
	}

	public java.lang.String getTypeBusiness() {
		return this.typeBusiness;
	}

	public void setTypeBusiness(java.lang.String typeBusiness) {
		this.typeBusiness = typeBusiness;
	}

	public java.lang.String getTypeCompany() {
		return this.typeCompany;
	}

	public void setTypeCompany(java.lang.String typeCompany) {
		this.typeCompany = typeCompany;
	}

	public java.lang.String getReasonOpening() {
		return this.reasonOpening;
	}

	public void setReasonOpening(java.lang.String reasonOpening) {
		this.reasonOpening = reasonOpening;
	}

	public java.lang.String getSourceFound() {
		return this.sourceFound;
	}

	public void setSourceFound(java.lang.String sourceFound) {
		this.sourceFound = sourceFound;
	}

	public EnterpriseData(java.lang.Long id, java.lang.String startDate,
			java.lang.String nationality, java.lang.String patrimonialOrigin,
			java.lang.String legalResponsible, java.lang.String nameCompany,
			java.lang.String typeId, java.lang.Long numberId,
			java.lang.String emailCompany, java.lang.String typeBusiness,
			java.lang.String typeCompany, java.lang.String abbreviation,
			java.lang.String reasonOpening, java.lang.String sourceFound) {
		this.id = id;
		this.startDate = startDate;
		this.nationality = nationality;
		this.patrimonialOrigin = patrimonialOrigin;
		this.legalResponsible = legalResponsible;
		this.nameCompany = nameCompany;
		this.typeId = typeId;
		this.numberId = numberId;
		this.emailCompany = emailCompany;
		this.typeBusiness = typeBusiness;
		this.typeCompany = typeCompany;
		this.abbreviation = abbreviation;
		this.reasonOpening = reasonOpening;
		this.sourceFound = sourceFound;
	}

}