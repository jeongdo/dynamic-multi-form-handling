package com.bbs.vo;

import java.util.Date;

import com.common.vo.SearchVO;

public class PsngrVo extends SearchVO {
	private static final long serialVersionUID = 1L;

	private String psngr = "";
	private String psngr15 = "";
	private String psngr25 = "";

	public String getPsngr() {
		return psngr;
	}
	public void setPsngr(String psngr) {
		this.psngr = psngr;
	}
	public String getPsngr15() {
		return psngr15;
	}
	public void setPsngr15(String psngr15) {
		this.psngr15 = psngr15;
	}
	public String getPsngr25() {
		return psngr25;
	}
	public void setPsngr25(String psngr25) {
		this.psngr25 = psngr25;
	}

	@Override
	public String toString() {
		return "PsngrVo [psngr=" + psngr + ", psngr15=" + psngr15 + ", psngr25=" + psngr25 + "]";
	}

}