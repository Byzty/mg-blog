package org.mg.blog.blogadmin.controller;

import org.springframework.stereotype.Service;

public class BaseController {

    /**
     * 模板国际化
     *
     * @param templateName 国际化前的模板名
     * @return 国际化后的模板名
     */
    public String i18n(String templateName) {
        return templateName;
    }
}
