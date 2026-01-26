package com.ecommerceproductinventory;

// One node for Binary Search
public class Node {
	// the product record
	Product data;

	// Stock Keeping Unit - SKU
	// smaller SKUs
	Node left;

	// larger SKUs
	Node right;

	// constructor
	public Node(Product product) {
		this.data = product;
		this.left = null;
		this.right = null;
	}
}