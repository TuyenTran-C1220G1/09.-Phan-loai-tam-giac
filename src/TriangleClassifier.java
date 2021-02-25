public class TriangleClassifier {
    static String classifyTriangle(double side1, double side2, double side3) {
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            if (side1 == side2 && side1 == side3) {
                return "equilateral triangle";
            }
            else if (side1 == side2 || side1 == side3 || side2 == side3) {
                return "isosceles triangle";
            } else return "triangle";
        } else return "not a triangle";
    }
}