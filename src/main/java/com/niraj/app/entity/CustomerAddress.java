package com.niraj.app.entity;

import javax.persistence.*;

@Entity
public class CustomerAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="customer_add_id")
    private long customerAddId;

    @Column(name = "customer_id")
    private long customerId;

    @Column(name="customer_add1")
    private String customerAdd1;

    @Column(name="customer_add2")
    private String customerAdd2;

    @Column(name="customer_add3")
    private String customerAdd3;

    @Column(name="customer_locality")
    private String customerLocality;

    @Column(name="customer_city")
    private String customerCity;

    @Column(name="customer_state")
    private String customerState;

    @Column(name="customer_country")
    private String customerCountry;

    @Column(name="customer_pincode")
    private String customerPincode;

    @Column(name="land_mark")
    private String landMark;

    @Column(name="status")
    private String status;

    @Column(name="creation_date")
    private String creationDate;

    @Column(name="created_by")
    private String createdBy;

    @Column(name="update_date")
    private String updateDate;

    @Column(name="updated_by")
    private String updatedBy;

    public CustomerAddress() {
    }

    public CustomerAddress(long customerAddId, long customerId, String customerAdd1, String customerAdd2, String customerAdd3, String customerLocality, String customerCity, String customerState, String customerCountry, String customerPincode, String landMark, String status, String creationDate, String createdBy, String updateDate, String updatedBy) {
        this.customerAddId = customerAddId;
        this.customerId = customerId;
        this.customerAdd1 = customerAdd1;
        this.customerAdd2 = customerAdd2;
        this.customerAdd3 = customerAdd3;
        this.customerLocality = customerLocality;
        this.customerCity = customerCity;
        this.customerState = customerState;
        this.customerCountry = customerCountry;
        this.customerPincode = customerPincode;
        this.landMark = landMark;
        this.status = status;
        this.creationDate = creationDate;
        this.createdBy = createdBy;
        this.updateDate = updateDate;
        this.updatedBy = updatedBy;
    }

    public long getCustomerAddId() {
        return customerAddId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public String getCustomerAdd1() {
        return customerAdd1;
    }

    public String getCustomerAdd2() {
        return customerAdd2;
    }

    public String getCustomerAdd3() {
        return customerAdd3;
    }

    public String getCustomerLocality() {
        return customerLocality;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public String getCustomerState() {
        return customerState;
    }

    public String getCustomerCountry() {
        return customerCountry;
    }

    public String getCustomerPincode() {
        return customerPincode;
    }

    public String getLandMark() {
        return landMark;
    }

    public String getStatus() {
        return status;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    @Override
    public String toString() {
        return "CustomerAddress{" +
                "customerAddId=" + customerAddId +
                ", customerId=" + customerId +
                ", customerAdd1='" + customerAdd1 + '\'' +
                ", customerAdd2='" + customerAdd2 + '\'' +
                ", customerAdd3='" + customerAdd3 + '\'' +
                ", customerLocality='" + customerLocality + '\'' +
                ", customerCity='" + customerCity + '\'' +
                ", customerState='" + customerState + '\'' +
                ", customerCountry='" + customerCountry + '\'' +
                ", customerPincode='" + customerPincode + '\'' +
                ", landMark='" + landMark + '\'' +
                ", status='" + status + '\'' +
                ", creationDate='" + creationDate + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", updateDate='" + updateDate + '\'' +
                ", updatedBy='" + updatedBy + '\'' +
                '}';
    }
}
