package com.kihongkim.section01.class01;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];

        ProductOrder productOrder1 = new ProductOrder();
        productOrder1.productName = "두부";
        productOrder1.price = 2000;
        productOrder1.quantity = 2;
        productOrders[0] = productOrder1;

        ProductOrder productOrder2 = new ProductOrder();
        productOrder2.productName = "김치";
        productOrder2.price = 5000;
        productOrder2.quantity = 1;
        productOrders[1] = productOrder2;

        ProductOrder productOrder3 = new ProductOrder();
        productOrder3.productName = "콜라";
        productOrder3.price = 1500;
        productOrder3.quantity = 2;
        productOrders[2] = productOrder3;

        int total = 0;
        for (ProductOrder orders : productOrders) {
            System.out.println("상품명: " + orders.productName + ", 가격: " + orders.price + ", 수량: " + orders.quantity);
            total += orders.price * orders.quantity;
        }
        System.out.println("총 결제 금액: " + total);
    }
}
