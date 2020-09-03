package com.yc.snack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yc.snack.bean.GoodsType;
import com.yc.snack.service.IGoodsTypeService;

@RestController //说明这个是控制层，并且这里面的数据都是以json格式返回
@RequestMapping("/type")//这个类中的方法通过/type访问
public class GoodsTypeController {
	@Autowired
	private IGoodsTypeService goodsTypeService;
	@GetMapping("/finds")//这个方法通过GET请求方法，访问地址为./type/finds
	public List<GoodsType> finds(){
		return goodsTypeService.finds();
	}

}
