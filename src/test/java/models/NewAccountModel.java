package models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NewAccountModel {
    private String accountName;
    private String phone;
    private String type;
    private String description;
    private String website;
    private String industry;
    private int employees;
    private String billingStreet;
    private String billingCity;
    private String billingState;
    private String billingZip;
    private String billingCountry;
    private String shippingStreet;
    private String shippingCity;
    private String shippingState;
    private String shippingZip;
    private String shippingCountry;

    @Override
    public String toString() {
        return "Entered data: " + "\nname: " + getAccountName()
                + "\nphone: " + getPhone()
                + "\nType: " + getType()
                + "\nDescription: " + getDescription()
                + "\nWebsite: " + getWebsite()
                + "\nIndustry: " + getIndustry()
                + "\nEmployees: " + getEmployees()
                + "\nBilling Street: " + getBillingStreet()
                + "\nBilling City: " + getBillingCity()
                + "\nBilling State/Province: " + getBillingState()
                + "\nBilling Zip/Postal Code: " + getBillingZip()
                + "\nBilling Country: " + getBillingCountry()
                + "\nShipping Street: " + getBillingStreet()
                + "\nShipping City: " + getBillingCity()
                + "\nShipping State/Province: " + getBillingState()
                + "\nShipping Zip/Postal Code: " + getBillingZip()
                + "\nShipping Country: " + getBillingCountry();
    }
}
