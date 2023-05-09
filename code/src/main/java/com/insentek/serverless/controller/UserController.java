package com.insentek.serverless.controller;

import com.insentek.serverless.common.model.R;
import com.insentek.serverless.model.User;
import com.insentek.serverless.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: hao.ding@insentek.com
 * @Date: 2023/5/9 14:30
 */
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;


    @GetMapping()
    public R<?> getUsers() {
        List<User> result = userService.list();
        return R.succeed(result);
    }
}
