package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> usersList = new ArrayList<>();
    public Forum(){
        usersList.add(new ForumUser(201,"Mark",'M',1987,12,05,2));
        usersList.add(new ForumUser(202,"Julie",'F',1997,2,15,0));
        usersList.add(new ForumUser(203,"Henry",'M',1975,1,28,18));
        usersList.add(new ForumUser(204,"Mary",'F',2001,8,30,15));
        usersList.add(new ForumUser(205,"Emily",'F',2008,4,04,9));
    }
    public List<ForumUser> getUserList(){ return new ArrayList<>(usersList);}
}
