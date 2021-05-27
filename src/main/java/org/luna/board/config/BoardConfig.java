package org.luna.board.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages ="org.luna.board.mapper" )
@ComponentScan(basePackages ="org.luna.board.service" )
public class BoardConfig {

}
