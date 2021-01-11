package cn.edn.hcnu.ab.shape;

public class Square extends Shape {
    private float side;

    public Square(float side) {
        this.side = side;
    }

    @Override
    public float toArea() {
        System.out.println("正方形的面积");
        return side*side;
    }
}
