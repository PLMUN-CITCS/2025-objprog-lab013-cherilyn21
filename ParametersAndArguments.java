public class ParametersAndArguments {
    public static void main(String[] args) {
        int roomWidth = 10;    
        int roomHeight = 15;

        int area = calculateArea(roomWidth, roomHeight);
    }

    public static int calculateArea(int width, int height) {
        int area = width * height;
        System.out.println("The calculated area is: " + area); 
        return area;
    }
}
