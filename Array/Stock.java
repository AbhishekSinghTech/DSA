
public class Stock {
    public static void buyingShelling(int[ ] prices) {
        int buyingPrice=Integer.MAX_VALUE;
        int MaxProfit=0;
        for (int i = 1; i < prices.length; i++) {
            if (buyingPrice<prices[i]){
                int profit=prices[i]-buyingPrice;
                MaxProfit=Math.max(MaxProfit,profit);
            }else{
               buyingPrice=prices[i]; 
            }
        }
        System.out.println("The maximum Profit is "+MaxProfit);
    }
    public static void main(String[] args) {
        int []price = {7,1,5,3,6,4};
        buyingShelling(price);
    }
}