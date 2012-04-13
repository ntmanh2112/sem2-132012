IF EXISTS (SELECT * FROM DBO.SYSOBJECTS WHERE NAME='SP_UPDATEACCOUNTTODISIGNATION')
BEGIN
	DROP PROC SP_UPDATEACCOUNTTODISIGNATION
END
GO
CREATE PROC SP_UPDATEACCOUNTTODISIGNATION
	@EmID varchar(10),
	@Password varchar(40),
	@Name varchar(10),
	@Des_ID varchar(10)
	
	
AS
BEGIN
	UPDATE ACCOUNT
	SET
	EmID = @EmID ,
	Password = @Password
	
	
	where EmID = @EmID;
	
	UPDATE EMPLOYEE
	SET
	EmID = @EmID,
	Des_ID = @Des_ID
END