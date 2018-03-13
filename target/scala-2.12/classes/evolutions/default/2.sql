# --- Sample dataset

# --- !Ups

delete from employee;
delete from department;


insert into department (id,name) values ( 1,'HR' );

insert into department (id,name) values ( 2,'Accounting' );

insert into department (id,name) values ( 3,'Web Design' );

insert into department (id,name) values ( 4,'Managment' );

insert into department (id,name) values ( 5,'Communications' );

insert into department (id,name) values ( 6,'Advertisement' );

insert into department (id,name) values ( 7,'Recruitment' );

insert into department (id,name) values ( 8,'Software Engineering' );

insert into project (id,name) values ( 1,'Meme' );
insert into project (id,name) values ( 2,'Normie' );
insert into project (id,name) values ( 3,'Dark' );




insert into employee (id,department_id,name,description) values ( 1,5,'Kettle','Steel Electric Kettle');

insert into employee (id,department_id,name,description) values ( 2,5,'Fridge freezer','Fridge + freezer large');

insert into employee (id,department_id,name,description) values ( 3,1,'Portable Music Player','250GB music player (MP3,MP4,WMA,WAV)' );

insert into employee (id,department_id,name,description) values ( 4,3,'13inch Laptop','HP laptop,8GB RAM,250GB SSD' );

insert into employee (id,department_id,name,description) values ( 5,3,'8inch Tablet','Android 5.1 Tablet,32GB storage,8inch screen' );

insert into employee (id,department_id,name,description) values ( 6,8,'60inch TV','Sony 4K,OLED,Smart TV' );

insert into employee (id,department_id,name,description) values ( 7,6,'Washing Machine','1600rpm spin,A+++ rated,10KG' );

insert into employee (id,department_id,name,description) values ( 8,7,'Phone','Windows 10,5.2inch OLED,3GB RAM,64GB Storage' );

insert into employee (id,department_id,name,description) values ( 9,3,'10inch Tablet','Windows 10,128GB storage,8inch screen' );

insert into employee (id,department_id,name,description) values ( 10,5,'Oven','Oven + Grill,Stainless Steel' );

insert into employee (id,department_id,name,description) values ( 11,4,'Bed','Super King size,super comfort mattress' );

insert into employee (id,department_id,name,description) values ( 12,2,'Learning JavaScript','Become a JavaScript expert in 2 hours!' );

insert into project_employee (project_id,employee_id) values (1,1);
insert into project_employee (project_id,employee_id) values (2,2);
insert into project_employee (project_id,employee_id) values (3,3);
insert into project_employee (project_id,employee_id) values (2,4);
insert into project_employee (project_id,employee_id) values (2,5);
insert into project_employee (project_id,employee_id) values (2,6);
insert into project_employee (project_id,employee_id) values (3,7);
insert into project_employee (project_id,employee_id) values (1,8);
insert into project_employee (project_id,employee_id) values (1,9);
insert into project_employee (project_id,employee_id) values (3,10);
insert into project_employee (project_id,employee_id) values (3,11);
insert into project_employee (project_id,employee_id) values (3,12);
insert into project_employee (project_id,employee_id) values (3,1);
insert into project_employee (project_id,employee_id) values (2,1);
insert into project_employee (project_id,employee_id) values (3,2);