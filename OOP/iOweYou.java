import java.util.HashMap;

public class JavaApplication42 {

    public static void main(String[] args) {
        // create a new IOU object
        IOU mattsIOU = new IOU();
        
        // set the amount owed to Arthur and Michael
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);
        
        // print the amount owed to Arthur and Michael
        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
    }
    
}

class IOU {
    // declare a private HashMap to store the amounts owed
    private HashMap<String, Double> owe;
    
    public IOU() {
        // create a new HashMap object
        this.owe = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        // add a new key-value pair to the HashMap
        owe.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        // initialize the iou variable to zero
        double iou = 0;
        
        // if the HashMap contains the specified key, retrieve its value
        if (this.owe.containsKey(toWhom)) {
            iou = this.owe.get(toWhom);
        }
        
        // return the value of the specified key, or zero if it doesn't exist
        return iou;
    }
}
