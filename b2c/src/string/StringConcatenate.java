package string;

public class StringConcatenate {
	//获取当前时间
	//StringBuffer append：拼接
        public static void main(String[] args) {
        	
            long startTime=System.currentTimeMillis();
			System.out.println("start time is"+startTime);
			
			
			for(int i=0;i<5000;i++){
				String result="This is";
				result=result + "testing the";
				result=result + "between";
				result=result + "String";
				result=result + "and";
			    result=result + "StringBuffer";
			  //开辟7次内存地址来保存字符串
			}
			
			long endTime=System.currentTimeMillis();
			System.out.println("字符串链接使用+操作符花费"+
			(endTime-startTime)+"毫秒");
			
			
			System.out.println("===我是分隔符====");
			
			 startTime=System.currentTimeMillis();
			System.out.println("start time is"+startTime);
			
			
			for(int i=0;i<5000;i++){
				StringBuffer result= new StringBuffer();
						result.append("This is");
						result.append("testing the");
						result.append("between");
						result.append("String");
						result.append("and");
						result.append("StringBuffer");
						//一次性拼接好字符串，再开辟内存地址，
			}
			
			 endTime=System.currentTimeMillis();
			System.out.println("字符串链接使用+操作符花费"+
			(endTime-startTime)+"毫秒");
		}
}
