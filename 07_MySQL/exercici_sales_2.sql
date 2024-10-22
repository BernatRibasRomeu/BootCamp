INSERT INTO `sales`.`salesman` (`salesman_id`, `name`, `city`, `comision`) VALUES
(10001, 'John Doe', 'New York', 0.15),
(10002, 'Jane Smith', 'Los Angeles', 0.12),
(10003, 'Michael Brown', 'Chicago', 0.10),
(10004, 'Emily Davis', 'Houston', 0.09),
(10005, 'David Wilson', 'Phoenix', 0.08),
(10006, 'Sarah Johnson', 'Philadelphia', 0.11),
(10007, 'James Lee', 'San Antonio', 0.13),
(10008, 'Laura King', 'San Diego', 0.14),
(10009, 'Robert Lewis', 'Dallas', 0.07),
(10010, 'Linda Clark', 'San Jose', 0.16);

INSERT INTO `sales`.`customer` (`customer_id`, `name`, `city`, `grade`) VALUES
(20001, 'Alice Walker', 'New York', 85),
(20002, 'Bob Harris', 'Los Angeles', 90),
(20003, 'Charlie Evans', 'Chicago', 88),
(20004, 'Diana Martin', 'Houston', 92),
(20005, 'Edward Green', 'Phoenix', 75),
(20006, 'Fiona White', 'Philadelphia', 80),
(20007, 'George Adams', 'San Antonio', 78),
(20008, 'Hannah Thompson', 'San Diego', 86),
(20009, 'Irene Scott', 'Dallas', 84),
(20010, 'Jack Turner', 'San Jose', 91);

INSERT INTO `sales`.`orders` (`order_id`, `purch_amt`, `order_date`, `customer_id`, `salesman_id`, `customer_customer_id`, `salesman_salesman_id`) VALUES
(30001, 1500.00, '2024-10-01', 20001, 10001, 20001, 10001),
(30002, 2000.00, '2024-10-05', 20002, 10002, 20002, 10002),
(30003, 1750.00, '2024-10-08', 20003, 10003, 20003, 10003),
(30004, 2200.00, '2024-10-10', 20004, 10004, 20004, 10004),
(30005, 1800.00, '2024-10-12', 20005, 10005, 20005, 10005),
(30006, 1600.00, '2024-10-15', 20006, 10006, 20006, 10006),
(30007, 2500.00, '2024-10-18', 20007, 10007, 20007, 10007),
(30008, 3000.00, '2024-10-20', 20008, 10008, 20008, 10008),
(30009, 1900.00, '2024-10-22', 20009, 10009, 20009, 10009),
(30010, 2300.00, '2024-10-23', 20010, 10010, 20010, 10010);
