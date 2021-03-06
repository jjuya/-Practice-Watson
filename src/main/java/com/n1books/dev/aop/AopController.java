package com.n1books.dev.aop;

import javax.servlet.http.HttpSession;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.n1books.dev.controller.Text2SpeechController;
import com.n1books.dev.controller.Text2SpeechService;
import com.n1books.dev.controller.Text2SpeechVO;

@Aspect
@Component
public class AopController {
	
	private static final Logger logger = LoggerFactory.getLogger(AopController.class);

	@Autowired
	private Text2SpeechService service;

	@Before("execution(* com.n1books.dev.controller.Text2SpeechController.speaker(..))")
	public void ad_before_insert(JoinPoint joinpoint) {
		Object[] args = joinpoint.getArgs();
		for (Object obj : args) {
			if (obj instanceof Text2SpeechVO) {
				Text2SpeechVO vo =  (Text2SpeechVO) obj;
				try {
					service.insertText2Speech(vo);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	/*
	@AfterReturning("execution(* com.n1books.dev.controller.Text2SpeechController.speaker(..))")
	public void ad_after_returning() {
		logger.info("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
		logger.info("☆  after returning advice 수행 중 ☆");
		logger.info("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
	}*/
	
	/*@Around("execution(* com.n1books.dev.controller.Text2SpeechController.speaker(..))")
	public Object ad_around(ProceedingJoinPoint joinpoint) {
		logger.info("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
		logger.info("☆  around advice (before) ☆");
		logger.info("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
		Object obj = null;
		try {
			long start = System.currentTimeMillis();
			obj= joinpoint.proceed();
			long end = System.currentTimeMillis();
			logger.info(
				"소요시간 : " + (((double)end - start))/1000 + "초");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		logger.info("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
		logger.info("☆  around advice (after) ☆");
		logger.info("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
		return obj;
	}*/
	
} //end class
