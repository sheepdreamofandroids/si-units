
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import eu.sirotin.kotunil.specialunits.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val formula =  (kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2)

@JsExport
/**
* System International Unit for capacitance.
*/
class Farad(value: Number): DerivedUnit(value, formula)

/**
* System International Unit for capacitance.
*/
@JsExport
@JvmField
val F = formula

/**
* Creates Farad-Object for current number value. Farad is a System International Unit for capacitance.
*/
val Number.F : Expression
   /**
   * Returns Farad-Object for current number value. Farad is a System International Unit for capacitance.
   */
    get() = this.toDouble() * formula

    
/**
* QF, 10^30 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.QF : Expression
    @JvmName("getQF_prop")
    /**
    * Returns QF, 10^30 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(30) * formula

/**
* quettafarad, 10^30 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.quettafarad : Expression
    /**
    * Returns quettafarad, 10^30 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(30) * formula

@JsExport
@JvmField
/**
* QF, 10^30 of farad, derived SI-Unit for measurement of capacitance
*/        
val QF = 10.0.pow(30) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* quettafarad, 10^30 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val quettafarad = QF
    

/**
* RF, 10^27 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.RF : Expression
    @JvmName("getRF_prop")
    /**
    * Returns RF, 10^27 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(27) * formula

/**
* ronnafarad, 10^27 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.ronnafarad : Expression
    /**
    * Returns ronnafarad, 10^27 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(27) * formula

@JsExport
@JvmField
/**
* RF, 10^27 of farad, derived SI-Unit for measurement of capacitance
*/        
val RF = 10.0.pow(27) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* ronnafarad, 10^27 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val ronnafarad = RF
    

/**
* YF, 10^24 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.YF : Expression
    @JvmName("getYF_prop")
    /**
    * Returns YF, 10^24 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(24) * formula

/**
* yottafarad, 10^24 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.yottafarad : Expression
    /**
    * Returns yottafarad, 10^24 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(24) * formula

@JsExport
@JvmField
/**
* YF, 10^24 of farad, derived SI-Unit for measurement of capacitance
*/        
val YF = 10.0.pow(24) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* yottafarad, 10^24 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val yottafarad = YF
    

/**
* ZF, 10^21 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.ZF : Expression
    @JvmName("getZF_prop")
    /**
    * Returns ZF, 10^21 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(21) * formula

/**
* zettafarad, 10^21 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.zettafarad : Expression
    /**
    * Returns zettafarad, 10^21 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(21) * formula

@JsExport
@JvmField
/**
* ZF, 10^21 of farad, derived SI-Unit for measurement of capacitance
*/        
val ZF = 10.0.pow(21) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* zettafarad, 10^21 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val zettafarad = ZF
    

/**
* EF, 10^18 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.EF : Expression
    @JvmName("getEF_prop")
    /**
    * Returns EF, 10^18 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(18) * formula

/**
* exafarad, 10^18 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.exafarad : Expression
    /**
    * Returns exafarad, 10^18 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(18) * formula

@JsExport
@JvmField
/**
* EF, 10^18 of farad, derived SI-Unit for measurement of capacitance
*/        
val EF = 10.0.pow(18) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* exafarad, 10^18 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val exafarad = EF
    

/**
* PF, 10^15 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.PF : Expression
    @JvmName("getPF_prop")
    /**
    * Returns PF, 10^15 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(15) * formula

/**
* petafarad, 10^15 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.petafarad : Expression
    /**
    * Returns petafarad, 10^15 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(15) * formula

@JsExport
@JvmField
/**
* PF, 10^15 of farad, derived SI-Unit for measurement of capacitance
*/        
val PF = 10.0.pow(15) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* petafarad, 10^15 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val petafarad = PF
    

/**
* TF, 10^12 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.TF : Expression
    @JvmName("getTF_prop")
    /**
    * Returns TF, 10^12 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(12) * formula

/**
* terafarad, 10^12 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.terafarad : Expression
    /**
    * Returns terafarad, 10^12 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(12) * formula

@JsExport
@JvmField
/**
* TF, 10^12 of farad, derived SI-Unit for measurement of capacitance
*/        
val TF = 10.0.pow(12) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* terafarad, 10^12 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val terafarad = TF
    

