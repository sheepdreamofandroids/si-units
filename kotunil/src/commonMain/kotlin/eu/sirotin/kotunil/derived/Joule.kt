
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import eu.sirotin.kotunil.specialunits.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val formula =  kg*(m2)/(s `^` 2)

@JsExport
/**
* System International Unit for energy, work, heat.
*/
class Joule(value: Number): DerivedUnit(value, formula)

/**
* System International Unit for energy, work, heat.
*/
@JsExport
@JvmField
val J = formula

/**
* Creates Joule-Object for current number value. Joule is a System International Unit for energy, work, heat.
*/
val Number.J : Expression
   /**
   * Returns Joule-Object for current number value. Joule is a System International Unit for energy, work, heat.
   */
    get() = this.toDouble() * formula

    
/**
* QJ, 10^30 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.QJ : Expression
    @JvmName("getQJ_prop")
    /**
    * Returns QJ, 10^30 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(30) * formula

/**
* quettajoule, 10^30 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.quettajoule : Expression
    /**
    * Returns quettajoule, 10^30 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(30) * formula

@JsExport
@JvmField
/**
* QJ, 10^30 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val QJ = 10.0.pow(30) * (kg*(m2)/(s `^` 2))

/**
* quettajoule, 10^30 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val quettajoule = QJ
    

/**
* RJ, 10^27 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.RJ : Expression
    @JvmName("getRJ_prop")
    /**
    * Returns RJ, 10^27 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(27) * formula

/**
* ronnajoule, 10^27 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.ronnajoule : Expression
    /**
    * Returns ronnajoule, 10^27 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(27) * formula

@JsExport
@JvmField
/**
* RJ, 10^27 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val RJ = 10.0.pow(27) * (kg*(m2)/(s `^` 2))

/**
* ronnajoule, 10^27 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val ronnajoule = RJ
    

/**
* YJ, 10^24 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.YJ : Expression
    @JvmName("getYJ_prop")
    /**
    * Returns YJ, 10^24 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(24) * formula

/**
* yottajoule, 10^24 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.yottajoule : Expression
    /**
    * Returns yottajoule, 10^24 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(24) * formula

@JsExport
@JvmField
/**
* YJ, 10^24 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val YJ = 10.0.pow(24) * (kg*(m2)/(s `^` 2))

/**
* yottajoule, 10^24 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val yottajoule = YJ
    

/**
* ZJ, 10^21 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.ZJ : Expression
    @JvmName("getZJ_prop")
    /**
    * Returns ZJ, 10^21 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(21) * formula

/**
* zettajoule, 10^21 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.zettajoule : Expression
    /**
    * Returns zettajoule, 10^21 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(21) * formula

@JsExport
@JvmField
/**
* ZJ, 10^21 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val ZJ = 10.0.pow(21) * (kg*(m2)/(s `^` 2))

/**
* zettajoule, 10^21 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val zettajoule = ZJ
    

/**
* EJ, 10^18 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.EJ : Expression
    @JvmName("getEJ_prop")
    /**
    * Returns EJ, 10^18 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(18) * formula

/**
* exajoule, 10^18 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.exajoule : Expression
    /**
    * Returns exajoule, 10^18 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(18) * formula

@JsExport
@JvmField
/**
* EJ, 10^18 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val EJ = 10.0.pow(18) * (kg*(m2)/(s `^` 2))

/**
* exajoule, 10^18 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val exajoule = EJ
    

/**
* PJ, 10^15 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.PJ : Expression
    @JvmName("getPJ_prop")
    /**
    * Returns PJ, 10^15 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(15) * formula

/**
* petajoule, 10^15 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.petajoule : Expression
    /**
    * Returns petajoule, 10^15 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(15) * formula

@JsExport
@JvmField
/**
* PJ, 10^15 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val PJ = 10.0.pow(15) * (kg*(m2)/(s `^` 2))

/**
* petajoule, 10^15 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val petajoule = PJ
    

/**
* TJ, 10^12 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.TJ : Expression
    @JvmName("getTJ_prop")
    /**
    * Returns TJ, 10^12 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(12) * formula

/**
* terajoule, 10^12 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.terajoule : Expression
    /**
    * Returns terajoule, 10^12 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(12) * formula

@JsExport
@JvmField
/**
* TJ, 10^12 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val TJ = 10.0.pow(12) * (kg*(m2)/(s `^` 2))

/**
* terajoule, 10^12 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val terajoule = TJ
    

/**
* GJ, 10^9 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.GJ : Expression
    @JvmName("getGJ_prop")
    /**
    * Returns GJ, 10^9 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(9) * formula

/**
* gigajoule, 10^9 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.gigajoule : Expression
    /**
    * Returns gigajoule, 10^9 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(9) * formula

@JsExport
@JvmField
/**
* GJ, 10^9 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val GJ = 10.0.pow(9) * (kg*(m2)/(s `^` 2))

/**
* gigajoule, 10^9 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val gigajoule = GJ
    

/**
* MJ, 10^6 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.MJ : Expression
    @JvmName("getMJ_prop")
    /**
    * Returns MJ, 10^6 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(6) * formula

/**
* megajoule, 10^6 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.megajoule : Expression
    /**
    * Returns megajoule, 10^6 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(6) * formula

@JsExport
@JvmField
/**
* MJ, 10^6 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val MJ = 10.0.pow(6) * (kg*(m2)/(s `^` 2))

/**
* megajoule, 10^6 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val megajoule = MJ
    

/**
* kJ, 10^3 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.kJ : Expression
    @JvmName("getkJ_prop")
    /**
    * Returns kJ, 10^3 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(3) * formula

/**
* kilojoule, 10^3 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.kilojoule : Expression
    /**
    * Returns kilojoule, 10^3 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(3) * formula

@JsExport
@JvmField
/**
* kJ, 10^3 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val kJ = 10.0.pow(3) * (kg*(m2)/(s `^` 2))

/**
* kilojoule, 10^3 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val kilojoule = kJ
    

/**
* hJ, 10^2 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.hJ : Expression
    @JvmName("gethJ_prop")
    /**
    * Returns hJ, 10^2 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(2) * formula

/**
* hectojoule, 10^2 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.hectojoule : Expression
    /**
    * Returns hectojoule, 10^2 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(2) * formula

@JsExport
@JvmField
/**
* hJ, 10^2 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val hJ = 10.0.pow(2) * (kg*(m2)/(s `^` 2))

/**
* hectojoule, 10^2 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val hectojoule = hJ
    

/**
* daJ, 10^1 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.daJ : Expression
    @JvmName("getdaJ_prop")
    /**
    * Returns daJ, 10^1 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(1) * formula

/**
* decajoule, 10^1 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.decajoule : Expression
    /**
    * Returns decajoule, 10^1 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(1) * formula

@JsExport
@JvmField
/**
* daJ, 10^1 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val daJ = 10.0.pow(1) * (kg*(m2)/(s `^` 2))

/**
* decajoule, 10^1 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val decajoule = daJ
    

/**
* dJ, 10^-1 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.dJ : Expression
    @JvmName("getdJ_prop")
    /**
    * Returns dJ, 10^-1 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(-1) * formula

/**
* decijoule, 10^-1 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.decijoule : Expression
    /**
    * Returns decijoule, 10^-1 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(-1) * formula

@JsExport
@JvmField
/**
* dJ, 10^-1 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val dJ = 10.0.pow(-1) * (kg*(m2)/(s `^` 2))

/**
* decijoule, 10^-1 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val decijoule = dJ
    

/**
* cJ, 10^-2 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.cJ : Expression
    @JvmName("getcJ_prop")
    /**
    * Returns cJ, 10^-2 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(-2) * formula

/**
* centijoule, 10^-2 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.centijoule : Expression
    /**
    * Returns centijoule, 10^-2 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(-2) * formula

@JsExport
@JvmField
/**
* cJ, 10^-2 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val cJ = 10.0.pow(-2) * (kg*(m2)/(s `^` 2))

/**
* centijoule, 10^-2 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val centijoule = cJ
    

/**
* mJ, 10^-3 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.mJ : Expression
    @JvmName("getmJ_prop")
    /**
    * Returns mJ, 10^-3 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(-3) * formula

/**
* millijoule, 10^-3 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.millijoule : Expression
    /**
    * Returns millijoule, 10^-3 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(-3) * formula


@JvmField
/**
* mJ, 10^-3 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val mJ = 10.0.pow(-3) * (kg*(m2)/(s `^` 2))

/**
* millijoule, 10^-3 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val millijoule = mJ
    

/**
* μJ, 10^-6 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.μJ : Expression
    @JvmName("getμJ_prop")
    /**
    * Returns μJ, 10^-6 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(-6) * formula

/**
* microjoule, 10^-6 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.microjoule : Expression
    /**
    * Returns microjoule, 10^-6 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(-6) * formula

@JsExport
@JvmField
/**
* μJ, 10^-6 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val μJ = 10.0.pow(-6) * (kg*(m2)/(s `^` 2))

/**
* microjoule, 10^-6 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val microjoule = μJ
    

/**
* nJ, 10^-9 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.nJ : Expression
    @JvmName("getnJ_prop")
    /**
    * Returns nJ, 10^-9 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(-9) * formula

/**
* nanojoule, 10^-9 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.nanojoule : Expression
    /**
    * Returns nanojoule, 10^-9 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(-9) * formula

@JsExport
@JvmField
/**
* nJ, 10^-9 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val nJ = 10.0.pow(-9) * (kg*(m2)/(s `^` 2))

/**
* nanojoule, 10^-9 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val nanojoule = nJ
    

/**
* pJ, 10^-12 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.pJ : Expression
    @JvmName("getpJ_prop")
    /**
    * Returns pJ, 10^-12 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(-12) * formula

/**
* picojoule, 10^-12 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.picojoule : Expression
    /**
    * Returns picojoule, 10^-12 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(-12) * formula


@JvmField
/**
* pJ, 10^-12 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val pJ = 10.0.pow(-12) * (kg*(m2)/(s `^` 2))

/**
* picojoule, 10^-12 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val picojoule = pJ
    

/**
* fJ, 10^-15 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.fJ : Expression
    @JvmName("getfJ_prop")
    /**
    * Returns fJ, 10^-15 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(-15) * formula

/**
* femtojoule, 10^-15 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.femtojoule : Expression
    /**
    * Returns femtojoule, 10^-15 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(-15) * formula

@JsExport
@JvmField
/**
* fJ, 10^-15 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val fJ = 10.0.pow(-15) * (kg*(m2)/(s `^` 2))

/**
* femtojoule, 10^-15 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val femtojoule = fJ
    

/**
* aJ, 10^-18 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.aJ : Expression
    @JvmName("getaJ_prop")
    /**
    * Returns aJ, 10^-18 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(-18) * formula

/**
* attojoule, 10^-18 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.attojoule : Expression
    /**
    * Returns attojoule, 10^-18 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(-18) * formula

@JsExport
@JvmField
/**
* aJ, 10^-18 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val aJ = 10.0.pow(-18) * (kg*(m2)/(s `^` 2))

/**
* attojoule, 10^-18 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val attojoule = aJ
    

/**
* zJ, 10^-21 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.zJ : Expression
    @JvmName("getzJ_prop")
    /**
    * Returns zJ, 10^-21 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(-21) * formula

/**
* zeptojoule, 10^-21 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.zeptojoule : Expression
    /**
    * Returns zeptojoule, 10^-21 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(-21) * formula


@JvmField
/**
* zJ, 10^-21 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val zJ = 10.0.pow(-21) * (kg*(m2)/(s `^` 2))

/**
* zeptojoule, 10^-21 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val zeptojoule = zJ
    

/**
* yJ, 10^-24 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.yJ : Expression
    @JvmName("getyJ_prop")
    /**
    * Returns yJ, 10^-24 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(-24) * formula

/**
* yoctojoule, 10^-24 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.yoctojoule : Expression
    /**
    * Returns yoctojoule, 10^-24 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(-24) * formula


@JvmField
/**
* yJ, 10^-24 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val yJ = 10.0.pow(-24) * (kg*(m2)/(s `^` 2))

/**
* yoctojoule, 10^-24 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val yoctojoule = yJ
    

/**
* rJ, 10^-27 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.rJ : Expression
    @JvmName("getrJ_prop")
    /**
    * Returns rJ, 10^-27 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(-27) * formula

/**
* rontojoule, 10^-27 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.rontojoule : Expression
    /**
    * Returns rontojoule, 10^-27 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(-27) * formula


@JvmField
/**
* rJ, 10^-27 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val rJ = 10.0.pow(-27) * (kg*(m2)/(s `^` 2))

/**
* rontojoule, 10^-27 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val rontojoule = rJ
    

/**
* qJ, 10^-30 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.qJ : Expression
    @JvmName("getqJ_prop")
    /**
    * Returns qJ, 10^-30 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(-30) * formula

/**
* quectojoule, 10^-30 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.quectojoule : Expression
    /**
    * Returns quectojoule, 10^-30 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = this.toDouble() * 10.0.pow(-30) * formula


@JvmField
/**
* qJ, 10^-30 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val qJ = 10.0.pow(-30) * (kg*(m2)/(s `^` 2))

/**
* quectojoule, 10^-30 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val quectojoule = qJ
    