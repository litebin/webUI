package exceptions;

public class HandleException {
    public static void main(String[] args) {
		try{
    	int i=1/0;
    	//����ʹ��throw�����׳��쳣 throw new RunTimeException("���д���") ;
	//	}catch(RunTimeException e){
	//		System.out.println("����ʱ����!!!");
	//	}
		}catch(ArithmeticException e){
			System.out.println("��������0���㷨����!!!");
		}finally{
			//�����Ƿ�����쳣������ִ��finally����
			System.out.println("��Դ�Ѿ��ͷ�!!!");
		}
	}
}
