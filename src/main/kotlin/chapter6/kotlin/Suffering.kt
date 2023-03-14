package chapter6.kotlin

import java.util.*

object Suffering {

    @JvmStatic
    fun sufferScoreFor(route: List<Journey>): Int =
        sufferScore(
            route.longestJourneysIn(3),
            route.getDepartsFrom(route)
        )

    @JvmStatic
    fun List<Journey>.longestJourneysIn(limit: Int): List<Journey> =
        sortedByDescending { it.duration }.take(limit)

    @JvmStatic
    fun List<Journey>.getDepartsFrom(route: List<Journey>): Location =
        Location("location")

    fun routesToShowFor(itineraryId: String): List<List<Journey>> =
        bearable(routesFor(itineraryId))

    private fun bearable(routes: List<List<Journey>>): List<List<Journey>> =
        routes.filter { sufferScoreFor(it) <= 10 }

    fun routesFor(itineraryId: String): List<List<Journey>> =
        Arrays.asList(
            Arrays.asList(
                Journey(
                    name = "name",
                    duration = 0
                )
            )
        )

    private fun sufferScore(
        longestJourneys: List<Journey>,
        start: Location
    ): Int = SOME_COMPLICATED_RESULT()

    private fun SOME_COMPLICATED_RESULT(): Int = 0

}