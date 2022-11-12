package com.nttdata.bankcreditservice.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "bank-credits")
public class BankCredit {

    @Id
    private String id;
    private String numberCredit;
    private Float amount;
    private String endDate;
    private String customerId;
    private String customerName;

    //@DocumentReference
    private String type;
}
