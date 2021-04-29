package com.twodragonlake.boot;

import com.twodragonlake.boot.echo.DefaultEchoService;
import com.twodragonlake.boot.echo.EchoService;
import com.twodragonlake.boot.echo.EchoWebSocketHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

import javax.annotation.PostConstruct;
import java.util.Arrays;

/**
 * Description.
 *
 * @author : CeaserWang
 * @version : 1.0
 * @since : 2019/6/7 17:31
 */

@SpringBootApplication
//@EnableWebSocket
// @ServletComponentScan
public class MyApplication /* implements WebSocketConfigurer*/ {

    private static  final Logger logger = LoggerFactory.getLogger(MyApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext =  SpringApplication.run(MyApplication.class,args);
        String [] names =  configurableApplicationContext.getBeanNamesForType(String.class);
        System.out.println(Arrays.toString(names));
        /*SpringApplication application = new SpringApplication();
        application.setBannerMode(Banner.Mode.OFF);//关闭banner
        application.run(args);*/
    }
    /*
    @PostConstruct
    public void myLog(){
        logger.trace("Trace Message");
        logger.debug("Debug Message");
        logger.info("Info Message");
        logger.warn("Warn Message");
        logger.error("Error Message");
    }

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
        webSocketHandlerRegistry.addHandler(webSocketHandler(), "/echo").withSockJS();
    }

    @Bean
    public EchoService echoService(){
        return new DefaultEchoService("You said \"%s\"!");
    }

    @Bean
    public WebSocketHandler webSocketHandler(){
        return new EchoWebSocketHandler(echoService());
    }
*/
}
