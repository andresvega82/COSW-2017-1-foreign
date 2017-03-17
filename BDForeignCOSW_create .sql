-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2017-03-17 15:59:53.474

-- tables
-- Table: Lenguajes
CREATE TABLE Lenguajes (
    lenguaje_id int NOT NULL,
    description varchar(50) NULL,
    CONSTRAINT Lenguajes_pk PRIMARY KEY (lenguaje_id)
);

-- Table: Students
CREATE TABLE Students (
    student_id int NOT NULL,
    Description varchar(200) NOT NULL,
    Users_user_id int NOT NULL,
    CONSTRAINT Students_pk PRIMARY KEY (student_id)
);

-- Table: Students_Lenguajes
CREATE TABLE Students_Lenguajes (
    Lenguajes_lenguaje_id int NOT NULL,
    Students_student_id int NOT NULL,
    CONSTRAINT Students_Lenguajes_pk PRIMARY KEY (Lenguajes_lenguaje_id,Students_student_id)
);

-- Table: Teachears_Lenguajes
CREATE TABLE Teachears_Lenguajes (
    Teachers_teacher_id int NOT NULL,
    Lenguajes_lenguaje_id int NOT NULL,
    CONSTRAINT Teachears_Lenguajes_pk PRIMARY KEY (Teachers_teacher_id,Lenguajes_lenguaje_id)
);

-- Table: Teachers
CREATE TABLE Teachers (
    teacher_id int NOT NULL,
    Description varchar(200) NOT NULL,
    Users_user_id int NOT NULL,
    ValidateDocument blob NULL,
    CONSTRAINT Teachers_pk PRIMARY KEY (teacher_id)
);

-- Table: Tutorials
CREATE TABLE Tutorials (
    tutorial_id int NOT NULL,
    Teachers_teacher_id int NOT NULL,
    date date NULL,
    duration int NULL,
    lenguaje_id int NOT NULL,
    state varchar(20) NULL,
    payment varchar(20) NULL,
    CONSTRAINT Tutorials_pk PRIMARY KEY (tutorial_id)
);

-- Table: Tutorials_Students
CREATE TABLE Tutorials_Students (
    Students_student_id int NOT NULL,
    Tutorials_tutorial_id int NOT NULL,
    CONSTRAINT Tutorials_Students_pk PRIMARY KEY (Students_student_id,Tutorials_tutorial_id)
);

-- Table: Users
CREATE TABLE Users (
    user_id int NOT NULL,
    age int NOT NULL,
    name varchar(50) NOT NULL,
    lastName varchar(50) NOT NULL,
    email varchar(50) NULL,
    phone varchar(20) NULL,
    country varchar(50) NULL,
    photo blob NOT NULL,
    CONSTRAINT Users_pk PRIMARY KEY (user_id)
);

-- foreign keys
-- Reference: Students_Lenguajes_Lenguajes (table: Students_Lenguajes)
ALTER TABLE Students_Lenguajes ADD CONSTRAINT Students_Lenguajes_Lenguajes FOREIGN KEY Students_Lenguajes_Lenguajes (Lenguajes_lenguaje_id)
    REFERENCES Lenguajes (lenguaje_id);

-- Reference: Students_Lenguajes_Students (table: Students_Lenguajes)
ALTER TABLE Students_Lenguajes ADD CONSTRAINT Students_Lenguajes_Students FOREIGN KEY Students_Lenguajes_Students (Students_student_id)
    REFERENCES Students (student_id);

-- Reference: Students_Users (table: Students)
ALTER TABLE Students ADD CONSTRAINT Students_Users FOREIGN KEY Students_Users (Users_user_id)
    REFERENCES Users (user_id);

-- Reference: Teachears_Lenguajes_Lenguajes (table: Teachears_Lenguajes)
ALTER TABLE Teachears_Lenguajes ADD CONSTRAINT Teachears_Lenguajes_Lenguajes FOREIGN KEY Teachears_Lenguajes_Lenguajes (Lenguajes_lenguaje_id)
    REFERENCES Lenguajes (lenguaje_id);

-- Reference: Teachears_Lenguajes_Teachers (table: Teachears_Lenguajes)
ALTER TABLE Teachears_Lenguajes ADD CONSTRAINT Teachears_Lenguajes_Teachers FOREIGN KEY Teachears_Lenguajes_Teachers (Teachers_teacher_id)
    REFERENCES Teachers (teacher_id);

-- Reference: Teachers_Users (table: Teachers)
ALTER TABLE Teachers ADD CONSTRAINT Teachers_Users FOREIGN KEY Teachers_Users (Users_user_id)
    REFERENCES Users (user_id);

-- Reference: Tutorials_Lenguajes (table: Tutorials)
ALTER TABLE Tutorials ADD CONSTRAINT Tutorials_Lenguajes FOREIGN KEY Tutorials_Lenguajes (lenguaje_id)
    REFERENCES Lenguajes (lenguaje_id);

-- Reference: Tutorials_Students_Students (table: Tutorials_Students)
ALTER TABLE Tutorials_Students ADD CONSTRAINT Tutorials_Students_Students FOREIGN KEY Tutorials_Students_Students (Students_student_id)
    REFERENCES Students (student_id);

-- Reference: Tutorials_Students_Tutorials (table: Tutorials_Students)
ALTER TABLE Tutorials_Students ADD CONSTRAINT Tutorials_Students_Tutorials FOREIGN KEY Tutorials_Students_Tutorials (Tutorials_tutorial_id)
    REFERENCES Tutorials (tutorial_id);

-- Reference: Tutorials_Teachers (table: Tutorials)
ALTER TABLE Tutorials ADD CONSTRAINT Tutorials_Teachers FOREIGN KEY Tutorials_Teachers (Teachers_teacher_id)
    REFERENCES Teachers (teacher_id);

-- End of file.

