package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

import com.caresoft.interfaces.HIPAACompliantAdmin;
import com.caresoft.interfaces.HIPAACompliantUser;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {

    
    private String role;
    private ArrayList<String> securityIncidents;
    

    
	public AdminUser(Integer id, String role) {
		super(id);
		this.setRole(role);
		this.securityIncidents = new ArrayList<String>();
	}
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    

	@Override
	public boolean assignPin(int pin) {
		if(pin < 100000 || pin > 999999 ) {
		    return false;
		} 
		else { 
			this.pin = pin;
		     return true;
	} 
}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if (this.id != confirmedAuthID) {
			this.authIncident();
			return false;
		}
		else {
			return true;
		}
	}
	@Override
	public ArrayList<String> reportSecurityIncidents() {
		return this.securityIncidents;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
