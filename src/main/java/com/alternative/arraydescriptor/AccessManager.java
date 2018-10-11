package com.alternative.arraydescriptor;

import java.util.ArrayList;
import java.util.List;

public class AccessManager {

	public static void main(String[] args) throws Exception {
		
		List<Row> rowListData = new ArrayList<Row>();
		
		Row row;
		
		row = new Row();
		row.setRowAttribute01("ROLE_CODE1");
		row.setRowAttribute02("18306,18307");
		row.setRowAttribute03("");
		row.setRowAttribute04("");
		rowListData.add(row);
		
		row = new Row();
		row.setRowAttribute01("ROLE_CODE2");
		row.setRowAttribute02("");
		row.setRowAttribute03("18774,18775");
		row.setRowAttribute04("");
		rowListData.add(row);
		
		
		DBService.postChanges("1234567", "2345678", rowListData);

	}

}
