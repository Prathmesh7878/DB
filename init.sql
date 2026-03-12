CREATE DATABASE Olist;
GO

USE Olist;

CREATE TABLE Customers (
                           customer_id VARCHAR(50) PRIMARY KEY,
                           customer_city VARCHAR(100)
);

CREATE TABLE Orders (
                        order_id VARCHAR(50) PRIMARY KEY,
                        customer_id VARCHAR(50),
                        order_status VARCHAR(50),
                        FOREIGN KEY (customer_id) REFERENCES Customers(customer_id)
);