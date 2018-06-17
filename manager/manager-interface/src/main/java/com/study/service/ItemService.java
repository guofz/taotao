package com.study.service;

import com.study.common.EasyUiPageFormat;
import com.study.pojo.TbItem;

public interface ItemService {

	TbItem getItemById(Long itemId);

	EasyUiPageFormat<TbItem> pageList(Integer currentPage, Integer pageSize, TbItem condition);

}
