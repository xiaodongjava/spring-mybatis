package com.spring.mybatis.domain.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 个人客户账户流水表
 * 
 * @date 2016年9月26日
 */
public class IndividualAccountRecord extends AbstractBasiceEntity {
	private static final long serialVersionUID = 850344553418727513L;
	// Fields
	private String accountSn;// 账户流水
	private String tradeCode;// 交易代码
	private String accountNumber;// 账户
	private String accountType;// 账户类型(数据库验证)
	private String customerNumber;// 客户编号
	private String tradeSn;// 交易流水
	private String tradeFlag;// 交易方向
	private String tradeMethod;// 交易方式
	private BigDecimal tradeAmount;// 交易金额
	private Date tradeDate;// 交易时间
	private Date bizDate;// 业务日期
	private Date billDate;// 账务日期
	private String bizBatch;// 业务批次
	private String bizOrder;// 业务订单
	private String bizSn;// 业务流水
	private String bizNote;// 业务描述
	private String relateTrade;// 关联交易
	private String referTrade;// 参考交易(用于撤销时关联)
	private String clearState;// 清分状态
	private Date clearDate;// 清分时间
	private Date checkDate;// 对账时间
	private String checkState;// 对账状态
	// Constructors

	/** Default constructor **/
	public IndividualAccountRecord() {

	}

	// Property accessors
	public String getAccountSn() {
		return accountSn;
	}

	public void setAccountSn(String accountSn) {
		this.accountSn = accountSn;
	}

	public String getTradeCode() {
		return tradeCode;
	}

	public void setTradeCode(String tradeCode) {
		this.tradeCode = tradeCode;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getTradeSn() {
		return tradeSn;
	}

	public void setTradeSn(String tradeSn) {
		this.tradeSn = tradeSn;
	}

	public String getTradeFlag() {
		return tradeFlag;
	}

	public void setTradeFlag(String tradeFlag) {
		this.tradeFlag = tradeFlag;
	}

	public String getTradeMethod() {
		return tradeMethod;
	}

	public void setTradeMethod(String tradeMethod) {
		this.tradeMethod = tradeMethod;
	}

	public BigDecimal getTradeAmount() {
		return tradeAmount;
	}

	public void setTradeAmount(BigDecimal tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public Date getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(Date tradeDate) {
		this.tradeDate = tradeDate;
	}

	public Date getBizDate() {
		return bizDate;
	}

	public void setBizDate(Date bizDate) {
		this.bizDate = bizDate;
	}

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public String getBizBatch() {
		return bizBatch;
	}

	public void setBizBatch(String bizBatch) {
		this.bizBatch = bizBatch;
	}

	public String getBizOrder() {
		return bizOrder;
	}

	public void setBizOrder(String bizOrder) {
		this.bizOrder = bizOrder;
	}

	public String getBizSn() {
		return bizSn;
	}

	public void setBizSn(String bizSn) {
		this.bizSn = bizSn;
	}

	public String getBizNote() {
		return bizNote;
	}

	public void setBizNote(String bizNote) {
		this.bizNote = bizNote;
	}

	public String getRelateTrade() {
		return relateTrade;
	}

	public void setRelateTrade(String relateTrade) {
		this.relateTrade = relateTrade;
	}

	public String getReferTrade() {
		return referTrade;
	}

	public void setReferTrade(String referTrade) {
		this.referTrade = referTrade;
	}

	public String getClearState() {
		return clearState;
	}

	public void setClearState(String clearState) {
		this.clearState = clearState;
	}

	public Date getClearDate() {
		return clearDate;
	}

	public void setClearDate(Date clearDate) {
		this.clearDate = clearDate;
	}

	public Date getCheckDate() {
		return checkDate;
	}

	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}

	public String getCheckState() {
		return checkState;
	}

	public void setCheckState(String checkState) {
		this.checkState = checkState;
	}
}
