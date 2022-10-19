package com.facebank.enterprises;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class InitialData implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String bdfEmail;
	private java.lang.String bdfLoginName;
	private java.lang.String bdfName;
	private java.lang.String email;
	@javax.persistence.Id
	@javax.persistence.GeneratedValue(generator = "INITIALDATA_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
	@javax.persistence.SequenceGenerator(sequenceName = "INITIALDATA_ID_SEQ", name = "INITIALDATA_ID_GENERATOR")
	private java.lang.Long id;
	private java.lang.String languageBDF;
	private java.lang.String languageClient;
	private java.lang.String login;
	@javax.persistence.ElementCollection(fetch = javax.persistence.FetchType.EAGER)
	private java.util.List<java.lang.Integer> rolIds;

	private java.lang.String surnameAdmin;

	private java.lang.String nameAdmin;

	private java.lang.String acronym;

	private java.lang.String nationality;

	private java.lang.String agency;

	private java.lang.String executive;

	private java.lang.String companyName;

	private java.lang.String mainPhone;

	private java.lang.String otherPhone;

	private java.lang.String codeEntity;

	private java.lang.String nameEntity;

	private java.lang.String surNameEntity;

	private java.lang.String secondSurNameEntity;

	public InitialData() {
	}

	public java.lang.String getBdfEmail() {
		return this.bdfEmail;
	}

	public void setBdfEmail(java.lang.String bdfEmail) {
		this.bdfEmail = bdfEmail;
	}

	public java.lang.String getBdfLoginName() {
		return this.bdfLoginName;
	}

	public void setBdfLoginName(java.lang.String bdfLoginName) {
		this.bdfLoginName = bdfLoginName;
	}

	public java.lang.String getBdfName() {
		return this.bdfName;
	}

	public void setBdfName(java.lang.String bdfName) {
		this.bdfName = bdfName;
	}

	public java.lang.String getEmail() {
		return this.email;
	}

	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getLanguageBDF() {
		return this.languageBDF;
	}

	public void setLanguageBDF(java.lang.String languageBDF) {
		this.languageBDF = languageBDF;
	}

	public java.lang.String getLanguageClient() {
		return this.languageClient;
	}

	public void setLanguageClient(java.lang.String languageClient) {
		this.languageClient = languageClient;
	}

	public java.lang.String getLogin() {
		return this.login;
	}

	public void setLogin(java.lang.String login) {
		this.login = login;
	}

	public java.util.List<java.lang.Integer> getRolIds() {
		return this.rolIds;
	}

	public void setRolIds(java.util.List<java.lang.Integer> rolIds) {
		this.rolIds = rolIds;
	}

	public java.lang.String getSurnameAdmin() {
		return this.surnameAdmin;
	}

	public void setSurnameAdmin(java.lang.String surnameAdmin) {
		this.surnameAdmin = surnameAdmin;
	}

	public java.lang.String getNameAdmin() {
		return this.nameAdmin;
	}

	public void setNameAdmin(java.lang.String nameAdmin) {
		this.nameAdmin = nameAdmin;
	}

	public java.lang.String getAcronym() {
		return this.acronym;
	}

	public void setAcronym(java.lang.String acronym) {
		this.acronym = acronym;
	}

	public java.lang.String getNationality() {
		return this.nationality;
	}

	public void setNationality(java.lang.String nationality) {
		this.nationality = nationality;
	}

	public java.lang.String getAgency() {
		return this.agency;
	}

	public void setAgency(java.lang.String agency) {
		this.agency = agency;
	}

	public java.lang.String getExecutive() {
		return this.executive;
	}

	public void setExecutive(java.lang.String executive) {
		this.executive = executive;
	}

	public java.lang.String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(java.lang.String companyName) {
		this.companyName = companyName;
	}

	public java.lang.String getMainPhone() {
		return this.mainPhone;
	}

	public void setMainPhone(java.lang.String mainPhone) {
		this.mainPhone = mainPhone;
	}

	public java.lang.String getOtherPhone() {
		return this.otherPhone;
	}

	public void setOtherPhone(java.lang.String otherPhone) {
		this.otherPhone = otherPhone;
	}

	public java.lang.String getCodeEntity() {
		return this.codeEntity;
	}

	public void setCodeEntity(java.lang.String codeEntity) {
		this.codeEntity = codeEntity;
	}

	public java.lang.String getNameEntity() {
		return this.nameEntity;
	}

	public void setNameEntity(java.lang.String nameEntity) {
		this.nameEntity = nameEntity;
	}

	public java.lang.String getSurNameEntity() {
		return this.surNameEntity;
	}

	public void setSurNameEntity(java.lang.String surNameEntity) {
		this.surNameEntity = surNameEntity;
	}

	public java.lang.String getSecondSurNameEntity() {
		return this.secondSurNameEntity;
	}

	public void setSecondSurNameEntity(java.lang.String secondSurNameEntity) {
		this.secondSurNameEntity = secondSurNameEntity;
	}

	public InitialData(java.lang.String bdfEmail,
			java.lang.String bdfLoginName, java.lang.String bdfName,
			java.lang.String email, java.lang.Long id,
			java.lang.String languageBDF, java.lang.String languageClient,
			java.lang.String login, java.util.List<java.lang.Integer> rolIds,
			java.lang.String surnameAdmin, java.lang.String nameAdmin,
			java.lang.String acronym, java.lang.String nationality,
			java.lang.String agency, java.lang.String executive,
			java.lang.String companyName, java.lang.String mainPhone,
			java.lang.String otherPhone, java.lang.String codeEntity,
			java.lang.String nameEntity, java.lang.String surNameEntity,
			java.lang.String secondSurNameEntity) {
		this.bdfEmail = bdfEmail;
		this.bdfLoginName = bdfLoginName;
		this.bdfName = bdfName;
		this.email = email;
		this.id = id;
		this.languageBDF = languageBDF;
		this.languageClient = languageClient;
		this.login = login;
		this.rolIds = rolIds;
		this.surnameAdmin = surnameAdmin;
		this.nameAdmin = nameAdmin;
		this.acronym = acronym;
		this.nationality = nationality;
		this.agency = agency;
		this.executive = executive;
		this.companyName = companyName;
		this.mainPhone = mainPhone;
		this.otherPhone = otherPhone;
		this.codeEntity = codeEntity;
		this.nameEntity = nameEntity;
		this.surNameEntity = surNameEntity;
		this.secondSurNameEntity = secondSurNameEntity;
	}

}