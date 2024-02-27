package com.infsis.projectBlog.Services;

import com.infsis.projectBlog.Models.Role;

import java.util.Optional;

public interface RoleService {
    Optional<Role> getRoleById(Integer roleId);
    Role saveRole(Role role);
    Role updateRole(Integer roleId, Role role);
    void deleteRole(Integer roleId);

}
