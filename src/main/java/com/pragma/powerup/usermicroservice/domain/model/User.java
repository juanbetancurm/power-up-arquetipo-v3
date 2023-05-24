package com.pragma.powerup.usermicroservice.domain.model;

public class User {
    private Long id;
    private Person person;
    private Role role;

    private Owner owner;

    public User(Long id, Person person, Role role, Owner owner) {
        this.id = id;
        this.person = person;
        this.role = role;
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
