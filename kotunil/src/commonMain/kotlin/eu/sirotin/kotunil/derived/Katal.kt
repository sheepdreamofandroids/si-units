
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import eu.sirotin.kotunil.specialunits.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val unit =  (mol * (s `^` -1))

/**
* System International Unit for catalytic activity.
*/
//@JsExport
@JvmField
val kat = unit

/**
* Creates Katal-Object for current number value. Katal is a System International Unit for catalytic activity.
*/
val Number.kat : Expression
   /**
   * Returns Katal-Object for current number value. Katal is a System International Unit for catalytic activity.
   */
    get() = this.toDouble() * unit

    
/**
* Qkat, 10^30 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.Qkat : Expression
    @JvmName("getQkat_prop")
    /**
    * Returns Qkat, 10^30 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(30) * unit

/**
* quettakatal, 10^30 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.quettakatal : Expression
    /**
    * Returns quettakatal, 10^30 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(30) * unit

//@JsExport
@JvmField
//@get:JvmName("Qkat") 
/**
* Qkat, 10^30 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val Qkat = 10.0.pow(30) * ((mol * (s `^` -1)))

/**
* quettakatal, 10^30 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

//@JsExport
@JvmField
//@get:JvmName("quettakatal")
val quettakatal = Qkat
    

/**
* Rkat, 10^27 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.Rkat : Expression
    @JvmName("getRkat_prop")
    /**
    * Returns Rkat, 10^27 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(27) * unit

/**
* ronnakatal, 10^27 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.ronnakatal : Expression
    /**
    * Returns ronnakatal, 10^27 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(27) * unit

//@JsExport
@JvmField
//@get:JvmName("Rkat") 
/**
* Rkat, 10^27 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val Rkat = 10.0.pow(27) * ((mol * (s `^` -1)))

/**
* ronnakatal, 10^27 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

//@JsExport
@JvmField
//@get:JvmName("ronnakatal")
val ronnakatal = Rkat
    

/**
* Ykat, 10^24 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.Ykat : Expression
    @JvmName("getYkat_prop")
    /**
    * Returns Ykat, 10^24 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(24) * unit

/**
* yottakatal, 10^24 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.yottakatal : Expression
    /**
    * Returns yottakatal, 10^24 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(24) * unit

//@JsExport
@JvmField
//@get:JvmName("Ykat") 
/**
* Ykat, 10^24 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val Ykat = 10.0.pow(24) * ((mol * (s `^` -1)))

/**
* yottakatal, 10^24 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

//@JsExport
@JvmField
//@get:JvmName("yottakatal")
val yottakatal = Ykat
    

/**
* Zkat, 10^21 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.Zkat : Expression
    @JvmName("getZkat_prop")
    /**
    * Returns Zkat, 10^21 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(21) * unit

/**
* zettakatal, 10^21 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.zettakatal : Expression
    /**
    * Returns zettakatal, 10^21 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(21) * unit

//@JsExport
@JvmField
//@get:JvmName("Zkat") 
/**
* Zkat, 10^21 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val Zkat = 10.0.pow(21) * ((mol * (s `^` -1)))

/**
* zettakatal, 10^21 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

//@JsExport
@JvmField
//@get:JvmName("zettakatal")
val zettakatal = Zkat
    

/**
* Ekat, 10^18 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.Ekat : Expression
    @JvmName("getEkat_prop")
    /**
    * Returns Ekat, 10^18 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(18) * unit

/**
* exakatal, 10^18 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.exakatal : Expression
    /**
    * Returns exakatal, 10^18 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(18) * unit

//@JsExport
@JvmField
//@get:JvmName("Ekat") 
/**
* Ekat, 10^18 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val Ekat = 10.0.pow(18) * ((mol * (s `^` -1)))

/**
* exakatal, 10^18 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

//@JsExport
@JvmField
//@get:JvmName("exakatal")
val exakatal = Ekat
    

/**
* Pkat, 10^15 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.Pkat : Expression
    @JvmName("getPkat_prop")
    /**
    * Returns Pkat, 10^15 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(15) * unit

/**
* petakatal, 10^15 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.petakatal : Expression
    /**
    * Returns petakatal, 10^15 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(15) * unit

//@JsExport
@JvmField
//@get:JvmName("Pkat") 
/**
* Pkat, 10^15 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val Pkat = 10.0.pow(15) * ((mol * (s `^` -1)))

/**
* petakatal, 10^15 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

//@JsExport
@JvmField
//@get:JvmName("petakatal")
val petakatal = Pkat
    

/**
* Tkat, 10^12 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.Tkat : Expression
    @JvmName("getTkat_prop")
    /**
    * Returns Tkat, 10^12 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(12) * unit

/**
* terakatal, 10^12 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.terakatal : Expression
    /**
    * Returns terakatal, 10^12 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(12) * unit

//@JsExport
@JvmField
//@get:JvmName("Tkat") 
/**
* Tkat, 10^12 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val Tkat = 10.0.pow(12) * ((mol * (s `^` -1)))

/**
* terakatal, 10^12 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

//@JsExport
@JvmField
//@get:JvmName("terakatal")
val terakatal = Tkat
    

/**
* Gkat, 10^9 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.Gkat : Expression
    @JvmName("getGkat_prop")
    /**
    * Returns Gkat, 10^9 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(9) * unit

/**
* gigakatal, 10^9 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.gigakatal : Expression
    /**
    * Returns gigakatal, 10^9 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(9) * unit

//@JsExport
@JvmField
//@get:JvmName("Gkat") 
/**
* Gkat, 10^9 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val Gkat = 10.0.pow(9) * ((mol * (s `^` -1)))

/**
* gigakatal, 10^9 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

//@JsExport
@JvmField
//@get:JvmName("gigakatal")
val gigakatal = Gkat
    

/**
* Mkat, 10^6 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.Mkat : Expression
    @JvmName("getMkat_prop")
    /**
    * Returns Mkat, 10^6 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(6) * unit

/**
* megakatal, 10^6 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.megakatal : Expression
    /**
    * Returns megakatal, 10^6 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(6) * unit

//@JsExport
@JvmField
//@get:JvmName("Mkat") 
/**
* Mkat, 10^6 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val Mkat = 10.0.pow(6) * ((mol * (s `^` -1)))

/**
* megakatal, 10^6 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

//@JsExport
@JvmField
//@get:JvmName("megakatal")
val megakatal = Mkat
    

/**
* kkat, 10^3 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.kkat : Expression
    @JvmName("getkkat_prop")
    /**
    * Returns kkat, 10^3 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(3) * unit

/**
* kilokatal, 10^3 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.kilokatal : Expression
    /**
    * Returns kilokatal, 10^3 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(3) * unit

//@JsExport
@JvmField
//@get:JvmName("kkat") 
/**
* kkat, 10^3 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val kkat = 10.0.pow(3) * ((mol * (s `^` -1)))

/**
* kilokatal, 10^3 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

//@JsExport
@JvmField
//@get:JvmName("kilokatal")
val kilokatal = kkat
    

/**
* hkat, 10^2 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.hkat : Expression
    @JvmName("gethkat_prop")
    /**
    * Returns hkat, 10^2 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(2) * unit

/**
* hectokatal, 10^2 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.hectokatal : Expression
    /**
    * Returns hectokatal, 10^2 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(2) * unit

//@JsExport
@JvmField
//@get:JvmName("hkat") 
/**
* hkat, 10^2 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val hkat = 10.0.pow(2) * ((mol * (s `^` -1)))

/**
* hectokatal, 10^2 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

//@JsExport
@JvmField
//@get:JvmName("hectokatal")
val hectokatal = hkat
    

/**
* dakat, 10^1 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.dakat : Expression
    @JvmName("getdakat_prop")
    /**
    * Returns dakat, 10^1 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(1) * unit

/**
* decakatal, 10^1 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.decakatal : Expression
    /**
    * Returns decakatal, 10^1 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(1) * unit

//@JsExport
@JvmField
//@get:JvmName("dakat") 
/**
* dakat, 10^1 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val dakat = 10.0.pow(1) * ((mol * (s `^` -1)))

/**
* decakatal, 10^1 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

//@JsExport
@JvmField
//@get:JvmName("decakatal")
val decakatal = dakat
    

/**
* dkat, 10^-1 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.dkat : Expression
    @JvmName("getdkat_prop")
    /**
    * Returns dkat, 10^-1 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(-1) * unit

/**
* decikatal, 10^-1 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.decikatal : Expression
    /**
    * Returns decikatal, 10^-1 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(-1) * unit

//@JsExport
@JvmField
//@get:JvmName("dkat") 
/**
* dkat, 10^-1 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val dkat = 10.0.pow(-1) * ((mol * (s `^` -1)))

/**
* decikatal, 10^-1 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

//@JsExport
@JvmField
//@get:JvmName("decikatal")
val decikatal = dkat
    

/**
* ckat, 10^-2 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.ckat : Expression
    @JvmName("getckat_prop")
    /**
    * Returns ckat, 10^-2 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(-2) * unit

/**
* centikatal, 10^-2 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.centikatal : Expression
    /**
    * Returns centikatal, 10^-2 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(-2) * unit

//@JsExport
@JvmField
//@get:JvmName("ckat") 
/**
* ckat, 10^-2 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val ckat = 10.0.pow(-2) * ((mol * (s `^` -1)))

/**
* centikatal, 10^-2 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

//@JsExport
@JvmField
//@get:JvmName("centikatal")
val centikatal = ckat
    

/**
* mkat, 10^-3 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.mkat : Expression
    @JvmName("getmkat_prop")
    /**
    * Returns mkat, 10^-3 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(-3) * unit

/**
* millikatal, 10^-3 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.millikatal : Expression
    /**
    * Returns millikatal, 10^-3 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(-3) * unit

//@JsExport
@JvmField
//@get:JvmName("mkat") 
/**
* mkat, 10^-3 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val mkat = 10.0.pow(-3) * ((mol * (s `^` -1)))

/**
* millikatal, 10^-3 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

//@JsExport
@JvmField
//@get:JvmName("millikatal")
val millikatal = mkat
    

/**
* μkat, 10^-6 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.μkat : Expression
    @JvmName("getμkat_prop")
    /**
    * Returns μkat, 10^-6 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(-6) * unit

/**
* microkatal, 10^-6 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.microkatal : Expression
    /**
    * Returns microkatal, 10^-6 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(-6) * unit

//@JsExport
@JvmField
//@get:JvmName("μkat") 
/**
* μkat, 10^-6 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val μkat = 10.0.pow(-6) * ((mol * (s `^` -1)))

/**
* microkatal, 10^-6 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

//@JsExport
@JvmField
//@get:JvmName("microkatal")
val microkatal = μkat
    

/**
* nkat, 10^-9 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.nkat : Expression
    @JvmName("getnkat_prop")
    /**
    * Returns nkat, 10^-9 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(-9) * unit

/**
* nanokatal, 10^-9 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.nanokatal : Expression
    /**
    * Returns nanokatal, 10^-9 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(-9) * unit

//@JsExport
@JvmField
//@get:JvmName("nkat") 
/**
* nkat, 10^-9 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val nkat = 10.0.pow(-9) * ((mol * (s `^` -1)))

/**
* nanokatal, 10^-9 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

//@JsExport
@JvmField
//@get:JvmName("nanokatal")
val nanokatal = nkat
    

/**
* pkat, 10^-12 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.pkat : Expression
    @JvmName("getpkat_prop")
    /**
    * Returns pkat, 10^-12 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(-12) * unit

/**
* picokatal, 10^-12 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.picokatal : Expression
    /**
    * Returns picokatal, 10^-12 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(-12) * unit

//@JsExport
@JvmField
//@get:JvmName("pkat") 
/**
* pkat, 10^-12 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val pkat = 10.0.pow(-12) * ((mol * (s `^` -1)))

/**
* picokatal, 10^-12 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

//@JsExport
@JvmField
//@get:JvmName("picokatal")
val picokatal = pkat
    

/**
* fkat, 10^-15 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.fkat : Expression
    @JvmName("getfkat_prop")
    /**
    * Returns fkat, 10^-15 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(-15) * unit

/**
* femtokatal, 10^-15 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.femtokatal : Expression
    /**
    * Returns femtokatal, 10^-15 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(-15) * unit

//@JsExport
@JvmField
//@get:JvmName("fkat") 
/**
* fkat, 10^-15 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val fkat = 10.0.pow(-15) * ((mol * (s `^` -1)))

/**
* femtokatal, 10^-15 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

//@JsExport
@JvmField
//@get:JvmName("femtokatal")
val femtokatal = fkat
    

/**
* akat, 10^-18 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.akat : Expression
    @JvmName("getakat_prop")
    /**
    * Returns akat, 10^-18 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(-18) * unit

/**
* attokatal, 10^-18 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.attokatal : Expression
    /**
    * Returns attokatal, 10^-18 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(-18) * unit

//@JsExport
@JvmField
//@get:JvmName("akat") 
/**
* akat, 10^-18 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val akat = 10.0.pow(-18) * ((mol * (s `^` -1)))

/**
* attokatal, 10^-18 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

//@JsExport
@JvmField
//@get:JvmName("attokatal")
val attokatal = akat
    

/**
* zkat, 10^-21 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.zkat : Expression
    @JvmName("getzkat_prop")
    /**
    * Returns zkat, 10^-21 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(-21) * unit

/**
* zeptokatal, 10^-21 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.zeptokatal : Expression
    /**
    * Returns zeptokatal, 10^-21 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(-21) * unit

//@JsExport
@JvmField
//@get:JvmName("zkat") 
/**
* zkat, 10^-21 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val zkat = 10.0.pow(-21) * ((mol * (s `^` -1)))

/**
* zeptokatal, 10^-21 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

//@JsExport
@JvmField
//@get:JvmName("zeptokatal")
val zeptokatal = zkat
    

/**
* ykat, 10^-24 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.ykat : Expression
    @JvmName("getykat_prop")
    /**
    * Returns ykat, 10^-24 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(-24) * unit

/**
* yoctokatal, 10^-24 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.yoctokatal : Expression
    /**
    * Returns yoctokatal, 10^-24 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(-24) * unit

//@JsExport
@JvmField
//@get:JvmName("ykat") 
/**
* ykat, 10^-24 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val ykat = 10.0.pow(-24) * ((mol * (s `^` -1)))

/**
* yoctokatal, 10^-24 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

//@JsExport
@JvmField
//@get:JvmName("yoctokatal")
val yoctokatal = ykat
    

/**
* rkat, 10^-27 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.rkat : Expression
    @JvmName("getrkat_prop")
    /**
    * Returns rkat, 10^-27 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(-27) * unit

/**
* rontokatal, 10^-27 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.rontokatal : Expression
    /**
    * Returns rontokatal, 10^-27 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(-27) * unit

//@JsExport
@JvmField
//@get:JvmName("rkat") 
/**
* rkat, 10^-27 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val rkat = 10.0.pow(-27) * ((mol * (s `^` -1)))

/**
* rontokatal, 10^-27 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

//@JsExport
@JvmField
//@get:JvmName("rontokatal")
val rontokatal = rkat
    

/**
* qkat, 10^-30 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.qkat : Expression
    @JvmName("getqkat_prop")
    /**
    * Returns qkat, 10^-30 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(-30) * unit

/**
* quectokatal, 10^-30 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.quectokatal : Expression
    /**
    * Returns quectokatal, 10^-30 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = this.toDouble() * 10.0.pow(-30) * unit

//@JsExport
@JvmField
//@get:JvmName("qkat") 
/**
* qkat, 10^-30 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val qkat = 10.0.pow(-30) * ((mol * (s `^` -1)))

/**
* quectokatal, 10^-30 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

//@JsExport
@JvmField
//@get:JvmName("quectokatal")
val quectokatal = qkat
    