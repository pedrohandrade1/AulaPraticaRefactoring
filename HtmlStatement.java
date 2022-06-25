import java.util.Enumeration;

public class HtmlStatement extends Statement {

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
        String result = "<H1>Rentals for <EM>" + aCustomer.getName() +
          "</EM></H1><P>\n";
        return result;
      }
    
      private String getTitleString(Rental aRental) {
        String result = aRental.getMovie().getTitle()+ ": " +
          String.valueOf(aRental.getCharge()) + "<BR>\n";
    
        return result;
      }
    
      private String getChargeString(Customer aCustomer) {
        String result = "<P>You owe <EM>" +
          String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
        return result;
      }
    
      private String getRenterString(Customer aCustomer) {
        String result = "On this rental you earned <EM>" + 
          String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
          "</EM> frequent renter points<P>";
        return result;
      }
}