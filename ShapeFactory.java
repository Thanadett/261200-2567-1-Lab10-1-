public class ShapeFactory {
    public static final int TYPE_CIRCLE = 0;
    public static final int TYPE_RECTANGLE = 1;
    public static final int TYPE_SQUARE = 2;

    private static int countCircle = 0;
    private static int countRectangle = 0;
    private static int countSquare = 0;
    private static int totalShapes = 0;
    private static final int MAX_PER_SHAPE = 2;
    private static final int MAX_TOTAL_SHAPES = 5;


    public static Shape getShape(int shapeType) {
        if (totalShapes >= MAX_TOTAL_SHAPES) {
            return null;
        }

        switch (shapeType) {
            case TYPE_CIRCLE -> {
                if (countCircle < MAX_PER_SHAPE) {
                    countCircle++;
                    totalShapes++;
                    return new Circle();
                }
                return null;
            }
            case TYPE_RECTANGLE -> {
                if (countRectangle < MAX_PER_SHAPE) {
                    countRectangle++;
                    totalShapes++;
                    return new Rectangle();
                }
                return null;
            }
            case TYPE_SQUARE -> {
                if (countSquare < MAX_PER_SHAPE) {
                    countSquare++;
                    totalShapes++;
                    return new Square();
                }
                return null;
            }
            default -> {
                return null;
            }
        }
    }
}