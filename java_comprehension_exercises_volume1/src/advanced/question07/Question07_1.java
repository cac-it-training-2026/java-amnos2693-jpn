package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_1 {

	public static void main(String[] args, BufferedReader reader) throws IOException {
		String[] itemNames = new String[5];
		int[] price = new int[5];

		for (int i = 0; i < 5; i++) {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("商品" + (i + 1) + "を入力してください:>");
			String itemstr = reader.readLine();
			int itemnum = Integer.parseInt(itemstr);
		}

		System.out.println("各商品の単価を順に入力してください。：");

		for (int i = 0; i < 4; i++) {
			System.out.println(itemNames[i] + "の単価:>" + price);
			String pricestr = reader.readLine();
			int pricenum = Integer.parseInt(pricestr);

		}

		System.out.println("登録商品一覧");
		System.out.println(itemNames + ":" + price + "円");
		// TODO:ここに実装

	}

}
