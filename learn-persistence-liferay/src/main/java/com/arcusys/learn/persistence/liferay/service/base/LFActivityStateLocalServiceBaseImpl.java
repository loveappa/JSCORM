package com.arcusys.learn.persistence.liferay.service.base;

import com.arcusys.learn.persistence.liferay.model.LFActivityState;
import com.arcusys.learn.persistence.liferay.service.LFActivityDataMapLocalService;
import com.arcusys.learn.persistence.liferay.service.LFActivityLocalService;
import com.arcusys.learn.persistence.liferay.service.LFActivityStateLocalService;
import com.arcusys.learn.persistence.liferay.service.LFActivityStateNodeLocalService;
import com.arcusys.learn.persistence.liferay.service.LFActivityStateTreeLocalService;
import com.arcusys.learn.persistence.liferay.service.LFAnswerLocalService;
import com.arcusys.learn.persistence.liferay.service.LFAttemptDataLocalService;
import com.arcusys.learn.persistence.liferay.service.LFAttemptLocalService;
import com.arcusys.learn.persistence.liferay.service.LFBigDecimalLocalService;
import com.arcusys.learn.persistence.liferay.service.LFChildrenSelectionLocalService;
import com.arcusys.learn.persistence.liferay.service.LFConditionRuleLocalService;
import com.arcusys.learn.persistence.liferay.service.LFCourseLocalService;
import com.arcusys.learn.persistence.liferay.service.LFFileStorageLocalService;
import com.arcusys.learn.persistence.liferay.service.LFGlobalObjectiveStateLocalService;
import com.arcusys.learn.persistence.liferay.service.LFObjectiveLocalService;
import com.arcusys.learn.persistence.liferay.service.LFObjectiveMapLocalService;
import com.arcusys.learn.persistence.liferay.service.LFObjectiveStateLocalService;
import com.arcusys.learn.persistence.liferay.service.LFPackageLocalService;
import com.arcusys.learn.persistence.liferay.service.LFPackageScopeRuleLocalService;
import com.arcusys.learn.persistence.liferay.service.LFPlayerScopeRuleLocalService;
import com.arcusys.learn.persistence.liferay.service.LFQuestionCategoryLocalService;
import com.arcusys.learn.persistence.liferay.service.LFQuestionLocalService;
import com.arcusys.learn.persistence.liferay.service.LFQuizLocalService;
import com.arcusys.learn.persistence.liferay.service.LFQuizQuestionCategoryLocalService;
import com.arcusys.learn.persistence.liferay.service.LFQuizQuestionLocalService;
import com.arcusys.learn.persistence.liferay.service.LFResourceLocalService;
import com.arcusys.learn.persistence.liferay.service.LFRollupContributionLocalService;
import com.arcusys.learn.persistence.liferay.service.LFRollupRuleLocalService;
import com.arcusys.learn.persistence.liferay.service.LFRuleConditionLocalService;
import com.arcusys.learn.persistence.liferay.service.LFSequencingLocalService;
import com.arcusys.learn.persistence.liferay.service.LFSequencingPermissionsLocalService;
import com.arcusys.learn.persistence.liferay.service.LFSequencingTrackingLocalService;
import com.arcusys.learn.persistence.liferay.service.LFUserLocalService;
import com.arcusys.learn.persistence.liferay.service.persistence.LFActivityDataMapPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFActivityPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFActivityStateNodePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFActivityStatePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFActivityStateTreePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFAnswerPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFAttemptDataPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFAttemptPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFBigDecimalPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFChildrenSelectionPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFConditionRulePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFCoursePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFFileStoragePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFGlobalObjectiveStatePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFObjectiveMapPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFObjectivePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFObjectiveStatePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFPackagePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFPackageScopeRulePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFPlayerScopeRulePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFQuestionCategoryPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFQuestionPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFQuizPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFQuizQuestionCategoryPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFQuizQuestionPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFResourcePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFRollupContributionPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFRollupRulePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFRuleConditionPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFSequencingPermissionsPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFSequencingPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFSequencingTrackingPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFUserPersistence;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * The base implementation of the l f activity state local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.arcusys.learn.persistence.liferay.service.impl.LFActivityStateLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.arcusys.learn.persistence.liferay.service.impl.LFActivityStateLocalServiceImpl
 * @see com.arcusys.learn.persistence.liferay.service.LFActivityStateLocalServiceUtil
 * @generated
 */
