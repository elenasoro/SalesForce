package testdata;


import models.NewAccountModel;
import utils.FakeMessageGenerator;

public class PrepareNewAccountData {
    public static NewAccountModel getValidData() {
        return NewAccountModel
                .builder()
                .accountName(FakeMessageGenerator.generateAccountName())
                .phone(FakeMessageGenerator.generatePhone())
                .type("Analyst")
                .description(FakeMessageGenerator.generateDescription())
                .website(FakeMessageGenerator.generateWebSite())
                .industry("Banking")
                .employees(FakeMessageGenerator.generateEmployeesNumber())
                .billingStreet(FakeMessageGenerator.generateStreet())
                .billingCity(FakeMessageGenerator.generateCity())
                .billingState(FakeMessageGenerator.generateState())
                .billingZip(FakeMessageGenerator.generateZip())
                .billingCountry(FakeMessageGenerator.generateCountry())
                .shippingStreet(FakeMessageGenerator.generateStreet())
                .shippingCity(FakeMessageGenerator.generateCity())
                .shippingState(FakeMessageGenerator.generateState())
                .shippingZip(FakeMessageGenerator.generateZip())
                .shippingCountry(FakeMessageGenerator.generateCountry())
                .build();
    }
}
