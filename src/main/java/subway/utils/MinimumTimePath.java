package subway.utils;

import static subway.domain.enums.StationStatus.GANGNAM;
import static subway.domain.enums.StationStatus.KYODAE;
import static subway.domain.enums.StationStatus.MAEBONG;
import static subway.domain.enums.StationStatus.NAMBU_TERMINAL;
import static subway.domain.enums.StationStatus.YANGJE;
import static subway.domain.enums.StationStatus.YANGJE_FOREST;
import static subway.domain.enums.StationStatus.YEOKSAM;

import java.util.List;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.WeightedMultigraph;

public class MinimumTimePath {
    private final static WeightedMultigraph<String, DefaultWeightedEdge> shortestTimes = new WeightedMultigraph<>(
            DefaultWeightedEdge.class);

    public static void initializePath() {
        if (!shortestTimes.vertexSet().isEmpty()) {
            return;
        }
        addStations();
        addDistances();

//        double edgeWeight = shortestTimes.getEdgeWeight(shortestTimes.getEdge(KYODAE.getName(), GANGNAM.getName()));
//        System.out.println(edgeWeight);
    }

    private static void addDistances() {
        shortestTimes.setEdgeWeight(shortestTimes.addEdge(KYODAE.getName(), GANGNAM.getName()), 3);
        shortestTimes.setEdgeWeight(shortestTimes.addEdge(GANGNAM.getName(), YEOKSAM.getName()), 3);
        shortestTimes.setEdgeWeight(shortestTimes.addEdge(KYODAE.getName(), NAMBU_TERMINAL.getName()), 2);
        shortestTimes.setEdgeWeight(shortestTimes.addEdge(NAMBU_TERMINAL.getName(), YANGJE.getName()), 5);
        shortestTimes.setEdgeWeight(shortestTimes.addEdge(YANGJE.getName(), MAEBONG.getName()), 1);
        shortestTimes.setEdgeWeight(shortestTimes.addEdge(GANGNAM.getName(), YANGJE.getName()), 8);
        shortestTimes.setEdgeWeight(shortestTimes.addEdge(YANGJE.getName(), YANGJE_FOREST.getName()), 3);
    }

    private static void addStations() {
        shortestTimes.addVertex(KYODAE.getName());
        shortestTimes.addVertex(GANGNAM.getName());
        shortestTimes.addVertex(YEOKSAM.getName());
        shortestTimes.addVertex(NAMBU_TERMINAL.getName());
        shortestTimes.addVertex(YANGJE.getName());
        shortestTimes.addVertex(MAEBONG.getName());
        shortestTimes.addVertex(YANGJE_FOREST.getName());
    }

    public static int calculateTimeByEdges(final List<String> vertexes) {
        int timeSum = 0;
        for (int index = 0; index < vertexes.size() - 1; index++) {
            timeSum += shortestTimes.getEdgeWeight(shortestTimes.getEdge(vertexes.get(index), vertexes.get(index + 1)));
        }
        return timeSum;
    }
}
