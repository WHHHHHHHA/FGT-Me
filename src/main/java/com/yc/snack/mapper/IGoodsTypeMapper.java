package com.yc.snack.mapper;

import java.util.List;

import com.yc.snack.bean.GoodsType;
/**
 * 商品类型管理
 * @author dell111
 *
 */
public interface IGoodsTypeMapper {
	/**
	 * 查询所有可用类型的方法
	 */
	
	public List<GoodsType> finds();
	
	
}
