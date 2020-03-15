package org.mg.blog.blogadmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TablesController extends BaseController {
    private static final String TABLES_TEMPLATE_NAME = "tables";

    @RequestMapping(value = TABLES_TEMPLATE_NAME, method = RequestMethod.GET)
    public String toTables() {
        return i18n(TABLES_TEMPLATE_NAME);
    }
}
