package core.basesyntax;

public class RightTriangle implements Figure {
    private double firstLeg;
    private double secondLeg;
    private String color;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: right triangle, area: " + getArea() + " sq.units, first leg: " + firstLeg
                        + " units, second leg: " + secondLeg + " units, color: " + color);
    }
}
