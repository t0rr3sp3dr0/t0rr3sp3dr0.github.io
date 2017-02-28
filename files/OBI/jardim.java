import java.awt.geom.*;
import java.util.Scanner;

/**
 * Created by phts on 27/08/16.
 */
public class jardim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point2D[] points = new Point2D[7];
        points[0] = new Point2D.Double(scanner.nextDouble(), scanner.nextDouble());
        points[1] = new Point2D.Double(scanner.nextDouble(), scanner.nextDouble());
        points[2] = new Point2D.Double(scanner.nextDouble(), scanner.nextDouble());
        points[3] = new Point2D.Double(scanner.nextDouble(), scanner.nextDouble());
        points[4] = new Point2D.Double(scanner.nextDouble(), scanner.nextDouble());
        points[5] = new Point2D.Double(scanner.nextDouble(), scanner.nextDouble());
        points[6] = new Point2D.Double(scanner.nextDouble(), scanner.nextDouble());

        boolean b = true;

        Line P1P2 = new Line(points[0].getX(), points[0].getY(), points[1].getX(), points[1].getY());
        Line P2P3 = new Line(points[1].getX(), points[1].getY(), points[2].getX(), points[2].getY());
        double cos = P1P2.cos(P2P3);
        if (cos <= 0 || cos >= Math.PI / 2)
            b = false;

        Line P1P3 = new Line(points[0].getX(), points[0].getY(), points[2].getX(), points[2].getY());
        if (P1P2.size() != P1P3.size())
            b = false;

        if (!P2P3.intersectsLine(points[3].getX(), points[3].getY(), 1, 1) || !P2P3.intersectsLine(points[3].getX(), points[4].getY(), 1, 1))
            b = false;

        Line P2P4 = new Line(points[1].getX(), points[1].getY(), points[3].getX(), points[3].getY());
        Line P3P5 = new Line(points[2].getX(), points[2].getY(), points[4].getX(), points[4].getY());
        if (P2P4.size() != P3P5.size())
            b = false;

        Line P4P5 = new Line(points[3].getX(), points[3].getY(), points[4].getX(), points[4].getY());
        if (P2P3.size() <= P4P5.size())
            b = false;

        Line P4P6 = new Line(points[3].getX(), points[3].getY(), points[5].getX(), points[5].getY());
        Line P5P7 = new Line(points[4].getX(), points[4].getY(), points[6].getX(), points[6].getY());
        if (!P4P6.halfPi(P2P3) || !P5P7.halfPi(P2P3))
            b = false;

        if (P4P6.size() != P5P7.size())
            b = false;

        Line P1P6 = new Line(points[0].getX(), points[0].getY(), points[5].getX(), points[5].getY());
        if (!P1P6.intersectsLine(P2P3))
            b = false;

        if (b)
            System.out.println("S");
        else
            System.out.println("N");
    }

    static class Line extends Line2D.Double {
        public Line(double x2, double y2) {
            super(0, 0, x2, y2);
        }

        public Line(double x1, double y1, double x2, double y2) {
            super(x1, y1, x2, y2);
        }

        Line vector() {
            return new Line(this.getX2() - this.getX1(), this.getY2() - this.getY1());
        }

        Line caret() {
            Line2D line2D = this.vector();
            double size = this.size();
            return new Line(line2D.getX2() / size, line2D.getY2() / size);
        }

        double size() {
            return this.getP2().distance(this.getP1());
        }

        public boolean equals(Line2D line2D) {
            return this.getX1() == line2D.getX1() && this.getX2() == line2D.getX2() && this.getY1() == line2D.getY1() && this.getY2() == line2D.getY2();
        }

        public boolean halfPi(Line line2D) {
            return this.vector().getX2() * line2D.vector().getX2() + this.vector().getY2() * line2D.vector().getY2() == 0;
        }

        double cos(Line line2D) {
            Line r = this.caret();
            Line s = line2D.caret();
            Line t;

            if (r.equals(s))
                return 1;
            else if (r.halfPi(s))
                return  0;

            if (r.getX2() == 0 || s.getY2() == 0)
                t = new Line(s.getX2(), r.getY2() * s.getX2() / r.getX2());
            else
                t = new Line(r.getX2() * s.getY2() / r.getY2(), s.getY2());

            if (t.size() > 1)
                return 1 / t.size();
            return t.size();
        }
    }
}
