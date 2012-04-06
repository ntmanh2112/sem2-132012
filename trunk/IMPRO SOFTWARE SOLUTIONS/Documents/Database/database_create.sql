/* ---------------------------------------------------------------------- */
/* Script generated with: DeZign for Databases v4.1.3                     */
/* Target DBMS:           MS SQL Server 2005                              */
/* Project file:          Database.dez                                    */
/* Project name:                                                          */
/* Author:                                                                */
/* Script type:           Database creation script                        */
/* Created on:            2012-04-06 08:52                                */
/* ---------------------------------------------------------------------- */


/* ---------------------------------------------------------------------- */
/* Tables                                                                 */
/* ---------------------------------------------------------------------- */

/* ---------------------------------------------------------------------- */
/* Add table "Departments"                                                */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Departments] (
    [Dep_ID] VARCHAR(10) NOT NULL,
    [Dep_Name] VARCHAR(10),
    [Dep_Head] VARCHAR(10),
    [Location] VARCHAR(10),
    [Up_Dep_No] NUMERIC(10),
    [Dn_Dep_No] NUMERIC(10),
    CONSTRAINT [PK_Departments] PRIMARY KEY ([Dep_ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "Employee"                                                   */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Employee] (
    [EmID] VARCHAR(10) NOT NULL,
    [Name] VARCHAR(10),
    [SecID] VARCHAR(10),
    [Des_ID] VARCHAR(10) NOT NULL,
    [Address] VARCHAR(50),
    [Phone] VARCHAR(15),
    [Fax] VARCHAR(15),
    [Email] VARCHAR(50),
    CONSTRAINT [PK_Employee] PRIMARY KEY ([EmID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "Section"                                                    */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Section] (
    [SecID] VARCHAR(10) NOT NULL,
    [Name] VARCHAR(15),
    [Section_Inch] VARCHAR(10),
    [Dep_ID] VARCHAR(10) NOT NULL,
    CONSTRAINT [PK_Section] PRIMARY KEY ([SecID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "Designation"                                                */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Designation] (
    [DesID] VARCHAR(10) NOT NULL,
    [Layer_ID] VARCHAR(10) NOT NULL,
    [Designation] VARCHAR(15),
    CONSTRAINT [PK_Designation] PRIMARY KEY ([DesID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "Job_rotation"                                               */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Job_rotation] (
    [ID] INTEGER IDENTITY(0,1) NOT NULL,
    [Em_ID] VARCHAR(10) NOT NULL,
    [Present_Designation] VARCHAR(15),
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
    [SecID] VARCHAR(10),
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
/* Add table "Division"                                                   */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Division] (
    [ID] INTEGER IDENTITY(0,1) NOT NULL,
    [Vacancy_ID] VARCHAR(10) NOT NULL,
    [EmID] VARCHAR(10) NOT NULL,
    [SecID] VARCHAR(10) NOT NULL,
    CONSTRAINT [PK_Division] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "DesigLayer"                                                 */
/* ---------------------------------------------------------------------- */

CREATE TABLE [DesigLayer] (
    [Layer_ID] VARCHAR(10) NOT NULL,
    [Layer] NUMERIC(10),
    [Weightage] NUMERIC(10),
    CONSTRAINT [PK_DesigLayer] PRIMARY KEY ([Layer_ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "Assignment"                                                 */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Assignment] (
    [Des_ID] VARCHAR(10) NOT NULL,
    [Fun_ID] VARCHAR(10) NOT NULL,
    CONSTRAINT [PK_Assignment] PRIMARY KEY ([Des_ID], [Fun_ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "Functions"                                                  */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Functions] (
    [ID] VARCHAR(10) NOT NULL,
    [Fun_Name] VARCHAR(20),
    CONSTRAINT [PK_Functions] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "History"                                                    */
/* ---------------------------------------------------------------------- */

CREATE TABLE [History] (
    [ID] INTEGER IDENTITY(0,1) NOT NULL,
    [EmID] VARCHAR(10) NOT NULL,
    [Date_action] DATETIME,
    [Action] VARCHAR(20),
    CONSTRAINT [PK_History] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "Account"                                                    */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Account] (
    [UserID] INTEGER IDENTITY(0,1) NOT NULL,
    [EmID] VARCHAR(10) NOT NULL,
    [Password] NVARCHAR(40),
    CONSTRAINT [PK_Account] PRIMARY KEY ([UserID])
)
GO

/* ---------------------------------------------------------------------- */
/* Foreign key constraints                                                */
/* ---------------------------------------------------------------------- */

ALTER TABLE [Employee] ADD CONSTRAINT [Designation_Employee] 
    FOREIGN KEY ([Des_ID]) REFERENCES [Designation] ([DesID])ON DELETE CASCADE
GO

ALTER TABLE [Employee] ADD CONSTRAINT [Section_Employee] 
    FOREIGN KEY ([SecID]) REFERENCES [Section] ([SecID])ON DELETE CASCADE
GO

ALTER TABLE [Section] ADD CONSTRAINT [Departments_Section] 
    FOREIGN KEY ([Dep_ID]) REFERENCES [Departments] ([Dep_ID])ON DELETE CASCADE
GO

ALTER TABLE [Designation] ADD CONSTRAINT [DesigLayer_Designation] 
    FOREIGN KEY ([Layer_ID]) REFERENCES [DesigLayer] ([Layer_ID])ON DELETE CASCADE
GO

ALTER TABLE [Job_rotation] ADD CONSTRAINT [Employee_Job_rotation] 
    FOREIGN KEY ([Em_ID]) REFERENCES [Employee] ([EmID])ON DELETE CASCADE
GO

ALTER TABLE [Division] ADD CONSTRAINT [Vacancies_Division] 
    FOREIGN KEY ([Vacancy_ID]) REFERENCES [Vacancies] ([Vacancy_ID])ON DELETE CASCADE
GO

ALTER TABLE [Division] ADD CONSTRAINT [Employee_Division] 
    FOREIGN KEY ([EmID]) REFERENCES [Employee] ([EmID])ON DELETE CASCADE
GO

ALTER TABLE [Assignment] ADD CONSTRAINT [Designation_Assignment] 
    FOREIGN KEY ([Des_ID]) REFERENCES [Designation] ([DesID])ON DELETE CASCADE
GO

ALTER TABLE [Assignment] ADD CONSTRAINT [Functions_Assignment] 
    FOREIGN KEY ([Fun_ID]) REFERENCES [Functions] ([ID])ON DELETE CASCADE
GO

ALTER TABLE [History] ADD CONSTRAINT [Employee_History] 
    FOREIGN KEY ([EmID]) REFERENCES [Employee] ([EmID])ON DELETE CASCADE
GO

ALTER TABLE [Account] ADD CONSTRAINT [Employee_Account] 
    FOREIGN KEY ([EmID]) REFERENCES [Employee] ([EmID])ON DELETE CASCADE
GO
