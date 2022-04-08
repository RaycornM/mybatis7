package com.tedu.pojo;

import java.util.Date;

public class TbOrder {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.rid
     *
     * @mbg.generated Fri Apr 08 11:05:42 HKT 2022
     */
    private Integer rid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.user_id
     *
     * @mbg.generated Fri Apr 08 11:05:42 HKT 2022
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.order_id
     *
     * @mbg.generated Fri Apr 08 11:05:42 HKT 2022
     */
    private String orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.sta
     *
     * @mbg.generated Fri Apr 08 11:05:42 HKT 2022
     */
    private String sta;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.address_id
     *
     * @mbg.generated Fri Apr 08 11:05:42 HKT 2022
     */
    private Integer addressId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.payment
     *
     * @mbg.generated Fri Apr 08 11:05:42 HKT 2022
     */
    private Double payment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.placed
     *
     * @mbg.generated Fri Apr 08 11:05:42 HKT 2022
     */
    private Date placed;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.receipt
     *
     * @mbg.generated Fri Apr 08 11:05:42 HKT 2022
     */
    private Date receipt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.deliver
     *
     * @mbg.generated Fri Apr 08 11:05:42 HKT 2022
     */
    private Date deliver;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.handover
     *
     * @mbg.generated Fri Apr 08 11:05:42 HKT 2022
     */
    private Date handover;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.rid
     *
     * @return the value of tb_order.rid
     *
     * @mbg.generated Fri Apr 08 11:05:42 HKT 2022
     */
    public Integer getRid() {
        return rid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.rid
     *
     * @param rid the value for tb_order.rid
     *
     * @mbg.generated Fri Apr 08 11:05:42 HKT 2022
     */
    public void setRid(Integer rid) {
        this.rid = rid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.user_id
     *
     * @return the value of tb_order.user_id
     *
     * @mbg.generated Fri Apr 08 11:05:42 HKT 2022
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.user_id
     *
     * @param userId the value for tb_order.user_id
     *
     * @mbg.generated Fri Apr 08 11:05:42 HKT 2022
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.order_id
     *
     * @return the value of tb_order.order_id
     *
     * @mbg.generated Fri Apr 08 11:05:42 HKT 2022
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.order_id
     *
     * @param orderId the value for tb_order.order_id
     *
     * @mbg.generated Fri Apr 08 11:05:42 HKT 2022
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.sta
     *
     * @return the value of tb_order.sta
     *
     * @mbg.generated Fri Apr 08 11:05:42 HKT 2022
     */
    public String getSta() {
        return sta;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.sta
     *
     * @param sta the value for tb_order.sta
     *
     * @mbg.generated Fri Apr 08 11:05:42 HKT 2022
     */
    public void setSta(String sta) {
        this.sta = sta;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.address_id
     *
     * @return the value of tb_order.address_id
     *
     * @mbg.generated Fri Apr 08 11:05:42 HKT 2022
     */
    public Integer getAddressId() {
        return addressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.address_id
     *
     * @param addressId the value for tb_order.address_id
     *
     * @mbg.generated Fri Apr 08 11:05:42 HKT 2022
     */
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.payment
     *
     * @return the value of tb_order.payment
     *
     * @mbg.generated Fri Apr 08 11:05:42 HKT 2022
     */
    public Double getPayment() {
        return payment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.payment
     *
     * @param payment the value for tb_order.payment
     *
     * @mbg.generated Fri Apr 08 11:05:42 HKT 2022
     */
    public void setPayment(Double payment) {
        this.payment = payment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.placed
     *
     * @return the value of tb_order.placed
     *
     * @mbg.generated Fri Apr 08 11:05:42 HKT 2022
     */
    public Date getPlaced() {
        return placed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.placed
     *
     * @param placed the value for tb_order.placed
     *
     * @mbg.generated Fri Apr 08 11:05:42 HKT 2022
     */
    public void setPlaced(Date placed) {
        this.placed = placed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.receipt
     *
     * @return the value of tb_order.receipt
     *
     * @mbg.generated Fri Apr 08 11:05:42 HKT 2022
     */
    public Date getReceipt() {
        return receipt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.receipt
     *
     * @param receipt the value for tb_order.receipt
     *
     * @mbg.generated Fri Apr 08 11:05:42 HKT 2022
     */
    public void setReceipt(Date receipt) {
        this.receipt = receipt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.deliver
     *
     * @return the value of tb_order.deliver
     *
     * @mbg.generated Fri Apr 08 11:05:42 HKT 2022
     */
    public Date getDeliver() {
        return deliver;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.deliver
     *
     * @param deliver the value for tb_order.deliver
     *
     * @mbg.generated Fri Apr 08 11:05:42 HKT 2022
     */
    public void setDeliver(Date deliver) {
        this.deliver = deliver;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.handover
     *
     * @return the value of tb_order.handover
     *
     * @mbg.generated Fri Apr 08 11:05:42 HKT 2022
     */
    public Date getHandover() {
        return handover;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.handover
     *
     * @param handover the value for tb_order.handover
     *
     * @mbg.generated Fri Apr 08 11:05:42 HKT 2022
     */
    public void setHandover(Date handover) {
        this.handover = handover;
    }
}