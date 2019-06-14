//cse002
//xid220
//xinyi Deng
//2019-1-31
public class OrderPizza
{
  //main method required for every java program
  public static void main(String[]args)
  {
    int numberOfFriends = 7;//number of friends
    int numberOfSlicesPerPerson = 3; // each person will have 4 slices
    int numberofSlicesPerPiazza = 8;// each pie contains 8 slices
    double costOfEachPiazza = 15.99; // assume this includes tax
    int totalNumberOfPersons = numberOfFriends + 1; //calculate total number of friends
    int totalNumberOfSlices = totalNumberOfPersons *  numberOfSlicesPerPerson; //calculate total slices
    int totalNumberOfPizzas = totalNumberOfSlices / numberofSlicesPerPiazza;
    double totalCostOfPizzas = costOfEachPiazza * totalNumberOfPizzas; //calculate total costs
    System.out.println(" Total number of persons : "+  totalNumberOfPersons); //print out total number of persons
    System.out.println(" Total number of slices : "+  totalNumberOfSlices); //print total number of slices
    System.out.println(" Total number of Pizzas : "+  totalNumberOfPizzas); //print total number of pizzas
    System.out.println(" Total cost of Pizzas : "+ totalCostOfPizzas); //print total cost of pizzas
    System.out.println(" I will need to order " +totalNumberOfPizzas + " and the total cost is "  + totalCostOfPizzas);
    
  }
}