package com.cvit.gmall.service;

import com.cvit.gmall.bean.UmsMember;
import com.cvit.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
