package org.mg.blog.blogadmin.controller;

import org.mg.blog.blogadmin.entity.UserVo;
import org.mg.blog.blogadmin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

import static org.mg.blog.blogadmin.controller.IndexController.LOGIN_SUCCESS_FLAG;

@Controller
public class LoginController extends BaseController {
    public static final String LOGIN_TEMPLATE_NAME = "login";
    public static final String INDEX_TEMPLATE_NAME = "index";
    public static final String REGISTER_TEMPLATE_NAME = "register";

    private static final String LOGIN_FAILED_FLAG = "loginFailed";

    @Autowired
    private UserService userService;

    @RequestMapping(value = LOGIN_TEMPLATE_NAME, method = RequestMethod.GET)
    public String toLogin() {
        return i18n(LOGIN_TEMPLATE_NAME);
    }

    @RequestMapping(value = LOGIN_TEMPLATE_NAME, method = RequestMethod.POST)
    public String doLogin(UserVo user, Model model, HttpSession session) {
        if (CollectionUtils.isEmpty(userService.query(user))) {
            model.addAttribute(LOGIN_FAILED_FLAG, true);
            return toLogin();
        }
        session.setAttribute(LOGIN_SUCCESS_FLAG, user);
        return i18n(INDEX_TEMPLATE_NAME);
    }

    @RequestMapping(value = REGISTER_TEMPLATE_NAME, method = RequestMethod.GET)
    public String toRegister() {
        return i18n(REGISTER_TEMPLATE_NAME);
    }
}
