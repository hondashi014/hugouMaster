package com.gmail.hondashi014.hugouMaster.service;

import java.security.Principal;

import com.gmail.hondashi014.hugouMaster.model.domain.MstUser;

public interface MstUserService {

	MstUser getLoginUser(Principal principal);
}
