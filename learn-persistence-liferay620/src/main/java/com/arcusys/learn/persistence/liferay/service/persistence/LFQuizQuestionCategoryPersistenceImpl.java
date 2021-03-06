package com.arcusys.learn.persistence.liferay.service.persistence;

import com.arcusys.learn.persistence.liferay.NoSuchLFQuizQuestionCategoryException;
import com.arcusys.learn.persistence.liferay.model.LFQuizQuestionCategory;
import com.arcusys.learn.persistence.liferay.model.impl.LFQuizQuestionCategoryImpl;
import com.arcusys.learn.persistence.liferay.model.impl.LFQuizQuestionCategoryModelImpl;
import com.arcusys.learn.persistence.liferay.service.persistence.LFQuizQuestionCategoryPersistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the l f quiz question category service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFQuizQuestionCategoryPersistence
 * @see LFQuizQuestionCategoryUtil
 * @generated
 */
public class LFQuizQuestionCategoryPersistenceImpl extends BasePersistenceImpl<LFQuizQuestionCategory>
    implements LFQuizQuestionCategoryPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link LFQuizQuestionCategoryUtil} to access the l f quiz question category persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = LFQuizQuestionCategoryImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LFQuizQuestionCategoryModelImpl.ENTITY_CACHE_ENABLED,
            LFQuizQuestionCategoryModelImpl.FINDER_CACHE_ENABLED,
            LFQuizQuestionCategoryImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LFQuizQuestionCategoryModelImpl.ENTITY_CACHE_ENABLED,
            LFQuizQuestionCategoryModelImpl.FINDER_CACHE_ENABLED,
            LFQuizQuestionCategoryImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LFQuizQuestionCategoryModelImpl.ENTITY_CACHE_ENABLED,
            LFQuizQuestionCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_QUIZIDANDPARENTID =
        new FinderPath(LFQuizQuestionCategoryModelImpl.ENTITY_CACHE_ENABLED,
            LFQuizQuestionCategoryModelImpl.FINDER_CACHE_ENABLED,
            LFQuizQuestionCategoryImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByQuizIdAndParentId",
            new String[] {
                Integer.class.getName(), Integer.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUIZIDANDPARENTID =
        new FinderPath(LFQuizQuestionCategoryModelImpl.ENTITY_CACHE_ENABLED,
            LFQuizQuestionCategoryModelImpl.FINDER_CACHE_ENABLED,
            LFQuizQuestionCategoryImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByQuizIdAndParentId",
            new String[] { Integer.class.getName(), Integer.class.getName() },
            LFQuizQuestionCategoryModelImpl.QUIZID_COLUMN_BITMASK |
            LFQuizQuestionCategoryModelImpl.PARENTID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_QUIZIDANDPARENTID = new FinderPath(LFQuizQuestionCategoryModelImpl.ENTITY_CACHE_ENABLED,
            LFQuizQuestionCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByQuizIdAndParentId",
            new String[] { Integer.class.getName(), Integer.class.getName() });
    private static final String _FINDER_COLUMN_QUIZIDANDPARENTID_QUIZID_NULL = "lfQuizQuestionCategory.quizId IS NULL";
    private static final String _FINDER_COLUMN_QUIZIDANDPARENTID_QUIZID_2 = "lfQuizQuestionCategory.quizId = ? AND ";
    private static final String _FINDER_COLUMN_QUIZIDANDPARENTID_QUIZID_NULL_2 = "lfQuizQuestionCategory.quizId IS NULL  AND ";
    private static final String _FINDER_COLUMN_QUIZIDANDPARENTID_PARENTID_NULL = "lfQuizQuestionCategory.parentId IS NULL";
    private static final String _FINDER_COLUMN_QUIZIDANDPARENTID_PARENTID_2 = "lfQuizQuestionCategory.parentId = ?";
    private static final String _FINDER_COLUMN_QUIZIDANDPARENTID_PARENTID_NULL_2 =
        "lfQuizQuestionCategory.parentId IS NULL ";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_QUIZID = new FinderPath(LFQuizQuestionCategoryModelImpl.ENTITY_CACHE_ENABLED,
            LFQuizQuestionCategoryModelImpl.FINDER_CACHE_ENABLED,
            LFQuizQuestionCategoryImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByQuizId",
            new String[] {
                Integer.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUIZID =
        new FinderPath(LFQuizQuestionCategoryModelImpl.ENTITY_CACHE_ENABLED,
            LFQuizQuestionCategoryModelImpl.FINDER_CACHE_ENABLED,
            LFQuizQuestionCategoryImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByQuizId",
            new String[] { Integer.class.getName() },
            LFQuizQuestionCategoryModelImpl.QUIZID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_QUIZID = new FinderPath(LFQuizQuestionCategoryModelImpl.ENTITY_CACHE_ENABLED,
            LFQuizQuestionCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByQuizId",
            new String[] { Integer.class.getName() });
    private static final String _FINDER_COLUMN_QUIZID_QUIZID_NULL = "lfQuizQuestionCategory.quizId IS NULL";
    private static final String _FINDER_COLUMN_QUIZID_QUIZID_2 = "lfQuizQuestionCategory.quizId = ?";
    private static final String _FINDER_COLUMN_QUIZID_QUIZID_NULL_2 = "lfQuizQuestionCategory.quizId IS NULL ";
    private static final String _SQL_SELECT_LFQUIZQUESTIONCATEGORY = "SELECT lfQuizQuestionCategory FROM LFQuizQuestionCategory lfQuizQuestionCategory";
    private static final String _SQL_SELECT_LFQUIZQUESTIONCATEGORY_WHERE = "SELECT lfQuizQuestionCategory FROM LFQuizQuestionCategory lfQuizQuestionCategory WHERE ";
    private static final String _SQL_COUNT_LFQUIZQUESTIONCATEGORY = "SELECT COUNT(lfQuizQuestionCategory) FROM LFQuizQuestionCategory lfQuizQuestionCategory";
    private static final String _SQL_COUNT_LFQUIZQUESTIONCATEGORY_WHERE = "SELECT COUNT(lfQuizQuestionCategory) FROM LFQuizQuestionCategory lfQuizQuestionCategory WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "lfQuizQuestionCategory.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LFQuizQuestionCategory exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No LFQuizQuestionCategory exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(LFQuizQuestionCategoryPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id"
            });
    private static LFQuizQuestionCategory _nullLFQuizQuestionCategory = new LFQuizQuestionCategoryImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<LFQuizQuestionCategory> toCacheModel() {
                return _nullLFQuizQuestionCategoryCacheModel;
            }
        };

    private static CacheModel<LFQuizQuestionCategory> _nullLFQuizQuestionCategoryCacheModel =
        new CacheModel<LFQuizQuestionCategory>() {
            @Override
            public LFQuizQuestionCategory toEntityModel() {
                return _nullLFQuizQuestionCategory;
            }
        };

    public LFQuizQuestionCategoryPersistenceImpl() {
        setModelClass(LFQuizQuestionCategory.class);
    }

    /**
     * Returns all the l f quiz question categories where quizId = &#63; and parentId = &#63;.
     *
     * @param quizId the quiz ID
     * @param parentId the parent ID
     * @return the matching l f quiz question categories
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<LFQuizQuestionCategory> findByQuizIdAndParentId(
        Integer quizId, Integer parentId) throws SystemException {
        return findByQuizIdAndParentId(quizId, parentId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the l f quiz question categories where quizId = &#63; and parentId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFQuizQuestionCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param quizId the quiz ID
     * @param parentId the parent ID
     * @param start the lower bound of the range of l f quiz question categories
     * @param end the upper bound of the range of l f quiz question categories (not inclusive)
     * @return the range of matching l f quiz question categories
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<LFQuizQuestionCategory> findByQuizIdAndParentId(
        Integer quizId, Integer parentId, int start, int end)
        throws SystemException {
        return findByQuizIdAndParentId(quizId, parentId, start, end, null);
    }

    /**
     * Returns an ordered range of all the l f quiz question categories where quizId = &#63; and parentId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFQuizQuestionCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param quizId the quiz ID
     * @param parentId the parent ID
     * @param start the lower bound of the range of l f quiz question categories
     * @param end the upper bound of the range of l f quiz question categories (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching l f quiz question categories
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<LFQuizQuestionCategory> findByQuizIdAndParentId(
        Integer quizId, Integer parentId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUIZIDANDPARENTID;
            finderArgs = new Object[] { quizId, parentId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_QUIZIDANDPARENTID;
            finderArgs = new Object[] {
                    quizId, parentId,
                    
                    start, end, orderByComparator
                };
        }

        List<LFQuizQuestionCategory> list = (List<LFQuizQuestionCategory>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (LFQuizQuestionCategory lfQuizQuestionCategory : list) {
                if (!Validator.equals(quizId, lfQuizQuestionCategory.getQuizId()) ||
                        !Validator.equals(parentId,
                            lfQuizQuestionCategory.getParentId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_LFQUIZQUESTIONCATEGORY_WHERE);

            if (quizId == null) {
                query.append(_FINDER_COLUMN_QUIZIDANDPARENTID_QUIZID_NULL_2);
            } else {
                query.append(_FINDER_COLUMN_QUIZIDANDPARENTID_QUIZID_2);
            }

            if (parentId == null) {
                query.append(_FINDER_COLUMN_QUIZIDANDPARENTID_PARENTID_NULL_2);
            } else {
                query.append(_FINDER_COLUMN_QUIZIDANDPARENTID_PARENTID_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(LFQuizQuestionCategoryModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (quizId != null) {
                    qPos.add(quizId.intValue());
                }

                if (parentId != null) {
                    qPos.add(parentId.intValue());
                }

                if (!pagination) {
                    list = (List<LFQuizQuestionCategory>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<LFQuizQuestionCategory>(list);
                } else {
                    list = (List<LFQuizQuestionCategory>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first l f quiz question category in the ordered set where quizId = &#63; and parentId = &#63;.
     *
     * @param quizId the quiz ID
     * @param parentId the parent ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching l f quiz question category
     * @throws com.arcusys.learn.persistence.liferay.NoSuchLFQuizQuestionCategoryException if a matching l f quiz question category could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LFQuizQuestionCategory findByQuizIdAndParentId_First(
        Integer quizId, Integer parentId, OrderByComparator orderByComparator)
        throws NoSuchLFQuizQuestionCategoryException, SystemException {
        LFQuizQuestionCategory lfQuizQuestionCategory = fetchByQuizIdAndParentId_First(quizId,
                parentId, orderByComparator);

        if (lfQuizQuestionCategory != null) {
            return lfQuizQuestionCategory;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("quizId=");
        msg.append(quizId);

        msg.append(", parentId=");
        msg.append(parentId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchLFQuizQuestionCategoryException(msg.toString());
    }

    /**
     * Returns the first l f quiz question category in the ordered set where quizId = &#63; and parentId = &#63;.
     *
     * @param quizId the quiz ID
     * @param parentId the parent ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching l f quiz question category, or <code>null</code> if a matching l f quiz question category could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LFQuizQuestionCategory fetchByQuizIdAndParentId_First(
        Integer quizId, Integer parentId, OrderByComparator orderByComparator)
        throws SystemException {
        List<LFQuizQuestionCategory> list = findByQuizIdAndParentId(quizId,
                parentId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last l f quiz question category in the ordered set where quizId = &#63; and parentId = &#63;.
     *
     * @param quizId the quiz ID
     * @param parentId the parent ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching l f quiz question category
     * @throws com.arcusys.learn.persistence.liferay.NoSuchLFQuizQuestionCategoryException if a matching l f quiz question category could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LFQuizQuestionCategory findByQuizIdAndParentId_Last(Integer quizId,
        Integer parentId, OrderByComparator orderByComparator)
        throws NoSuchLFQuizQuestionCategoryException, SystemException {
        LFQuizQuestionCategory lfQuizQuestionCategory = fetchByQuizIdAndParentId_Last(quizId,
                parentId, orderByComparator);

        if (lfQuizQuestionCategory != null) {
            return lfQuizQuestionCategory;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("quizId=");
        msg.append(quizId);

        msg.append(", parentId=");
        msg.append(parentId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchLFQuizQuestionCategoryException(msg.toString());
    }

    /**
     * Returns the last l f quiz question category in the ordered set where quizId = &#63; and parentId = &#63;.
     *
     * @param quizId the quiz ID
     * @param parentId the parent ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching l f quiz question category, or <code>null</code> if a matching l f quiz question category could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LFQuizQuestionCategory fetchByQuizIdAndParentId_Last(
        Integer quizId, Integer parentId, OrderByComparator orderByComparator)
        throws SystemException {
        int count = countByQuizIdAndParentId(quizId, parentId);

        if (count == 0) {
            return null;
        }

        List<LFQuizQuestionCategory> list = findByQuizIdAndParentId(quizId,
                parentId, count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the l f quiz question categories before and after the current l f quiz question category in the ordered set where quizId = &#63; and parentId = &#63;.
     *
     * @param id the primary key of the current l f quiz question category
     * @param quizId the quiz ID
     * @param parentId the parent ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next l f quiz question category
     * @throws com.arcusys.learn.persistence.liferay.NoSuchLFQuizQuestionCategoryException if a l f quiz question category with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LFQuizQuestionCategory[] findByQuizIdAndParentId_PrevAndNext(
        long id, Integer quizId, Integer parentId,
        OrderByComparator orderByComparator)
        throws NoSuchLFQuizQuestionCategoryException, SystemException {
        LFQuizQuestionCategory lfQuizQuestionCategory = findByPrimaryKey(id);

        Session session = null;

        try {
            session = openSession();

            LFQuizQuestionCategory[] array = new LFQuizQuestionCategoryImpl[3];

            array[0] = getByQuizIdAndParentId_PrevAndNext(session,
                    lfQuizQuestionCategory, quizId, parentId,
                    orderByComparator, true);

            array[1] = lfQuizQuestionCategory;

            array[2] = getByQuizIdAndParentId_PrevAndNext(session,
                    lfQuizQuestionCategory, quizId, parentId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected LFQuizQuestionCategory getByQuizIdAndParentId_PrevAndNext(
        Session session, LFQuizQuestionCategory lfQuizQuestionCategory,
        Integer quizId, Integer parentId, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_LFQUIZQUESTIONCATEGORY_WHERE);

        if (quizId == null) {
            query.append(_FINDER_COLUMN_QUIZIDANDPARENTID_QUIZID_NULL_2);
        } else {
            query.append(_FINDER_COLUMN_QUIZIDANDPARENTID_QUIZID_2);
        }

        if (parentId == null) {
            query.append(_FINDER_COLUMN_QUIZIDANDPARENTID_PARENTID_NULL_2);
        } else {
            query.append(_FINDER_COLUMN_QUIZIDANDPARENTID_PARENTID_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(LFQuizQuestionCategoryModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (quizId != null) {
            qPos.add(quizId.intValue());
        }

        if (parentId != null) {
            qPos.add(parentId.intValue());
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(lfQuizQuestionCategory);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<LFQuizQuestionCategory> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the l f quiz question categories where quizId = &#63; and parentId = &#63; from the database.
     *
     * @param quizId the quiz ID
     * @param parentId the parent ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByQuizIdAndParentId(Integer quizId, Integer parentId)
        throws SystemException {
        for (LFQuizQuestionCategory lfQuizQuestionCategory : findByQuizIdAndParentId(
                quizId, parentId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(lfQuizQuestionCategory);
        }
    }

    /**
     * Returns the number of l f quiz question categories where quizId = &#63; and parentId = &#63;.
     *
     * @param quizId the quiz ID
     * @param parentId the parent ID
     * @return the number of matching l f quiz question categories
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByQuizIdAndParentId(Integer quizId, Integer parentId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_QUIZIDANDPARENTID;

        Object[] finderArgs = new Object[] { quizId, parentId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_LFQUIZQUESTIONCATEGORY_WHERE);

            if (quizId == null) {
                query.append(_FINDER_COLUMN_QUIZIDANDPARENTID_QUIZID_NULL_2);
            } else {
                query.append(_FINDER_COLUMN_QUIZIDANDPARENTID_QUIZID_2);
            }

            if (parentId == null) {
                query.append(_FINDER_COLUMN_QUIZIDANDPARENTID_PARENTID_NULL_2);
            } else {
                query.append(_FINDER_COLUMN_QUIZIDANDPARENTID_PARENTID_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (quizId != null) {
                    qPos.add(quizId.intValue());
                }

                if (parentId != null) {
                    qPos.add(parentId.intValue());
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the l f quiz question categories where quizId = &#63;.
     *
     * @param quizId the quiz ID
     * @return the matching l f quiz question categories
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<LFQuizQuestionCategory> findByQuizId(Integer quizId)
        throws SystemException {
        return findByQuizId(quizId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the l f quiz question categories where quizId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFQuizQuestionCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param quizId the quiz ID
     * @param start the lower bound of the range of l f quiz question categories
     * @param end the upper bound of the range of l f quiz question categories (not inclusive)
     * @return the range of matching l f quiz question categories
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<LFQuizQuestionCategory> findByQuizId(Integer quizId, int start,
        int end) throws SystemException {
        return findByQuizId(quizId, start, end, null);
    }

    /**
     * Returns an ordered range of all the l f quiz question categories where quizId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFQuizQuestionCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param quizId the quiz ID
     * @param start the lower bound of the range of l f quiz question categories
     * @param end the upper bound of the range of l f quiz question categories (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching l f quiz question categories
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<LFQuizQuestionCategory> findByQuizId(Integer quizId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUIZID;
            finderArgs = new Object[] { quizId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_QUIZID;
            finderArgs = new Object[] { quizId, start, end, orderByComparator };
        }

        List<LFQuizQuestionCategory> list = (List<LFQuizQuestionCategory>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (LFQuizQuestionCategory lfQuizQuestionCategory : list) {
                if (!Validator.equals(quizId, lfQuizQuestionCategory.getQuizId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_LFQUIZQUESTIONCATEGORY_WHERE);

            if (quizId == null) {
                query.append(_FINDER_COLUMN_QUIZID_QUIZID_NULL_2);
            } else {
                query.append(_FINDER_COLUMN_QUIZID_QUIZID_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(LFQuizQuestionCategoryModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (quizId != null) {
                    qPos.add(quizId.intValue());
                }

                if (!pagination) {
                    list = (List<LFQuizQuestionCategory>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<LFQuizQuestionCategory>(list);
                } else {
                    list = (List<LFQuizQuestionCategory>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first l f quiz question category in the ordered set where quizId = &#63;.
     *
     * @param quizId the quiz ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching l f quiz question category
     * @throws com.arcusys.learn.persistence.liferay.NoSuchLFQuizQuestionCategoryException if a matching l f quiz question category could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LFQuizQuestionCategory findByQuizId_First(Integer quizId,
        OrderByComparator orderByComparator)
        throws NoSuchLFQuizQuestionCategoryException, SystemException {
        LFQuizQuestionCategory lfQuizQuestionCategory = fetchByQuizId_First(quizId,
                orderByComparator);

        if (lfQuizQuestionCategory != null) {
            return lfQuizQuestionCategory;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("quizId=");
        msg.append(quizId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchLFQuizQuestionCategoryException(msg.toString());
    }

    /**
     * Returns the first l f quiz question category in the ordered set where quizId = &#63;.
     *
     * @param quizId the quiz ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching l f quiz question category, or <code>null</code> if a matching l f quiz question category could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LFQuizQuestionCategory fetchByQuizId_First(Integer quizId,
        OrderByComparator orderByComparator) throws SystemException {
        List<LFQuizQuestionCategory> list = findByQuizId(quizId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last l f quiz question category in the ordered set where quizId = &#63;.
     *
     * @param quizId the quiz ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching l f quiz question category
     * @throws com.arcusys.learn.persistence.liferay.NoSuchLFQuizQuestionCategoryException if a matching l f quiz question category could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LFQuizQuestionCategory findByQuizId_Last(Integer quizId,
        OrderByComparator orderByComparator)
        throws NoSuchLFQuizQuestionCategoryException, SystemException {
        LFQuizQuestionCategory lfQuizQuestionCategory = fetchByQuizId_Last(quizId,
                orderByComparator);

        if (lfQuizQuestionCategory != null) {
            return lfQuizQuestionCategory;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("quizId=");
        msg.append(quizId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchLFQuizQuestionCategoryException(msg.toString());
    }

    /**
     * Returns the last l f quiz question category in the ordered set where quizId = &#63;.
     *
     * @param quizId the quiz ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching l f quiz question category, or <code>null</code> if a matching l f quiz question category could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LFQuizQuestionCategory fetchByQuizId_Last(Integer quizId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByQuizId(quizId);

        if (count == 0) {
            return null;
        }

        List<LFQuizQuestionCategory> list = findByQuizId(quizId, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the l f quiz question categories before and after the current l f quiz question category in the ordered set where quizId = &#63;.
     *
     * @param id the primary key of the current l f quiz question category
     * @param quizId the quiz ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next l f quiz question category
     * @throws com.arcusys.learn.persistence.liferay.NoSuchLFQuizQuestionCategoryException if a l f quiz question category with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LFQuizQuestionCategory[] findByQuizId_PrevAndNext(long id,
        Integer quizId, OrderByComparator orderByComparator)
        throws NoSuchLFQuizQuestionCategoryException, SystemException {
        LFQuizQuestionCategory lfQuizQuestionCategory = findByPrimaryKey(id);

        Session session = null;

        try {
            session = openSession();

            LFQuizQuestionCategory[] array = new LFQuizQuestionCategoryImpl[3];

            array[0] = getByQuizId_PrevAndNext(session, lfQuizQuestionCategory,
                    quizId, orderByComparator, true);

            array[1] = lfQuizQuestionCategory;

            array[2] = getByQuizId_PrevAndNext(session, lfQuizQuestionCategory,
                    quizId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected LFQuizQuestionCategory getByQuizId_PrevAndNext(Session session,
        LFQuizQuestionCategory lfQuizQuestionCategory, Integer quizId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_LFQUIZQUESTIONCATEGORY_WHERE);

        if (quizId == null) {
            query.append(_FINDER_COLUMN_QUIZID_QUIZID_NULL_2);
        } else {
            query.append(_FINDER_COLUMN_QUIZID_QUIZID_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(LFQuizQuestionCategoryModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (quizId != null) {
            qPos.add(quizId.intValue());
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(lfQuizQuestionCategory);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<LFQuizQuestionCategory> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the l f quiz question categories where quizId = &#63; from the database.
     *
     * @param quizId the quiz ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByQuizId(Integer quizId) throws SystemException {
        for (LFQuizQuestionCategory lfQuizQuestionCategory : findByQuizId(
                quizId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(lfQuizQuestionCategory);
        }
    }

    /**
     * Returns the number of l f quiz question categories where quizId = &#63;.
     *
     * @param quizId the quiz ID
     * @return the number of matching l f quiz question categories
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByQuizId(Integer quizId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_QUIZID;

        Object[] finderArgs = new Object[] { quizId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_LFQUIZQUESTIONCATEGORY_WHERE);

            if (quizId == null) {
                query.append(_FINDER_COLUMN_QUIZID_QUIZID_NULL_2);
            } else {
                query.append(_FINDER_COLUMN_QUIZID_QUIZID_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (quizId != null) {
                    qPos.add(quizId.intValue());
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the l f quiz question category in the entity cache if it is enabled.
     *
     * @param lfQuizQuestionCategory the l f quiz question category
     */
    @Override
    public void cacheResult(LFQuizQuestionCategory lfQuizQuestionCategory) {
        EntityCacheUtil.putResult(LFQuizQuestionCategoryModelImpl.ENTITY_CACHE_ENABLED,
            LFQuizQuestionCategoryImpl.class,
            lfQuizQuestionCategory.getPrimaryKey(), lfQuizQuestionCategory);

        lfQuizQuestionCategory.resetOriginalValues();
    }

    /**
     * Caches the l f quiz question categories in the entity cache if it is enabled.
     *
     * @param lfQuizQuestionCategories the l f quiz question categories
     */
    @Override
    public void cacheResult(
        List<LFQuizQuestionCategory> lfQuizQuestionCategories) {
        for (LFQuizQuestionCategory lfQuizQuestionCategory : lfQuizQuestionCategories) {
            if (EntityCacheUtil.getResult(
                        LFQuizQuestionCategoryModelImpl.ENTITY_CACHE_ENABLED,
                        LFQuizQuestionCategoryImpl.class,
                        lfQuizQuestionCategory.getPrimaryKey()) == null) {
                cacheResult(lfQuizQuestionCategory);
            } else {
                lfQuizQuestionCategory.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all l f quiz question categories.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(LFQuizQuestionCategoryImpl.class.getName());
        }

        EntityCacheUtil.clearCache(LFQuizQuestionCategoryImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the l f quiz question category.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(LFQuizQuestionCategory lfQuizQuestionCategory) {
        EntityCacheUtil.removeResult(LFQuizQuestionCategoryModelImpl.ENTITY_CACHE_ENABLED,
            LFQuizQuestionCategoryImpl.class,
            lfQuizQuestionCategory.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(
        List<LFQuizQuestionCategory> lfQuizQuestionCategories) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (LFQuizQuestionCategory lfQuizQuestionCategory : lfQuizQuestionCategories) {
            EntityCacheUtil.removeResult(LFQuizQuestionCategoryModelImpl.ENTITY_CACHE_ENABLED,
                LFQuizQuestionCategoryImpl.class,
                lfQuizQuestionCategory.getPrimaryKey());
        }
    }

    /**
     * Creates a new l f quiz question category with the primary key. Does not add the l f quiz question category to the database.
     *
     * @param id the primary key for the new l f quiz question category
     * @return the new l f quiz question category
     */
    @Override
    public LFQuizQuestionCategory create(long id) {
        LFQuizQuestionCategory lfQuizQuestionCategory = new LFQuizQuestionCategoryImpl();

        lfQuizQuestionCategory.setNew(true);
        lfQuizQuestionCategory.setPrimaryKey(id);

        return lfQuizQuestionCategory;
    }

    /**
     * Removes the l f quiz question category with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the l f quiz question category
     * @return the l f quiz question category that was removed
     * @throws com.arcusys.learn.persistence.liferay.NoSuchLFQuizQuestionCategoryException if a l f quiz question category with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LFQuizQuestionCategory remove(long id)
        throws NoSuchLFQuizQuestionCategoryException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the l f quiz question category with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the l f quiz question category
     * @return the l f quiz question category that was removed
     * @throws com.arcusys.learn.persistence.liferay.NoSuchLFQuizQuestionCategoryException if a l f quiz question category with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LFQuizQuestionCategory remove(Serializable primaryKey)
        throws NoSuchLFQuizQuestionCategoryException, SystemException {
        Session session = null;

        try {
            session = openSession();

            LFQuizQuestionCategory lfQuizQuestionCategory = (LFQuizQuestionCategory) session.get(LFQuizQuestionCategoryImpl.class,
                    primaryKey);

            if (lfQuizQuestionCategory == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchLFQuizQuestionCategoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(lfQuizQuestionCategory);
        } catch (NoSuchLFQuizQuestionCategoryException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected LFQuizQuestionCategory removeImpl(
        LFQuizQuestionCategory lfQuizQuestionCategory)
        throws SystemException {
        lfQuizQuestionCategory = toUnwrappedModel(lfQuizQuestionCategory);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(lfQuizQuestionCategory)) {
                lfQuizQuestionCategory = (LFQuizQuestionCategory) session.get(LFQuizQuestionCategoryImpl.class,
                        lfQuizQuestionCategory.getPrimaryKeyObj());
            }

            if (lfQuizQuestionCategory != null) {
                session.delete(lfQuizQuestionCategory);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (lfQuizQuestionCategory != null) {
            clearCache(lfQuizQuestionCategory);
        }

        return lfQuizQuestionCategory;
    }

    @Override
    public LFQuizQuestionCategory updateImpl(
        com.arcusys.learn.persistence.liferay.model.LFQuizQuestionCategory lfQuizQuestionCategory)
        throws SystemException {
        lfQuizQuestionCategory = toUnwrappedModel(lfQuizQuestionCategory);

        boolean isNew = lfQuizQuestionCategory.isNew();

        LFQuizQuestionCategoryModelImpl lfQuizQuestionCategoryModelImpl = (LFQuizQuestionCategoryModelImpl) lfQuizQuestionCategory;

        Session session = null;

        try {
            session = openSession();

            if (lfQuizQuestionCategory.isNew()) {
                session.save(lfQuizQuestionCategory);

                lfQuizQuestionCategory.setNew(false);
            } else {
                session.merge(lfQuizQuestionCategory);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !LFQuizQuestionCategoryModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((lfQuizQuestionCategoryModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUIZIDANDPARENTID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        lfQuizQuestionCategoryModelImpl.getOriginalQuizId(),
                        lfQuizQuestionCategoryModelImpl.getOriginalParentId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_QUIZIDANDPARENTID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUIZIDANDPARENTID,
                    args);

                args = new Object[] {
                        lfQuizQuestionCategoryModelImpl.getQuizId(),
                        lfQuizQuestionCategoryModelImpl.getParentId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_QUIZIDANDPARENTID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUIZIDANDPARENTID,
                    args);
            }

            if ((lfQuizQuestionCategoryModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUIZID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        lfQuizQuestionCategoryModelImpl.getOriginalQuizId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_QUIZID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUIZID,
                    args);

                args = new Object[] { lfQuizQuestionCategoryModelImpl.getQuizId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_QUIZID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUIZID,
                    args);
            }
        }

        EntityCacheUtil.putResult(LFQuizQuestionCategoryModelImpl.ENTITY_CACHE_ENABLED,
            LFQuizQuestionCategoryImpl.class,
            lfQuizQuestionCategory.getPrimaryKey(), lfQuizQuestionCategory);

        return lfQuizQuestionCategory;
    }

    protected LFQuizQuestionCategory toUnwrappedModel(
        LFQuizQuestionCategory lfQuizQuestionCategory) {
        if (lfQuizQuestionCategory instanceof LFQuizQuestionCategoryImpl) {
            return lfQuizQuestionCategory;
        }

        LFQuizQuestionCategoryImpl lfQuizQuestionCategoryImpl = new LFQuizQuestionCategoryImpl();

        lfQuizQuestionCategoryImpl.setNew(lfQuizQuestionCategory.isNew());
        lfQuizQuestionCategoryImpl.setPrimaryKey(lfQuizQuestionCategory.getPrimaryKey());

        lfQuizQuestionCategoryImpl.setId(lfQuizQuestionCategory.getId());
        lfQuizQuestionCategoryImpl.setTitle(lfQuizQuestionCategory.getTitle());
        lfQuizQuestionCategoryImpl.setDescription(lfQuizQuestionCategory.getDescription());
        lfQuizQuestionCategoryImpl.setQuizId(lfQuizQuestionCategory.getQuizId());
        lfQuizQuestionCategoryImpl.setParentId(lfQuizQuestionCategory.getParentId());
        lfQuizQuestionCategoryImpl.setArrangementIndex(lfQuizQuestionCategory.getArrangementIndex());

        return lfQuizQuestionCategoryImpl;
    }

    /**
     * Returns the l f quiz question category with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the l f quiz question category
     * @return the l f quiz question category
     * @throws com.arcusys.learn.persistence.liferay.NoSuchLFQuizQuestionCategoryException if a l f quiz question category with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LFQuizQuestionCategory findByPrimaryKey(Serializable primaryKey)
        throws NoSuchLFQuizQuestionCategoryException, SystemException {
        LFQuizQuestionCategory lfQuizQuestionCategory = fetchByPrimaryKey(primaryKey);

        if (lfQuizQuestionCategory == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchLFQuizQuestionCategoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return lfQuizQuestionCategory;
    }

    /**
     * Returns the l f quiz question category with the primary key or throws a {@link com.arcusys.learn.persistence.liferay.NoSuchLFQuizQuestionCategoryException} if it could not be found.
     *
     * @param id the primary key of the l f quiz question category
     * @return the l f quiz question category
     * @throws com.arcusys.learn.persistence.liferay.NoSuchLFQuizQuestionCategoryException if a l f quiz question category with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LFQuizQuestionCategory findByPrimaryKey(long id)
        throws NoSuchLFQuizQuestionCategoryException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the l f quiz question category with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the l f quiz question category
     * @return the l f quiz question category, or <code>null</code> if a l f quiz question category with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LFQuizQuestionCategory fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        LFQuizQuestionCategory lfQuizQuestionCategory = (LFQuizQuestionCategory) EntityCacheUtil.getResult(LFQuizQuestionCategoryModelImpl.ENTITY_CACHE_ENABLED,
                LFQuizQuestionCategoryImpl.class, primaryKey);

        if (lfQuizQuestionCategory == _nullLFQuizQuestionCategory) {
            return null;
        }

        if (lfQuizQuestionCategory == null) {
            Session session = null;

            try {
                session = openSession();

                lfQuizQuestionCategory = (LFQuizQuestionCategory) session.get(LFQuizQuestionCategoryImpl.class,
                        primaryKey);

                if (lfQuizQuestionCategory != null) {
                    cacheResult(lfQuizQuestionCategory);
                } else {
                    EntityCacheUtil.putResult(LFQuizQuestionCategoryModelImpl.ENTITY_CACHE_ENABLED,
                        LFQuizQuestionCategoryImpl.class, primaryKey,
                        _nullLFQuizQuestionCategory);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(LFQuizQuestionCategoryModelImpl.ENTITY_CACHE_ENABLED,
                    LFQuizQuestionCategoryImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return lfQuizQuestionCategory;
    }

    /**
     * Returns the l f quiz question category with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the l f quiz question category
     * @return the l f quiz question category, or <code>null</code> if a l f quiz question category with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LFQuizQuestionCategory fetchByPrimaryKey(long id)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the l f quiz question categories.
     *
     * @return the l f quiz question categories
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<LFQuizQuestionCategory> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the l f quiz question categories.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFQuizQuestionCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of l f quiz question categories
     * @param end the upper bound of the range of l f quiz question categories (not inclusive)
     * @return the range of l f quiz question categories
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<LFQuizQuestionCategory> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the l f quiz question categories.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFQuizQuestionCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of l f quiz question categories
     * @param end the upper bound of the range of l f quiz question categories (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of l f quiz question categories
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<LFQuizQuestionCategory> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<LFQuizQuestionCategory> list = (List<LFQuizQuestionCategory>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_LFQUIZQUESTIONCATEGORY);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_LFQUIZQUESTIONCATEGORY;

                if (pagination) {
                    sql = sql.concat(LFQuizQuestionCategoryModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<LFQuizQuestionCategory>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<LFQuizQuestionCategory>(list);
                } else {
                    list = (List<LFQuizQuestionCategory>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the l f quiz question categories from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (LFQuizQuestionCategory lfQuizQuestionCategory : findAll()) {
            remove(lfQuizQuestionCategory);
        }
    }

    /**
     * Returns the number of l f quiz question categories.
     *
     * @return the number of l f quiz question categories
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_LFQUIZQUESTIONCATEGORY);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    @Override
    protected Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    /**
     * Initializes the l f quiz question category persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.arcusys.learn.persistence.liferay.model.LFQuizQuestionCategory")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<LFQuizQuestionCategory>> listenersList = new ArrayList<ModelListener<LFQuizQuestionCategory>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<LFQuizQuestionCategory>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(LFQuizQuestionCategoryImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
