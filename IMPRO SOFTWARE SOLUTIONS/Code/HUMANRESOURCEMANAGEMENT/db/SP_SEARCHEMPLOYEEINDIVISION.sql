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
     INNER JOIN DEPARTMENTS  AS C  
   ON B.DEP_ID = C.DEP_ID  
  WHERE B.SECID<>@SECID
 END  
END

	