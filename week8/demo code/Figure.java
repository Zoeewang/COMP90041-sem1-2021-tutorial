package wk9;

public class Figure
{


    public Figure ()
    {
        System.out.println("Creating a figure with no parameters.");
    }




    public void erase()
    {
        System.out.println("Call to Figure's erase method.");
    }

    public void draw()
    {
        System.out.println("Call to Figure's draw method.");
    }

    public void center()
    {
        System.out.println("Calling Figure's center method.");
        this.erase();
        this.draw();
    }
    public String toString(){
        return "toString from Figure";
    }

}
