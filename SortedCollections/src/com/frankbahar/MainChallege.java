package com.frankbahar;
import java.lang.String;
import java.util.Map;

public class MainChallege {
    private static  StockList stockList = new StockList();

    public static void main(String[] args) {

        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.00, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);
        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

        for (String s : stockList.Items().keySet()) {
            System.out.println(s);
        }
        Basket frankBasket = new Basket("Frank");
        sellItem(frankBasket,"car",1);
        System.out.println(frankBasket);

        sellItem(frankBasket,"car",1);

        if (sellItem(frankBasket,"car",1) != 1)
            System.out.println("There are no more cars in stock");
        sellItem(frankBasket,"spanner",5);
        System.out.println(frankBasket);

        sellItem(frankBasket,"juice",4);
        sellItem(frankBasket,"cup",12);
        sellItem(frankBasket,"bread",1);
//        System.out.println(frankBasket);

        Basket johnBasket = new Basket("John");
        sellItem(johnBasket,"cup",100);
        sellItem(johnBasket,"juice",5);
        sellItem(johnBasket,"cup",1);
        System.out.println(johnBasket);

        removeItem(frankBasket,"car",1);
        removeItem(frankBasket,"cup",9);
        removeItem(frankBasket,"car",1);
        System.out.println("cars removed: " + removeItem(frankBasket,"car",1)); // should not remove any

        System.out.println(frankBasket);

        // remove all items from Frank Basket
        removeItem(frankBasket,"bread",1);
        removeItem(frankBasket,"cup",3);
        removeItem(frankBasket,"jouice",4);
        removeItem(frankBasket,"cup",3);
        System.out.println(frankBasket);

        System.out.println("\nDisplay stock list before and after checkout");
        System.out.println(johnBasket);
        System.out.println(stockList);
        checkOut(johnBasket);
        System.out.println(johnBasket);
        System.out.println(stockList);

        stockList.Items().get("car").adjustStock(2000);
        stockList.get("car").adjustStock(-1000);
        System.out.println(stockList);

        checkOut(frankBasket);
        System.out.println(frankBasket);
    }

    public static int sellItem(Basket basket, String item, int quantity){
        // retrive the item from the stock list
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (stockList.reserveStock(item,quantity) !=0 ) {
            basket.addToBasket(stockItem, quantity);
            return basket.addToBasket(stockItem, quantity);
        }
        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity){
        // retrive the item from the stock list
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (basket.removeFromBasket(stockItem, quantity) == quantity) {
            return stockList.unreserveStock(item, quantity);
        }
        return 0;
    }

    public static void checkOut(Basket basket){
        for (Map.Entry<StockItem, Integer> item: basket.Items().entrySet()){
            stockList.sellStock(item.getKey().getName(),item.getValue());
        }
        basket.clearBasket();
    }
}
