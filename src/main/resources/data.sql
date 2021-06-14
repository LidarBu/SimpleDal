DROP TABLE IF EXISTS customers;

CREATE TABLE customers (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  phone VARCHAR(250) DEFAULT NULL
);

INSERT INTO customers (first_name, last_name, phone) VALUES
  ('Moshe', 'Elk', '12345'),
  ('Nati', 'Ash', '12345');