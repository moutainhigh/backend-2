/**
 * 
 */
package com.qhc.order.domain;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.qhc.order.entity.Characteristics;
import com.qhc.order.entity.ItemAttachment;

/**
 * @author Walker
 *
 */
public class ItemDto {
	private Integer id;
	private Integer rowNum;//行号
	private String materialCode;//物料编码,专用号
	private String materialName;//物料名称,规格型号
	private Boolean isConfigurable;//是否为可配置物料，物料信息带出
	private Boolean isPurchased;//物料属性  1是自制生产 0是外部采购, 物料类型，物料信息带出
	private String materialGroupCode;//SAP物料分组，物料信息带出
	private String materialGroupName;//SAP物料分组名称
	private String stMaterialGroupCode;//销售工具物料分组，物料信息带出
	private String stMaterialGroupName;//销售工具物料分组名称
	private String unitCode;//计量单位code，物料信息带出
	private String unitName;//计量单位名称，物料信息带出
	private double quantity;//数量
	private double standardPrice;//标准价格，客户信息
	private double retailPrice;//市场零售价，客户信息
	private double retailAmount;// 市场零售金额
	private double transactionPrice;//转移价，客户信息
//	private double yearPurchasePrice;//年采价，大客户有，客户信息
	private double actualPrice;//产品实卖价
	private double actualAmount;//产品实卖金额
	/* 可选项标准价差 */
	private Double optionalStandardPrice = null;
	/* 可选项零售价差 */
	private Double optionalRetailPrice = null;
	private double optionalActualPrice;//可选项实卖价
	private double optionalActualAmount;//可选项实卖金额
	private double optionalTransactionPrice;//可选项转移价
	private double b2cEstimatedPrice;//B2C预估价
	private double b2cEstimatedAmount;// B2C预估金额
	private double b2cEstimatedCost;//B2C预估成本单价
	private double actualPriceSum;// 实卖价合计
	private double actualAmountSum;// 实卖金额合计
	private double transactionPriceSum;// 转移价合计
	
	private double discount;//折扣，商品折扣，柜体和机组有，其他默认为100
	
	private String itemCategory;//行项目类别
	private String itemRequirementPlan;//需求计划
	private int period;//生产、采购周期
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd",timezone = "GMT+8")
	private Date deliveryDate;//最早交货时间
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd",timezone = "GMT+8")
	private Date produceDate;//生产开始时间
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd",timezone = "GMT+8")
	private Date shippDate; //要求发货时间  自己填
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd",timezone = "GMT+8")
	private Date onStoreDate;//入库时间
	
	private Integer deliveryAddressSeq; // 发货地址序号
	private Integer deliveryAddressId; // 发货地址ID
	private String provinceCode; // 省code 从发货地址带出
	private String provinceName; // 省code 从发货地址带出 
	private String cityCode; // 市code 从发货地址带出
	private String cityName; // 市code 从发货地址带出
	private String districtCode; // 区code 从发货地址带出
	private String districtName; // 区code 从发货地址带出
	private String address; // 地址 从发货地址带出
	
	private String b2cComments;//B2C备注
	private String specialComments;//特殊备注
	private String colorComments; // color 备注

	/* 最终颜色可选项数据格式：喷粉部位:颜色选项,   P01:1,P06:1,P07:1 */
	private String colorOptions = null;
	
	private List<CharacteristicDto> configs;//配置表数据(配置表页面)
	
	private String configComments;//配置表备注/调研表备注(配置表页面)
	private String mosaicImage;//拼接图备注(配置表页面)
	private String attachedImage;//拼接图附件(配置表页面)
	private int isVirtual;//工程虚拟物料
	private double volumeCube;//物料体积
	private double feight;//运费
	private String requestBrand; // 商标要求
	private String requestPackage; // 木包装要求
	private String requestNameplate; // 铭牌要求
	private String requestCircult; // 电路图要求
	
	private String comments;
	private String clazzCode;//物料分类代码

	/* 行状态 */
	private String itemStatus = null;
	
