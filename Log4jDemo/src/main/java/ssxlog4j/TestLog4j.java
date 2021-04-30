package ssxlog4j;

import org.apache.log4j.*;
import ssxlog4j.mylevel.IDemoLevel;

//import java.util.logging.Level;
//import java.util.logging.Logger;

public class TestLog4j {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(TestLog4j.class.getName());
        //log4j 分为三个模块，日志记录器，日志写入位置，日志格式化
        /**
         * 日志分为几种类型
         *  优先级从高到低依次为:OFF FATAL ERROR WARN INFO DEBUG TRACE ALL
         *  *  ALL    最低等级的 用于打开所有日志记录
         * *  TRACE  很低的日志级别 一般不会使用
         * *  DEBUG  指出细粒度信息事件对调试应用程序是非常有帮助的 主要用于开发过程中打印一些运行信息
         * *  INFO   消息在粗粒度级别上突出强调应用程序的运行过程
         * *        打印一些你感兴趣的或者重要的信息 这个可以用于生产环境中输出程序运行的一些重要信息
         * *        但是不能滥用 避免打印过多的日志
         * *  WARN   表明会出现潜在错误的情形 有些信息不是错误信息 但是也要给程序员的一些提示
         * *  ERROR  指出虽然发生错误事件 但仍然不影响系统的继续运行
         * *        打印错误和异常信息 如果不想输出太多的日志 可以使用这个级别
         * *  FATAL  指出每个严重的错误事件将会导致应用程序的退出
         * *        这个级别比较高了 重大错误 这种级别你可以直接停止程序了
         * *  OFF    最高等级的，用于关闭所有日志记录
         * *
         * *  如果将log level设置在某一个级别上 那么比此级别优先级高的log都能打印出来
         * *  例如 如果设置优先级为WARN 那么OFF FATAL ERROR WARN 4个级别的log能正常输出
         * *  而INFO DEBUG TRACE ALL级别的log则会被忽略
         * ————————————————
         * 版权声明：本文为CSDN博主「殇莫忆」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
         * 原文链接：https://blog.csdn.net/qq_28289405/article/details/82982593
         */

        //使用默认的配置信息，不需要写log4j.properties
//        BasicConfigurator.configure();

        logger.setLevel(Level.INFO);
//        logger.addAppender(new);

        logger.info("info1111");
        logger.debug("debug23");
        logger.warn("warn123");

    }
}
