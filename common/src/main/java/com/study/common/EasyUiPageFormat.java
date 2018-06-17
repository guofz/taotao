package com.study.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class EasyUiPageFormat<T> implements Serializable {

	private static final long serialVersionUID = -4247822327841020844L;
	
	private Integer total;
	private List<T> rows = new ArrayList<T>();
	
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	
	public EasyUiPageFormat() {
		super();
	}
	public EasyUiPageFormat(Integer total, List<T> rows) {
		super();
		this.total = total;
		this.rows = rows;
	}
	
	
	
}
