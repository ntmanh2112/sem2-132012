--Departments
INSERT INTO Departments values ('P10','Quan ly','no','hcm',10,20)
INSERT INTO Departments values ('P20','To chuc','no','Tphcm',20,10)
INSERT INTO Departments values ('P30','Dieu hanh','no','HaNoi',30,20)
INSERT INTO Departments values ('P40','Nghien cuu','no','HaNoi',30,20)
--Section
INSERT INTO Section VALUES ('S101','Java','XY1 100','P10')
INSERT INTO Section VALUES ('S201','Website','XY2 200','P20')
INSERT INTO Section VALUES ('S301','C#','XY3 300','P30')
INSERT INTO Section VALUES ('S401','PHP','XY4 400','P40')
--desigLayer
INSERT INTO DesigLayer VALUES ('L101',1,500)
INSERT INTO DesigLayer VALUES ('L201',2,400)
INSERT INTO DesigLayer VALUES ('L301',3,300)
INSERT INTO DesigLayer VALUES ('L401',4,200)
--designation
INSERT INTO Designation VALUES ('D101','L101','Giam Doc')
INSERT INTO Designation VALUES ('D201','L201','Truong phong')
INSERT INTO Designation VALUES ('D301','L301','Pho phong')
INSERT INTO Designation VALUES ('D401','L401','Nhan vien')
--Employee
INSERT INTO Employee VALUES ('E101','Thanh','P10','D101','dongnai','0938430200','123456789','lethanh.aptech@gmail.com')
INSERT INTO Employee VALUES ('E201','hung','P20','D201','dongthap','090667786','12345','hung@gmail.com')
INSERT INTO Employee VALUES ('E301','quang','P30','D301','hcm','0909090909','56789','quang@gmail.com')
INSERT INTO Employee VALUES ('E401','C.Thanh','P40','D401','Tphcm','0988765432','34567','camthanh@gmail.com')
--Account
INSERT INTO Account VALUES ('E101','thanh')
INSERT INTO Account VALUES ('E201','hung')
INSERT INTO Account VALUES ('E301','quang')
INSERT INTO Account VALUES ('E401','cthanh')


--funtion
INSERT INTO Functions VALUES ('F101','Dieu Hanh')
INSERT INTO Functions VALUES ('F201','Quan ly')
INSERT INTO Functions VALUES ('F301','Giam sat')
INSERT INTO Functions VALUES ('F401','code')



--Assignment
INSERT INTO Assignment VALUES ('D101','F101')
INSERT INTO Assignment VALUES ('D201','F201')
INSERT INTO Assignment VALUES ('D301','F301')
INSERT INTO Assignment VALUES ('D401','F401')

--vacancy
INSERT INTO Vacancies VALUES ('V101','S101','D101','1','1','1/1/2012','E101','Max')
INSERT INTO Vacancies VALUES ('V201','S201','D201','2','2','2/2/2012','E201','Min')
INSERT INTO Vacancies VALUES ('V301','S301','D301','3','3','3/3/2012','E301','Max')
INSERT INTO Vacancies VALUES ('V401','S401','D401','4','4','4/4/2012','E401','Min')
--vacancy_fill_details
INSERT INTO Division VALUES ('V101','E101','S101')
INSERT INTO Division VALUES ('V201','E201','S201')
INSERT INTO Division VALUES ('V301','E301','S301')
INSERT INTO Division VALUES ('V401','E401','S401')
--job rotation
INSERT INTO job_rotation VALUES ('E101','Giam doc','P10','01/01/2011','','1','ok')
INSERT INTO job_rotation VALUES ('E201','truong phong','P20','02/01/2011','','2','ok')
INSERT INTO job_rotation VALUES ('E301','Pho phong','P30','03/01/2011','','3','ok')
INSERT INTO job_rotation VALUES ('E401','Nhan vien','P40','04/01/2011','','4','ok')
--history
INSERT INTO History VALUES ('E101','10/1/2011','good')