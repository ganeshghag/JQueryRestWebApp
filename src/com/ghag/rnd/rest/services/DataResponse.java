package com.ghag.rnd.rest.services;

import java.util.ArrayList;
import java.util.List;

public class DataResponse {
	
	private long page;
	private long records;
	private long total;
	private List<GridRow> rows;
	private static int NUMROWS = 200;
	
	public DataResponse(){
		
		page = 1;
		records = NUMROWS;
		total = NUMROWS/10;
		rows = new ArrayList<GridRow>();
		for(int i = 0 ; i < NUMROWS; i++){
			DataRow datarow = new DataRow(i);
			GridRow gridrow = new GridRow(i, datarow.toStringArray());
			rows.add(gridrow);
		}
		
	}
	
	public long getPage() {
		return page;
	}
	public void setPage(long page) {
		this.page = page;
	}
	public long getRecords() {
		return records;
	}
	public void setRecords(long record) {
		this.records = record;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}

	
	
	public List<GridRow> getRows() {
		return rows;
	}

	public void setRows(List<GridRow> rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DataResponse [page=");
		builder.append(page);
		builder.append(", record=");
		builder.append(records);
		builder.append(", total=");
		builder.append(total);
		builder.append(", rows=");
		builder.append(rows);
		builder.append("]");
		return builder.toString();
	}
	
	

}
