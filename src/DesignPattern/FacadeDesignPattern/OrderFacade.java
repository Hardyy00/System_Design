package DesignPattern.FacadeDesignPattern;

public class OrderFacade {

    ProductDAO productDao;
    Invoice invoice;
    Payment payment;
    SendNotification notification;

    public OrderFacade(){
        productDao = new ProductDAO();
        invoice = new Invoice();
        payment = new Payment();
        notification = new SendNotification();
    }

    public void createOrder(){
        Product product = productDao.getProduct(12);
        payment.makePayment();
        invoice.generateInvoice();
        notification.sendNotification();
    }
}
