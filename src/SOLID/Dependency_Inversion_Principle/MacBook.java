package SOLID.Dependency_Inversion_Principle;

// class should depend on interfaces rather than concrete classes

interface Keyboard{}

class WiredKeyboard implements Keyboard{}

class BluetoothKeyboard implements Keyboard{}

interface Mouse{}

class WiredMouse implements  Mouse{}

class  BluetoothMouse implements  Mouse{}

public class MacBook {

    // here we are restricting the keyboard and mouse to only be wired

//    private final WiredKeyboard keyboard;
//    private final WiredMouse mouse;
//
//    public MacBook(){
//        keyboard = new WiredKeyboard();
//        mouse = new WiredMouse();
//    }


    // how it should be ->

    private final Keyboard keyboard;
    private final Mouse mouse;

    // constructor injection , here we are being very flexible with keyboard and mouse (we can have any type of them)
    public MacBook(Keyboard keyboard, Mouse mouse){
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}
