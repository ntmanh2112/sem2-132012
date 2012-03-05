/* ---------------------------------------------------------------------- */
/* Script generated with: DeZign for Databases v4.1.3                     */
/* Target DBMS:           MS SQL Server 2005                              */
/* Project file:          Project1.dez                                    */
/* Project name:                                                          */
/* Author:                                                                */
/* Script type:           Database drop script                            */
/* Created on:            2012-03-02 09:26                                */
/* ---------------------------------------------------------------------- */


/* ---------------------------------------------------------------------- */
/* Drop foreign key constraints                                           */
/* ---------------------------------------------------------------------- */

ALTER TABLE [ThanhVien] DROP CONSTRAINT [VaiTro_ThanhVien]
GO

ALTER TABLE [PhanQuyen] DROP CONSTRAINT [VaiTro_PhanQuyen]
GO

ALTER TABLE [PhanQuyen] DROP CONSTRAINT [ChucNang_PhanQuyen]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "ThanhVien"                                                 */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [ThanhVien] DROP CONSTRAINT [PK_ThanhVien]
GO

/* Drop table */

DROP TABLE [ThanhVien]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "VaiTro"                                                    */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [VaiTro] DROP CONSTRAINT [PK_VaiTro]
GO

/* Drop table */

DROP TABLE [VaiTro]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "ChucNang"                                                  */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [ChucNang] DROP CONSTRAINT [PK_ChucNang]
GO

/* Drop table */

DROP TABLE [ChucNang]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "PhanQuyen"                                                 */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [PhanQuyen] DROP CONSTRAINT [PK_PhanQuyen]
GO

/* Drop table */

DROP TABLE [PhanQuyen]
GO
