package org.mg.blog.blogadmin.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

import static org.mg.blog.blogadmin.controller.LoginController.INDEX_TEMPLATE_NAME;
import static org.mg.blog.blogadmin.controller.LoginController.LOGIN_TEMPLATE_NAME;

@Controller
@RequestMapping(value = "/")
public class IndexController extends BaseController {
    public static final String LOGIN_SUCCESS_FLAG = "userInfo";

    @RequestMapping(value = {StringUtils.EMPTY, LOGIN_SUCCESS_FLAG}, method = RequestMethod.GET)
    public String index(HttpSession session) {
        if (ObjectUtils.isEmpty(session.getAttribute(LOGIN_SUCCESS_FLAG))) {
            return i18n(LOGIN_TEMPLATE_NAME);
        }
        return i18n(INDEX_TEMPLATE_NAME);
    }
}
