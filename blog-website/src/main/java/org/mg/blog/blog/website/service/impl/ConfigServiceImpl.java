package org.mg.blog.blog.website.service.impl;

import org.mg.blog.blog.website.model.Config;
import org.mg.blog.blog.website.service.ConfigService;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.concurrent.ConcurrentHashMap;

@Service("configService")
public class ConfigServiceImpl implements ConfigService {
    private static final ConcurrentHashMap<String, Config> CONFIG_DATA_MAP = new ConcurrentHashMap<>();

    @Override
    public Config queryById(String id) {
        if (StringUtils.isEmpty(id)) {
            return null;
        }
        if (ObjectUtils.isEmpty(CONFIG_DATA_MAP.get(id))) {
            Config config = new Config();
            config.setSiteName("明桂");
            CONFIG_DATA_MAP.put(id, config);
        }
        return CONFIG_DATA_MAP.get(id);
    }
}
