package payment.dto;

import org.joda.time.DateTime;

/**
 * Created by AdeolaOjo on 7/16/2016.
 */
public class Transaction {

    private long id;
    private long paymentId;
    private long receivingInstitutionId;
    private String beneficiaryCode;
    private String beneficiaryEmailAddress;
    private String beneficiaryMobile;
    private String toAccount;
    private String pan;
    private String expiryYear;
    private String expiryMonth;
    private String toAccountType;
    private String encryptedPin;
    private String sponsorCode;
    private String corporateCode;
    private String createdBy;
    private String currencyCode;
    private boolean isStpTransaction;
    private boolean isStpTransactionNotified;
    private int stpParentTransactionId;
    private int amount;
    private int priority;
    private int count;
    private DateTime createdOn;
    private DateTime modifiedOn;
    private short transactionStatus;

    public long getReceivingInstitutionId() {
        return receivingInstitutionId;
    }

    public void setReceivingInstitutionId(long receivingInstitutionId) {
        this.receivingInstitutionId = receivingInstitutionId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(long paymentId) {
        this.paymentId = paymentId;
    }

    public String getBeneficiaryCode() {
        return beneficiaryCode;
    }

    public void setBeneficiaryCode(String beneficiaryCode) {
        this.beneficiaryCode = beneficiaryCode;
    }

    public String getBeneficiaryEmailAddress() {
        return beneficiaryEmailAddress;
    }

    public void setBeneficiaryEmailAddress(String beneficiaryEmailAddress) {
        this.beneficiaryEmailAddress = beneficiaryEmailAddress;
    }

    public String getBeneficiaryMobile() {
        return beneficiaryMobile;
    }

    public void setBeneficiaryMobile(String beneficiaryMobile) {
        this.beneficiaryMobile = beneficiaryMobile;
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getExpiryYear() {
        return expiryYear;
    }

    public void setExpiryYear(String expiryYear) {
        this.expiryYear = expiryYear;
    }

    public String getExpiryMonth() {
        return expiryMonth;
    }

    public void setExpiryMonth(String expiryMonth) {
        this.expiryMonth = expiryMonth;
    }

    public String getToAccountType() {
        return toAccountType;
    }

    public void setToAccountType(String toAccountType) {
        this.toAccountType = toAccountType;
    }

    public String getEncryptedPin() {
        return encryptedPin;
    }

    public void setEncryptedPin(String encryptedPin) {
        this.encryptedPin = encryptedPin;
    }

    public String getSponsorCode() {
        return sponsorCode;
    }

    public void setSponsorCode(String sponsorCode) {
        this.sponsorCode = sponsorCode;
    }

    public String getCorporateCode() {
        return corporateCode;
    }

    public void setCorporateCode(String corporateCode) {
        this.corporateCode = corporateCode;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public boolean isStpTransaction() {
        return isStpTransaction;
    }

    public void setStpTransaction(boolean stpTransaction) {
        isStpTransaction = stpTransaction;
    }

    public boolean isStpTransactionNotified() {
        return isStpTransactionNotified;
    }

    public void setStpTransactionNotified(boolean stpTransactionNotified) {
        isStpTransactionNotified = stpTransactionNotified;
    }

    public int getStpParentTransactionId() {
        return stpParentTransactionId;
    }

    public void setStpParentTransactionId(int stpParentTransactionId) {
        this.stpParentTransactionId = stpParentTransactionId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public DateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(DateTime createdOn) {
        this.createdOn = createdOn;
    }

    public DateTime getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(DateTime modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public short getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(short transactionStatus) {
        this.transactionStatus = transactionStatus;
    }
}
