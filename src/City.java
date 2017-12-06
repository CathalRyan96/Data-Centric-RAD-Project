import javax.faces.bean.ManagedBean;

@ManagedBean
public class City {
	
	private String cityCode;
	private String countryCode;
	private String regionCode;
	private String cityName;
	private int population;
	private String isCoastal;
	private double area;
	
	public City() {}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

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

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	

	public String getIsCoastal() {
		return isCoastal;
	}

	public void setIsCoastal(String isCoastal) {
		this.isCoastal = isCoastal;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	

}
