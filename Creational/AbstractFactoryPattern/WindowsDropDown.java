package AbstractFactoryPattern;

public class WindowsDropDown implements DropDown {
    
    @Override
    public void display() {
        System.out.println("Displaying a Windows dropdown.");
    }
    
}
