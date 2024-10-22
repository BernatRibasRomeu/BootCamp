INSERT INTO `mydb`.`country` (`country_id`, `country`, `last_update`) VALUES
(1, 'Argentina', NOW()),
(2, 'Brazil', NOW()),
(3, 'Canada', NOW()),
(4, 'China', NOW()),
(5, 'France', NOW()),
(6, 'Germany', NOW()),
(7, 'India', NOW()),
(8, 'Italy', NOW()),
(9, 'Japan', NOW()),
(10, 'Mexico', NOW()),
(11, 'Nigeria', NOW()),
(12, 'Russia', NOW()),
(13, 'South Africa', NOW()),
(14, 'South Korea', NOW()),
(15, 'Spain', NOW()),
(16, 'Sweden', NOW()),
(17, 'United Kingdom', NOW()),
(18, 'United States', NOW()),
(19, 'Australia', NOW()),
(20, 'New Zealand', NOW());
INSERT INTO `mydb`.`city` (`city_id`, `city`, `country_id`, `last_update`) VALUES
(1, 'Buenos Aires', 1, NOW()),
(2, 'São Paulo', 2, NOW()),
(3, 'Toronto', 3, NOW()),
(4, 'Beijing', 4, NOW()),
(5, 'Paris', 5, NOW()),
(6, 'Berlin', 6, NOW()),
(7, 'Mumbai', 7, NOW()),
(8, 'Rome', 8, NOW()),
(9, 'Tokyo', 9, NOW()),
(10, 'Mexico City', 10, NOW()),
(11, 'Lagos', 11, NOW()),
(12, 'Moscow', 12, NOW()),
(13, 'Cape Town', 13, NOW()),
(14, 'Seoul', 14, NOW()),
(15, 'Madrid', 15, NOW()),
(16, 'Stockholm', 16, NOW()),
(17, 'London', 17, NOW()),
(18, 'New York', 18, NOW()),
(19, 'Sydney', 19, NOW()),
(20, 'Auckland', 20, NOW());
INSERT INTO `mydb`.`address` (`address_id`, `address`, `address2`, `district`, `city_id`, `postal_code`, `phone`, `location`, `last_update`) VALUES
(1, '123 Street A', 'Apt 1', 'District 1', 1, '1000', '123-4567', 'Location 1', NOW()),
(2, '456 Street B', 'Apt 2', 'District 2', 2, '2000', '234-5678', 'Location 2', NOW()),
(3, '789 Street C', 'Apt 3', 'District 3', 3, '3000', '345-6789', 'Location 3', NOW()),
(4, '101 Street D', 'Apt 4', 'District 4', 4, '4000', '456-7890', 'Location 4', NOW()),
(5, '102 Street E', 'Apt 5', 'District 5', 5, '5000', '567-8901', 'Location 5', NOW()),
(6, '103 Street F', 'Apt 6', 'District 6', 6, '6000', '678-9012', 'Location 6', NOW()),
(7, '104 Street G', 'Apt 7', 'District 7', 7, '7000', '789-0123', 'Location 7', NOW()),
(8, '105 Street H', 'Apt 8', 'District 8', 8, '8000', '890-1234', 'Location 8', NOW()),
(9, '106 Street I', 'Apt 9', 'District 9', 9, '9000', '901-2345', 'Location 9', NOW()),
(10, '107 Street J', 'Apt 10', 'District 10', 10, '10000', '012-3456', 'Location 10', NOW()),
(11, '108 Street K', 'Apt 11', 'District 11', 11, '11000', '123-4567', 'Location 11', NOW()),
(12, '109 Street L', 'Apt 12', 'District 12', 12, '12000', '234-5678', 'Location 12', NOW()),
(13, '110 Street M', 'Apt 13', 'District 13', 13, '13000', '345-6789', 'Location 13', NOW()),
(14, '111 Street N', 'Apt 14', 'District 14', 14, '14000', '456-7890', 'Location 14', NOW()),
(15, '112 Street O', 'Apt 15', 'District 15', 15, '15000', '567-8901', 'Location 15', NOW()),
(16, '113 Street P', 'Apt 16', 'District 16', 16, '16000', '678-9012', 'Location 16', NOW()),
(17, '114 Street Q', 'Apt 17', 'District 17', 17, '17000', '789-0123', 'Location 17', NOW()),
(18, '115 Street R', 'Apt 18', 'District 18', 18, '18000', '890-1234', 'Location 18', NOW()),
(19, '116 Street S', 'Apt 19', 'District 19', 19, '19000', '901-2345', 'Location 19', NOW()),
(20, '117 Street T', 'Apt 20', 'District 20', 20, '20000', '012-3456', 'Location 20', NOW());