/**
* GF, 10^9 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.GF : Expression
    @JvmName("getGF_prop")
    /**
    * Returns GF, 10^9 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(9) * formula

/**
* gigafarad, 10^9 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.gigafarad : Expression
    /**
    * Returns gigafarad, 10^9 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(9) * formula

@JsExport
@JvmField
/**
* GF, 10^9 of farad, derived SI-Unit for measurement of capacitance
*/        
val GF = 10.0.pow(9) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* gigafarad, 10^9 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val gigafarad = GF
    

/**
* MF, 10^6 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.MF : Expression
    @JvmName("getMF_prop")
    /**
    * Returns MF, 10^6 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(6) * formula

/**
* megafarad, 10^6 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.megafarad : Expression
    /**
    * Returns megafarad, 10^6 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(6) * formula

@JsExport
@JvmField
/**
* MF, 10^6 of farad, derived SI-Unit for measurement of capacitance
*/        
val MF = 10.0.pow(6) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* megafarad, 10^6 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val megafarad = MF
    

/**
* kF, 10^3 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.kF : Expression
    @JvmName("getkF_prop")
    /**
    * Returns kF, 10^3 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(3) * formula

/**
* kilofarad, 10^3 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.kilofarad : Expression
    /**
    * Returns kilofarad, 10^3 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(3) * formula

@JsExport
@JvmField
/**
* kF, 10^3 of farad, derived SI-Unit for measurement of capacitance
*/        
val kF = 10.0.pow(3) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* kilofarad, 10^3 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val kilofarad = kF
    

/**
* hF, 10^2 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.hF : Expression
    @JvmName("gethF_prop")
    /**
    * Returns hF, 10^2 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(2) * formula

/**
* hectofarad, 10^2 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.hectofarad : Expression
    /**
    * Returns hectofarad, 10^2 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(2) * formula

@JsExport
@JvmField
/**
* hF, 10^2 of farad, derived SI-Unit for measurement of capacitance
*/        
val hF = 10.0.pow(2) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* hectofarad, 10^2 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val hectofarad = hF
    

/**
* daF, 10^1 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.daF : Expression
    @JvmName("getdaF_prop")
    /**
    * Returns daF, 10^1 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(1) * formula

/**
* decafarad, 10^1 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.decafarad : Expression
    /**
    * Returns decafarad, 10^1 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(1) * formula

@JsExport
@JvmField
/**
* daF, 10^1 of farad, derived SI-Unit for measurement of capacitance
*/        
val daF = 10.0.pow(1) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* decafarad, 10^1 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val decafarad = daF
    

/**
* dF, 10^-1 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.dF : Expression
    @JvmName("getdF_prop")
    /**
    * Returns dF, 10^-1 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(-1) * formula

/**
* decifarad, 10^-1 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.decifarad : Expression
    /**
    * Returns decifarad, 10^-1 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(-1) * formula

@JsExport
@JvmField
/**
* dF, 10^-1 of farad, derived SI-Unit for measurement of capacitance
*/        
val dF = 10.0.pow(-1) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* decifarad, 10^-1 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val decifarad = dF
    

/**
* cF, 10^-2 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.cF : Expression
    @JvmName("getcF_prop")
    /**
    * Returns cF, 10^-2 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(-2) * formula

/**
* centifarad, 10^-2 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.centifarad : Expression
    /**
    * Returns centifarad, 10^-2 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(-2) * formula

@JsExport
@JvmField
/**
* cF, 10^-2 of farad, derived SI-Unit for measurement of capacitance
*/        
val cF = 10.0.pow(-2) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* centifarad, 10^-2 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val centifarad = cF
    

/**
* mF, 10^-3 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.mF : Expression
    @JvmName("getmF_prop")
    /**
    * Returns mF, 10^-3 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(-3) * formula

/**
* millifarad, 10^-3 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.millifarad : Expression
    /**
    * Returns millifarad, 10^-3 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(-3) * formula


@JvmField
/**
* mF, 10^-3 of farad, derived SI-Unit for measurement of capacitance
*/        
val mF = 10.0.pow(-3) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* millifarad, 10^-3 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val millifarad = mF
    

/**
* μF, 10^-6 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.μF : Expression
    @JvmName("getμF_prop")
    /**
    * Returns μF, 10^-6 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(-6) * formula

/**
* microfarad, 10^-6 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.microfarad : Expression
    /**
    * Returns microfarad, 10^-6 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(-6) * formula

@JsExport
@JvmField
/**
* μF, 10^-6 of farad, derived SI-Unit for measurement of capacitance
*/        
val μF = 10.0.pow(-6) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* microfarad, 10^-6 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val microfarad = μF
    

