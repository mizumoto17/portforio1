public class Admin {	//管理者クラス
	Items i = new Items();

	public void administ() {

		 for (int i = 0; i < 5; i++) {
		 	Items.setstock2(i);
		 }
		 i.display();
	}
}