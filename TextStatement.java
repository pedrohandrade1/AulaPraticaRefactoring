import java.util.Enumeration;

public class TextStatement extends Statement {
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = getFirstString(aCustomer);

        while (rentals.hasMoreElements()) {
          Rental each = (Rental) rentals.nextElement();
          result += getTitleString(each);
        }
    
        result += getChargeString(aCustomer);
        result += getRenterString(aCustomer);
        return result;
     }

     private String getFirstString(Customer aCustomer) {
        String result = "Rental Record for " + aCustomer.getName() +
        "\n";
    
        return result;
      }
    
      private String getTitleString(Rental aRental) {
        String result = "\t" + aRental.getMovie().getTitle()+ "\t" +
            String.valueOf(aRental.getCharge()) + "\n";
    
        return result;
      }

      private String getChargeString(Customer aCustomer) {
        String result = "Amount owed is " +
          String.valueOf(aCustomer.getTotalCharge()) + "\n";
        return result;
      }

      private String getRenterString(Customer aCustomer) {
        String result = "You earned " +
          String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
          " frequent renter points";
        return result;
      }
}