	private List<ItemAttachment> attachments; // 调研表附件
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getRowNum() {
		return rowNum;
	}
	public void setRowNum(Integer rowNum) {
		this.rowNum = rowNum;
	}
	public String getMaterialCode() {
		return materialCode;
	}
	public void setMaterialCode(String materialCode) {
		this.materialCode = materialCode;
	}
	public String getMaterialName() {
		return materialName;
	}
	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}
	public Boolean getIsConfigurable() {
		return isConfigurable;
	}
	public void setIsConfigurable(Boolean isConfigurable) {
		this.isConfigurable = isConfigurable;
	}
	public Boolean getIsPurchased() {
		return isPurchased;
	}
	public void setIsPurchased(Boolean isPurchased) {
		this.isPurchased = isPurchased;
	}
	public String getMaterialGroupCode() {
		return materialGroupCode;
	}
	public void setMaterialGroupCode(String materialGroupCode) {
		this.materialGroupCode = materialGroupCode;
	}
	public String getMaterialGroupName() {
		return materialGroupName;
	}
	public void setMaterialGroupName(String materialGroupName) {
		this.materialGroupName = materialGroupName;
	}
	public String getStMaterialGroupCode() {
		return stMaterialGroupCode;
	}
	public void setStMaterialGroupCode(String stMaterialGroupCode) {
		this.stMaterialGroupCode = stMaterialGroupCode;
	}
	public String getStMaterialGroupName() {
		return stMaterialGroupName;
	}
	public void setStMaterialGroupName(String stMaterialGroupName) {
		this.stMaterialGroupName = stMaterialGroupName;
	}
	public String getUnitCode() {
		return unitCode;
	}
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getStandardPrice() {
		return standardPrice;
	}
	public void setStandardPrice(double standardPrice) {
		this.standardPrice = standardPrice;
	}
	public double getRetailPrice() {
		return retailPrice;
	}
	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}
	public double getRetailAmount() {
		return retailAmount;
	}
	public void setRetailAmount(double retailAmount) {
		this.retailAmount = retailAmount;
	}
	public double getTransactionPrice() {
		return transactionPrice;
	}
	public void setTransactionPrice(double transactionPrice) {
		this.transactionPrice = transactionPrice;
	}
