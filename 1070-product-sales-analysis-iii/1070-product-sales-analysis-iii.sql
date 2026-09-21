# Write your MySQL query statement below
-- select product_id, year as first_year, quantity, price
-- from Sales
-- group by product_id
-- having (year, product_id) in (
--     select min(year), product_id
--     from Sales
--     group by product_id
-- )


select product_id, first_year, quantity , price from(
select product_id, year as first_year, quantity, price, dense_rank() over (partition by product_id order by year) as rnk
from Sales ) t where rnk = 1