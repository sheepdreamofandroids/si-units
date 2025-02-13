
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import eu.sirotin.kotunil.specialunits.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val formula =  kg*m/(s `^` 2)

@JsExport
/**
* System International Unit for force, weight.
*/
class Newton(value: Number): DerivedUnit(value, formula)

/**
* System International Unit for force, weight.
*/
@JsExport
@JvmField
val N = formula

/**
* Creates Newton-Object for current number value. Newton is a System International Unit for force, weight.
*/
val Number.N : Expression
   /**
   * Returns Newton-Object for current number value. Newton is a System International Unit for force, weight.
   */
    get() = this.toDouble() * formula

    
/**
* QN, 10^30 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.QN : Expression
    @JvmName("getQN_prop")
    /**
    * Returns QN, 10^30 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(30) * formula

/**
* quettanewton, 10^30 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.quettanewton : Expression
    /**
    * Returns quettanewton, 10^30 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(30) * formula

@JsExport
@JvmField
/**
* QN, 10^30 of newton, derived SI-Unit for measurement of force, weight
*/        
val QN = 10.0.pow(30) * (kg*m/(s `^` 2))

/**
* quettanewton, 10^30 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val quettanewton = QN
    

/**
* RN, 10^27 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.RN : Expression
    @JvmName("getRN_prop")
    /**
    * Returns RN, 10^27 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(27) * formula

/**
* ronnanewton, 10^27 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.ronnanewton : Expression
    /**
    * Returns ronnanewton, 10^27 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(27) * formula

@JsExport
@JvmField
/**
* RN, 10^27 of newton, derived SI-Unit for measurement of force, weight
*/        
val RN = 10.0.pow(27) * (kg*m/(s `^` 2))

/**
* ronnanewton, 10^27 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val ronnanewton = RN
    

/**
* YN, 10^24 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.YN : Expression
    @JvmName("getYN_prop")
    /**
    * Returns YN, 10^24 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(24) * formula

/**
* yottanewton, 10^24 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.yottanewton : Expression
    /**
    * Returns yottanewton, 10^24 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(24) * formula

@JsExport
@JvmField
/**
* YN, 10^24 of newton, derived SI-Unit for measurement of force, weight
*/        
val YN = 10.0.pow(24) * (kg*m/(s `^` 2))

/**
* yottanewton, 10^24 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val yottanewton = YN
    

/**
* ZN, 10^21 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.ZN : Expression
    @JvmName("getZN_prop")
    /**
    * Returns ZN, 10^21 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(21) * formula

/**
* zettanewton, 10^21 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.zettanewton : Expression
    /**
    * Returns zettanewton, 10^21 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(21) * formula

@JsExport
@JvmField
/**
* ZN, 10^21 of newton, derived SI-Unit for measurement of force, weight
*/        
val ZN = 10.0.pow(21) * (kg*m/(s `^` 2))

/**
* zettanewton, 10^21 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val zettanewton = ZN
    

/**
* EN, 10^18 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.EN : Expression
    @JvmName("getEN_prop")
    /**
    * Returns EN, 10^18 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(18) * formula

/**
* exanewton, 10^18 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.exanewton : Expression
    /**
    * Returns exanewton, 10^18 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(18) * formula

@JsExport
@JvmField
/**
* EN, 10^18 of newton, derived SI-Unit for measurement of force, weight
*/        
val EN = 10.0.pow(18) * (kg*m/(s `^` 2))

/**
* exanewton, 10^18 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val exanewton = EN
    

/**
* PN, 10^15 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.PN : Expression
    @JvmName("getPN_prop")
    /**
    * Returns PN, 10^15 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(15) * formula

/**
* petanewton, 10^15 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.petanewton : Expression
    /**
    * Returns petanewton, 10^15 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(15) * formula

@JsExport
@JvmField
/**
* PN, 10^15 of newton, derived SI-Unit for measurement of force, weight
*/        
val PN = 10.0.pow(15) * (kg*m/(s `^` 2))

/**
* petanewton, 10^15 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val petanewton = PN
    

/**
* TN, 10^12 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.TN : Expression
    @JvmName("getTN_prop")
    /**
    * Returns TN, 10^12 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(12) * formula

/**
* teranewton, 10^12 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.teranewton : Expression
    /**
    * Returns teranewton, 10^12 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(12) * formula

@JsExport
@JvmField
/**
* TN, 10^12 of newton, derived SI-Unit for measurement of force, weight
*/        
val TN = 10.0.pow(12) * (kg*m/(s `^` 2))

