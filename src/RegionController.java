import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class RegionController {
	ArrayList<Region> regions;
	
	public void loadRegions() throws Exception{
		DAO dao = new DAO();
		
		 regions = new ArrayList<>();
		regions =  dao.getRegions();
		System.out.println("Regions.size " + regions.size());
 
	}
	
	public ArrayList<Region> getRegions() {
		return regions;
	}
	
	public void setRegions(ArrayList<Region> regions) {
		this.regions = regions;
	}

}
