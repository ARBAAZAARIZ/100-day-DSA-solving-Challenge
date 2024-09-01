package FirstWeek;

//There are numBottles water bottles that are initially full of water.
// You can exchange numExchange empty water bottles from the market with one full water bottle.
//
//The operation of drinking a full water bottle turns it into an empty bottle.
//
//Given the two integers numBottles and numExchange, return the maximum number of water bottles you can drink.

public class WaterBottle_1518 {
    public int numWaterBottles(int numBottles, int numExchange){

        int drinkedBottle=numBottles;
        while(numBottles>=numExchange){
            drinkedBottle = drinkedBottle+numBottles/numExchange;
            numBottles=(numBottles / numExchange) + (numBottles % numExchange);
        }
        return drinkedBottle;

    }
    public static void main(String[] args) {
            WaterBottle_1518 w=new WaterBottle_1518();
        System.out.println( "number of water given 15 and exchange value 4   :   " + w.numWaterBottles(15,4));
        System.out.println("number of water given 9 and exchange value 3   :   " + w.numWaterBottles(9,3));

    }
}
