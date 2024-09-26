public class PaymentSys {
    private final int price = 1000000;
    private String paymentType;
    private String paymentDate;

    public void setPaymentType (String paymentType) {
        this.paymentType = paymentType;
    }
    public void setPaymentDate (String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public void calculatePayment (double paymentAmount) {
        if (paymentAmount >= price*1.10) {
            print();
            if (paymentAmount-price > 0) {
                System.out.println("Leftover amount : " + (paymentAmount-price));
            }
        } else {
            System.out.println("Payment failed!");
            System.out.println("Missing " + paymentAmount * 0.10);
        }

    }

    public void print () {
        System.out.println("Successfully paid out !");
        System.out.println("Payment type: " + paymentType);
        System.out.println("Payment date: " + paymentDate);
    }

}
