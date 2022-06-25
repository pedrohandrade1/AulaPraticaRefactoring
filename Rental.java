public class Rental {

   private Movie _movie;
   private int _daysRented;

   public Rental(Movie movie, int daysRented) {
      _movie = movie;
      _daysRented = daysRented;
   }

   public int getDaysRented() {
      return _daysRented;
   }

   public Movie getMovie() {
      return _movie;
   }

   public double getCharge() {
      //Adicionar o trecho de código extraído.
      //determine amounts for each line

      return _movie.getCharge(_daysRented);
   }
   public int getFrequentRenterPoints() { 
      //Adicionar o trecho de código extraído.
      // add frequent renter points
      // add bonus for a two day new release rental
      return _movie.getFrequentRenterPoints(_daysRented);
   }
}