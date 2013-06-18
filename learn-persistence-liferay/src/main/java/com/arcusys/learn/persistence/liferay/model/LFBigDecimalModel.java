package com.arcusys.learn.persistence.liferay.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.math.BigDecimal;

/**
* The base model interface for the LFBigDecimal service. Represents a row in the &quot;Learn_LFBigDecimal&quot; database table, with each column mapped to a property of this class.
*
* <p>
    * This interface and its corresponding implementation {@link com.arcusys.learn.persistence.liferay.model.impl.LFBigDecimalModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.arcusys.learn.persistence.liferay.model.impl.LFBigDecimalImpl}.
    * </p>
*
* @author Brian Wing Shun Chan
* @see LFBigDecimal
* @see com.arcusys.learn.persistence.liferay.model.impl.LFBigDecimalImpl
* @see com.arcusys.learn.persistence.liferay.model.impl.LFBigDecimalModelImpl
* @generated
*/
public interface LFBigDecimalModel extends BaseModel<LFBigDecimal> {
    /*
    * NOTE FOR DEVELOPERS:
    *
    * Never modify or reference this interface directly. All methods that expect a l f big decimal model instance should use the {@link LFBigDecimal} interface instead.
    */

    /**
    * Returns the primary key of this l f big decimal.
    *
    * @return the primary key of this l f big decimal
    */
    public long getPrimaryKey();

    /**
    * Sets the primary key of this l f big decimal.
    *
    * @param primaryKey the primary key of this l f big decimal
    */
    public void setPrimaryKey(long primaryKey);

    /**
    * Returns the ID of this l f big decimal.
    *
    * @return the ID of this l f big decimal
    */
    public long getId();

    /**
        * Sets the ID of this l f big decimal.
    *
    * @param id the ID of this l f big decimal
    */
    public void setId(long id);

    /**
    * Returns the decimal of this l f big decimal.
    *
    * @return the decimal of this l f big decimal
    */
    public BigDecimal getDecimal();

    /**
        * Sets the decimal of this l f big decimal.
    *
    * @param decimal the decimal of this l f big decimal
    */
    public void setDecimal(BigDecimal decimal);

    /**
    * Returns the text of this l f big decimal.
    *
    * @return the text of this l f big decimal
    */
    @AutoEscape
    public String getText();

    /**
        * Sets the text of this l f big decimal.
    *
    * @param text the text of this l f big decimal
    */
    public void setText(String text);

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

    public int compareTo(LFBigDecimal lfBigDecimal);

    public int hashCode();

    public CacheModel<LFBigDecimal> toCacheModel();

    public LFBigDecimal toEscapedModel();

    public String toString();

    public String toXmlString();
}
