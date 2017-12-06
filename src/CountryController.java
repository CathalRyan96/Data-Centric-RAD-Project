import java.sql.SQLException;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
@ManagedBean
public class CountryController {
	ArrayList<Country> countries;
	private DAO dao;
	
	public void loadCountries() throws Exception{
		DAO dao = new DAO();
		
		 countries = new ArrayList<>();
		countries =  dao.getCountries();
		System.out.println("Countries.size " + countries.size());
 
	}
	
	//Add new country to the database
	/*public String addCountry(Country country) {
		try {
				dao.addCountry(country);
				return "countries";
		}catch(SQLException se) {
			String m = se.getMessage();
			
			switch(se.getErrorCode()) {
			
			}
			
		}
	}*/

	public ArrayList<Country> getCountries() {
		return countries;
	}

	public void setCountries(ArrayList<Country> countries) {
		this.countries = countries;
	}

}
