package com.arcusys.learn.persistence.liferay.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LFConfigLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see LFConfigLocalService
 * @generated
 */
public class LFConfigLocalServiceWrapper implements LFConfigLocalService,
    ServiceWrapper<LFConfigLocalService> {
    private LFConfigLocalService _lfConfigLocalService;

    public LFConfigLocalServiceWrapper(
        LFConfigLocalService lfConfigLocalService) {
        _lfConfigLocalService = lfConfigLocalService;
    }

    /**
    * Adds the l f config to the database. Also notifies the appropriate model listeners.
    *
    * @param lfConfig the l f config
    * @return the l f config that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arcusys.learn.persistence.liferay.model.LFConfig addLFConfig(
        com.arcusys.learn.persistence.liferay.model.LFConfig lfConfig)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfConfigLocalService.addLFConfig(lfConfig);
    }

    /**
    * Creates a new l f config with the primary key. Does not add the l f config to the database.
    *
    * @param id the primary key for the new l f config
    * @return the new l f config
    */
    @Override
    public com.arcusys.learn.persistence.liferay.model.LFConfig createLFConfig(
        long id) {
        return _lfConfigLocalService.createLFConfig(id);
    }

    /**
    * Deletes the l f config with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the l f config
    * @return the l f config that was removed
    * @throws PortalException if a l f config with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arcusys.learn.persistence.liferay.model.LFConfig deleteLFConfig(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfConfigLocalService.deleteLFConfig(id);
    }

    /**
    * Deletes the l f config from the database. Also notifies the appropriate model listeners.
    *
    * @param lfConfig the l f config
    * @return the l f config that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arcusys.learn.persistence.liferay.model.LFConfig deleteLFConfig(
        com.arcusys.learn.persistence.liferay.model.LFConfig lfConfig)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfConfigLocalService.deleteLFConfig(lfConfig);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _lfConfigLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfConfigLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _lfConfigLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfConfigLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfConfigLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfConfigLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.arcusys.learn.persistence.liferay.model.LFConfig fetchLFConfig(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return _lfConfigLocalService.fetchLFConfig(id);
    }

    /**
    * Returns the l f config with the primary key.
    *
    * @param id the primary key of the l f config
    * @return the l f config
    * @throws PortalException if a l f config with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arcusys.learn.persistence.liferay.model.LFConfig getLFConfig(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfConfigLocalService.getLFConfig(id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfConfigLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the l f configs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of l f configs
    * @param end the upper bound of the range of l f configs (not inclusive)
    * @return the range of l f configs
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFConfig> getLFConfigs(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfConfigLocalService.getLFConfigs(start, end);
    }

    /**
    * Returns the number of l f configs.
    *
    * @return the number of l f configs
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getLFConfigsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfConfigLocalService.getLFConfigsCount();
    }

    /**
    * Updates the l f config in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param lfConfig the l f config
    * @return the l f config that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arcusys.learn.persistence.liferay.model.LFConfig updateLFConfig(
        com.arcusys.learn.persistence.liferay.model.LFConfig lfConfig)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfConfigLocalService.updateLFConfig(lfConfig);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _lfConfigLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _lfConfigLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _lfConfigLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public com.arcusys.learn.persistence.liferay.model.LFConfig createLFConfig()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfConfigLocalService.createLFConfig();
    }

    @Override
    public com.arcusys.learn.persistence.liferay.model.LFConfig findByKey(
        java.lang.String key)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfConfigLocalService.findByKey(key);
    }

    @Override
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        _lfConfigLocalService.removeAll();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public LFConfigLocalService getWrappedLFConfigLocalService() {
        return _lfConfigLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedLFConfigLocalService(
        LFConfigLocalService lfConfigLocalService) {
        _lfConfigLocalService = lfConfigLocalService;
    }

    @Override
    public LFConfigLocalService getWrappedService() {
        return _lfConfigLocalService;
    }

    @Override
    public void setWrappedService(LFConfigLocalService lfConfigLocalService) {
        _lfConfigLocalService = lfConfigLocalService;
    }
}
