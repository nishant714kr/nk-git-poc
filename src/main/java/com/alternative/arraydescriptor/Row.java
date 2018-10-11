package com.alternative.arraydescriptor;

import java.sql.SQLData;
import java.sql.SQLException;
import java.sql.SQLInput;
import java.sql.SQLOutput;

public class Row implements SQLData{
	
	private String rowAttribute01;
	private String rowAttribute02;
	private String rowAttribute03;
	private String rowAttribute04;
	private String rowAttribute05;
	private String rowAttribute06;
	private String rowAttribute07;
	private String rowAttribute08;
	private String rowAttribute09;
	private String rowAttribute10;
	private String rowAttribute11;
	private String rowAttribute12;
	private String rowAttribute13;
	private String rowAttribute14;
	private String rowAttribute15;
	private String rowAttribute16;
	private String rowAttribute17;
	private String rowAttribute18;
	private String rowAttribute19;
	private String rowAttribute20;
	private String rowAttribute21;
	private String rowAttribute22;
	private String rowAttribute23;
	private String rowAttribute24;
	private String rowAttribute25;
	
	// implemented methods
	@Override
	public String getSQLTypeName() throws SQLException {
		return "TYPE_ROW_OBJ";
	}
	@Override
	public void readSQL(SQLInput input, String typeName) throws SQLException {
		this.rowAttribute01	=	input.readString()	;
		this.rowAttribute02	=	input.readString()	;
		this.rowAttribute03	=	input.readString()	;
		this.rowAttribute04	=	input.readString()	;
		this.rowAttribute05	=	input.readString()	;
		this.rowAttribute06	=	input.readString()	;
		this.rowAttribute07	=	input.readString()	;
		this.rowAttribute08	=	input.readString()	;
		this.rowAttribute09	=	input.readString()	;
		this.rowAttribute10	=	input.readString()	;
		this.rowAttribute11	=	input.readString()	;
		this.rowAttribute12	=	input.readString()	;
		this.rowAttribute13	=	input.readString()	;
		this.rowAttribute14	=	input.readString()	;
		this.rowAttribute15	=	input.readString()	;
		this.rowAttribute16	=	input.readString()	;
		this.rowAttribute17	=	input.readString()	;
		this.rowAttribute18	=	input.readString()	;
		this.rowAttribute19	=	input.readString()	;
		this.rowAttribute20	=	input.readString()	;
		this.rowAttribute21	=	input.readString()	;
		this.rowAttribute22	=	input.readString()	;
		this.rowAttribute23	=	input.readString()	;
		this.rowAttribute24	=	input.readString()	;
		this.rowAttribute25	=	input.readString()	;
	}
	@Override
	public void writeSQL(SQLOutput output) throws SQLException {
		output.writeString(this.rowAttribute01);
		output.writeString(this.rowAttribute02);
		output.writeString(this.rowAttribute03);
		output.writeString(this.rowAttribute04);
		output.writeString(this.rowAttribute05);
		output.writeString(this.rowAttribute06);
		output.writeString(this.rowAttribute07);
		output.writeString(this.rowAttribute08);
		output.writeString(this.rowAttribute09);
		output.writeString(this.rowAttribute10);
		output.writeString(this.rowAttribute11);
		output.writeString(this.rowAttribute12);
		output.writeString(this.rowAttribute13);
		output.writeString(this.rowAttribute14);
		output.writeString(this.rowAttribute15);
		output.writeString(this.rowAttribute16);
		output.writeString(this.rowAttribute17);
		output.writeString(this.rowAttribute18);
		output.writeString(this.rowAttribute19);
		output.writeString(this.rowAttribute20);
		output.writeString(this.rowAttribute21);
		output.writeString(this.rowAttribute22);
		output.writeString(this.rowAttribute23);
		output.writeString(this.rowAttribute24);
		output.writeString(this.rowAttribute25);
	}
	
	
	public Row() {}
	
	// constructor using fields
	public Row(String rowAttribute01, String rowAttribute02, String rowAttribute03, String rowAttribute04,
			String rowAttribute05, String rowAttribute06, String rowAttribute07, String rowAttribute08,
			String rowAttribute09, String rowAttribute10, String rowAttribute11, String rowAttribute12,
			String rowAttribute13, String rowAttribute14, String rowAttribute15, String rowAttribute16,
			String rowAttribute17, String rowAttribute18, String rowAttribute19, String rowAttribute20,
			String rowAttribute21, String rowAttribute22, String rowAttribute23, String rowAttribute24,
			String rowAttribute25) {

		this.rowAttribute01 = rowAttribute01;
		this.rowAttribute02 = rowAttribute02;
		this.rowAttribute03 = rowAttribute03;
		this.rowAttribute04 = rowAttribute04;
		this.rowAttribute05 = rowAttribute05;
		this.rowAttribute06 = rowAttribute06;
		this.rowAttribute07 = rowAttribute07;
		this.rowAttribute08 = rowAttribute08;
		this.rowAttribute09 = rowAttribute09;
		this.rowAttribute10 = rowAttribute10;
		this.rowAttribute11 = rowAttribute11;
		this.rowAttribute12 = rowAttribute12;
		this.rowAttribute13 = rowAttribute13;
		this.rowAttribute14 = rowAttribute14;
		this.rowAttribute15 = rowAttribute15;
		this.rowAttribute16 = rowAttribute16;
		this.rowAttribute17 = rowAttribute17;
		this.rowAttribute18 = rowAttribute18;
		this.rowAttribute19 = rowAttribute19;
		this.rowAttribute20 = rowAttribute20;
		this.rowAttribute21 = rowAttribute21;
		this.rowAttribute22 = rowAttribute22;
		this.rowAttribute23 = rowAttribute23;
		this.rowAttribute24 = rowAttribute24;
		this.rowAttribute25 = rowAttribute25;
	}
	
