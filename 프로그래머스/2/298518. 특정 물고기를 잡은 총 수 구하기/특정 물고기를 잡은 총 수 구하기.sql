-- 코드를 작성해주세요
select count(*) as FISH_COUNT
from fish_info 
where fish_type in (select fish_type from fish_name_info
                   where fish_name in ('BASS', 'SNAPPER'));