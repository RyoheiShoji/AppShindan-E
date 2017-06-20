import java.util.Random;
import java.util.Scanner;

public class AppShindan_E {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		//メイン処理
		situmon1(0);
		situmon2(0);
		situmon3(0);
		situmon4(0);
		//回答内容で診断結果を考える処理
		//回答結果を出力

	}

	public static void situmon1(int a){
		//質問内容を表示
		//回答内容を表示
		//ユーザーが答えを入力
		int x = 0;
		Random ra = new Random();
		String[] s = {"男性" ,"女性","その他"};
		System.out.println("あなたの性別は");
		System.out.print("(1.男性 , 2.女性 , 3.その他");
		try{
			x = sc.nextInt();
		}catch (NumberFormatException e) {
			System.out.println("数値が入力されていません");
			x = 3;
		}
		while(0 > x || x > 3 ){
			System.out.print("1～3のどれかを入力してください");
			try{
				x = sc.nextInt();
			}catch (NumberFormatException e) {
				System.out.println("数値が入力されていません");
				x = 3;
			}
		}
		if(ra.nextInt(10) >= 9){
			System.out.println("あなたはうそつきです。");
		}else{
			System.out.println("あなたは" + s[x-1] + "です。");
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
