package com.suhas.test.runner;

import java.util.List;

import com.suhas.dto.Customer;
import com.suhas.dto.CustomerType;
import com.suhas.dto.Product;

public class BillCalculateRunner {

	public static void main(String args[]) {
		DiscountCalculator dc = new DiscountCalculator();

		for (CustomerType custType : CustomerType.values()) {

			List<Product> products =dc.getProducts();

			Customer c = new Customer("1", "suhas", custType, products);

			System.out.println("final bill for customer type  " + custType + ":" + dc.getFinalBill(c));
		}

	}

}
