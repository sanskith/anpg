package com.santosh.anpg.dto;

import java.util.List;

public class Result {

	public Integer count;
	public List<String> list;

	public Result(Integer count, List<String> list) {
		super();
		this.count = count;
		this.list = list;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Result [count=" + count + ", list=" + list + "]";
	}

}
