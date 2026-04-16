package basic.question04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第7章 配列
 */

public class Question04_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] ageGroup = { 23, 33, 26, 21, 25, 22 };
		ageGroup = new int[5];
		int temporaryAge = 0;

		System.out.println("４番目の人の年齢を入力してください。");
		String age = reader.readLine();
		int num = Integer.parseInt(age);

		temporaryAge = num;

		System.out.println("４番目の人の年齢は" + num + "歳です。");
		System.out.println("人数は" + ageGroup.length + "人です。");

		// TODO:ここに実装

	}

}
