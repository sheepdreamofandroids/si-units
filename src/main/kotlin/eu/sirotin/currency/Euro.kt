
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionEuro = UnitSpecification(
    "EUR",
    "`€`"
) { v: Double -> Euro(v) }

/**
* Class for hold of Euro
* @constructor Creates a class for hold of Euro
*/
class Euro(value : Double = 1.0) : TermUnit(value, description = descriptionEuro)
    
    /**
    * Creates object for hold of Euro
    */
    val Number.EUR : Euro
        /**
        * Returns value of object for hold of Euro
        */
        get() = Euro(this.toDouble())

    /**
    * Holder for  of Euro
    */
    val EUR = Euro()

    /**
    * Creates object for hold of Euro
    */
    val Number.`€` : Euro
        /**
        * Returns value of object for hold of Euro
        */
        get() = Euro(this.toDouble())

    /**
    * Holder for  of Euro
    */
    val `€` = Euro()
    