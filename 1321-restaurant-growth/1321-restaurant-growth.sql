# Write your MySQL query statement below
with daily as(
    select visited_on,
           sum(amount) as daily_amount
    from Customer
    group by visited_on
),

windowed as(
    select visited_on,
           sum(daily_amount) over(
                order by visited_on
                rows between 6 preceding and current row
           ) as amount,
           row_number() over(
                order by visited_on
           ) as rn
    from daily
)

select visited_on,
       amount,
       round(amount/7, 2) as average_amount
from windowed
where rn >= 7
order by visited_on