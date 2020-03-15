package org.mg.blog.blog.website.config;

import com.jagregory.shiro.freemarker.ShiroTags;
import freemarker.template.TemplateModelException;
import org.mg.blog.blog.website.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class FreemarkerConfiguration {
    private static final String CONFIG = "config";

    private static final String SHIRO = "shiro";

    @Autowired
    freemarker.template.Configuration configuration;

    @Autowired
    private ConfigService configService;

    /**
     * 配置 Freemarker 共享全局变量
     *
     * @param configService 配置服务
     * @param configuration Freemarker 配置
     * @return Freemarker 配置
     */
    @PostConstruct
    public void handleFreemarkerConfiguration() throws TemplateModelException {
        configuration.setSharedVariable(CONFIG, configService.queryById("x"));
        configuration.setSharedVariable(SHIRO, new ShiroTags());
    }
}
