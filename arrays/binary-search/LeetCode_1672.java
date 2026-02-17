public class LeetCode_1672 {
    public static void main(String[] args) {
        int[][] accounts = {
                { 1, 2, 3 },
                { 3, 5, 1 },
                { 12, 12, 12 }
        };

        System.out.println(wealth(accounts));

    }

    static int wealth(int[][] accounts) {
        int current_wealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int money = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                money += accounts[i][j];
            }
            if (money > current_wealth) {
                current_wealth = money;
            }
        }
        return current_wealth;
    }
}
