
import java.util.Arrays; 


public class Child extends Person {
    private Parent parent1;
    private Parent parent2;
    private Child[] siblings = new Child[0];

    public Child(String name, int age, Parent par1, Parent par2) {
        super(name, age);
		this.parent1 = par1;
        this.parent2 = par2;
    }

    
    
    
//* @return parent of the child */
    public Parent getParent2() {
        return this.parent2;
    }

    public Parent getParent1() {
        return this.parent1;
    }


    public Child[] getSiblings() {
        return this.siblings;
    }

    public void setSiblings(Child[] siblings) {
        this.siblings = siblings;
    }


    public void addSibling(Child child) {
        Child[] newSiblings = Arrays.copyOf(this.siblings, this.siblings.length + 1);
		newSiblings[newSiblings.length -1] = child;
		this.siblings = newSiblings;
    }
}

