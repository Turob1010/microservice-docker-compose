package com.Oydin.productservice.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collation ="Product")
public class Product {
    @Id
    private String productId;
    private String productName;
    private Integer price;
}
