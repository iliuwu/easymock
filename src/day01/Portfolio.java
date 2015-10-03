package day01;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
	private String name;
	private StockMarket stockMarket;
	private List<Stock> stocks = new ArrayList<Stock>();
	
	public double getTotalValue() {
		double value = 0.0;
		for (Stock stock:this.stocks){
			value +=(stockMarket.getPrice(stock.getName()) * stock.getQuantity());
		}
		return value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StockMarket getStockMarket() {
		return stockMarket;
	}

	public void setStockMarket(StockMarket stockMarket) {
		this.stockMarket = stockMarket;
	}

	public List<Stock> getStocks() {
		return stocks;
	}

	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}
	
	

}
