-- CRUD sql

-- insert
insert into guestbook values (guestbook_seq.nextval, '둘리', '호이~', '1234', sysdate);

-- delete
delete from guestbook where no = 2 and password = '1234';

commit;

-- select
select no, name, content, password, to_char(reg_date) from guestbook order by reg_date desc;

