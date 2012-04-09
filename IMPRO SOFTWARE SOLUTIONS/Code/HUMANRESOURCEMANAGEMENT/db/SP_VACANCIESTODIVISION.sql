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
