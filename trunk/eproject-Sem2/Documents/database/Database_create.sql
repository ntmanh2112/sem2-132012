/* ---------------------------------------------------------------------- */
/* Script generated with: DeZign for Databases v4.1.3                     */
/* Target DBMS:           MS SQL Server 2005                              */
/* Project file:          Project1.dez                                    */
/* Project name:                                                          */
/* Author:                                                                */
/* Script type:           Database creation script                        */
/* Created on:            2012-03-05 09:38                                */
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
    [Ghi_Chu] NVARCHAR(40),
    [Dia_Chi] NVARCHAR(40),
    [Gioi_Tinh] NVARCHAR(40),
    [So_Dien_Thoai] NUMERIC,
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
/* Add table "HoaDon"                                                     */
/* ---------------------------------------------------------------------- */

CREATE TABLE [HoaDon] (
    [ID] INTEGER IDENTITY(0,1) NOT NULL,
    [Ngay_Lap] NVARCHAR(40),
    [Ghi_Chu] NVARCHAR(40),
    [Ma_Nhan_Vien] INTEGER,
    [Ma_Khach_Hang] NVARCHAR(40),
    [So_Luong] INTEGER,
    CONSTRAINT [PK_HoaDon] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "SanPham"                                                    */
/* ---------------------------------------------------------------------- */

CREATE TABLE [SanPham] (
    [ID] INTEGER IDENTITY(0,1) NOT NULL,
    [Ten_San_Pham] NVARCHAR(40),
    [Ghi_Chu] NVARCHAR(40),
    [Gia_Tien] NUMERIC,
    CONSTRAINT [PK_SanPham] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "LoiSanPham"                                                 */
/* ---------------------------------------------------------------------- */

CREATE TABLE [LoiSanPham] (
    [Ma_San_Pham] INTEGER NOT NULL,
    [Ghi_Chu] NVARCHAR(40),
    [Ten_Khach_Hang] NVARCHAR(40),
    CONSTRAINT [PK_LoiSanPham] PRIMARY KEY ([Ma_San_Pham])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "KhachHang"                                                  */
/* ---------------------------------------------------------------------- */

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

CREATE TABLE [ChiTietHoaDon] (
    [ID] INTEGER IDENTITY(0,1) NOT NULL,
    [Ma_Khach_Hang] INTEGER,
    [Ghi_Chu] NVARCHAR(40),
    [Ma_San_Pham] INTEGER,
    [So_Luong] INTEGER,
    CONSTRAINT [PK_ChiTietHoaDon] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "ChiTietLoi"                                                 */
/* ---------------------------------------------------------------------- */

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
    FOREIGN KEY ([Ma_Khach_Hang]) REFERENCES [KhachHang] ([Ten_Khach_Hang])
GO

ALTER TABLE [SanPham] ADD CONSTRAINT [LoiSanPham_SanPham] 
    FOREIGN KEY ([ID]) REFERENCES [LoiSanPham] ([Ma_San_Pham])
GO

ALTER TABLE [ChiTietHoaDon] ADD CONSTRAINT [HoaDon_ChiTietHoaDon] 
    FOREIGN KEY ([ID]) REFERENCES [HoaDon] ([ID])
GO

ALTER TABLE [ChiTietHoaDon] ADD CONSTRAINT [SanPham_ChiTietHoaDon] 
    FOREIGN KEY ([Ma_San_Pham]) REFERENCES [SanPham] ([ID])
GO

ALTER TABLE [ChiTietLoi] ADD CONSTRAINT [LoiSanPham_ChiTietLoi] 
    FOREIGN KEY ([ID]) REFERENCES [LoiSanPham] ([Ma_San_Pham])
GO
