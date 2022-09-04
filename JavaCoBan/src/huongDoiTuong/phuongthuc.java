package huongDoiTuong;

public class phuongthuc 
{
    public static void main(String[] args) 
{
    Meo tom = new Meo();
    tom.name = "Tom";
    tom.age = 2;
    tom.color = "pink";
    System.out.println("Tuoi: "+ tom.age);
    System.out.println("Ten: "+ tom.name);
    System.out.println("Mau: "+ tom.color);
    tom.speak();
    
} 
    

    
}
