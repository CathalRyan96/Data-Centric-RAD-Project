import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
@ManagedBean
public class CityController {
	ArrayList<City> cities;
	
	public void loadCities() throws Exception{
		DAO dao = new DAO();
		
		cities = new ArrayList<>();
		cities =  dao.getCities();
		System.out.println("City.size " + cities.size());
 
	}

	public ArrayList<City> getCities() {
		return cities;
	}

	public void setCities(ArrayList<City> cities) {
		this.cities = cities;
	}

}
