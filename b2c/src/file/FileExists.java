package file;

import java.io.File;
import java.io.IOException;
//判断文件是否存在
public class FileExists {
   public static void main(String[] args) {
	  File file=new File("D:\\workspace\\b2c\\outputfile");
	 // System.out.println(file.exists());
	  if(file.exists()){
		  System.out.println("文件找到了");
	  }else{
		  System.out.println("文件没找到，尝试创建文件"+file.getName());
		 	try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	  }
}
}
