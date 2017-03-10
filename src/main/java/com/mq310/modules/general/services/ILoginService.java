package com.mq310.modules.general.services;

/**
 * Created by moises on 12/02/17.
 */
public interface ILoginService {

    Boolean login(String username, String password);

    void logout();

}
