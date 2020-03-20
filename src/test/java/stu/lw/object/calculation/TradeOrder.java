package stu.lw.object.calculation;

import java.io.Serializable;
import java.util.Date;

public class TradeOrder implements Serializable {
    /** */
    private static final long serialVersionUID = 1L;

    /** 支付订单号 */
    private Long payOrderId;

    /** 业务订单号 */
    private String bizOrderId;

    /** 医院id */
    private Long shopId;

    /** 医院名称 */
    private String shopName;

    /** 店铺简称 */
    private String shopShortName;

    /** 业务平台来源 */
    private String bizChannel;

    /** 业务类型 */
    private String bizType;

    /** 支付模式 */
    private String payMode;

    /** 支付渠道 */
    private String payChannel;

    /** 支付方法 */
    private String payMethod;

    /** 用户渠道id */
    private String channelUserId;

    /** 用户Id */
    private Long userId;

    /** 商品名称 */
    private String goodsName;

    /** 商品详情 */
    private String goodsDetails;

    /** 订单金额 */
    private Integer totalFee;

    /** 现金金额 */
    private Integer fee;

    /** 优惠金额 */
    private Integer discountFee;

    /** 优惠描述 */
    private String discountDesc;

    /** 实际支付金额 */
    private Integer realTotalFee;

    /** 支付时长(秒) */
    private Integer effectiveLength;

    /** 状态（U-预登记 S-成功 I-未知 F-失败 O-已撤销） */
    private String status;

    /** 支付流水号 */
    private Long paySerialNo;

    /** 内部商户Id */
    private Long insideMerchantId;

    /** 商户号Id */
    private String merchantId;

    /** 支付渠道商户订单号 */
    private String merchantOrderId;

    /** 预支付Id */
    private String prePayNo;

    /** 支付时间 */
    private Date payedTime;

    /** 支付流水号 */
    private String acquirerSerialNo;

    /** 支付银行 */
    private String bank;

    /** 支付银行流水 */
    private String bankSerial;

    /** 总退款金额 */
    private Integer totalRefundFee;

    /** 退款笔数 */
    private Integer totalRefundCount;

    /** 撤销,关闭,操作时间 */
    private Date revokeTime;

    /** 收费员ID */
    private Long cashierId;

    /** 收费员名称 */
    private String cashierName;

    /** 收款码ID */
    private Long qrCashierId;

    /** 收款码名称 */
    private String qrCashierName;

    /** 成本手续费费率 */
    private String hcServiceRate;

    /** 代理商手续费费率 */
    private String merchantServiceRate;

    /** 店铺手续费费率 */
    private String shopServiceRate;
    /** 设备信息 */
    private String deviceInfo;

    /** 扩展字段 */
    private String extFields;

    /** 创建时间 */
    private Date createTime;

    /** 更新时间 */
    private Date updateTime;

    /** 支付渠道ID */
    private String payChannelName;
    /** 支付方式名称 */
    private String payMethodName;
    /** 所属商户id */
    private Long hcMerchantId;
    /** 所属商户名称 */
    private String hcMerchantName;
    /** 备注 */
    private String memo;

    private String extShort1;

    public String getExtShort1() {
        return extShort1;
    }

    public void setExtShort1(String extShort1) {
        this.extShort1 = extShort1;
    }

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getPayChannelName() {
        return payChannelName;
    }

    public void setPayChannelName(String payChannelName) {
        this.payChannelName = payChannelName;
    }

    public String getPayMethodName() {
        return payMethodName;
    }

    public void setPayMethodName(String payMethodName) {
        this.payMethodName = payMethodName;
    }

    public Long getHcMerchantId() {
        return hcMerchantId;
    }

    public void setHcMerchantId(Long hcMerchantId) {
        this.hcMerchantId = hcMerchantId;
    }

    public String getHcMerchantName() {
        return hcMerchantName;
    }

    public void setHcMerchantName(String hcMerchantName) {
        this.hcMerchantName = hcMerchantName;
    }

    public Long getPayOrderId() {
        return payOrderId;
    }

    public void setPayOrderId(Long payOrderId) {
        this.payOrderId = payOrderId;
    }

    public String getBizOrderId() {
        return bizOrderId;
    }

    public void setBizOrderId(String bizOrderId) {
        this.bizOrderId = bizOrderId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getShopShortName() {
        return shopShortName;
    }

    public void setShopShortName(String shopShortName) {
        this.shopShortName = shopShortName == null ? null : shopShortName.trim();
    }

    public String getBizChannel() {
        return bizChannel;
    }

    public void setBizChannel(String bizChannel) {
        this.bizChannel = bizChannel == null ? null : bizChannel.trim();
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType == null ? null : bizType.trim();
    }

    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode == null ? null : payMode.trim();
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel == null ? null : payChannel.trim();
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod == null ? null : payMethod.trim();
    }

