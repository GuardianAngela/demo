package com.qf.controller;

import com.qf.model.User;
import com.qf.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description: UserController
 * @Author: GuardianAngel
 * @Date: 2022/5/26
 * @Version: 1.0
 */
@AllArgsConstructor(onConstructor = @_(@Autowired))
@RequestMapping("/user")
@RestController
public class UserController {

    private final UserService userService;

    @GetMapping("/queryAll")
    public List<User> queryAll() {
        return userService.list();
    }

    @GetMapping("/queryById/{id}")
    public User queryById(@PathVariable Long id) {
        return userService.getById(id);
    }

    @PostMapping("/add")
    public String add(@RequestBody User user) {
        if (!userService.save(user)) {
            return "添加失败";
        }
        return "添加成功";
    }

    @PostMapping("/update")
    public String update(@RequestBody User user) {
        if (!userService.updateById(user)) {
            return "更新失败";
        }
        return "更新成功";
    }

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        if (!userService.removeById(id)) {
            return "删除失败";
        }
        return "删除成功";
    }
}


