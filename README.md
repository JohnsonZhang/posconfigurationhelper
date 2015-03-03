1.Introduction 

 PosConfigurationHelper is a library provide a set of commond function we can use to get the EDPWEB/ LXShop /LX Supply info .  The library load the pos information from the pos.xml which  save all  the LX POS mappings , and return the specify Pos  by passing different parameters.

2.POS Configuration Helper library :

POSConfigurationHelper module is an independent maven project , it  mainly contain below class/configuration:

PosConfiguration Class – the main class where we can use different ways to get a <Site>
>>> posConfiguration.getPosFromSiteIdLanguageCode(Long sitesID, String languageCode)

>>> posConfiguration.getPosFromTpidEapidLanguageCode(Long tpid, Long eapid, String languageCode)

>>> posConfiguration.getPosFromSiteIdClientLocale(Long sitesID, String clientLocale)

>>> posConfiguration.getPosFromTpidEapidClientLocale(Long tpid, Long eapid, String clientLocale)

>>> posConfiguration.getPosFromMerchantIDSupplyLocale(Long merchantID, String supplylocale)

Pos Class – an instance representing a site (e.g a given line in the above table)

>>> pos.getMerchantId()

>>> pos.getClientLocale()

>>> pos.getSupplyLocale()

>>> pos.getSiteID()

>>> pos.getTPID()

>>> pos.getEAPID()

>>> pos.getLanguageCode()

>>> pos.getLangID()

>>> pos.getCurrency()

pos.xml - a xml file save all the LX POS mapping , it's under the PosConfigurationHelper  resources folder .


3.How to use the POSConfigurationHelper

   1) import POSConfigurationHelper jar into project 
   
   2) create a PosConfiguration instance and use the command function to get the pos by passing different parameters. 
sample :

        PosConfiguration psc = new PosConfiguration();
        Pos pos =null;
        pos= psc.getPosFromSiteIdLanguageCode(80001L,"en");
        pos= psc.getPosFromTpidEapidLanguageCode(80001L,0L,"en");
        pos= psc.getPosFromSiteIdClientLocale(80001L,"en-us");
        pos= psc.getPosFromTpidEapidClientLocale(80001L,0L,"en-us");
        pos= psc.getPosFromMerchantIDSupplyLocale(162472L,"en_us");

        if (pos != null)
        {
            long getSiteId = pos.getSiteId();
            long tpid = pos.getTPID();
            long eapid = pos.getEAPID();
            String languageCode = pos.getLanguageCode();
            long langId = pos.getLangId();
            String clientLocale = pos.getClientLocale();
            String currency = pos.getCurrency();
            long merchantID = pos.getMerchantID();
            String supplyLocale = pos.getSupplyLocale();
        } 
