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