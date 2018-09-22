package com.inspire.sys;

import com.inspire.hy.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;


@Component
@Slf4j
public class UserRealm extends ShiroDbRealm {

	@Override
	public UserRolesAndPermissions doGetGroupAuthorizationInfo(User userInfo) {
		Set<String> userRoles = new HashSet<>();
        Set<String> userPermissions = new HashSet<>();
        //TODO 获取当前用户下拥有的所有角色列表,及权限
		log.info("***doGetGroupAuthorizationInfo:"+userInfo.getSusername());
        return new UserRolesAndPermissions(userRoles, userPermissions);
	}

	@Override
	public UserRolesAndPermissions doGetRoleAuthorizationInfo(User userInfo) {
		Set<String> userRoles = new HashSet<>();
        Set<String> userPermissions = new HashSet<>();
        //TODO 获取当前用户下拥有的所有角色列表,及权限
		log.info("***doGetRoleAuthorizationInfo:"+userInfo.getSusername());
        return new UserRolesAndPermissions(userRoles, userPermissions);
	}

}
