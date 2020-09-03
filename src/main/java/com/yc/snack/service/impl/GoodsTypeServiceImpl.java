package com.yc.snack.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.snack.bean.GoodsType;
import com.yc.snack.mapper.IGoodsTypeMapper;
import com.yc.snack.service.IGoodsTypeService;

/**
 * 商品类型的业务模型层的实现
 * @author dell111
 *
 */

@Service //说明这个是业务层bean
public class GoodsTypeServiceImpl implements IGoodsTypeService {
	@Autowired //采用自动注入的方法
	private IGoodsTypeMapper goodsTypeMapper;
	
	@Override
	public List<GoodsType> finds() {
		// 调用数据模型层访问数据库
		return goodsTypeMapper.finds();
	}

}
