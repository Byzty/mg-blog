package org.mg.blog.blogadmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormsController extends BaseController {
    private static final String FORMS_TEMPLATE_NAME = "forms";

    @RequestMapping(value = FORMS_TEMPLATE_NAME, method = RequestMethod.GET)
    public String toCharts() {
        return i18n(FORMS_TEMPLATE_NAME);
    }
}
