public class Calc {	//計算クラス

	public int check(int input, int total) {
		
		switch(input) {

			case 10:				
				if(total > 1990) {
				System.out.println("上限額を超えています");
				System.out.println("お金を返却します");
				total -= input;
				break;
				}
				total += input;
				Replenishment.setMoney(0);	//Replenishment 104行目
				break;

			case 50:
				if (total > 1990) {
				System.out.println("上限額を超えています");
				System.out.println("お金を返却します");
				total -= input;
				break;
				}
				total += input;
				Replenishment.setMoney(1);	//Replenishment 104行目
				break;

			case 100:
				if (total > 1990) {
				System.out.println("上限額を超えています");
				System.out.println("お金を返却します");
				total -= input;
				}
				total += input;
				Replenishment.setMoney(2);	//Replenishment 104行目
				break;

			case 500:
				if (total > 1990) {
				System.out.println("上限額を超えています");
				System.out.println("お金を返却します");
				total -= input;	
				}
				total += input;
				Replenishment.setMoney(3);	//Replenishment 104行目
				break;
				

			case 1000:
				if (total > 1990) {
				System.out.println("上限額を超えています");
				System.out.println("お金を返却します");
				total -= input;
				} 
				total += input;
				Replenishment.setMoney(4);	//Replenishment 104行目
				break;
				

			case 5:
				break;

			default:
				System.out.println("使用出来ないお金です。\n");
				break;			
		}
		return total;
	}
	
		//商品が購入可能か
		public static int check2(int total, int i) {
			int alltotal;
			if (total >= Items.getstock()[i]) {	//Items 25行目

				if(Items.getstock()[i] < 1) {	//Items 29行目
					System.out.println("\n完売したため購入出来ません");
				} else {
					Items.setstock(i);
					total -= Items.getprice()[i];	//Items 39行目
				}
			} else {
				System.out.println("\n所持金が足りません");
			}
			
		return total;
	}
}


