public class taxCA implements Tax{
    @Override
   public double calculateTax(double purchase){
        purchase = purchase + (purchase*0.075);
        return purchase;
   }
}