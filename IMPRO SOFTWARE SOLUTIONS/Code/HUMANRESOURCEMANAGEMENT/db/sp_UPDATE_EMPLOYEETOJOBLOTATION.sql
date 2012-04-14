IF EXISTS (SELECT * FROM DBO.SYSOBJECTS WHERE NAME='sp_UPDATE_EMPLOYEETOJOBLOTATION')
BEGIN
	DROP PROC sp_UPDATE_EMPLOYEETOJOBLOTATION
END
GO
CREATE PROC sp_UPDATE_EMPLOYEETOJOBLOTATION
	@EmID	varchar(10),
	@Present_Designation varchar(15),
	@Deputed_To varchar(10),

	@Status varchar(50),
	@Remarks varchar(100),

	@Name	varchar(10),
	@SecID	varchar(40),
	@Des_ID	varchar(10),
	
	@Address	varchar(50),
	@Phone	varchar(15),
	@Fax	varchar(15),
	@Email	varchar(50)
	

	
AS	
BEGIN
	UPDATE JOB_ROTATION
	SET
		EmID = @EmID,
		Present_Designation = @Present_Designation,
		Deputed_To = @Deputed_To,
		
		Status = @Status,
		Remarks = @Remarks
	WHERE EmID = @EmID


	UPDATE  EMPLOYEE
	SET 
		EmID = @EmID,
		Name = @Name,
		SecID = @SecID,
		Des_ID = @Des_ID,
		
		Address = @Address,
		Phone = @Phone,
		Fax = @Fax,
		Email = @Email
	where EmID = @EmID;

	

	
	
END