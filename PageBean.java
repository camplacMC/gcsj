package com.vo;

import java.util.List;

import com.model.Student;

public class PageBean {
	private int pageNumber;   //��ǰҳ����������ݣ�
	private int pageSize;//ÿҳ��ʾ�������̶�ֵ��Ҳ��������������ݹ���)
	private int totalRecord;//�ܼ�¼�� ���ݿ��ѯ��
	private int totalPage;//�ܷ�ҳ�� �����ã�totalPage=(totalRecord+pageSize-1)/pageSize
	private int startIndex;//��ʼ���� �����ã�startIndex=(pageNumer-1)*pageNumber
	private List<Student> data;//��ҳ���� �����ݿ��ѯ��
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getStartIndex() {
		return startIndex;
	}
	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}
	public List<Student> getData() {
		return data;
	}
	public void setData(List<Student> data) {
		this.data = data;
	}
	public PageBean(int pageNumber, int pageSize, int totalRecord, int totalPage, int startIndex) {
		super();
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
		this.totalRecord = totalRecord;
		this.totalPage = totalPage;
		this.startIndex = startIndex;
	}
	public PageBean() {
	}
	@Override
	public String toString() {
		return "PageBean [pageNumber=" + pageNumber + ", pageSize=" + pageSize + ", totalRecord=" + totalRecord
				+ ", totalPage=" + totalPage + ", startIndex=" + startIndex + ", data=" + data + "]";
	}
	
}
