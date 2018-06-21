package com.study.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.common.EasyUiTreeNode;
import com.study.mapper.TbItemCatMapper;
import com.study.pojo.TbItemCat;
import com.study.pojo.TbItemCatExample;
import com.study.pojo.TbItemCatExample.Criteria;
import com.study.service.ItemCatService;

@Service
public class ItemCatServiceImpl implements ItemCatService {

	@Autowired
	TbItemCatMapper itemCatMapper;
	
	@Override
	public List<EasyUiTreeNode> list(Long parentId) {
		TbItemCatExample itemCatExample = new TbItemCatExample();
		Criteria criteria = itemCatExample.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		List<EasyUiTreeNode> treeNodes = new ArrayList<EasyUiTreeNode>();
		List<TbItemCat> itemCats = itemCatMapper.selectByExample(itemCatExample); 
		for (TbItemCat tbItemCat : itemCats) {
			EasyUiTreeNode easyUiTreeNode = new EasyUiTreeNode();
			easyUiTreeNode.setId(tbItemCat.getId());
			easyUiTreeNode.setText(tbItemCat.getName());
			String state = tbItemCat.getIsParent() == true ? "closed" : "open";
			easyUiTreeNode.setState(state);
			treeNodes.add(easyUiTreeNode);
		}
		return treeNodes;
	}

}
