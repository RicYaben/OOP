import java.util.Scanner;

/**
 *  Week 4 – Problem 10
 *  Create three classes: Rectangle, Triangle and Main.
 *  The Rectangle class has these variables: int s1, s2. The Triangle class has: int s1, s2, s3.
 *  Create getters and setters for each instance variable of the classes Rectangle and Triangle. Additionally, implement
 *  two more methods on each class: getArea() and getPerimeter(), which return the area and the perimeter of the
 *  rectangle or the triangle.
 *  Read 6 commands of input in the Main:
 *  • 0 – read three more integers, which correspond to the sides of a
 *  triangle, and create a Triangle object. (If one already exists, update its
 *  parameters).
 *  • 1 – read two more integers, which correspond to the sides of a
 *  rectangle, and create a Rectangle object. (If one already exists, update
 *  its parameters).
 *  • 2 – print the area of the Rectangle (if there is no rectangle yet, print 0).
 *  • 3 – print the perimeter of the Rectangle (if there is no rectangle yet,
 *  print 0).
 *  • 4 – print the area of the Triangle (rounded to two decimal places) (if
 *  there is no triangle yet, print 0).
 *  • 5 – print the perimeter of the Triangle (if there is no triangle yet, print
 *  0).
 *  Hint: use Heron’s formula for calculating the area of the triangle from the lengths of its sides.
 */

class Main{

    public static void main(String[]arg){
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = null;
        Rectangle rectangle = null;

        for(int x = 0;x < 6; x++ ){
            int a = scanner.nextInt();
            int i,j,k;

            switch(a){
                case 0:
                    i = scanner.nextInt();
                    j = scanner.nextInt();
                    k = scanner.nextInt();
                    if(triangle == null) {
                        triangle = new Triangle();
                    }
                    triangle.setS1(i);
                    triangle.setS2(j);
                    triangle.setS3(k);
                    break;
                case 1:
                    i = scanner.nextInt();
                    j = scanner.nextInt();
                    if(rectangle == null){
                        rectangle = new Rectangle();
                    }
                    rectangle.setS1(i);
                    rectangle.setS2(j);
                    break;
                case 2:
                    if(rectangle == null){
                        System.out.println(0);
                    }else{
                        System.out.printf("%d%n",rectangle.getArea());
                    }
                    break;
                case 3:
                    if(rectangle == null){
                        System.out.println(0);
                    }else{
                        System.out.printf("%d%n",rectangle.getPerimeter());
                    }
                    break;
                case 4:
                    if(triangle == null){
                        System.out.println(0);
                    }else{
                        System.out.printf("%.2f%n",triangle.getArea());
                    }
                    break;
                case 5:
                    if(triangle == null){
                        System.out.println(0);
                    }else{
                        System.out.printf("%.0f%n",triangle.getPerimeter());
                    }
                    break;
            }
        }
    }
}
class Rectangle{
    private int s1,s2;

    public void setS1(int s1) { this.s1 = s1; }
    public void setS2(int s2) { this.s2 = s2; }
    public int getS1() { return s1; }
    public int getS2() { return s2; }

    public int getArea(){
        int area = s1 * s2;
        return area;
    }
    public int getPerimeter(){
        int perimeter = (s1 + s2)*2;
        return perimeter;
    }
}
class Triangle{
    private int s1,s2,s3;

    public void setS1(int s1) { this.s1 = s1; }
    public void setS2(int s2) { this.s2 = s2; }
    public void setS3(int s3) { this.s3 = s3; }
    public int getS1() { return s1; }
    public int getS2() { return s2; }
    public int getS3() { return s3; }

    public double getArea(){
        double s = getPerimeter()/2;
        double area= Math.sqrt(((s-s1)*(s-s2)*(s-s3))*s);
        return area;
    }
    public double getPerimeter(){
        double perimeter = s1 + s2 + s3;
        return perimeter;
    }
}