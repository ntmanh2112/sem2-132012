--drop PROC sp_UPDATE_EMPLOYEE
CREATE PROC sp_UPDATE_EMPLOYEE
	@EmID	varchar(10),
	@Name	varchar(10),
	@Dep_ID	varchar(40),
	@Des_ID	varchar(10),
	@SecID	varchar(10),
	@Address	varchar(50),
	@Phone	varchar(15),
	@Fax	varchar(15),
	@Email	varchar(50),
	@Password	nvarchar(40)
AS	
BEGIN
	UPDATE  EMPLOYEE
	SET 
		EmID = @EmID,
		Name = @Name,
		Dep_ID = @Dep_ID,
		Des_ID = @Des_ID,
		SecID = @SecID,
		Address = @Address,
		Phone = @Phone,
		Fax = @Fax,
		Email = @Email
	where EmID = @EmID;

	UPDATE ACCOUNT
	SET 
		EmID = @EmID,
		Password = @Password
		
	where EmID = @EmID;
	
END
