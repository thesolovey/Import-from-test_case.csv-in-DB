package com.gmail.solovev.api;

import com.gmail.solovev.model.UserData;
import java.util.List;

public interface IUserService {

    List<UserData> getFiveTopForms();
    List<UserData> getUsedFormForLastHour();
    List<UserData> getUnfinishedUsers();

}
