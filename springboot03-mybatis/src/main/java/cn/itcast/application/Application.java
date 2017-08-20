package cn.itcast.application;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		//创建springapplication用户对象
		SpringApplication springApplication = new  SpringApplication(Application.class);
		//设置banner模式
		springApplication.setBannerMode(Banner.Mode.OFF);
		//运行
		springApplication.run(args);
	}
}
