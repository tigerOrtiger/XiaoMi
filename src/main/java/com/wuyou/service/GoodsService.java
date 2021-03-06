/**  
* <p>Title: GoodsService.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月21日  
* @version 1.0  
*/
package com.wuyou.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wuyou.entity.Goods;
import com.wuyou.entity.GoodsExample;
import com.wuyou.entity.GoodsVo;
import com.wuyou.entity.GoodsWithBLOBs;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月21日 
 */
public interface GoodsService {
    
	public int insert(GoodsWithBLOBs record);
	
	int deleteByPrimaryKey(Integer goodsId);
	int updateByPrimaryKeySelective(GoodsWithBLOBs record);
	int updateByPrimaryKey(Goods record);	
	public  List<Goods> selectByExample(GoodsExample example);
	 List<GoodsWithBLOBs> selectByExampleWithBLOBs(GoodsExample example);
	 List<GoodsVo> goodsVoSelect();
	 GoodsVo selectByPrimaryKey(Integer goodsId);
}
