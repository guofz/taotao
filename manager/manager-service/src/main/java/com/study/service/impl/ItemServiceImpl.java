package com.study.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.study.mapper.TbItemMapper;
import com.study.pojo.TbItem;
import com.study.service.ItemService;

/**
 * ��Ʒ����
 * 
 * @author ��־
 *
 */
@org.springframework.stereotype.Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper itemMapper;
	
	@Override
	public TbItem getItemById(Long itemId) {
		return itemMapper.selectByPrimaryKey(itemId);
	}

}
