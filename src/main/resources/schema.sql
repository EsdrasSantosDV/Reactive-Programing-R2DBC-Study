CREATE TABLE IF NOT EXISTS product
(
    id             integer NOT NULL PRIMARY KEY AUTO_INCREMENT,
    product_name      varchar(255),
    description     varchar (255),
    sku            varchar (25),
    price          decimal,
    created_date   timestamp,
    last_modified_date timestamp
    );