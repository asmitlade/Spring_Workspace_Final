package com.mac.beans;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class AadharDetails {
	private String name;
	private long uid;
	private Date dob;
	private float age;
	private long mobNo;
	private char favoriteLetter;
	private char[] favoriteLetters;
	private File photoPath;
	private String[] moles;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getUid() {
		return uid;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	public long getMobNo() {
		return mobNo;
	}
	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}
	public char getFavoriteLetter() {
		return favoriteLetter;
	}
	public void setFavoriteLetter(char favoriteLetter) {
		this.favoriteLetter = favoriteLetter;
	}
	public char[] getFavoriteLetters() {
		return favoriteLetters;
	}
	public void setFavoriteLetters(char[] favoriteLetters) {
		this.favoriteLetters = favoriteLetters;
	}
	public File getPhotoPath() {
		return photoPath;
	}
	public void setPhotoPath(File photoPath) {
		this.photoPath = photoPath;
	}
	public String[] getMoles() {
		return moles;
	}
	public void setMoles(String[] moles) {
		this.moles = moles;
	}
	
	@Override
	public String toString() {
		return "AadharDetails [name=" + name + ", uid=" + uid + ", dob=" + dob + ", age=" + age + ", mobNo=" + mobNo
				+ ", favoriteLetter=" + favoriteLetter + ", favoriteLetters=" + Arrays.toString(favoriteLetters)
				+ ", photoPath=" + photoPath + ", moles=" + Arrays.toString(moles) + "]";
	}
	
}
