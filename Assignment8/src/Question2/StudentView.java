package Question2;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class StudentView extends JFrame {

	private JTextField FirstName, LastName, StudentID;
	private JButton Register, View;
	private Font font;
	ButtonGroup studentGender;
	private JRadioButton Male, Female;
	StudentController Controller;
	JLabel label; 

	public StudentView() {
		Controller = new StudentController();
		createComponents();
		setLayout();
		setActionListener();
	}

	private void createComponents() {

		font = new Font("TimesRoman", Font.PLAIN, 20);
		StudentID = new JTextField(10);
		StudentID.setFont(font);
		FirstName = new JTextField(10);
		FirstName.setFont(font);
		LastName = new JTextField(10);
		LastName.setFont(font);
		Register = new JButton("Register");
		Register.setFont(font);
		View = new JButton("View");
		View.setFont(font);
		label= new JLabel("Student registered successfully");
		label.setVisible(false);
		label.setForeground(Color.blue);
		Male = new JRadioButton("Male");
		Female = new JRadioButton("Female");
		studentGender = new ButtonGroup();
		studentGender.add(Male);
		studentGender.add(Female);

	}

	private void setLayout() {
		JFrame frame = new JFrame();
		frame.setTitle("Northeastern University");
		font = new Font("TimesRoman", Font.PLAIN, 20);
		JLabel heading = new JLabel("Student Registarion");
		heading.setFont(font);
		JLabel firstname = new JLabel("First Name:");
		JLabel lastname = new JLabel("Last Name:");
		JLabel id = new JLabel("Student ID:");
		JLabel g = new JLabel("Gender:");
		frame.setSize(500, 500);
		frame.setVisible(true);
		Container c = frame.getContentPane();
		GridLayout gl = new GridLayout(7, 1);
		c.setLayout(gl);

		JPanel p = new JPanel();
		//p.setBackground(Color.DARK_GRAY);
		p = new JPanel();
		p.add(heading);
		c.add(p);

		p = new JPanel();
		p.add(id);
		p.add(StudentID);
		c.add(p);

		p = new JPanel();
		p.add(firstname);
		p.add(FirstName);
		c.add(p);

		p = new JPanel();
		p.add(lastname);
		p.add(LastName);
		c.add(p);

		p = new JPanel();
		p.add(g);
		p.add(Male);
		p.add(Female);
		c.add(p);

		p = new JPanel();
		p.add(Register);
		p.add(View);
		c.add(p);
		
		p = new JPanel();
		p.add(label);
		c.add(p);

	}

	public void setActionListener() {
		Register.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = StudentID.getText();
				String firstname = FirstName.getText();
				String lastname = LastName.getText();
				String gender = "";
				if (Male.isSelected()) {
					gender = "MALE";
				} else {
					gender = "FEMALE";
				}

				Controller.addStudent(id, firstname, lastname, gender);
				label.setVisible(true);
			}
		});
		View.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				Vector<StudentModel> listOfStudents = Controller.getVec();
				DefaultTableModel tableModel = new DefaultTableModel(0, 4);

				String[] heading = { "Student ID", "First Name", "Last Name", "Gender" };

				tableModel.addRow(heading);
				listOfStudents.forEach(model -> {
					String[] column = new String[4];
					column[0] = model.getStudentID();
					column[1] = model.getFirstName();
					column[2] = model.getLastName();
					column[3] = model.getGender().name();

					System.out.println(column[0] + " " + column[1] + " " + column[2] + " " + column[3]);
					tableModel.addRow(column);
				});

				JTable jTable = new JTable(tableModel);
				jTable.setSize(new Dimension(600, 600));
				jTable.setRowHeight(50);
				jTable.setFont(new Font("TimesRoman", Font.BOLD, 10));
				JFrame frame1 = new JFrame();
				frame1.setTitle("View registered students");
				frame1.setSize(500, 500);
				frame1.setVisible(true);
				Container container = frame1.getContentPane();
				FlowLayout fl = new FlowLayout();
				container.setLayout(fl);
				container.add(jTable);
			}
		});

	}

}
