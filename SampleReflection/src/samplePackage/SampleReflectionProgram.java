package samplePackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SampleReflectionProgram{

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException, InstantiationException {
		// TODO Auto-generated method stub
		Class c = Class.forName("samplePackage.MethodsInvoke");	
		Object o = c.newInstance();
		try {
			Method m = MethodsInvoke.class.getMethod("Login", null);
			m.invoke(o,null);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
