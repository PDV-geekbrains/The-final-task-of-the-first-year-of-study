package OOP_Java.App.Core;

public class Dog extends Pet {
    private String trackingDegree;

    /** Constructor. */
    public Dog(
            String name,
            String petOwnerAddress,
            String trackingDegree) {
        super(name, petOwnerAddress);
        super.SetPetKind("Dog");
        this.trackingDegree = trackingDegree;
    }

    /** Get dog tracking degree. */
    public String GetTrackingDegree() {
        return this.trackingDegree;
    }

    /** Set dog tracking degree. */
    public void SetTrackingDegree(String trackingDegree) {
        this.trackingDegree = trackingDegree;
    }
}
