package com.Oydin.user.service.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collation = "User")
public class User {

    @Id
    private String userId;
    private String userName;
    private String age;
    private String productId;

}
