package com.hawkins;

public class Main {

    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        // write your code here
        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);
        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 2.95, 4);
        stockList.addStock(temp);
        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);
        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);
        temp = new StockItem("towel", 2.40100, 80);
        stockList.addStock(temp);
        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList.toString());

        Basket basket = new Basket("Jack");
        sellItem(basket,"car",1);
        System.out.println(basket);
        sellItem(basket,"car",1);
        System.out.println(basket);
        sellItem(basket,"car",1);
        System.out.println(basket);

    }

    public static int sellItem(Basket basket, String item, int quantity){
        StockItem stockitem = stockList.get(item);
        if(stockitem == null){
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(stockList.sellStock(item, quantity) != 0){
            basket.addToBasket(stockitem, quantity);
            return quantity;
        }
        return 0;
    }
}
