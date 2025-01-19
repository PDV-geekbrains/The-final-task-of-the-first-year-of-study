package OOP_Java.App.Core;

public class Cat extends Pet {
    private String climbingDegree;

    /** Constructor. */
    public Cat(
            String name,
            String petOwnerAddress,
            String climbingDegree) {
        super(name, petOwnerAddress);
        super.SetPetKind("Cat");
        this.climbingDegree = climbingDegree;
    }

    /** Get the cat climbing degree. */
    public String GetClimbingDegree() {
        return this.climbingDegree;
    }

    /** Set the cat climbing degree. */
    public void SetClimbingDegree(String climbingDegree) {
        this.climbingDegree = climbingDegree;
    }
}
