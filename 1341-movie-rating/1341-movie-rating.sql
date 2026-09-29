# Write your MySQL query statement below

with findMonth as(
    select r.rating, m.title as movieName, r.movie_id
    from MovieRating r
    left join Movies m
    on r.movie_id = m.movie_id
    where r.created_at >= '2020-02-01' and r.created_at <= '2020-02-29'
),

findAvg as(
    select avg(rating) as avgRating, movieName
    from findMonth
    group by movie_id

),

findSum as (
    select u.name as userName, sum(1) over(partition by m.user_id) as totalMovies
    from Users u
    left join MovieRating m
    on u.user_id = m.user_id
)

(select userName as results
from findSum
order by totalMovies desc, userName asc
limit 1)

union all

(
select movieName
from findAvg
order by avgRating desc, movieName asc
limit 1)


