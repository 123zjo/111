package cn.edn.hcnu.ab.shape;

public class Test1 {
    public static void main(String[] args) {
        Shape shape1= new Square(4);
        System.out.println(shape1.toArea());
        Shape shape2 = new Triangle(2,4,5);
        System.out.println(shape2.toArea());
    }
}
