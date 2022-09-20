import java.util.ArrayList;
import static java.lang.Math.abs;
import static java.lang.Math.sqrt;


class MinimumBoundingRectangle {

    private ArrayList<Bounds> bounds;
    private double area;
    private double margin;
    private ArrayList<Double> center;
    

    MinimumBoundingRectangle(ArrayList<Bounds> bounds) {
        this.bounds = bounds;
        this.area = calculateArea();
        this.margin = calculateMargin();
        this.center = getCenter();

    }

    private double calculateArea(){
        double productOfEdges = 1;
        for (int d = 0; d < FilesHelper.getDataDimensions(); d++){
            productOfEdges = productOfEdges * (bounds.get(d).getUpper() - bounds.get(d).getLower());
        }
        return abs(productOfEdges);    
    }

    private double calculateMargin(){
        double sum = 0;
        for (int d = 0; d < FilesHelper.getDataDimensions(); d++){
            sum += abs(bounds.get(d).getUpper() - bounds.get(d).getLower());
        }
        return sum;    }

    private ArrayList<Double> getCenter(){
        // If center is not yet initialized, find the center and return it
        if (center == null)
        {
            center = new ArrayList<>();

            for (int d = 0; d < FilesHelper.getDataDimensions(); d++)
                center.add((double) ((bounds.get(d).getUpper()+bounds.get(d).getLower())/2));
        }
        return center;
    } 
    

}