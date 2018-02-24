package com.flashhold.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented //javadoc
@Target(ElementType.TYPE) //注解作用在类上
@Retention(RetentionPolicy.RUNTIME) //限制注解的生命周期
public @interface Controller {
	/**
	 * 作用于该类上的注解有一个value属性，其实就是controller
	 * @return
	 */
	public String value();
}
