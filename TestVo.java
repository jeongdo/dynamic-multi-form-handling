package com.bbs.vo;

import java.util.List;

import com.common.vo.SearchVO;

public class TestVo extends SearchVO {
	private static final long serialVersionUID = 1L;

	private List<PsngrVo> test;

	public List<PsngrVo> getTest() {
		return test;
	}

	public void setTest(List<PsngrVo> test) {
		this.test = test;
	}

	@Override
	public String toString() {
		return "TestVo [test=" + test + "]";
	}

}