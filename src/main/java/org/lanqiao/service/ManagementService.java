package org.lanqiao.service;

import java.util.List;

import org.lanqiao.entity.OrderInfo;
import org.lanqiao.entity.ProductInfo;
import org.lanqiao.entity.ProductypeInfo;
import org.lanqiao.entity.UserInfo;

public interface ManagementService {
	List<ProductypeInfo> selectAllProductType();
	
	boolean selectProductType(ProductypeInfo productypeInfo);//根据商品种类或者商品种类id查询该商品种类或者id是否存在

	int selectProductTypeIdByType(String productType);//根据商品类型查出商品类型id
	
	void insertProductType(ProductypeInfo productypeInfo);

	void deleteProductType(int productTypeId);
	
	int selectProductCount(); //查询商品的总数
	
	List<ProductInfo> selectProductByPage(int pageNum,int pageSize);
	
	void deleteProduct(int productId);
	
	boolean selectProductIfExist(ProductInfo productInfo);//根据商品id或商品名查询该商品是否已经存在
	
	int insertProduct(ProductInfo productInfo);//插入商品信息
	
	int changeInventory(int productId,int productInventory);//修改商品库存
	
	int changePrice(int productId,float productPrice);//更新商品价格
	
	List<OrderInfo> selectOrders();//查询订单信息
	
	List<UserInfo> selectAllUser();//查询所有用户信息
	
	boolean lockUser(UserInfo userInfo);//锁定用户
	
}
