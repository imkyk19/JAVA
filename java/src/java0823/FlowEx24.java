package java0823;

import java.util.Scanner;

public class FlowEx24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�޴��� �����ְ� �����ϰ� �ϴ� ����
		//�޴��� �߸� ������ ��� continue������ �ٽ� �޴��� �����ְ�, 
		//����(0)�� ������ ��� break������ �ݺ��� ��� ���α׷��� ���ᰡ �ǵ��� ��
		
		int menu=0;
		int num=0;
		
		Scanner sc=new Scanner(System.in);
		
		//���ѹݺ���(����ڰ� ���� ���α׷��� ������ �𸣱� ����)
		while(true) {
			//�޴� �����ֱ�
			System.out.println("(1) Pizza");
			System.out.println("(2) Pasta");
			System.out.println("(3) Potato");
			System.out.println("���ϴ� �޴� 1~3�� �����ϼ���(����:0)");
			
			//�޴� �Է�
			String tmp=sc.nextLine();
			menu=Integer.parseInt(tmp);
			
			//���� 0�� �Է� �� break�� while�� ����
			if(menu==0) {
				System.out.println("���α׷� ����");
				break;
			
			//�޴� 1~3�̿��� ���� �Է� �� continue������ while�� �ݺ�
			}else if(!(1<=menu && menu<=3)) {
				System.out.println("�޴� �߸� ����");
				continue;
			}
			
			System.out.println("������ �޴�: "+menu);
		}
	}

}
