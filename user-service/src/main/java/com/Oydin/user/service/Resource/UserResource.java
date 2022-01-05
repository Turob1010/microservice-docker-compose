package com.Oydin.user.service.Resource;

import com.Oydin.user.service.Model.User;
import com.Oydin.user.service.Service.UserService;
import com.Oydin.user.service.VO.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public User create(@RequestBody User user){
        return userService.create(user);
    }

    @GetMapping("/getByIdUserAndProduct")
    public ResponseTemplateVO getByIdUserAndProduct(@PathVariable String userId){
        return userService.getUserWithProduct(userId);
    }
}
