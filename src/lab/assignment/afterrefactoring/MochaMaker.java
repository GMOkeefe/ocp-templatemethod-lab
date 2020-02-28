package lab.assignment.beforerefactoring;

public class MochaMaker extends CoffeeMakerTemplate {

    @Override
    protected void prepareIngredients(){
        System.out.println("Adding cocoa powder");
        System.out.println("Adding hot milk");
    }

    @Override
    protected void finalTouch(){
        System.out.println("Adding sugar");
    }
}