/**
* teranewton, 10^12 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val teranewton = TN
    

/**
* GN, 10^9 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.GN : Expression
    @JvmName("getGN_prop")
    /**
    * Returns GN, 10^9 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(9) * formula

/**
* giganewton, 10^9 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.giganewton : Expression
    /**
    * Returns giganewton, 10^9 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(9) * formula

@JsExport
@JvmField
/**
* GN, 10^9 of newton, derived SI-Unit for measurement of force, weight
*/        
val GN = 10.0.pow(9) * (kg*m/(s `^` 2))

/**
* giganewton, 10^9 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val giganewton = GN
    

/**
* MN, 10^6 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.MN : Expression
    @JvmName("getMN_prop")
    /**
    * Returns MN, 10^6 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(6) * formula

/**
* meganewton, 10^6 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.meganewton : Expression
    /**
    * Returns meganewton, 10^6 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(6) * formula

@JsExport
@JvmField
/**
* MN, 10^6 of newton, derived SI-Unit for measurement of force, weight
*/        
val MN = 10.0.pow(6) * (kg*m/(s `^` 2))

/**
* meganewton, 10^6 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val meganewton = MN
    

/**
* kN, 10^3 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.kN : Expression
    @JvmName("getkN_prop")
    /**
    * Returns kN, 10^3 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(3) * formula

/**
* kilonewton, 10^3 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.kilonewton : Expression
    /**
    * Returns kilonewton, 10^3 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(3) * formula

@JsExport
@JvmField
/**
* kN, 10^3 of newton, derived SI-Unit for measurement of force, weight
*/        
val kN = 10.0.pow(3) * (kg*m/(s `^` 2))

/**
* kilonewton, 10^3 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val kilonewton = kN
    

/**
* hN, 10^2 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.hN : Expression
    @JvmName("gethN_prop")
    /**
    * Returns hN, 10^2 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(2) * formula

/**
* hectonewton, 10^2 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.hectonewton : Expression
    /**
    * Returns hectonewton, 10^2 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(2) * formula

@JsExport
@JvmField
/**
* hN, 10^2 of newton, derived SI-Unit for measurement of force, weight
*/        
val hN = 10.0.pow(2) * (kg*m/(s `^` 2))

/**
* hectonewton, 10^2 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val hectonewton = hN
    

/**
* daN, 10^1 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.daN : Expression
    @JvmName("getdaN_prop")
    /**
    * Returns daN, 10^1 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(1) * formula

/**
* decanewton, 10^1 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.decanewton : Expression
    /**
    * Returns decanewton, 10^1 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(1) * formula

@JsExport
@JvmField
/**
* daN, 10^1 of newton, derived SI-Unit for measurement of force, weight
*/        
val daN = 10.0.pow(1) * (kg*m/(s `^` 2))

/**
* decanewton, 10^1 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val decanewton = daN
    

/**
* dN, 10^-1 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.dN : Expression
    @JvmName("getdN_prop")
    /**
    * Returns dN, 10^-1 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(-1) * formula

/**
* decinewton, 10^-1 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.decinewton : Expression
    /**
    * Returns decinewton, 10^-1 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(-1) * formula

@JsExport
@JvmField
/**
* dN, 10^-1 of newton, derived SI-Unit for measurement of force, weight
*/        
val dN = 10.0.pow(-1) * (kg*m/(s `^` 2))

/**
* decinewton, 10^-1 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val decinewton = dN
    

/**
* cN, 10^-2 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.cN : Expression
    @JvmName("getcN_prop")
    /**
    * Returns cN, 10^-2 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(-2) * formula

/**
* centinewton, 10^-2 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.centinewton : Expression
    /**
    * Returns centinewton, 10^-2 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(-2) * formula

@JsExport
@JvmField
/**
* cN, 10^-2 of newton, derived SI-Unit for measurement of force, weight
*/        
val cN = 10.0.pow(-2) * (kg*m/(s `^` 2))

/**
* centinewton, 10^-2 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val centinewton = cN
    

/**
* mN, 10^-3 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.mN : Expression
    @JvmName("getmN_prop")
    /**
    * Returns mN, 10^-3 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(-3) * formula

/**
* millinewton, 10^-3 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.millinewton : Expression
    /**
    * Returns millinewton, 10^-3 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(-3) * formula


@JvmField
/**
* mN, 10^-3 of newton, derived SI-Unit for measurement of force, weight
*/        
val mN = 10.0.pow(-3) * (kg*m/(s `^` 2))

/**
* millinewton, 10^-3 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val millinewton = mN
    

/**
* μN, 10^-6 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.μN : Expression
    @JvmName("getμN_prop")
    /**
    * Returns μN, 10^-6 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(-6) * formula

/**
* micronewton, 10^-6 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.micronewton : Expression
    /**
    * Returns micronewton, 10^-6 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(-6) * formula

@JsExport
@JvmField
/**
* μN, 10^-6 of newton, derived SI-Unit for measurement of force, weight
*/        
val μN = 10.0.pow(-6) * (kg*m/(s `^` 2))

