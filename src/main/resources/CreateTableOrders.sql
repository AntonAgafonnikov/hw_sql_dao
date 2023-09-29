create table ORDERS (
                        id integer generated by default as identity primary key,
                        date date,
                        customer_id integer,
                        product_name text,
                        amount integer,
                        constraint fk_customer
                            foreign key (customer_id)
                                references CUSTOMERS (id));