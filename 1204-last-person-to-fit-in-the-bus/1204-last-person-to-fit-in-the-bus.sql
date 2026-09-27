# Write your MySQL query statement below
with queueWithTotalWeight as (
    select *, sum(weight) over(order by turn) as total_weight
    from Queue
),

limitedQueue as(
    select *
    from queueWithTotalWeight
    where total_weight <= 1000
    order by total_weight desc
)

select person_name
from limitedQueue
limit 1;