/**
* nF, 10^-9 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.nF : Expression
    @JvmName("getnF_prop")
    /**
    * Returns nF, 10^-9 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(-9) * formula

/**
* nanofarad, 10^-9 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.nanofarad : Expression
    /**
    * Returns nanofarad, 10^-9 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(-9) * formula

@JsExport
@JvmField
/**
* nF, 10^-9 of farad, derived SI-Unit for measurement of capacitance
*/        
val nF = 10.0.pow(-9) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* nanofarad, 10^-9 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val nanofarad = nF
    

/**
* pF, 10^-12 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.pF : Expression
    @JvmName("getpF_prop")
    /**
    * Returns pF, 10^-12 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(-12) * formula

/**
* picofarad, 10^-12 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.picofarad : Expression
    /**
    * Returns picofarad, 10^-12 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(-12) * formula


@JvmField
/**
* pF, 10^-12 of farad, derived SI-Unit for measurement of capacitance
*/        
val pF = 10.0.pow(-12) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* picofarad, 10^-12 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val picofarad = pF
    

/**
* fF, 10^-15 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.fF : Expression
    @JvmName("getfF_prop")
    /**
    * Returns fF, 10^-15 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(-15) * formula

/**
* femtofarad, 10^-15 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.femtofarad : Expression
    /**
    * Returns femtofarad, 10^-15 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(-15) * formula

@JsExport
@JvmField
/**
* fF, 10^-15 of farad, derived SI-Unit for measurement of capacitance
*/        
val fF = 10.0.pow(-15) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* femtofarad, 10^-15 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val femtofarad = fF
    

/**
* aF, 10^-18 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.aF : Expression
    @JvmName("getaF_prop")
    /**
    * Returns aF, 10^-18 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(-18) * formula

/**
* attofarad, 10^-18 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.attofarad : Expression
    /**
    * Returns attofarad, 10^-18 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(-18) * formula

@JsExport
@JvmField
/**
* aF, 10^-18 of farad, derived SI-Unit for measurement of capacitance
*/        
val aF = 10.0.pow(-18) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* attofarad, 10^-18 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val attofarad = aF
    

/**
* zF, 10^-21 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.zF : Expression
    @JvmName("getzF_prop")
    /**
    * Returns zF, 10^-21 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(-21) * formula

/**
* zeptofarad, 10^-21 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.zeptofarad : Expression
    /**
    * Returns zeptofarad, 10^-21 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(-21) * formula


@JvmField
/**
* zF, 10^-21 of farad, derived SI-Unit for measurement of capacitance
*/        
val zF = 10.0.pow(-21) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* zeptofarad, 10^-21 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val zeptofarad = zF
    

/**
* yF, 10^-24 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.yF : Expression
    @JvmName("getyF_prop")
    /**
    * Returns yF, 10^-24 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(-24) * formula

/**
* yoctofarad, 10^-24 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.yoctofarad : Expression
    /**
    * Returns yoctofarad, 10^-24 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(-24) * formula


@JvmField
/**
* yF, 10^-24 of farad, derived SI-Unit for measurement of capacitance
*/        
val yF = 10.0.pow(-24) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* yoctofarad, 10^-24 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val yoctofarad = yF
    

/**
* rF, 10^-27 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.rF : Expression
    @JvmName("getrF_prop")
    /**
    * Returns rF, 10^-27 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(-27) * formula

/**
* rontofarad, 10^-27 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.rontofarad : Expression
    /**
    * Returns rontofarad, 10^-27 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(-27) * formula


@JvmField
/**
* rF, 10^-27 of farad, derived SI-Unit for measurement of capacitance
*/        
val rF = 10.0.pow(-27) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* rontofarad, 10^-27 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val rontofarad = rF
    

/**
* qF, 10^-30 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.qF : Expression
    @JvmName("getqF_prop")
    /**
    * Returns qF, 10^-30 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(-30) * formula

/**
* quectofarad, 10^-30 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.quectofarad : Expression
    /**
    * Returns quectofarad, 10^-30 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = this.toDouble() * 10.0.pow(-30) * formula


@JvmField
/**
* qF, 10^-30 of farad, derived SI-Unit for measurement of capacitance
*/        
val qF = 10.0.pow(-30) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* quectofarad, 10^-30 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val quectofarad = qF
    