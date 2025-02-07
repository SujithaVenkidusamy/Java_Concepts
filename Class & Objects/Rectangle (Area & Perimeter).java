import java.util.*;
public class Rectangle
{
    int area(int l,int w)
    {
        int area=l*w;
        return area;
    }
    
    int peri(int l,int w)
    {
        int peri=2*(l+w);
        return peri;
    }
    
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter length: ");
        int l=s.nextInt();
        System.out.print("Enter width: ");
        int w=s.nextInt();
        Rectangle r=new Rectangle();
        int area=r.area(l,w);
        int peri=r.peri(l,w);
        System.out.println("Area is : " +area);
        System.out.println("Perimeter is : " +peri);
    }
}
