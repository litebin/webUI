package Folder;

import java.io.File;
//����Ŀ¼
public class CreateFolder {
    public static void main(String[] args) {
		String dirs="D:\\workspace\\b2c\\a\\b\\c\\d";
		File file=new File(dirs);
	boolean	result=file.mkdirs();
		if(result){
			System.out.println("Ŀ¼�����ɹ�");
		}else{
			System.out.println("Ŀ¼����ʧ��");
			System.out.println("�ϼ�Ŀ¼�ǣ�"+file.getParent());
		//ɾ��Ŀ¼	file.delete();
		}
	}
}
