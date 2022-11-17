package com.facebank.enterprises;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class DocumentTypeData implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String nameDocument;
	private java.lang.String idDocument;

	private java.lang.String reported;

	private java.lang.String idFolder;

	public DocumentTypeData() {
	}

	public java.lang.String getNameDocument() {
		return this.nameDocument;
	}

	public void setNameDocument(java.lang.String nameDocument) {
		this.nameDocument = nameDocument;
	}

	public java.lang.String getIdDocument() {
		return this.idDocument;
	}

	public void setIdDocument(java.lang.String idDocument) {
		this.idDocument = idDocument;
	}

	public java.lang.String getReported() {
		return this.reported;
	}

	public void setReported(java.lang.String reported) {
		this.reported = reported;
	}

	public java.lang.String getIdFolder() {
		return this.idFolder;
	}

	public void setIdFolder(java.lang.String idFolder) {
		this.idFolder = idFolder;
	}

	public DocumentTypeData(java.lang.String nameDocument,
			java.lang.String idDocument, java.lang.String reported,
			java.lang.String idFolder) {
		this.nameDocument = nameDocument;
		this.idDocument = idDocument;
		this.reported = reported;
		this.idFolder = idFolder;
	}

}