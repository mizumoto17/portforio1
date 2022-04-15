//インスタンス化した商品のクラス
public class Items {
	
	private int[] num = new int[]{0, 1, 2, 3, 4};														//商品Number
	private String[] name = new String[]{"おいしいみず","サイコソーダ","ミックスオレ","コーヒー","カロリーメイト"};			//商品名
	private static int[] price = new int[] {100, 110, 120, 130, 210};									//商品の値段
	private static int[] stock = new int[] {10, 10, 10, 10, 10};										//在庫数

	public void display() {
		System.out.println("\n");
		System.out.println("自動販売機シミュレータを起動します");
		System.out.println("・使用可能な硬貨は、10円、50円、100円、500円のみです。");
		System.out.println("・使用可能な紙幣は、1000円のみです。");
		System.out.println("・投入可能な金額の上限は1990円とします。\n");

		for (int i = 0; i < 5 ;i++) {
			System.out.print(num[i] + "番	" + name[i] + "	" + price[i] + "円	" + stock[i] + "本\n");
		}
	}
	//privateなのでget　setで値を渡す
	//在庫数取得するゲッター
	public static int[] getstock() {
		return stock;
	}
	//在庫数を購入した際減少させるセッター
	public static void setstock(int i) {
		stock[i] -= 1;
	}

	//5本補充させるセッター
	public static void setstock2(int i) {
		stock[i] += 5;
	}

	//値段を取得するゲッター
	public static int[] getprice() {
		return price;
	}
}
