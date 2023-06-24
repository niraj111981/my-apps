package com.niraj.app.entity;

import java.util.regex.Pattern;

import javax.persistence.*;

import org.springframework.util.Assert;

/**
 * A value object abstraction of an email address.
 *
 * @author Niraj
 */
@Entity
public class CustomerEmailAddress {

    private static final String EMAIL_REGEX = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private static final Pattern PATTERN = Pattern.compile(EMAIL_REGEX);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="email_add_id")
    private long emailAddId;

    @Column(name = "customer_id")
    private long customerId;

    @Column(name = "email_address")
    private String emailAddress;

    /**
     * Creates a new {@link CustomerEmailAddress} from the given string source.
     *
     * @param emailAddress must not be {@literal null} or empty.
     */
    public CustomerEmailAddress(long emailAddId, long customerId, String emailAddress) {
        Assert.isTrue(isValid(emailAddress), "Invalid email address!");
        this.emailAddId = emailAddId;
        this.customerId = customerId;
        this.emailAddress = emailAddress;
    }

    protected CustomerEmailAddress() {

    }

    /**
     * Returns whether the given {@link String} is a valid {@link CustomerEmailAddress} which means you can safely instantiate the
     * class.
     *
     * @param candidate
     * @return
     */
    public static boolean isValid(String candidate) {
        return candidate == null ? false : PATTERN.matcher(candidate).matches();
    }

    public long getEmailAddId() {
        return emailAddId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return "CustomerEmailAddress{" +
                "emailAddId=" + emailAddId +
                ", customerId=" + customerId +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
