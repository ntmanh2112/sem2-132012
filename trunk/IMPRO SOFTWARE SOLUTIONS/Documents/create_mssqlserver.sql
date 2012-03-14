/* ---------------------------------------------------------------------- */
/* Script generated with: DeZign for Databases v4.1.3                     */
/* Target DBMS:           MS SQL Server 2005                              */
/* Project file:          Project1.dez                                    */
/* Project name:                                                          */
/* Author:                                                                */
/* Script type:           Database creation script                        */
/* Created on:            2012-03-14 10:59                                */
/* ---------------------------------------------------------------------- */


/* ---------------------------------------------------------------------- */
/* Tables                                                                 */
/* ---------------------------------------------------------------------- */

/* ---------------------------------------------------------------------- */
/* Add table "Departments"                                                */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Departments] (
    [Dep_No] NUMERIC(10) NOT NULL,
    [Dep_Name] VARCHAR(10),
    [Dep_Head] VARCHAR(10),
    [Location] VARCHAR(10),
    CONSTRAINT [PK_Departments] PRIMARY KEY ([Dep_No])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "Employee"                                                   */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Employee] (
    [ID] VARCHAR(10) NOT NULL,
    [Name] VARCHAR(10),
    [Dep_No] NUMERIC(10) NOT NULL,
    [Designation_ID] VARCHAR(10) NOT NULL,
    [Section_ID] VARCHAR(10),
    [Address] VARCHAR(50),
    [Phone] VARCHAR(15),
    [Fax] VARCHAR(15),
    [Email] VARCHAR(50),
    CONSTRAINT [PK_Employee] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "Section"                                                    */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Section] (
    [ID] VARCHAR(10) NOT NULL,
    [Name] VARCHAR(15),
    [Section_Inch] VARCHAR(10),
    [Dep_No] VARCHAR(10),
    CONSTRAINT [PK_Section] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "Designation"                                                */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Designation] (
    [ID] VARCHAR(10) NOT NULL,
    [Designation] VARCHAR(10),
    CONSTRAINT [PK_Designation] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "Dep_Interdependency"                                        */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Dep_Interdependency] (
    [Dep_No] NUMERIC(10) NOT NULL,
    [Up_Dep_No] NUMERIC(10) NOT NULL,
    [Dn_Dep_No] NUMERIC(10) NOT NULL,
    [Designation_ID] VARCHAR(10) NOT NULL,
    CONSTRAINT [PK_Dep_Interdependency] PRIMARY KEY ([Dep_No], [Designation_ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "Dep_Pos_Weightage"                                          */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Dep_Pos_Weightage] (
    [Dep_No] NUMERIC(10) NOT NULL,
    [Layer] NUMERIC(10),
    [Weightage] NUMERIC(10),
    CONSTRAINT [PK_Dep_Pos_Weightage] PRIMARY KEY ([Dep_No])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "Job_rotation"                                               */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Job_rotation] (
    [Em_ID] VARCHAR(10) NOT NULL,
    [Present_Designation] VARCHAR(10),
    [Deputed_To] VARCHAR(10),
    [Status] VARCHAR(50),
    [Remarks] VARCHAR(100),
    CONSTRAINT [PK_Job_rotation] PRIMARY KEY ([Em_ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "Vacancies"                                                  */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Vacancies] (
    [Vacancy_ID] VARCHAR(10) NOT NULL,
    [Dep_No] NUMERIC(10) NOT NULL,
    [Section_ID] VARCHAR(10),
    [Designation_ID] VARCHAR(10),
    [No_Of_Vacancies] NUMERIC(10),
    [Status] VARCHAR(15),
    [Vacancy_Date] DATETIME,
    [Priority] VARCHAR(50),
    CONSTRAINT [PK_Vacancies] PRIMARY KEY ([Vacancy_ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "desc_Vacancy_Fill_Details"                                  */
/* ---------------------------------------------------------------------- */

CREATE TABLE [desc_Vacancy_Fill_Details] (
    [Vacancy_ID] VARCHAR(10) NOT NULL,
    [Em_ID] VARCHAR(10),
    [Filled_Date] DATETIME,
    [Intake_Details] VARCHAR(50),
    CONSTRAINT [PK_desc_Vacancy_Fill_Details] PRIMARY KEY ([Vacancy_ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "DesigLayer"                                                 */
/* ---------------------------------------------------------------------- */

CREATE TABLE [DesigLayer] (
    [Designation_ID] VARCHAR(10) NOT NULL,
    [Layer] NUMERIC(10),
    [Weightage] NUMERIC(10),
    CONSTRAINT [PK_DesigLayer] PRIMARY KEY ([Designation_ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "Designation_Weightage"                                      */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Designation_Weightage] (
    [Designation_ID] VARCHAR(10) NOT NULL,
    [Dep_No] NUMERIC(10) NOT NULL,
    [Weightage] VARCHAR(10),
    CONSTRAINT [PK_Designation_Weightage] PRIMARY KEY ([Designation_ID], [Dep_No])
)
GO

/* ---------------------------------------------------------------------- */
/* Foreign key constraints                                                */
/* ---------------------------------------------------------------------- */

ALTER TABLE [Employee] ADD CONSTRAINT [Departments_Employee] 
    FOREIGN KEY ([Dep_No]) REFERENCES [Departments] ([Dep_No])
GO

ALTER TABLE [Employee] ADD CONSTRAINT [Section_Employee] 
    FOREIGN KEY ([Section_ID]) REFERENCES [Section] ([ID])
GO

ALTER TABLE [Employee] ADD CONSTRAINT [Designation_Employee] 
    FOREIGN KEY ([Designation_ID]) REFERENCES [Designation] ([ID])
GO

ALTER TABLE [Employee] ADD CONSTRAINT [Job_rotation_Employee] 
    FOREIGN KEY ([Name]) REFERENCES [Job_rotation] ([Em_ID])
GO

ALTER TABLE [Designation] ADD CONSTRAINT [DesigLayer_Designation] 
    FOREIGN KEY ([Designation]) REFERENCES [DesigLayer] ([Designation_ID])
GO

ALTER TABLE [Dep_Interdependency] ADD CONSTRAINT [Departments_Dep_Interdependency] 
    FOREIGN KEY ([Dep_No]) REFERENCES [Departments] ([Dep_No])
GO

ALTER TABLE [Dep_Pos_Weightage] ADD CONSTRAINT [Departments_Dep_Pos_Weightage] 
    FOREIGN KEY ([Layer]) REFERENCES [Departments] ([Dep_No])
GO

ALTER TABLE [Vacancies] ADD CONSTRAINT [Section_Vacancies] 
    FOREIGN KEY ([Section_ID]) REFERENCES [Section] ([ID])
GO

ALTER TABLE [Vacancies] ADD CONSTRAINT [Designation_Vacancies] 
    FOREIGN KEY ([Designation_ID]) REFERENCES [Designation] ([ID])
GO

ALTER TABLE [desc_Vacancy_Fill_Details] ADD CONSTRAINT [Vacancies_desc_Vacancy_Fill_Details] 
    FOREIGN KEY ([Em_ID]) REFERENCES [Vacancies] ([Vacancy_ID])
GO

ALTER TABLE [Designation_Weightage] ADD CONSTRAINT [Departments_Designation_Weightage] 
    FOREIGN KEY ([Dep_No]) REFERENCES [Departments] ([Dep_No])
GO
