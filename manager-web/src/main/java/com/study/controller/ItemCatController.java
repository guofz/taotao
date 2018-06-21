package com.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.common.EasyUiTreeNode;
import com.study.service.ItemCatService;

/**
 * 商品类型管理Controller
 * @author 丰志
 *
 */
@Controller
@RequestMapping("/itemCat")
public class ItemCatController {

	@Autowired
	ItemCatService itemCatService;
	
	@RequestMapping("/list")
	@ResponseBody
	private List<EasyUiTreeNode> list() {
		return itemCatService.list();
	}
}
