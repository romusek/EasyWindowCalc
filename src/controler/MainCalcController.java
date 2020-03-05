package controler;

import model.MainCalcModel;
import model.signs.Devide;
import model.signs.Minus;
import model.signs.Multiply;
import model.signs.Plus;

public class MainCalcController {
	
	private static MainCalcController INSTANCE;

	private MainCalcModel mainCalcModel;
	
	private MainCalcController() {}
	
	public static MainCalcController getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new MainCalcController();
		}
		return INSTANCE;
	}
	
	//TODO do testowania
	public void multiplyPressed() {
		mainCalcModel.getInstance().setSign(new Multiply());
		
	}
	
	//TODO do testowania
	public void devidePressed() {
		mainCalcModel.getInstance().setSign(new Devide());
	}
	
	//TODO do testowania
	public void plusPressed() {
		mainCalcModel.getInstance().setSign(new Plus());
	}
	
	//TODO do testowania
	public void minusPressed() {
		mainCalcModel.getInstance().setSign(new Minus());
	}
	
	//TODO do testowania
	public void equalsPressed() {
		mainCalcModel.getInstance().count();
		mainCalcModel.getInstance().refreshSolution();
	}
	
	//TODO do testowania
	public void changeFocusePressed() {
		mainCalcModel.getInstance().changeFocus();
	}
}
