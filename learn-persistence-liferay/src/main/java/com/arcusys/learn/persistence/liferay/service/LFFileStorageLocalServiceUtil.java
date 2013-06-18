package com.arcusys.learn.persistence.liferay.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the l f file storage local service. This utility wraps {@link com.arcusys.learn.persistence.liferay.service.impl.LFFileStorageLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFFileStorageLocalService
 * @see com.arcusys.learn.persistence.liferay.service.base.LFFileStorageLocalServiceBaseImpl
 * @see com.arcusys.learn.persistence.liferay.service.impl.LFFileStorageLocalServiceImpl
 * @generated
 */
public class LFFileStorageLocalServiceUtil {
    private static LFFileStorageLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.arcusys.learn.persistence.liferay.service.impl.LFFileStorageLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the l f file storage to the database. Also notifies the appropriate model listeners.
    *
    * @param lfFileStorage the l f file storage
    * @return the l f file storage that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFFileStorage addLFFileStorage(
        com.arcusys.learn.persistence.liferay.model.LFFileStorage lfFileStorage)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addLFFileStorage(lfFileStorage);
    }

    /**
    * Creates a new l f file storage with the primary key. Does not add the l f file storage to the database.
    *
    * @param id the primary key for the new l f file storage
    * @return the new l f file storage
    */
    public static com.arcusys.learn.persistence.liferay.model.LFFileStorage createLFFileStorage(
        long id) {
        return getService().createLFFileStorage(id);
    }

    /**
    * Deletes the l f file storage with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the l f file storage
    * @return the l f file storage that was removed
    * @throws PortalException if a l f file storage with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFFileStorage deleteLFFileStorage(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteLFFileStorage(id);
    }

    /**
    * Deletes the l f file storage from the database. Also notifies the appropriate model listeners.
    *
    * @param lfFileStorage the l f file storage
    * @return the l f file storage that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFFileStorage deleteLFFileStorage(
        com.arcusys.learn.persistence.liferay.model.LFFileStorage lfFileStorage)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteLFFileStorage(lfFileStorage);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
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
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
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
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    public static com.arcusys.learn.persistence.liferay.model.LFFileStorage fetchLFFileStorage(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchLFFileStorage(id);
    }

    /**
    * Returns the l f file storage with the primary key.
    *
    * @param id the primary key of the l f file storage
    * @return the l f file storage
    * @throws PortalException if a l f file storage with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFFileStorage getLFFileStorage(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getLFFileStorage(id);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the l f file storages.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of l f file storages
    * @param end the upper bound of the range of l f file storages (not inclusive)
    * @return the range of l f file storages
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFFileStorage> getLFFileStorages(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getLFFileStorages(start, end);
    }

    /**
    * Returns the number of l f file storages.
    *
    * @return the number of l f file storages
    * @throws SystemException if a system exception occurred
    */
    public static int getLFFileStoragesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getLFFileStoragesCount();
    }

    /**
    * Updates the l f file storage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param lfFileStorage the l f file storage
    * @return the l f file storage that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFFileStorage updateLFFileStorage(
        com.arcusys.learn.persistence.liferay.model.LFFileStorage lfFileStorage)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateLFFileStorage(lfFileStorage);
    }

    /**
    * Updates the l f file storage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param lfFileStorage the l f file storage
    * @param merge whether to merge the l f file storage with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
    * @return the l f file storage that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFFileStorage updateLFFileStorage(
        com.arcusys.learn.persistence.liferay.model.LFFileStorage lfFileStorage,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateLFFileStorage(lfFileStorage, merge);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static com.arcusys.learn.persistence.liferay.model.LFFileStorage createLFFileStorage()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().createLFFileStorage();
    }

    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFFileStorage> findByFilename(
        java.lang.String filename)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().findByFilename(filename);
    }

    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFFileStorage> findByFilename(
        java.lang.String filename, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().findByFilename(filename, start, end);
    }

    public static void removeByFilename(java.lang.String filename)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().removeByFilename(filename);
    }

    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFFileStorage> findByDirectory(
        java.lang.String filename)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().findByDirectory(filename);
    }

    public static void removeByDirectory(java.lang.String filename)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().removeByDirectory(filename);
    }

    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().removeAll();
    }

    public static void clearService() {
        _service = null;
    }

    public static LFFileStorageLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    LFFileStorageLocalService.class.getName());

            if (invokableLocalService instanceof LFFileStorageLocalService) {
                _service = (LFFileStorageLocalService) invokableLocalService;
            } else {
                _service = new LFFileStorageLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(LFFileStorageLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated
     */
    public void setService(LFFileStorageLocalService service) {
    }
}
