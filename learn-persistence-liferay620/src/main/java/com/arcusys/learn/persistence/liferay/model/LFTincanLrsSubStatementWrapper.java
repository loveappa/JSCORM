package com.arcusys.learn.persistence.liferay.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link LFTincanLrsSubStatement}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFTincanLrsSubStatement
 * @generated
 */
public class LFTincanLrsSubStatementWrapper implements LFTincanLrsSubStatement,
    ModelWrapper<LFTincanLrsSubStatement> {
    private LFTincanLrsSubStatement _lfTincanLrsSubStatement;

    public LFTincanLrsSubStatementWrapper(
        LFTincanLrsSubStatement lfTincanLrsSubStatement) {
        _lfTincanLrsSubStatement = lfTincanLrsSubStatement;
    }

    @Override
    public Class<?> getModelClass() {
        return LFTincanLrsSubStatement.class;
    }

    @Override
    public String getModelClassName() {
        return LFTincanLrsSubStatement.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("actorID", getActorID());
        attributes.put("verbID", getVerbID());
        attributes.put("verbDisplay", getVerbDisplay());
        attributes.put("objType", getObjType());
        attributes.put("objID", getObjID());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        Integer actorID = (Integer) attributes.get("actorID");

        if (actorID != null) {
            setActorID(actorID);
        }

        String verbID = (String) attributes.get("verbID");

        if (verbID != null) {
            setVerbID(verbID);
        }

        String verbDisplay = (String) attributes.get("verbDisplay");

        if (verbDisplay != null) {
            setVerbDisplay(verbDisplay);
        }

        String objType = (String) attributes.get("objType");

        if (objType != null) {
            setObjType(objType);
        }

        Integer objID = (Integer) attributes.get("objID");

        if (objID != null) {
            setObjID(objID);
        }
    }

    /**
    * Returns the primary key of this l f tincan lrs sub statement.
    *
    * @return the primary key of this l f tincan lrs sub statement
    */
    @Override
    public long getPrimaryKey() {
        return _lfTincanLrsSubStatement.getPrimaryKey();
    }

    /**
    * Sets the primary key of this l f tincan lrs sub statement.
    *
    * @param primaryKey the primary key of this l f tincan lrs sub statement
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _lfTincanLrsSubStatement.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ID of this l f tincan lrs sub statement.
    *
    * @return the ID of this l f tincan lrs sub statement
    */
    @Override
    public long getId() {
        return _lfTincanLrsSubStatement.getId();
    }

    /**
    * Sets the ID of this l f tincan lrs sub statement.
    *
    * @param id the ID of this l f tincan lrs sub statement
    */
    @Override
    public void setId(long id) {
        _lfTincanLrsSubStatement.setId(id);
    }

    /**
    * Returns the actor i d of this l f tincan lrs sub statement.
    *
    * @return the actor i d of this l f tincan lrs sub statement
    */
    @Override
    public java.lang.Integer getActorID() {
        return _lfTincanLrsSubStatement.getActorID();
    }

    /**
    * Sets the actor i d of this l f tincan lrs sub statement.
    *
    * @param actorID the actor i d of this l f tincan lrs sub statement
    */
    @Override
    public void setActorID(java.lang.Integer actorID) {
        _lfTincanLrsSubStatement.setActorID(actorID);
    }

    /**
    * Returns the verb i d of this l f tincan lrs sub statement.
    *
    * @return the verb i d of this l f tincan lrs sub statement
    */
    @Override
    public java.lang.String getVerbID() {
        return _lfTincanLrsSubStatement.getVerbID();
    }

    /**
    * Sets the verb i d of this l f tincan lrs sub statement.
    *
    * @param verbID the verb i d of this l f tincan lrs sub statement
    */
    @Override
    public void setVerbID(java.lang.String verbID) {
        _lfTincanLrsSubStatement.setVerbID(verbID);
    }

    /**
    * Returns the verb display of this l f tincan lrs sub statement.
    *
    * @return the verb display of this l f tincan lrs sub statement
    */
    @Override
    public java.lang.String getVerbDisplay() {
        return _lfTincanLrsSubStatement.getVerbDisplay();
    }

    /**
    * Sets the verb display of this l f tincan lrs sub statement.
    *
    * @param verbDisplay the verb display of this l f tincan lrs sub statement
    */
    @Override
    public void setVerbDisplay(java.lang.String verbDisplay) {
        _lfTincanLrsSubStatement.setVerbDisplay(verbDisplay);
    }

    /**
    * Returns the obj type of this l f tincan lrs sub statement.
    *
    * @return the obj type of this l f tincan lrs sub statement
    */
    @Override
    public java.lang.String getObjType() {
        return _lfTincanLrsSubStatement.getObjType();
    }

    /**
    * Sets the obj type of this l f tincan lrs sub statement.
    *
    * @param objType the obj type of this l f tincan lrs sub statement
    */
    @Override
    public void setObjType(java.lang.String objType) {
        _lfTincanLrsSubStatement.setObjType(objType);
    }

    /**
    * Returns the obj i d of this l f tincan lrs sub statement.
    *
    * @return the obj i d of this l f tincan lrs sub statement
    */
    @Override
    public java.lang.Integer getObjID() {
        return _lfTincanLrsSubStatement.getObjID();
    }

    /**
    * Sets the obj i d of this l f tincan lrs sub statement.
    *
    * @param objID the obj i d of this l f tincan lrs sub statement
    */
    @Override
    public void setObjID(java.lang.Integer objID) {
        _lfTincanLrsSubStatement.setObjID(objID);
    }

    @Override
    public boolean isNew() {
        return _lfTincanLrsSubStatement.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _lfTincanLrsSubStatement.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _lfTincanLrsSubStatement.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _lfTincanLrsSubStatement.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _lfTincanLrsSubStatement.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _lfTincanLrsSubStatement.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _lfTincanLrsSubStatement.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _lfTincanLrsSubStatement.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _lfTincanLrsSubStatement.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _lfTincanLrsSubStatement.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _lfTincanLrsSubStatement.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new LFTincanLrsSubStatementWrapper((LFTincanLrsSubStatement) _lfTincanLrsSubStatement.clone());
    }

    @Override
    public int compareTo(LFTincanLrsSubStatement lfTincanLrsSubStatement) {
        return _lfTincanLrsSubStatement.compareTo(lfTincanLrsSubStatement);
    }

    @Override
    public int hashCode() {
        return _lfTincanLrsSubStatement.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<LFTincanLrsSubStatement> toCacheModel() {
        return _lfTincanLrsSubStatement.toCacheModel();
    }

    @Override
    public LFTincanLrsSubStatement toEscapedModel() {
        return new LFTincanLrsSubStatementWrapper(_lfTincanLrsSubStatement.toEscapedModel());
    }

    @Override
    public LFTincanLrsSubStatement toUnescapedModel() {
        return new LFTincanLrsSubStatementWrapper(_lfTincanLrsSubStatement.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _lfTincanLrsSubStatement.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _lfTincanLrsSubStatement.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _lfTincanLrsSubStatement.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof LFTincanLrsSubStatementWrapper)) {
            return false;
        }

        LFTincanLrsSubStatementWrapper lfTincanLrsSubStatementWrapper = (LFTincanLrsSubStatementWrapper) obj;

        if (Validator.equals(_lfTincanLrsSubStatement,
                    lfTincanLrsSubStatementWrapper._lfTincanLrsSubStatement)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public LFTincanLrsSubStatement getWrappedLFTincanLrsSubStatement() {
        return _lfTincanLrsSubStatement;
    }

    @Override
    public LFTincanLrsSubStatement getWrappedModel() {
        return _lfTincanLrsSubStatement;
    }

    @Override
    public void resetOriginalValues() {
        _lfTincanLrsSubStatement.resetOriginalValues();
    }
}
