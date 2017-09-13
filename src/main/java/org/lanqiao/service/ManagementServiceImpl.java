package org.lanqiao.service;

import java.util.List;

import org.lanqiao.dao.OrderInfoDao;
import org.lanqiao.dao.ProductInfoDao;
import org.lanqiao.dao.ProductypeInfoDao;
import org.lanqiao.dao.UserInfoDao;
import org.lanqiao.entity.OrderInfo;
import org.lanqiao.entity.ProductInfo;
import org.lanqiao.entity.ProductypeInfo;
import org.lanqiao.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagementServiceImpl implements ManagementService {
	@Autowired
	ProductypeInfoDao productypeInfoDao;

	@Override
	public List<ProductypeInfo> selectAllProductType() {
		return productypeInfoDao.selectAllProductType();
	}

	@Override
	public boolean selectProductType(ProductypeInfo productypeInfo) {
		if (productypeInfoDao.selectProductType(productypeInfo) > 0) {
			return false;
		} else {
			return true;
		}
	}
	
	@Override
	public int selectProductTypeIdByType(String productType) {
		return productypeInfoDao.selectProductTypeIdByType(productType);
	}

	
	@Override
	public void insertProductType(ProductypeInfo productypeInfo) {
		productypeInfoDao.insert(productypeInfo);
	}

	@Override
	public void deleteProductType(int productTypeId) {
		productypeInfoDao.deleteByPrimaryKey(productTypeId);
	}

	@Autowired
	ProductInfoDao productInfoDao;

	@Override
	public int selectProductCount() {
		return productInfoDao.selectProductCount();
	}

	@Override
	public List<ProductInfo> selectProductByPage(int pageNum, int pageSize) {
		return productInfoDao.selectProductByPage((pageNum-1)*pageSize, pageSize);
	}

	@Override
	public void deleteProduct(int productId) {
		productInfoDao.deleteByPrimaryKey(productId);
	}

	@Override
	public boolean selectProductIfExist(ProductInfo productInfo) {
		if(productInfoDao.selectProduct(productInfo)>0){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public int insertProduct(ProductInfo productInfo) {
		return productInfoDao.insert(productInfo);
	}

	@Override
	public int changeInventory(int productId, int productInventory) {

		return productInfoDao.updateInventory(productId, productInventory);
	}

	@Override
	public int changePrice(int productId, float productPrice) {
		return productInfoDao.updatePrice(productId, productPrice);
	}

	@Autowired
	OrderInfoDao orderInfoDao;
	
	@Override
	public List<OrderInfo> selectOrders() {
		return orderInfoDao.selectOrders();
	}

	@Autowired
	UserInfoDao userInfoDao;
	@Override
	public List<UserInfo> selectAllUser() {
		return userInfoDao.selectAllUser();
	}

	@Override
	public boolean lockUser(UserInfo userInfo) {
		if(userInfoDao.updateByPrimaryKeySelective(userInfo)>0){
			return true;
		}else{
			return false;
		}
	}

	
}
