import java.util.Random;
import java.util.Scanner;

public class AppShindan_E {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		//メイン処理
		System.out.println("＊性格診断＊");
		situmon1(0);
		situmon2(0);
		situmon3(0);
		situmon4(0);
		//回答内容で診断結果を考える処理
		//回答結果を出力
		System.out.println("お疲れ様でした");
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
	public static void situmon2(int a){
		//番屋　翔
        System.out.println("あなたは犬派ですか？猫派ですか？" );
        System.out.println("1：犬派   2：猫派");
        int answer = sc.nextInt();
       if(answer == 1){
           System.out.println("犬好きのあなたは聞き上手です。");
         }
        else if(answer == 2){
               System.out.println("猫好きのあなたは冒険心が強いです。");
          }
         else if(answer != 1 && answer != 2){
             System.out.println("あなたは型破りな性格です。");
	}
	public void situmon3(int a){
		//
	}
	public void situmon4(int a){
		//畠山拓也
		System.out.println("あなたの好きな色を、次の４つから選んで下さい");
		System.out.print("１：赤	\n２：緑	\n３：青	\n４：その他	\n番号を入力してください：");
		int num = sc.nextInt();
		if(num == 1){
			System.out.println("\nあなたは情熱的な人でしょう。");
		}else if(num == 1){
			System.out.println("\nあなたは優しい人でしょう。");
		}else if(num == 1){
			System.out.println("\nあなたは冷静な人でしょう。");
		}else if(num == 1){
			System.out.println("\nあなたは変わった人でしょう。");
		}
	}
}
