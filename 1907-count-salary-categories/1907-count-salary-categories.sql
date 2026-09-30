# Write your MySQL query statement below
with lowSalary as(
    select sum(1) as salary
    from Accounts
    where income < 20000
),

avgSalary as(
    select sum(1) as salary
    from Accounts
    where income >= 20000 && income <= 50000
),

highSalary as(
    select sum(1) as salary
    from Accounts
    where income > 50000
)



select 'Low Salary' as category, coalesce(salary, 0) as accounts_count
from lowSalary

union all

select 'Average Salary', coalesce(salary, 0) 
from avgSalary

union all

select 'High Salary', coalesce(salary, 0)
from highSalary