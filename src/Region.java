import javax.faces.bean.ManagedBean;

@ManagedBean
public class Region {
	
	private String countryCode;
	private String regionCode;
	private String regionName;
	private String regionDesc;
	
	
	public Region() {}
	
	
	//Getters And Setters
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getRegionCode() {
		return regionCode;
	}
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	


	public String getRegionDesc() {
		return regionDesc;
	}


	public void setRegionDesc(String regionDesc) {
		this.regionDesc = regionDesc;
	}
	
	

}