/**
* micronewton, 10^-6 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val micronewton = μN
    

/**
* nN, 10^-9 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.nN : Expression
    @JvmName("getnN_prop")
    /**
    * Returns nN, 10^-9 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(-9) * formula

/**
* nanonewton, 10^-9 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.nanonewton : Expression
    /**
    * Returns nanonewton, 10^-9 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(-9) * formula

@JsExport
@JvmField
/**
* nN, 10^-9 of newton, derived SI-Unit for measurement of force, weight
*/        
val nN = 10.0.pow(-9) * (kg*m/(s `^` 2))

/**
* nanonewton, 10^-9 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val nanonewton = nN
    

/**
* pN, 10^-12 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.pN : Expression
    @JvmName("getpN_prop")
    /**
    * Returns pN, 10^-12 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(-12) * formula

/**
* piconewton, 10^-12 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.piconewton : Expression
    /**
    * Returns piconewton, 10^-12 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(-12) * formula


@JvmField
/**
* pN, 10^-12 of newton, derived SI-Unit for measurement of force, weight
*/        
val pN = 10.0.pow(-12) * (kg*m/(s `^` 2))

/**
* piconewton, 10^-12 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val piconewton = pN
    

/**
* fN, 10^-15 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.fN : Expression
    @JvmName("getfN_prop")
    /**
    * Returns fN, 10^-15 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(-15) * formula

/**
* femtonewton, 10^-15 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.femtonewton : Expression
    /**
    * Returns femtonewton, 10^-15 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(-15) * formula

@JsExport
@JvmField
/**
* fN, 10^-15 of newton, derived SI-Unit for measurement of force, weight
*/        
val fN = 10.0.pow(-15) * (kg*m/(s `^` 2))

/**
* femtonewton, 10^-15 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val femtonewton = fN
    

/**
* aN, 10^-18 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.aN : Expression
    @JvmName("getaN_prop")
    /**
    * Returns aN, 10^-18 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(-18) * formula

/**
* attonewton, 10^-18 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.attonewton : Expression
    /**
    * Returns attonewton, 10^-18 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(-18) * formula

@JsExport
@JvmField
/**
* aN, 10^-18 of newton, derived SI-Unit for measurement of force, weight
*/        
val aN = 10.0.pow(-18) * (kg*m/(s `^` 2))

/**
* attonewton, 10^-18 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val attonewton = aN
    

/**
* zN, 10^-21 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.zN : Expression
    @JvmName("getzN_prop")
    /**
    * Returns zN, 10^-21 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(-21) * formula

/**
* zeptonewton, 10^-21 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.zeptonewton : Expression
    /**
    * Returns zeptonewton, 10^-21 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(-21) * formula


@JvmField
/**
* zN, 10^-21 of newton, derived SI-Unit for measurement of force, weight
*/        
val zN = 10.0.pow(-21) * (kg*m/(s `^` 2))

/**
* zeptonewton, 10^-21 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val zeptonewton = zN
    

/**
* yN, 10^-24 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.yN : Expression
    @JvmName("getyN_prop")
    /**
    * Returns yN, 10^-24 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(-24) * formula

/**
* yoctonewton, 10^-24 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.yoctonewton : Expression
    /**
    * Returns yoctonewton, 10^-24 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(-24) * formula


@JvmField
/**
* yN, 10^-24 of newton, derived SI-Unit for measurement of force, weight
*/        
val yN = 10.0.pow(-24) * (kg*m/(s `^` 2))

/**
* yoctonewton, 10^-24 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val yoctonewton = yN
    

/**
* rN, 10^-27 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.rN : Expression
    @JvmName("getrN_prop")
    /**
    * Returns rN, 10^-27 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(-27) * formula

/**
* rontonewton, 10^-27 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.rontonewton : Expression
    /**
    * Returns rontonewton, 10^-27 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(-27) * formula


@JvmField
/**
* rN, 10^-27 of newton, derived SI-Unit for measurement of force, weight
*/        
val rN = 10.0.pow(-27) * (kg*m/(s `^` 2))

/**
* rontonewton, 10^-27 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val rontonewton = rN
    

/**
* qN, 10^-30 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.qN : Expression
    @JvmName("getqN_prop")
    /**
    * Returns qN, 10^-30 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(-30) * formula

/**
* quectonewton, 10^-30 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.quectonewton : Expression
    /**
    * Returns quectonewton, 10^-30 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = this.toDouble() * 10.0.pow(-30) * formula


@JvmField
/**
* qN, 10^-30 of newton, derived SI-Unit for measurement of force, weight
*/        
val qN = 10.0.pow(-30) * (kg*m/(s `^` 2))

/**
* quectonewton, 10^-30 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val quectonewton = qN
    