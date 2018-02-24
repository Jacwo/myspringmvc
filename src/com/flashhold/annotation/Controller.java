package com.flashhold.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented //javadoc
@Target(ElementType.TYPE) //ע������������
@Retention(RetentionPolicy.RUNTIME) //����ע�����������
public @interface Controller {
	/**
	 * �����ڸ����ϵ�ע����һ��value���ԣ���ʵ����controller
	 * @return
	 */
	public String value();
}
