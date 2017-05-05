//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.wfs._2_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.opengis.wfs._2_1 package. 
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

    private final static QName _ValueList_QNAME = new QName("http://www.opengis.net/wfs/2.1", "ValueList");
    private final static QName _Insert_QNAME = new QName("http://www.opengis.net/wfs/2.1", "Insert");
    private final static QName _Query_QNAME = new QName("http://www.opengis.net/wfs/2.1", "Query");
    private final static QName _GetPropertyValue_QNAME = new QName("http://www.opengis.net/wfs/2.1", "GetPropertyValue");
    private final static QName _SimpleFeatureCollection_QNAME = new QName("http://www.opengis.net/wfs/2.1", "SimpleFeatureCollection");
    private final static QName _LockFeatureResponse_QNAME = new QName("http://www.opengis.net/wfs/2.1", "LockFeatureResponse");
    private final static QName _DescribeStoredQueries_QNAME = new QName("http://www.opengis.net/wfs/2.1", "DescribeStoredQueries");
    private final static QName _Member_QNAME = new QName("http://www.opengis.net/wfs/2.1", "member");
    private final static QName _TransactionResponse_QNAME = new QName("http://www.opengis.net/wfs/2.1", "TransactionResponse");
    private final static QName _ListStoredQueries_QNAME = new QName("http://www.opengis.net/wfs/2.1", "ListStoredQueries");
    private final static QName _LockFeature_QNAME = new QName("http://www.opengis.net/wfs/2.1", "LockFeature");
    private final static QName _DescribeFeatureType_QNAME = new QName("http://www.opengis.net/wfs/2.1", "DescribeFeatureType");
    private final static QName _Value_QNAME = new QName("http://www.opengis.net/wfs/2.1", "Value");
    private final static QName _FeatureTypeList_QNAME = new QName("http://www.opengis.net/wfs/2.1", "FeatureTypeList");
    private final static QName _GetFeatureWithLock_QNAME = new QName("http://www.opengis.net/wfs/2.1", "GetFeatureWithLock");
    private final static QName _AbstractTransactionAction_QNAME = new QName("http://www.opengis.net/wfs/2.1", "AbstractTransactionAction");
    private final static QName _Replace_QNAME = new QName("http://www.opengis.net/wfs/2.1", "Replace");
    private final static QName _GetCapabilities_QNAME = new QName("http://www.opengis.net/wfs/2.1", "GetCapabilities");
    private final static QName _Element_QNAME = new QName("http://www.opengis.net/wfs/2.1", "Element");
    private final static QName _Native_QNAME = new QName("http://www.opengis.net/wfs/2.1", "Native");
    private final static QName _FeatureCollection_QNAME = new QName("http://www.opengis.net/wfs/2.1", "FeatureCollection");
    private final static QName _ValueCollection_QNAME = new QName("http://www.opengis.net/wfs/2.1", "ValueCollection");
    private final static QName _PropertyName_QNAME = new QName("http://www.opengis.net/wfs/2.1", "PropertyName");
    private final static QName _Delete_QNAME = new QName("http://www.opengis.net/wfs/2.1", "Delete");
    private final static QName _ListStoredQueriesResponse_QNAME = new QName("http://www.opengis.net/wfs/2.1", "ListStoredQueriesResponse");
    private final static QName _BoundedBy_QNAME = new QName("http://www.opengis.net/wfs/2.1", "boundedBy");
    private final static QName _GetFeature_QNAME = new QName("http://www.opengis.net/wfs/2.1", "GetFeature");
    private final static QName _Property_QNAME = new QName("http://www.opengis.net/wfs/2.1", "Property");
    private final static QName _DropStoredQueryResponse_QNAME = new QName("http://www.opengis.net/wfs/2.1", "DropStoredQueryResponse");
    private final static QName _WFSCapabilities_QNAME = new QName("http://www.opengis.net/wfs/2.1", "WFS_Capabilities");
    private final static QName _CreateStoredQuery_QNAME = new QName("http://www.opengis.net/wfs/2.1", "CreateStoredQuery");
    private final static QName _Transaction_QNAME = new QName("http://www.opengis.net/wfs/2.1", "Transaction");
    private final static QName _DescribeStoredQueriesResponse_QNAME = new QName("http://www.opengis.net/wfs/2.1", "DescribeStoredQueriesResponse");
    private final static QName _CreateStoredQueryResponse_QNAME = new QName("http://www.opengis.net/wfs/2.1", "CreateStoredQueryResponse");
    private final static QName _Tuple_QNAME = new QName("http://www.opengis.net/wfs/2.1", "Tuple");
    private final static QName _StoredQuery_QNAME = new QName("http://www.opengis.net/wfs/2.1", "StoredQuery");
    private final static QName _Update_QNAME = new QName("http://www.opengis.net/wfs/2.1", "Update");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.opengis.wfs._2_1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FeatureTypeType }
     * 
     */
    public FeatureTypeType createFeatureTypeType() {
        return new FeatureTypeType();
    }

    /**
     * Create an instance of {@link WFSCapabilitiesType }
     * 
     */
    public WFSCapabilitiesType createWFSCapabilitiesType() {
        return new WFSCapabilitiesType();
    }

    /**
     * Create an instance of {@link PropertyType }
     * 
     */
    public PropertyType createPropertyType() {
        return new PropertyType();
    }

    /**
     * Create an instance of {@link StoredQueryType }
     * 
     */
    public StoredQueryType createStoredQueryType() {
        return new StoredQueryType();
    }

    /**
     * Create an instance of {@link DescribeFeatureTypeType }
     * 
     */
    public DescribeFeatureTypeType createDescribeFeatureTypeType() {
        return new DescribeFeatureTypeType();
    }

    /**
     * Create an instance of {@link DeleteType }
     * 
     */
    public DeleteType createDeleteType() {
        return new DeleteType();
    }

    /**
     * Create an instance of {@link DescribeStoredQueriesResponseType }
     * 
     */
    public DescribeStoredQueriesResponseType createDescribeStoredQueriesResponseType() {
        return new DescribeStoredQueriesResponseType();
    }

    /**
     * Create an instance of {@link QueryType }
     * 
     */
    public QueryType createQueryType() {
        return new QueryType();
    }

    /**
     * Create an instance of {@link ValueListType }
     * 
     */
    public ValueListType createValueListType() {
        return new ValueListType();
    }

    /**
     * Create an instance of {@link ListStoredQueriesType }
     * 
     */
    public ListStoredQueriesType createListStoredQueriesType() {
        return new ListStoredQueriesType();
    }

    /**
     * Create an instance of {@link ElementType }
     * 
     */
    public ElementType createElementType() {
        return new ElementType();
    }

    /**
     * Create an instance of {@link LockFeatureType }
     * 
     */
    public LockFeatureType createLockFeatureType() {
        return new LockFeatureType();
    }

    /**
     * Create an instance of {@link FeatureTypeListType }
     * 
     */
    public FeatureTypeListType createFeatureTypeListType() {
        return new FeatureTypeListType();
    }

    /**
     * Create an instance of {@link InsertType }
     * 
     */
    public InsertType createInsertType() {
        return new InsertType();
    }

    /**
     * Create an instance of {@link UpdateType }
     * 
     */
    public UpdateType createUpdateType() {
        return new UpdateType();
    }

    /**
     * Create an instance of {@link AdditionalValues }
     * 
     */
    public AdditionalValues createAdditionalValues() {
        return new AdditionalValues();
    }

    /**
     * Create an instance of {@link ValueCollectionType }
     * 
     */
    public ValueCollectionType createValueCollectionType() {
        return new ValueCollectionType();
    }

    /**
     * Create an instance of {@link SimpleFeatureCollectionType }
     * 
     */
    public SimpleFeatureCollectionType createSimpleFeatureCollectionType() {
        return new SimpleFeatureCollectionType();
    }

    /**
     * Create an instance of {@link ListStoredQueriesResponseType }
     * 
     */
    public ListStoredQueriesResponseType createListStoredQueriesResponseType() {
        return new ListStoredQueriesResponseType();
    }

    /**
     * Create an instance of {@link DropStoredQuery }
     * 
     */
    public DropStoredQuery createDropStoredQuery() {
        return new DropStoredQuery();
    }

    /**
     * Create an instance of {@link NativeType }
     * 
     */
    public NativeType createNativeType() {
        return new NativeType();
    }

    /**
     * Create an instance of {@link TransactionResponseType }
     * 
     */
    public TransactionResponseType createTransactionResponseType() {
        return new TransactionResponseType();
    }

    /**
     * Create an instance of {@link GetCapabilitiesType }
     * 
     */
    public GetCapabilitiesType createGetCapabilitiesType() {
        return new GetCapabilitiesType();
    }

    /**
     * Create an instance of {@link CreateStoredQueryType }
     * 
     */
    public CreateStoredQueryType createCreateStoredQueryType() {
        return new CreateStoredQueryType();
    }

    /**
     * Create an instance of {@link MemberPropertyType }
     * 
     */
    public MemberPropertyType createMemberPropertyType() {
        return new MemberPropertyType();
    }

    /**
     * Create an instance of {@link GetPropertyValueType }
     * 
     */
    public GetPropertyValueType createGetPropertyValueType() {
        return new GetPropertyValueType();
    }

    /**
     * Create an instance of {@link AdditionalObjects }
     * 
     */
    public AdditionalObjects createAdditionalObjects() {
        return new AdditionalObjects();
    }

    /**
     * Create an instance of {@link DescribeStoredQueriesType }
     * 
     */
    public DescribeStoredQueriesType createDescribeStoredQueriesType() {
        return new DescribeStoredQueriesType();
    }

    /**
     * Create an instance of {@link GetFeatureType }
     * 
     */
    public GetFeatureType createGetFeatureType() {
        return new GetFeatureType();
    }

    /**
     * Create an instance of {@link PropertyName }
     * 
     */
    public PropertyName createPropertyName() {
        return new PropertyName();
    }

    /**
     * Create an instance of {@link LockFeatureResponseType }
     * 
     */
    public LockFeatureResponseType createLockFeatureResponseType() {
        return new LockFeatureResponseType();
    }

    /**
     * Create an instance of {@link ReplaceType }
     * 
     */
    public ReplaceType createReplaceType() {
        return new ReplaceType();
    }

    /**
     * Create an instance of {@link GetFeatureWithLockType }
     * 
     */
    public GetFeatureWithLockType createGetFeatureWithLockType() {
        return new GetFeatureWithLockType();
    }

    /**
     * Create an instance of {@link Abstract }
     * 
     */
    public Abstract createAbstract() {
        return new Abstract();
    }

    /**
     * Create an instance of {@link EnvelopePropertyType }
     * 
     */
    public EnvelopePropertyType createEnvelopePropertyType() {
        return new EnvelopePropertyType();
    }

    /**
     * Create an instance of {@link CreateStoredQueryResponseType }
     * 
     */
    public CreateStoredQueryResponseType createCreateStoredQueryResponseType() {
        return new CreateStoredQueryResponseType();
    }

    /**
     * Create an instance of {@link Title }
     * 
     */
    public Title createTitle() {
        return new Title();
    }

    /**
     * Create an instance of {@link TransactionType }
     * 
     */
    public TransactionType createTransactionType() {
        return new TransactionType();
    }

    /**
     * Create an instance of {@link FeatureCollectionType }
     * 
     */
    public FeatureCollectionType createFeatureCollectionType() {
        return new FeatureCollectionType();
    }

    /**
     * Create an instance of {@link ExecutionStatusType }
     * 
     */
    public ExecutionStatusType createExecutionStatusType() {
        return new ExecutionStatusType();
    }

    /**
     * Create an instance of {@link TruncatedResponse }
     * 
     */
    public TruncatedResponse createTruncatedResponse() {
        return new TruncatedResponse();
    }

    /**
     * Create an instance of {@link TupleType }
     * 
     */
    public TupleType createTupleType() {
        return new TupleType();
    }

    /**
     * Create an instance of {@link ExtendedDescriptionType }
     * 
     */
    public ExtendedDescriptionType createExtendedDescriptionType() {
        return new ExtendedDescriptionType();
    }

    /**
     * Create an instance of {@link StoredQueryListItemType }
     * 
     */
    public StoredQueryListItemType createStoredQueryListItemType() {
        return new StoredQueryListItemType();
    }

    /**
     * Create an instance of {@link MetadataURLType }
     * 
     */
    public MetadataURLType createMetadataURLType() {
        return new MetadataURLType();
    }

    /**
     * Create an instance of {@link ActionResultsType }
     * 
     */
    public ActionResultsType createActionResultsType() {
        return new ActionResultsType();
    }

    /**
     * Create an instance of {@link OutputFormatListType }
     * 
     */
    public OutputFormatListType createOutputFormatListType() {
        return new OutputFormatListType();
    }

    /**
     * Create an instance of {@link CreatedOrModifiedFeatureType }
     * 
     */
    public CreatedOrModifiedFeatureType createCreatedOrModifiedFeatureType() {
        return new CreatedOrModifiedFeatureType();
    }

    /**
     * Create an instance of {@link ParameterExpressionType }
     * 
     */
    public ParameterExpressionType createParameterExpressionType() {
        return new ParameterExpressionType();
    }

    /**
     * Create an instance of {@link FeaturesNotLockedType }
     * 
     */
    public FeaturesNotLockedType createFeaturesNotLockedType() {
        return new FeaturesNotLockedType();
    }

    /**
     * Create an instance of {@link EmptyType }
     * 
     */
    public EmptyType createEmptyType() {
        return new EmptyType();
    }

    /**
     * Create an instance of {@link FeaturesLockedType }
     * 
     */
    public FeaturesLockedType createFeaturesLockedType() {
        return new FeaturesLockedType();
    }

    /**
     * Create an instance of {@link TransactionSummaryType }
     * 
     */
    public TransactionSummaryType createTransactionSummaryType() {
        return new TransactionSummaryType();
    }

    /**
     * Create an instance of {@link ParameterType }
     * 
     */
    public ParameterType createParameterType() {
        return new ParameterType();
    }

    /**
     * Create an instance of {@link StoredQueryDescriptionType }
     * 
     */
    public StoredQueryDescriptionType createStoredQueryDescriptionType() {
        return new StoredQueryDescriptionType();
    }

    /**
     * Create an instance of {@link QueryExpressionTextType }
     * 
     */
    public QueryExpressionTextType createQueryExpressionTextType() {
        return new QueryExpressionTextType();
    }

    /**
     * Create an instance of {@link FeatureTypeType.NoCRS }
     * 
     */
    public FeatureTypeType.NoCRS createFeatureTypeTypeNoCRS() {
        return new FeatureTypeType.NoCRS();
    }

    /**
     * Create an instance of {@link WFSCapabilitiesType.WSDL }
     * 
     */
    public WFSCapabilitiesType.WSDL createWFSCapabilitiesTypeWSDL() {
        return new WFSCapabilitiesType.WSDL();
    }

    /**
     * Create an instance of {@link PropertyType.ValueReference }
     * 
     */
    public PropertyType.ValueReference createPropertyTypeValueReference() {
        return new PropertyType.ValueReference();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValueListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs/2.1", name = "ValueList")
    public JAXBElement<ValueListType> createValueList(ValueListType value) {
        return new JAXBElement<ValueListType>(_ValueList_QNAME, ValueListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs/2.1", name = "Insert", substitutionHeadNamespace = "http://www.opengis.net/wfs/2.1", substitutionHeadName = "AbstractTransactionAction")
    public JAXBElement<InsertType> createInsert(InsertType value) {
        return new JAXBElement<InsertType>(_Insert_QNAME, InsertType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs/2.1", name = "Query", substitutionHeadNamespace = "http://www.opengis.net/fes/2.1", substitutionHeadName = "AbstractAdhocQueryExpression")
    public JAXBElement<QueryType> createQuery(QueryType value) {
        return new JAXBElement<QueryType>(_Query_QNAME, QueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPropertyValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs/2.1", name = "GetPropertyValue")
    public JAXBElement<GetPropertyValueType> createGetPropertyValue(GetPropertyValueType value) {
        return new JAXBElement<GetPropertyValueType>(_GetPropertyValue_QNAME, GetPropertyValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleFeatureCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs/2.1", name = "SimpleFeatureCollection")
    public JAXBElement<SimpleFeatureCollectionType> createSimpleFeatureCollection(SimpleFeatureCollectionType value) {
        return new JAXBElement<SimpleFeatureCollectionType>(_SimpleFeatureCollection_QNAME, SimpleFeatureCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockFeatureResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs/2.1", name = "LockFeatureResponse")
    public JAXBElement<LockFeatureResponseType> createLockFeatureResponse(LockFeatureResponseType value) {
        return new JAXBElement<LockFeatureResponseType>(_LockFeatureResponse_QNAME, LockFeatureResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescribeStoredQueriesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs/2.1", name = "DescribeStoredQueries")
    public JAXBElement<DescribeStoredQueriesType> createDescribeStoredQueries(DescribeStoredQueriesType value) {
        return new JAXBElement<DescribeStoredQueriesType>(_DescribeStoredQueries_QNAME, DescribeStoredQueriesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemberPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs/2.1", name = "member")
    public JAXBElement<MemberPropertyType> createMember(MemberPropertyType value) {
        return new JAXBElement<MemberPropertyType>(_Member_QNAME, MemberPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs/2.1", name = "TransactionResponse")
    public JAXBElement<TransactionResponseType> createTransactionResponse(TransactionResponseType value) {
        return new JAXBElement<TransactionResponseType>(_TransactionResponse_QNAME, TransactionResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListStoredQueriesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs/2.1", name = "ListStoredQueries")
    public JAXBElement<ListStoredQueriesType> createListStoredQueries(ListStoredQueriesType value) {
        return new JAXBElement<ListStoredQueriesType>(_ListStoredQueries_QNAME, ListStoredQueriesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockFeatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs/2.1", name = "LockFeature")
    public JAXBElement<LockFeatureType> createLockFeature(LockFeatureType value) {
        return new JAXBElement<LockFeatureType>(_LockFeature_QNAME, LockFeatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescribeFeatureTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs/2.1", name = "DescribeFeatureType")
    public JAXBElement<DescribeFeatureTypeType> createDescribeFeatureType(DescribeFeatureTypeType value) {
        return new JAXBElement<DescribeFeatureTypeType>(_DescribeFeatureType_QNAME, DescribeFeatureTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs/2.1", name = "Value")
    public JAXBElement<Object> createValue(Object value) {
        return new JAXBElement<Object>(_Value_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeatureTypeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs/2.1", name = "FeatureTypeList")
    public JAXBElement<FeatureTypeListType> createFeatureTypeList(FeatureTypeListType value) {
        return new JAXBElement<FeatureTypeListType>(_FeatureTypeList_QNAME, FeatureTypeListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFeatureWithLockType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs/2.1", name = "GetFeatureWithLock")
    public JAXBElement<GetFeatureWithLockType> createGetFeatureWithLock(GetFeatureWithLockType value) {
        return new JAXBElement<GetFeatureWithLockType>(_GetFeatureWithLock_QNAME, GetFeatureWithLockType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractTransactionActionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs/2.1", name = "AbstractTransactionAction")
    public JAXBElement<AbstractTransactionActionType> createAbstractTransactionAction(AbstractTransactionActionType value) {
        return new JAXBElement<AbstractTransactionActionType>(_AbstractTransactionAction_QNAME, AbstractTransactionActionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs/2.1", name = "Replace", substitutionHeadNamespace = "http://www.opengis.net/wfs/2.1", substitutionHeadName = "AbstractTransactionAction")
    public JAXBElement<ReplaceType> createReplace(ReplaceType value) {
        return new JAXBElement<ReplaceType>(_Replace_QNAME, ReplaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCapabilitiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs/2.1", name = "GetCapabilities")
    public JAXBElement<GetCapabilitiesType> createGetCapabilities(GetCapabilitiesType value) {
        return new JAXBElement<GetCapabilitiesType>(_GetCapabilities_QNAME, GetCapabilitiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs/2.1", name = "Element")
    public JAXBElement<ElementType> createElement(ElementType value) {
        return new JAXBElement<ElementType>(_Element_QNAME, ElementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NativeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs/2.1", name = "Native", substitutionHeadNamespace = "http://www.opengis.net/wfs/2.1", substitutionHeadName = "AbstractTransactionAction")
    public JAXBElement<NativeType> createNative(NativeType value) {
        return new JAXBElement<NativeType>(_Native_QNAME, NativeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeatureCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs/2.1", name = "FeatureCollection", substitutionHeadNamespace = "http://www.opengis.net/wfs/2.1", substitutionHeadName = "SimpleFeatureCollection")
    public JAXBElement<FeatureCollectionType> createFeatureCollection(FeatureCollectionType value) {
        return new JAXBElement<FeatureCollectionType>(_FeatureCollection_QNAME, FeatureCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValueCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs/2.1", name = "ValueCollection")
    public JAXBElement<ValueCollectionType> createValueCollection(ValueCollectionType value) {
        return new JAXBElement<ValueCollectionType>(_ValueCollection_QNAME, ValueCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs/2.1", name = "PropertyName", substitutionHeadNamespace = "http://www.opengis.net/fes/2.1", substitutionHeadName = "AbstractProjectionClause")
    public JAXBElement<PropertyName> createPropertyName(PropertyName value) {
        return new JAXBElement<PropertyName>(_PropertyName_QNAME, PropertyName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs/2.1", name = "Delete", substitutionHeadNamespace = "http://www.opengis.net/wfs/2.1", substitutionHeadName = "AbstractTransactionAction")
    public JAXBElement<DeleteType> createDelete(DeleteType value) {
        return new JAXBElement<DeleteType>(_Delete_QNAME, DeleteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListStoredQueriesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs/2.1", name = "ListStoredQueriesResponse")
    public JAXBElement<ListStoredQueriesResponseType> createListStoredQueriesResponse(ListStoredQueriesResponseType value) {
        return new JAXBElement<ListStoredQueriesResponseType>(_ListStoredQueriesResponse_QNAME, ListStoredQueriesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvelopePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs/2.1", name = "boundedBy")
    public JAXBElement<EnvelopePropertyType> createBoundedBy(EnvelopePropertyType value) {
        return new JAXBElement<EnvelopePropertyType>(_BoundedBy_QNAME, EnvelopePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFeatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs/2.1", name = "GetFeature")
    public JAXBElement<GetFeatureType> createGetFeature(GetFeatureType value) {
        return new JAXBElement<GetFeatureType>(_GetFeature_QNAME, GetFeatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs/2.1", name = "Property")
    public JAXBElement<PropertyType> createProperty(PropertyType value) {
        return new JAXBElement<PropertyType>(_Property_QNAME, PropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecutionStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs/2.1", name = "DropStoredQueryResponse")
    public JAXBElement<ExecutionStatusType> createDropStoredQueryResponse(ExecutionStatusType value) {
        return new JAXBElement<ExecutionStatusType>(_DropStoredQueryResponse_QNAME, ExecutionStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WFSCapabilitiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs/2.1", name = "WFS_Capabilities")
    public JAXBElement<WFSCapabilitiesType> createWFSCapabilities(WFSCapabilitiesType value) {
        return new JAXBElement<WFSCapabilitiesType>(_WFSCapabilities_QNAME, WFSCapabilitiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateStoredQueryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs/2.1", name = "CreateStoredQuery")
    public JAXBElement<CreateStoredQueryType> createCreateStoredQuery(CreateStoredQueryType value) {
        return new JAXBElement<CreateStoredQueryType>(_CreateStoredQuery_QNAME, CreateStoredQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs/2.1", name = "Transaction")
    public JAXBElement<TransactionType> createTransaction(TransactionType value) {
        return new JAXBElement<TransactionType>(_Transaction_QNAME, TransactionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescribeStoredQueriesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs/2.1", name = "DescribeStoredQueriesResponse")
    public JAXBElement<DescribeStoredQueriesResponseType> createDescribeStoredQueriesResponse(DescribeStoredQueriesResponseType value) {
        return new JAXBElement<DescribeStoredQueriesResponseType>(_DescribeStoredQueriesResponse_QNAME, DescribeStoredQueriesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateStoredQueryResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs/2.1", name = "CreateStoredQueryResponse")
    public JAXBElement<CreateStoredQueryResponseType> createCreateStoredQueryResponse(CreateStoredQueryResponseType value) {
        return new JAXBElement<CreateStoredQueryResponseType>(_CreateStoredQueryResponse_QNAME, CreateStoredQueryResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TupleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs/2.1", name = "Tuple")
    public JAXBElement<TupleType> createTuple(TupleType value) {
        return new JAXBElement<TupleType>(_Tuple_QNAME, TupleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoredQueryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs/2.1", name = "StoredQuery", substitutionHeadNamespace = "http://www.opengis.net/fes/2.1", substitutionHeadName = "AbstractQueryExpression")
    public JAXBElement<StoredQueryType> createStoredQuery(StoredQueryType value) {
        return new JAXBElement<StoredQueryType>(_StoredQuery_QNAME, StoredQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs/2.1", name = "Update", substitutionHeadNamespace = "http://www.opengis.net/wfs/2.1", substitutionHeadName = "AbstractTransactionAction")
    public JAXBElement<UpdateType> createUpdate(UpdateType value) {
        return new JAXBElement<UpdateType>(_Update_QNAME, UpdateType.class, null, value);
    }

}
