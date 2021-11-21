package com.itrex.java.lab.projectcrmspringboot.utils;

import com.itrex.java.lab.projectcrmspringboot.dto.RoleDTO;
import com.itrex.java.lab.projectcrmspringboot.dto.TaskDTO;
import com.itrex.java.lab.projectcrmspringboot.dto.UserDTO;
import com.itrex.java.lab.projectcrmspringboot.entity.Role;
import com.itrex.java.lab.projectcrmspringboot.entity.Task;
import com.itrex.java.lab.projectcrmspringboot.entity.User;

public class ConverterUtils {

    public static RoleDTO convertRoleToDto(Role role) {
        return RoleDTO.builder()
                .id(role.getId())
                .roleName(role.getRoleName())
                .build();
    }

    public static UserDTO convertUserToDto(User user) {
        return UserDTO.builder()
                .id(user.getId())
                .login(user.getLogin())
                .psw(user.getPsw())
                .roleId(user.getRole().getId())
                .lastName(user.getLastName())
                .firstName(user.getFirstName())
                .build();
    }

    public static TaskDTO convertTaskToDto(Task task) {
        return TaskDTO.builder()
                .id(task.getId())
                .title(task.getTitle())
                .status(task.getStatus())
                .info(task.getInfo())
                .deadline(task.getDeadline())
                .build();
    }

}
