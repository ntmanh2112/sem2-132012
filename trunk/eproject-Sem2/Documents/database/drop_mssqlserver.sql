/* ---------------------------------------------------------------------- */
/* Script generated with: DeZign for Databases v4.1.3                     */
/* Target DBMS:           MS SQL Server 2005                              */
/* Project file:          Database.dez                                    */
/* Project name:                                                          */
/* Author:                                                                */
/* Script type:           Database drop script                            */
/* Created on:            2012-03-05 10:42                                */
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

ALTER TABLE [HoaDon] DROP CONSTRAINT [KhachHang_HoaDon]
GO

ALTER TABLE [HoaDon] DROP CONSTRAINT [ThanhVien_HoaDon]
GO

ALTER TABLE [LoiSanPham] DROP CONSTRAINT [SanPham_LoiSanPham]
GO

ALTER TABLE [ChiTietHoaDon] DROP CONSTRAINT [HoaDon_ChiTietHoaDon]
GO

ALTER TABLE [ChiTietHoaDon] DROP CONSTRAINT [SanPham_ChiTietHoaDon]
GO

ALTER TABLE [ChiTietLoi] DROP CONSTRAINT [LoiSanPham_ChiTietLoi]
GO

ALTER TABLE [ChiTietLoi] DROP CONSTRAINT [HoaDon_ChiTietLoi]
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

/* ---------------------------------------------------------------------- */
/* Drop table "HoaDon"                                                    */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [HoaDon] DROP CONSTRAINT [PK_HoaDon]
GO

/* Drop table */

DROP TABLE [HoaDon]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "SanPham"                                                   */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [SanPham] DROP CONSTRAINT [PK_SanPham]
GO

/* Drop table */

DROP TABLE [SanPham]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "LoiSanPham"                                                */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [LoiSanPham] DROP CONSTRAINT [PK_LoiSanPham]
GO

/* Drop table */

DROP TABLE [LoiSanPham]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "KhachHang"                                                 */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [KhachHang] DROP CONSTRAINT [PK_KhachHang]
GO

/* Drop table */

DROP TABLE [KhachHang]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "ChiTietHoaDon"                                             */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [ChiTietHoaDon] DROP CONSTRAINT [PK_ChiTietHoaDon]
GO

/* Drop table */

DROP TABLE [ChiTietHoaDon]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "ChiTietLoi"                                                */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [ChiTietLoi] DROP CONSTRAINT [PK_ChiTietLoi]
GO

/* Drop table */

DROP TABLE [ChiTietLoi]
GO
