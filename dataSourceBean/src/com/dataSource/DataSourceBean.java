package com.dataSource;

import java.sql.Connection;
import java.util.Arrays;
import java.util.Collection;

public class DataSourceBean {
public static Collection craeteConnection(String tanentName){
	DataSourceFacroty dbSF=new DataSourceFacroty();
	dbSF.setTenantName(tanentName);
	String tenantName=dbSF.getTenantName();
	Connection con=DBConnection.getConnection(tenantName);
	 return Arrays.asList(con);
}
}
