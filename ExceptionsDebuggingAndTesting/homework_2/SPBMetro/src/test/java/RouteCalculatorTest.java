import core.Line;
import core.Station;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class RouteCalculatorTest extends TestCase {
    List<Station> route;
    List<Station> routeOneLine;
    List<Station> routeOneConnection;

    StationIndex stationIndex = new StationIndex();
    RouteCalculator routeCalculator = new RouteCalculator(stationIndex);

    List<Line> lines;
    List<Station> connections1;
    List<Station> connections2;
    List<Station> routeTwoConnections;


    @Override
    protected void setUp() throws Exception {
        route = new ArrayList<>();
        Line line1 = new Line(1, "Первая");
        Line line2 = new Line(2,"Вторая");
        Line line3 = new Line(3,"Третья");

        route.add(new Station("Станция1", line1));
        route.add(new Station("Станция2", line1));
        route.add(new Station("Станция3", line2));
        route.add(new Station("Станция4", line2));
        route.add(new Station("Станция5", line3));
        route.add(new Station("Станция6", line3));

        lines = new ArrayList<>();
        connections1 = new ArrayList<>();
        connections2 = new ArrayList<>();

        lines.add(line1);
        lines.add(line2);
        lines.add(line3);

        Station station1 = new Station("Станция1", line1);
        Station station2 = new Station("Станция2", line1);
        Station station3 = new Station("Станция3", line2);
        Station station4 = new Station("Станция4", line2);
        Station station5 = new Station("Станция5", line3);
        Station station6 = new Station("Станция6", line3);

        line1.addStation(station1);
        line1.addStation(station2);
        line2.addStation(station3);
        line2.addStation(station4);
        line3.addStation(station5);
        line3.addStation(station6);

        stationIndex.addLine(line1);
        stationIndex.addLine(line2);
        stationIndex.addLine(line3);

        stationIndex.addStation(station1);
        stationIndex.addStation(station2);
        stationIndex.addStation(station3);
        stationIndex.addStation(station4);
        stationIndex.addStation(station5);
        stationIndex.addStation(station6);

        connections1.add(station2);
        connections1.add(station3);

        connections2.add(station4);
        connections2.add(station5);

        stationIndex.addConnection(connections1);
        stationIndex.addConnection(connections2);

        routeTwoConnections = new ArrayList<>();
        routeTwoConnections.add(station1);
        routeTwoConnections.add(station2);
        routeTwoConnections.add(station3);
        routeTwoConnections.add(station4);
        routeTwoConnections.add(station5);
        routeTwoConnections.add(station6);

        routeOneLine = new ArrayList<>();
        routeOneLine.add(station1);
        routeOneLine.add(station2);

        routeOneConnection = new ArrayList<>();
        routeOneConnection.add(station1);
        routeOneConnection.add(station2);
        routeOneConnection.add(station3);


        
    }
    
    public void testCalculateDuration() {
        double actual = RouteCalculator.calculateDuration(route);
        double expected = 14.5;
        assertEquals(expected, actual);
    }

    public void testGetRouteOnTheLine() {

        List<Station> actual = routeCalculator.getShortestRoute(stationIndex.getStation("Станция1"), stationIndex.getStation("Станция2"));
        List<Station> expected = routeOneLine;
        assertEquals(expected, actual);

    }

    public void testGetRouteWithOneConnection() {
        List<Station> actual = routeCalculator.getShortestRoute(stationIndex.getStation("Станция1"), stationIndex.getStation("Станция3"));
        List<Station> expected = routeOneConnection;
        assertEquals(expected, actual);

    }

    public void testGetRouteWithTwoConnection() {
        List<Station> actual = routeCalculator.getShortestRoute(stationIndex.getStation("Станция1"), stationIndex.getStation("Станция6"));
        List<Station> expected = routeTwoConnections;
        assertEquals(expected, actual);

    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
