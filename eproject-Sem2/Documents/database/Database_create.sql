/* ---------------------------------------------------------------------- */
/* Script generated with: DeZign for Databases v4.1.3                     */
/* Target DBMS:           MS SQL Server 2005                              */
/* Project file:          Project1.dez                                    */
/* Project name:                                                          */
/* Author:                                                                */
/* Script type:           Database creation script                        */
/* Created on:            2012-03-09 11:17                                */
/* ---------------------------------------------------------------------- */


/* ---------------------------------------------------------------------- */
/* Tables                                                                 */
/* ---------------------------------------------------------------------- */

/* ---------------------------------------------------------------------- */
/* Add table "NhanVien"                                                   */
/* ---------------------------------------------------------------------- */

CREATE TABLE [NhanVien] (
    [Ma_Nhan_Vien] NVARCHAR(40) NOT NULL,
    [Ten_Nhan_Vien] NVARCHAR(40),
    [Ma_Vai_Tro] NVARCHAR(40) NOT NULL,
    [Dia_Chi] NVARCHAR(40),
    [Dien_Thoai] NUMERIC,
    [Gioi_Tinh] NVARCHAR(40),
    CONSTRAINT [PK_NhanVien] PRIMARY KEY ([Ma_Nhan_Vien])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "VaiTro"                                                     */
/* ---------------------------------------------------------------------- */

CREATE TABLE [VaiTro] (
    [Ma_Vai_Tro] NVARCHAR(40) NOT NULL,
    [Ten_Vai_Tro] NVARCHAR(40),
    [Ghi_Chu] NVARCHAR(40),
    [Ma_Nhan_Vien] NVARCHAR(40) NOT NULL,
    CONSTRAINT [PK_VaiTro] PRIMARY KEY ([Ma_Vai_Tro])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "ChucNang"                                                   */
/* ---------------------------------------------------------------------- */

CREATE TABLE [ChucNang] (
    [Ma_Chuc_Nang] NVARCHAR(40) NOT NULL,
    [Ten_Chuc_Nang] NVARCHAR(40),
    [Ghi_Chu] NVARCHAR(40),
    CONSTRAINT [PK_ChucNang] PRIMARY KEY ([Ma_Chuc_Nang])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "PhanQuyen"                                                  */
/* ---------------------------------------------------------------------- */

CREATE TABLE [PhanQuyen] (
    [Ma_Vai_Tro] NVARCHAR(40) NOT NULL,
    [Ma_Chuc_nang] NVARCHAR(40) NOT NULL,
    CONSTRAINT [PK_PhanQuyen] PRIMARY KEY ([Ma_Vai_Tro], [Ma_Chuc_nang])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "KhachHang"                                                  */
/* ---------------------------------------------------------------------- */

CREATE TABLE [KhachHang] (
    [Ma_Khach_hang] NVARCHAR(40) NOT NULL,
    [Ten_Khach_Hang] NVARCHAR(40),
    [Dia_chi] NVARCHAR(40),
    [Dien_Thoai] NUMERIC,
    CONSTRAINT [PK_KhachHang] PRIMARY KEY ([Ma_Khach_hang])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "SanPham"                                                    */
/* ---------------------------------------------------------------------- */

CREATE TABLE [SanPham] (
    [Ma_San_Pham] NVARCHAR(40) NOT NULL,
    [Ten_San_Pham] NVARCHAR(40),
    [Gia_Tien] NUMERIC,
    [Ghi_Chu] NVARCHAR(40),
    CONSTRAINT [PK_SanPham] PRIMARY KEY ([Ma_San_Pham])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "HoaDon"                                                     */
/* ---------------------------------------------------------------------- */

CREATE TABLE [HoaDon] (
    [Ma_Hoa_Don] NVARCHAR(40) NOT NULL,
    [Ngay_Lap] NVARCHAR(40),
    [Ma_Nhan_Vien] NVARCHAR(40) NOT NULL,
    [Ma_Khach_hang] NVARCHAR(40) NOT NULL,
    [So_Luong] INTEGER,
    [Ghi_Chu] NVARCHAR(40),
    CONSTRAINT [PK_HoaDon] PRIMARY KEY ([Ma_Hoa_Don])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "ChiTietHoaDon"                                              */
/* ---------------------------------------------------------------------- */

CREATE TABLE [ChiTietHoaDon] (
    [ID] INTEGER NOT NULL,
    [Ma_Khach_Hang] NVARCHAR(40),
    [Ma_San_Pham] NVARCHAR(40) NOT NULL,
    [Ma_Hoa_Don] NVARCHAR(40) NOT NULL,
    [So_Luong] INTEGER,
    CONSTRAINT [PK_ChiTietHoaDon] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "LoiSanPham"                                                 */
/* ---------------------------------------------------------------------- */

CREATE TABLE [LoiSanPham] (
    [Ma_San_Pham] NVARCHAR(40) NOT NULL,
    [Ten_Khach_Hang] NVARCHAR(40),
    [Ngay_Ghi_Nhan] NVARCHAR(40),
    [Ngay_Hoan_Thanh] NVARCHAR(40),
    [Tinh_Trang_Loi] INTEGER,
    [Ghi_Chu] NVARCHAR(40),
    CONSTRAINT [PK_LoiSanPham] PRIMARY KEY ([Ma_San_Pham])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "ChiTietLoi"                                                 */
/* ---------------------------------------------------------------------- */

CREATE TABLE [ChiTietLoi] (
    [ID] INTEGER NOT NULL,
    [Ma_San_Pham] NVARCHAR(40),
    [Ngay_Bao_Loi] NVARCHAR(40),
    [Thong_Tin_Loi] NVARCHAR(40),
    [Ten_San_Pham] NVARCHAR(40),
    [Ma_Hoa_Don] NVARCHAR(40),
    CONSTRAINT [PK_ChiTietLoi] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Foreign key constraints                                                */
/* ---------------------------------------------------------------------- */

ALTER TABLE [NhanVien] ADD CONSTRAINT [VaiTro_NhanVien] 
    FOREIGN KEY ([Ma_Vai_Tro]) REFERENCES [VaiTro] ([Ma_Vai_Tro])
GO

ALTER TABLE [PhanQuyen] ADD CONSTRAINT [VaiTro_PhanQuyen] 
    FOREIGN KEY ([Ma_Vai_Tro]) REFERENCES [VaiTro] ([Ma_Vai_Tro])
GO

ALTER TABLE [PhanQuyen] ADD CONSTRAINT [ChucNang_PhanQuyen] 
    FOREIGN KEY ([Ma_Chuc_nang]) REFERENCES [ChucNang] ([Ma_Chuc_Nang])
GO

ALTER TABLE [HoaDon] ADD CONSTRAINT [NhanVien_HoaDon] 
    FOREIGN KEY ([Ma_Nhan_Vien]) REFERENCES [NhanVien] ([Ma_Nhan_Vien])
GO

ALTER TABLE [HoaDon] ADD CONSTRAINT [KhachHang_HoaDon] 
    FOREIGN KEY ([Ma_Khach_hang]) REFERENCES [KhachHang] ([Ma_Khach_hang])
GO

ALTER TABLE [ChiTietHoaDon] ADD CONSTRAINT [HoaDon_ChiTietHoaDon] 
    FOREIGN KEY ([Ma_Hoa_Don]) REFERENCES [HoaDon] ([Ma_Hoa_Don])
GO

ALTER TABLE [ChiTietHoaDon] ADD CONSTRAINT [SanPham_ChiTietHoaDon] 
    FOREIGN KEY ([Ma_San_Pham]) REFERENCES [SanPham] ([Ma_San_Pham])
GO

ALTER TABLE [ChiTietLoi] ADD CONSTRAINT [HoaDon_ChiTietLoi] 
    FOREIGN KEY ([Ma_Hoa_Don]) REFERENCES [HoaDon] ([Ma_Hoa_Don])
GO

ALTER TABLE [ChiTietLoi] ADD CONSTRAINT [SanPham_ChiTietLoi] 
    FOREIGN KEY ([Ma_San_Pham]) REFERENCES [SanPham] ([Ma_San_Pham])
GO

ALTER TABLE [ChiTietLoi] ADD CONSTRAINT [LoiSanPham_ChiTietLoi] 
    FOREIGN KEY ([Ma_San_Pham]) REFERENCES [LoiSanPham] ([Ma_San_Pham])
GO
