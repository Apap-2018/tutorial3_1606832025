package com.apap.tutorial3.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.apap.tutorial3.model.PilotModel;

@Service
public class PilotInMemoryService implements PilotService{
	private List<PilotModel> archivePilot;
	
	public PilotInMemoryService() {
		archivePilot = new ArrayList<>();
		
	}
	
	@Override
	public void addPilot (PilotModel pilot) {
		archivePilot.add(pilot);
	}
	
	@Override
	public List<PilotModel> getPilotList(){
		return archivePilot;
	}

	
			
	

	@Override
	public PilotModel getPilotDetailById(String id) {
		for (PilotModel that_pilot : archivePilot) {
				if(that_pilot.getId().equals(id));
				return that_pilot;
				
		}
		
		return null;
	}

	@Override
	public void deletePilot(PilotModel pilot) {
		archivePilot.remove(pilot);
		}

	@Override
	public PilotModel getPilotDetailByLicenseNumber(String licenseNumber) {
		for (PilotModel pilot : archivePilot) {
			if( pilot.getLicenseNumber().equals(licenseNumber));
			return pilot;		
		}
	
	return null;
	}
	
	


}
