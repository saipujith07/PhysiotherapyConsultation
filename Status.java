package com.psic;

public class Status {

	private String appointmentStatus;

	public String getAppointmentStatus() {
		return appointmentStatus;
	}

	public void setAppointmentStatus(String appointmentStatus) {
		this.appointmentStatus = appointmentStatus;
	}

	public Status(String appointmentStatus) {
		super();
		this.appointmentStatus = appointmentStatus;
	}

	@Override
	public String toString() {
		return "Status [appointmentStatus=" + appointmentStatus + "]";
	}

}
