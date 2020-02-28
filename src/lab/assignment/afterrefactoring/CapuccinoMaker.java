package lab.assignment.beforerefactoring;

public class CapuccinoMaker extends CoffeeMakerTemplate {

    @Override
    protected void prepareIngredients(){
        System.out.println("Add hot milk");
        System.out.println("Add cinnamon");
    }
    
    @Override
    protected void finalTouch(){
        System.out.println("Top with milk foam");
    }
}