package model.signs;

public class Minus implements Sign {

	private static final String sign = "-";
	
	@Override
	public double count(double x, double y) {
		return x - y;
	}

	public String getSign() {
		return sign;
	}

}
