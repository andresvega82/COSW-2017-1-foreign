-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2017-03-28 13:35:15.171

-- tables
-- Table: CreditCard
CREATE TABLE CreditCard (
    payment_id int NOT NULL,
    numero_tarjeta int NOT NULL,
    fecha_vencimiento date NOT NULL,
    codigo_postal int NOT NULL,
    cvv int NOT NULL,
    CONSTRAINT CreditCard_pk PRIMARY KEY (payment_id)
);

-- Table: Languajes
CREATE TABLE Languajes (
    lenguaje_id int NOT NULL,
    description varchar(50) NULL,
    Users_user_id varchar(50) NOT NULL,
    CONSTRAINT Languajes_pk PRIMARY KEY (lenguaje_id)
);

-- Table: Students
CREATE TABLE Students (
    student_id int NOT NULL,
    Description varchar(200) NOT NULL,
    Users_user_id varchar(50) NOT NULL,
    CONSTRAINT Students_pk PRIMARY KEY (student_id)
);

-- Table: Teachers
CREATE TABLE Teachers (
    teacher_id int NOT NULL,
    Description varchar(200) NOT NULL,
    Users_user_id varchar(50) NOT NULL,
    ValidateDocument blob NULL,
    CONSTRAINT Teachers_pk PRIMARY KEY (teacher_id)
);

-- Table: Tutorials
CREATE TABLE Tutorials (
    tutorial_id int NOT NULL,
    Teachers_teacher_id int NOT NULL,
    date date NULL,
    duration int NULL,
    languaje_id int NOT NULL,
    state varchar(20) NULL,
    payment int NULL,
    cost int NULL,
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
    user_id varchar(50) NOT NULL,
    age int NOT NULL,
    name varchar(50) NOT NULL,
    lastName varchar(50) NOT NULL,
    email varchar(50) NOT NULL,
    phone varchar(20) NOT NULL,
    country varchar(50) NOT NULL,
    photo blob NULL,
    CreditCard_payment_id int NOT NULL,
    CONSTRAINT Users_pk PRIMARY KEY (user_id)
);

-- foreign keys
-- Reference: Languajes_Users (table: Languajes)
ALTER TABLE Languajes ADD CONSTRAINT Languajes_Users FOREIGN KEY Languajes_Users (Users_user_id)
    REFERENCES Users (user_id);

-- Reference: Students_Users (table: Students)
ALTER TABLE Students ADD CONSTRAINT Students_Users FOREIGN KEY Students_Users (Users_user_id)
    REFERENCES Users (user_id);

-- Reference: Teachers_Users (table: Teachers)
ALTER TABLE Teachers ADD CONSTRAINT Teachers_Users FOREIGN KEY Teachers_Users (Users_user_id)
    REFERENCES Users (user_id);

-- Reference: Tutorials_Lenguajes (table: Tutorials)
ALTER TABLE Tutorials ADD CONSTRAINT Tutorials_Lenguajes FOREIGN KEY Tutorials_Lenguajes (languaje_id)
    REFERENCES Languajes (lenguaje_id);

-- Reference: Tutorials_Students_Students (table: Tutorials_Students)
ALTER TABLE Tutorials_Students ADD CONSTRAINT Tutorials_Students_Students FOREIGN KEY Tutorials_Students_Students (Students_student_id)
    REFERENCES Students (student_id);

-- Reference: Tutorials_Students_Tutorials (table: Tutorials_Students)
ALTER TABLE Tutorials_Students ADD CONSTRAINT Tutorials_Students_Tutorials FOREIGN KEY Tutorials_Students_Tutorials (Tutorials_tutorial_id)
    REFERENCES Tutorials (tutorial_id);

-- Reference: Tutorials_Teachers (table: Tutorials)
ALTER TABLE Tutorials ADD CONSTRAINT Tutorials_Teachers FOREIGN KEY Tutorials_Teachers (Teachers_teacher_id)
    REFERENCES Teachers (teacher_id);

-- Reference: Users_CreditCard (table: Users)
ALTER TABLE Users ADD CONSTRAINT Users_CreditCard FOREIGN KEY Users_CreditCard (CreditCard_payment_id)
    REFERENCES CreditCard (payment_id);

-- End of file.
