package string;

public class StringConcatenate {
	//��ȡ��ǰʱ��
	//StringBuffer append��ƴ��
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
			  //����7���ڴ��ַ�������ַ���
			}
			
			long endTime=System.currentTimeMillis();
			System.out.println("�ַ�������ʹ��+����������"+
			(endTime-startTime)+"����");
			
			
			System.out.println("===���Ƿָ���====");
			
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
						//һ����ƴ�Ӻ��ַ������ٿ����ڴ��ַ��
			}
			
			 endTime=System.currentTimeMillis();
			System.out.println("�ַ�������ʹ��+����������"+
			(endTime-startTime)+"����");
		}
}
