package review;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockExample {
    public static void main(String[] args) throws Exception {
        String[] tickers = {"BB", "AMC", "NOK", "GME"};
        Map<String, BigDecimal> memeStocks = new LinkedHashMap<>();
        //Stock bb = YahooFinance.get("BB");
        //BigDecimal price = bb.getQuote().getPrice();
        //System.out.println(price);
        for (int i = 0; i < tickers.length; i++) {
            Stock stock = YahooFinance.get(tickers[i]);
            BigDecimal price = stock.getQuote().getPrice();
            memeStocks.put(tickers[i], price);
        }
        System.out.println("Current time is: " + new Date().toString());
        for (String ticker: memeStocks.keySet()) {
            System.out.println(ticker + ": " + memeStocks.get(ticker));
        }
    }
}