//	public double getYearPurchasePrice() {
//		return yearPurchasePrice;
//	}
//	public void setYearPurchasePrice(double yearPurchasePrice) {
//		this.yearPurchasePrice = yearPurchasePrice;
//	}
	public double getActualPrice() {
		return actualPrice;
	}
	public void setActualPrice(double actualPrice) {
		this.actualPrice = actualPrice;
	}
	public double getActualAmount() {
		return actualAmount;
	}
	public void setActualAmount(double actualAmount) {
		this.actualAmount = actualAmount;
	}
	public Double getOptionalStandardPrice() {
		return optionalStandardPrice;
	}
	public void setOptionalStandardPrice(Double optionalStandardPrice) {
		this.optionalStandardPrice = optionalStandardPrice;
	}
	public Double getOptionalRetailPrice() {
		return optionalRetailPrice;
	}
	public void setOptionalRetailPrice(Double optionalRetailPrice) {
		this.optionalRetailPrice = optionalRetailPrice;
	}
	public double getOptionalActualPrice() {
		return optionalActualPrice;
	}
	public void setOptionalActualPrice(double optionalActualPrice) {
		this.optionalActualPrice = optionalActualPrice;
	}
	public double getOptionalActualAmount() {
		return optionalActualAmount;
	}
	public void setOptionalActualAmount(double optionalActualAmount) {
		this.optionalActualAmount = optionalActualAmount;
	}
	public double getOptionalTransactionPrice() {
		return optionalTransactionPrice;
	}
	public void setOptionalTransactionPrice(double optionalTransactionPrice) {
		this.optionalTransactionPrice = optionalTransactionPrice;
	}
	public double getB2cEstimatedPrice() {
		return b2cEstimatedPrice;
	}
	public void setB2cEstimatedPrice(double b2cEstimatedPrice) {
		this.b2cEstimatedPrice = b2cEstimatedPrice;
	}
	public double getB2cEstimatedAmount() {
		return b2cEstimatedAmount;
	}
	public void setB2cEstimatedAmount(double b2cEstimatedAmount) {
		this.b2cEstimatedAmount = b2cEstimatedAmount;
	}
	public double getB2cEstimatedCost() {
		return b2cEstimatedCost;
	}
	public void setB2cEstimatedCost(double b2cEstimatedCost) {
		this.b2cEstimatedCost = b2cEstimatedCost;
	}
	public double getActualPriceSum() {
		return actualPriceSum;
	}
	public void setActualPriceSum(double actualPriceSum) {
		this.actualPriceSum = actualPriceSum;
	}
	public double getActualAmountSum() {
		return actualAmountSum;
	}
	public void setActualAmountSum(double actualAmountSum) {
		this.actualAmountSum = actualAmountSum;
	}
	public double getTransactionPriceSum() {
		return transactionPriceSum;
	}
	public void setTransactionPriceSum(double transactionPriceSum) {
		this.transactionPriceSum = transactionPriceSum;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String getItemCategory() {
		return itemCategory;
	}
	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}
	public String getItemRequirementPlan() {
		return itemRequirementPlan;
	}
	public void setItemRequirementPlan(String itemRequirementPlan) {
		this.itemRequirementPlan = itemRequirementPlan;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public Date getProduceDate() {
		return produceDate;
	}
	public void setProduceDate(Date produceDate) {
		this.produceDate = produceDate;
	}
	public Date getShippDate() {
		return shippDate;
	}
	public void setShippDate(Date shippDate) {
		this.shippDate = shippDate;
	}
	public Date getOnStoreDate() {
		return onStoreDate;
	}
	public void setOnStoreDate(Date onStoreDate) {
		this.onStoreDate = onStoreDate;
	}
	public Integer getDeliveryAddressSeq() {
		return deliveryAddressSeq;
	}
	public void setDeliveryAddressSeq(Integer deliveryAddressSeq) {
		this.deliveryAddressSeq = deliveryAddressSeq;
	}
	public Integer getDeliveryAddressId() {
		return deliveryAddressId;
	}
	public void setDeliveryAddressId(Integer deliveryAddressId) {
		this.deliveryAddressId = deliveryAddressId;
	}
	public String getProvinceCode() {
		return provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getDistrictCode() {
		return districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getB2cComments() {
		return b2cComments;
	}
	public void setB2cComments(String b2cComments) {
		this.b2cComments = b2cComments;
	}
	public String getSpecialComments() {
		return specialComments;
	}
	public void setSpecialComments(String specialComments) {
		this.specialComments = specialComments;
	}
	public String getColorComments() {
		return colorComments;
	}
	public void setColorComments(String colorComments) {
		this.colorComments = colorComments;
	}
	public String getColorOptions() {
		return colorOptions;
	}
	public void setColorOptions(String colorOptions) {
		this.colorOptions = colorOptions;
	}
	public String getConfigComments() {
		return configComments;
	}
	public void setConfigComments(String configComments) {
		this.configComments = configComments;
	}
	public String getMosaicImage() {
		return mosaicImage;
	}
	public void setMosaicImage(String mosaicImage) {
		this.mosaicImage = mosaicImage;
	}
	public String getAttachedImage() {
		return attachedImage;
	}
	public void setAttachedImage(String attachedImage) {
		this.attachedImage = attachedImage;
	}
	public List<CharacteristicDto> getConfigs() {
		return configs;
	}
	public void setConfigs(List<CharacteristicDto> configs) {
		this.configs = configs;
	}
	public int getIsVirtual() {
		return isVirtual;
	}
	public void setIsVirtual(int isVirtual) {
		this.isVirtual = isVirtual;
	}
	public double getVolumeCube() {
		return volumeCube;
	}
	public void setVolumeCube(double volumeCube) {
		this.volumeCube = volumeCube;
	}
	public double getFeight() {
		return feight;
	}
	public void setFeight(double feight) {
		this.feight = feight;
	}
	public String getRequestBrand() {
		return requestBrand;
	}
	public void setRequestBrand(String requestBrand) {
		this.requestBrand = requestBrand;
	}
	public String getRequestPackage() {
		return requestPackage;
	}
	public void setRequestPackage(String requestPackage) {
		this.requestPackage = requestPackage;
	}
	public String getRequestNameplate() {
		return requestNameplate;
	}
	public void setRequestNameplate(String requestNameplate) {
		this.requestNameplate = requestNameplate;
	}
	public String getRequestCircult() {
		return requestCircult;
	}
	public void setRequestCircult(String requestCircult) {
		this.requestCircult = requestCircult;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getClazzCode() {
		return clazzCode;
	}
	public void setClazzCode(String clazzCode) {
		this.clazzCode = clazzCode;
	}
	public String getItemStatus() {
		return itemStatus;
	}
	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}
	public List<ItemAttachment> getAttachments() {
		return attachments;
	}
	public void setAttachments(List<ItemAttachment> attachments) {
		this.attachments = attachments;
	}
	@Override
	public String toString() {
		return "ItemDto [id=" + id + ", rowNum=" + rowNum + ", materialCode=" + materialCode + ", materialName="
				+ materialName + ", isConfigurable=" + isConfigurable + ", isPurchased=" + isPurchased
				+ ", materialGroupCode=" + materialGroupCode + ", materialGroupName=" + materialGroupName
				+ ", stMaterialGroupCode=" + stMaterialGroupCode + ", stMaterialGroupName=" + stMaterialGroupName
				+ ", unitCode=" + unitCode + ", unitName=" + unitName + ", quantity=" + quantity + ", standardPrice="
				+ standardPrice + ", retailPrice=" + retailPrice + ", retailAmount=" + retailAmount
				+ ", transactionPrice=" + transactionPrice
				+ ", actualPrice=" + actualPrice + ", actualAmount=" + actualAmount + ", optionalStandardPrice="
				+ optionalStandardPrice + ", optionalRetailPrice=" + optionalRetailPrice + ", optionalActualPrice="
				+ optionalActualPrice + ", optionalActualAmount=" + optionalActualAmount + ", optionalTransactionPrice="
				+ optionalTransactionPrice + ", b2cEstimatedPrice=" + b2cEstimatedPrice + ", b2cEstimatedAmount="
				+ b2cEstimatedAmount + ", b2cEstimatedCost=" + b2cEstimatedCost + ", actualPriceSum=" + actualPriceSum
				+ ", actualAmountSum=" + actualAmountSum + ", transactionPriceSum=" + transactionPriceSum
				+ ", discount=" + discount + ", itemCategory=" + itemCategory + ", itemRequirementPlan="
				+ itemRequirementPlan + ", period=" + period + ", deliveryDate=" + deliveryDate + ", produceDate="
				+ produceDate + ", shippDate=" + shippDate + ", onStoreDate=" + onStoreDate + ", deliveryAddressSeq="
				+ deliveryAddressSeq + ", deliveryAddressId=" + deliveryAddressId + ", provinceCode=" + provinceCode
				+ ", provinceName=" + provinceName + ", cityCode=" + cityCode + ", cityName=" + cityName
				+ ", districtCode=" + districtCode + ", districtName=" + districtName + ", address=" + address
				+ ", b2cComments=" + b2cComments + ", specialComments=" + specialComments + ", colorComments="
				+ colorComments + ", colorOptions=" + colorOptions + ", configs=" + configs + ", configComments="
				+ configComments + ", mosaicImage=" + mosaicImage + ", attachedImage=" + attachedImage + ", isVirtual="
				+ isVirtual + ", volumeCube=" + volumeCube + ", feight=" + feight + ", requestBrand=" + requestBrand
				+ ", requestPackage=" + requestPackage + ", requestNameplate=" + requestNameplate + ", requestCircult="
				+ requestCircult + ", comments=" + comments + ", clazzCode=" + clazzCode + ", itemStatus=" + itemStatus
				+ ", attachments=" + attachments + "]";
	}
}
