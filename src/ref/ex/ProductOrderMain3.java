package ref.ex;


import java.util.Scanner;

public class ProductOrderMain3 {

	public static void main(String[] args) {
		System.out.print("입력할 주문의 개수를 입력하세요 :");
		Scanner input = new Scanner(System.in);
		int orderCount = input.nextInt();
		input.nextLine();


		ProductOrder[] orders = new ProductOrder[orderCount];

		for (int i = 0; i < orderCount; i++) {
			System.out.println((i+1) + "번쨰 주문 정보를 입력하세요.");

			System.out.print("상품명 : ");
			String productName = input.nextLine();

			System.out.print("가격 : ");
			int price = input.nextInt();

			System.out.print("수량 : ");
			int quantity = input.nextInt();
			input.nextLine();

			orders[i] = createProductOrder(productName,price,quantity);
		}




		printProductOrder(orders);
		int totalAmount = getTotalAmount(orders);
		System.out.println("총 결재금액 " + totalAmount);
	}

	static ProductOrder createProductOrder (String productName, int price, int quantity ) {
		ProductOrder productOrder = new ProductOrder();
		productOrder.productName = productName;
		productOrder.price = price;
		productOrder.quantity = quantity;
		return productOrder;

	}

	static void printProductOrder(ProductOrder[] orders) {
		for (ProductOrder order : orders) {
			System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
		}
	}

	static int getTotalAmount(ProductOrder[] orders){
		int totalAmount = 0;
		for (ProductOrder order : orders) {
			totalAmount += order.price * order.quantity;
		}
		return totalAmount;
	}
}
