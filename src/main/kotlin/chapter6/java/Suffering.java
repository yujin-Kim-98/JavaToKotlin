package chapter6.java;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Suffering {

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static <E> List<E> sorted(
            Collection<E> collection,
            Comparator<? super E> by
    ) {
        E[] result = (E[]) collection.toArray();
        Arrays.sort(result, by);
        return Arrays.asList(result);
    }

    public static int sufferScoreFor(List<Journey> route) {
        return sufferScore(
                longestJourneysIn(route, 3),
                getDepartsFrom(route)
        );
    }

    static List<Journey> longestJourneysIn(
            List<Journey> journeys,
            int limit
    ) {
        int actualLimit = Math.min(journeys.size(), limit);
        return sorted(
                journeys,
                Comparator.comparing(Journey::getDuration).reversed()
        ).subList(0, actualLimit);
    }

    public static List<List<Journey>> routesToShowFor(String itineraryId) {
        return bearable(routesFor(itineraryId));
    }

    private static List<List<Journey>> bearable(List<List<Journey>> routes) {
        return routes.stream()
                .filter(route -> sufferScoreFor(route) <= 10)
                .collect(Collectors.toList());
    }

    private static int sufferScore(
            List<Journey> longestJourneys,
            Location start
    ) {
        return SOME_COMPLICATED_RESULT();
    }

    private static Location getDepartsFrom(List<Journey> route) {
        return route.get(0).getDepartsFrom();
    }

    private static List<List<Journey>> routesFor(String itineraryId) {
        return Arrays.asList(
                Arrays.asList(
                        new Journey("journey")
                )
        );
    }

    private static int SOME_COMPLICATED_RESULT() {
        return 0;
    }

}


