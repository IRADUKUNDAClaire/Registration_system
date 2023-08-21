package com.register;

public class UserRegister {
String Hospital_Name,Register_Name,Hospital_Location,Hospital_Email;

public String getHospital_Name() {
	return Hospital_Name;
}

public String getRegister_Name() {
	return Register_Name;
}

public String getHospital_Location() {
	return Hospital_Location;
}

public String getHospital_Email() {
	return Hospital_Email;
}

public UserRegister() {
	super();
}

public UserRegister(String hospital_Name, String register_Name, String hospital_Location, String hospital_Email) {
	super();
	Hospital_Name = hospital_Name;
	Register_Name = register_Name;
	Hospital_Location = hospital_Location;
	Hospital_Email = hospital_Email;

}

}
