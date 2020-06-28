package com.pw.tc.store.dao;

import java.sql.SQLException;
import java.util.List;

import com.pw.tc.store.pojo.Commodity;

public interface StoreDao {
	
	/**
	 * ��ܩҦ��ӫ~
	 * @return �p�G�Onull �N��S���o�Ӱӫ~����
	 * */
	public List<Commodity> CommodityByAll() ;
	/**
	 * �z�L�ӫ~�����j�M
	 * @return �p�G�Onull �N��S���o�Ӱӫ~����
	 * */
	public List<Commodity> CommodityByClass(String classname) ;
	/**
	 * �z�L�ӫ~�W�ٷj�M
	 * @return �p�G�Onull �N��S���o�Ӱӫ~�W��
	 * */
	public Commodity CommodityByName(String name) ;
	/**
	 * �j�M�ӫ~����j�󵥩�ƤJ��
	 * @return �p�G�Onull �N��S���o�Ӱӫ~�j��o�ӻ���
	 * */
	public List<Commodity> CommodityByMaxPirce(Integer maxprice) ;
	/**
	 * �j�M�ӫ~����p�󵥩�ƤJ��
	 * @return �p�G�Onull �N��S���o�Ӱӫ~�p��o�ӻ���
	 * */
	public List<Commodity> CommodityByMinPirce(Integer minprice) ;
	/**
	 * �ʶR�ӫ~�A�����ƶq
	 * @return �p�G�O-1�N���ʶR����
	 * @throws SQLException 
	 * @name �ʶR�ӫ~�W�l
	 * @buy �ʶR�ӫ~�ƶq
	 * */
	public int BuyCommodity(String name,Integer buy) throws SQLException ;
	/**
	 * �ɥR�f���ƶq
	 * @return �p�G�O-1 �N��ɳf����
	 * @throws SQLException 
	 * @name �ɥR�ӫ~�W�l
	 * @buy �ɥR�ӫ~�ƶq
	 * */
	public int ReplenishStock(String name,Integer Quantity) throws SQLException ;
	
}
