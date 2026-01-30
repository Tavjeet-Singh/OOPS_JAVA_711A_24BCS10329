class ShapeArea{
    double Area(int r){
        return 3.14 * r * r;
    }
    double Area(int l, int b){
        return l * b;
    }
    public static void main(String[] args){
        ShapeArea obj = new ShapeArea();
        System.out.println("Area of Circle: " + obj.Area(5));
        System.out.println("Area of Rectangle: " + obj.Area(4, 6));
    }
}
