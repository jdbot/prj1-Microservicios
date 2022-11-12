package com.nttdata.bankaccountservice.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "bank-accounts")
public class BankAccount {

    @Id
    private String id;
    private String numberAccount;
    private Float amount;
    private String endDate;
    private String customerId;
    private String customerName;

    //@DocumentReference
    private String type;
}