    public String getChannelUserId() {
        return channelUserId;
    }

    public void setChannelUserId(String channelUserId) {
        this.channelUserId = channelUserId == null ? null : channelUserId.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsDetails() {
        return goodsDetails;
    }

    public void setGoodsDetails(String goodsDetails) {
        this.goodsDetails = goodsDetails == null ? null : goodsDetails.trim();
    }

    public Integer getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
    }

    public Integer getFee() {
        return fee;
    }

    public void setFee(Integer fee) {
        this.fee = fee;
    }

    public Integer getDiscountFee() {
        return discountFee;
    }

    public void setDiscountFee(Integer discountFee) {
        this.discountFee = discountFee;
    }

    public String getDiscountDesc() {
        return discountDesc;
    }

    public void setDiscountDesc(String discountDesc) {
        this.discountDesc = discountDesc == null ? null : discountDesc.trim();
    }

    public Integer getRealTotalFee() {
        return realTotalFee;
    }

    public void setRealTotalFee(Integer realTotalFee) {
        this.realTotalFee = realTotalFee;
    }

    public Integer getEffectiveLength() {
        return effectiveLength;
    }

    public void setEffectiveLength(Integer effectiveLength) {
        this.effectiveLength = effectiveLength;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Long getPaySerialNo() {
        return paySerialNo;
    }

    public void setPaySerialNo(Long paySerialNo) {
        this.paySerialNo = paySerialNo;
    }

    public Long getInsideMerchantId() {
        return insideMerchantId;
    }

    public void setInsideMerchantId(Long insideMerchantId) {
        this.insideMerchantId = insideMerchantId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }

    public String getMerchantOrderId() {
        return merchantOrderId;
    }

    public void setMerchantOrderId(String merchantOrderId) {
        this.merchantOrderId = merchantOrderId == null ? null : merchantOrderId.trim();
    }

    public String getPrePayNo() {
        return prePayNo;
    }

    public void setPrePayNo(String prePayNo) {
        this.prePayNo = prePayNo == null ? null : prePayNo.trim();
    }

    public Date getPayedTime() {
        return payedTime;
    }

    public void setPayedTime(Date payedTime) {
        this.payedTime = payedTime;
    }

    public String getAcquirerSerialNo() {
        return acquirerSerialNo;
    }

    public void setAcquirerSerialNo(String acquirerSerialNo) {
        this.acquirerSerialNo = acquirerSerialNo == null ? null : acquirerSerialNo.trim();
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public String getBankSerial() {
        return bankSerial;
    }

    public void setBankSerial(String bankSerial) {
        this.bankSerial = bankSerial == null ? null : bankSerial.trim();
    }

    public Integer getTotalRefundFee() {
        return totalRefundFee;
    }

    public void setTotalRefundFee(Integer totalRefundFee) {
        this.totalRefundFee = totalRefundFee;
    }

    public Integer getTotalRefundCount() {
        return totalRefundCount;
    }

    public void setTotalRefundCount(Integer totalRefundCount) {
        this.totalRefundCount = totalRefundCount;
    }

    public Date getRevokeTime() {
        return revokeTime;
    }

    public void setRevokeTime(Date revokeTime) {
        this.revokeTime = revokeTime;
    }

    public Long getCashierId() {
        return cashierId;
    }

    public void setCashierId(Long cashierId) {
        this.cashierId = cashierId;
    }

    public String getCashierName() {
        return cashierName;
    }

    public void setCashierName(String cashierName) {
        this.cashierName = cashierName;
    }

    public Long getQrCashierId() {
        return qrCashierId;
    }

    public void setQrCashierId(Long qrCashierId) {
        this.qrCashierId = qrCashierId;
    }

    public String getQrCashierName() {
        return qrCashierName;
    }

    public void setQrCashierName(String qrCashierName) {
        this.qrCashierName = qrCashierName;
    }

    public String getHcServiceRate() {
        return hcServiceRate;
    }

    public void setHcServiceRate(String hcServiceRate) {
        this.hcServiceRate = hcServiceRate == null ? null : hcServiceRate.trim();
    }

    public String getMerchantServiceRate() {
        return merchantServiceRate;
    }

    public void setMerchantServiceRate(String merchantServiceRate) {
        this.merchantServiceRate = merchantServiceRate == null ? null : merchantServiceRate.trim();
    }

    public String getShopServiceRate() {
        return shopServiceRate;
    }

    public void setShopServiceRate(String shopServiceRate) {
        this.shopServiceRate = shopServiceRate == null ? null : shopServiceRate.trim();
    }

    public String getExtFields() {
        return extFields;
    }

    public void setExtFields(String extFields) {
        this.extFields = extFields == null ? null : extFields.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}