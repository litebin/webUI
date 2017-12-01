package array;

public class Continue {
	public static void main(String[] args) {
		int array[]={1,2,3,4,5,6,7,8,9};
		
		 int find=6;
		for(int i=0;i<array.length;i++){
			if(array[i] == find){
				System.out.println("找到了索引"+i);
				continue;
			}
			System.out.println("找寻中，当前索引"+i);
		}
	}

}
