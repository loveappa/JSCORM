package com.arcusys.learn.persistence.liferay.model.impl;

import com.arcusys.learn.persistence.liferay.model.LFAnswer;
import com.arcusys.learn.persistence.liferay.model.LFAnswerModel;

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
* The base model implementation for the LFAnswer service. Represents a row in the &quot;Learn_LFAnswer&quot; database table, with each column mapped to a property of this class.
*
* <p>
    * This implementation and its corresponding interface {@link com.arcusys.learn.persistence.liferay.model.LFAnswerModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LFAnswerImpl}.
    * </p>
*
* @author Brian Wing Shun Chan
* @see LFAnswerImpl
* @see com.arcusys.learn.persistence.liferay.model.LFAnswer
* @see com.arcusys.learn.persistence.liferay.model.LFAnswerModel
* @generated
*/
public class LFAnswerModelImpl extends BaseModelImpl<LFAnswer>
    implements LFAnswerModel {
    /*
    * NOTE FOR DEVELOPERS:
    *
    * Never modify or reference this class directly. All methods that expect a l f answer model instance should use the {@link com.arcusys.learn.persistence.liferay.model.LFAnswer} interface instead.
    */
    public static final String TABLE_NAME = "Learn_LFAnswer";
    public static final Object[][] TABLE_COLUMNS = {
            { "id_", Types.BIGINT },
            { "description", Types.CLOB },
            { "correct", Types.BOOLEAN },
            { "questionId", Types.INTEGER },
            { "rangeFrom", Types.NUMERIC },
            { "rangeTo", Types.NUMERIC },
            { "matchingText", Types.CLOB },
            { "answerPosition", Types.INTEGER },
            { "answerType", Types.INTEGER }
        };
    public static final String TABLE_SQL_CREATE = "create table Learn_LFAnswer (id_ LONG not null primary key,description TEXT null,correct BOOLEAN,questionId INTEGER,rangeFrom NUMERIC(20,2),rangeTo NUMERIC(20,2),matchingText TEXT null,answerPosition INTEGER,answerType INTEGER)";
    public static final String TABLE_SQL_DROP = "drop table Learn_LFAnswer";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.arcusys.learn.persistence.liferay.model.LFAnswer"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.arcusys.learn.persistence.liferay.model.LFAnswer"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.arcusys.learn.persistence.liferay.model.LFAnswer"),
            true);
    public static long QUESTIONID_COLUMN_BITMASK = 1L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.arcusys.learn.persistence.liferay.model.LFAnswer"));
    private static ClassLoader _classLoader = LFAnswer.class.getClassLoader();
    private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
            LFAnswer.class
        };
    private long _id;
    private String _description;
    private boolean _correct;
    private Integer _questionId;
    private Integer _originalQuestionId;
    private boolean _setOriginalQuestionId;
    private BigDecimal _rangeFrom;
    private BigDecimal _rangeTo;
    private String _matchingText;
    private Integer _answerPosition;
    private Integer _answerType;
    private long _columnBitmask;
    private LFAnswer _escapedModelProxy;

    public LFAnswerModelImpl() {
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
        return LFAnswer.class;
    }

    public String getModelClassName() {
        return LFAnswer.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("description", getDescription());
        attributes.put("correct", getCorrect());
        attributes.put("questionId", getQuestionId());
        attributes.put("rangeFrom", getRangeFrom());
        attributes.put("rangeTo", getRangeTo());
        attributes.put("matchingText", getMatchingText());
        attributes.put("answerPosition", getAnswerPosition());
        attributes.put("answerType", getAnswerType());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String description = (String) attributes.get("description");

        if (description != null) {
            setDescription(description);
        }

        Boolean correct = (Boolean) attributes.get("correct");

        if (correct != null) {
            setCorrect(correct);
        }

        Integer questionId = (Integer) attributes.get("questionId");

        if (questionId != null) {
            setQuestionId(questionId);
        }

        BigDecimal rangeFrom = (BigDecimal) attributes.get("rangeFrom");

        if (rangeFrom != null) {
            setRangeFrom(rangeFrom);
        }

        BigDecimal rangeTo = (BigDecimal) attributes.get("rangeTo");

        if (rangeTo != null) {
            setRangeTo(rangeTo);
        }

        String matchingText = (String) attributes.get("matchingText");

        if (matchingText != null) {
            setMatchingText(matchingText);
        }

        Integer answerPosition = (Integer) attributes.get("answerPosition");

        if (answerPosition != null) {
            setAnswerPosition(answerPosition);
        }

        Integer answerType = (Integer) attributes.get("answerType");

        if (answerType != null) {
            setAnswerType(answerType);
        }
    }

    public long getId() {
        return _id;
    }

    public void setId(long id) {
        _id = id;
    }

    public String getDescription() {
        if (_description == null) {
            return StringPool.BLANK;
        } else {
            return _description;
        }
    }

    public void setDescription(String description) {
        _description = description;
    }

    public boolean getCorrect() {
        return _correct;
    }

    public boolean isCorrect() {
        return _correct;
    }

    public void setCorrect(boolean correct) {
        _correct = correct;
    }

    public Integer getQuestionId() {
        return _questionId;
    }

    public void setQuestionId(Integer questionId) {
        _columnBitmask |= QUESTIONID_COLUMN_BITMASK;

        if (!_setOriginalQuestionId) {
            _setOriginalQuestionId = true;

            _originalQuestionId = _questionId;
        }

        _questionId = questionId;
    }

    public Integer getOriginalQuestionId() {
        return _originalQuestionId;
    }

    public BigDecimal getRangeFrom() {
        return _rangeFrom;
    }

    public void setRangeFrom(BigDecimal rangeFrom) {
        _rangeFrom = rangeFrom;
    }

    public BigDecimal getRangeTo() {
        return _rangeTo;
    }

    public void setRangeTo(BigDecimal rangeTo) {
        _rangeTo = rangeTo;
    }

    public String getMatchingText() {
        if (_matchingText == null) {
            return StringPool.BLANK;
        } else {
            return _matchingText;
        }
    }

    public void setMatchingText(String matchingText) {
        _matchingText = matchingText;
    }

    public Integer getAnswerPosition() {
        return _answerPosition;
    }

    public void setAnswerPosition(Integer answerPosition) {
        _answerPosition = answerPosition;
    }

    public Integer getAnswerType() {
        return _answerType;
    }

    public void setAnswerType(Integer answerType) {
        _answerType = answerType;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            LFAnswer.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public LFAnswer toEscapedModel() {
        if (_escapedModelProxy == null) {
            _escapedModelProxy = (LFAnswer) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelProxyInterfaces,
                    new AutoEscapeBeanHandler(this));
        }

        return _escapedModelProxy;
    }

    @Override
    public Object clone() {
        LFAnswerImpl lfAnswerImpl = new LFAnswerImpl();

        lfAnswerImpl.setId(getId());
        lfAnswerImpl.setDescription(getDescription());
        lfAnswerImpl.setCorrect(getCorrect());
        lfAnswerImpl.setQuestionId(getQuestionId());
        lfAnswerImpl.setRangeFrom(getRangeFrom());
        lfAnswerImpl.setRangeTo(getRangeTo());
        lfAnswerImpl.setMatchingText(getMatchingText());
        lfAnswerImpl.setAnswerPosition(getAnswerPosition());
        lfAnswerImpl.setAnswerType(getAnswerType());

        lfAnswerImpl.resetOriginalValues();

        return lfAnswerImpl;
    }

    public int compareTo(LFAnswer lfAnswer) {
        long primaryKey = lfAnswer.getPrimaryKey();

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

        LFAnswer lfAnswer = null;

        try {
            lfAnswer = (LFAnswer) obj;
        } catch (ClassCastException cce) {
            return false;
        }

        long primaryKey = lfAnswer.getPrimaryKey();

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
        LFAnswerModelImpl lfAnswerModelImpl = this;

        lfAnswerModelImpl._originalQuestionId = lfAnswerModelImpl._questionId;

        lfAnswerModelImpl._setOriginalQuestionId = false;

        lfAnswerModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<LFAnswer> toCacheModel() {
        LFAnswerCacheModel lfAnswerCacheModel = new LFAnswerCacheModel();

        lfAnswerCacheModel.id = getId();

        lfAnswerCacheModel.description = getDescription();

        String description = lfAnswerCacheModel.description;

        if ((description != null) && (description.length() == 0)) {
            lfAnswerCacheModel.description = null;
        }

        lfAnswerCacheModel.correct = getCorrect();

        lfAnswerCacheModel.questionId = getQuestionId();

        lfAnswerCacheModel.rangeFrom = getRangeFrom();

        lfAnswerCacheModel.rangeTo = getRangeTo();

        lfAnswerCacheModel.matchingText = getMatchingText();

        String matchingText = lfAnswerCacheModel.matchingText;

        if ((matchingText != null) && (matchingText.length() == 0)) {
            lfAnswerCacheModel.matchingText = null;
        }

        lfAnswerCacheModel.answerPosition = getAnswerPosition();

        lfAnswerCacheModel.answerType = getAnswerType();

        return lfAnswerCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", description=");
        sb.append(getDescription());
        sb.append(", correct=");
        sb.append(getCorrect());
        sb.append(", questionId=");
        sb.append(getQuestionId());
        sb.append(", rangeFrom=");
        sb.append(getRangeFrom());
        sb.append(", rangeTo=");
        sb.append(getRangeTo());
        sb.append(", matchingText=");
        sb.append(getMatchingText());
        sb.append(", answerPosition=");
        sb.append(getAnswerPosition());
        sb.append(", answerType=");
        sb.append(getAnswerType());
        sb.append("}");

        return sb.toString();
    }

    public String toXmlString() {
        StringBundler sb = new StringBundler(31);

        sb.append("<model><model-name>");
        sb.append("com.arcusys.learn.persistence.liferay.model.LFAnswer");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>description</column-name><column-value><![CDATA[");
        sb.append(getDescription());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>correct</column-name><column-value><![CDATA[");
        sb.append(getCorrect());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>questionId</column-name><column-value><![CDATA[");
        sb.append(getQuestionId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>rangeFrom</column-name><column-value><![CDATA[");
        sb.append(getRangeFrom());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>rangeTo</column-name><column-value><![CDATA[");
        sb.append(getRangeTo());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>matchingText</column-name><column-value><![CDATA[");
        sb.append(getMatchingText());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>answerPosition</column-name><column-value><![CDATA[");
        sb.append(getAnswerPosition());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>answerType</column-name><column-value><![CDATA[");
        sb.append(getAnswerType());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
