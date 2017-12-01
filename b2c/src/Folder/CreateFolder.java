package Folder;

import java.io.File;
//创建目录
public class CreateFolder {
    public static void main(String[] args) {
		String dirs="D:\\workspace\\b2c\\a\\b\\c\\d";
		File file=new File(dirs);
	boolean	result=file.mkdirs();
		if(result){
			System.out.println("目录创建成功");
		}else{
			System.out.println("目录创建失败");
			System.out.println("上级目录是："+file.getParent());
		//删除目录	file.delete();
		}
	}
}
