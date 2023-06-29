package com.niraj.app.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
@Getter @Setter @NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_id", nullable = false)
    private long customerId;

    private String
            initialName,
            firstName, secondName, lastName,
            custType, gender, status, remarks;

    private long dobDate, dobMonth, dobYear;
    private String createdBy, updatedBy;
    private Date creationDate, updateDate;

    //The default constructor exists only for the sake of JPA; which use it directly, so it is designated as protected
   /* protected Customer() {
    }

    public Customer(long customerId, String initialName, String firstName, String secondName, String lastName, String custType, String gender, String status, String remarks, long dobDate, long dobMonth, long dobYear, String createdBy, String updatedBy, Date creationDate, Date updateDate) {
        this.customerId = customerId;
        this.initialName = initialName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.custType = custType;
        this.gender = gender;
        this.status = status;
        this.remarks = remarks;
        this.dobDate = dobDate;
        this.dobMonth = dobMonth;
        this.dobYear = dobYear;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.creationDate = creationDate;
        this.updateDate = updateDate;
    }

    public long getCustomerId() {
        return customerId;
    }

    public String getInitialName() {
        return initialName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCustType() {
        return custType;
    }

    public String getGender() {
        return gender;
    }

    public String getStatus() {
        return status;
    }

    public String getRemarks() {
        return remarks;
    }

    public long getDobDate() {
        return dobDate;
    }

    public long getDobMonth() {
        return dobMonth;
    }

    public long getDobYear() {
        return dobYear;
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

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", initialName='" + initialName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", custType='" + custType + '\'' +
                ", gender='" + gender + '\'' +
                ", status='" + status + '\'' +
                ", remarks='" + remarks + '\'' +
                ", dobDate=" + dobDate +
                ", dobMonth=" + dobMonth +
                ", dobYear=" + dobYear +
                ", createdBy='" + createdBy + '\'' +
                ", updatedBy='" + updatedBy + '\'' +
                ", creationDate=" + creationDate +
                ", updateDate=" + updateDate +
                '}';
    }*/
}
