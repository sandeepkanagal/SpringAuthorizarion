insert into order_service 
(order_id, cust_address, cust_email, delivery_date, info, order_by, order_cost, order_name, order_quantity, remarks)
values(1001,'Bangalore','sandeep@gmai.com',sysdate(),'info','Sandeep',10000, 'MotoG Mobile',5,'Delivered');

insert into order_service 
(cust_address, cust_email, delivery_date, info, order_by, order_cost, order_name, order_quantity, remarks)
values('Delhi','santosh@gmai.com',sysdate(),'info','Santosh',32000, 'LG TV',2,'Delivered');

insert into order_service 
(cust_address, cust_email, delivery_date, info, order_by, order_cost, order_name, order_quantity, remarks)
values('Pune','amit@gmai.com',sysdate(),'info','Amit',65000, 'iPhone',1,'Packing');

insert into order_service 
(cust_address, cust_email, delivery_date, info, order_by, order_cost, order_name, order_quantity, remarks)
values('Bombay','rahul@gmai.com',sysdate(),'info','Rahul',35000, 'Samsung S9 Plus',1,'Procusring');

insert into order_service 
(cust_address, cust_email, delivery_date, info, order_by, order_cost, order_name, order_quantity, remarks)
values('Nasik','alex@gmai.com',sysdate(),'info','Alex',5000, 'Nokia',5,'In Progress');