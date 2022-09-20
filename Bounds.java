// import java.util.ArrayList;

// public class Bounds {

//      // constructor of the class
//     // Since we have to do with bounds of an interval the lower Bound cannot be bigger than upper
//     Bounds(double lower, double upper) {
//         if (lower <= upper)
//         {
//             this.lower = lower;
//             this.upper = upper;
//         }
//         else
//             throw new IllegalArgumentException( "The lower value of the bounds cannot be bigger than the upper");
//     }

//     public int getUpper() {
//         return 0;
//     }

//     public int getLower() {
//         return 0;
//     }

//     // Returns an ArrayList with bounds for each dimension, including the the minimum bounds needed to fit the given entries
//     static ArrayList<Bounds> findMinimumBounds(ArrayList<Entry> entries) {
//         ArrayList<Bounds> minBounds = new ArrayList<>();
//         // For each dimension finds the minimum interval needed for the entries to fit
//         for (int d = 0; d < FilesHelper.getDataDimensions(); d++)
//         {
//             Entry lowerEntry = Collections.min(entries, new EntryComparator.EntryBoundComparator(entries,d,false));
//             Entry upperEntry = Collections.max(entries, new EntryComparator.EntryBoundComparator(entries,d,true));
//             minBounds.add(new Bounds(lowerEntry.getMBR().getBounds().get(d).getLower(),upperEntry.getMBR().getBounds().get(d).getUpper()));
//         }
//         return minBounds;
//     }

//     // Returns an ArrayList with bounds for each dimension, including the the minimum bounds needed to merge the given bounding boxes
//     static ArrayList<Bounds> findMinimumBounds(MinimumBoundingRectangle boundingBoxA, MinimumBoundingRectangle boundingBoxB) {
//         ArrayList<Bounds> minBounds = new ArrayList<>();
//         // For each dimension finds the minimum interval needed for the entries to fit
//         for (int d = 0; d < FilesHelper.getDataDimensions(); d++)
//         {
//             double lower = Math.min(boundingBoxA.getBounds().get(d).getLower(), boundingBoxB.getBounds().get(d).getLower());
//             double upper = Math.max(boundingBoxA.getBounds().get(d).getUpper(), boundingBoxB.getBounds().get(d).getUpper());
//             minBounds.add(new Bounds(lower,upper));
//         }
//         return minBounds;
//     }

// }
