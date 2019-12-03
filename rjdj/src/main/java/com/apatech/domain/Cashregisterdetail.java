package com.apatech.domain;
/**
 * 订单详表
 * @author 刘成
 *
 */
public class Cashregisterdetail {
    private String cashregisterdetailid;//编号，主键
    private String cashregisterid;//条形码，主键
    private String commodityname;//商品名称
    private String commoditydetailid;//商品详表ID
    private String specifications;//规格
    private Float price;//单价
    private Float sbtotal;//小计
    private Integer count;//数量
    private Integer zhekou;//折扣
    private Float moneyamt;//总金额
    private Commoditydetail commoditydetail;	//商品详情对象
    
	public String getCashregisterdetailid() {
		return cashregisterdetailid;
	}
	public void setCashregisterdetailid(String cashregisterdetailid) {
		this.cashregisterdetailid = cashregisterdetailid;
	}
	public String getCashregisterid() {
		return cashregisterid;
	}
	public void setCashregisterid(String cashregisterid) {
		this.cashregisterid = cashregisterid;
	}
	public String getCommodityname() {
		return commodityname;
	}
	public void setCommodityname(String commodityname) {
		this.commodityname = commodityname;
	}
	public String getCommoditydetailid() {
		return commoditydetailid;
	}
	public void setCommoditydetailid(String commoditydetailid) {
		this.commoditydetailid = commoditydetailid;
	}
	public String getSpecifications() {
		return specifications;
	}
	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Float getSbtotal() {
		return sbtotal;
	}
	public void setSbtotal(Float sbtotal) {
		this.sbtotal = sbtotal;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer getZhekou() {
		return zhekou;
	}
	public void setZhekou(Integer zhekou) {
		this.zhekou = zhekou;
	}
	public Float getMoneyamt() {
		return moneyamt;
	}
	public void setMoneyamt(Float moneyamt) {
		this.moneyamt = moneyamt;
	}
	public Commoditydetail getCommoditydetail() {
		return commoditydetail;
	}
	public void setCommoditydetail(Commoditydetail commoditydetail) {
		this.commoditydetail = commoditydetail;
	}
	@Override
	public String toString() {
		return "Cashregisterdetail [cashregisterdetailid=" + cashregisterdetailid + ", cashregisterid=" + cashregisterid
				+ ", commodityname=" + commodityname + ", commoditydetailid=" + commoditydetailid + ", specifications="
				+ specifications + ", price=" + price + ", sbtotal=" + sbtotal + ", count=" + count + ", zhekou="
				+ zhekou + ", moneyamt=" + moneyamt + ", commoditydetail=" + commoditydetail + "]";
	}
	public Cashregisterdetail(String cashregisterdetailid, String cashregisterid, String commodityname,
			String commoditydetailid, String specifications, Float price, Float sbtotal, Integer count, Integer zhekou,
			Float moneyamt, Commoditydetail commoditydetail) {
		super();
		this.cashregisterdetailid = cashregisterdetailid;
		this.cashregisterid = cashregisterid;
		this.commodityname = commodityname;
		this.commoditydetailid = commoditydetailid;
		this.specifications = specifications;
		this.price = price;
		this.sbtotal = sbtotal;
		this.count = count;
		this.zhekou = zhekou;
		this.moneyamt = moneyamt;
		this.commoditydetail = commoditydetail;
	}
    
	public Cashregisterdetail() {
		super();
	}
	       
}