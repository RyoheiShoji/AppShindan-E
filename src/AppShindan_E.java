import java.util.Random;
import java.util.Scanner;

public class AppShindan_E {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		//���C������
		System.out.println("�����i�f�f��");
		situmon1(0);
		situmon2(0);
		situmon3(0);
		situmon4(0);
		//�񓚓��e�Őf�f���ʂ��l���鏈��
		//�񓚌��ʂ��o��
		System.out.println("�����l�ł���");
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
	public static void situmon2(int a){
		//�ԉ��@��
        System.out.println("���Ȃ��͌��h�ł����H�L�h�ł����H" );
        System.out.println("1�F���h   2�F�L�h");
        int answer = sc.nextInt();
       if(answer == 1){
           System.out.println("���D���̂��Ȃ��͕������ł��B");
         }
        else if(answer == 2){
               System.out.println("�L�D���̂��Ȃ��͖`���S�������ł��B");
          }
         else if(answer != 1 && answer != 2){
             System.out.println("���Ȃ��͌^�j��Ȑ��i�ł��B");
	}
	public void situmon3(int a){
		//
	}
	public void situmon4(int a){
		//���R���
		System.out.println("���Ȃ��̍D���ȐF���A���̂S����I��ŉ�����");
		System.out.print("�P�F��	\n�Q�F��	\n�R�F��	\n�S�F���̑�	\n�ԍ�����͂��Ă��������F");
		int num = sc.nextInt();
		if(num == 1){
			System.out.println("\n���Ȃ��͏�M�I�Ȑl�ł��傤�B");
		}else if(num == 1){
			System.out.println("\n���Ȃ��͗D�����l�ł��傤�B");
		}else if(num == 1){
			System.out.println("\n���Ȃ��͗�ÂȐl�ł��傤�B");
		}else if(num == 1){
			System.out.println("\n���Ȃ��͕ς�����l�ł��傤�B");
		}
	}
}
