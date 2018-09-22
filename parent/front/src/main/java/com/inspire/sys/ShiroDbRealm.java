package com.inspire.sys;

import com.inspire.hy.User;
import com.inspire.hy.UserService;
import com.inspire.securityShiro.ILoginService;
import com.inspire.securityShiro.ILoginUser;
import com.inspire.securityShiro.ShiroUsernamePasswordToken;
import com.inspire.utils.B;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

@Slf4j
public class ShiroDbRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    protected ILoginService loginService;

    public void setLoginService(ILoginService loginService) {
        this.loginService = loginService;
    }

//    //获取用户组的权限信息
//    public abstract UserRolesAndPermissions doGetGroupAuthorizationInfo(User userInfo);
//    //获取用户角色的权限信息
//    public abstract UserRolesAndPermissions doGetRoleAuthorizationInfo(User userInfo);

    /**
     * 获取授权信息，判断用户是否拥有某个权限
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String currentLoginName = (String) principals.getPrimaryPrincipal();
        Set<String> userRoles = new HashSet<>();
        Set<String> userPermissions = new HashSet<>();
        //从数据库中获取当前登录用户的详细信息
        User userInfo = userService.findBySusername(currentLoginName);
        if (null != userInfo) {
//            UserRolesAndPermissions groupContainer = doGetGroupAuthorizationInfo(userInfo);
//            UserRolesAndPermissions roleContainer = doGetGroupAuthorizationInfo(userInfo);
//            userRoles.addAll(groupContainer.getUserRoles());
//            userRoles.addAll(roleContainer.getUserRoles());
//            userPermissions.addAll(groupContainer.getUserPermissions());
//            userPermissions.addAll(roleContainer.getUserPermissions());
        } else {
            throw new AuthorizationException();
        }
        //为当前用户设置角色和权限
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.addRoles(userRoles);
        authorizationInfo.addStringPermissions(userPermissions);
        log.info("###【获取角色成功】[SessionId] => {}", SecurityUtils.getSubject().getSession().getId());
        return authorizationInfo;
    }

    /**
     * 授权认证回掉方法，登录是调用
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken authenticationToken) throws AuthenticationException {
        //ShiroUsernamePasswordToken(UsernamePasswordToken)对象用来存放提交的登录信息
        ShiroUsernamePasswordToken token = (ShiroUsernamePasswordToken) authenticationToken;
        //查出是否有此用户
//        User user = userService.findBySusername(token.getUsername());
        if (!(token.getUsertype() == ShiroUsernamePasswordToken.UserType.open)) {
            token.CheckCaptcha();
        }
        ILoginUser user = loginService.getIUser(token);
        if (user != null) {
            if (B.Y(user.getPassword()))
                return null;
            SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user, user.getPassword(), null, getName());
            return info;
        } else {
            return null;
        }
    }

    protected class UserRolesAndPermissions {
        Set<String> userRoles;
        Set<String> userPermissions;

        public UserRolesAndPermissions(Set<String> userRoles, Set<String> userPermissions) {
            this.userRoles = userRoles;
            this.userPermissions = userPermissions;
        }

        public Set<String> getUserRoles() {
            return userRoles;
        }

        public Set<String> getUserPermissions() {
            return userPermissions;
        }
    }
    
}