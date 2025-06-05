package SOLID.Interface_Segmented_Principle;

// interfaces should be such, that client should not implement unnecessary functions they do not need

public interface RestaurantEmployee {

    void washDishes();
    void serveCustomers();
    void cookFood();
}

// we disobey 'I' of solid, as we are implementing methods they are unnecessary
class Waiter implements RestaurantEmployee{

    @Override
    public void washDishes(){
        // not my job
    }

    @Override
    public void serveCustomers(){
        // serve the customers
    }

    @Override
    public void cookFood(){
        // not my job
    }
}

// corrections

// segregating WaiterInterface and ChefInterface from Employee Interface

// divide a interface in such small parts , so that a implementing class doesn't implement unnecessary functions



interface WaiterInterface  {
    void serveCustomer();
    void takeOrders();
}


interface ChefInterface{
    void cookFood();
    void decideMenu();
}

