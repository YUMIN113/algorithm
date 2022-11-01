-- 팔로워 수

select COUNT(ID) as COUNT
from jang_follow
where OTHID=#{value};

-- 예시)
select COUNT(ID) as COUNT
from jang_follow
where OTHID='user5';