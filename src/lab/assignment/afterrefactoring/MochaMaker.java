package lab.assignment.beforerefactoring;

public class MochaMaker extends CoffeeMakerTemplate {

    @Override
    private void prepareIngredients(){
        System.out.println("Adding cocoa powder");
        System.out.println("Adding hot milk");
    }

    @Override
    private void finalTouch(){
        System.out.println("Adding sugar");
    }
}