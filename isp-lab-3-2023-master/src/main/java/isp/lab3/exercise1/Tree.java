package isp.lab3.exercise1;

public class Tree {
    //attributes
    int height;
    String name;

    //constructors
    public Tree(){
        this.height = 15;
    }
    public Tree(int height){
        this.height = height;
    }

    //methods
    public int grow(int meters){
        if (meters >= 1) {
            this.height = this.height + meters;
        }
        return this.height;
    }

    public String toString(){
        return "this is a tree with height" + " " + this.height;
    }

    //main method
    public static void main(String[] args){
        Tree t;
        t = new Tree();

        Tree t2 = new Tree(25);
        t2.grow(10);
        System.out.println(t2.toString());
    }
}
