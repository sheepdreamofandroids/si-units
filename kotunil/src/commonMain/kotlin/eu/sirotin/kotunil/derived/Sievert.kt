
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import eu.sirotin.kotunil.specialunits.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val formula =  (m2)*(s `^` -2)

@JsExport
/**
* System International Unit for equivalent dose (of ionising radiation).
*/
class Sievert(value: Number): DerivedUnit(value, formula)

/**
* System International Unit for equivalent dose (of ionising radiation).
*/
@JsExport
@JvmField
val Sv = formula

/**
* Creates Sievert-Object for current number value. Sievert is a System International Unit for equivalent dose (of ionising radiation).
*/
val Number.Sv : Expression
   /**
   * Returns Sievert-Object for current number value. Sievert is a System International Unit for equivalent dose (of ionising radiation).
   */
    get() = this.toDouble() * formula

    
/**
* QSv, 10^30 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.QSv : Expression
    @JvmName("getQSv_prop")
    /**
    * Returns QSv, 10^30 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(30) * formula

/**
* quettasievert, 10^30 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.quettasievert : Expression
    /**
    * Returns quettasievert, 10^30 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(30) * formula

@JsExport
@JvmField
/**
* QSv, 10^30 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val QSv = 10.0.pow(30) * ((m2)*(s `^` -2))

/**
* quettasievert, 10^30 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val quettasievert = QSv
    

/**
* RSv, 10^27 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.RSv : Expression
    @JvmName("getRSv_prop")
    /**
    * Returns RSv, 10^27 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(27) * formula

/**
* ronnasievert, 10^27 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.ronnasievert : Expression
    /**
    * Returns ronnasievert, 10^27 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(27) * formula

@JsExport
@JvmField
/**
* RSv, 10^27 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val RSv = 10.0.pow(27) * ((m2)*(s `^` -2))

/**
* ronnasievert, 10^27 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val ronnasievert = RSv
    

/**
* YSv, 10^24 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.YSv : Expression
    @JvmName("getYSv_prop")
    /**
    * Returns YSv, 10^24 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(24) * formula

/**
* yottasievert, 10^24 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.yottasievert : Expression
    /**
    * Returns yottasievert, 10^24 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(24) * formula

@JsExport
@JvmField
/**
* YSv, 10^24 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val YSv = 10.0.pow(24) * ((m2)*(s `^` -2))

/**
* yottasievert, 10^24 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val yottasievert = YSv
    

/**
* ZSv, 10^21 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.ZSv : Expression
    @JvmName("getZSv_prop")
    /**
    * Returns ZSv, 10^21 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(21) * formula

/**
* zettasievert, 10^21 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.zettasievert : Expression
    /**
    * Returns zettasievert, 10^21 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(21) * formula

@JsExport
@JvmField
/**
* ZSv, 10^21 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val ZSv = 10.0.pow(21) * ((m2)*(s `^` -2))

/**
* zettasievert, 10^21 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val zettasievert = ZSv
    

/**
* ESv, 10^18 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.ESv : Expression
    @JvmName("getESv_prop")
    /**
    * Returns ESv, 10^18 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(18) * formula

/**
* exasievert, 10^18 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.exasievert : Expression
    /**
    * Returns exasievert, 10^18 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(18) * formula

@JsExport
@JvmField
/**
* ESv, 10^18 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val ESv = 10.0.pow(18) * ((m2)*(s `^` -2))

/**
* exasievert, 10^18 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val exasievert = ESv
    

/**
* PSv, 10^15 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.PSv : Expression
    @JvmName("getPSv_prop")
    /**
    * Returns PSv, 10^15 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(15) * formula

/**
* petasievert, 10^15 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.petasievert : Expression
    /**
    * Returns petasievert, 10^15 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(15) * formula

@JsExport
@JvmField
/**
* PSv, 10^15 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val PSv = 10.0.pow(15) * ((m2)*(s `^` -2))

/**
* petasievert, 10^15 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val petasievert = PSv
    

/**
* TSv, 10^12 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.TSv : Expression
    @JvmName("getTSv_prop")
    /**
    * Returns TSv, 10^12 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(12) * formula

/**
* terasievert, 10^12 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.terasievert : Expression
    /**
    * Returns terasievert, 10^12 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(12) * formula

@JsExport
@JvmField
/**
* TSv, 10^12 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val TSv = 10.0.pow(12) * ((m2)*(s `^` -2))

/**
* terasievert, 10^12 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val terasievert = TSv
    

/**
* GSv, 10^9 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.GSv : Expression
    @JvmName("getGSv_prop")
    /**
    * Returns GSv, 10^9 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(9) * formula

/**
* gigasievert, 10^9 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.gigasievert : Expression
    /**
    * Returns gigasievert, 10^9 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(9) * formula

@JsExport
@JvmField
/**
* GSv, 10^9 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val GSv = 10.0.pow(9) * ((m2)*(s `^` -2))

/**
* gigasievert, 10^9 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val gigasievert = GSv
    

/**
* MSv, 10^6 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.MSv : Expression
    @JvmName("getMSv_prop")
    /**
    * Returns MSv, 10^6 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(6) * formula

/**
* megasievert, 10^6 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.megasievert : Expression
    /**
    * Returns megasievert, 10^6 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(6) * formula

@JsExport
@JvmField
/**
* MSv, 10^6 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val MSv = 10.0.pow(6) * ((m2)*(s `^` -2))

/**
* megasievert, 10^6 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val megasievert = MSv
    

/**
* kSv, 10^3 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.kSv : Expression
    @JvmName("getkSv_prop")
    /**
    * Returns kSv, 10^3 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(3) * formula

/**
* kilosievert, 10^3 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.kilosievert : Expression
    /**
    * Returns kilosievert, 10^3 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(3) * formula

@JsExport
@JvmField
/**
* kSv, 10^3 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val kSv = 10.0.pow(3) * ((m2)*(s `^` -2))

/**
* kilosievert, 10^3 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val kilosievert = kSv
    

/**
* hSv, 10^2 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.hSv : Expression
    @JvmName("gethSv_prop")
    /**
    * Returns hSv, 10^2 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(2) * formula

/**
* hectosievert, 10^2 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.hectosievert : Expression
    /**
    * Returns hectosievert, 10^2 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(2) * formula

@JsExport
@JvmField
/**
* hSv, 10^2 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val hSv = 10.0.pow(2) * ((m2)*(s `^` -2))

/**
* hectosievert, 10^2 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val hectosievert = hSv
    

/**
* daSv, 10^1 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.daSv : Expression
    @JvmName("getdaSv_prop")
    /**
    * Returns daSv, 10^1 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(1) * formula

/**
* decasievert, 10^1 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.decasievert : Expression
    /**
    * Returns decasievert, 10^1 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(1) * formula

@JsExport
@JvmField
/**
* daSv, 10^1 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val daSv = 10.0.pow(1) * ((m2)*(s `^` -2))

/**
* decasievert, 10^1 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val decasievert = daSv
    

/**
* dSv, 10^-1 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.dSv : Expression
    @JvmName("getdSv_prop")
    /**
    * Returns dSv, 10^-1 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-1) * formula

/**
* decisievert, 10^-1 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.decisievert : Expression
    /**
    * Returns decisievert, 10^-1 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-1) * formula

@JsExport
@JvmField
/**
* dSv, 10^-1 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val dSv = 10.0.pow(-1) * ((m2)*(s `^` -2))

/**
* decisievert, 10^-1 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val decisievert = dSv
    

/**
* cSv, 10^-2 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.cSv : Expression
    @JvmName("getcSv_prop")
    /**
    * Returns cSv, 10^-2 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-2) * formula

/**
* centisievert, 10^-2 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.centisievert : Expression
    /**
    * Returns centisievert, 10^-2 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-2) * formula

@JsExport
@JvmField
/**
* cSv, 10^-2 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val cSv = 10.0.pow(-2) * ((m2)*(s `^` -2))

/**
* centisievert, 10^-2 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val centisievert = cSv
    

/**
* mSv, 10^-3 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.mSv : Expression
    @JvmName("getmSv_prop")
    /**
    * Returns mSv, 10^-3 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-3) * formula

/**
* millisievert, 10^-3 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.millisievert : Expression
    /**
    * Returns millisievert, 10^-3 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-3) * formula


@JvmField
/**
* mSv, 10^-3 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val mSv = 10.0.pow(-3) * ((m2)*(s `^` -2))

/**
* millisievert, 10^-3 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val millisievert = mSv
    

/**
* μSv, 10^-6 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.μSv : Expression
    @JvmName("getμSv_prop")
    /**
    * Returns μSv, 10^-6 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-6) * formula

/**
* microsievert, 10^-6 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.microsievert : Expression
    /**
    * Returns microsievert, 10^-6 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-6) * formula

@JsExport
@JvmField
/**
* μSv, 10^-6 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val μSv = 10.0.pow(-6) * ((m2)*(s `^` -2))

/**
* microsievert, 10^-6 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val microsievert = μSv
    

/**
* nSv, 10^-9 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.nSv : Expression
    @JvmName("getnSv_prop")
    /**
    * Returns nSv, 10^-9 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-9) * formula

/**
* nanosievert, 10^-9 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.nanosievert : Expression
    /**
    * Returns nanosievert, 10^-9 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-9) * formula

@JsExport
@JvmField
/**
* nSv, 10^-9 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val nSv = 10.0.pow(-9) * ((m2)*(s `^` -2))

/**
* nanosievert, 10^-9 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val nanosievert = nSv
    

/**
* pSv, 10^-12 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.pSv : Expression
    @JvmName("getpSv_prop")
    /**
    * Returns pSv, 10^-12 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-12) * formula

/**
* picosievert, 10^-12 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.picosievert : Expression
    /**
    * Returns picosievert, 10^-12 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-12) * formula


@JvmField
/**
* pSv, 10^-12 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val pSv = 10.0.pow(-12) * ((m2)*(s `^` -2))

/**
* picosievert, 10^-12 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val picosievert = pSv
    

/**
* fSv, 10^-15 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.fSv : Expression
    @JvmName("getfSv_prop")
    /**
    * Returns fSv, 10^-15 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-15) * formula

/**
* femtosievert, 10^-15 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.femtosievert : Expression
    /**
    * Returns femtosievert, 10^-15 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-15) * formula

@JsExport
@JvmField
/**
* fSv, 10^-15 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val fSv = 10.0.pow(-15) * ((m2)*(s `^` -2))

/**
* femtosievert, 10^-15 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val femtosievert = fSv
    

/**
* aSv, 10^-18 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.aSv : Expression
    @JvmName("getaSv_prop")
    /**
    * Returns aSv, 10^-18 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-18) * formula

/**
* attosievert, 10^-18 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.attosievert : Expression
    /**
    * Returns attosievert, 10^-18 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-18) * formula

@JsExport
@JvmField
/**
* aSv, 10^-18 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val aSv = 10.0.pow(-18) * ((m2)*(s `^` -2))

/**
* attosievert, 10^-18 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val attosievert = aSv
    

/**
* zSv, 10^-21 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.zSv : Expression
    @JvmName("getzSv_prop")
    /**
    * Returns zSv, 10^-21 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-21) * formula

/**
* zeptosievert, 10^-21 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.zeptosievert : Expression
    /**
    * Returns zeptosievert, 10^-21 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-21) * formula


@JvmField
/**
* zSv, 10^-21 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val zSv = 10.0.pow(-21) * ((m2)*(s `^` -2))

/**
* zeptosievert, 10^-21 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val zeptosievert = zSv
    

/**
* ySv, 10^-24 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.ySv : Expression
    @JvmName("getySv_prop")
    /**
    * Returns ySv, 10^-24 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-24) * formula

/**
* yoctosievert, 10^-24 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.yoctosievert : Expression
    /**
    * Returns yoctosievert, 10^-24 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-24) * formula


@JvmField
/**
* ySv, 10^-24 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val ySv = 10.0.pow(-24) * ((m2)*(s `^` -2))

/**
* yoctosievert, 10^-24 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val yoctosievert = ySv
    

/**
* rSv, 10^-27 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.rSv : Expression
    @JvmName("getrSv_prop")
    /**
    * Returns rSv, 10^-27 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-27) * formula

/**
* rontosievert, 10^-27 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.rontosievert : Expression
    /**
    * Returns rontosievert, 10^-27 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-27) * formula


@JvmField
/**
* rSv, 10^-27 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val rSv = 10.0.pow(-27) * ((m2)*(s `^` -2))

/**
* rontosievert, 10^-27 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val rontosievert = rSv
    

/**
* qSv, 10^-30 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.qSv : Expression
    @JvmName("getqSv_prop")
    /**
    * Returns qSv, 10^-30 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-30) * formula

/**
* quectosievert, 10^-30 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.quectosievert : Expression
    /**
    * Returns quectosievert, 10^-30 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-30) * formula


@JvmField
/**
* qSv, 10^-30 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val qSv = 10.0.pow(-30) * ((m2)*(s `^` -2))

/**
* quectosievert, 10^-30 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val quectosievert = qSv
    