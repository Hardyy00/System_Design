package SOLID.Single_Responsibility_Principle;

public class Invoice{

    // here we have 3 reasons to change (i.e it has 3 responsibilities) , so it violates the 'S' in solid

    Marker marker;
    int quantity;

    public Invoice(Marker marker, int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }


    public int calculateTotal(){
        return marker.price * quantity;
    }

//    public void printInvoice(){}
//
//    public void saveToDB(){}
}


// to follow the 'S' , we make two separate classes handling the database saving and invoice printing

// Dao -> Data access layer
class InvoiceDao {

    Invoice invoice;
    public InvoiceDao(Invoice invoice){
        this.invoice = invoice;
    }

    public void saveToDB(){}
}

class InvoicePrinter{

    Invoice invoice;
    public InvoicePrinter(Invoice invoice){
        this.invoice = invoice;
    }

    public void printInvoice(){}
}

