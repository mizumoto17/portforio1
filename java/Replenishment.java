public class Replenishment {
	int i,total;
	int flag = 0;
	public static int[] money1 = new int[] {20, 20, 20, 20, 20};
	public static int[] money2 = new int[5];

	public int Buy(int input, int total) {	//input totalをint型で受け取る

		switch(input) {

			case 0:
			total = Calc.check2(total, input);
			break;

			case 1:
			total = Calc.check2(total, input);
			break;

			case 2:
			total = Calc.check2(total, input);
			break;

			case 3:
			total = Calc.check2(total, input);
			break;

			case 4:
			total = Calc.check2(total, input);
			break;

			case 5:
			break;
			

			default:
			System.out.println("正しく入力してください");
		}

		return total;
	}
	//---------------釣銭確認-----------------
	public int confirmation(int total) {

		System.out.println("お釣りは" + total + "円になります");

		do {

			if (total >= 1000 && money1[4] > 0) {
				money1[4] -= 1;
				total -= 1000;
				money2[4] += 1;
			}

			if(total >= 500 && money1[3] > 0) {
				money1[3] -= 1;
				total -= 500;
				money2[3] += 1;
			}

			if(total >= 100 && money1[2] > 0) {
				money1[2] -= 1;
				total -= 100;
				money2[2] += 1;
			}

			if(total >= 50 && money1[1] > 0) {
				money1[1] -= 1;
				total -= 50;
				money2[1] += 1;
			}

			if(total >= 10 && money1[0] > 0) {
				money1[0] -= 1;
				total -= 10;
				money2[0] += 1;
			}
			for (i = 0; i < money1.length;i++) {
				if (money1[i] == 0) {
					flag += 1;
				}
			}

			if (flag == 5) {
				System.out.println("おつりがありません");
				break;
			}
		} while(total > 0);

		System.out.println("お釣りの硬貨 "+ "10円" + "," + money2[0]);
		System.out.println("お釣りの硬貨 "+ "50円" + "," + money2[1]);
		System.out.println("お釣りの硬貨 "+ "100円" + "," + money2[2]);
		System.out.println("お釣りの硬貨 "+ "500円" + "," + money2[3]);
		System.out.println("お釣りの硬貨 "+ "1000円" + "," + money2[4]);

		System.out.println("自販機内の10円のお釣りの数"+ "　" + money1[0]);
		System.out.println("自販機内の50円のお釣りの数"+ "　" + money1[1]);
		System.out.println("自販機内の100円のお釣りの数"+"　" + money1[2]);
		System.out.println("自販機内の500円のお釣りの数"+"　" + money1[3]);
		System.out.println("自販機内の1000円のお釣りの数"+ "　" + money1[4]);

		return total;
	}

	public static void setMoney(int i) {
		money1[i] += 1;
	}
}