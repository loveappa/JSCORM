package com.arcusys.learn.persistence.liferay.model.impl;

import com.arcusys.learn.persistence.liferay.model.LFRuleCondition;
import com.arcusys.learn.persistence.liferay.model.LFRuleConditionModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
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
* The base model implementation for the LFRuleCondition service. Represents a row in the &quot;Learn_LFRuleCondition&quot; database table, with each column mapped to a property of this class.
*
* <p>
    * This implementation and its corresponding interface {@link com.arcusys.learn.persistence.liferay.model.LFRuleConditionModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LFRuleConditionImpl}.
    * </p>
*
* @author Brian Wing Shun Chan
* @see LFRuleConditionImpl
* @see com.arcusys.learn.persistence.liferay.model.LFRuleCondition
* @see com.arcusys.learn.persistence.liferay.model.LFRuleConditionModel
* @generated
*/
public class LFRuleConditionModelImpl extends BaseModelImpl<LFRuleCondition>
    implements LFRuleConditionModel {
    /*
    * NOTE FOR DEVELOPERS:
    *
    * Never modify or reference this class directly. All methods that expect a l f rule condition model instance should use the {@link com.arcusys.learn.persistence.liferay.model.LFRuleCondition} interface instead.
    */
    public static final String TABLE_NAME = "Learn_LFRuleCondition";
    public static final Object[][] TABLE_COLUMNS = {
            { "id_", Types.BIGINT },
            { "conditionType", Types.CLOB },
            { "objectiveId", Types.CLOB },
            { "measureThreshold", Types.NUMERIC },
            { "inverse", Types.BOOLEAN },
            { "rollupRuleID", Types.INTEGER },
            { "conditionRuleID", Types.INTEGER }
        };
    public static final String TABLE_SQL_CREATE = "create table Learn_LFRuleCondition (id_ LONG not null primary key,conditionType TEXT null,objectiveId TEXT null,measureThreshold NUMERIC(20,2),inverse BOOLEAN,rollupRuleID INTEGER,conditionRuleID INTEGER)";
    public static final String TABLE_SQL_DROP = "drop table Learn_LFRuleCondition";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.arcusys.learn.persistence.liferay.model.LFRuleCondition"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.arcusys.learn.persistence.liferay.model.LFRuleCondition"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.arcusys.learn.persistence.liferay.model.LFRuleCondition"),
            true);
    public static long CONDITIONRULEID_COLUMN_BITMASK = 1L;
    public static long ROLLUPRULEID_COLUMN_BITMASK = 2L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.arcusys.learn.persistence.liferay.model.LFRuleCondition"));
    private static ClassLoader _classLoader = LFRuleCondition.class.getClassLoader();
    private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
            LFRuleCondition.class
        };
    private long _id;
    private String _conditionType;
    private String _objectiveId;
    private BigDecimal _measureThreshold;
    private boolean _inverse;
    private Integer _rollupRuleID;
    private Integer _originalRollupRuleID;
    private boolean _setOriginalRollupRuleID;
    private Integer _conditionRuleID;
    private Integer _originalConditionRuleID;
    private boolean _setOriginalConditionRuleID;
    private long _columnBitmask;
    private LFRuleCondition _escapedModelProxy;

    public LFRuleConditionModelImpl() {
    }

    public long getPrimaryKey() {
        return _id;
    }

    public void setPrimaryKey(long primaryKey) {
        setId(primaryKey);
    }

    public Serializable getPrimaryKeyObj() {
        return new Long(_id);
    }

    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    public Class<?> getModelClass() {
        return LFRuleCondition.class;
    }

    public String getModelClassName() {
        return LFRuleCondition.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("conditionType", getConditionType());
        attributes.put("objectiveId", getObjectiveId());
        attributes.put("measureThreshold", getMeasureThreshold());
        attributes.put("inverse", getInverse());
        attributes.put("rollupRuleID", getRollupRuleID());
        attributes.put("conditionRuleID", getConditionRuleID());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String conditionType = (String) attributes.get("conditionType");

        if (conditionType != null) {
            setConditionType(conditionType);
        }

        String objectiveId = (String) attributes.get("objectiveId");

        if (objectiveId != null) {
            setObjectiveId(objectiveId);
        }

        BigDecimal measureThreshold = (BigDecimal) attributes.get(
                "measureThreshold");

        if (measureThreshold != null) {
            setMeasureThreshold(measureThreshold);
        }

        Boolean inverse = (Boolean) attributes.get("inverse");

        if (inverse != null) {
            setInverse(inverse);
        }

        Integer rollupRuleID = (Integer) attributes.get("rollupRuleID");

        if (rollupRuleID != null) {
            setRollupRuleID(rollupRuleID);
        }

        Integer conditionRuleID = (Integer) attributes.get("conditionRuleID");

        if (conditionRuleID != null) {
            setConditionRuleID(conditionRuleID);
        }
    }

    public long getId() {
        return _id;
    }

    public void setId(long id) {
        _id = id;
    }

    public String getConditionType() {
        if (_conditionType == null) {
            return StringPool.BLANK;
        } else {
            return _conditionType;
        }
    }

    public void setConditionType(String conditionType) {
        _conditionType = conditionType;
    }

    public String getObjectiveId() {
        if (_objectiveId == null) {
            return StringPool.BLANK;
        } else {
            return _objectiveId;
        }
    }

    public void setObjectiveId(String objectiveId) {
        _objectiveId = objectiveId;
    }

    public BigDecimal getMeasureThreshold() {
        return _measureThreshold;
    }

    public void setMeasureThreshold(BigDecimal measureThreshold) {
        _measureThreshold = measureThreshold;
    }

    public boolean getInverse() {
        return _inverse;
    }

    public boolean isInverse() {
        return _inverse;
    }

    public void setInverse(boolean inverse) {
        _inverse = inverse;
    }

    public Integer getRollupRuleID() {
        return _rollupRuleID;
    }

    public void setRollupRuleID(Integer rollupRuleID) {
        _columnBitmask |= ROLLUPRULEID_COLUMN_BITMASK;

        if (!_setOriginalRollupRuleID) {
            _setOriginalRollupRuleID = true;

            _originalRollupRuleID = _rollupRuleID;
        }

        _rollupRuleID = rollupRuleID;
    }

    public Integer getOriginalRollupRuleID() {
        return _originalRollupRuleID;
    }

    public Integer getConditionRuleID() {
        return _conditionRuleID;
    }

    public void setConditionRuleID(Integer conditionRuleID) {
        _columnBitmask |= CONDITIONRULEID_COLUMN_BITMASK;

        if (!_setOriginalConditionRuleID) {
            _setOriginalConditionRuleID = true;

            _originalConditionRuleID = _conditionRuleID;
        }

        _conditionRuleID = conditionRuleID;
    }

    public Integer getOriginalConditionRuleID() {
        return _originalConditionRuleID;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            LFRuleCondition.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public LFRuleCondition toEscapedModel() {
        if (_escapedModelProxy == null) {
            _escapedModelProxy = (LFRuleCondition) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelProxyInterfaces,
                    new AutoEscapeBeanHandler(this));
        }

        return _escapedModelProxy;
    }

    @Override
    public Object clone() {
        LFRuleConditionImpl lfRuleConditionImpl = new LFRuleConditionImpl();

        lfRuleConditionImpl.setId(getId());
        lfRuleConditionImpl.setConditionType(getConditionType());
        lfRuleConditionImpl.setObjectiveId(getObjectiveId());
        lfRuleConditionImpl.setMeasureThreshold(getMeasureThreshold());
        lfRuleConditionImpl.setInverse(getInverse());
        lfRuleConditionImpl.setRollupRuleID(getRollupRuleID());
        lfRuleConditionImpl.setConditionRuleID(getConditionRuleID());

        lfRuleConditionImpl.resetOriginalValues();

        return lfRuleConditionImpl;
    }

    public int compareTo(LFRuleCondition lfRuleCondition) {
        long primaryKey = lfRuleCondition.getPrimaryKey();

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
        if (obj == null) {
            return false;
        }

        LFRuleCondition lfRuleCondition = null;

        try {
            lfRuleCondition = (LFRuleCondition) obj;
        } catch (ClassCastException cce) {
            return false;
        }

        long primaryKey = lfRuleCondition.getPrimaryKey();

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
        LFRuleConditionModelImpl lfRuleConditionModelImpl = this;

        lfRuleConditionModelImpl._originalRollupRuleID = lfRuleConditionModelImpl._rollupRuleID;

        lfRuleConditionModelImpl._setOriginalRollupRuleID = false;

        lfRuleConditionModelImpl._originalConditionRuleID = lfRuleConditionModelImpl._conditionRuleID;

        lfRuleConditionModelImpl._setOriginalConditionRuleID = false;

        lfRuleConditionModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<LFRuleCondition> toCacheModel() {
        LFRuleConditionCacheModel lfRuleConditionCacheModel = new LFRuleConditionCacheModel();

        lfRuleConditionCacheModel.id = getId();

        lfRuleConditionCacheModel.conditionType = getConditionType();

        String conditionType = lfRuleConditionCacheModel.conditionType;

        if ((conditionType != null) && (conditionType.length() == 0)) {
            lfRuleConditionCacheModel.conditionType = null;
        }

        lfRuleConditionCacheModel.objectiveId = getObjectiveId();

        String objectiveId = lfRuleConditionCacheModel.objectiveId;

        if ((objectiveId != null) && (objectiveId.length() == 0)) {
            lfRuleConditionCacheModel.objectiveId = null;
        }

        lfRuleConditionCacheModel.measureThreshold = getMeasureThreshold();

        lfRuleConditionCacheModel.inverse = getInverse();

        lfRuleConditionCacheModel.rollupRuleID = getRollupRuleID();

        lfRuleConditionCacheModel.conditionRuleID = getConditionRuleID();

        return lfRuleConditionCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(15);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", conditionType=");
        sb.append(getConditionType());
        sb.append(", objectiveId=");
        sb.append(getObjectiveId());
        sb.append(", measureThreshold=");
        sb.append(getMeasureThreshold());
        sb.append(", inverse=");
        sb.append(getInverse());
        sb.append(", rollupRuleID=");
        sb.append(getRollupRuleID());
        sb.append(", conditionRuleID=");
        sb.append(getConditionRuleID());
        sb.append("}");

        return sb.toString();
    }

    public String toXmlString() {
        StringBundler sb = new StringBundler(25);

        sb.append("<model><model-name>");
        sb.append("com.arcusys.learn.persistence.liferay.model.LFRuleCondition");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>conditionType</column-name><column-value><![CDATA[");
        sb.append(getConditionType());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>objectiveId</column-name><column-value><![CDATA[");
        sb.append(getObjectiveId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>measureThreshold</column-name><column-value><![CDATA[");
        sb.append(getMeasureThreshold());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>inverse</column-name><column-value><![CDATA[");
        sb.append(getInverse());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>rollupRuleID</column-name><column-value><![CDATA[");
        sb.append(getRollupRuleID());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>conditionRuleID</column-name><column-value><![CDATA[");
        sb.append(getConditionRuleID());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
