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
}
