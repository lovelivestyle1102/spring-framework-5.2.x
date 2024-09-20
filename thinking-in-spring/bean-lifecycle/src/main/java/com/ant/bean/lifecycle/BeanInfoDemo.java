package com.ant.bean.lifecycle;

import com.ant.bean.lifecycle.bean.Person;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyEditorSupport;
import java.util.stream.Stream;

public class BeanInfoDemo {

	public static void main(String[] args) throws IntrospectionException {
		BeanInfo beanInfo = Introspector.getBeanInfo(Person.class, Object.class);

		Stream.of(beanInfo.getPropertyDescriptors())
				.forEach(propertyDescriptor -> {
//					Class<?> propertyType = propertyDescriptor.getPropertyType();
//
//					String propertyName = propertyDescriptor.getName();
//
//					if("age".equals(propertyName)){
//						propertyDescriptor.setPropertyEditorClass(StringToIntegerPropertyEditor.class);
//					}

					System.out.println(propertyDescriptor);
				});

	}

	static class StringToIntegerPropertyEditor extends PropertyEditorSupport{

		@Override
		public void setAsText(String text) throws IllegalArgumentException {
			Integer value = Integer.valueOf(text);

			setValue(value);
		}
	}
}
