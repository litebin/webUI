package jichu;

public class kongzhi {
      public static void main(String[] args) {
		int lay=4;
		/*  ��ӡ��
   *
  ***
 *****
*******
		  */
		//��ӡ���ٲ�
		for(int i=1;i<=lay;i++){
			//�ҳ��ո����
			//1->3 2->2  3->1  4->0
			for(int k=1;k<=lay-i;k++){
				System.out.print(" ");
			}
			//��ӡ*
			//1->1 2->3 3->5 4->7
			for(int j=1;j<=(i-1)*2+1;j++){
				System.out.print("*");
			}
			//���һ������
			System.out.println();
		}
	}
}
