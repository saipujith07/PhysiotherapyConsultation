package com.psic;

public class Patient {

	private int patientID;
	private String patientName;
	private String patientAddress;
	private int patientPhNumber;
	private String physicianName;
	private String disease;
	private String status;

	public int getPatientID() {
		return patientID;
	}

	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientAddress() {
		return patientAddress;
	}

	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}

	public int getPatientPhNumber() {
		return patientPhNumber;
	}

	public void setPatientPhNumber(int patientPhNumber) {
		this.patientPhNumber = patientPhNumber;
	}

	public String getPhysicianName() {
		return physicianName;
	}

	public void setPhysicianName(String physicianName) {
		this.physicianName = physicianName;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Patient(int patientID, String patientName, String patientAddress, int patientPhNumber, String physicianName,
			String disease, String status) {
		super();
		this.patientID = patientID;
		this.patientName = patientName;
		this.patientAddress = patientAddress;
		this.patientPhNumber = patientPhNumber;
		this.physicianName = physicianName;
		this.disease = disease;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Patient [patientID=" + patientID + ", patientName=" + patientName + ", patientAddress=" + patientAddress
				+ ", patientPhNumber=" + patientPhNumber + ", physicianName=" + physicianName + ", disease=" + disease
				+ ", status=" + status + "]";
	}

}