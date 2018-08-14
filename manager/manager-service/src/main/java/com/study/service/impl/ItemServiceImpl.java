package com.study.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.mapper.TbItemMapper;
import com.study.pojo.TbItem;
import com.study.service.ItemService;


/**
 * 商品管理服务层
 * @author 丰志
 *
 */
@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper itemMapper;
	
	@Override
	public TbItem getItemById(Long itemId) {
		return itemMapper.selectByPrimaryKey(itemId);
	}

}
