package com.Oydin.user.service.VO;

import com.Oydin.user.service.Model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

    private User user;
    private Product product;

}
