package lab.assignment.beforerefactoring;

public class AmericanoMaker extends CoffeeMakerTemplate {

    @Override
    private void prepareIngredients(){
        System.out.println("Add more hot water");
    }

    @Override
    private void finalTouch(){
        System.out.println("Add sugar and cream");
    }
}