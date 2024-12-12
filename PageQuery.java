package com.vo;

public class PageQuery {
	private String pageNumber="";
	private String pageSize="";
	private String sname="";
	public String getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}
	public String getPageSize() {
		return pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "PageQuery [pageNumber=" + pageNumber + ", pageSize=" + pageSize + ", sname=" + sname + "]";
	}
}
