/*
Ryan Wagner 
CST 3515
2/20/2017
*/
public class myRectangle {
    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle(40 ,4);
        Rectangle rectangle2 = new Rectangle(35.9, 3.5);
        
        System.out.println("The width of rectangle 1 is : " + rectangle1.getWidth() + "\n"+
                "The height is : " + rectangle1.getHeight() + "\n" + 
                "The area is : " + rectangle1.getArea()+ "\n" + "The perimeter is : " + 
                rectangle1.getPerimeter()+ "\n"); 
        System.out.println("The width of rectangle 2 is : " + rectangle2.getWidth() + "\n"+
                "The height is : " + rectangle2.getHeight() + "\n" + 
                "The area is : " + rectangle2.getArea()+ "\n" + "The perimeter is : " + 
                rectangle2.getPerimeter()); 
        
        
    }
    
}
class Rectangle{
    private double height;
    private double width;
    
    
    
    public Rectangle(){
        width = 1;
        height = 1;
    }
    
    public Rectangle(double x, double y){
        height = x;
        width = y;
    }
    public void setHeight(double x ){
        height = x;
    }
    
    public double getHeight(){
        return height;
    }
    
    public void setWidth(double y){
        width = y;
    }
    
    public double getWidth(){
        return width;
    }
    
    public double getArea(){
        return height * width;
    }
    
    public double getPerimeter(){
        return (2*(height + width));
    }
}