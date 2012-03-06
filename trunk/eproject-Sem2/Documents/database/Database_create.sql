/* ---------------------------------------------------------------------- */
/* Script generated with: DeZign for Databases v4.1.3                     */
/* Target DBMS:           MS SQL Server 2005                              */
/* Project file:          Database.dez                                    */
/* Project name:                                                          */
/* Author:                                                                */
/* Script type:           Database creation script                        */
/* Created on:            2012-03-06 13:21                                */
/* ---------------------------------------------------------------------- */


/* ---------------------------------------------------------------------- */
/* Tables                                                                 */
/* ---------------------------------------------------------------------- */

/* ---------------------------------------------------------------------- */
/* Add table "ThanhVien"                                                  */
/* ---------------------------------------------------------------------- */

IF EXISTS (SELECT * FROM dbo.sysobjects where name='ThanhVien')
BEGIN
	DROP TABLE ThanhVien
END
GO 
CREATE TABLE [ThanhVien] (
    [ID] INTEGER IDENTITY(0,1) NOT NULL,
    [Ten_Dang_Nhap] NVARCHAR(40),
    [Ma_Vai_Tro] INTEGER,
    [Dia_Chi] NVARCHAR(40),
    [Gioi_Tinh] NVARCHAR(40),
    [So_Dien_Thoai] NUMERIC,
    [Ghi_Chu] NVARCHAR(40),
    CONSTRAINT [PK_ThanhVien] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "VaiTro"                                                     */
/* ---------------------------------------------------------------------- */

IF EXISTS (SELECT * FROM dbo.sysobjects where name='VaiTro')
BEGIN
	DROP TABLE VaiTro
END
GO 
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

IF EXISTS (SELECT * FROM dbo.sysobjects where name='ChucNang')
BEGIN
	DROP TABLE ChucNang
END
GO 
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

IF EXISTS (SELECT * FROM dbo.sysobjects where name='PhanQuyen')
BEGIN
	DROP TABLE PhanQuyen
END
GO 
CREATE TABLE [PhanQuyen] (
    [Ma_Vai_Tro] INTEGER NOT NULL,
    [Ma_Chuc_Nang] INTEGER NOT NULL,
    CONSTRAINT [PK_PhanQuyen] PRIMARY KEY ([Ma_Vai_Tro], [Ma_Chuc_Nang])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "HoaDon"                                                     */
/* ---------------------------------------------------------------------- */

IF EXISTS (SELECT * FROM dbo.sysobjects where name='HoaDon')
BEGIN
	DROP TABLE HoaDon
END
GO 
CREATE TABLE [HoaDon] (
    [ID] INTEGER IDENTITY(0,1) NOT NULL,
    [Ngay_Lap] NVARCHAR(40),
    [Ma_Nhan_Vien] INTEGER,
    [Ma_Khach_Hang] INTEGER,
    [So_Luong] INTEGER,
    [Ghi_Chu] NVARCHAR(40),
    CONSTRAINT [PK_HoaDon] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "SanPham"                                                    */
/* ---------------------------------------------------------------------- */

IF EXISTS (SELECT * FROM dbo.sysobjects where name='SanPham')
BEGIN
	DROP TABLE SanPham
END
GO 
CREATE TABLE [SanPham] (
    [ID] INTEGER IDENTITY(0,1) NOT NULL,
    [Ten_San_Pham] NVARCHAR(40),
    [Gia_Tien] NUMERIC,
    [Ghi_Chu] NVARCHAR(40),
    CONSTRAINT [PK_SanPham] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "LoiSanPham"                                                 */
/* ---------------------------------------------------------------------- */

IF EXISTS (SELECT * FROM dbo.sysobjects where name='LoiSanPham')
BEGIN
	DROP TABLE LoiSanPham
END
GO 
CREATE TABLE [LoiSanPham] (
    [ID] INTEGER NOT NULL,
    [Ma_San_Pham] INTEGER,
    [Ten_Khach_Hang] NVARCHAR(40),
    [Ghi_Chu] NVARCHAR(40),
    CONSTRAINT [PK_LoiSanPham] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "KhachHang"                                                  */
/* ---------------------------------------------------------------------- */

IF EXISTS (SELECT * FROM dbo.sysobjects where name='KhachHang')
BEGIN
	DROP TABLE KhachHang
END
GO 
CREATE TABLE [KhachHang] (
    [ID] INTEGER IDENTITY(0,1) NOT NULL,
    [Ten_Khach_Hang] NVARCHAR(40),
    [Dia_Chi] NVARCHAR(40),
    [So_Dien_Thoai] NUMERIC,
    [Ghi_Chu] NVARCHAR(40),
    CONSTRAINT [PK_KhachHang] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "ChiTietHoaDon"                                              */
/* ---------------------------------------------------------------------- */

IF EXISTS (SELECT * FROM dbo.sysobjects where name='ChiTietHoaDon')
BEGIN
	DROP TABLE ChiTietHoaDon
END
GO 
CREATE TABLE [ChiTietHoaDon] (
    [ID] INTEGER IDENTITY(0,1) NOT NULL,
    [Ma_Khach_Hang] INTEGER,
    [Ma_San_Pham] INTEGER,
    [Ma_Hoa_Don] INTEGER,
    [So_Luong] INTEGER,
    [Ghi_Chu] NVARCHAR(40),
    CONSTRAINT [PK_ChiTietHoaDon] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "ChiTietLoi"                                                 */
/* ---------------------------------------------------------------------- */

IF EXISTS (SELECT * FROM dbo.sysobjects where name='ChiTietLoi')
BEGIN
	DROP TABLE ChiTietLoi
END
GO 
CREATE TABLE [ChiTietLoi] (
    [ID] INTEGER IDENTITY(0,1) NOT NULL,
    [Ngay_Bao_Loi] NVARCHAR(40),
    [Thong_Tin_Loi] NVARCHAR(40),
    [Ten_San_Pham] NVARCHAR(40),
    [Ma_Hoa_Don] INTEGER,
    CONSTRAINT [PK_ChiTietLoi] PRIMARY KEY ([ID])
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

ALTER TABLE [HoaDon] ADD CONSTRAINT [KhachHang_HoaDon] 
    FOREIGN KEY ([Ma_Khach_Hang]) REFERENCES [KhachHang] ([ID])
GO

ALTER TABLE [HoaDon] ADD CONSTRAINT [ThanhVien_HoaDon] 
    FOREIGN KEY ([Ma_Nhan_Vien]) REFERENCES [ThanhVien] ([ID])
GO

ALTER TABLE [LoiSanPham] ADD CONSTRAINT [SanPham_LoiSanPham] 
    FOREIGN KEY ([Ma_San_Pham]) REFERENCES [SanPham] ([ID])
GO

ALTER TABLE [ChiTietHoaDon] ADD CONSTRAINT [HoaDon_ChiTietHoaDon] 
    FOREIGN KEY ([Ma_Hoa_Don]) REFERENCES [HoaDon] ([ID])
GO

ALTER TABLE [ChiTietHoaDon] ADD CONSTRAINT [SanPham_ChiTietHoaDon] 
    FOREIGN KEY ([Ma_San_Pham]) REFERENCES [SanPham] ([ID])
GO

ALTER TABLE [ChiTietLoi] ADD CONSTRAINT [LoiSanPham_ChiTietLoi] 
    FOREIGN KEY ([ID]) REFERENCES [LoiSanPham] ([ID])
GO

ALTER TABLE [ChiTietLoi] ADD CONSTRAINT [HoaDon_ChiTietLoi] 
    FOREIGN KEY ([Ma_Hoa_Don]) REFERENCES [HoaDon] ([ID])
GO