public abstract class LFActivityStateLocalServiceBaseImpl
    extends BaseLocalServiceImpl implements LFActivityStateLocalService,
        IdentifiableBean {
    @BeanReference(type = LFActivityLocalService.class)
    protected LFActivityLocalService lfActivityLocalService;
    @BeanReference(type = LFActivityPersistence.class)
    protected LFActivityPersistence lfActivityPersistence;
    @BeanReference(type = LFActivityDataMapLocalService.class)
    protected LFActivityDataMapLocalService lfActivityDataMapLocalService;
    @BeanReference(type = LFActivityDataMapPersistence.class)
    protected LFActivityDataMapPersistence lfActivityDataMapPersistence;
    @BeanReference(type = LFActivityStateLocalService.class)
    protected LFActivityStateLocalService lfActivityStateLocalService;
    @BeanReference(type = LFActivityStatePersistence.class)
    protected LFActivityStatePersistence lfActivityStatePersistence;
    @BeanReference(type = LFActivityStateNodeLocalService.class)
    protected LFActivityStateNodeLocalService lfActivityStateNodeLocalService;
    @BeanReference(type = LFActivityStateNodePersistence.class)
    protected LFActivityStateNodePersistence lfActivityStateNodePersistence;
    @BeanReference(type = LFActivityStateTreeLocalService.class)
    protected LFActivityStateTreeLocalService lfActivityStateTreeLocalService;
    @BeanReference(type = LFActivityStateTreePersistence.class)
    protected LFActivityStateTreePersistence lfActivityStateTreePersistence;
    @BeanReference(type = LFAnswerLocalService.class)
    protected LFAnswerLocalService lfAnswerLocalService;
    @BeanReference(type = LFAnswerPersistence.class)
    protected LFAnswerPersistence lfAnswerPersistence;
    @BeanReference(type = LFAttemptLocalService.class)
    protected LFAttemptLocalService lfAttemptLocalService;
    @BeanReference(type = LFAttemptPersistence.class)
    protected LFAttemptPersistence lfAttemptPersistence;
    @BeanReference(type = LFAttemptDataLocalService.class)
    protected LFAttemptDataLocalService lfAttemptDataLocalService;
    @BeanReference(type = LFAttemptDataPersistence.class)
    protected LFAttemptDataPersistence lfAttemptDataPersistence;
    @BeanReference(type = LFBigDecimalLocalService.class)
    protected LFBigDecimalLocalService lfBigDecimalLocalService;
    @BeanReference(type = LFBigDecimalPersistence.class)
    protected LFBigDecimalPersistence lfBigDecimalPersistence;
    @BeanReference(type = LFChildrenSelectionLocalService.class)
    protected LFChildrenSelectionLocalService lfChildrenSelectionLocalService;
    @BeanReference(type = LFChildrenSelectionPersistence.class)
    protected LFChildrenSelectionPersistence lfChildrenSelectionPersistence;
    @BeanReference(type = LFConditionRuleLocalService.class)
    protected LFConditionRuleLocalService lfConditionRuleLocalService;
    @BeanReference(type = LFConditionRulePersistence.class)
    protected LFConditionRulePersistence lfConditionRulePersistence;
    @BeanReference(type = LFCourseLocalService.class)
    protected LFCourseLocalService lfCourseLocalService;
    @BeanReference(type = LFCoursePersistence.class)
    protected LFCoursePersistence lfCoursePersistence;
    @BeanReference(type = LFFileStorageLocalService.class)
    protected LFFileStorageLocalService lfFileStorageLocalService;
    @BeanReference(type = LFFileStoragePersistence.class)
    protected LFFileStoragePersistence lfFileStoragePersistence;
    @BeanReference(type = LFGlobalObjectiveStateLocalService.class)
    protected LFGlobalObjectiveStateLocalService lfGlobalObjectiveStateLocalService;
    @BeanReference(type = LFGlobalObjectiveStatePersistence.class)
    protected LFGlobalObjectiveStatePersistence lfGlobalObjectiveStatePersistence;
    @BeanReference(type = LFObjectiveLocalService.class)
    protected LFObjectiveLocalService lfObjectiveLocalService;
    @BeanReference(type = LFObjectivePersistence.class)
    protected LFObjectivePersistence lfObjectivePersistence;
    @BeanReference(type = LFObjectiveMapLocalService.class)
    protected LFObjectiveMapLocalService lfObjectiveMapLocalService;
    @BeanReference(type = LFObjectiveMapPersistence.class)
    protected LFObjectiveMapPersistence lfObjectiveMapPersistence;
    @BeanReference(type = LFObjectiveStateLocalService.class)
    protected LFObjectiveStateLocalService lfObjectiveStateLocalService;
    @BeanReference(type = LFObjectiveStatePersistence.class)
    protected LFObjectiveStatePersistence lfObjectiveStatePersistence;
    @BeanReference(type = LFPackageLocalService.class)
    protected LFPackageLocalService lfPackageLocalService;
    @BeanReference(type = LFPackagePersistence.class)
    protected LFPackagePersistence lfPackagePersistence;
    @BeanReference(type = LFPackageScopeRuleLocalService.class)
    protected LFPackageScopeRuleLocalService lfPackageScopeRuleLocalService;
    @BeanReference(type = LFPackageScopeRulePersistence.class)
    protected LFPackageScopeRulePersistence lfPackageScopeRulePersistence;
    @BeanReference(type = LFPlayerScopeRuleLocalService.class)
    protected LFPlayerScopeRuleLocalService lfPlayerScopeRuleLocalService;
    @BeanReference(type = LFPlayerScopeRulePersistence.class)
    protected LFPlayerScopeRulePersistence lfPlayerScopeRulePersistence;
    @BeanReference(type = LFQuestionLocalService.class)
    protected LFQuestionLocalService lfQuestionLocalService;
    @BeanReference(type = LFQuestionPersistence.class)
    protected LFQuestionPersistence lfQuestionPersistence;
    @BeanReference(type = LFQuestionCategoryLocalService.class)
    protected LFQuestionCategoryLocalService lfQuestionCategoryLocalService;
    @BeanReference(type = LFQuestionCategoryPersistence.class)
    protected LFQuestionCategoryPersistence lfQuestionCategoryPersistence;
    @BeanReference(type = LFQuizLocalService.class)
    protected LFQuizLocalService lfQuizLocalService;
    @BeanReference(type = LFQuizPersistence.class)
    protected LFQuizPersistence lfQuizPersistence;
    @BeanReference(type = LFQuizQuestionLocalService.class)
    protected LFQuizQuestionLocalService lfQuizQuestionLocalService;
    @BeanReference(type = LFQuizQuestionPersistence.class)
    protected LFQuizQuestionPersistence lfQuizQuestionPersistence;
    @BeanReference(type = LFQuizQuestionCategoryLocalService.class)
    protected LFQuizQuestionCategoryLocalService lfQuizQuestionCategoryLocalService;
    @BeanReference(type = LFQuizQuestionCategoryPersistence.class)
    protected LFQuizQuestionCategoryPersistence lfQuizQuestionCategoryPersistence;
    @BeanReference(type = LFResourceLocalService.class)
    protected LFResourceLocalService lfResourceLocalService;
    @BeanReference(type = LFResourcePersistence.class)
    protected LFResourcePersistence lfResourcePersistence;
    @BeanReference(type = LFRollupContributionLocalService.class)
    protected LFRollupContributionLocalService lfRollupContributionLocalService;
    @BeanReference(type = LFRollupContributionPersistence.class)
    protected LFRollupContributionPersistence lfRollupContributionPersistence;
    @BeanReference(type = LFRollupRuleLocalService.class)
    protected LFRollupRuleLocalService lfRollupRuleLocalService;
    @BeanReference(type = LFRollupRulePersistence.class)
    protected LFRollupRulePersistence lfRollupRulePersistence;
    @BeanReference(type = LFRuleConditionLocalService.class)
    protected LFRuleConditionLocalService lfRuleConditionLocalService;
    @BeanReference(type = LFRuleConditionPersistence.class)
    protected LFRuleConditionPersistence lfRuleConditionPersistence;
    @BeanReference(type = LFSequencingLocalService.class)
    protected LFSequencingLocalService lfSequencingLocalService;
    @BeanReference(type = LFSequencingPersistence.class)
    protected LFSequencingPersistence lfSequencingPersistence;
    @BeanReference(type = LFSequencingPermissionsLocalService.class)
    protected LFSequencingPermissionsLocalService lfSequencingPermissionsLocalService;
    @BeanReference(type = LFSequencingPermissionsPersistence.class)
    protected LFSequencingPermissionsPersistence lfSequencingPermissionsPersistence;
    @BeanReference(type = LFSequencingTrackingLocalService.class)
    protected LFSequencingTrackingLocalService lfSequencingTrackingLocalService;
    @BeanReference(type = LFSequencingTrackingPersistence.class)
    protected LFSequencingTrackingPersistence lfSequencingTrackingPersistence;
    @BeanReference(type = LFUserLocalService.class)
    protected LFUserLocalService lfUserLocalService;
    @BeanReference(type = LFUserPersistence.class)
    protected LFUserPersistence lfUserPersistence;
    @BeanReference(type = CounterLocalService.class)
    protected CounterLocalService counterLocalService;
    @BeanReference(type = ResourceLocalService.class)
    protected ResourceLocalService resourceLocalService;
    @BeanReference(type = ResourceService.class)
    protected ResourceService resourceService;
    @BeanReference(type = ResourcePersistence.class)
    protected ResourcePersistence resourcePersistence;
    @BeanReference(type = UserLocalService.class)
    protected UserLocalService userLocalService;
    @BeanReference(type = UserService.class)
    protected UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private LFActivityStateLocalServiceClpInvoker _clpInvoker = new LFActivityStateLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link com.arcusys.learn.persistence.liferay.service.LFActivityStateLocalServiceUtil} to access the l f activity state local service.
     */

    /**
     * Adds the l f activity state to the database. Also notifies the appropriate model listeners.
     *
     * @param lfActivityState the l f activity state
     * @return the l f activity state that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    public LFActivityState addLFActivityState(LFActivityState lfActivityState)
        throws SystemException {
        lfActivityState.setNew(true);

        return lfActivityStatePersistence.update(lfActivityState, false);
    }

    /**
     * Creates a new l f activity state with the primary key. Does not add the l f activity state to the database.
     *
     * @param id the primary key for the new l f activity state
     * @return the new l f activity state
     */
    public LFActivityState createLFActivityState(long id) {
        return lfActivityStatePersistence.create(id);
    }

    /**
     * Deletes the l f activity state with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the l f activity state
     * @return the l f activity state that was removed
     * @throws PortalException if a l f activity state with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    public LFActivityState deleteLFActivityState(long id)
        throws PortalException, SystemException {
        return lfActivityStatePersistence.remove(id);
    }

    /**
     * Deletes the l f activity state from the database. Also notifies the appropriate model listeners.
     *
     * @param lfActivityState the l f activity state
     * @return the l f activity state that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    public LFActivityState deleteLFActivityState(
        LFActivityState lfActivityState) throws SystemException {
        return lfActivityStatePersistence.remove(lfActivityState);
    }

    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(LFActivityState.class,
            clazz.getClassLoader());
    }

    /**
     * Performs a dynamic query on the database and returns the matching rows.
     *
     * @param dynamicQuery the dynamic query
     * @return the matching rows
     * @throws SystemException if a system exception occurred
     */
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return lfActivityStatePersistence.findWithDynamicQuery(dynamicQuery);
    }

    /**
     * Performs a dynamic query on the database and returns a range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param dynamicQuery the dynamic query
     * @param start the lower bound of the range of model instances
     * @param end the upper bound of the range of model instances (not inclusive)
     * @return the range of matching rows
     * @throws SystemException if a system exception occurred
     */
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return lfActivityStatePersistence.findWithDynamicQuery(dynamicQuery,
            start, end);
    }

    /**
     * Performs a dynamic query on the database and returns an ordered range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param dynamicQuery the dynamic query
     * @param start the lower bound of the range of model instances
     * @param end the upper bound of the range of model instances (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching rows
     * @throws SystemException if a system exception occurred
     */
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return lfActivityStatePersistence.findWithDynamicQuery(dynamicQuery,
            start, end, orderByComparator);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return lfActivityStatePersistence.countWithDynamicQuery(dynamicQuery);
    }

    public LFActivityState fetchLFActivityState(long id)
        throws SystemException {
        return lfActivityStatePersistence.fetchByPrimaryKey(id);
    }

    /**
     * Returns the l f activity state with the primary key.
     *
     * @param id the primary key of the l f activity state
     * @return the l f activity state
     * @throws PortalException if a l f activity state with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public LFActivityState getLFActivityState(long id)
        throws PortalException, SystemException {
        return lfActivityStatePersistence.findByPrimaryKey(id);
    }

    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return lfActivityStatePersistence.findByPrimaryKey(primaryKeyObj);
    }

    /**
     * Returns a range of all the l f activity states.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param start the lower bound of the range of l f activity states
     * @param end the upper bound of the range of l f activity states (not inclusive)
     * @return the range of l f activity states
     * @throws SystemException if a system exception occurred
     */
    public List<LFActivityState> getLFActivityStates(int start, int end)
        throws SystemException {
        return lfActivityStatePersistence.findAll(start, end);
    }

    /**
     * Returns the number of l f activity states.
     *
     * @return the number of l f activity states
     * @throws SystemException if a system exception occurred
     */
    public int getLFActivityStatesCount() throws SystemException {
        return lfActivityStatePersistence.countAll();
    }

    /**
     * Updates the l f activity state in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param lfActivityState the l f activity state
     * @return the l f activity state that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    public LFActivityState updateLFActivityState(
        LFActivityState lfActivityState) throws SystemException {
        return updateLFActivityState(lfActivityState, true);
    }

    /**
     * Updates the l f activity state in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param lfActivityState the l f activity state
     * @param merge whether to merge the l f activity state with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
     * @return the l f activity state that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    public LFActivityState updateLFActivityState(
        LFActivityState lfActivityState, boolean merge)
        throws SystemException {
        lfActivityState.setNew(false);

        return lfActivityStatePersistence.update(lfActivityState, merge);
    }

    /**
     * Returns the l f activity local service.
     *
     * @return the l f activity local service
     */
    public LFActivityLocalService getLFActivityLocalService() {
        return lfActivityLocalService;
    }

    /**
     * Sets the l f activity local service.
     *
     * @param lfActivityLocalService the l f activity local service
     */
    public void setLFActivityLocalService(
        LFActivityLocalService lfActivityLocalService) {
        this.lfActivityLocalService = lfActivityLocalService;
    }

    /**
     * Returns the l f activity persistence.
     *
     * @return the l f activity persistence
     */
    public LFActivityPersistence getLFActivityPersistence() {
        return lfActivityPersistence;
    }

    /**
     * Sets the l f activity persistence.
     *
     * @param lfActivityPersistence the l f activity persistence
     */
    public void setLFActivityPersistence(
        LFActivityPersistence lfActivityPersistence) {
        this.lfActivityPersistence = lfActivityPersistence;
    }

    /**
     * Returns the l f activity data map local service.
     *
     * @return the l f activity data map local service
     */
    public LFActivityDataMapLocalService getLFActivityDataMapLocalService() {
        return lfActivityDataMapLocalService;
    }

    /**
     * Sets the l f activity data map local service.
     *
     * @param lfActivityDataMapLocalService the l f activity data map local service
     */
    public void setLFActivityDataMapLocalService(
        LFActivityDataMapLocalService lfActivityDataMapLocalService) {
        this.lfActivityDataMapLocalService = lfActivityDataMapLocalService;
    }

    /**
     * Returns the l f activity data map persistence.
     *
     * @return the l f activity data map persistence
     */
    public LFActivityDataMapPersistence getLFActivityDataMapPersistence() {
        return lfActivityDataMapPersistence;
    }

    /**
     * Sets the l f activity data map persistence.
     *
     * @param lfActivityDataMapPersistence the l f activity data map persistence
     */
    public void setLFActivityDataMapPersistence(
        LFActivityDataMapPersistence lfActivityDataMapPersistence) {
        this.lfActivityDataMapPersistence = lfActivityDataMapPersistence;
    }

    /**
     * Returns the l f activity state local service.
     *
     * @return the l f activity state local service
     */
    public LFActivityStateLocalService getLFActivityStateLocalService() {
        return lfActivityStateLocalService;
    }

    /**
     * Sets the l f activity state local service.
     *
     * @param lfActivityStateLocalService the l f activity state local service
     */
    public void setLFActivityStateLocalService(
        LFActivityStateLocalService lfActivityStateLocalService) {
        this.lfActivityStateLocalService = lfActivityStateLocalService;
    }

    /**
     * Returns the l f activity state persistence.
     *
     * @return the l f activity state persistence
     */
    public LFActivityStatePersistence getLFActivityStatePersistence() {
        return lfActivityStatePersistence;
    }

    /**
     * Sets the l f activity state persistence.
     *
     * @param lfActivityStatePersistence the l f activity state persistence
     */
    public void setLFActivityStatePersistence(
        LFActivityStatePersistence lfActivityStatePersistence) {
        this.lfActivityStatePersistence = lfActivityStatePersistence;
    }

    /**
     * Returns the l f activity state node local service.
     *
     * @return the l f activity state node local service
     */
    public LFActivityStateNodeLocalService getLFActivityStateNodeLocalService() {
        return lfActivityStateNodeLocalService;
    }

    /**
     * Sets the l f activity state node local service.
     *
     * @param lfActivityStateNodeLocalService the l f activity state node local service
     */
    public void setLFActivityStateNodeLocalService(
        LFActivityStateNodeLocalService lfActivityStateNodeLocalService) {
        this.lfActivityStateNodeLocalService = lfActivityStateNodeLocalService;
    }

    /**
     * Returns the l f activity state node persistence.
     *
     * @return the l f activity state node persistence
     */
    public LFActivityStateNodePersistence getLFActivityStateNodePersistence() {
        return lfActivityStateNodePersistence;
    }

    /**
     * Sets the l f activity state node persistence.
     *
     * @param lfActivityStateNodePersistence the l f activity state node persistence
     */
    public void setLFActivityStateNodePersistence(
        LFActivityStateNodePersistence lfActivityStateNodePersistence) {
        this.lfActivityStateNodePersistence = lfActivityStateNodePersistence;
    }

    /**
     * Returns the l f activity state tree local service.
     *
     * @return the l f activity state tree local service
     */
    public LFActivityStateTreeLocalService getLFActivityStateTreeLocalService() {
        return lfActivityStateTreeLocalService;
    }

    /**
     * Sets the l f activity state tree local service.
     *
     * @param lfActivityStateTreeLocalService the l f activity state tree local service
     */
    public void setLFActivityStateTreeLocalService(
        LFActivityStateTreeLocalService lfActivityStateTreeLocalService) {
        this.lfActivityStateTreeLocalService = lfActivityStateTreeLocalService;
    }

    /**
     * Returns the l f activity state tree persistence.
     *
     * @return the l f activity state tree persistence
     */
    public LFActivityStateTreePersistence getLFActivityStateTreePersistence() {
        return lfActivityStateTreePersistence;
    }

    /**
     * Sets the l f activity state tree persistence.
     *
     * @param lfActivityStateTreePersistence the l f activity state tree persistence
     */
    public void setLFActivityStateTreePersistence(
        LFActivityStateTreePersistence lfActivityStateTreePersistence) {
        this.lfActivityStateTreePersistence = lfActivityStateTreePersistence;
    }

    /**
     * Returns the l f answer local service.
     *
     * @return the l f answer local service
     */
    public LFAnswerLocalService getLFAnswerLocalService() {
        return lfAnswerLocalService;
    }

    /**
     * Sets the l f answer local service.
     *
     * @param lfAnswerLocalService the l f answer local service
     */
    public void setLFAnswerLocalService(
        LFAnswerLocalService lfAnswerLocalService) {
        this.lfAnswerLocalService = lfAnswerLocalService;
    }

    /**
     * Returns the l f answer persistence.
     *
     * @return the l f answer persistence
     */
    public LFAnswerPersistence getLFAnswerPersistence() {
        return lfAnswerPersistence;
    }

    /**
     * Sets the l f answer persistence.
     *
     * @param lfAnswerPersistence the l f answer persistence
     */
    public void setLFAnswerPersistence(LFAnswerPersistence lfAnswerPersistence) {
        this.lfAnswerPersistence = lfAnswerPersistence;
    }

    /**
     * Returns the l f attempt local service.
     *
     * @return the l f attempt local service
     */
    public LFAttemptLocalService getLFAttemptLocalService() {
        return lfAttemptLocalService;
    }

    /**
     * Sets the l f attempt local service.
     *
     * @param lfAttemptLocalService the l f attempt local service
     */
    public void setLFAttemptLocalService(
        LFAttemptLocalService lfAttemptLocalService) {
        this.lfAttemptLocalService = lfAttemptLocalService;
    }

    /**
     * Returns the l f attempt persistence.
     *
     * @return the l f attempt persistence
     */
    public LFAttemptPersistence getLFAttemptPersistence() {
        return lfAttemptPersistence;
    }

    /**
     * Sets the l f attempt persistence.
     *
     * @param lfAttemptPersistence the l f attempt persistence
     */
    public void setLFAttemptPersistence(
        LFAttemptPersistence lfAttemptPersistence) {
        this.lfAttemptPersistence = lfAttemptPersistence;
    }

    /**
     * Returns the l f attempt data local service.
     *
     * @return the l f attempt data local service
     */
    public LFAttemptDataLocalService getLFAttemptDataLocalService() {
        return lfAttemptDataLocalService;
    }

    /**
     * Sets the l f attempt data local service.
     *
     * @param lfAttemptDataLocalService the l f attempt data local service
     */
    public void setLFAttemptDataLocalService(
        LFAttemptDataLocalService lfAttemptDataLocalService) {
        this.lfAttemptDataLocalService = lfAttemptDataLocalService;
    }

    /**
     * Returns the l f attempt data persistence.
     *
     * @return the l f attempt data persistence
     */
    public LFAttemptDataPersistence getLFAttemptDataPersistence() {
        return lfAttemptDataPersistence;
    }

    /**
     * Sets the l f attempt data persistence.
     *
     * @param lfAttemptDataPersistence the l f attempt data persistence
     */
    public void setLFAttemptDataPersistence(
        LFAttemptDataPersistence lfAttemptDataPersistence) {
        this.lfAttemptDataPersistence = lfAttemptDataPersistence;
    }

    /**
     * Returns the l f big decimal local service.
     *
     * @return the l f big decimal local service
     */
    public LFBigDecimalLocalService getLFBigDecimalLocalService() {
        return lfBigDecimalLocalService;
    }

    /**
     * Sets the l f big decimal local service.
     *
     * @param lfBigDecimalLocalService the l f big decimal local service
     */
    public void setLFBigDecimalLocalService(
        LFBigDecimalLocalService lfBigDecimalLocalService) {
        this.lfBigDecimalLocalService = lfBigDecimalLocalService;
    }

    /**
     * Returns the l f big decimal persistence.
     *
     * @return the l f big decimal persistence
     */
    public LFBigDecimalPersistence getLFBigDecimalPersistence() {
        return lfBigDecimalPersistence;
    }

    /**
     * Sets the l f big decimal persistence.
     *
     * @param lfBigDecimalPersistence the l f big decimal persistence
     */
    public void setLFBigDecimalPersistence(
        LFBigDecimalPersistence lfBigDecimalPersistence) {
        this.lfBigDecimalPersistence = lfBigDecimalPersistence;
    }

    /**
     * Returns the l f children selection local service.
     *
     * @return the l f children selection local service
     */
    public LFChildrenSelectionLocalService getLFChildrenSelectionLocalService() {
        return lfChildrenSelectionLocalService;
    }

    /**
     * Sets the l f children selection local service.
     *
     * @param lfChildrenSelectionLocalService the l f children selection local service
     */
    public void setLFChildrenSelectionLocalService(
        LFChildrenSelectionLocalService lfChildrenSelectionLocalService) {
        this.lfChildrenSelectionLocalService = lfChildrenSelectionLocalService;
    }

    /**
     * Returns the l f children selection persistence.
     *
     * @return the l f children selection persistence
     */
    public LFChildrenSelectionPersistence getLFChildrenSelectionPersistence() {
        return lfChildrenSelectionPersistence;
    }

    /**
     * Sets the l f children selection persistence.
     *
     * @param lfChildrenSelectionPersistence the l f children selection persistence
     */
    public void setLFChildrenSelectionPersistence(
        LFChildrenSelectionPersistence lfChildrenSelectionPersistence) {
        this.lfChildrenSelectionPersistence = lfChildrenSelectionPersistence;
    }

    /**
     * Returns the l f condition rule local service.
     *
     * @return the l f condition rule local service
     */
    public LFConditionRuleLocalService getLFConditionRuleLocalService() {
        return lfConditionRuleLocalService;
    }

    /**
     * Sets the l f condition rule local service.
     *
     * @param lfConditionRuleLocalService the l f condition rule local service
     */
    public void setLFConditionRuleLocalService(
        LFConditionRuleLocalService lfConditionRuleLocalService) {
        this.lfConditionRuleLocalService = lfConditionRuleLocalService;
    }

    /**
     * Returns the l f condition rule persistence.
     *
     * @return the l f condition rule persistence
     */
    public LFConditionRulePersistence getLFConditionRulePersistence() {
        return lfConditionRulePersistence;
    }

    /**
     * Sets the l f condition rule persistence.
     *
     * @param lfConditionRulePersistence the l f condition rule persistence
     */
    public void setLFConditionRulePersistence(
        LFConditionRulePersistence lfConditionRulePersistence) {
        this.lfConditionRulePersistence = lfConditionRulePersistence;
    }

    /**
     * Returns the l f course local service.
     *
     * @return the l f course local service
     */
    public LFCourseLocalService getLFCourseLocalService() {
        return lfCourseLocalService;
    }

    /**
     * Sets the l f course local service.
     *
     * @param lfCourseLocalService the l f course local service
     */
    public void setLFCourseLocalService(
        LFCourseLocalService lfCourseLocalService) {
        this.lfCourseLocalService = lfCourseLocalService;
    }

    /**
     * Returns the l f course persistence.
     *
     * @return the l f course persistence
     */
    public LFCoursePersistence getLFCoursePersistence() {
        return lfCoursePersistence;
    }

    /**
     * Sets the l f course persistence.
     *
     * @param lfCoursePersistence the l f course persistence
     */
    public void setLFCoursePersistence(LFCoursePersistence lfCoursePersistence) {
        this.lfCoursePersistence = lfCoursePersistence;
    }

    /**
     * Returns the l f file storage local service.
     *
     * @return the l f file storage local service
     */
    public LFFileStorageLocalService getLFFileStorageLocalService() {
        return lfFileStorageLocalService;
    }

    /**
     * Sets the l f file storage local service.
     *
     * @param lfFileStorageLocalService the l f file storage local service
     */
    public void setLFFileStorageLocalService(
        LFFileStorageLocalService lfFileStorageLocalService) {
        this.lfFileStorageLocalService = lfFileStorageLocalService;
    }

    /**
     * Returns the l f file storage persistence.
     *
     * @return the l f file storage persistence
     */
    public LFFileStoragePersistence getLFFileStoragePersistence() {
        return lfFileStoragePersistence;
    }

    /**
     * Sets the l f file storage persistence.
     *
     * @param lfFileStoragePersistence the l f file storage persistence
     */
    public void setLFFileStoragePersistence(
        LFFileStoragePersistence lfFileStoragePersistence) {
        this.lfFileStoragePersistence = lfFileStoragePersistence;
    }

    /**
     * Returns the l f global objective state local service.
     *
     * @return the l f global objective state local service
     */
    public LFGlobalObjectiveStateLocalService getLFGlobalObjectiveStateLocalService() {
        return lfGlobalObjectiveStateLocalService;
    }

    /**
     * Sets the l f global objective state local service.
     *
     * @param lfGlobalObjectiveStateLocalService the l f global objective state local service
     */
    public void setLFGlobalObjectiveStateLocalService(
        LFGlobalObjectiveStateLocalService lfGlobalObjectiveStateLocalService) {
        this.lfGlobalObjectiveStateLocalService = lfGlobalObjectiveStateLocalService;
    }

    /**
     * Returns the l f global objective state persistence.
     *
     * @return the l f global objective state persistence
     */
    public LFGlobalObjectiveStatePersistence getLFGlobalObjectiveStatePersistence() {
        return lfGlobalObjectiveStatePersistence;
    }

    /**
     * Sets the l f global objective state persistence.
     *
     * @param lfGlobalObjectiveStatePersistence the l f global objective state persistence
     */
    public void setLFGlobalObjectiveStatePersistence(
        LFGlobalObjectiveStatePersistence lfGlobalObjectiveStatePersistence) {
        this.lfGlobalObjectiveStatePersistence = lfGlobalObjectiveStatePersistence;
    }

    /**
     * Returns the l f objective local service.
     *
     * @return the l f objective local service
     */
    public LFObjectiveLocalService getLFObjectiveLocalService() {
        return lfObjectiveLocalService;
    }

    /**
     * Sets the l f objective local service.
     *
     * @param lfObjectiveLocalService the l f objective local service
     */
    public void setLFObjectiveLocalService(
        LFObjectiveLocalService lfObjectiveLocalService) {
        this.lfObjectiveLocalService = lfObjectiveLocalService;
    }

    /**
     * Returns the l f objective persistence.
     *
     * @return the l f objective persistence
     */
    public LFObjectivePersistence getLFObjectivePersistence() {
        return lfObjectivePersistence;
    }

    /**
     * Sets the l f objective persistence.
     *
     * @param lfObjectivePersistence the l f objective persistence
     */
    public void setLFObjectivePersistence(
        LFObjectivePersistence lfObjectivePersistence) {
        this.lfObjectivePersistence = lfObjectivePersistence;
    }

    /**
     * Returns the l f objective map local service.
     *
     * @return the l f objective map local service
     */
    public LFObjectiveMapLocalService getLFObjectiveMapLocalService() {
        return lfObjectiveMapLocalService;
    }

    /**
     * Sets the l f objective map local service.
     *
     * @param lfObjectiveMapLocalService the l f objective map local service
     */
    public void setLFObjectiveMapLocalService(
        LFObjectiveMapLocalService lfObjectiveMapLocalService) {
        this.lfObjectiveMapLocalService = lfObjectiveMapLocalService;
    }

    /**
     * Returns the l f objective map persistence.
     *
     * @return the l f objective map persistence
     */
    public LFObjectiveMapPersistence getLFObjectiveMapPersistence() {
        return lfObjectiveMapPersistence;
    }

    /**
     * Sets the l f objective map persistence.
     *
     * @param lfObjectiveMapPersistence the l f objective map persistence
     */
    public void setLFObjectiveMapPersistence(
        LFObjectiveMapPersistence lfObjectiveMapPersistence) {
        this.lfObjectiveMapPersistence = lfObjectiveMapPersistence;
    }

    /**
     * Returns the l f objective state local service.
     *
     * @return the l f objective state local service
     */
    public LFObjectiveStateLocalService getLFObjectiveStateLocalService() {
        return lfObjectiveStateLocalService;
    }

    /**
     * Sets the l f objective state local service.
     *
     * @param lfObjectiveStateLocalService the l f objective state local service
     */
    public void setLFObjectiveStateLocalService(
        LFObjectiveStateLocalService lfObjectiveStateLocalService) {
        this.lfObjectiveStateLocalService = lfObjectiveStateLocalService;
    }

    /**
     * Returns the l f objective state persistence.
     *
     * @return the l f objective state persistence
     */
    public LFObjectiveStatePersistence getLFObjectiveStatePersistence() {
        return lfObjectiveStatePersistence;
    }

    /**
     * Sets the l f objective state persistence.
     *
     * @param lfObjectiveStatePersistence the l f objective state persistence
     */
    public void setLFObjectiveStatePersistence(
        LFObjectiveStatePersistence lfObjectiveStatePersistence) {
        this.lfObjectiveStatePersistence = lfObjectiveStatePersistence;
    }

    /**
     * Returns the l f package local service.
     *
     * @return the l f package local service
     */
    public LFPackageLocalService getLFPackageLocalService() {
        return lfPackageLocalService;
    }

    /**
     * Sets the l f package local service.
     *
     * @param lfPackageLocalService the l f package local service
     */
    public void setLFPackageLocalService(
        LFPackageLocalService lfPackageLocalService) {
        this.lfPackageLocalService = lfPackageLocalService;
    }

    /**
     * Returns the l f package persistence.
     *
     * @return the l f package persistence
     */
    public LFPackagePersistence getLFPackagePersistence() {
        return lfPackagePersistence;
    }

    /**
     * Sets the l f package persistence.
     *
     * @param lfPackagePersistence the l f package persistence
     */
    public void setLFPackagePersistence(
        LFPackagePersistence lfPackagePersistence) {
        this.lfPackagePersistence = lfPackagePersistence;
    }

    /**
     * Returns the l f package scope rule local service.
     *
     * @return the l f package scope rule local service
     */
    public LFPackageScopeRuleLocalService getLFPackageScopeRuleLocalService() {
        return lfPackageScopeRuleLocalService;
    }

    /**
     * Sets the l f package scope rule local service.
     *
     * @param lfPackageScopeRuleLocalService the l f package scope rule local service
     */
    public void setLFPackageScopeRuleLocalService(
        LFPackageScopeRuleLocalService lfPackageScopeRuleLocalService) {
        this.lfPackageScopeRuleLocalService = lfPackageScopeRuleLocalService;
    }

    /**
     * Returns the l f package scope rule persistence.
     *
     * @return the l f package scope rule persistence
     */
    public LFPackageScopeRulePersistence getLFPackageScopeRulePersistence() {
        return lfPackageScopeRulePersistence;
    }

    /**
     * Sets the l f package scope rule persistence.
     *
     * @param lfPackageScopeRulePersistence the l f package scope rule persistence
     */
    public void setLFPackageScopeRulePersistence(
        LFPackageScopeRulePersistence lfPackageScopeRulePersistence) {
        this.lfPackageScopeRulePersistence = lfPackageScopeRulePersistence;
    }

    /**
     * Returns the l f player scope rule local service.
     *
     * @return the l f player scope rule local service
     */
    public LFPlayerScopeRuleLocalService getLFPlayerScopeRuleLocalService() {
        return lfPlayerScopeRuleLocalService;
    }

    /**
     * Sets the l f player scope rule local service.
     *
     * @param lfPlayerScopeRuleLocalService the l f player scope rule local service
     */
    public void setLFPlayerScopeRuleLocalService(
        LFPlayerScopeRuleLocalService lfPlayerScopeRuleLocalService) {
        this.lfPlayerScopeRuleLocalService = lfPlayerScopeRuleLocalService;
    }

    /**
     * Returns the l f player scope rule persistence.
     *
     * @return the l f player scope rule persistence
     */
    public LFPlayerScopeRulePersistence getLFPlayerScopeRulePersistence() {
        return lfPlayerScopeRulePersistence;
    }

    /**
     * Sets the l f player scope rule persistence.
     *
     * @param lfPlayerScopeRulePersistence the l f player scope rule persistence
     */
    public void setLFPlayerScopeRulePersistence(
        LFPlayerScopeRulePersistence lfPlayerScopeRulePersistence) {
        this.lfPlayerScopeRulePersistence = lfPlayerScopeRulePersistence;
    }

    /**
     * Returns the l f question local service.
     *
     * @return the l f question local service
     */
    public LFQuestionLocalService getLFQuestionLocalService() {
        return lfQuestionLocalService;
    }

    /**
     * Sets the l f question local service.
     *
     * @param lfQuestionLocalService the l f question local service
     */
    public void setLFQuestionLocalService(
        LFQuestionLocalService lfQuestionLocalService) {
        this.lfQuestionLocalService = lfQuestionLocalService;
    }

    /**
     * Returns the l f question persistence.
     *
     * @return the l f question persistence
     */
    public LFQuestionPersistence getLFQuestionPersistence() {
        return lfQuestionPersistence;
    }

    /**
     * Sets the l f question persistence.
     *
     * @param lfQuestionPersistence the l f question persistence
     */
    public void setLFQuestionPersistence(
        LFQuestionPersistence lfQuestionPersistence) {
        this.lfQuestionPersistence = lfQuestionPersistence;
    }

    /**
     * Returns the l f question category local service.
     *
     * @return the l f question category local service
     */
    public LFQuestionCategoryLocalService getLFQuestionCategoryLocalService() {
        return lfQuestionCategoryLocalService;
    }

    /**
     * Sets the l f question category local service.
     *
     * @param lfQuestionCategoryLocalService the l f question category local service
     */
    public void setLFQuestionCategoryLocalService(
        LFQuestionCategoryLocalService lfQuestionCategoryLocalService) {
        this.lfQuestionCategoryLocalService = lfQuestionCategoryLocalService;
    }

    /**
     * Returns the l f question category persistence.
     *
     * @return the l f question category persistence
     */
    public LFQuestionCategoryPersistence getLFQuestionCategoryPersistence() {
        return lfQuestionCategoryPersistence;
    }

    /**
     * Sets the l f question category persistence.
     *
     * @param lfQuestionCategoryPersistence the l f question category persistence
     */
    public void setLFQuestionCategoryPersistence(
        LFQuestionCategoryPersistence lfQuestionCategoryPersistence) {
        this.lfQuestionCategoryPersistence = lfQuestionCategoryPersistence;
    }

    /**
     * Returns the l f quiz local service.
     *
     * @return the l f quiz local service
     */
    public LFQuizLocalService getLFQuizLocalService() {
        return lfQuizLocalService;
    }

    /**
     * Sets the l f quiz local service.
     *
     * @param lfQuizLocalService the l f quiz local service
     */
    public void setLFQuizLocalService(LFQuizLocalService lfQuizLocalService) {
        this.lfQuizLocalService = lfQuizLocalService;
    }

    /**
     * Returns the l f quiz persistence.
     *
     * @return the l f quiz persistence
     */
    public LFQuizPersistence getLFQuizPersistence() {
        return lfQuizPersistence;
    }

    /**
     * Sets the l f quiz persistence.
     *
     * @param lfQuizPersistence the l f quiz persistence
     */
    public void setLFQuizPersistence(LFQuizPersistence lfQuizPersistence) {
        this.lfQuizPersistence = lfQuizPersistence;
    }

    /**
     * Returns the l f quiz question local service.
     *
     * @return the l f quiz question local service
     */
    public LFQuizQuestionLocalService getLFQuizQuestionLocalService() {
        return lfQuizQuestionLocalService;
    }

    /**
     * Sets the l f quiz question local service.
     *
     * @param lfQuizQuestionLocalService the l f quiz question local service
     */
    public void setLFQuizQuestionLocalService(
        LFQuizQuestionLocalService lfQuizQuestionLocalService) {
        this.lfQuizQuestionLocalService = lfQuizQuestionLocalService;
    }

    /**
     * Returns the l f quiz question persistence.
     *
     * @return the l f quiz question persistence
     */
    public LFQuizQuestionPersistence getLFQuizQuestionPersistence() {
        return lfQuizQuestionPersistence;
    }

    /**
     * Sets the l f quiz question persistence.
     *
     * @param lfQuizQuestionPersistence the l f quiz question persistence
     */
    public void setLFQuizQuestionPersistence(
        LFQuizQuestionPersistence lfQuizQuestionPersistence) {
        this.lfQuizQuestionPersistence = lfQuizQuestionPersistence;
    }

    /**
     * Returns the l f quiz question category local service.
     *
     * @return the l f quiz question category local service
     */
    public LFQuizQuestionCategoryLocalService getLFQuizQuestionCategoryLocalService() {
        return lfQuizQuestionCategoryLocalService;
    }

    /**
     * Sets the l f quiz question category local service.
     *
     * @param lfQuizQuestionCategoryLocalService the l f quiz question category local service
     */
    public void setLFQuizQuestionCategoryLocalService(
        LFQuizQuestionCategoryLocalService lfQuizQuestionCategoryLocalService) {
        this.lfQuizQuestionCategoryLocalService = lfQuizQuestionCategoryLocalService;
    }

    /**
     * Returns the l f quiz question category persistence.
     *
     * @return the l f quiz question category persistence
     */
    public LFQuizQuestionCategoryPersistence getLFQuizQuestionCategoryPersistence() {
        return lfQuizQuestionCategoryPersistence;
    }

    /**
     * Sets the l f quiz question category persistence.
     *
     * @param lfQuizQuestionCategoryPersistence the l f quiz question category persistence
     */
    public void setLFQuizQuestionCategoryPersistence(
        LFQuizQuestionCategoryPersistence lfQuizQuestionCategoryPersistence) {
        this.lfQuizQuestionCategoryPersistence = lfQuizQuestionCategoryPersistence;
    }

    /**
     * Returns the l f resource local service.
     *
     * @return the l f resource local service
     */
    public LFResourceLocalService getLFResourceLocalService() {
        return lfResourceLocalService;
    }

    /**
     * Sets the l f resource local service.
     *
     * @param lfResourceLocalService the l f resource local service
     */
    public void setLFResourceLocalService(
        LFResourceLocalService lfResourceLocalService) {
        this.lfResourceLocalService = lfResourceLocalService;
    }

    /**
     * Returns the l f resource persistence.
     *
     * @return the l f resource persistence
     */
    public LFResourcePersistence getLFResourcePersistence() {
        return lfResourcePersistence;
    }

    /**
     * Sets the l f resource persistence.
     *
     * @param lfResourcePersistence the l f resource persistence
     */
    public void setLFResourcePersistence(
        LFResourcePersistence lfResourcePersistence) {
        this.lfResourcePersistence = lfResourcePersistence;
    }

    /**
     * Returns the l f rollup contribution local service.
     *
     * @return the l f rollup contribution local service
     */
    public LFRollupContributionLocalService getLFRollupContributionLocalService() {
        return lfRollupContributionLocalService;
    }

    /**
     * Sets the l f rollup contribution local service.
     *
     * @param lfRollupContributionLocalService the l f rollup contribution local service
     */
    public void setLFRollupContributionLocalService(
        LFRollupContributionLocalService lfRollupContributionLocalService) {
        this.lfRollupContributionLocalService = lfRollupContributionLocalService;
    }

    /**
     * Returns the l f rollup contribution persistence.
     *
     * @return the l f rollup contribution persistence
     */
    public LFRollupContributionPersistence getLFRollupContributionPersistence() {
        return lfRollupContributionPersistence;
    }

    /**
     * Sets the l f rollup contribution persistence.
     *
     * @param lfRollupContributionPersistence the l f rollup contribution persistence
     */
    public void setLFRollupContributionPersistence(
        LFRollupContributionPersistence lfRollupContributionPersistence) {
        this.lfRollupContributionPersistence = lfRollupContributionPersistence;
    }

    /**
     * Returns the l f rollup rule local service.
     *
     * @return the l f rollup rule local service
     */
    public LFRollupRuleLocalService getLFRollupRuleLocalService() {
        return lfRollupRuleLocalService;
    }

    /**
     * Sets the l f rollup rule local service.
     *
     * @param lfRollupRuleLocalService the l f rollup rule local service
     */
    public void setLFRollupRuleLocalService(
        LFRollupRuleLocalService lfRollupRuleLocalService) {
        this.lfRollupRuleLocalService = lfRollupRuleLocalService;
    }

    /**
     * Returns the l f rollup rule persistence.
     *
     * @return the l f rollup rule persistence
     */
    public LFRollupRulePersistence getLFRollupRulePersistence() {
        return lfRollupRulePersistence;
    }

    /**
     * Sets the l f rollup rule persistence.
     *
     * @param lfRollupRulePersistence the l f rollup rule persistence
     */
    public void setLFRollupRulePersistence(
        LFRollupRulePersistence lfRollupRulePersistence) {
        this.lfRollupRulePersistence = lfRollupRulePersistence;
    }

    /**
     * Returns the l f rule condition local service.
     *
     * @return the l f rule condition local service
     */
    public LFRuleConditionLocalService getLFRuleConditionLocalService() {
        return lfRuleConditionLocalService;
    }

    /**
     * Sets the l f rule condition local service.
     *
     * @param lfRuleConditionLocalService the l f rule condition local service
     */
    public void setLFRuleConditionLocalService(
        LFRuleConditionLocalService lfRuleConditionLocalService) {
        this.lfRuleConditionLocalService = lfRuleConditionLocalService;
    }

    /**
     * Returns the l f rule condition persistence.
     *
     * @return the l f rule condition persistence
     */
    public LFRuleConditionPersistence getLFRuleConditionPersistence() {
        return lfRuleConditionPersistence;
    }

    /**
     * Sets the l f rule condition persistence.
     *
     * @param lfRuleConditionPersistence the l f rule condition persistence
     */
    public void setLFRuleConditionPersistence(
        LFRuleConditionPersistence lfRuleConditionPersistence) {
        this.lfRuleConditionPersistence = lfRuleConditionPersistence;
    }

    /**
     * Returns the l f sequencing local service.
     *
     * @return the l f sequencing local service
     */
    public LFSequencingLocalService getLFSequencingLocalService() {
        return lfSequencingLocalService;
    }

    /**
     * Sets the l f sequencing local service.
     *
     * @param lfSequencingLocalService the l f sequencing local service
     */
    public void setLFSequencingLocalService(
        LFSequencingLocalService lfSequencingLocalService) {
        this.lfSequencingLocalService = lfSequencingLocalService;
    }

    /**
     * Returns the l f sequencing persistence.
     *
     * @return the l f sequencing persistence
     */
    public LFSequencingPersistence getLFSequencingPersistence() {
        return lfSequencingPersistence;
    }

    /**
     * Sets the l f sequencing persistence.
     *
     * @param lfSequencingPersistence the l f sequencing persistence
     */
    public void setLFSequencingPersistence(
        LFSequencingPersistence lfSequencingPersistence) {
        this.lfSequencingPersistence = lfSequencingPersistence;
    }

    /**
     * Returns the l f sequencing permissions local service.
     *
     * @return the l f sequencing permissions local service
     */
    public LFSequencingPermissionsLocalService getLFSequencingPermissionsLocalService() {
        return lfSequencingPermissionsLocalService;
    }

    /**
     * Sets the l f sequencing permissions local service.
     *
     * @param lfSequencingPermissionsLocalService the l f sequencing permissions local service
     */
    public void setLFSequencingPermissionsLocalService(
        LFSequencingPermissionsLocalService lfSequencingPermissionsLocalService) {
        this.lfSequencingPermissionsLocalService = lfSequencingPermissionsLocalService;
    }

    /**
     * Returns the l f sequencing permissions persistence.
     *
     * @return the l f sequencing permissions persistence
     */
    public LFSequencingPermissionsPersistence getLFSequencingPermissionsPersistence() {
        return lfSequencingPermissionsPersistence;
    }

    /**
     * Sets the l f sequencing permissions persistence.
     *
     * @param lfSequencingPermissionsPersistence the l f sequencing permissions persistence
     */
    public void setLFSequencingPermissionsPersistence(
        LFSequencingPermissionsPersistence lfSequencingPermissionsPersistence) {
        this.lfSequencingPermissionsPersistence = lfSequencingPermissionsPersistence;
    }

    /**
     * Returns the l f sequencing tracking local service.
     *
     * @return the l f sequencing tracking local service
     */
    public LFSequencingTrackingLocalService getLFSequencingTrackingLocalService() {
        return lfSequencingTrackingLocalService;
    }

    /**
     * Sets the l f sequencing tracking local service.
     *
     * @param lfSequencingTrackingLocalService the l f sequencing tracking local service
     */
    public void setLFSequencingTrackingLocalService(
        LFSequencingTrackingLocalService lfSequencingTrackingLocalService) {
        this.lfSequencingTrackingLocalService = lfSequencingTrackingLocalService;
    }

    /**
     * Returns the l f sequencing tracking persistence.
     *
     * @return the l f sequencing tracking persistence
     */
    public LFSequencingTrackingPersistence getLFSequencingTrackingPersistence() {
        return lfSequencingTrackingPersistence;
    }

    /**
     * Sets the l f sequencing tracking persistence.
     *
     * @param lfSequencingTrackingPersistence the l f sequencing tracking persistence
     */
    public void setLFSequencingTrackingPersistence(
        LFSequencingTrackingPersistence lfSequencingTrackingPersistence) {
        this.lfSequencingTrackingPersistence = lfSequencingTrackingPersistence;
    }

    /**
     * Returns the l f user local service.
     *
     * @return the l f user local service
     */
    public LFUserLocalService getLFUserLocalService() {
        return lfUserLocalService;
    }

    /**
     * Sets the l f user local service.
     *
     * @param lfUserLocalService the l f user local service
     */
    public void setLFUserLocalService(LFUserLocalService lfUserLocalService) {
        this.lfUserLocalService = lfUserLocalService;
    }

    /**
     * Returns the l f user persistence.
     *
     * @return the l f user persistence
     */
    public LFUserPersistence getLFUserPersistence() {
        return lfUserPersistence;
    }

    /**
     * Sets the l f user persistence.
     *
     * @param lfUserPersistence the l f user persistence
     */
    public void setLFUserPersistence(LFUserPersistence lfUserPersistence) {
        this.lfUserPersistence = lfUserPersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the resource remote service.
     *
     * @return the resource remote service
     */
    public ResourceService getResourceService() {
        return resourceService;
    }

    /**
     * Sets the resource remote service.
     *
     * @param resourceService the resource remote service
     */
    public void setResourceService(ResourceService resourceService) {
        this.resourceService = resourceService;
    }

    /**
     * Returns the resource persistence.
     *
     * @return the resource persistence
     */
    public ResourcePersistence getResourcePersistence() {
        return resourcePersistence;
    }

    /**
     * Sets the resource persistence.
     *
     * @param resourcePersistence the resource persistence
     */
    public void setResourcePersistence(ResourcePersistence resourcePersistence) {
        this.resourcePersistence = resourcePersistence;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        PersistedModelLocalServiceRegistryUtil.register("com.arcusys.learn.persistence.liferay.model.LFActivityState",
            lfActivityStateLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "com.arcusys.learn.persistence.liferay.model.LFActivityState");
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
    }

    protected Class<?> getModelClass() {
        return LFActivityState.class;
    }

    protected String getModelClassName() {
        return LFActivityState.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = lfActivityStatePersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}