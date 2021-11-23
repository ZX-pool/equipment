DROP DATABASE IF EXISTS equipment_sales;
CREATE DATABASE equipment_sales CHAR SET utf8;
USE equipment_sales;

# create subtables for model______________________________
CREATE TABLE manufacturer(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(20) NOT NULL UNIQUE,
	about TEXT
);
CREATE TABLE model_type(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(20) NOT NULL UNIQUE,
	about TEXT
);
CREATE TABLE external_antenna_type(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(15) NOT NULL UNIQUE,
    about TEXT
);
CREATE TABLE supported_technologies(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(20) NOT NULL UNIQUE,
    about TEXT
);
CREATE TABLE model(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL UNIQUE,
    manufacturer_id INT NOT NULL,
    model_type_id INT NOT NULL,
    external_antenna_type_id INT NOT NULL,
    supported_technologies_id INT NOT NULL
);
ALTER TABLE model ADD FOREIGN KEY (manufacturer_id)
	REFERENCES manufacturer(id);
ALTER TABLE model ADD FOREIGN KEY (model_type_id)
	REFERENCES model_type(id);
ALTER TABLE model ADD FOREIGN KEY (external_antenna_type_id)
	REFERENCES external_antenna_type(id);
ALTER TABLE model ADD FOREIGN KEY (supported_technologies_id)
	REFERENCES supported_technologies(id);

# create subtables for equipment______________________________
CREATE TABLE supplier(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(15) NOT NULL UNIQUE,
    about TEXT
);
CREATE TABLE equipment_status(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(15) NOT NULL UNIQUE
);
 
 CREATE TABLE equipment(
 	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    sn VARCHAR(20) NOT NULL UNIQUE,
    model_id INT NOT NULL,
    supplier_id INT NOT NULL,
    arrival_date DATE NOT NULL,
    arrival_price INT NOT NULL,
    equipment_status_id INT NOT NULL,
    details TEXT
);
ALTER TABLE equipment ADD FOREIGN KEY (model_id)
	REFERENCES model(id);
ALTER TABLE equipment ADD FOREIGN KEY (supplier_id)
	REFERENCES supplier(id);
ALTER TABLE equipment ADD FOREIGN KEY (equipment_status_id)
	REFERENCES equipment_status(id);

# create subtables for customer______________________________
CREATE TABLE dealer(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(20) NOT NULL UNIQUE,
    about TEXT
);
CREATE TABLE customer(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(25),
    phone VARCHAR(15),
	address VARCHAR(20),
    dealer_id INT NOT NULL,
    details TEXT
);


ALTER TABLE customer ADD FOREIGN KEY (dealer_id)
	REFERENCES dealer(id);

#create sales_________________________________________
CREATE TABLE sales(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    sale_date DATE NOT NULL,
    sale_price INT NOT NULL,
    equipment_id INT NOT NULL,
    customer_id INT NOT NULL,
    details TEXT
);
ALTER TABLE sales ADD FOREIGN KEY (equipment_id)
	REFERENCES equipment(id);
ALTER TABLE sales ADD FOREIGN KEY (customer_id)
	REFERENCES customer(id);
    



 
    