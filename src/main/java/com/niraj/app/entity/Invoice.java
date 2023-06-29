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
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "invoice_id", nullable = false)
    private long invoiceId;

    @Column(name = "order_id", nullable = false)
    private long orderId;

    private String
            invoiceNumber,
            status, remarks;

    private long total, advance, balance;
    private String createdBy, updatedBy;
    private Date creationDate, updateDate, orderDate, expectedDeliveryDate, deliveryDate;

    //The default constructor exists only for the sake of JPA; which use it directly, so it is designated as protected
    /*protected Invoice() {
    }

    public Invoice(long invoiceId, long orderId, String invoiceNumber, String status, String remarks, long total, long advance, long balance, String createdBy, String updatedBy, Date creationDate, Date updateDate, Date orderDate, Date expectedDeliveryDate, Date deliveryDate) {
        this.invoiceId = invoiceId;
        this.orderId = orderId;
        this.invoiceNumber = invoiceNumber;
        this.status = status;
        this.remarks = remarks;
        this.total = total;
        this.advance = advance;
        this.balance = balance;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.creationDate = creationDate;
        this.updateDate = updateDate;
        this.orderDate = orderDate;
        this.expectedDeliveryDate = expectedDeliveryDate;
        this.deliveryDate = deliveryDate;
    }

    public long getInvoiceId() {
        return invoiceId;
    }

    public long getOrderId() {
        return orderId;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getStatus() {
        return status;
    }

    public String getRemarks() {
        return remarks;
    }

    public long getTotal() {
        return total;
    }

    public long getAdvance() {
        return advance;
    }

    public long getBalance() {
        return balance;
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

    public Date getOrderDate() {
        return orderDate;
    }

    public Date getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceId=" + invoiceId +
                ", orderId=" + orderId +
                ", invoiceNumber='" + invoiceNumber + '\'' +
                ", status='" + status + '\'' +
                ", remarks='" + remarks + '\'' +
                ", total=" + total +
                ", advance=" + advance +
                ", balance=" + balance +
                ", createdBy='" + createdBy + '\'' +
                ", updatedBy='" + updatedBy + '\'' +
                ", creationDate=" + creationDate +
                ", updateDate=" + updateDate +
                ", orderDate=" + orderDate +
                ", expectedDeliveryDate=" + expectedDeliveryDate +
                ", deliveryDate=" + deliveryDate +
                '}';
    }*/
}
