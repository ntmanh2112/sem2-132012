IF EXISTS (SELECT * FROM DBO.SYSOBJECTS WHERE NAME='sp_INSERT_EMPLOYEETOJOBROTATION')
BEGIN
	DROP PROC sp_INSERT_EMPLOYEETOJOBROTATION
END
GO
CREATE PROC sp_INSERT_EMPLOYEETOJOBROTATION
	@EmID	varchar(10),
	@Name	varchar(10),
	@SecID	varchar(40),
	@Des_ID	varchar(10),
	
	@Address	varchar(50),
	@Phone	varchar(15),
	@Fax	varchar(15),
	@Email	varchar(50),
	@Password	nvarchar(40),
	
	@Present_Designation varchar(15),
	@Deputed_To varchar(10),
	
	@Status varchar(50),
	@Remarks varchar(100)
AS	
BEGIN
	INSERT INTO EMPLOYEE
	VALUES (
		@EmID,
		@Name,
		@SecID,
		@Des_ID,
		
		@Address,
		@Phone,
		@Fax,
		@Email
	)

	INSERT INTO ACCOUNT (EMID, PASSWORD)
	VALUES (
		@EmID,
		@Password
	)

	INSERT INTO Job_rotation (EMID, Present_Designation,Deputed_To,Status,Remarks)
	VALUES (
		@EmID,
		@Present_Designation,
		@Deputed_To,
	
		@Status,
		@Remarks
	)
	
END