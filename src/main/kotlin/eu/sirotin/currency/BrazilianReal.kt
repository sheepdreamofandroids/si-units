
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionBrazilianReal = UnitSpecification(
    "BRL",
    "`R$`"
) { v: Double -> BrazilianReal(v) }

/**
* Class for hold of Brazilian real
* @constructor Creates a class for hold of Brazilian real
*/
class BrazilianReal(value : Double = 1.0) : TermUnit(value, description = descriptionBrazilianReal)
    
    /**
    * Creates object for hold of Brazilian real
    */
    val Number.BRL : BrazilianReal
        /**
        * Returns value of object for hold of Brazilian real
        */
        get() = BrazilianReal(this.toDouble())

    /**
    * Holder for  of Brazilian real
    */
    val BRL = BrazilianReal()

    /**
    * Creates object for hold of Brazilian real
    */
    val Number.`R$` : BrazilianReal
        /**
        * Returns value of object for hold of Brazilian real
        */
        get() = BrazilianReal(this.toDouble())

    /**
    * Holder for  of Brazilian real
    */
    val `R$` = BrazilianReal()
    