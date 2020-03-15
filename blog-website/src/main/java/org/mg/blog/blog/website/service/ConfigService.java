package org.mg.blog.blog.website.service;

import org.mg.blog.blog.website.model.Config;
import org.springframework.stereotype.Service;

/**
 * 配置服务接口
 */
public interface ConfigService {

    /**
     * 通过配置 id 查询配置信息
     * @param id 配置id
     * @return 配置信息
     */
    Config queryById(String id);
}
