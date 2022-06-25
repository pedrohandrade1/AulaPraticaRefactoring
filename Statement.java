import java.util.Enumeration;

public abstract class Statement {

    protected abstract String getTitleString(Rental aRental);
    protected abstract String getFirstString(Customer aCustomer);
    protected abstract String getChargeString(Customer aCustomer);
    protected abstract String getRenterString(Customer aCustomer);

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
} 