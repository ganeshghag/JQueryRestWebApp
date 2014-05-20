package com.ghag.rnd.rest.services;

import java.util.List;

public class GridRow {
	
	private long id;
	private List<String> cell;
	

	public GridRow(long id, List<String> cell){
		this.cell = cell;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<String> getCell() {
		return cell;
	}
	public void setCell(List<String> cell) {
		this.cell = cell;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GridRow [id=");
		builder.append(id);
		builder.append(", cell=");
		builder.append(cell);
		builder.append("]");
		return builder.toString();
	}
	
	

}
