package com.limho.bbsProject.Test;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

public class Test {

	static SimpleDriverDataSource dataSource;
	static SqlSessionFactory sqlFactory;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// try {
		// dataSource = new SimpleDriverDataSource(new
		// Driver(),"://52.91.182.32:3306/test","root","asdf8812");
		// } catch (SQLException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:Context/DAOBean/db-contxt.xml");
		dataSource = ctx.getBean("dataSource", SimpleDriverDataSource.class);

		sqlFactory = ctx.getBean("sqlSessionFactory", SqlSessionFactory.class);
		SqlSession session = sqlFactory.openSession();
		
		try {
			Connection con = dataSource.getConnection();
			System.out.println(">>>>>>>>" + con);
			System.out.println(">>>>>>>>" + session);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	}

}
