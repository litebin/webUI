package exceptions;

public class HandleException {
    public static void main(String[] args) {
		try{
    	int i=1/0;
    	//或者使用throw辅助抛出异常 throw new RunTimeException("运行错误") ;
	//	}catch(RunTimeException e){
	//		System.out.println("运行时错误!!!");
	//	}
		}catch(ArithmeticException e){
			System.out.println("被除数是0，算法错误!!!");
		}finally{
			//不管是否出现异常，都会执行finally主体
			System.out.println("资源已经释放!!!");
		}
	}
}
