package com.pw.tc.store.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class JdbcUtils {
	private static DruidDataSource dataSource;
	
	static {
		
		try {
			Properties properties =new Properties();
			//Ū��jdbc.Properties�ݩʰt�m���
			InputStream inputstream = JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
			//�q�y���[���ƾ�
			properties.load(inputstream);
			//�Ы� ��Ʈw�s�� ��
			dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);			
			System.out.println(dataSource.getCommitCount());
		
		}
		catch(Exception e) {
			e.printStackTrace();	
		}
	}
	
public static void main(String[] args) {
		
	}
	/*�����Ʈw�s����
	 return �p�G�O��^null�A�����Ψ��s�����ѡA���ȴN�O�s�����\	 
	*/	
	public static Connection getConnection() {
		Connection conn =null;
		try {
			conn = dataSource.getConnection();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	public static void close(Connection connection) {
		if(connection != null) {
			try {
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
