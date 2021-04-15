package com.shop.toy.models.entity.enumeration;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.shop.toy.models.entity.enumeration.Permission.READ;
import static com.shop.toy.models.entity.enumeration.Permission.WRITE;

public enum Role {
    ADMIN(Stream.of(READ, WRITE).collect(Collectors.toSet())),
    USER(Stream.of(READ).collect(Collectors.toSet())),
    CLIENT(Stream.of(READ).collect(Collectors.toSet())),
    GUEST(Stream.of(READ).collect(Collectors.toSet()));

    private final Set<Permission> permissions;

    Role(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public Set<SimpleGrantedAuthority> getAuthority() {
        return getPermissions().stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toSet());
    }
}
