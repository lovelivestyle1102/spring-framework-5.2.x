package com.ant.spring.bean.generic;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class GenericDemo {

	public static void main(String[] args) {
		//范型参数类型 ParameterizedType
		ParameterizedType parameterizedType = (ParameterizedType) ArrayList.class.getGenericSuperclass();

		//parameterizedType.getRawType() = java.lang.AbstractLsit

		//范型类型变量 Type Variable

		System.out.println(parameterizedType.toString());

		Stream.of(parameterizedType.getActualTypeArguments()).forEach(System.out::println);

		List<String> a = new ArrayList<>();

		System.out.println(a.getClass().getGenericSuperclass());

	}
}
