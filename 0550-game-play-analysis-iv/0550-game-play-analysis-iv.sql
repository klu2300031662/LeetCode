# Write your MySQL query statement below
select round(count(distinct a.player_id)/count(distinct b.player_id), 2) as fraction
from (
    select player_id, MIN(event_date) as start_date
    from Activity 
    group by player_id
) b
left join Activity a
on a.player_id = b.player_id and a.event_date = date_add(b.start_date, interval 1 day)