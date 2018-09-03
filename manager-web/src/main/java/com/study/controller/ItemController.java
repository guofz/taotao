package com.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.common.EasyUiPageFormat;
import com.study.pojo.TbItem;
import com.study.service.ItemService;

/**
 * 商品管理Controller
 * @author 丰志
 *
 */
@Controller
@RequestMapping("/item")
public class ItemController {

	@Autowired
	ItemService itemService;
	
	@RequestMapping("/{itemId}")
	@ResponseBody
	private TbItem getItemById(@PathVariable Long itemId) {
		TbItem tbItem = itemService.getItemById(itemId);
		return tbItem;
	}
	
	@RequestMapping("/pageList")
	@ResponseBody
	private EasyUiPageFormat<TbItem> pageList(@RequestParam("page") Integer currentPage, @RequestParam("rows") Integer pageSize) {
		return itemService.pageList(currentPage, pageSize, null);
	}
	
}
