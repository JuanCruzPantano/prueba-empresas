package com.facebank.enterprises;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class InterviewData implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.Column(length = 300)
	private java.lang.String comment;

	public InterviewData() {
	}

	public java.lang.String getComment() {
		return this.comment;
	}

	public void setComment(java.lang.String comment) {
		this.comment = comment;
	}

	public InterviewData(java.lang.String comment) {
		this.comment = comment;
	}

}