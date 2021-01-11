package cn.edn.hcnu.ab.shape;

public class Triangle extends Shape {
    private float side1;
    private float side2;
    private float side3;

    public Triangle(float side1, float side2, float side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public float toArea() {

        return (float) Math.sqrt((side1+side2-side3)*(side1+side3-side2)*(side2+side3-side2));
    }
}
