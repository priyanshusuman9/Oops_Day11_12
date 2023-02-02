package com.bridgelabz;
import java.util.Scanner;

class StockManagement {
        /*
         * variables of a object
         */
        private static int noOfStocks;
        private static String shareName;
        private static int noOfShare;
        private static int sharePrice;
        static int StockPrice;
        static int TotalValue;

        public static int getNoOfStocks() {
            return noOfStocks;
        }

        public static void setNoOfStocks(int noOfStocks) {
            StockManagement.noOfStocks = noOfStocks;
        }

        public static String getShareName() {
            return shareName;
        }

        public static void setShareName(String shareName) {
            StockManagement.shareName = shareName;
        }

        public static int getNoOfShare() {
            return noOfShare;
        }

        public static void setNoOfShare(int noOfShare) {
            StockManagement.noOfShare = noOfShare;
        }

        public static int getSharePrice() {
            return sharePrice;
        }

        public static void setSharePrice(int sharePrice) {
            StockManagement.sharePrice = sharePrice;
        }

        public static int getStockPrice() {
            return StockPrice;
        }

        public static void setStockPrice(int stockPrice) {
            StockPrice = stockPrice;
        }

        public static int getTotalValue() {
            return TotalValue;
        }

        public static void setTotalValue(int totalValue) {
            TotalValue = totalValue;
        }

        public void addShare() {

            // user input for Share details

            Scanner scanner = new Scanner(System.in);
            System.out.println("\nEnter the Name of Share");
            shareName = scanner.nextLine();
            System.out.println("Enter the number of Share");
            noOfShare = scanner.nextInt();
            System.out.println("Enter the price for Share");
            sharePrice = scanner.nextInt();
            StockPrice = noOfShare * sharePrice;
            System.out.println("\nValue of Stock " + shareName + " is = " + StockPrice);
            scanner.close();
        }
    }
public class Portfolio extends StockManagement {
    public static void main(String[] args) {

        System.out.println("Enter the total number of Stocks");
        Scanner scanner = new Scanner(System.in);

        setNoOfStocks(scanner.nextInt());
        for (int i = 1; i <= getNoOfStocks(); i++) {
            StockManagement stock = new StockManagement();
            stock.addShare();
            TotalValue += StockPrice;
        }
        System.out.println("\nTotal Value is " + TotalValue);
    }
}
