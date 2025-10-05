package com.example.studentportal.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Student {
  private Long id;

  @NotBlank
  @Size(max = 100)
  private String firstName;

  @NotBlank
  @Size(max = 100)
  private String lastName;

  @Email
  @NotBlank
  private String email;

  private boolean acceptedTerms;

  public Student() {}

  public Student(Long id, String firstName, String lastName, String email, boolean acceptedTerms) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.acceptedTerms = acceptedTerms;
  }

  public Long getId() { return id; }
  public void setId(Long id) { this.id = id; }
  public String getFirstName() { return firstName; }
  public void setFirstName(String firstName) { this.firstName = firstName; }
  public String getLastName() { return lastName; }
  public void setLastName(String lastName) { this.lastName = lastName; }
  public String getEmail() { return email; }
  public void setEmail(String email) { this.email = email; }
  public boolean isAcceptedTerms() { return acceptedTerms; }
  public void setAcceptedTerms(boolean acceptedTerms) { this.acceptedTerms = acceptedTerms; }
}
