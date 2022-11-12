package com.nttdata.banco.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@AllArgsConstructor
@Setter
@NoArgsConstructor
@Document (collection = "clients")
public class Client {
    @Id
    public String id;

    private String name;
    private String email;
    private String phone;
    private String document;
    private String type;
}
