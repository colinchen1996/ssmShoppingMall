package org.lanqiao.dao;

import org.lanqiao.entity.ProductImgInfo;

public interface ProductImgInfoDao {
    int insert(ProductImgInfo record);

    int insertSelective(ProductImgInfo record);
}