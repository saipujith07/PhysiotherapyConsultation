package com.psic;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		int patientID = 0;
		String patientName;
		String patientAddress;
		int patientPhNumber;
		String physicianName;
		String disease;
		String status;
		String time;

		int count = 0;
		char otherchoice = 'Y';

		Patient p[] = new Patient[10];
		Visitor v[] = new Visitor[5];
		PhysiciansTT tt = new PhysiciansTT();

		while (otherchoice == 'Y') {
			Scanner scanner = new Scanner(System.in);
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("           Welcome to Physiotherapy & Sports Injury Centre (PSIC)");
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("1: TT Chart of treatment offered by each Physician");
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("2: Patient Book Appointment");
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("3: Book Consultation Appointment");
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("4: Update Appointment Status");
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("5: View History of Patient");
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("6: Exist Application");
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("                  Please Feel Free to Choice the Service's");
			System.out.println("******************************************************************************");

			int choice = scanner.nextInt();

			switch (choice) {

			case 1:
				tt.displaytime4week();
				break;

			case 2:
				System.out.println("*****Book Appointment*****");
				System.out.println("Patient ID: ");
				patientID = scanner.nextInt();
				System.out.println("Patient Name: ");
				patientName = scanner.next();
				System.out.println("Patient Address: ");
				patientAddress = scanner.next();
				System.out.println("Patient Phone Number: ");
				patientPhNumber = scanner.nextInt();
				System.out.println("Physician name: ");
				physicianName = scanner.next();
				System.out.println("Treatment provided: ");
				disease = scanner.next();
				System.out.println("Appointment Status");
				status = scanner.next();

				p[count] = new Patient(patientID, patientName, patientAddress, patientPhNumber, physicianName, disease,
						status);
				count++;
				System.out.println("Appointment Booked Successfully..!!");
				break;

			case 3:
				System.out.println("*****Consultation Appointment*****");
				System.out.println("Patient Name: ");
				patientName = scanner.next();
				System.out.println("Physician name: ");
				physicianName = scanner.next();
				System.out.println("Treatment: ");
				disease = scanner.next();
				System.out.println("Time: ");
				time = scanner.next();

				v[count] = new Visitor(patientName, physicianName, disease, time);
				count++;
				System.out.println("Appointment Booked Successfully..!!");
				break;

			case 4:
				System.out.println("*****Update Appointment Status*****");
				System.out.println("Do you want to 'CANCEL' OR 'REBOOK' the Appointment");
				System.out.println("Patient ID: ");
				patientID = scanner.nextInt();
				for (int i = 0; i < count; i++) {
					if (p[i] != null && p[i].getPatientID() == patientID) {
						System.out.println("Appointment Status: ");
						status = scanner.next();
						if (status.equals("CANCEL"))
							System.out.println("Appointment is Cancelled Successfully..!!");
						else
							System.out.println("Appointment is Rescheduled Successfully..!!");
						p[i].setStatus(status);
					}
				}
				break;

			case 5:
				System.out.println("*****View Patient Details*****");
				System.out.println("Patient ID: ");
				patientID = scanner.nextInt();
				for (int i = 0; i < count; i++) {
					if (p[i] != null && p[i].getPatientID() == patientID) {

						System.out.println("Patient ID: " + p[i].getPatientID());
						System.out.println("Patient Name: " + p[i].getPatientName());
						System.out.println("Patient Address: " + p[i].getPatientAddress());
						System.out.println("Patient Phone Number: " + p[i].getPatientPhNumber());
						System.out.println("Physician: " + p[i].getPatientName());
						System.out.println("Treatment: " + p[i].getDisease());
						System.out.println("Appointment Status: " + p[i].getStatus());

					} else {
						System.out.println("Patient ID is invalid :" + patientID);
					}
				}
				break;
			case 6:
				System.out.println("Thank you for using Physiotherapy & Sports Injury Centre (PSIC) Application...!!!");
				break;

			default:
				System.out.println("Sorry...!! You enter a worng choice...!!");
				System.out.println("Thank You...!! Please try again...!!");
				break;

			}
			System.out.println("Do you like to continue...!!");
			otherchoice = scanner.next().charAt(0);
			if (Character.isLowerCase(otherchoice)) {
				otherchoice = Character.toUpperCase(otherchoice);
			}

		}
	}
}
