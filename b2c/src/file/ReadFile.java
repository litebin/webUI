package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//���ļ�
public class ReadFile {
        public static void main(String[] args) {
        	FileReader fr;
 		   BufferedReader in;
 		try {
 			//fr = new FileReader("date/outputfile");  ָ�����·��
 			fr = new FileReader("outputfile");
 			in=new BufferedReader(fr);
 			String str;
 			//(str=in.readLine())!=null ��ȡ�ļ���һ�У��������null
 			while((str=in.readLine())!=null){
 				System.out.println(str);
 			}
 		    System.out.println("�ļ���ȡ�ɹ�");
 		} catch (IOException e) {
 			// TODO Auto-generated catch block
 			System.out.println("�ļ���ȡʧ��");
 			e.printStackTrace();
 		}
		}
}
