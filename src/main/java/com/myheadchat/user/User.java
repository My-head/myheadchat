package com.myheadchat.user;

import java.beans.Transient;
import java.util.Collection;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.*;
import net.bytebuddy.implementation.bind.annotation.IgnoreForBinding;
import org.hibernate.validator.constraints.Normalized;
import org.springframework.lang.NonNull;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.authority.AuthorityUtils;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Collection;




//@Table(uniqueConstraints = @UniqueConstraint(columnNames = "username"))
@Entity
@Data
public class User implements UserDetails {

    @Id
    @GeneratedValue
    @Column(name = "userid")
    @JsonView(Views.Base.class)
    private long id;

    @Column(name = "user_name")
    @Size(min=4,  max=255)
    @UniqueUsername
    @JsonView(Views.Base.class)
    @NotNull(message = "{mhc.constraints.username.NotNull.message}")
    private String username;

    @NotNull()
    @Column(name = "display_name")
    @Size(min=4, max=255)
    @JsonView(Views.Base.class)
    private String displayName;

    @Column(name = "p4ssword")
    @NotNull
    @Size(min=8,  max=255)
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$" , message = "{mhc.constraints.password.Pattern.message")
    private String password;

    @JsonView(Views.Base.class)
    @Column(name = "image")
    private String image;


    @Override
    @Transient
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    @Transient
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    @Transient
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    @Transient
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    @Transient
    public boolean isEnabled() {
        return true;
    }


}
