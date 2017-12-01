package Folder;

import java.io.File;
//±éÀúÄ¿Â¼
public class Folders {
	//"D:\\workspace\\b2c"
    public static void main(String[] args) {
		File dir=new File("D:\\workspace\\b2c");
		File[] files=dir.listFiles();
		for(File file:files){
			System.out.println(file.getAbsolutePath());
		}
 	}
}
