package lab.assignment.beforerefactoring;

public class CapuccinoMaker extends CoffeeMakerTemplate {

    @Override
    private void prepareIngredients(){
        System.out.println("Add hot milk");
        System.out.println("Add cinnamon");
    }
    
    @Override
    private void finalTouch(){
        System.out.println("Top with milk foam");
    }
}