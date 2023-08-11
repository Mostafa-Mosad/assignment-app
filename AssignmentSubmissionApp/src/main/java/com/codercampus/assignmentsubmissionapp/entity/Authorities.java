package com.codercampus.assignmentsubmissionapp.entity;

import com.codercampus.assignmentsubmissionapp.common.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "authorities")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Authorities extends BaseEntity implements GrantedAuthority {

    @ManyToOne
    @JsonIgnore
    private User user;
    private String authority;

    public Authorities(String authority) {
        this.authority = authority;
    }
}
