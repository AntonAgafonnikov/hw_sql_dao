create table netology.CUSTOMERS (
                           id integer generated by default as identity primary key,
                           name text,
                           surname text,
                           age integer,
                           phone_number text
);