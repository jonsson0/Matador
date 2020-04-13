public abstract class GameField  {
    private String fieldName;
    private String type;
    private int pos;
    private CardOfChance cardOfChance; // for mange navne til 'prøv lykken' feltet og kortet. Svært at holde styr på hvad er hvad.
    private TryYourLuck cardsOfChanceDeck;
    private GameFieldType gameFieldType;
    private FerryField ferryField;
    private BreweryField breweryField;
    private boolean isBuyable;

    /**
     * Getters and setters
     */

    public String getFieldName() {
        return fieldName;
    }


    public int getPos(){
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public String getType(){

            return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    // types of gameFields

    /**
     * Prisen for at lande på rederierne fordobles for antal rederier der ejes. Dette er ikke lavet og mangler
     */

    // compare fieldname, if fieldname matches create ferryField
    FerryField getNewFerryField(String fieldName) {
        switch (fieldName) {
            case "SFL-Færgene":
                return new FerryField("SFL-Færgene", 4000, 500, 2000);
            case "DSB-Rederierne: Kalundborg-Århus":
                return new FerryField("DSB-Rederierne: Kalundborg-Århus", 4000, 500, 2000);
            case "DFDS-Seaways":
                return new FerryField("DFDS-Seaways", 4000, 500, 2000);
            case "DSB-Rederierne: Halsskov-Knudshoved":
                return new FerryField("DSB-Rederierne: Halsskov-Knudshoved", 4000, 500, 2000);
        }
        return null;
    }


    /**
     * priceToRent for at lande på brewery er terningernes øjne gange 100,
     * hvis begge tapperier ejes er det 200. Dette er ikke lavet og mangler
     */

    // compare fieldname, if fieldname matches create breweryField
    BreweryField getNewBreweryField(String fieldName) {
        switch (fieldName) {
            case "Tuborg Bryggeri":
                return new BreweryField(1,"Tuborg Bryggeri", 3000, 500, 1500);
            case "Coca-Cola Tapperi":
                return new BreweryField(1,"Coca-Cola Tapperi", 3000, 500, 1500);
        }
        return null;
    }


    // compare fieldname, if fieldname matches create houseplot
    HousePlot getNewHousePlot(String fieldName) {
        switch (fieldName) {
            case "Roedovrevej":
                return new HousePlot("Rødovrevej", HousePlot.HousePlotType.BLUE, 1200, 50, 1000, 600);
            case "Hvidovrevej":
                return new HousePlot("Hvidovrevej", HousePlot.HousePlotType.BLUE, 1200, 50, 1000, 600);
            case "Roskildevej":
                return new HousePlot("Roskildevej", HousePlot.HousePlotType.PINK, 2000, 100, 1000, 1000);
            case "ValbyLanggade":
                return new HousePlot("Valby Langgade", HousePlot.HousePlotType.PINK, 2000, 100, 1000, 1000);
            case "Allegade":
                return new HousePlot("Allégade", HousePlot.HousePlotType.PINK, 2400, 150, 1000, 1200);
            case "FrederiksbergAlle":
                return new HousePlot("Frederiksberg Alle", HousePlot.HousePlotType.GREEN, 2800, 200, 2000, 1400);
            case "Bulowsvej":
                return new HousePlot("Bülowsvej", HousePlot.HousePlotType.GREEN, 2800, 200, 2000, 1400);
            case "GammelKongevej":
                return new HousePlot("Gammel Kongevej", HousePlot.HousePlotType.GREEN, 3200, 250, 2000, 1500);
            case "Bernstorffsvej":
                return new HousePlot("Bernstorffsvej", HousePlot.HousePlotType.GREY, 3600, 300, 2000, 1800);
            case "Hellerupvej":
                return new HousePlot("Hellerupvej", HousePlot.HousePlotType.GREY, 3600, 300, 2000, 1800);
            case "Strandvej":
                return new HousePlot("Strandvej", HousePlot.HousePlotType.GREY, 4000, 350, 2000, 2000);
            case "Trianglen":
                return new HousePlot("Trianglen", HousePlot.HousePlotType.RED, 4400, 350, 3000, 2200);
            case "Oesterbrogade":
                return new HousePlot("Østerbrogade", HousePlot.HousePlotType.RED, 4400, 350, 3000, 2200);
            case "Groenningen":
                return new HousePlot("Grønningen", HousePlot.HousePlotType.RED, 4800, 400, 3000, 2400);
            case "Bredgade":
                return new HousePlot("Bredgade", HousePlot.HousePlotType.WHITE, 5200, 450, 3000, 2600);
            case "KongensNytorv":
                return new HousePlot("Kongens Nytorv", HousePlot.HousePlotType.WHITE, 5200, 450, 3000, 2600);
            case "Oestergade":
                return new HousePlot("Østergade", HousePlot.HousePlotType.WHITE, 5600, 500, 3000, 2800);
            case "Amagertorv":
                return new HousePlot("Amagertorv", HousePlot.HousePlotType.YELLOW, 6000, 550, 4000, 3000);
            case "Vimmelskaftet":
                return new HousePlot("Vimmelskaftet", HousePlot.HousePlotType.YELLOW, 6000, 550, 4000, 3000);
            case "Nygade":
                return new HousePlot("Nygade", HousePlot.HousePlotType.YELLOW, 6400, 600, 4000, 3200);
            case "Frederiksberggade":
                return new HousePlot("Frederiksberggade", HousePlot.HousePlotType.PURPLE, 7000, 700, 4000, 3500);
            case "Raadhuspladsen":
                return new HousePlot("Rådhuspladsen", HousePlot.HousePlotType.PURPLE, 8000, 1000, 4000, 4000);

        }
        return null;
    }

    // check if deck exists, if not create !!!!!!!!! NEEDS TO BE CHANGED TO FACTORY plan/method something cant remember name
    TryYourLuck createCardsOfChanceIfNullElseReturnIt() {
        if (cardsOfChanceDeck == null) {
            cardsOfChanceDeck = new TryYourLuck();
        }
        return cardsOfChanceDeck;
    }

    // toString when printing a field you print the name of the field // idk if we need to chance it maybe not
    @Override
    public String toString() {
        return getFieldName();
    }
}