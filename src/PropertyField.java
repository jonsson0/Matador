public class PropertyField extends GameField {

    private int rentPrice;
    private int houses = 0;
    private int pledgePrice;
    private int housePrice;
    //private Player ownedBy = null;

    ScanThings scanThings = new ScanThings();

    // Constructor
    public PropertyField(int pos, String name, int price, int rentPrice, int pledgePrice, int housePrice, PropertyColor propertyColor) {
        setPos(pos);
        setName(name);
        setGameFieldType(GameFieldType.PROPERTYFIELD);
        this.setPrice(price);
        this.rentPrice = rentPrice;
        this.pledgePrice = pledgePrice;
        this.housePrice = housePrice;
        this.setPropertyColor(propertyColor);
    }

    public PropertyField landedOn(Player player, Logic logic) {
        System.out.println("Dette er en husgrund.");
        if (getOwnedBy() != null) {
            player.payRent(rentPrice, getOwnedBy());
            System.out.println("De betalte " + rentPrice + " til " + getOwnedBy());
        } else if (getOwnedBy() == null) {
            System.out.println("Denne grund er ikke købt. Den koster " + getPrice() + " kr.");
            System.out.println("Ønsker de at købe grunden? - Tast 1 eller 2 og tryk ENTER!");
            System.out.println("1. Ja");
            System.out.println("2. Nej");

            int answer = scanThings.scanNumber();
            if (answer == 1) {
                System.out.println("Deres valuta er " + player.getMoney());
                if (player.getMoney() > getPrice()) {
                    player.buyField(this);
                    setOwnedBy(player);
                    System.out.println("Denne grund er nu ejet af: " + getOwnedBy());

                    // har tilføjet denne linje
                    player.updateTotalValue();

                    System.out.println("Deres samlede værdier af valuta og grunde er " + player.getTotalValue());
                    System.out.println("Deres valuta er " + player.getMoney());
                } else if (player.getMoney() < getPrice()) {
                    System.out.println("De har ikke nok valuta til at købe denne grund.");

                }
            } else if (answer == 2) {
                System.out.println("Ok De ønsker ikke at købe denne grund.");
            }
        }
        return this;
    }

    /**
     * Getters and setters
     */

    public int getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(int rentPrice) {
        this.rentPrice = rentPrice;
    }

    public int getPledgePrice() {
        return pledgePrice;
    }

    public void setPledgePrice(int pledgePrice) {
        this.pledgePrice = pledgePrice;
    }

    public int getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(int housePrice) {
        this.housePrice = housePrice;
    }

    public int getHouses() {
        return houses;
    }

    public void setHouses(int houses) {
        this.houses = houses;
    }
}