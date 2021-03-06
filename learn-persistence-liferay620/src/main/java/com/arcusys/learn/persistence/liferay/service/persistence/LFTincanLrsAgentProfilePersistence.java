package com.arcusys.learn.persistence.liferay.service.persistence;

import com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the l f tincan lrs agent profile service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFTincanLrsAgentProfilePersistenceImpl
 * @see LFTincanLrsAgentProfileUtil
 * @generated
 */
public interface LFTincanLrsAgentProfilePersistence extends BasePersistence<LFTincanLrsAgentProfile> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link LFTincanLrsAgentProfileUtil} to access the l f tincan lrs agent profile persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the l f tincan lrs agent profiles where profileId = &#63;.
    *
    * @param profileId the profile ID
    * @return the matching l f tincan lrs agent profiles
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile> findByProfileId(
        java.lang.String profileId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the l f tincan lrs agent profiles where profileId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFTincanLrsAgentProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param profileId the profile ID
    * @param start the lower bound of the range of l f tincan lrs agent profiles
    * @param end the upper bound of the range of l f tincan lrs agent profiles (not inclusive)
    * @return the range of matching l f tincan lrs agent profiles
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile> findByProfileId(
        java.lang.String profileId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the l f tincan lrs agent profiles where profileId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFTincanLrsAgentProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param profileId the profile ID
    * @param start the lower bound of the range of l f tincan lrs agent profiles
    * @param end the upper bound of the range of l f tincan lrs agent profiles (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching l f tincan lrs agent profiles
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile> findByProfileId(
        java.lang.String profileId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first l f tincan lrs agent profile in the ordered set where profileId = &#63;.
    *
    * @param profileId the profile ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching l f tincan lrs agent profile
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsAgentProfileException if a matching l f tincan lrs agent profile could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile findByProfileId_First(
        java.lang.String profileId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsAgentProfileException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first l f tincan lrs agent profile in the ordered set where profileId = &#63;.
    *
    * @param profileId the profile ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching l f tincan lrs agent profile, or <code>null</code> if a matching l f tincan lrs agent profile could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile fetchByProfileId_First(
        java.lang.String profileId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last l f tincan lrs agent profile in the ordered set where profileId = &#63;.
    *
    * @param profileId the profile ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching l f tincan lrs agent profile
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsAgentProfileException if a matching l f tincan lrs agent profile could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile findByProfileId_Last(
        java.lang.String profileId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsAgentProfileException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last l f tincan lrs agent profile in the ordered set where profileId = &#63;.
    *
    * @param profileId the profile ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching l f tincan lrs agent profile, or <code>null</code> if a matching l f tincan lrs agent profile could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile fetchByProfileId_Last(
        java.lang.String profileId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the l f tincan lrs agent profiles before and after the current l f tincan lrs agent profile in the ordered set where profileId = &#63;.
    *
    * @param id the primary key of the current l f tincan lrs agent profile
    * @param profileId the profile ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next l f tincan lrs agent profile
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsAgentProfileException if a l f tincan lrs agent profile with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile[] findByProfileId_PrevAndNext(
        long id, java.lang.String profileId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsAgentProfileException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the l f tincan lrs agent profiles where profileId = &#63; from the database.
    *
    * @param profileId the profile ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByProfileId(java.lang.String profileId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of l f tincan lrs agent profiles where profileId = &#63;.
    *
    * @param profileId the profile ID
    * @return the number of matching l f tincan lrs agent profiles
    * @throws SystemException if a system exception occurred
    */
    public int countByProfileId(java.lang.String profileId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the l f tincan lrs agent profile where agentId = &#63; and profileId = &#63; or throws a {@link com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsAgentProfileException} if it could not be found.
    *
    * @param agentId the agent ID
    * @param profileId the profile ID
    * @return the matching l f tincan lrs agent profile
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsAgentProfileException if a matching l f tincan lrs agent profile could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile findByAgentIdAndProfileId(
        java.lang.Integer agentId, java.lang.String profileId)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsAgentProfileException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the l f tincan lrs agent profile where agentId = &#63; and profileId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param agentId the agent ID
    * @param profileId the profile ID
    * @return the matching l f tincan lrs agent profile, or <code>null</code> if a matching l f tincan lrs agent profile could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile fetchByAgentIdAndProfileId(
        java.lang.Integer agentId, java.lang.String profileId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the l f tincan lrs agent profile where agentId = &#63; and profileId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param agentId the agent ID
    * @param profileId the profile ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching l f tincan lrs agent profile, or <code>null</code> if a matching l f tincan lrs agent profile could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile fetchByAgentIdAndProfileId(
        java.lang.Integer agentId, java.lang.String profileId,
        boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the l f tincan lrs agent profile where agentId = &#63; and profileId = &#63; from the database.
    *
    * @param agentId the agent ID
    * @param profileId the profile ID
    * @return the l f tincan lrs agent profile that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile removeByAgentIdAndProfileId(
        java.lang.Integer agentId, java.lang.String profileId)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsAgentProfileException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of l f tincan lrs agent profiles where agentId = &#63; and profileId = &#63;.
    *
    * @param agentId the agent ID
    * @param profileId the profile ID
    * @return the number of matching l f tincan lrs agent profiles
    * @throws SystemException if a system exception occurred
    */
    public int countByAgentIdAndProfileId(java.lang.Integer agentId,
        java.lang.String profileId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the l f tincan lrs agent profiles where agentId = &#63;.
    *
    * @param agentId the agent ID
    * @return the matching l f tincan lrs agent profiles
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile> findByAgentId(
        java.lang.Integer agentId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the l f tincan lrs agent profiles where agentId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFTincanLrsAgentProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param agentId the agent ID
    * @param start the lower bound of the range of l f tincan lrs agent profiles
    * @param end the upper bound of the range of l f tincan lrs agent profiles (not inclusive)
    * @return the range of matching l f tincan lrs agent profiles
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile> findByAgentId(
        java.lang.Integer agentId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the l f tincan lrs agent profiles where agentId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFTincanLrsAgentProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param agentId the agent ID
    * @param start the lower bound of the range of l f tincan lrs agent profiles
    * @param end the upper bound of the range of l f tincan lrs agent profiles (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching l f tincan lrs agent profiles
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile> findByAgentId(
        java.lang.Integer agentId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first l f tincan lrs agent profile in the ordered set where agentId = &#63;.
    *
    * @param agentId the agent ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching l f tincan lrs agent profile
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsAgentProfileException if a matching l f tincan lrs agent profile could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile findByAgentId_First(
        java.lang.Integer agentId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsAgentProfileException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first l f tincan lrs agent profile in the ordered set where agentId = &#63;.
    *
    * @param agentId the agent ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching l f tincan lrs agent profile, or <code>null</code> if a matching l f tincan lrs agent profile could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile fetchByAgentId_First(
        java.lang.Integer agentId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last l f tincan lrs agent profile in the ordered set where agentId = &#63;.
    *
    * @param agentId the agent ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching l f tincan lrs agent profile
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsAgentProfileException if a matching l f tincan lrs agent profile could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile findByAgentId_Last(
        java.lang.Integer agentId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsAgentProfileException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last l f tincan lrs agent profile in the ordered set where agentId = &#63;.
    *
    * @param agentId the agent ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching l f tincan lrs agent profile, or <code>null</code> if a matching l f tincan lrs agent profile could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile fetchByAgentId_Last(
        java.lang.Integer agentId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the l f tincan lrs agent profiles before and after the current l f tincan lrs agent profile in the ordered set where agentId = &#63;.
    *
    * @param id the primary key of the current l f tincan lrs agent profile
    * @param agentId the agent ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next l f tincan lrs agent profile
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsAgentProfileException if a l f tincan lrs agent profile with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile[] findByAgentId_PrevAndNext(
        long id, java.lang.Integer agentId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsAgentProfileException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the l f tincan lrs agent profiles where agentId = &#63; from the database.
    *
    * @param agentId the agent ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByAgentId(java.lang.Integer agentId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of l f tincan lrs agent profiles where agentId = &#63;.
    *
    * @param agentId the agent ID
    * @return the number of matching l f tincan lrs agent profiles
    * @throws SystemException if a system exception occurred
    */
    public int countByAgentId(java.lang.Integer agentId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the l f tincan lrs agent profile in the entity cache if it is enabled.
    *
    * @param lfTincanLrsAgentProfile the l f tincan lrs agent profile
    */
    public void cacheResult(
        com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile lfTincanLrsAgentProfile);

    /**
    * Caches the l f tincan lrs agent profiles in the entity cache if it is enabled.
    *
    * @param lfTincanLrsAgentProfiles the l f tincan lrs agent profiles
    */
    public void cacheResult(
        java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile> lfTincanLrsAgentProfiles);

    /**
    * Creates a new l f tincan lrs agent profile with the primary key. Does not add the l f tincan lrs agent profile to the database.
    *
    * @param id the primary key for the new l f tincan lrs agent profile
    * @return the new l f tincan lrs agent profile
    */
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile create(
        long id);

    /**
    * Removes the l f tincan lrs agent profile with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the l f tincan lrs agent profile
    * @return the l f tincan lrs agent profile that was removed
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsAgentProfileException if a l f tincan lrs agent profile with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile remove(
        long id)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsAgentProfileException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile updateImpl(
        com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile lfTincanLrsAgentProfile)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the l f tincan lrs agent profile with the primary key or throws a {@link com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsAgentProfileException} if it could not be found.
    *
    * @param id the primary key of the l f tincan lrs agent profile
    * @return the l f tincan lrs agent profile
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsAgentProfileException if a l f tincan lrs agent profile with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile findByPrimaryKey(
        long id)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsAgentProfileException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the l f tincan lrs agent profile with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the l f tincan lrs agent profile
    * @return the l f tincan lrs agent profile, or <code>null</code> if a l f tincan lrs agent profile with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the l f tincan lrs agent profiles.
    *
    * @return the l f tincan lrs agent profiles
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the l f tincan lrs agent profiles.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFTincanLrsAgentProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of l f tincan lrs agent profiles
    * @param end the upper bound of the range of l f tincan lrs agent profiles (not inclusive)
    * @return the range of l f tincan lrs agent profiles
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the l f tincan lrs agent profiles.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFTincanLrsAgentProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of l f tincan lrs agent profiles
    * @param end the upper bound of the range of l f tincan lrs agent profiles (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of l f tincan lrs agent profiles
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the l f tincan lrs agent profiles from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of l f tincan lrs agent profiles.
    *
    * @return the number of l f tincan lrs agent profiles
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
