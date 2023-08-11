package com.codercampus.assignmentsubmissionapp.entity;

import com.codercampus.assignmentsubmissionapp.common.BaseEntity;
import com.codercampus.assignmentsubmissionapp.common.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "assignment")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Assignment extends BaseEntity {

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;

    @Column(name = "branch")
    private String branch;

    @Column(name = "github_url")
    private String githubUrl;

    @Column(name = "code_review_video_url")
    private String codeReviewVideoUrl;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User assignedTo;

}
