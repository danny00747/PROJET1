package Football;

public class Wage implements Countryy {
	
	private double wage;
	
	

	public Wage(double wage) {
		super();
		this.wage = wage;
	}
	
	public double WeeklyWage(double wage) {
	
		return wage;
		
	}
	
	public double MonthWage(double wage) {
		
		return wage;
		
	}
	
	public double YearWage(double wage) {
		
		return wage;
		
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	@Override
	public String pays() {
		
		return null;
	} 

}
