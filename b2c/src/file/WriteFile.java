package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
//д�ļ�
public class WriteFile { 
	
	//throws IOException�Ѿ������ϲ�ķ�����û���Ǹ�������������
	/*try{
           //������
      }catch(Exception e){
           //�쳣����
      }
                  ����������д��󣬾ͻ᷵����д�쳣�Ĵ���
	 * */
	public static void main(String[] args) {
		   FileWriter fw;
		   BufferedWriter out;
		try {
			fw = new FileWriter("outputfile");
		    out=new BufferedWriter(fw);
		    out.write("�����������!");
		    out.close();
		    System.out.println("�ļ�д��ɹ�");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("�ļ�д��ʧ��");
			e.printStackTrace();
		}
		  
	}

}
