package OOP_Java.App.Core;

public class Hamster extends Pet {
    private int storedFeedAmount;

    /**
     * Constructor.
     * 
     * @param storedFeedAmount Feed in grams a hamster can store.
     */
    public Hamster(
            String name,
            String petOwnerAddress,
            int storedFeedAmount) {
        super(name, petOwnerAddress);
        super.SetPetKind("Hamster");
        this.storedFeedAmount = storedFeedAmount;
    }

    /** Get weight of feed in grams the hamster can store. */
    public int getStoredFeedAmount() {
        return this.storedFeedAmount;
    }

    /** Set weight of feed in grams the hamster can store. */
    public void setStoredFeedAmount(int storedFeedAmount) {
        this.storedFeedAmount = storedFeedAmount;
    }
}
