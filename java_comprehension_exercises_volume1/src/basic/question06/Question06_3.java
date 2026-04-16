package basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int amount = 0;
		int price = 0;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("鉛筆を購入しますか？");
		System.out.println("はい：0、いいえ：1>");
		String buyflagstr = reader.readLine();
		int buyFlag = Integer.parseInt(buyflagstr);

		while (buyFlag == 0) {
			amount++;
			System.out.println("購入する鉛筆の数を1つ増やしますか？");
			System.out.println("はい：0、いいえ：1>");
			String choice = reader.readLine();
			buyFlag = Integer.parseInt(choice);

		}
		System.out.println("繰り返した鉛筆の本数は" + amount + "本です。");

		int totalPrice = (amount * price);
		System.out.println("購入した鉛筆の合計金額は" + totalPrice + "円です。");

		// TODO:ここに実装

	}

}
