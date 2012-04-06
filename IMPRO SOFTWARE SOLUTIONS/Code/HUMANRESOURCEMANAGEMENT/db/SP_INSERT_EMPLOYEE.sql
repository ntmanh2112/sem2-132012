--drop PROC sp_INSERT_EMPLOYEE
CREATE PROC sp_INSERT_EMPLOYEE
	@EmID	varchar(10),
	@Name	varchar(10),
	@SecID	varchar(40),
	@Des_ID	varchar(10),
	
	@Address	varchar(50),
	@Phone	varchar(15),
	@Fax	varchar(15),
	@Email	varchar(50),
	@Password	nvarchar(40)
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
	
END
