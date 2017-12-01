package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//读文件
public class ReadFile {
        public static void main(String[] args) {
        	FileReader fr;
 		   BufferedReader in;
 		try {
 			//fr = new FileReader("date/outputfile");  指定相对路径
 			fr = new FileReader("outputfile");
 			in=new BufferedReader(fr);
 			String str;
 			//(str=in.readLine())!=null 读取文件的一行，如果不是null
 			while((str=in.readLine())!=null){
 				System.out.println(str);
 			}
 		    System.out.println("文件读取成功");
 		} catch (IOException e) {
 			// TODO Auto-generated catch block
 			System.out.println("文件读取失败");
 			e.printStackTrace();
 		}
		}
}
