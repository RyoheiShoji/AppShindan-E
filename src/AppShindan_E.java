import java.util.Random;
import java.util.Scanner;

public class AppShindan_E {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		//���C������
		situmon1(0);
		situmon2(0);
		situmon3(0);
		situmon4(0);
		//�񓚓��e�Őf�f���ʂ��l���鏈��
		//�񓚌��ʂ��o��

	}

	public static void situmon1(int a){
		//������e��\��
		//�񓚓��e��\��
		//���[�U�[�����������
		int x = 0;
		Random ra = new Random();
		String[] s = {"�j��" ,"����","���̑�"};
		System.out.println("���Ȃ��̐��ʂ�");
		System.out.print("(1.�j�� , 2.���� , 3.���̑�");
		try{
			x = sc.nextInt();
		}catch (NumberFormatException e) {
			System.out.println("���l�����͂���Ă��܂���");
			x = 3;
		}
		while(0 > x || x > 3 ){
			System.out.print("1�`3�̂ǂꂩ����͂��Ă�������");
			try{
				x = sc.nextInt();
			}catch (NumberFormatException e) {
				System.out.println("���l�����͂���Ă��܂���");
				x = 3;
			}
		}
		if(ra.nextInt(10) >= 9){
			System.out.println("���Ȃ��͂������ł��B");
		}else{
			System.out.println("���Ȃ���" + s[x-1] + "�ł��B");
		}
	}
	public void situmon2(int a){
		//
	}
	public void situmon3(int a){
		//
	}
	public void situmon4(int a){
		//
	}
}
