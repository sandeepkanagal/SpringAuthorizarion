package com.oauth.model;
import java.util.Date;

public class OrderServiceBean {
    
	private Long orderId;
	private String orderBy;
	private String orderName;
	private float orderCost;
	private int orderQuantity;
	private Date deliveryDate;
	private String remarks;
	private String info;
    private String custEmail;
    private String custAddress;    
      
	public OrderServiceBean() {
		super();
	}
	
	public OrderServiceBean(Long orderId, String orderBy, String orderName, float orderCost, int orderQuantity,
			Date deliveryDate, String remarks, String info, String custEmail, String custAddress) {
		super();
		this.orderId = orderId;
		this.orderBy = orderBy;
		this.orderName = orderName;
		this.orderCost = orderCost;
		this.orderQuantity = orderQuantity;
		this.deliveryDate = deliveryDate;
		this.remarks = remarks;
		this.info = info;
		this.custEmail = custEmail;
		this.custAddress = custAddress;
	}

	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public float getOrderCost() {
		return orderCost;
	}
	public void setOrderCost(float orderCost) {
		this.orderCost = orderCost;
	}
	public int getOrderQuantity() {
		return orderQuantity;
	}
	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	
	@Override
	public String toString() {
		return "OrderServiceBean [orderId=" + orderId + ", orderBy=" + orderBy + ", orderName=" + orderName
				+ ", orderCost=" + orderCost + ", orderQuantity=" + orderQuantity + ", deliveryDate=" + deliveryDate
				+ ", custEmail=" + custEmail + ", custAddress=" + custAddress + "]";
	}	
    
}
