package com.softpower.demo.springsession.domain.user;

import com.softpower.demo.springsession.consts.YesNo;
import com.softpower.demo.springsession.util._Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;
import java.time.LocalDateTime;
import java.util.*;

@Getter
@Setter
@ToString(callSuper = true, exclude = {"password"})
@Entity
@Table(name = "user")
public class User implements UserDetails {

    @Id
    private Long id;

    private String username;

    private String password;

    private LocalDateTime expireDateTime;

    private YesNo status;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        final List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_USER"));

        return grantedAuthorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        //  return Optional.ofNullable(expireDateTime).filter(dateTime -> dateTime.isAfter(_Date.nowWithUTC())).isPresent();
        return Objects.nonNull(expireDateTime) && expireDateTime.isAfter(_Date.nowWithUTC());
    }

    @Override
    public boolean isAccountNonLocked() {
        return Boolean.TRUE;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return Boolean.TRUE;
    }

    @Override
    public boolean isEnabled() {
        return YesNo.Y.equals(status);
    }

}
