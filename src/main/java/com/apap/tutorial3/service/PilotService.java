package com.apap.tutorial3.service;

import java.util.*;

import com.apap.tutorial3.model.PilotModel;

public interface PilotService {
	void addPilot (PilotModel pilot) ;
	void deletePilot (PilotModel pilot) ;
		List<PilotModel> getPilotList();
		PilotModel getPilotDetailByLicenseNumber(String licenseNumber);
		PilotModel getPilotDetailById(String id);
	
}
