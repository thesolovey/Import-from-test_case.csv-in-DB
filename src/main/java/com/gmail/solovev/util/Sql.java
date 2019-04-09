package com.gmail.solovev.util;

import com.gmail.solovev.model.UserData;

public class Sql {

    public static final String FIVE_TOP_FORMS = "SELECT " + Sql.GRP_REGEX + " as grp FROM " + UserData.getTableName() + " WHERE grp IS NOT NULL GROUP BY " + Sql.GRP_REGEX + " ORDER BY COUNT(*) DESC LIMIT 5";

    public static final String USER_LAST_HOUR = "SELECT DISTINCT ssoid, "+ Sql.GRP_REGEX + " as grp FROM " + UserData.getTableName() + " WHERE ts >= ((SELECT MAX(ts) FROM " + UserData.getTableName() + ") - interval '1 hour')";

    public static final String UNFINISH_USERS = "select ssoid, subtype from " + UserData.getTableName() + " where concat(ssoid, ts) in (select concat(ssoid, max(ts)) from " + UserData.getTableName() + " group by ssoid) and subtype not in('success', 'result', 'done', 'pay', 'confirmBooking')";

    public static final String GRP_REGEX = "regexp_replace(grp, '[_].+|[-]?[0-9]+', '')";
}