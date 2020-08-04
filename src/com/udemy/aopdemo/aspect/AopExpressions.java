package com.udemy.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopExpressions {
	
	@Pointcut("execution(* com.udemy.aopdemo.dao.*.*(..))") // create pointcut declaration
	public void forDaoPackage() {}
	
	// create pointcut for getter methods
	@Pointcut("execution(* com.udemy.aopdemo.dao.*.get*(..))") // match getter methods
	public void getter() {}
	
	// create pointcut for setter methods
	@Pointcut("execution(* com.udemy.aopdemo.dao.*.set*(..))") // match setter methods
	public void setter() {}
	
	// create pointcut: include the package.. exclude getter/setter
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	public void forDaoPackageNoGetterSetter() {}
	
	

}
