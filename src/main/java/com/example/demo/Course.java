package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class Course {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;
        @NotNull
        private String title;
        @NotNull
        private String instructor;
        @NotNull
        private String description;
        @NotNull
        @Min(3)
        private int credit;

        public Course(@NotNull String title, @NotNull String instructor, @NotNull String description, @NotNull @Min(3) int credit) {
                this.title = title;
                this.instructor = instructor;
                this.description = description;
                this.credit = credit;
        }

        public Course() {
        }

        public long getId() {
                return id;
        }

        public void setId(long id) {
                this.id = id;
        }

        public String getTitle() {
                return title;
        }

        public void setTitle(String title) {
                this.title = title;
        }

        public String getInstructor() {
                return instructor;
        }

        public void setInstructor(String instructor) {
                this.instructor = instructor;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public int getCredit() {
                return credit;
        }

        public void setCredit(int credit) {
                this.credit = credit;
        }
}