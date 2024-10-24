-- Exercici sales
select count(order_id) from orders ;

select distinct name from customer;

select * from salesman order by comision desc;

select * from customer order by customer_id asc limit 5;

select * from orders order by purch_amt asc limit 1;

select * from orders order by purch_amt desc limit 1;