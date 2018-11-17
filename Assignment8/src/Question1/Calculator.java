package Question1;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener {

	private static JTextField resultTextField;
	private JButton add, subtract, multiply, divide, compute, clear;

	private JButton numbers[];
	private Font font;

	public Calculator() {
		createComponents();
		setLayout();
		addComponents();
		addBehaviors();
		display();
	}

	private void createComponents() {
		font = new Font("TimesRoman", Font.PLAIN, 20);
		resultTextField = new JTextField(10);
		resultTextField.setFont(font);

		add = new JButton("+");
		add.setFont(font);
		subtract = new JButton("-");
		subtract.setFont(font);
		multiply = new JButton("x");
		multiply.setFont(font);
		divide = new JButton("/");
		divide.setFont(font);
		compute = new JButton("=");
		compute.setFont(font);
		clear = new JButton("C");
		clear.setFont(font);

		numbers = new JButton[10];
		for (int i = 0; i < 10; i++) {
			numbers[i] = new JButton(i + "");
			numbers[i].setFont(font);
		}
	}

	private void setLayout() {
		GridLayout gl = new GridLayout(6, 1);
		Container c = this.getContentPane();
		c.setLayout(gl);

	}

	private void addComponents() {
		Container c = getContentPane();
		c.add(resultTextField);

		JPanel p = new JPanel();
		p.add(numbers[7]);
		p.add(numbers[8]);
		p.add(numbers[9]);
		p.add(multiply);
		c.add(p);

		p = new JPanel();
		p.add(numbers[4]);
		p.add(numbers[5]);
		p.add(numbers[6]);
		p.add(divide);
		c.add(p);

		p = new JPanel();
		p.add(numbers[1]);
		p.add(numbers[2]);
		p.add(numbers[3]);
		p.add(subtract);
		c.add(p);

		p = new JPanel();
		p.add(clear);
		p.add(numbers[0]);
		p.add(compute);
		p.add(add);
		c.add(p);

	}

	public void addBehaviors() {
		compute.addActionListener(this);
		for (int i = 0; i < 10; i++) {
			numbers[i].addActionListener(this);
		}

		add.addActionListener(this);
		subtract.addActionListener(this);
		multiply.addActionListener(this);
		divide.addActionListener(this);
		clear.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if (command.charAt(0) == 'C') {
			resultTextField.setText("");
		} else if (command.charAt(0) == '=') {
			resultTextField.setText(evaluate(resultTextField.getText()));
		} else {
			resultTextField.setText(resultTextField.getText() + command);
		}
	}

	public static String evaluate(String input) {
		char[] value = input.toCharArray();
		String first = "";
		String second = "";
		String operator = "";

		for (int i = 0; i < value.length; i++) {
			System.out.println(value[i]);
			if (value[i] >= '0' && value[i] <= '9') {

				if (operator.isEmpty()) {
					first += value[i];
				} else {
					second += value[i];
				}
			}
			if (value[i] == '+' || value[i] == '-' || value[i] == '/' || value[i] == '*') {
				operator += value[i];
			}

		}

		double result = 0;
		if (operator.equals("+")) {

			result = Double.parseDouble(first) + Double.parseDouble(second);
		}
		if (operator.equals("-")) {
			result = Double.parseDouble(first) - Double.parseDouble(second);
		}
		if (operator.equals("/")) {
			result = Double.parseDouble(first) / Double.parseDouble(second);
		}
		if (operator.equals("*")) {
			result = Double.parseDouble(first) * Double.parseDouble(second);
		}

		resultTextField.setText(result + "");
		return String.valueOf(result);

	}

	private void display() {
		setSize(300, 300);
		setVisible(true);
	}
}
