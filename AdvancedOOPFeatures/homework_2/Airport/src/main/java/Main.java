import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

    }

    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {
        long now = System.currentTimeMillis();
        long difference = 7200000;

        return  airport.getTerminals().stream()
                        .flatMap(t -> t.getFlights().stream()
                        .filter((f) -> f.getType() == Flight.Type.DEPARTURE
                                && f.getDate().getTime() - now > 0 && f.getDate().getTime() - now < difference))
                        .collect(Collectors.toList());

    }

}