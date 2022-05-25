package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser>userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(111,"John", 'M', 1989, 12, 13, 500 ));
        userList.add(new ForumUser(112,"Tom", 'M', 1974, 5, 14, 0 ));
        userList.add(new ForumUser(113,"Bob", 'M', 1945, 11, 15, 45 ));
        userList.add(new ForumUser(114,"Sarah", 'F', 2011, 6, 16, 65 ));
        userList.add(new ForumUser(115,"Caroline", 'F', 1995, 2, 17, 67 ));
        userList.add(new ForumUser(116,"Alice", 'F', 2009, 8, 18, 76 ));
    }

    public List<ForumUser> getUserList() {
        return userList;
    }
}
