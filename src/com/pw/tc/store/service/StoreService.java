package com.pw.tc.store.service;

import java.util.List;

import com.pw.tc.store.pojo.Commodity;

public interface StoreService {
	
	/**
	 * �j�M�ӫ~����
	 * @return ��^[]�N��ӫ~���s�b
	 * */
	public List<Commodity> existsCommodity(String Name);
	/**
	 * ��ܩҦ��ӫ~
	 * @return ��^[]�N��ӫ~���s�b
	 * */
	public List<Commodity> AllexistsCommodity();
	
	
}
