package com.register;

public class Babby {

public Babby() {
		super();
	}

public Babby(String baby_Name, String gender, String date_of_Birth, String parent_Name, String contact_Number,
			String adddress) {
		super();
		Baby_Name = baby_Name;
		Gender = gender;
		Date_of_Birth = date_of_Birth;
		Parent_Name = parent_Name;
		Contact_Number = contact_Number;
		Adddress = adddress;
	}

public String getBaby_Name() {
		return Baby_Name;
	}

	public void setBaby_Name(String baby_Name) {
		Baby_Name = baby_Name;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getDate_of_Birth() {
		return Date_of_Birth;
	}

	public void setDate_of_Birth(String date_of_Birth) {
		Date_of_Birth = date_of_Birth;
	}

	public String getParent_Name() {
		return Parent_Name;
	}

	public void setParent_Name(String parent_Name) {
		Parent_Name = parent_Name;
	}

	public String getContact_Number() {
		return Contact_Number;
	}

	public void setContact_Number(String contact_Number) {
		Contact_Number = contact_Number;
	}

	public String getAdddress() {
		return Adddress;
	}

	public void setAdddress(String adddress) {
		Adddress = adddress;
	}

String Baby_Name,Gender,Date_of_Birth,Parent_Name, Contact_Number, Adddress;

}
