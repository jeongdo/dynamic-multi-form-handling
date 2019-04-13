package com.index.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bbs.controller.BoardController;
import com.bbs.vo.PsngrVo;
import com.bbs.vo.TestVo;

@Controller
public class IndexController {

	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

	@RequestMapping(value = "/index")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/test")
	public String test() {
		return "/test/test";
	}

	@RequestMapping(value = "/test/data")
	public String testData(TestVo testVo) {

		for(PsngrVo vo : testVo.getTest()) {
			logger.debug(">>>>>>>>>>>>>> " + vo.getPsngr());
			logger.debug(">>>>>>>>>>>>>> " + vo.getPsngr15());
			logger.debug(">>>>>>>>>>>>>> " + vo.getPsngr25());
		}

		return "/test/test";
	}


}
