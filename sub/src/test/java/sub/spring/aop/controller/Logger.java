package sub.spring.aop.controller;

import org.springframework.stereotype.Component;

//@Aspect
@Component("logger1")
public class Logger {

	//@Pointcut("execution(* sub.spring.aop.service.UserService.*(..))")
	public void pointCut(){
		
	}
	
	//@Before("pointCut()")
	public void doBefore(){
		System.out.println("do before...");
	}
	
	
//	public void doRound(ProceedingJoinPoint pjp) throws Throwable{
//		pjp.proceed();
//		System.out.println("do around...");
//	}

//	@Around("pointCut()")
//	public Object record(ProceedingJoinPoint pjp){
//        System.out.println("------"+pjp.getSignature().getName());
//        Log log = new Log();
//        try {
//            log.setOperator("admin");
//            String mname = pjp.getSignature().getName();
//            log.setOperName(mname);
//            
//            //方法参数,本例中是User user
//            Object[] args = pjp.getArgs();
//            log.setOperParams(Arrays.toString(args));
//            
//            //执行目标方法，返回的是目标方法的返回值，本例中 void
//            Object obj = pjp.proceed();
//            if(obj != null){
//                log.setResultMsg(obj.toString());
//            }else{
//                log.setResultMsg(null);
//            }
//            
//            log.setOperResult("success");
//            log.setOperTime(new Date());
//            return obj;
//        } catch (Throwable e) {
//            log.setOperResult("failure");
//            log.setResultMsg(e.getMessage());
//        } finally{
//            logService.saveLog(log);
//        }
//        return null;
//    }
}
