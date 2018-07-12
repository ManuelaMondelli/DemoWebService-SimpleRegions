
package com.acn.manu.wsimpl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.acn.manu.wsimpl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RegionByID_QNAME = new QName("http://wsimpl.manu.acn.com/", "RegionByID");
    private final static QName _Regions_QNAME = new QName("http://wsimpl.manu.acn.com/", "regions");
    private final static QName _AllRegionsResponse_QNAME = new QName("http://wsimpl.manu.acn.com/", "allRegionsResponse");
    private final static QName _RegionByIDResponse_QNAME = new QName("http://wsimpl.manu.acn.com/", "RegionByIDResponse");
    private final static QName _RegionByName_QNAME = new QName("http://wsimpl.manu.acn.com/", "RegionByName");
    private final static QName _RegionByNameResponse_QNAME = new QName("http://wsimpl.manu.acn.com/", "RegionByNameResponse");
    private final static QName _AllRegions_QNAME = new QName("http://wsimpl.manu.acn.com/", "allRegions");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.acn.manu.wsimpl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AllRegionsResponse }
     * 
     */
    public AllRegionsResponse createAllRegionsResponse() {
        return new AllRegionsResponse();
    }

    /**
     * Create an instance of {@link RegionByID }
     * 
     */
    public RegionByID createRegionByID() {
        return new RegionByID();
    }

    /**
     * Create an instance of {@link Regions }
     * 
     */
    public Regions createRegions() {
        return new Regions();
    }

    /**
     * Create an instance of {@link AllRegions }
     * 
     */
    public AllRegions createAllRegions() {
        return new AllRegions();
    }

    /**
     * Create an instance of {@link RegionByNameResponse }
     * 
     */
    public RegionByNameResponse createRegionByNameResponse() {
        return new RegionByNameResponse();
    }

    /**
     * Create an instance of {@link RegionByName }
     * 
     */
    public RegionByName createRegionByName() {
        return new RegionByName();
    }

    /**
     * Create an instance of {@link RegionByIDResponse }
     * 
     */
    public RegionByIDResponse createRegionByIDResponse() {
        return new RegionByIDResponse();
    }

    /**
     * Create an instance of {@link DtoResponseRegion }
     * 
     */
    public DtoResponseRegion createDtoResponseRegion() {
        return new DtoResponseRegion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionByID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsimpl.manu.acn.com/", name = "RegionByID")
    public JAXBElement<RegionByID> createRegionByID(RegionByID value) {
        return new JAXBElement<RegionByID>(_RegionByID_QNAME, RegionByID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Regions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsimpl.manu.acn.com/", name = "regions")
    public JAXBElement<Regions> createRegions(Regions value) {
        return new JAXBElement<Regions>(_Regions_QNAME, Regions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllRegionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsimpl.manu.acn.com/", name = "allRegionsResponse")
    public JAXBElement<AllRegionsResponse> createAllRegionsResponse(AllRegionsResponse value) {
        return new JAXBElement<AllRegionsResponse>(_AllRegionsResponse_QNAME, AllRegionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionByIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsimpl.manu.acn.com/", name = "RegionByIDResponse")
    public JAXBElement<RegionByIDResponse> createRegionByIDResponse(RegionByIDResponse value) {
        return new JAXBElement<RegionByIDResponse>(_RegionByIDResponse_QNAME, RegionByIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsimpl.manu.acn.com/", name = "RegionByName")
    public JAXBElement<RegionByName> createRegionByName(RegionByName value) {
        return new JAXBElement<RegionByName>(_RegionByName_QNAME, RegionByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsimpl.manu.acn.com/", name = "RegionByNameResponse")
    public JAXBElement<RegionByNameResponse> createRegionByNameResponse(RegionByNameResponse value) {
        return new JAXBElement<RegionByNameResponse>(_RegionByNameResponse_QNAME, RegionByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllRegions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsimpl.manu.acn.com/", name = "allRegions")
    public JAXBElement<AllRegions> createAllRegions(AllRegions value) {
        return new JAXBElement<AllRegions>(_AllRegions_QNAME, AllRegions.class, null, value);
    }

}
