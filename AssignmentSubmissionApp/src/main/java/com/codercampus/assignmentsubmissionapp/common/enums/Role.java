package com.codercampus.assignmentsubmissionapp.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Role {
    ADMIN("ROLE_ADMIN"),
    STUDENT("ROLE_STUDENT"),
    CODE_REVIEWER("ROLE_CODE_REVIEWER");

    private String alias;

}
