package model;

import exceptions.EmptyStringException;
import model.signs.Sign;
import view.MainCalcWindow;

public class MainCalcModel {

	private static MainCalcModel INSTANCE = null;
	
	private String first;
	private String second;
	private String solution;
	private Sign sign;
	private boolean focusLeft;
	
	private MainCalcWindow mainCalcWindow;
	
	private MainCalcModel() {
		first = new String();
		second = new String();
		solution = new String();
		focusLeft = true;
	}
	
	public static MainCalcModel getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new MainCalcModel();
		}
		return INSTANCE;
	}
	
	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getSecond() {
		return second;
	}

	public void setSecond(String second) {
		this.second = second;
	}

	public String getSolution() {
		return solution;
	}

	public void setSolution(String solution) {
		this.solution = solution;
	}

	public Sign getSign() {
		return sign;
	}

	public void setSign(Sign sign) {
		this.sign = sign;
		mainCalcWindow.getInstance().setSign(sign.getSign());
	}
	
	//TODO do testowania
	public void changeFocus() {
		setFocusLeft(!isFocusLeft());
	}
	
	private boolean isFocusLeft() {
		return focusLeft;
	}

	private void setFocusLeft(boolean focusLeft) {
		this.focusLeft = focusLeft;
	}
	
	//TODO do testowania
	public void count() {
		try {
			solution = Double.toString(sign == null ? 0 : sign.count(Double.parseDouble(first), Double.parseDouble(second)));
		} catch(NumberFormatException e) {
			new EmptyStringException("empty String value");
		}
		
		first = "";
		second = "";
	}
	
	//TODO do testowania
	public void refreshSolution() {
		mainCalcWindow.getInstance().setSolution(solution);
	}
	
	//TODO do testowania
	public void refreshSides() {
		refreshFirst();
		refreshSecond();
	}
	
	private void refreshFirst() {
		mainCalcWindow.getInstance().setFirst(first);
	}
	
	private void refreshSecond() {
		mainCalcWindow.getInstance().setSecond(second);
	}
	
	//TODO do testowania
	public void appendZero() {
		if (isFocusLeft()) {
			first = first.concat("0");
		} else {
			second = second.concat("0");
		}
	}
	
	//TODO do testowania
	public void appendOne() {
		if (isFocusLeft()) {
			first = first.concat("1");
		} else {
			second = second.concat("1");
		}
	}
	
	//TODO do testowania
	public void appendTwo() {
		if (isFocusLeft()) {
			first = first.concat("2");
		} else {
			second = second.concat("2");
		}
	}
	
	//TODO do testowania
	public void appendThree() {
		if (isFocusLeft()) {
			first = first.concat("3");
		} else {
			second = second.concat("3");
		}
	}
	
	//TODO do testowania
	public void appendFour() {
		if (isFocusLeft()) {
			first = first.concat("4");
		} else {
			second = second.concat("4");
		}
	}
	
	//TODO do testowania
	public void appendFive() {
		if (isFocusLeft()) {
			first = first.concat("5");
		} else {
			second = second.concat("5");
		}
	}
	
	//TODO do testowania
	public void appendSix() {
		if (isFocusLeft()) {
			first = first.concat("6");
		} else {
			second = second.concat("6");
		}
	}
	
	//TODO do testowania
	public void appendSeven() {
		if (isFocusLeft()) {
			first = first.concat("7");
		} else {
			second = second.concat("7");
		}
	}
	
	//TODO do testowania
	public void appendEight() {
		if (isFocusLeft()) {
			first = first.concat("8");
		} else {
			second = second.concat("8");
		}
	}
	
	//TODO do testowania
	public void appendNine() {
		if (isFocusLeft()) {
			first = first.concat("9");
		} else {
			second = second.concat("9");
		}
	}
}
