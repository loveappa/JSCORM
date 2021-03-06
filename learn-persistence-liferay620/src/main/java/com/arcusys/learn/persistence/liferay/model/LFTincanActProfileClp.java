package com.arcusys.learn.persistence.liferay.model;

import com.arcusys.learn.persistence.liferay.service.ClpSerializer;
import com.arcusys.learn.persistence.liferay.service.LFTincanActProfileLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class LFTincanActProfileClp extends BaseModelImpl<LFTincanActProfile>
    implements LFTincanActProfile {
    private long _id;
    private Integer _documentId;
    private String _activityId;
    private String _profileId;
    private BaseModel<?> _lfTincanActProfileRemoteModel;

    public LFTincanActProfileClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return LFTincanActProfile.class;
    }

    @Override
    public String getModelClassName() {
        return LFTincanActProfile.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _id;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("documentId", getDocumentId());
        attributes.put("activityId", getActivityId());
        attributes.put("profileId", getProfileId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        Integer documentId = (Integer) attributes.get("documentId");

        if (documentId != null) {
            setDocumentId(documentId);
        }

        String activityId = (String) attributes.get("activityId");

        if (activityId != null) {
            setActivityId(activityId);
        }

        String profileId = (String) attributes.get("profileId");

        if (profileId != null) {
            setProfileId(profileId);
        }
    }

    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;

        if (_lfTincanActProfileRemoteModel != null) {
            try {
                Class<?> clazz = _lfTincanActProfileRemoteModel.getClass();

                Method method = clazz.getMethod("setId", long.class);

                method.invoke(_lfTincanActProfileRemoteModel, id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Integer getDocumentId() {
        return _documentId;
    }

    @Override
    public void setDocumentId(Integer documentId) {
        _documentId = documentId;

        if (_lfTincanActProfileRemoteModel != null) {
            try {
                Class<?> clazz = _lfTincanActProfileRemoteModel.getClass();

                Method method = clazz.getMethod("setDocumentId", Integer.class);

                method.invoke(_lfTincanActProfileRemoteModel, documentId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getActivityId() {
        return _activityId;
    }

    @Override
    public void setActivityId(String activityId) {
        _activityId = activityId;

        if (_lfTincanActProfileRemoteModel != null) {
            try {
                Class<?> clazz = _lfTincanActProfileRemoteModel.getClass();

                Method method = clazz.getMethod("setActivityId", String.class);

                method.invoke(_lfTincanActProfileRemoteModel, activityId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getProfileId() {
        return _profileId;
    }

    @Override
    public void setProfileId(String profileId) {
        _profileId = profileId;

        if (_lfTincanActProfileRemoteModel != null) {
            try {
                Class<?> clazz = _lfTincanActProfileRemoteModel.getClass();

                Method method = clazz.getMethod("setProfileId", String.class);

                method.invoke(_lfTincanActProfileRemoteModel, profileId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getLFTincanActProfileRemoteModel() {
        return _lfTincanActProfileRemoteModel;
    }

    public void setLFTincanActProfileRemoteModel(
        BaseModel<?> lfTincanActProfileRemoteModel) {
        _lfTincanActProfileRemoteModel = lfTincanActProfileRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _lfTincanActProfileRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_lfTincanActProfileRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            LFTincanActProfileLocalServiceUtil.addLFTincanActProfile(this);
        } else {
            LFTincanActProfileLocalServiceUtil.updateLFTincanActProfile(this);
        }
    }

    @Override
    public LFTincanActProfile toEscapedModel() {
        return (LFTincanActProfile) ProxyUtil.newProxyInstance(LFTincanActProfile.class.getClassLoader(),
            new Class[] { LFTincanActProfile.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        LFTincanActProfileClp clone = new LFTincanActProfileClp();

        clone.setId(getId());
        clone.setDocumentId(getDocumentId());
        clone.setActivityId(getActivityId());
        clone.setProfileId(getProfileId());

        return clone;
    }

    @Override
    public int compareTo(LFTincanActProfile lfTincanActProfile) {
        long primaryKey = lfTincanActProfile.getPrimaryKey();

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

        if (!(obj instanceof LFTincanActProfileClp)) {
            return false;
        }

        LFTincanActProfileClp lfTincanActProfile = (LFTincanActProfileClp) obj;

        long primaryKey = lfTincanActProfile.getPrimaryKey();

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
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", documentId=");
        sb.append(getDocumentId());
        sb.append(", activityId=");
        sb.append(getActivityId());
        sb.append(", profileId=");
        sb.append(getProfileId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append(
            "com.arcusys.learn.persistence.liferay.model.LFTincanActProfile");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>documentId</column-name><column-value><![CDATA[");
        sb.append(getDocumentId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>activityId</column-name><column-value><![CDATA[");
        sb.append(getActivityId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>profileId</column-name><column-value><![CDATA[");
        sb.append(getProfileId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
