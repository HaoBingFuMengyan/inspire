package com.inspire.sys;

import com.inspire.securityShiro.ILoginService;
import com.inspire.securityShiro.ILoginUser;
import com.inspire.securityShiro.ShiroUsernamePasswordToken;
import com.inspire.utils.B;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.Set;

@Slf4j
public class ShiroDbRealm extends AuthorizingRealm {

    @Autowired
    protected ILoginService loginService;


    /**
     * 授权查询回调函数, 进行鉴权但缓存中无用户的授权信息时调用.
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        ILoginUser user = (ILoginUser) principals.getPrimaryPrincipal();

        // User user = userService.findUserByLoginName(shiroUser.loginName);
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        Collection<String> permissions;

        permissions = loginService.getUserPurview(user);

        info.addStringPermissions(permissions);

        Collection<String> roles = loginService.getUserRole(user);
        info.addRoles(roles);
        loginService.DoLoginOk(user);
        // loginService.doLoginIntegral(user);
        return info;
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