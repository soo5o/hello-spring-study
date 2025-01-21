package com.example.study.hello_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {
	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}
	/**
	 * 스프링 빈을 등록하는 2가지 방법
	 1. 컨포넌트 스캔(어노테이션 사용)과 자동 의존관계 설정
	 => @Component 가 있으면 스프링 빈으로 자동 등록된다. 컴포넌트를 포함하는 어노테이션들 ..
	 	@Controller, @Service, @Repository
	 2.자바 코드로 직접 스프링 빈 등록하기
	 */
	/**스프링은 스프링 컨테이너에 스프링 빈을 등록할 때, 기본으로 싱글톤으로 등록한다.
	 * 싱글톤: 유일하게 하나만 등록해서 공유한다.
	 * 따라서 같은 스프링 빈이면 모두 같은 인스턴스다.*/
}
