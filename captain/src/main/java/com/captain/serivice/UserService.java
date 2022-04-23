package com.captain.serivice;

import com.captain.beans.entity.User;

public interface UserService {

    User isUser(String name, String password);
}
