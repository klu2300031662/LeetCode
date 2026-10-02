# Write your MySQL query statement below
with cte as(
    select *,
            row_number() over(
                partition by student_id, subject
                order by exam_date
            )as rn_first,
            row_number() over(
                partition by student_id, subject
                order by exam_date desc
            )as rn_latest
    from Scores
),

scores as(
    select 
        student_id,
        subject,
        max(case when rn_first = 1 then score end) as first_score,
        max(case when rn_latest = 1 then score end) as latest_score
    from cte
    group by student_id, subject
)

select student_id, subject, first_score, latest_score
from scores
where first_score < latest_score
order by student_id, subject;








