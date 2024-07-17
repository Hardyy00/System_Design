package SOLID.Open_Closed_Principle;

public interface InvoiceDao {

   public void save(Invoice invoice);
}


class DatabaseInvoiceDao implements  InvoiceDao{

   @Override
   public void save(Invoice invoice){
         // save to DB
   }
}

class FileInvoiceDao implements InvoiceDao{

   @Override
   public void save(Invoice invoice){
      // save to file
   }
}