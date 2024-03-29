package test20240328_uechi;

import java.util.Scanner;

public class PasswordInput {
    public static void getInputAndCheckPassword() {
        // ルールの説明
        System.out.println("パスワードは8文字以上で、文字と数字のみを含む必要があります。数字は3つ以上含む必要があります。");

        // パスワードの入力
        System.out.println("パスワードを入力してください:");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        // パスワードのチェック
        if (isValidPassword(password)) {
            System.out.println("パスワードは有効です。");
        } else {
            System.out.println("パスワードは無効です。");
        }
    }

    // パスワードが有効かどうかをチェックするメソッド
    public static boolean isValidPassword(String password) {
        // パスワードの長さが8文字以上であることを確認
        if (password.length() < 8) {
            return false;
        }

        // 数字の数をカウント
        int digitCount = 0;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            } else if (!Character.isLetter(c)) {
                // 文字か数字以外が含まれている場合は無効
                return false;
            }
        }

        // 数字の数が3つ以上であることを確認
        if (digitCount < 3) {
            return false;
        }

        // 全ての条件を満たしていれば有効なパスワード
        return true;
    }
}