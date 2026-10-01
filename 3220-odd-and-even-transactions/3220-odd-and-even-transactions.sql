# Write your MySQL query statement below
select distinct(transaction_date), sum(case when amount%2 != 0 then amount else 0 end) over(partition by transaction_date) as odd_sum, sum(case when amount%2 = 0 then amount else 0 end) over(partition by transaction_date) as even_sum
from transactions
order by transaction_date;