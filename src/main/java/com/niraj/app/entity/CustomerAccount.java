package com.niraj.app.entity;

import javax.persistence.*;

@Entity
public class CustomerAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="account_id")
    private long accountId;

    @Column(name = "customer_id", nullable = false)
    private long customerId;

    @Column(name = "account_number", nullable = false)
    private String accountNumber;

    @Column(name = "ifsc_code", nullable = false)
    private String ifscCode;

    @Column(name="status")
    private String status;

    @Column(name="effective_date")
    private String effectiveDate;

    @Column(name="creation_date")
    private String creationDate;

    @Column(name="created_by")
    private String createdBy;

    public CustomerAccount() {
    }

    public CustomerAccount(long accountId, long customerId, String accountNumber, String ifscCode, String status, String effectiveDate, String creationDate, String createdBy) {
        this.accountId = accountId;
        this.customerId = customerId;
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
        this.status = status;
        this.effectiveDate = effectiveDate;
        this.creationDate = creationDate;
        this.createdBy = createdBy;
    }

    public long getAccountId() {
        return accountId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public String getStatus() {
        return status;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    @Override
    public String toString() {
        return "CustomerAccount{" +
                "accountId=" + accountId +
                ", customerId=" + customerId +
                ", accountNumber='" + accountNumber + '\'' +
                ", ifscCode='" + ifscCode + '\'' +
                ", status='" + status + '\'' +
                ", effectiveDate='" + effectiveDate + '\'' +
                ", creationDate='" + creationDate + '\'' +
                ", createdBy='" + createdBy + '\'' +
                '}';
    }
}
