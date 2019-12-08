package com.cvit.gmall.user.service;

import com.cvit.gmall.user.bean.UmsMember;
import com.cvit.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