	// getters & setters
	
	public String getRowAttribute01() {
		return rowAttribute01;
	}
	public void setRowAttribute01(String rowAttribute01) {
		this.rowAttribute01 = rowAttribute01;
	}
	public String getRowAttribute02() {
		return rowAttribute02;
	}
	public void setRowAttribute02(String rowAttribute02) {
		this.rowAttribute02 = rowAttribute02;
	}
	public String getRowAttribute03() {
		return rowAttribute03;
	}
	public void setRowAttribute03(String rowAttribute03) {
		this.rowAttribute03 = rowAttribute03;
	}
	public String getRowAttribute04() {
		return rowAttribute04;
	}
	public void setRowAttribute04(String rowAttribute04) {
		this.rowAttribute04 = rowAttribute04;
	}
	public String getRowAttribute05() {
		return rowAttribute05;
	}
	public void setRowAttribute05(String rowAttribute05) {
		this.rowAttribute05 = rowAttribute05;
	}
	public String getRowAttribute06() {
		return rowAttribute06;
	}
	public void setRowAttribute06(String rowAttribute06) {
		this.rowAttribute06 = rowAttribute06;
	}
	public String getRowAttribute07() {
		return rowAttribute07;
	}
	public void setRowAttribute07(String rowAttribute07) {
		this.rowAttribute07 = rowAttribute07;
	}
	public String getRowAttribute08() {
		return rowAttribute08;
	}
	public void setRowAttribute08(String rowAttribute08) {
		this.rowAttribute08 = rowAttribute08;
	}
	public String getRowAttribute09() {
		return rowAttribute09;
	}
	public void setRowAttribute09(String rowAttribute09) {
		this.rowAttribute09 = rowAttribute09;
	}
	public String getRowAttribute10() {
		return rowAttribute10;
	}
	public void setRowAttribute10(String rowAttribute10) {
		this.rowAttribute10 = rowAttribute10;
	}
	public String getRowAttribute11() {
		return rowAttribute11;
	}
	public void setRowAttribute11(String rowAttribute11) {
		this.rowAttribute11 = rowAttribute11;
	}
	public String getRowAttribute12() {
		return rowAttribute12;
	}
	public void setRowAttribute12(String rowAttribute12) {
		this.rowAttribute12 = rowAttribute12;
	}
	public String getRowAttribute13() {
		return rowAttribute13;
	}
	public void setRowAttribute13(String rowAttribute13) {
		this.rowAttribute13 = rowAttribute13;
	}
	public String getRowAttribute14() {
		return rowAttribute14;
	}
	public void setRowAttribute14(String rowAttribute14) {
		this.rowAttribute14 = rowAttribute14;
	}
	public String getRowAttribute15() {
		return rowAttribute15;
	}
	public void setRowAttribute15(String rowAttribute15) {
		this.rowAttribute15 = rowAttribute15;
	}
	public String getRowAttribute16() {
		return rowAttribute16;
	}
	public void setRowAttribute16(String rowAttribute16) {
		this.rowAttribute16 = rowAttribute16;
	}
	public String getRowAttribute17() {
		return rowAttribute17;
	}
	public void setRowAttribute17(String rowAttribute17) {
		this.rowAttribute17 = rowAttribute17;
	}
	public String getRowAttribute18() {
		return rowAttribute18;
	}
	public void setRowAttribute18(String rowAttribute18) {
		this.rowAttribute18 = rowAttribute18;
	}
	public String getRowAttribute19() {
		return rowAttribute19;
	}
	public void setRowAttribute19(String rowAttribute19) {
		this.rowAttribute19 = rowAttribute19;
	}
	public String getRowAttribute20() {
		return rowAttribute20;
	}
	public void setRowAttribute20(String rowAttribute20) {
		this.rowAttribute20 = rowAttribute20;
	}
	public String getRowAttribute21() {
		return rowAttribute21;
	}
	public void setRowAttribute21(String rowAttribute21) {
		this.rowAttribute21 = rowAttribute21;
	}
	public String getRowAttribute22() {
		return rowAttribute22;
	}
	public void setRowAttribute22(String rowAttribute22) {
		this.rowAttribute22 = rowAttribute22;
	}
	public String getRowAttribute23() {
		return rowAttribute23;
	}
	public void setRowAttribute23(String rowAttribute23) {
		this.rowAttribute23 = rowAttribute23;
	}
	public String getRowAttribute24() {
		return rowAttribute24;
	}
	public void setRowAttribute24(String rowAttribute24) {
		this.rowAttribute24 = rowAttribute24;
	}
	public String getRowAttribute25() {
		return rowAttribute25;
	}
	public void setRowAttribute25(String rowAttribute25) {
		this.rowAttribute25 = rowAttribute25;
	}

}
