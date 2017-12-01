package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
//写文件
public class WriteFile { 
	
	//throws IOException已经是最上层的方法了没有那个方法来处理他
	/*try{
           //代码区
      }catch(Exception e){
           //异常处理
      }
                  代码区如果有错误，就会返回所写异常的处理。
	 * */
	public static void main(String[] args) {
		   FileWriter fw;
		   BufferedWriter out;
		try {
			fw = new FileWriter("outputfile");
		    out=new BufferedWriter(fw);
		    out.write("今天天气真好!");
		    out.close();
		    System.out.println("文件写入成功");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("文件写入失败");
			e.printStackTrace();
		}
		  
	}

}
