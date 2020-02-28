package lab.assignment.beforerefactoring;

public class AmericanoMaker extends CoffeeMakerTemplate {

    @Override
    protected void prepareIngredients(){
        System.out.println("Add more hot water");
    }

    @Override
    protected void finalTouch(){
        System.out.println("Add sugar and cream");
    }
}