package org.lanqiao.dao;

import java.util.List;

import org.lanqiao.entity.ProductypeInfo;

public interface ProductypeInfoDao {
    int deleteByPrimaryKey(Integer productTypeId);

    int insert(ProductypeInfo record);

    int insertSelective(ProductypeInfo record);

    ProductypeInfo selectByPrimaryKey(Integer productTypeId);

    int updateByPrimaryKeySelective(ProductypeInfo record);

    int updateByPrimaryKey(ProductypeInfo record);
    
    List<ProductypeInfo> selectAllProductType();//查询所有商品种类
    
    int selectProductType(ProductypeInfo productypeInfo);//根据商品种类或者商品种类id查询该商品种类或者id是否存在
    
    int selectProductTypeIdByType(String productType);
    
    
}