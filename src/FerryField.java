public class FerryField extends GameField {

    int pos;
    String name;
    int price;
    int rentPrice;  // skal laves en udregning et eller adnet sted?
    int pledgePrice;
    String type = "ferryField";

    public FerryField(int pos, String name, int price, int rentPrice, int pledgePrice) {
        this.pos = pos;
        this.name = name;
        this.price = price;
        this.rentPrice = rentPrice;
        this.pledgePrice = pledgePrice;
    }
}
