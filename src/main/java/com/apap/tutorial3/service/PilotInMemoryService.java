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
	public PilotModel getPilotDetailByLicenseNumber(String licenseNumber) {
		for (PilotModel that_pilot : archivePilot) {
			if(that_pilot.getLicenseNumber()==licenseNumber);
				return that_pilot;
			
		}
		return null;
		
	
			
	}

	@Override
	public PilotModel getPilotDetailById(String id) {
		for (PilotModel that_pilot : archivePilot) {
				if(that_pilot.getId()==id);
				return that_pilot;
		}
		
		return null;
	}

	@Override
	public void deletePilot(PilotModel pilot) {
		archivePilot.remove(pilot);
		}
	
	


}
