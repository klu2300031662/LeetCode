# Write your MySQL query statement below
with cts as(
    select buyer_id, order_date
    from Orders
    where year(order_date) = 2019
)
select u.user_id as buyer_id, u.join_date, count(o.order_date) as orders_in_2019
from users u
left join cts o
on u.user_id = o.buyer_id
group by u.user_id;