package org.mg.blog.blogadmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ChartsController extends BaseController {
    private static final String CHARTS_TEMPLATE_NAME = "charts";

    @RequestMapping(value = "charts", method = RequestMethod.GET)
    public String toCharts() {
        return i18n(CHARTS_TEMPLATE_NAME);
    }
}
