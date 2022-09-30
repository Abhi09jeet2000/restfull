insert into user_details(id, birthdate,name) values(1001, current_date(), 'S<>S');

insert into user_details(id, birthdate,name) values(1002, current_date(), 'C<>C');

insert into user_details(id, birthdate,name) values(1003, current_date(), 'P<>P');

insert into post(id, description, user_id) values(2001, 'I want to learn AWS', 1001);
insert into post(id, description, user_id) values(2002, 'I want to learn Azure', 1001);
insert into post(id, description, user_id) values(2003, 'I want to learn React', 1002);