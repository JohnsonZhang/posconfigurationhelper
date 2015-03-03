package com.expedia.edx;

import com.expedia.edx.datatype.Pos;
import com.expedia.edx.datatype.Poslist;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 * User: Johnson
 * Date: 3/3/15
 */
public class PosConfiguration {
    JAXBContext jc = null;
    Poslist poslist = null;
    InputStream inputStream;
    private static final String PACKAGE = "com.expedia.edx.datatype";
    private static final String CONFIGURATION_NAME = "pos.xml";

    public PosConfiguration() {
        // get the Pos list from XML configuration
        try {
            jc = JAXBContext.newInstance(PACKAGE);
            inputStream = getClass().getClassLoader().getResourceAsStream(CONFIGURATION_NAME);
            poslist = (Poslist) jc.createUnmarshaller().unmarshal(inputStream);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    /**
     * get Pos by SiteId and LanguageCode
     *
     * @param sitesID
     * @param languageCode
     * @return pos
     */
    public Pos getPosFromSiteIdLanguageCode(Long sitesID, String languageCode) {

        //search  pos by the filter
        Pos pos = null;
        for (int i = 0; i < poslist.getPos().size(); i++) {
            pos = poslist.getPos().get(i);
            if (pos.getSiteId().equals(sitesID)
                    && pos.getLanguageCode().toLowerCase().equals(languageCode.toLowerCase())) {
                return pos;
            }
        }
        return null;
    }

    /**
     * get Pos by tpid , eapid and  languageCode
     *
     * @param tpid
     * @param eapid
     * @param languageCode
     * @return
     */
    public Pos getPosFromTpidEapidLanguageCode(Long tpid, Long eapid, String languageCode) {

        //search  pos by the filter
        Pos pos = null;
        for (int i = 0; i < poslist.getPos().size(); i++) {
            pos = poslist.getPos().get(i);
            if (pos.getTPID().equals(tpid)
                    && pos.getEAPID().equals(eapid)
                    && pos.getLanguageCode().toLowerCase().equals(languageCode.toLowerCase())) {
                return pos;
            }
        }
        return null;
    }

    /**
     * get Pos by SiteId and clientLocale
     *
     * @param sitesID
     * @param clientLocale
     * @return pos
     */
    public Pos getPosFromSiteIdClientLocale(Long sitesID, String clientLocale) {

        //search  pos by the filter
        Pos pos = null;
        for (int i = 0; i < poslist.getPos().size(); i++) {
            pos = poslist.getPos().get(i);
            if (pos.getSiteId().equals(sitesID)
                    && pos.getClientLocale().toLowerCase().equals(clientLocale.toLowerCase())) {
                return pos;
            }
        }
        return null;
    }

    /**
     * get Pos by tpid , eapid and  clientLocale
     *
     * @param tpid
     * @param eapid
     * @param clientLocale
     * @return
     */
    public Pos getPosFromTpidEapidClientLocale(Long tpid, Long eapid, String clientLocale) {

        //search  pos by the filter
        Pos pos = null;
        for (int i = 0; i < poslist.getPos().size(); i++) {
            pos = poslist.getPos().get(i);
            if (pos.getTPID().equals(tpid)
                    && pos.getEAPID().equals(eapid)
                    && pos.getClientLocale().toLowerCase().equals(clientLocale.toLowerCase())) {
                return pos;
            }
        }
        return null;
    }

    /**
     * get Pos by tpid , merchantID and  supplylocale
     *
     * @param merchantID
     * @param supplylocale
     * @return
     */
    public Pos getPosFromMerchantIDSupplyLocale(Long merchantID, String supplylocale) {

        //search  pos by the filter
        Pos pos = null;
        for (int i = 0; i < poslist.getPos().size(); i++) {
            pos = poslist.getPos().get(i);
            if (pos.getMerchantID().equals(merchantID)
                    && pos.getSupplyLocale().toLowerCase().equals(supplylocale.toLowerCase())) {
                return pos;
            }
        }
        return null;
    }

}
