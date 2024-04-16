package com.example.play3ct.dto;

public class SorteoDTO {
	private Integer sumatoria;
	private String type;
	private int colum1;
	private int colum2;
	private int colum3;
	private int colum4;
	

	
	
	
	public SorteoDTO(Integer sumatoria, String type, int colum1, int colum2, int colum3, int colum4) {
		super();
	
		this.type = type;
		this.colum1 = colum1;
		this.colum2 = colum2;
		this.colum3 = colum3;
		this.colum4 = colum4;
		this.sumatoria = getSumatoria();
	}
	private int getSumatoria() {
		return colum1+colum2+colum3+colum4;
	}





	@Override
	public String toString() {
		return "SorteoDTO [sumatoria=" + sumatoria + ", type=" + type + ", colum1=" + colum1 + ", colum2=" + colum2
				+ ", colum3=" + colum3 + ", colum4=" + colum4 + "]";
	}
	
}
