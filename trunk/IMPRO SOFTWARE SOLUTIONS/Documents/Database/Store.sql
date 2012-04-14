IF EXISTS (SELECT * FROM DBO.SYSOBJECTS WHERE NAME='sp_EmployeeToSection')
BEGIN
	DROP PROC sp_EmployeeToSection
END
GO
CREATE PROC sp_EmployeeToSection
@EmID VARCHAR(10),
@SecID VARCHAR(10),
@DivisionID VARCHAR(10)
AS
BEGIN
	IF EXISTS (SELECT * FROM Employee WHERE EmID=@EmID)
	BEGIN
		UPDATE Employee SET SecID=@SecID WHERE EmID=@EmID
		--UPDATE Vacancies SET SecID=@SecID WHERE EmID=@EmID
		--DELETE FROM Division WHERE ID=@DivisionID
	END

END
go
--drop PROC sp_INSERT_EMPLOYEE
IF EXISTS (SELECT * FROM DBO.SYSOBJECTS WHERE NAME='sp_INSERT_EMPLOYEE')
BEGIN
	DROP PROC sp_INSERT_EMPLOYEE
END
GO
CREATE PROC sp_INSERT_EMPLOYEE
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
	
	
END

go

if exists (select * from dbo.sysobjects where name='SP_SEARCHEMPLOYEEINDIVISION')
begin 
	drop proc SP_SEARCHEMPLOYEEINDIVISION
end
go
CREATE PROC SP_SEARCHEMPLOYEEINDIVISION  
 @SECID VARCHAR(10) 

AS   
BEGIN  
 IF EXISTS (SELECT * FROM SECTION WHERE SECID = @SECID)  
 BEGIN  
  SELECT A.EmID,A.NAME, B.SECID, C.DEP_ID
  FROM EMPLOYEE AS A  
INNER JOIN SECTION AS B   
      ON A.SECID = B.SECID  
     INNER JOIN DEPARTMENTS AS C  
   ON B.DEP_ID = C.DEP_ID  
  WHERE B.SECID=@SECID
 END  
END

go

if exists (select * from dbo.sysobjects where name='SP_SEARCHEMPLOYEENOTINDIVISION')
begin 
	drop proc SP_SEARCHEMPLOYEENOTINDIVISION
end
go
CREATE PROC SP_SEARCHEMPLOYEENOTINDIVISION  
 @SECID VARCHAR(10) 

AS   
BEGIN  
 IF EXISTS (SELECT * FROM SECTION WHERE SECID = @SECID)  
 BEGIN  
  SELECT A.EmID,A.NAME, B.SECID, C.DEP_ID
  FROM EMPLOYEE AS A  
INNER JOIN SECTION AS B   
      ON A.SECID = B.SECID  
     INNER JOIN DEPARTMENTS AS C  
   ON B.DEP_ID = C.DEP_ID  
  WHERE B.SECID <> @SECID AND B.SECID = 'S001'
 END  
END


go

--drop PROC sp_UPDATE_EMPLOYEE
IF EXISTS (SELECT * FROM DBO.SYSOBJECTS WHERE NAME='sp_UPDATE_EMPLOYEE')
BEGIN
	DROP PROC sp_UPDATE_EMPLOYEE
END
GO
CREATE PROC sp_UPDATE_EMPLOYEE
	@EmID	varchar(10),
	@Name	varchar(10),
	@SecID	varchar(10),
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

	UPDATE ACCOUNT
	SET 
		EmID = @EmID,
		Password = @Password
		
	where EmID = @EmID;

	UPDATE JOB_ROTATION
	SET
		EmID = @EmID,
		Present_Designation = @Present_Designation,
		Deputed_To = @Deputed_To,
	
		Status = @Status,
		Remarks = @Remarks

	where EmID = @EmID
	
END

go


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


go

IF EXISTS (SELECT * FROM DBO.SYSOBJECTS WHERE NAME='SP_UPDATEVACANCIESTODIVISION')
BEGIN
	DROP PROC SP_UPDATEVACANCIESTODIVISION
