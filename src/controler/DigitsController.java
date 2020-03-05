package controler;

import model.MainCalcModel;

public class DigitsController {

	private MainCalcModel mainCalcModel;
	
	private static DigitsController INSTANCE;
	
	private DigitsController() {}
	
	public static DigitsController getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new DigitsController();
		}
		return INSTANCE;
	}
	
	//TODO do testowania
	public void zeroPressed() {
		mainCalcModel.getInstance().appendZero();
		mainCalcModel.getInstance().refreshSides();
	}
	
	//TODO do testowania
	public void onePressed() {
		mainCalcModel.getInstance().appendOne();
		mainCalcModel.getInstance().refreshSides();
	}
	
	//TODO do testowania
	public void twoPressed() {
		mainCalcModel.getInstance().appendTwo();
		mainCalcModel.getInstance().refreshSides();
	}
	
	//TODO do testowania
	public void threePressed() {
		mainCalcModel.getInstance().appendThree();
		mainCalcModel.getInstance().refreshSides();
	}
	
	//TODO do testowania
	public void fourPressed() {
		mainCalcModel.getInstance().appendFour();
		mainCalcModel.getInstance().refreshSides();
	}
	
	//TODO do testowania
	public void fivePressed() {
		mainCalcModel.getInstance().appendFive();
		mainCalcModel.getInstance().refreshSides();
	}
	
	//TODO do testowania
	public void sixPressed() {
		mainCalcModel.getInstance().appendSix();
		mainCalcModel.getInstance().refreshSides();
	}
	
	//TODO do testowania
	public void sevenPressed() {
		mainCalcModel.getInstance().appendSeven();
		mainCalcModel.getInstance().refreshSides();
	}
	
	//TODO do testowania
	public void eightPressed() {
		mainCalcModel.getInstance().appendEight();
		mainCalcModel.getInstance().refreshSides();
	}
	
	//TODO do testowania
	public void ninePressed() {
		mainCalcModel.getInstance().appendNine();
		mainCalcModel.getInstance().refreshSides();
	}
}
