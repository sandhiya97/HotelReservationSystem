package HotelReservationSystem;

/**
 * Class with main method
 *
 * @author SANDHIYA
 *
 */

public class Main {

    public static void main(String[] args) {
        /*
        HotelReservation object is created
         */
        HotelReservation hotelReservation = new HotelReservation();

        /*
        New Hotel can be added to hotelList
        by calling addNewHotel in HotelReservation class
         */
        hotelReservation.addNewHotel();

    }
}