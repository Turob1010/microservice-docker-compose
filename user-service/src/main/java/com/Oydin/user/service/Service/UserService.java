package com.Oydin.user.service.Service;


import com.Oydin.user.service.Model.User;
import com.Oydin.user.service.Repository.UserRepository;
import com.Oydin.user.service.VO.Product;
import com.Oydin.user.service.VO.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private UserRepository userRepository;

    public User create (User user){
        User newUser = userRepository.save(user);
        return newUser;
    }
    public ResponseTemplateVO getUserWithProduct(String userId){
        ResponseTemplateVO vo = new ResponseTemplateVO();
        User user = userRepository.findByUserId(userId);
        Product product = restTemplate.getForObject("http://localhost://3031/products/" + user.getProductId(),Product.class);
        vo.setUser(user);
        vo.setProduct(product);
        return vo;
    }


}
