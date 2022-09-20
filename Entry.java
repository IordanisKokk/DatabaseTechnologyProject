// import java.util.ArrayList;

// // An Entry refers to the address of a lower Node (child) in the RStarTree and to it's BoundingBox (it's covering rectangle),
// // which covers all the bounding boxes in the lower Node's Entries
// public class Entry {
    
//     private MinimumBoundingRectangle mbr;
//     private Long childNodeBlockID;

//     // Constructor which takes parameters the lower Node which represents the child node of the entry
//     Entry(Node childNode) {
//         this.childNodeBlockID = childNode.getBlockId();
//         adjustBBToFitEntries(childNode.getEntries()); // Adjusting the BoundingBox of the Entry to fit the objects of the childNode
//     }

//     // Constructor which takes parameters the lower Node which represents the child node of the entry
//     Entry(MinimumBoundingRectangle mbr){
//         this.mbr = mbr;
//     }

//     public MinimumBoundingRectangle getMBR(){
//         return mbr;
//     }

//     public Long getChildNodeBlockID(){
//         return childNodeBlockID;
//     }

//     public void setMBR(MinimumBoundingRectangle mbr){
//         this.mbr = mbr;
//     }

//     public void setChildNodeBlockID(Long childNodeBlockID){
//         this.childNodeBlockID = childNodeBlockID;
//     }

//     private void adjustMBRToFitEntries(ArrayList<Entry> entries){
//         mbr = new MinimumBoundingRectangle(Bounds.findMinimumBounds(entries)
//     }

//     private void adjustMBRToFitEntry(Entry entry){
//         mbr = new MinimumBoundingRectangle(Bounds.findMinimumBounds(mbr,entry.getMBR()));
//     }

// }
