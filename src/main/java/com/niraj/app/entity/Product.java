package com.niraj.app.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id", nullable = false)
    private long productId;

    private String
            productName, productLongName,
            productType, productCategory, productQuality,
            barCode, manufacturedBy, manufacturedDetails,
            status, remarks;

    private long quantity, insideQuantity, sizeWidth, sizeLength, sizeDepth, weight;
    private String measurementUnit, weightMeasurementUnit;

    private long priceMoney, priceCoin;
    private String priceUnit;

    private String createdBy, updatedBy;
    private Date creationDate, updateDate, expirationDate;

    //The default constructor exists only for the sake of JPA; which use it directly, so it is designated as protected
    /*protected Product() {
    }

    public Product(long productId, String productName, String productLongName, String productType, String productCategory, String productQuality, String barCode, String manufacturedBy, String manufacturedDetails, String status, String remarks, long quantity, long insideQuantity, long sizeWidth, long sizeLength, long sizeDepth, long weight, String measurementUnit, String weightMeasurementUnit, long priceMoney, long priceCoin, String priceUnit, String createdBy, String updatedBy, Date creationDate, Date updateDate, Date expirationDate) {
        this.productId = productId;
        this.productName = productName;
        this.productLongName = productLongName;
        this.productType = productType;
        this.productCategory = productCategory;
        this.productQuality = productQuality;
        this.barCode = barCode;
        this.manufacturedBy = manufacturedBy;
        this.manufacturedDetails = manufacturedDetails;
        this.status = status;
        this.remarks = remarks;
        this.quantity = quantity;
        this.insideQuantity = insideQuantity;
        this.sizeWidth = sizeWidth;
        this.sizeLength = sizeLength;
        this.sizeDepth = sizeDepth;
        this.weight = weight;
        this.measurementUnit = measurementUnit;
        this.weightMeasurementUnit = weightMeasurementUnit;
        this.priceMoney = priceMoney;
        this.priceCoin = priceCoin;
        this.priceUnit = priceUnit;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.creationDate = creationDate;
        this.updateDate = updateDate;
        this.expirationDate = expirationDate;
    }

    public long getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductLongName() {
        return productLongName;
    }

    public String getProductType() {
        return productType;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public String getProductQuality() {
        return productQuality;
    }

    public String getBarCode() {
        return barCode;
    }

    public String getManufacturedBy() {
        return manufacturedBy;
    }

    public String getManufacturedDetails() {
        return manufacturedDetails;
    }

    public String getStatus() {
        return status;
    }

    public String getRemarks() {
        return remarks;
    }

    public long getQuantity() {
        return quantity;
    }

    public long getInsideQuantity() {
        return insideQuantity;
    }

    public long getSizeWidth() {
        return sizeWidth;
    }

    public long getSizeLength() {
        return sizeLength;
    }

    public long getSizeDepth() {
        return sizeDepth;
    }

    public long getWeight() {
        return weight;
    }

    public String getMeasurementUnit() {
        return measurementUnit;
    }

    public String getWeightMeasurementUnit() {
        return weightMeasurementUnit;
    }

    public long getPriceMoney() {
        return priceMoney;
    }

    public long getPriceCoin() {
        return priceCoin;
    }

    public String getPriceUnit() {
        return priceUnit;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productLongName='" + productLongName + '\'' +
                ", productType='" + productType + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", productQuality='" + productQuality + '\'' +
                ", barCode='" + barCode + '\'' +
                ", manufacturedBy='" + manufacturedBy + '\'' +
                ", manufacturedDetails='" + manufacturedDetails + '\'' +
                ", status='" + status + '\'' +
                ", remarks='" + remarks + '\'' +
                ", quantity=" + quantity +
                ", insideQuantity=" + insideQuantity +
                ", sizeWidth=" + sizeWidth +
                ", sizeLength=" + sizeLength +
                ", sizeDepth=" + sizeDepth +
                ", weight=" + weight +
                ", measurementUnit='" + measurementUnit + '\'' +
                ", weightMeasurementUnit='" + weightMeasurementUnit + '\'' +
                ", priceMoney=" + priceMoney +
                ", priceCoin=" + priceCoin +
                ", priceUnit='" + priceUnit + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", updatedBy='" + updatedBy + '\'' +
                ", creationDate=" + creationDate +
                ", updateDate=" + updateDate +
                ", expirationDate=" + expirationDate +
                '}';
    }*/
}
