/* ---------------------------------------------------------------------- */
/* Script generated with: DeZign for Databases v4.1.3                     */
/* Target DBMS:           MS SQL Server 2005                              */
/* Project file:          Project1.dez                                    */
/* Project name:                                                          */
/* Author:                                                                */
/* Script type:           Database creation script                        */
/* Created on:            2012-03-02 09:26                                */
/* ---------------------------------------------------------------------- */


/* ---------------------------------------------------------------------- */
/* Tables                                                                 */
/* ---------------------------------------------------------------------- */

/* ---------------------------------------------------------------------- */
/* Add table "ThanhVien"                                                  */
/* ---------------------------------------------------------------------- */

CREATE TABLE [ThanhVien] (
    [ID] INTEGER IDENTITY(0,1) NOT NULL,
    [Ten_Dang_Nhap] NVARCHAR(40),
    [Ma_Vai_Tro] INTEGER,
    [Ghi_Chu] VARCHAR(40),
    CONSTRAINT [PK_ThanhVien] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "VaiTro"                                                     */
/* ---------------------------------------------------------------------- */

CREATE TABLE [VaiTro] (
    [ID] INTEGER IDENTITY(0,1) NOT NULL,
    [Ten_Vai_Tro] NVARCHAR(40),
    [Ghi_Chu] NVARCHAR(40),
    CONSTRAINT [PK_VaiTro] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "ChucNang"                                                   */
/* ---------------------------------------------------------------------- */

CREATE TABLE [ChucNang] (
    [ID] INTEGER IDENTITY(0,1) NOT NULL,
    [Ten_Chuc_Nang] NVARCHAR(40),
    [Ghi_Chu] VARCHAR(40),
    CONSTRAINT [PK_ChucNang] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "PhanQuyen"                                                  */
/* ---------------------------------------------------------------------- */

CREATE TABLE [PhanQuyen] (
    [Ma_Vai_Tro] INTEGER NOT NULL,
    [Ma_Chuc_Nang] INTEGER NOT NULL,
    CONSTRAINT [PK_PhanQuyen] PRIMARY KEY ([Ma_Vai_Tro], [Ma_Chuc_Nang])
)
GO

/* ---------------------------------------------------------------------- */
/* Foreign key constraints                                                */
/* ---------------------------------------------------------------------- */

ALTER TABLE [ThanhVien] ADD CONSTRAINT [VaiTro_ThanhVien] 
    FOREIGN KEY ([Ma_Vai_Tro]) REFERENCES [VaiTro] ([ID])
GO

ALTER TABLE [PhanQuyen] ADD CONSTRAINT [VaiTro_PhanQuyen] 
    FOREIGN KEY ([Ma_Vai_Tro]) REFERENCES [VaiTro] ([ID])
GO

ALTER TABLE [PhanQuyen] ADD CONSTRAINT [ChucNang_PhanQuyen] 
    FOREIGN KEY ([Ma_Chuc_Nang]) REFERENCES [ChucNang] ([ID])
GO
