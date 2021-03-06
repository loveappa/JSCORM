package com.arcusys.learn.persistence.liferay.model.impl;

import com.arcusys.learn.persistence.liferay.model.LFObjective;
import com.arcusys.learn.persistence.liferay.model.LFObjectiveModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.math.BigDecimal;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the LFObjective service. Represents a row in the &quot;Learn_LFObjective&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.arcusys.learn.persistence.liferay.model.LFObjectiveModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LFObjectiveImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFObjectiveImpl
 * @see com.arcusys.learn.persistence.liferay.model.LFObjective
 * @see com.arcusys.learn.persistence.liferay.model.LFObjectiveModel
 * @generated
 */
public class LFObjectiveModelImpl extends BaseModelImpl<LFObjective>
    implements LFObjectiveModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a l f objective model instance should use the {@link com.arcusys.learn.persistence.liferay.model.LFObjective} interface instead.
     */
    public static final String TABLE_NAME = "Learn_LFObjective";
    public static final Object[][] TABLE_COLUMNS = {
            { "lfId", Types.BIGINT },
            { "sequencingID", Types.INTEGER },
            { "satisfiedByMeasure", Types.BOOLEAN },
            { "identifier", Types.VARCHAR },
            { "minNormalizedMeasure", Types.NUMERIC },
            { "isPrimary", Types.BOOLEAN }
        };
    public static final String TABLE_SQL_CREATE = "create table Learn_LFObjective (lfId LONG not null primary key,sequencingID INTEGER null,satisfiedByMeasure BOOLEAN null,identifier VARCHAR(3000) null,minNormalizedMeasure NUMERIC(20,2),isPrimary BOOLEAN null)";
    public static final String TABLE_SQL_DROP = "drop table Learn_LFObjective";
    public static final String ORDER_BY_JPQL = " ORDER BY lfObjective.lfId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY Learn_LFObjective.lfId ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.arcusys.learn.persistence.liferay.model.LFObjective"),
            false);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.arcusys.learn.persistence.liferay.model.LFObjective"),
            false);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.arcusys.learn.persistence.liferay.model.LFObjective"),
            true);
    public static long IDENTIFIER_COLUMN_BITMASK = 1L;
    public static long ISPRIMARY_COLUMN_BITMASK = 2L;
    public static long SEQUENCINGID_COLUMN_BITMASK = 4L;
    public static long LFID_COLUMN_BITMASK = 8L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.arcusys.learn.persistence.liferay.model.LFObjective"));
    private static ClassLoader _classLoader = LFObjective.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            LFObjective.class
        };
    private long _lfId;
    private Integer _sequencingID;
    private Integer _originalSequencingID;
    private boolean _setOriginalSequencingID;
    private boolean _satisfiedByMeasure;
    private String _identifier;
    private String _originalIdentifier;
    private BigDecimal _minNormalizedMeasure;
    private Boolean _isPrimary;
    private Boolean _originalIsPrimary;
    private boolean _setOriginalIsPrimary;
    private long _columnBitmask;
    private LFObjective _escapedModel;

    public LFObjectiveModelImpl() {
    }

    @Override
    public long getPrimaryKey() {
        return _lfId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setLfId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _lfId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return LFObjective.class;
    }

    @Override
    public String getModelClassName() {
        return LFObjective.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("lfId", getLfId());
        attributes.put("sequencingID", getSequencingID());
        attributes.put("satisfiedByMeasure", getSatisfiedByMeasure());
        attributes.put("identifier", getIdentifier());
        attributes.put("minNormalizedMeasure", getMinNormalizedMeasure());
        attributes.put("isPrimary", getIsPrimary());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long lfId = (Long) attributes.get("lfId");

        if (lfId != null) {
            setLfId(lfId);
        }

        Integer sequencingID = (Integer) attributes.get("sequencingID");

        if (sequencingID != null) {
            setSequencingID(sequencingID);
        }

        Boolean satisfiedByMeasure = (Boolean) attributes.get(
                "satisfiedByMeasure");

        if (satisfiedByMeasure != null) {
            setSatisfiedByMeasure(satisfiedByMeasure);
        }

        String identifier = (String) attributes.get("identifier");

        if (identifier != null) {
            setIdentifier(identifier);
        }

        BigDecimal minNormalizedMeasure = (BigDecimal) attributes.get(
                "minNormalizedMeasure");

        if (minNormalizedMeasure != null) {
            setMinNormalizedMeasure(minNormalizedMeasure);
        }

        Boolean isPrimary = (Boolean) attributes.get("isPrimary");

        if (isPrimary != null) {
            setIsPrimary(isPrimary);
        }
    }

    @Override
    public long getLfId() {
        return _lfId;
    }

    @Override
    public void setLfId(long lfId) {
        _lfId = lfId;
    }

    @Override
    public Integer getSequencingID() {
        return _sequencingID;
    }

    @Override
    public void setSequencingID(Integer sequencingID) {
        _columnBitmask |= SEQUENCINGID_COLUMN_BITMASK;

        if (!_setOriginalSequencingID) {
            _setOriginalSequencingID = true;

            _originalSequencingID = _sequencingID;
        }

        _sequencingID = sequencingID;
    }

    public Integer getOriginalSequencingID() {
        return _originalSequencingID;
    }

    @Override
    public boolean getSatisfiedByMeasure() {
        return _satisfiedByMeasure;
    }

    @Override
    public boolean isSatisfiedByMeasure() {
        return _satisfiedByMeasure;
    }

    @Override
    public void setSatisfiedByMeasure(boolean satisfiedByMeasure) {
        _satisfiedByMeasure = satisfiedByMeasure;
    }

    @Override
    public String getIdentifier() {
        return _identifier;
    }

    @Override
    public void setIdentifier(String identifier) {
        _columnBitmask |= IDENTIFIER_COLUMN_BITMASK;

        if (_originalIdentifier == null) {
            _originalIdentifier = _identifier;
        }

        _identifier = identifier;
    }

    public String getOriginalIdentifier() {
        return _originalIdentifier;
    }

    @Override
    public BigDecimal getMinNormalizedMeasure() {
        return _minNormalizedMeasure;
    }

    @Override
    public void setMinNormalizedMeasure(BigDecimal minNormalizedMeasure) {
        _minNormalizedMeasure = minNormalizedMeasure;
    }

    @Override
    public Boolean getIsPrimary() {
        return _isPrimary;
    }

    @Override
    public void setIsPrimary(Boolean isPrimary) {
        _columnBitmask |= ISPRIMARY_COLUMN_BITMASK;

        if (!_setOriginalIsPrimary) {
            _setOriginalIsPrimary = true;

            _originalIsPrimary = _isPrimary;
        }

        _isPrimary = isPrimary;
    }

    public Boolean getOriginalIsPrimary() {
        return _originalIsPrimary;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            LFObjective.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public LFObjective toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (LFObjective) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        LFObjectiveImpl lfObjectiveImpl = new LFObjectiveImpl();

        lfObjectiveImpl.setLfId(getLfId());
        lfObjectiveImpl.setSequencingID(getSequencingID());
        lfObjectiveImpl.setSatisfiedByMeasure(getSatisfiedByMeasure());
        lfObjectiveImpl.setIdentifier(getIdentifier());
        lfObjectiveImpl.setMinNormalizedMeasure(getMinNormalizedMeasure());
        lfObjectiveImpl.setIsPrimary(getIsPrimary());

        lfObjectiveImpl.resetOriginalValues();

        return lfObjectiveImpl;
    }

    @Override
    public int compareTo(LFObjective lfObjective) {
        long primaryKey = lfObjective.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof LFObjective)) {
            return false;
        }

        LFObjective lfObjective = (LFObjective) obj;

        long primaryKey = lfObjective.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
        LFObjectiveModelImpl lfObjectiveModelImpl = this;

        lfObjectiveModelImpl._originalSequencingID = lfObjectiveModelImpl._sequencingID;

        lfObjectiveModelImpl._setOriginalSequencingID = false;

        lfObjectiveModelImpl._originalIdentifier = lfObjectiveModelImpl._identifier;

        lfObjectiveModelImpl._originalIsPrimary = lfObjectiveModelImpl._isPrimary;

        lfObjectiveModelImpl._setOriginalIsPrimary = false;

        lfObjectiveModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<LFObjective> toCacheModel() {
        LFObjectiveCacheModel lfObjectiveCacheModel = new LFObjectiveCacheModel();

        lfObjectiveCacheModel.lfId = getLfId();

        lfObjectiveCacheModel.sequencingID = getSequencingID();

        lfObjectiveCacheModel.satisfiedByMeasure = getSatisfiedByMeasure();

        lfObjectiveCacheModel.identifier = getIdentifier();

        String identifier = lfObjectiveCacheModel.identifier;

        if ((identifier != null) && (identifier.length() == 0)) {
            lfObjectiveCacheModel.identifier = null;
        }

        lfObjectiveCacheModel.minNormalizedMeasure = getMinNormalizedMeasure();

        lfObjectiveCacheModel.isPrimary = getIsPrimary();

        return lfObjectiveCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(13);

        sb.append("{lfId=");
        sb.append(getLfId());
        sb.append(", sequencingID=");
        sb.append(getSequencingID());
        sb.append(", satisfiedByMeasure=");
        sb.append(getSatisfiedByMeasure());
        sb.append(", identifier=");
        sb.append(getIdentifier());
        sb.append(", minNormalizedMeasure=");
        sb.append(getMinNormalizedMeasure());
        sb.append(", isPrimary=");
        sb.append(getIsPrimary());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(22);

        sb.append("<model><model-name>");
        sb.append("com.arcusys.learn.persistence.liferay.model.LFObjective");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>lfId</column-name><column-value><![CDATA[");
        sb.append(getLfId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>sequencingID</column-name><column-value><![CDATA[");
        sb.append(getSequencingID());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>satisfiedByMeasure</column-name><column-value><![CDATA[");
        sb.append(getSatisfiedByMeasure());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>identifier</column-name><column-value><![CDATA[");
        sb.append(getIdentifier());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>minNormalizedMeasure</column-name><column-value><![CDATA[");
        sb.append(getMinNormalizedMeasure());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>isPrimary</column-name><column-value><![CDATA[");
        sb.append(getIsPrimary());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
