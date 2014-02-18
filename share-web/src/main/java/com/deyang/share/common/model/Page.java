package com.deyang.share.common.model;

public class Page {

	private int currentPage;
	private int pageSize;
	private int totalRecord;

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		if (currentPage <= 0) {
			this.currentPage = 0;
		} else if (currentPage > totalRecord / pageSize + 1) {
			this.currentPage = totalRecord / pageSize + 1;
		}
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
}
