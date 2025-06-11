
public class Parent extends Person {
    private Parent spouse;
    private Child[] children;

    public Parent(String name, int age){
        super(name, age);
        this.spouse = null;
        this.children = new Child[] {};
    }

    /**
     * @param name the name of the parent
     * @param age the age of the parent
     * @param spouse the spouse of the parent
     */
    public Parent(String name, int age, Parent spouse){
        super(name, age);
        this.spouse = spouse;
        this.children = new Child[] {};
    }

    /**
     * @return the age of the parent
     */
    public int getAge(){
        return this.age;
    }

    /**
     * @return the name of the parent
     */
    public String getName(){
        return this.name;
    }

   
    public void setAge(int newAge){
        this.age = newAge;
    }

    /**
     * @param newName the new name to set
     */
    public void setName(String newName){
        this.name = newName;
    }

    /**
     * @return the spouse of the parent
     */
    public Parent getSpouse(){
        return this.spouse;
    }

    /**
     * @param spouse the spouse to set
     */
    public void setSpouse(Parent spouse){
        this.spouse = spouse;
    }

    /**
     * @return an array of the parents children
     */
    public Child[] getChildren(){
        return this.children;
    }

    /**
     * @param children an array of children to set
     */
    public void setChildren(Child[] children){
        this.children = children;
    }

    /**
     * @param child the child to add
     */
    public void addChild(Child child){
        Child[] x = new Child[this.children.length + 1];
        for(int i = 0; i < this.children.length; i++){
            x[i] = children[i];
        } 
        x[this.children.length] = child;
        this.children = x;
    }
}