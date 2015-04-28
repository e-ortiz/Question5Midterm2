package application;

public enum Year {
	TWO_THOUSAND_TEN("2010"),
	TWO_THOUSAND_ELEVEN("2011"),
	TWO_THOUSAND_TWELVE("2012"),
	TWO_THOUSAND_THIRTEEN("2013"),
	TWO_THOUSAND_FOURTEEN("2014"),
	TWO_THOUSAND_FIFTEEN("2015"),
	TWO_THOUSAND_SIXTEEN("2016"),
	TWO_THOUSAND_SEVENTEEN("2017"),
	TWO_THOUSAND_EIGHTEEN("2018"),
	TWO_THOUSAND_NINETEEN("2019"),
	TWO_THOUSAND_TWENTY("2020");

	private String year;

	Year(String year) {
		this.year = year;
	}

	public String toString() {
		return year;
	}
}
