package com.psic;

public class Doctor {

	private int id;
	private String doctorName;
	private String treatment;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getTreatment() {
		return treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

	public Doctor(int id, String doctorName, String treatment) {
		super();
		this.id = id;
		this.doctorName = doctorName;
		this.treatment = treatment;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", doctorName=" + doctorName + ", treatment=" + treatment + "]";
	}

}
