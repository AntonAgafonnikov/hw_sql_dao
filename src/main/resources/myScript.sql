select product_name from Order o
    join Customer c on o.customer_id = c.id
        where lower(c.name) = :queryName