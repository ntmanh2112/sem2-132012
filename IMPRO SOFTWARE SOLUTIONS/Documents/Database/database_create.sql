/* ---------------------------------------------------------------------- */
/* Script generated with: DeZign for Databases v4.1.3                     */
/* Target DBMS:           MS SQL Server 2005                              */
/* Project file:          Project1.dez                                    */
/* Project name:                                                          */
/* Author:                                                                */
/* Script type:           Database creation script                        */
/* Created on:            2012-03-14 12:50                                */
/* ---------------------------------------------------------------------- */


/* ---------------------------------------------------------------------- */
/* Tables                                                                 */
/* ---------------------------------------------------------------------- */

/* ---------------------------------------------------------------------- */
/* Add table "Departments"                                                */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Departments] (
    [Dep_No] VARCHAR(10) NOT NULL,
    [Dep_Name] VARCHAR(10),
    [Dep_Head] VARCHAR(10),
    [Location] VARCHAR(10),
    [Up_Dep_No] NUMERIC(10),
    [Dn_Dep_No] NUMERIC(10),
    CONSTRAINT [PK_Departments] PRIMARY KEY ([Dep_No])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "Employee"                                                   */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Employee] (
    [ID] INTEGER IDENTITY(0,1) NOT NULL,
    [Name] VARCHAR(10),
    [Dep_No] NUMERIC(10) NOT NULL,
    [Des_ID] INTEGER NOT NULL,
    [Section_ID] INTEGER,
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
    [ID] INTEGER IDENTITY(0,1) NOT NULL,
    [Name] VARCHAR(15),
    [Section_Inch] VARCHAR(10),
    [Dep_No] VARCHAR(10) NOT NULL,
    CONSTRAINT [PK_Section] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "Designation"                                                */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Designation] (
    [ID] INTEGER IDENTITY(0,1) NOT NULL,
    [Designation] VARCHAR(10),
    CONSTRAINT [PK_Designation] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "Job_rotation"                                               */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Job_rotation] (
    [ID] INTEGER NOT NULL,
    [Em_ID] INTEGER NOT NULL,
    [Present_Designation] VARCHAR(10),
    [Deputed_To] VARCHAR(10),
    [Creation_Date] DATETIME,
    [Creator] VARCHAR(20),
    [Status] VARCHAR(50),
    [Remarks] VARCHAR(100),
    CONSTRAINT [PK_Job_rotation] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "Vacancies"                                                  */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Vacancies] (
    [Vacancy_ID] VARCHAR(10) NOT NULL,
    [Dep_No] VARCHAR(10) NOT NULL,
    [Section_ID] INTEGER,
    [Designation_ID] VARCHAR(10),
    [No_Of_Vacancies] NUMERIC(10),
    [Status] VARCHAR(10),
    [Vacancy_Date] DATETIME,
    [Creator] VARCHAR(20),
    [Priority] VARCHAR(20),
    CONSTRAINT [PK_Vacancies] PRIMARY KEY ([Vacancy_ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "Vacancy_Fill_Details"                                       */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Vacancy_Fill_Details] (
    [ID] INTEGER NOT NULL,
    [Vacancy_ID] VARCHAR(10) NOT NULL,
    [Em_ID] INTEGER,
    [Filled_Date] DATETIME,
    [Intake_Details] VARCHAR(50),
    [Status] VARCHAR(10),
    [Creator] VARCHAR(20),
    CONSTRAINT [PK_Vacancy_Fill_Details] PRIMARY KEY ([ID])
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
/* Add table "Assignment"                                                 */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Assignment] (
    [Des_ID] INTEGER NOT NULL,
    [Fun_ID] INTEGER NOT NULL,
    CONSTRAINT [PK_Assignment] PRIMARY KEY ([Des_ID], [Fun_ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "Functions"                                                  */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Functions] (
    [ID] INTEGER IDENTITY(0,1) NOT NULL,
    [Fun_Name] VARCHAR(20),
    CONSTRAINT [PK_Functions] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "History"                                                    */
/* ---------------------------------------------------------------------- */

CREATE TABLE [History] (
    [ID] INTEGER NOT NULL,
    [Em_ID] INTEGER,
    [Des_ID] INTEGER,
    [Date_action] DATETIME,
    [Action] VARCHAR(20),
    CONSTRAINT [PK_History] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Foreign key constraints                                                */
/* ---------------------------------------------------------------------- */

ALTER TABLE [Employee] ADD CONSTRAINT [Section_Employee] 
    FOREIGN KEY ([Section_ID]) REFERENCES [Section] ([ID])
GO

ALTER TABLE [Employee] ADD CONSTRAINT [Designation_Employee] 
    FOREIGN KEY ([Des_ID]) REFERENCES [Designation] ([ID])
GO

ALTER TABLE [Section] ADD CONSTRAINT [Departments_Section] 
    FOREIGN KEY ([Dep_No]) REFERENCES [Departments] ([Dep_No])
GO

ALTER TABLE [Designation] ADD CONSTRAINT [DesigLayer_Designation] 
    FOREIGN KEY ([Designation]) REFERENCES [DesigLayer] ([Designation_ID])
GO

ALTER TABLE [Job_rotation] ADD CONSTRAINT [Employee_Job_rotation] 
    FOREIGN KEY ([Em_ID]) REFERENCES [Employee] ([ID])
GO

ALTER TABLE [Vacancies] ADD CONSTRAINT [Departments_Vacancies] 
    FOREIGN KEY ([Dep_No]) REFERENCES [Departments] ([Dep_No])
GO

ALTER TABLE [Vacancies] ADD CONSTRAINT [Section_Vacancies] 
    FOREIGN KEY ([Section_ID]) REFERENCES [Section] ([ID])
GO

ALTER TABLE [Vacancy_Fill_Details] ADD CONSTRAINT [Vacancies_Vacancy_Fill_Details] 
    FOREIGN KEY ([Vacancy_ID]) REFERENCES [Vacancies] ([Vacancy_ID])
GO

ALTER TABLE [Vacancy_Fill_Details] ADD CONSTRAINT [Employee_Vacancy_Fill_Details] 
    FOREIGN KEY ([Em_ID]) REFERENCES [Employee] ([ID])
GO

ALTER TABLE [Assignment] ADD CONSTRAINT [Functions_Assignment] 
    FOREIGN KEY ([Fun_ID]) REFERENCES [Functions] ([ID])
GO

ALTER TABLE [Assignment] ADD CONSTRAINT [Designation_Assignment] 
    FOREIGN KEY ([Des_ID]) REFERENCES [Designation] ([ID])
GO

ALTER TABLE [History] ADD CONSTRAINT [Employee_History] 
    FOREIGN KEY ([Em_ID]) REFERENCES [Employee] ([ID])
GO

ALTER TABLE [History] ADD CONSTRAINT [Designation_History] 
    FOREIGN KEY ([Des_ID]) REFERENCES [Designation] ([ID])
GO
