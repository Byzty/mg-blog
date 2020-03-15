package org.mg.blog.blog.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController extends BaseController {
    public static final String INDEX_TEMPLATE_NAME = "index";

    @GetMapping("/")
    public String index(Model model) {
        return INDEX_TEMPLATE_NAME;
    }
}
