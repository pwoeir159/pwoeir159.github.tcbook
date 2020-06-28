package com.pw.tc.store.dao;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.pw.tc.user.utils.JdbcUtils;


public abstract class BaseDao {
	
	//�ϥ�DbUtils�ާ@�ƾڮw
	private QueryRunner queryrunner = new QueryRunner(); 
	/*
	  	update ��k�ΨӰ��� :Insert / Update / Delete �y�y�C
		queryrunner.update(conn, sql, args);
		�p�G��^-1�������� �A��^��L�ƭȥN���\�C
	*/
	public int update(String sql,Object ... args) throws SQLException {
		Connection conn = com.pw.tc.user.utils.JdbcUtils.getConnection();
		try {
			return queryrunner.update(conn, sql, args);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.close(conn);
		}		
		return -1;
	}
	/*
	 	queryForOne �d�ߤ@�ӹ�H���ɭԨϥ�
	 	queryrunner.query(conn,sql,new BeanHandler<T>(type),args); 
	 	�d�ߪ�^�@��JavaBean��sql�y�y
	 	type ��^���ﹳ���O
	 	sql ����y�y
	 	args sql�������Ѽƭ�
	 	<T> �x��
	  */
	public <T> T queryForOne(Class<T> type,String sql,Object ... args) {
		Connection conn = JdbcUtils.getConnection();
		try {
			return queryrunner.query(conn,sql,new BeanHandler<T>(type),args); 
						
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.close(conn);
		}
		return null;
	}
	/*
 	queryForList �d�ߦh�ӹ�H���ɭԨϥ�
 	queryrunner.query(conn, sql,new BeanListHandler<T>(type), args);
 	�d�ߦh��JavaBean��sql�y�y
 	type ��^���ﹳ���O
 	sql ����y�y
 	args sql�������Ѽƭ�
 	<T> �x��
  */
	public <T>List<T> queryForList(Class<T> type,String sql,Object ... args){
		Connection conn = JdbcUtils.getConnection();
		try {
			return queryrunner.query(conn, sql,new BeanListHandler<T>(type), args);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.close(conn);
		}
		return null;
		
	}
	/*
 	queryForSingValue �d�ߤ@��@�C��SQL�y�y
 	queryrunner.query(conn, sql, new ScalarHandler(), argns);
 	
 	type ��^���ﹳ���O	
 	sql ����y�y
 	args sql�������Ѽƭ�
 	<T> �x��
  */
	public Object queryForSingValue(String sql,Object ... argns) {
		Connection conn = JdbcUtils.getConnection();
		try {
				return queryrunner.query(conn, sql, new ScalarHandler(), argns);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.close(conn);
		}
		return null;
	}
	
	
}
