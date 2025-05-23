-- 9b. Read all the existing records from the table coffee which is from the database test and query
-- coffee name starting with ‘D’ in the table using HTML and JSP to get the field and display the
-- results respectively


-- Create the coffee table
CREATE TABLE coffee (
    id INT PRIMARY KEY,
    coffee_name VARCHAR(50),
    price DECIMAL(5,2)
);
