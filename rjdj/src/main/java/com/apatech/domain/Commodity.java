package com.apatech.domain;
/**
 * 商品主表
 * @author 刘成
 *
 */
public class Commodity {
    private String productcodeid;//商品货号
    private Integer supplierid;//供应商id
    private String brand;//商品品牌
    private String name;//商品名称
    private Float price;//商品单价
    private Float costprice;//成本价
    private Integer commoditytypeid;//商品类型ID
    private String commodityimg;//商品图片
    private Integer stockcount;//库存
    private String infomation;//商品信息
    private String shoptype;//商品类型
    
    

    @Override
	public String toString() {
		return "Commodity [productcodeid=" + productcodeid + ", supplierid=" + supplierid + ", brand=" + brand
				+ ", name=" + name + ", price=" + price + ", costprice=" + costprice + ", commoditytypeid="
				+ commoditytypeid + ", commodityimg=" + commodityimg + ", stockcount=" + stockcount + ", infomation="
				+ infomation + ", shoptype=" + shoptype + "]";
	}

	public Commodity() {
		super();
	}

	public String getProductcodeid() {
        return productcodeid;
    }

    public void setProductcodeid(String productcodeid) {
        this.productcodeid = productcodeid == null ? null : productcodeid.trim();
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getCostprice() {
        return costprice;
    }

    public void setCostprice(Float costprice) {
        this.costprice = costprice;
    }

    public Integer getCommoditytypeid() {
        return commoditytypeid;
    }

    public void setCommoditytypeid(Integer commoditytypeid) {
        this.commoditytypeid = commoditytypeid;
    }

    public String getCommodityimg() {
        return commodityimg;
    }

    public void setCommodityimg(String commodityimg) {
        this.commodityimg = commodityimg == null ? null : commodityimg.trim();
    }

    public Integer getStockcount() {
        return stockcount;
    }

    public void setStockcount(Integer stockcount) {
        this.stockcount = stockcount;
    }

    public String getInfomation() {
        return infomation;
    }

    public void setInfomation(String infomation) {
        this.infomation = infomation == null ? null : infomation.trim();
    }

	public String getShoptype() {
		return shoptype;
	}

	public void setShoptype(String shoptype) {
		this.shoptype = shoptype;
	}
    
}