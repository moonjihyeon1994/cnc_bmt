//package com.cnc.rating.logging;
//
//import org.apache.catalina.valves.AccessLogValve;
//import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
//import org.springframework.boot.web.server.WebServerFactory;
//import org.springframework.boot.web.server.WebServerFactoryCustomizer;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class Logging implements WebServerFactoryCustomizer {
//    @Override
//    public void customize(WebServerFactory factory) {
//        final TomcatServletWebServerFactory containerFactory = (TomcatServletWebServerFactory) factory;
//        final AccessLogValve accessLogValve = new AccessLogValve();
//        accessLogValve.setPattern("%{yyyy-MM-dd HH:mm:ss}t\t%s\t%r\t%{User-Agent}i\t%{Referer}i\t%a\t%b");
//        accessLogValve.setDirectory(".");
//        accessLogValve.setSuffix(".log");
//        accessLogValve.setCondition("ignoreLogging");
//        // 하나의 시간체크, 샤드넘버, 서비스관리번호,
//        containerFactory.addContextValves(accessLogValve);
//    }
//}
