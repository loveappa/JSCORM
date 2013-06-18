package com.arcusys.learn.persistence.liferay.model.impl;

import com.arcusys.learn.persistence.liferay.model.LFQuestionCategory;
import com.arcusys.learn.persistence.liferay.service.LFQuestionCategoryLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the LFQuestionCategory service. Represents a row in the &quot;Learn_LFQuestionCategory&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LFQuestionCategoryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFQuestionCategoryImpl
 * @see com.arcusys.learn.persistence.liferay.model.LFQuestionCategory
 * @generated
 */
public abstract class LFQuestionCategoryBaseImpl
    extends LFQuestionCategoryModelImpl implements LFQuestionCategory {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a l f question category model instance should use the {@link LFQuestionCategory} interface instead.
     */
    public void persist() throws SystemException {
        if (this.isNew()) {
            LFQuestionCategoryLocalServiceUtil.addLFQuestionCategory(this);
        } else {
            LFQuestionCategoryLocalServiceUtil.updateLFQuestionCategory(this);
        }
    }
}
