package com.niraj.app.entity;

import org.springframework.util.Assert;

import javax.persistence.*;

/**
 * A value object abstraction of contact number.
 *
 * @author Niraj
 */
@Entity
public class CustomerContactDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="contact_id")
    private long contactId;

    @Column(name = "customer_id")
    private long customerId;

    @Column(name = "country_code", columnDefinition = "91")
    private int countryCode;

    @Column(name = "std_code")
    private int stdCode;

    @Column(name = "contact_number", nullable = false)
    private long contactNumber;

    @Column(name = "contact_type", columnDefinition = "mobile")
    private String contactType;

    protected CustomerContactDetails() {

    }

    public CustomerContactDetails(long contactId, long customerId, int countryCode, int stdCode, long contactNumber, String contactType) {
        this.contactId = contactId;
        this.customerId = customerId;
        this.countryCode = countryCode;
        this.stdCode = stdCode;
        this.contactNumber = contactNumber;
        this.contactType = contactType;
    }

    public long getContactId() {
        return contactId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public int getStdCode() {
        return stdCode;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public String getContactType() {
        return contactType;
    }

    @Override
    public String toString() {
        return "CustomerContactDetails{" +
                "contactId=" + contactId +
                ", customerId=" + customerId +
                ", countryCode=" + countryCode +
                ", stdCode=" + stdCode +
                ", contactNumber=" + contactNumber +
                ", contactType='" + contactType + '\'' +
                '}';
    }
}
