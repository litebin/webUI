package file;

import java.io.File;
import java.io.IOException;
//�ж��ļ��Ƿ����
public class FileExists {
   public static void main(String[] args) {
	  File file=new File("D:\\workspace\\b2c\\outputfile");
	 // System.out.println(file.exists());
	  if(file.exists()){
		  System.out.println("�ļ��ҵ���");
	  }else{
		  System.out.println("�ļ�û�ҵ������Դ����ļ�"+file.getName());
		 	try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	  }
}
}
