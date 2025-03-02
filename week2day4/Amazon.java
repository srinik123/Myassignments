package week2day4;

public class Amazon extends CanaraBank {

			public void cashOnDelivery() {
			// TODO Auto-generated method stub
			System.out.println("Implementing interface method -cashDelivery");

		}

		
		public void upiPayments() {
			// TODO Auto-generated method stub
			System.out.println("Implementing interface method -upipayments");
		}

		
		public void cardPayments() {
			// TODO Auto-generated method stub
			System.out.println("Implementing interface method -cardpayments");
		}

		
		public void internetBanking() {
			// TODO Auto-generated method stub
			System.out.println("Implementing interface method -InternetBanking");
		}

		
		public void recordPaymentDetails() {
			// TODO Auto-generated method stub
			System.out.println("Implementing interface method -recordPaymentDetails");
		}

		public static void main(String[] args) {
			Amazon a = new Amazon();
			a.cashOnDelivery();
			a.cardPayments();
			a.upiPayments();
			a.internetBanking();
			a.recordPaymentDetails();
		}


		

		
}
		
	


	

	