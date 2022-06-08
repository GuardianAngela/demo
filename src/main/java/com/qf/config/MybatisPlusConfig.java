package com.qf.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: MybatisPlus配置类
 * @Author: GuardianAngel
 * @Date: 2022/5/26
 * @Version: 1.0
 */
@MapperScan(value = {"com.qf.mapper"})
@Configuration
public class MybatisPlusConfig {
}
