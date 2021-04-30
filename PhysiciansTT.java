package com.psic;

import java.awt.Frame;

import javax.swing.*;

public class PhysiciansTT {

	Frame f;

	public void displaytime4week() {
		f = new JFrame();
		String data[][] = { { "101", "Amit", "Lodon", "9789865", "Osteopathy", "03-05-2021" },
				{ "102", "Jai", "Lodon", "9789865", "Rehabilitation", "04-05-2021" },
				{ "103", "Henry", "Lodon", "9789865", "Neurology", "05-05-2021" },
				{ "104", "Samad", "Lodon", "9789865", "Paediatrics", "06-05-2021" },
				{ "105", "John", "Lodon", "9789865", "Geriatrics", "07-05-2021" },
				{ "106", "Kareena", "Lodon", "9789865", "Paediatrics", "10-05-2021" },
				{ "107", "Ranbir", "Hereford", "9789865", "Rehabilitation", "13-05-2021" }

		};
		String column[] = { "Physician ID", "Physician Name", "Physician Address", "Physician PhNumber", "Specialized",
				"Work Date" };
		JTable jt = new JTable(data, column);
		jt.setBounds(30, 40, 500, 100);
		JScrollPane sp = new JScrollPane(jt);
		f.add(sp);
		f.setSize(700, 200);
		f.setVisible(true);
	}

}