END
GO
CREATE PROC SP_UPDATEVACANCIESTODIVISION
	@Vacancy_ID varchar(10),
	@SecID varchar(10),
	@Designation_ID varchar(10),
	@Interpretation nvarchar(40),
	@No_Of_Vacancies int,
	@Status varchar(10),
	@Vacancy_Date datetime,
	@Creator varchar(20),	
	@Priority varchar(20)
AS
BEGIN
	UPDATE VACANCIES
	SET
	Vacancy_ID = @Vacancy_ID ,
	SecID = @SecID ,
	Designation_ID = @Designation_ID ,
	Interpretation = @Interpretation,
	No_Of_Vacancies = @No_Of_Vacancies ,
	Status = @Status ,
	Vacancy_Date = @Vacancy_Date ,
	Creator = @Creator ,	
	Priority = @Priority 
	where Vacancy_ID = @Vacancy_ID;
	UPDATE DIVISION
	SET
	Vacancy_ID = @Vacancy_ID ,
	SecID = @SecID 

END

go


IF EXISTS (SELECT * FROM DBO.SYSOBJECTS WHERE NAME='SP_VACANCIESTODIVISION')
BEGIN
	DROP PROC SP_VACANCIESTODIVISION
END
GO
CREATE PROC SP_VACANCIESTODIVISION
	@Vacancy_ID varchar(10),
	@SecID varchar(10),
	@Designation_ID varchar(10),
	@Interpretation nvarchar(40),
	@No_Of_Vacancies int,
	@Status varchar(10),
	@Vacancy_Date datetime,
	@Creator varchar(20),	
	@Priority varchar(20)
AS
BEGIN
	INSERT INTO VACANCIES
	VALUES(
	@Vacancy_ID ,
	@SecID ,
	@Designation_ID ,
	@Interpretation,
	@No_Of_Vacancies ,
	@Status ,
	@Vacancy_Date ,
	@Creator ,	
	@Priority 
	)
	INSERT INTO DIVISION
	VALUES(
	@Vacancy_ID ,
	@SecID 
	)
END

go

IF EXISTS (SELECT * FROM DBO.SYSOBJECTS WHERE NAME='sp_UPDATE_EMPLOYEETOJOBLOTATION')
BEGIN
	DROP PROC sp_UPDATE_EMPLOYEETOJOBLOTATION
END
GO
CREATE PROC sp_UPDATE_EMPLOYEETOJOBLOTATION
	
	@Present_Designation varchar(15),
	@Deputed_To varchar(10),
	
	@Status varchar(50),
	@Remarks varchar(100),
	@EmID	varchar(10),
	@Name	varchar(10),
	@SecID	varchar(10),
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
	where EmID = @EmID


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
go

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

	INSERT INTO Job_rotation (EmID, Present_Designation,Deputed_To,Status,Remarks)
	VALUES (
		@EmID,
		@Present_Designation,
		@Deputed_To,
	
		@Status,
		@Remarks
	)
	
END
go
IF EXISTS (SELECT * FROM DBO.SYSOBJECTS WHERE NAME='sp_UPDATE_EMPLOYEErato')
BEGIN
	DROP PROC sp_UPDATE_EMPLOYEErato
END
GO
CREATE PROC sp_UPDATE_EMPLOYEErato
	@EmID varchar(10),
	@Present_Designation varchar(15),
	@Deputed_To varchar(10),
	--@SecID varchar(10),
	--@Des_ID varchar(10),
	@Status varchar(50),
	@Remarks varchar(100)
AS	
BEGIN
	UPDATE JOB_ROTATION
	SET
		EmID = @EmID,
		Present_Designation = @Present_Designation,
		Deputed_To = @Deputed_To,
	
		Status = @Status,
		Remarks = @Remarks

	where EmID = @EmID;

	UPDATE  EMPLOYEE
	SET 
		EmID = @EmID,
		SecID = @Deputed_To,
		Des_ID = @Present_Designation
		
	where EmID = @EmID

	

	
	
END