package com.study.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Page<T> implements Serializable {

	private static final long serialVersionUID = 3847602320381931020L;
	
	private Integer currentPage;
	private Integer pageSize;
	private Integer totalSize;
	private Integer totalPage;
	
	private List<T> dataLists = new ArrayList<T>();

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(Integer totalSize) {
		this.totalSize = totalSize;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public List<T> getDataLists() {
		return dataLists;
	}

	public void setDataLists(List<T> dataLists) {
		this.dataLists = dataLists;
	}

	
}
