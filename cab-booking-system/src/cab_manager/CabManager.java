package cab_manager;

import java.util.HashMap;
import entity.Cab;
import enums.CabStatus;
import java.util.ArrayList;


public class CabManager {
	
	private HashMap<String, Cab> cabHashMap;
	private static CabManager instance=null;
	
	public CabManager() {
		cabHashMap=new HashMap<>();
	}
	
	//used singleton 
	public static CabManager getInstance() {
		if(instance==null) {
			instance=new CabManager();
	}
		return instance;
	}
	
	public Cab findCab(String license_plate) {
		if(cabHashMap.containsKey(license_plate)) {
			return cabHashMap.get(license_plate);
		}
		return null;
	}
	
	public void addCab(Cab cab) {
		if(!cabHashMap.containsKey(cab.getLicensePlate())) {
			cabHashMap.put(cab.getLicensePlate(), cab);
		}
	}
	
	public void removeCab(Cab cab) {
		if(!cabHashMap.containsKey(cab.getLicensePlate())) {
			cabHashMap.remove(cab.getLicensePlate());
		}
	}
	
	public ArrayList<Cab> finAvailableCabs(){
		ArrayList<Cab> cabs=new ArrayList<>();
		for(String lp: cabHashMap.keySet()) {
			Cab cab1=cabHashMap.get(lp);
			 if(cab1.getStatus() == CabStatus.AVAILABLE){
			        cabs.add(cab1);
			      }
		}
		return cabs;
	}
	

}
