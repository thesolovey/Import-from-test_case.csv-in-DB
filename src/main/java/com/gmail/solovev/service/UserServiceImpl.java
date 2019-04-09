package com.gmail.solovev.service;

import com.gmail.solovev.api.IUserService;
import com.gmail.solovev.model.UserData;
import com.gmail.solovev.util.Sql;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @PersistenceContext private EntityManager manager;

    @Override
    public List<UserData> getFiveTopForms() {

        final List<UserData> userDataList = new ArrayList<>();
        TypedQuery<UserData> query = manager.createNamedQuery(Sql.FIVE_TOP_FORMS, UserData.class);
        return query.getResultList();
    }

    @Override
    public List<UserData> getUsedFormForLastHour() {

        final List<UserData> userDataList = new ArrayList<>();
        TypedQuery<UserData> query = manager.createNamedQuery(Sql.USER_LAST_HOUR, UserData.class);
        return query.getResultList();
    }

    @Override
    public List<UserData> getUnfinishedUsers() {

        final List<UserData> userDataList = new ArrayList<>();
        TypedQuery<UserData> query = manager.createNamedQuery(Sql.UNFINISH_USERS, UserData.class);
        return query.getResultList();
    }
}
