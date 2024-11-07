public class Geometry {
    public static String volume(double side) {
        double volume = Math.pow(side, 3);
        return String.format("The volume of the cube is: %.2f", volume);
    }
    public static String volume(double radius, boolean isSphere) {
        if (isSphere) {
            double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
            return String.format("The volume of the sphere is: %.2f", volume);
        } else {
            return "Invalid shape type";
        }
    }
    public static void main(String[] args) {
        double cubeSide = 3;
        double sphereRadius = 4;
        System.out.println(volume(cubeSide));
        System.out.println(volume(sphereRadius, true));
    }
}
