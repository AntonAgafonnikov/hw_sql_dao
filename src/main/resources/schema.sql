create table CUSTOMERS (
                           id integer primary key,
                           name text,
                           surname text,
                           age integer,
                           phone_number text
);

create table ORDERS (
                        id integer primary key,
                        date date,
                        customer_id integer,
                        product_name text,
                        amount integer,
                        foreign key (customer_id) references CUSTOMERS (id)
);

insert into ORDERS (date, customer_id, product_name, amount)
values
    ("2021-03-23", 1, 'TV', 10000),
    ("2022-11-13", 2, 'PS5', 59999),
    ("2022-12-10", 3, 'Wi-Fi', 3000),
    ("2023-01-02", 4, 'Keyboard', 3299),
    ("2023-02-13", 5, 'Mouse', 2200),
    ("2023-03-01", 6, 'AUX', 300),
    ("2023-04-21", 7, 'XBOX', 49000),
    ("2023-05-15", 2, 'iPhone', 70000),
    ("2023-06-17", 4, 'USB-USB cable', 500),
    ("2023-07-29", 5, 'TV', 37800);

insert into CUSTOMERS (name, surname, age, phone_number)
values
    ('Bob', 'Lame', 34, '+19877898888'),
    ('ALexeY', 'Kronov', 22, '+71345798854'),
    ('Ivan', 'Dronov', 44, '+75654677742'),
    ('ALEXEY', 'Vane', 32, '+59999678666'),
    ('Ron', 'Jole', 48, '+71345798854'),
    ('Katar', 'Matar', 29, '+28767688868'),
    ('Denis', 'Kinov', 19, '+71345798854');