package com.facebank.enterprises;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class TransactionalData implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.util.List<com.facebank.enterprises.SenderData> senderData;

	private java.util.List<com.facebank.enterprises.ReceiverData> receiverData;

	private Long transfersToSentNumber;

	private Long transfersToSentAmount;

	private Long internalTransfersToSentNumber;

	private Long internalTransfersToSentAmount;

	private Long transfersToReceiveNumber;

	private Long transfersToReceiveAmount;

	private Long internalTransfersToReceiveNumber;

	private Long internalTransfersToReceiveAmount;

	public TransactionalData() {
	}

	public java.util.List<com.facebank.enterprises.SenderData> getSenderData() {
		return this.senderData;
	}

	public void setSenderData(
			java.util.List<com.facebank.enterprises.SenderData> senderData) {
		this.senderData = senderData;
	}

	public java.util.List<com.facebank.enterprises.ReceiverData> getReceiverData() {
		return this.receiverData;
	}

	public void setReceiverData(
			java.util.List<com.facebank.enterprises.ReceiverData> receiverData) {
		this.receiverData = receiverData;
	}

	public java.lang.Long getTransfersToSentNumber() {
		return this.transfersToSentNumber;
	}

	public void setTransfersToSentNumber(java.lang.Long transfersToSentNumber) {
		this.transfersToSentNumber = transfersToSentNumber;
	}

	public java.lang.Long getTransfersToSentAmount() {
		return this.transfersToSentAmount;
	}

	public void setTransfersToSentAmount(java.lang.Long transfersToSentAmount) {
		this.transfersToSentAmount = transfersToSentAmount;
	}

	public java.lang.Long getInternalTransfersToSentNumber() {
		return this.internalTransfersToSentNumber;
	}

	public void setInternalTransfersToSentNumber(
			java.lang.Long internalTransfersToSentNumber) {
		this.internalTransfersToSentNumber = internalTransfersToSentNumber;
	}

	public java.lang.Long getInternalTransfersToSentAmount() {
		return this.internalTransfersToSentAmount;
	}

	public void setInternalTransfersToSentAmount(
			java.lang.Long internalTransfersToSentAmount) {
		this.internalTransfersToSentAmount = internalTransfersToSentAmount;
	}

	public java.lang.Long getTransfersToReceiveNumber() {
		return this.transfersToReceiveNumber;
	}

	public void setTransfersToReceiveNumber(
			java.lang.Long transfersToReceiveNumber) {
		this.transfersToReceiveNumber = transfersToReceiveNumber;
	}

	public java.lang.Long getTransfersToReceiveAmount() {
		return this.transfersToReceiveAmount;
	}

	public void setTransfersToReceiveAmount(
			java.lang.Long transfersToReceiveAmount) {
		this.transfersToReceiveAmount = transfersToReceiveAmount;
	}

	public java.lang.Long getInternalTransfersToReceiveNumber() {
		return this.internalTransfersToReceiveNumber;
	}

	public void setInternalTransfersToReceiveNumber(
			java.lang.Long internalTransfersToReceiveNumber) {
		this.internalTransfersToReceiveNumber = internalTransfersToReceiveNumber;
	}

	public java.lang.Long getInternalTransfersToReceiveAmount() {
		return this.internalTransfersToReceiveAmount;
	}

	public void setInternalTransfersToReceiveAmount(
			java.lang.Long internalTransfersToReceiveAmount) {
		this.internalTransfersToReceiveAmount = internalTransfersToReceiveAmount;
	}

	public TransactionalData(
			java.util.List<com.facebank.enterprises.SenderData> senderData,
			java.util.List<com.facebank.enterprises.ReceiverData> receiverData,
			java.lang.Long transfersToSentNumber,
			java.lang.Long transfersToSentAmount,
			java.lang.Long internalTransfersToSentNumber,
			java.lang.Long internalTransfersToSentAmount,
			java.lang.Long transfersToReceiveNumber,
			java.lang.Long transfersToReceiveAmount,
			java.lang.Long internalTransfersToReceiveNumber,
			java.lang.Long internalTransfersToReceiveAmount) {
		this.senderData = senderData;
		this.receiverData = receiverData;
		this.transfersToSentNumber = transfersToSentNumber;
		this.transfersToSentAmount = transfersToSentAmount;
		this.internalTransfersToSentNumber = internalTransfersToSentNumber;
		this.internalTransfersToSentAmount = internalTransfersToSentAmount;
		this.transfersToReceiveNumber = transfersToReceiveNumber;
		this.transfersToReceiveAmount = transfersToReceiveAmount;
		this.internalTransfersToReceiveNumber = internalTransfersToReceiveNumber;
		this.internalTransfersToReceiveAmount = internalTransfersToReceiveAmount;
	}

}