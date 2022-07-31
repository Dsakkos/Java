package com.caresoft.clinicapp;

import com.caresoft.interfaces.HIPAACompliantUser;

public class Physician extends User implements HIPAACompliantUser {

	public Physician(Integer id) {
		super(id);
	}

	@Override
	public boolean assignPin(int pin) {
		if(pin < 1000 || pin > 9999 ) {
		    return false;
		} 
		else { 
			this.pin = pin;
		     return true;
	} 
}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if(this.id == confirmedAuthID) {
			return true;
	}
		else {
			return false;
		}
}

}
