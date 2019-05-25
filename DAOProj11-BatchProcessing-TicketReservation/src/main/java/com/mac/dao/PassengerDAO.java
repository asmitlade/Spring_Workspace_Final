package com.mac.dao;

import java.util.List;

import com.mac.bo.PassengerBO;

public interface PassengerDAO {
	public int[] insert(List<PassengerBO> listBO);
}
