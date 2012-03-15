/* ---------------------------------------------------------------------- */
/* Script generated with: DeZign for Databases v4.1.3                     */
/* Target DBMS:           MS SQL Server 2005                              */
/* Project file:          Project1.dez                                    */
/* Project name:                                                          */
/* Author:                                                                */
/* Script type:           Database drop script                            */
/* Created on:            2012-03-14 12:50                                */
/* ---------------------------------------------------------------------- */


/* ---------------------------------------------------------------------- */
/* Drop foreign key constraints                                           */
/* ---------------------------------------------------------------------- */

ALTER TABLE [Employee] DROP CONSTRAINT [Section_Employee]
GO

ALTER TABLE [Employee] DROP CONSTRAINT [Designation_Employee]
GO

ALTER TABLE [Section] DROP CONSTRAINT [Departments_Section]
GO

ALTER TABLE [Designation] DROP CONSTRAINT [DesigLayer_Designation]
GO

ALTER TABLE [Job_rotation] DROP CONSTRAINT [Employee_Job_rotation]
GO

ALTER TABLE [Vacancies] DROP CONSTRAINT [Departments_Vacancies]
GO

ALTER TABLE [Vacancies] DROP CONSTRAINT [Section_Vacancies]
GO

ALTER TABLE [Vacancy_Fill_Details] DROP CONSTRAINT [Vacancies_Vacancy_Fill_Details]
GO

ALTER TABLE [Vacancy_Fill_Details] DROP CONSTRAINT [Employee_Vacancy_Fill_Details]
GO

ALTER TABLE [Assignment] DROP CONSTRAINT [Functions_Assignment]
GO

ALTER TABLE [Assignment] DROP CONSTRAINT [Designation_Assignment]
GO

ALTER TABLE [History] DROP CONSTRAINT [Employee_History]
GO

ALTER TABLE [History] DROP CONSTRAINT [Designation_History]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "Departments"                                               */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [Departments] DROP CONSTRAINT [PK_Departments]
GO

/* Drop table */

DROP TABLE [Departments]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "Employee"                                                  */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [Employee] DROP CONSTRAINT [PK_Employee]
GO

/* Drop table */

DROP TABLE [Employee]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "Section"                                                   */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [Section] DROP CONSTRAINT [PK_Section]
GO

/* Drop table */

DROP TABLE [Section]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "Designation"                                               */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [Designation] DROP CONSTRAINT [PK_Designation]
GO

/* Drop table */

DROP TABLE [Designation]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "Job_rotation"                                              */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [Job_rotation] DROP CONSTRAINT [PK_Job_rotation]
GO

/* Drop table */

DROP TABLE [Job_rotation]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "Vacancies"                                                 */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [Vacancies] DROP CONSTRAINT [PK_Vacancies]
GO

/* Drop table */

DROP TABLE [Vacancies]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "Vacancy_Fill_Details"                                      */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [Vacancy_Fill_Details] DROP CONSTRAINT [PK_Vacancy_Fill_Details]
GO

/* Drop table */

DROP TABLE [Vacancy_Fill_Details]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "DesigLayer"                                                */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [DesigLayer] DROP CONSTRAINT [PK_DesigLayer]
GO

/* Drop table */

DROP TABLE [DesigLayer]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "Assignment"                                                */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [Assignment] DROP CONSTRAINT [PK_Assignment]
GO

/* Drop table */

DROP TABLE [Assignment]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "Functions"                                                 */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [Functions] DROP CONSTRAINT [PK_Functions]
GO

/* Drop table */

DROP TABLE [Functions]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "History"                                                   */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [History] DROP CONSTRAINT [PK_History]
GO

/* Drop table */

DROP TABLE [History]
GO
