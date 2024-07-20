package SOLID.Open_Closed_Principle;


public class Invoice{

    Marker marker;
    int quantity;

    public Invoice(Marker marker, int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }


    public int calculateTotal(){
        return marker.price * quantity;
    }

    // it is not an inner class
    class InvoiceDao {

        Invoice invoice;

        public InvoiceDao(Invoice invoice) {

            this.invoice = invoice;
        }

        public void saveToDB(){}

        // now if we want to add a feature , to also save in file, we may add it like this , but this is not fine
        // as a class must not be opened for modifications, but must be opened for extension, so the right decision is to
        // extend this class for modification

//        public void saveToFile(String filename){
//            // save invoice in the File with the given name
//        }
    }
}
