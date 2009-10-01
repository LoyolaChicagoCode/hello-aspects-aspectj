package helloworld;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@SuppressWarnings("unused")
@Aspect
public class ArrayListAspect {
	
	@Pointcut("call(public * get(..))")
	private void get() { }	

  @Before("helloworld.ArrayListAspect.get()")
	public void logGet() {
		System.out.println("get");
	}
}
