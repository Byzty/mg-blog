package org.mg.blog.blogadmin.service.impl;

import org.mg.blog.blogadmin.service.ConfigService;
import org.mg.blog.model.Config;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.concurrent.ConcurrentHashMap;

@Service
public class ConfigServiceImpl implements ConfigService {
    private static final ConcurrentHashMap<String, Config> CONFIG_DATA_MAP = new ConcurrentHashMap<>();

    @Override
    public Config query(String id) {
        if (StringUtils.isEmpty(id)) {
            return null;
        }
        if (ObjectUtils.isEmpty(CONFIG_DATA_MAP.get(id))) {
            Config config = new Config();
            config.setSiteName("MG后台管理系统");
            CONFIG_DATA_MAP.put(id, config);
        }
        return CONFIG_DATA_MAP.get(id);
    }
}
