package test.controler;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.MissingFormatArgumentException;

import org.junit.Test;

import controler.DigitsController;
import model.MainCalcModel;

public class DigitsControllerTest {

	@Test
	public void aaaaaaainitialFocusTest() {//wymaga wyjaœnienia
		//when, then
		MainCalcModel mainCalcModel = MainCalcModel.getInstance();
		//given
		assertTrue(mainCalcModel.isFocusLeft());
	}
	
	@Test
	public void changeFocusTest() {
		//when
		MainCalcModel mainCalcModel = MainCalcModel.getInstance();
		boolean startFocus = mainCalcModel.isFocusLeft();
		//then
		mainCalcModel.changeFocus();
		//given
		assertTrue(startFocus != mainCalcModel.isFocusLeft());
	}
	
	@Test
	public void zeroPressedTest() {
		//when
		DigitsController digitsController = DigitsController.getInstance();
		MainCalcModel mainCalcModel = MainCalcModel.getInstance();
		String first = "321654";
		String second = "654987";
		mainCalcModel.setFirst(first);
		mainCalcModel.setSecond("");
		boolean startFocus = mainCalcModel.isFocusLeft();
		//then
		digitsController.zeroPressed();
		//given
		if (startFocus) {
			assertTrue(mainCalcModel.getFirst().charAt(mainCalcModel.getFirst().length() - 1)
					== '0');
			//assertTrue(mainCalcModel.getSecond().equals("0"));
		} else {
			assertTrue(mainCalcModel.getSecond().charAt(mainCalcModel.getSecond().length() - 1)
					== '0');
			//assertTrue(mainCalcModel.getFirst().equals("0"));
		}
		
	}
	
}
