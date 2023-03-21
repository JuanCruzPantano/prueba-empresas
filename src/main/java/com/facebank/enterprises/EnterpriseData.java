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

	private Double lastReportedIncome;

	private java.lang.Integer legalResponsibleCode;

	private java.lang.String managerName;

	private java.lang.String managerFirstSurname;

	private java.lang.String managerSecondSurname;

	private java.lang.String managerPosition;

	private java.lang.String managerNationality;

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

	public java.lang.Double getLastReportedIncome() {
		return this.lastReportedIncome;
	}

	public void setLastReportedIncome(java.lang.Double lastReportedIncome) {
		this.lastReportedIncome = lastReportedIncome;
	}

	public java.lang.Integer getLegalResponsibleCode() {
		return this.legalResponsibleCode;
	}

	public void setLegalResponsibleCode(java.lang.Integer legalResponsibleCode) {
		this.legalResponsibleCode = legalResponsibleCode;
	}

	public java.lang.String getManagerName() {
		return this.managerName;
	}

	public void setManagerName(java.lang.String managerName) {
		this.managerName = managerName;
	}

	public java.lang.String getManagerFirstSurname() {
		return this.managerFirstSurname;
	}

	public void setManagerFirstSurname(java.lang.String managerFirstSurname) {
		this.managerFirstSurname = managerFirstSurname;
	}

	public java.lang.String getManagerSecondSurname() {
		return this.managerSecondSurname;
	}

	public void setManagerSecondSurname(java.lang.String managerSecondSurname) {
		this.managerSecondSurname = managerSecondSurname;
	}

	public java.lang.String getManagerPosition() {
		return this.managerPosition;
	}

	public void setManagerPosition(java.lang.String managerPosition) {
		this.managerPosition = managerPosition;
	}

	public java.lang.String getManagerNationality() {
		return this.managerNationality;
	}

	public void setManagerNationality(java.lang.String managerNationality) {
		this.managerNationality = managerNationality;
	}

	public EnterpriseData(java.lang.Long id, java.lang.String startDate,
			java.lang.String nationality, java.lang.String patrimonialOrigin,
			java.lang.String legalResponsible, java.lang.String nameCompany,
			java.lang.String typeId, java.lang.Long numberId,
			java.lang.String emailCompany, java.lang.String typeBusiness,
			java.lang.String typeCompany, java.lang.String abbreviation,
			java.lang.String reasonOpening, java.lang.String sourceFound,
			java.lang.Double lastReportedIncome,
			java.lang.Integer legalResponsibleCode,
			java.lang.String managerName, java.lang.String managerFirstSurname,
			java.lang.String managerSecondSurname,
			java.lang.String managerPosition,
			java.lang.String managerNationality) {
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
		this.lastReportedIncome = lastReportedIncome;
		this.legalResponsibleCode = legalResponsibleCode;
		this.managerName = managerName;
		this.managerFirstSurname = managerFirstSurname;
		this.managerSecondSurname = managerSecondSurname;
		this.managerPosition = managerPosition;
		this.managerNationality = managerNationality;
	}

}