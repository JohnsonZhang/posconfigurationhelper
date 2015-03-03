package com.expedia.edx;

import com.expedia.edx.datatype.Pos;

/**
 * Created with IntelliJ IDEA.
 * User: Johnson
 * Date: 3/3/15
 */
public class SampleTest {

    public static void main (String[] args)
    {
        //sample test
        Pos pos =null;
        PosConfiguration psc = new PosConfiguration();
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

        if (pos != null)
        {
            System.out.println(pos.getSiteId());
            System.out.println(pos.getTPID());
            System.out.println(pos.getEAPID());
            System.out.println(pos.getLanguageCode());
            System.out.println(pos.getLangId());
            System.out.println(pos.getClientLocale());
            System.out.println(pos.getCurrency());
            System.out.println(pos.getMerchantID());
            System.out.println(pos.getSupplyLocale());
        }
        else
        {
            System.out.println("no pos return ");
        }
    }
}
