--Departments
INSERT INTO Departments values ('P10','Management','no','hcm',10,20)
INSERT INTO Departments values ('P20','Organizations','no','Tphcm',20,10)
INSERT INTO Departments values ('P30','Operating','no','HaNoi',30,20)
INSERT INTO Departments values ('P40','Project','no','HaNoi',30,20)
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
INSERT INTO Designation VALUES ('D101','L101','Employee')
INSERT INTO Designation VALUES ('D201','L201','Deputy')
INSERT INTO Designation VALUES ('D301','L301','Head')
INSERT INTO Designation VALUES ('D401','L401','Director')
--Employee
INSERT INTO Employee VALUES ('E101','Le ngoc Thanh','S101','D101','dongnai','0938430200','123456789','lethanh.aptech@gmail.com')
INSERT INTO Employee VALUES ('E201','Tran Le quoc hung','S201','D201','dongthap','090667786','12345','hung@gmail.com')
INSERT INTO Employee VALUES ('E301','Quach vinh quang','S301','D301','hcm','0909090909','56789','quang@gmail.com')
INSERT INTO Employee VALUES ('E401','Tran Cam Thanh','S401','D401','Tphcm','0988765432','34567','camthanh@gmail.com')
--Account
INSERT INTO Account VALUES ('E101','thanh')
INSERT INTO Account VALUES ('E201','hung')
INSERT INTO Account VALUES ('E301','quang')
INSERT INTO Account VALUES ('E401','cthanh')

--vacancy
INSERT INTO Vacancies VALUES ('V101','S101','D101','Hiring managers','1','1','1/1/2012','E101','Max')
INSERT INTO Vacancies VALUES ('V201','S201','D201','','2','2','2/2/2012','E201','Min')
INSERT INTO Vacancies VALUES ('V301','S301','D301','','3','3','3/3/2012','E301','Max')
INSERT INTO Vacancies VALUES ('V401','S401','D401','','4','4','4/4/2012','E401','Min')
--vacancy_fill_details
INSERT INTO Division VALUES ('V101','S101')
INSERT INTO Division VALUES ('V201','S201')
INSERT INTO Division VALUES ('V301','S301')
INSERT INTO Division VALUES ('V401','S401')
--job rotation
INSERT INTO job_rotation VALUES ('E101','Director','P10','01/01/2011','1','ok')
INSERT INTO job_rotation VALUES ('E201','Head','P20','02/01/2011','2','ok')
INSERT INTO job_rotation VALUES ('E301','Deputy','P30','03/01/2011','3','ok')
INSERT INTO job_rotation VALUES ('E401','Employee','P40','04/01/2011','4','ok')
