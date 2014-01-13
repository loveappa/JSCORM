package com.arcusys.learn.persistence.liferay.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
* The base model interface for the LFTincanLrsDocument service. Represents a row in the &quot;Learn_LFTincanLrsDocument&quot; database table, with each column mapped to a property of this class.
*
* <p>
    * This interface and its corresponding implementation {@link com.arcusys.learn.persistence.liferay.model.impl.LFTincanLrsDocumentModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.arcusys.learn.persistence.liferay.model.impl.LFTincanLrsDocumentImpl}.
    * </p>
*
* @author Brian Wing Shun Chan
* @see LFTincanLrsDocument
* @see com.arcusys.learn.persistence.liferay.model.impl.LFTincanLrsDocumentImpl
* @see com.arcusys.learn.persistence.liferay.model.impl.LFTincanLrsDocumentModelImpl
* @generated
*/
public interface LFTincanLrsDocumentModel extends BaseModel<LFTincanLrsDocument> {
    /*
    * NOTE FOR DEVELOPERS:
    *
    * Never modify or reference this interface directly. All methods that expect a l f tincan lrs document model instance should use the {@link LFTincanLrsDocument} interface instead.
    */

    /**
    * Returns the primary key of this l f tincan lrs document.
    *
    * @return the primary key of this l f tincan lrs document
    */
    public long getPrimaryKey();

    /**
    * Sets the primary key of this l f tincan lrs document.
    *
    * @param primaryKey the primary key of this l f tincan lrs document
    */
    public void setPrimaryKey(long primaryKey);

    /**
    * Returns the ID of this l f tincan lrs document.
    *
    * @return the ID of this l f tincan lrs document
    */
    public long getId();

    /**
        * Sets the ID of this l f tincan lrs document.
    *
    * @param id the ID of this l f tincan lrs document
    */
    public void setId(long id);

    /**
    * Returns the document ID of this l f tincan lrs document.
    *
    * @return the document ID of this l f tincan lrs document
    */
    @AutoEscape
    public String getDocumentId();

    /**
        * Sets the document ID of this l f tincan lrs document.
    *
    * @param documentId the document ID of this l f tincan lrs document
    */
    public void setDocumentId(String documentId);

    /**
    * Returns the update of this l f tincan lrs document.
    *
    * @return the update of this l f tincan lrs document
    */
    public Date getUpdate();

    /**
        * Sets the update of this l f tincan lrs document.
    *
    * @param update the update of this l f tincan lrs document
    */
    public void setUpdate(Date update);

    /**
    * Returns the content of this l f tincan lrs document.
    *
    * @return the content of this l f tincan lrs document
    */
    @AutoEscape
    public String getContent();

    /**
        * Sets the content of this l f tincan lrs document.
    *
    * @param content the content of this l f tincan lrs document
    */
    public void setContent(String content);

    /**
    * Returns the content type of this l f tincan lrs document.
    *
    * @return the content type of this l f tincan lrs document
    */
    @AutoEscape
    public String getContentType();

    /**
        * Sets the content type of this l f tincan lrs document.
    *
    * @param contentType the content type of this l f tincan lrs document
    */
    public void setContentType(String contentType);

    public boolean isNew();

    public void setNew(boolean n);

    public boolean isCachedModel();

    public void setCachedModel(boolean cachedModel);

    public boolean isEscapedModel();

    public Serializable getPrimaryKeyObj();

    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    public ExpandoBridge getExpandoBridge();

    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    public Object clone();

    public int compareTo(LFTincanLrsDocument lfTincanLrsDocument);

    public int hashCode();

    public CacheModel<LFTincanLrsDocument> toCacheModel();

    public LFTincanLrsDocument toEscapedModel();

    public String toString();

    public String toXmlString();
}