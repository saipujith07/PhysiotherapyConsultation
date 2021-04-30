package com.psic;

public class Visitor {

	private String visitorName;
	private String physicianName;
	private String disease;
	private String time;

	public String getVisitorName() {
		return visitorName;
	}

	public void setVisitorName(String visitorName) {
		this.visitorName = visitorName;
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

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Visitor(String visitorName, String physicianName, String disease, String time) {
		super();
		this.visitorName = visitorName;
		this.physicianName = physicianName;
		this.disease = disease;
		this.time = time;
	}

	@Override
	public String toString() {
		return "Visitor [visitorName=" + visitorName + ", physicianName=" + physicianName + ", disease=" + disease
				+ ", time=" + time + "]";
	}

}
