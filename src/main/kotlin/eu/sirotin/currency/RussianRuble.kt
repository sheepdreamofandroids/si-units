
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionRussianRuble = UnitSpecification(
    "RUB",
    "`₽`"
) { v: Double -> RussianRuble(v) }

/**
* Class for hold of Russian ruble
* @constructor Creates a class for hold of Russian ruble
*/
class RussianRuble(value : Double = 1.0) : TermUnit(value, description = descriptionRussianRuble)
    
    /**
    * Creates object for hold of Russian ruble
    */
    val Number.RUB : RussianRuble
        /**
        * Returns value of object for hold of Russian ruble
        */
        get() = RussianRuble(this.toDouble())

    /**
    * Holder for  of Russian ruble
    */
    val RUB = RussianRuble()

    /**
    * Creates object for hold of Russian ruble
    */
    val Number.`₽` : RussianRuble
        /**
        * Returns value of object for hold of Russian ruble
        */
        get() = RussianRuble(this.toDouble())

    /**
    * Holder for  of Russian ruble
    */
    val `₽` = RussianRuble()
    