package org.o7planning.sbsecurity.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "App_Role")
@Data
public class AppRole {

    @Id
    @GeneratedValue
    @Column(name = "Role_Id", nullable = false)
    private Long roleId;

    @Column(name = "Role_Name", length = 30, nullable = false)
    private String roleName;

 }