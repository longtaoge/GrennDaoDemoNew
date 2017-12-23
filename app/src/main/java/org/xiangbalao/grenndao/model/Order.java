package org.xiangbalao.grenndao.model;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

import java.util.Date;

/**
 * Created by zhangzhe on 2017/12/12 0012.
 * <p>
 * 通用发票MODEL
 */
@Entity
public class Order extends BaseModel {

    @Id(autoincrement = true)
    private Long id;


    /**
     * 发票类型
     */
    private String receiptType;

    /**
     * 发票唯一识别码
     */
    private String receiptId;


    /**
     * 发票打印次数
     */
    private int printCount;

    /**
     * 是否是离线模式
     * 0 是
     * 1 不是
     */
    private int isoffline;

    /**
     * 商品列表
     * 一对多  一个发票ID 对应多个 商品记录
     */



    /**
     * 操作人
     */
    private String op;


    /**
     * 开票日期
     */
    private Date rDate;

    /**
     * 开票时间
     */
    private Date rTime;

    /**
     * 20位防伪码
     */
    private String antiFakeCode;

    /**
     * 折扣
     */
    private double discount;

    /**
     * 商品总额
     */
    private double aTotal;

    /**
     * 折扣、扣税后的商品总额
     */
    private double total;

    /**
     * 税额
     */
    private double tax;

    /**
     * 支付金额
     */
    private double cash;

    /**
     * 找零
     */
    private double change;

    /**
     * 日志编号
     */
    private String ejsn;

    /**
     * 日志日期
     */
    private Date ejActiDate;

    /**
     * 付款方式
     */
    private int payWay;

    /**
     * 支付金额
     */
    private double payAmount;



    /**
     * 纳税人ID
     */
    private Long taxPayerId;

    /**
     * 币种
     */
    private int currency;

    /**
     * 创建时间
     */
    private Date createdTime;


    /**
     * 创建人ID
     */
    private String creatorId;


    @Generated(hash = 1185021684)
    public Order(Long id, String receiptType, String receiptId, int printCount,
            int isoffline, String op, Date rDate, Date rTime, String antiFakeCode,
            double discount, double aTotal, double total, double tax, double cash,
            double change, String ejsn, Date ejActiDate, int payWay,
            double payAmount, Long taxPayerId, int currency, Date createdTime,
            String creatorId) {
        this.id = id;
        this.receiptType = receiptType;
        this.receiptId = receiptId;
        this.printCount = printCount;
        this.isoffline = isoffline;
        this.op = op;
        this.rDate = rDate;
        this.rTime = rTime;
        this.antiFakeCode = antiFakeCode;
        this.discount = discount;
        this.aTotal = aTotal;
        this.total = total;
        this.tax = tax;
        this.cash = cash;
        this.change = change;
        this.ejsn = ejsn;
        this.ejActiDate = ejActiDate;
        this.payWay = payWay;
        this.payAmount = payAmount;
        this.taxPayerId = taxPayerId;
        this.currency = currency;
        this.createdTime = createdTime;
        this.creatorId = creatorId;
    }


    @Generated(hash = 1105174599)
    public Order() {
    }


    public Long getId() {
        return this.id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getReceiptType() {
        return this.receiptType;
    }


    public void setReceiptType(String receiptType) {
        this.receiptType = receiptType;
    }


    public String getReceiptId() {
        return this.receiptId;
    }


    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }


    public int getPrintCount() {
        return this.printCount;
    }


    public void setPrintCount(int printCount) {
        this.printCount = printCount;
    }


    public int getIsoffline() {
        return this.isoffline;
    }


    public void setIsoffline(int isoffline) {
        this.isoffline = isoffline;
    }


    public String getOp() {
        return this.op;
    }


    public void setOp(String op) {
        this.op = op;
    }


    public Date getRDate() {
        return this.rDate;
    }


    public void setRDate(Date rDate) {
        this.rDate = rDate;
    }


    public Date getRTime() {
        return this.rTime;
    }


    public void setRTime(Date rTime) {
        this.rTime = rTime;
    }


    public String getAntiFakeCode() {
        return this.antiFakeCode;
    }


    public void setAntiFakeCode(String antiFakeCode) {
        this.antiFakeCode = antiFakeCode;
    }


    public double getDiscount() {
        return this.discount;
    }


    public void setDiscount(double discount) {
        this.discount = discount;
    }


    public double getATotal() {
        return this.aTotal;
    }


    public void setATotal(double aTotal) {
        this.aTotal = aTotal;
    }


    public double getTotal() {
        return this.total;
    }


    public void setTotal(double total) {
        this.total = total;
    }


    public double getTax() {
        return this.tax;
    }


    public void setTax(double tax) {
        this.tax = tax;
    }


    public double getCash() {
        return this.cash;
    }


    public void setCash(double cash) {
        this.cash = cash;
    }


    public double getChange() {
        return this.change;
    }


    public void setChange(double change) {
        this.change = change;
    }


    public String getEjsn() {
        return this.ejsn;
    }


    public void setEjsn(String ejsn) {
        this.ejsn = ejsn;
    }


    public Date getEjActiDate() {
        return this.ejActiDate;
    }


    public void setEjActiDate(Date ejActiDate) {
        this.ejActiDate = ejActiDate;
    }


    public int getPayWay() {
        return this.payWay;
    }


    public void setPayWay(int payWay) {
        this.payWay = payWay;
    }


    public double getPayAmount() {
        return this.payAmount;
    }


    public void setPayAmount(double payAmount) {
        this.payAmount = payAmount;
    }


    public Long getTaxPayerId() {
        return this.taxPayerId;
    }


    public void setTaxPayerId(Long taxPayerId) {
        this.taxPayerId = taxPayerId;
    }


    public int getCurrency() {
        return this.currency;
    }


    public void setCurrency(int currency) {
        this.currency = currency;
    }


    public Date getCreatedTime() {
        return this.createdTime;
    }


    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }


    public String getCreatorId() {
        return this.creatorId;
    }


    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }



}
