package yong.lin.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import yong.lin.domain.User;
import yong.lin.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/user")
@ResponseBody

//@RestController  等于一个   controller 和 response
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll.do")
    public List<User> findAll() throws Exception {
        return userService.findAll();
    }

    @RequestMapping("/findById.do")
    public User findById(@RequestParam("id") Integer id) throws Exception {
        return userService.findById(id);
    }

    @RequestMapping("/updateUser.do")
    public void updateUser(@RequestBody User user) throws Exception {
        userService.updateUser(user);
    }
}
