package com.study.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.study.common.EasyUiPageFormat;
import com.study.mapper.TbItemMapper;
import com.study.pojo.TbItem;
import com.study.service.ItemService;

@org.springframework.stereotype.Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper itemMapper;
	
	@Override
	public TbItem getItemById(Long itemId) {
		return itemMapper.selectByPrimaryKey(itemId);
	}

	@Override
	public EasyUiPageFormat<TbItem> pageList(Integer currentPage, Integer pageSize, TbItem condition) {
		Integer total = itemMapper.countByExample(null);
		List<TbItem> rows = itemMapper.pageList(condition, (currentPage - 1) * pageSize, pageSize);
		return new EasyUiPageFormat<TbItem>(total, rows);
	}

}
