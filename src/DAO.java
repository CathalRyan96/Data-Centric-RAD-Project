import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DAO {
	private DataSource mysqlDS;
	
	public DAO() throws Exception {
	     Context context = new InitialContext();
	     String jndiName = "java:comp/env/jdbc/geography";
	     mysqlDS = (DataSource) context.lookup(jndiName);
	 }
	
	public ArrayList<Country> getCountries() throws Exception{
		
		 ArrayList<Country> countries = new ArrayList<>();

			Connection conn = mysqlDS.getConnection();
			PreparedStatement myStmt = conn.prepareStatement("select * from country");

			ResultSet rs = myStmt.executeQuery();
			
			
			while (rs.next()) {
				
				Country country = new Country();
				
				String countryCode = rs.getString("co_code");
				country.setCountryCode(countryCode);
				String countryName = rs.getString("co_name");
				country.setCountryName(countryName);
				String countryDetails = rs.getString("co_details");
				country.setCountryDetails(countryDetails);
				countries.add(country);
				
				
			}
			
			
			return countries;
	}
	
	//Insert a new country into the table
	public void addCountry(Country newCountry) throws Exception{
		
		Connection conn = mysqlDS.getConnection();
		PreparedStatement myStmt = conn.prepareStatement("INSERT INTO country " +"VALUES (?,?,?)");
		
		myStmt.setString(1, newCountry.getCountryCode());
		myStmt.setString(2, newCountry.getCountryName());
		myStmt.setString(3, newCountry.getCountryDetails());
		
	}
	
	//Return an ArrayList of all regions from database
	public ArrayList<Region> getRegions() throws Exception{
		ArrayList<Region> regions = new ArrayList<Region>();
		
		Connection conn = mysqlDS.getConnection();
		PreparedStatement myStmt = conn.prepareStatement("select * from region");
		
		ResultSet rs = myStmt.executeQuery();
		
		while (rs.next()) {
			
			Region region = new Region();
			
			String countryCode = rs.getString("co_code");
			region.setCountryCode(countryCode);
			String regionCode = rs.getString("reg_code");
			region.setRegionCode(regionCode);
			String regionName = rs.getString("reg_name");
			region.setRegionName(regionName);
			String regionDesc = rs.getString("reg_desc");
			region.setRegionDesc(regionDesc);
			regions.add(region);
		}
		return regions;
	}
	
	//Return an ArrayList with all cities from databases
	
	public ArrayList<City> getCities() throws Exception{
		ArrayList<City> cities = new ArrayList<City>();
		
		Connection conn = mysqlDS.getConnection();
		PreparedStatement myStmt = conn.prepareStatement("select * from city");
		
		ResultSet rs = myStmt.executeQuery();
		
		while (rs.next()) {
			
			City city = new City();
			
			String cityCode = rs.getString("cty_code");
			city.setCityCode(cityCode);
			
			String countryCode = rs.getString("co_code");
			city.setCountryCode(countryCode);
			
			String regionCode = rs.getString("reg_code");
			city.setRegionCode(regionCode);
			
			String cityName = rs.getString("cty_name");
			city.setCityName(cityName);
			
			int population = rs.getInt("population");
			city.setPopulation(population);
			
			String isCoastal = rs.getString("isCoastal");
			city.setIsCoastal(isCoastal);
			
			double area = rs.getDouble("areaKM");
			city.setArea(area);
			
			cities.add(city);
		}
		return cities;
	}
	
	

}


