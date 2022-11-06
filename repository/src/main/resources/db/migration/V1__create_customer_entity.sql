CREATE TABLE customer_entity
(
    customer_id   SERIAL NOT NULL,
    customer_name VARCHAR(255),
    CONSTRAINT pk_customerentity PRIMARY KEY (customer_id)
);