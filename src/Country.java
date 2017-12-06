import javax.faces.bean.ManagedBean;

@ManagedBean
public class Country {
	
	private String countryCode;
	private String countryName;
	private String countryDetails;
	
	
	public Country() {}
	
	public Country(String countryCode) {
		super();
		this.countryCode = countryCode;
	}
	
	public Country(String countryCode, String countryName, String countryDetails) {
		this(countryCode);
		this.countryName = countryName;
		this.countryDetails = countryDetails;
	}
	

	//Getters and Setters
	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryDetails() {
		return countryDetails;
	}

	public void setCountryDetails(String countryDetails) {
		this.countryDetails = countryDetails;
	}

}