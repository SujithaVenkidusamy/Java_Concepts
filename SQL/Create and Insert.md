````sql[]

create database student;

 -- use the particular database
use student;

 -- create a table 
create table Details
(Roll_num varchar(20),
First_name varchar(20),
Last_name varchar(10),
Department varchar(30),
Phone_num int(10));

 -- display
select*from Details;

 -- insert values into tables
insert into Details(Roll_num,First_name,Last_name,Department,Phone_num)
values('22BAD007','Sharanya','T','AI DS',2343546788),
('22BAD035','Janani','S','AI DS',2343546789),
('22BAD081','Sujitha','V','AI DS',2343546768),
('22BAD095','Parkavi','S','AI DS',2347546788);
````

`````
````sql[]

![Screenshot 2025-02-06 111220](https://github.com/user-attachments/assets/e1900ddc-2ac5-4a45-b4f5-1d485d77c8ad)
![Screenshot 2025-02-06 111220](https://github.com/user-attachments/assets/f08ba362-0aa4-48e3-947b-e1c886f95f98)
