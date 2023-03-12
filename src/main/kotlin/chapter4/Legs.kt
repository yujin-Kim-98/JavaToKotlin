package chapter4

import java.time.Duration
import java.util.*

object Legs {

    fun List<Leg>.longestOver(
        duration: Duration
    ): Leg? {
        val longestLeg = maxByOrNull(Leg::getPlannedDuration)

        return when {
            longestLeg == null -> null
            longestLeg.plannedDuration > duration -> longestLeg
            else -> null
        }
    }

//    fun longestLegOver(
//        legs: List<Leg>,
//        duration: Duration
//    ): Leg? {
//        var result: Leg? = null
//
//        for (leg in legs) {
//            if (isLongerThan(leg, duration)) {
//                if (result == null || isLongerThan(leg, result.plannedDuration))
//                    result = leg
//            }
//        }
//        return result
//    }

    private fun isLongerThan(leg: Leg, duration: Duration) = leg.plannedDuration.compareTo(duration) > 0

//    private fun isLongerThan(
//        leg: Leg,
//        duration: Duration
//    ): Boolean {
//        return leg.plannedDuration.compareTo(duration) > 0
//    }

}