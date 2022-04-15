//要件
// 使用可能な硬貨は、10円・50円・100円・500円のみとすること
// 使用可能な紙幣は、1000円のみとすること
// 購入者が硬貨または、紙幣を投入可能であること
// 投入金額の範囲内で商品が購入できること
// 投入金額の残金を使用可能な硬貨または、紙幣で返却できること
// 投入金額を確認できること
// 投入可能な金額の上限は1990円とすること
// 商品は5種類以上あること
// 商品の金額は自由に設定してよいが、110円・120円・130円の金額の商品を必ず含むこと
// 残数を確認できること
// 売り切れを購入者に知らせること
// 売り切れの場合、購入できないようにすること
// 現在の売り上げ金額を確認できること
// 釣銭の返却は、使用可能な硬貨または、紙幣で行うこと
// 釣銭で使用できる硬貨または紙幣の残数を確認できること

/*import java.io.BufferedWriter;
import java.util.HashMap;
import java.util.Map;*/
import java.util.Scanner; //パッケージの取り込み 長文簡略化

public class vm1 { //vending machine 自動販売機
	//メインロジック
 	public static void main(String[] args) {
 		
 	//------------------------------------型宣言------------	
 		int input = 1,flag = 0;
 		int alltotal = 0;
 		//boolean repeat = true;
 		/*int MoneyP;			//Money in possession 所持金
 		int InvestedMoney;		// 投入したお金
 		int DepositAmount = 0;	//入金金額
 		int SavingMoney;		//既に控えているお金
 		int Earnings;			//売上
 		int Change;				//釣銭*/
	//----------------------------------------------------------------------
 		Scanner scan = new Scanner(System.in);	//入力初期化
 	//--------------インスタンス化---------------------------------------------
 		Admin a = new Admin();						//管理者クラスのインスタンス化
 		Items i = new Items();						//商品クラスのインスタンス化
 		Calc c = new Calc();						//計算クラスのインスタンス化
 		Replenishment r = new Replenishment();		//補充クラス
 		

	//----------------------モード選択----------------------------------------------
		while(flag == 0) {		
		
			while(true) {

				i.display();	//itemクラスの商品を表示
				System.out.println("自販機に入金した合計金額" + r.total);
				System.out.println("0:管理者　1:入金  2:購入  3:返金  4:補充");
				System.out.print("Input：");
				input = scan.nextInt();
	//-------------------各項目選択時の処理-----------------------------------------
				if (input == 1) {	//入金時の処理

					while(true) {

					System.out.println("合計金額" + r.total);
					System.out.print("入金(終了の場合は5を入力)：");
					input = scan.nextInt();  
					r.total = c.check(input, r.total);

						if(input == 5) {
							break;
						}else {
							continue;
						}
					}
				} else if (input == 2) {	//購入時の処理

					while(true) {

						i.display();
						System.out.println("合計金額" + r.total);
						System.out.println("購入(終了の場合は5を入力)：");
						input = scan.nextInt();
						r.total = r.Buy(input, r.total);

						if (input == 5) {
							break;
						} else {
							continue;
						}
					}
				} else if (input == 3) {	//返金時の処理
					r.confirmation(r.total);
					flag = 1;
					break;
				} else if (input == 4) {	//補充時の処理

					while(true) {

						a.administ();
						System.out.println("補充(終了の場合は5を入力)：");
						input = scan.nextInt();

						if (input == 5) {
							break;
						} else {
							continue;
						}
					}
				} else if (input == 0) {	//売上確認

					while(true) {
					alltotal += r.total;

					System.out.println("売り上げは" + alltotal + "円です");
					System.out.println("管理者(終了の場合は5を入力)：");
					input = scan.nextInt();

						if (input == 5) {
							break;
						} else {
							continue;
						}
					}
				} else {
					flag  =1;
					break;
				}
			}
			scan.close();
		}
	}
} //class
