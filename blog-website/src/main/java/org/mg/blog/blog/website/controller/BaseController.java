package org.mg.blog.blog.website.controller;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;

/**
 * 基本的 controller 提供默认的处理方法
 */
public class BaseController implements ResourceLoaderAware {
    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
    }
}
