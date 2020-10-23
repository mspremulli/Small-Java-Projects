import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

class Point {
  private double x;
  private double y;

  Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() { return x; }

  public double getY() { return y; }

  public void setX(double x) { this.x = x; }

  public void setY(double y) { this.y = y; }

  public static double distance(Point p1, Point p2) {
    double distance = Math.sqrt(
            Math.pow(p2.getY() - p1.getY(), 2) +
                    Math.pow(p2.getX() - p1.getX(), 2)
    );

    return distance;
  }

  public String toString() {
    return "(" + this.x + ", " + this.y + ")";
  }
}

class Line {
  private Point start = new Point(0, 0);
  private Point end = new Point(0, 0);

  Line(Point start, Point end) {
    this.start = start;
    this.end = end;
  }

  public Point getStart() { return start; }

  public Point getEnd() { return end; }

  public void setStart(Point start) { this.start = start; }

  public void setEnd(Point end) { this.end = end; }

  public double getLineLength() {
    return Point.distance(start, end);
  }

  public String toString() {
    return "Start: " + this.start + " End: " + this.end;
  }
}

interface ListOfLines {
  public Vector<Line> getLinesFromStartingPoint(Point p);
  public Line getLineWithMaxLength();
  public Vector<Line> list_of_lines = null;
}

class LineList implements ListOfLines {
  public Vector<Line> list_of_lines = new Vector<>();

  LineList(Vector<Line> list_of_lines){
    this.list_of_lines = list_of_lines;
  }

  public Vector<Line> getLinesFromStartingPoint(Point p){
    Vector<Line> newLineList = new Vector<>();

    for (int i = 0; i < list_of_lines.size(); i++) {
      Line line = list_of_lines.get(i);
      if(line.getStart().getX() == p.getX() && line.getStart().getY() == p.getY()){
        newLineList.add(line);
      }
    }
    return newLineList;
  }

  public Line getLineWithMaxLength(){
    Line maxLine = list_of_lines.get(0);

    for(int i = 0; i < list_of_lines.size(); i++){
      Line line = list_of_lines.get(i);
      if(line.getLineLength() > maxLine.getLineLength()){
        maxLine = line;
      }
    }

    return maxLine;
  }

}