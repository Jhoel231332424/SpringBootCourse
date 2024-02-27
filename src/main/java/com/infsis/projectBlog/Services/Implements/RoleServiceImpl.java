package com.infsis.projectBlog.Services.Implements;

import com.infsis.projectBlog.Models.Role;
import com.infsis.projectBlog.Services.RoleService;

import java.util.Optional;

public class RoleServiceImpl implements RoleService {

    @Override
    public Optional<Role> getRoleById(Integer roleId) {
        return Optional.empty();
    }

    @Override
    public Role saveRole(Role role) {
        return null;
    }

    @Override
    public Role updateRole(Integer roleId, Role role) {
        return null;
    }

    @Override
    public void deleteRole(Integer roleId) {

    }


}

