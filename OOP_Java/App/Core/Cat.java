package OOP_Java.App.Core;

public class Cat extends Pet {
    private String climbingDegree;

    /** Constructor. */
    public Cat(
            String petKind,
            String name,
            String petOwnerAddress,
            String climbingDegree) {
        super(climbingDegree, climbingDegree, climbingDegree);
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
