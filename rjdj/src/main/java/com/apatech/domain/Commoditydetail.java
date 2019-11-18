package com.apatech.domain;
/**
 * 商品详表 
 * @author 刘成
 *
 */
public class Commoditydetail {
    private String commoditydetailid;//条形码，主键
    private String productcodeid;//商品主表ID
    private Integer colorid;//商品颜色ID
    private Integer commoditysizeid;//商品尺码
    private Integer count;//数量
    
    @Override
	public String toString() {
		return "Commoditydetail [commoditydetailid=" + commoditydetailid + ", productcodeid=" + productcodeid
				+ ", colorid=" + colorid + ", commoditysizeid=" + commoditysizeid + ", count=" + count + "]";
	}

	public Commoditydetail() {
		super();
	}

	public String getCommoditydetailid() {
        return commoditydetailid;
    }

    public void setCommoditydetailid(String commoditydetailid) {
        this.commoditydetailid = commoditydetailid == null ? null : commoditydetailid.trim();
    }

    public String getProductcodeid() {
        return productcodeid;
    }

    public void setProductcodeid(String productcodeid) {
        this.productcodeid = productcodeid == null ? null : productcodeid.trim();
    }

    public Integer getColorid() {
        return colorid;
    }

    public void setColorid(Integer colorid) {
        this.colorid = colorid;
    }

    public Integer getCommoditysizeid() {
        return commoditysizeid;
    }

    public void setCommoditysizeid(Integer commoditysizeid) {
        this.commoditysizeid = commoditysizeid;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}