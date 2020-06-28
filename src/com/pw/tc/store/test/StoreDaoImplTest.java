package com.pw.tc.store.test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import com.pw.tc.store.dao.StoreDao;
import com.pw.tc.store.dao.StoreDaoImpl;

public class StoreDaoImplTest {
	StoreDao storedao = new StoreDaoImpl();
	@Test
	public void testCommodityByAll() {
		
		System.out.println(storedao.CommodityByAll());
	}
	@Test
	public void testCommodityByClass() {
		
		System.out.println(storedao.CommodityByClass("�y�c"));
	}

	@Test
	public void testCommodityByName() {
		System.out.println(storedao.CommodityByName("�yA��"));
	}

	@Test
	public void testCommodityByMaxPirce() {
		System.out.println(storedao.CommodityByMaxPirce(200));
	}

	@Test
	public void testCommodityByMinPirce() {
		System.out.println(storedao.CommodityByMinPirce(300));
	}

	@Test
	public void testBuyCommodity() throws SQLException {
		System.out.println(storedao.BuyCommodity("�yA��", 5));
	}
	@Test
	public void testReplenishStock() throws SQLException {
		System.out.println(storedao.ReplenishStock("�yA��",10));
	}
	
	
	

}
