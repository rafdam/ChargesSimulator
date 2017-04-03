package model;

public class StationaryCharge {
		
		public double getX() {
			return xCord;
		}

		public void setX(double x) {
			xCord = x;
		}

		public double getY() {
			return yCord;
		}

		public void setY(double y) {
			yCord = y;
		}

		public double getZ() {
			return zCord;
		}

		public void setZ(double z) {
			zCord = z;
		}

		public double getValue() {
			return value;
		}

		public void setValue(double value) {
			this.value = value;
		}
		double xCord = 0;
		double yCord = 0;
		double zCord = 0;
		double value = 0;

	public StationaryCharge(){
		xCord= 0;
		yCord = 0;
		zCord = 0;
		value = 0;
	}
	public StationaryCharge(double a, double b, double c, double d) {
		xCord=a;
		yCord=b;
		zCord=c;
		value=d;
	}
	

}
