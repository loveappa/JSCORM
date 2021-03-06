package com.arcusys.learn.persistence.liferay.model.impl;

import com.arcusys.learn.persistence.liferay.model.LFAchievement;
import com.arcusys.learn.persistence.liferay.service.LFAchievementLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the LFAchievement service. Represents a row in the &quot;Learn_LFAchievement&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LFAchievementImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFAchievementImpl
 * @see com.arcusys.learn.persistence.liferay.model.LFAchievement
 * @generated
 */
public abstract class LFAchievementBaseImpl extends LFAchievementModelImpl
    implements LFAchievement {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a l f achievement model instance should use the {@link LFAchievement} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            LFAchievementLocalServiceUtil.addLFAchievement(this);
        } else {
            LFAchievementLocalServiceUtil.updateLFAchievement(this);
        }
    }
}
