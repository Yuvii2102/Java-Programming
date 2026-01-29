//You're a scientist at a lab mixing chemicals. We have the formula that we need to cause a chemical reaction:

//reactionResult= A+B/AB

//What is the result of the reaction? Create chemicalA and chemicalB variables, each holding a random amount of grams.

//Calculate and print the result. 

public class Chemical 
{
    public static void main(String[] args) 
  {
        double ChemicalA = 10.6;
        double ChemicalB = 21.2;

        // formula: (A + B) / (A * B)
        double result = (ChemicalA + ChemicalB) / (ChemicalA * ChemicalB);

        System.out.println(result);
    }
}
