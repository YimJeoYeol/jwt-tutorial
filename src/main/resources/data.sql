insert into "user" (username, password, nickname, activated) values ('admin', '123', 'admin', 1);
insert into "user" (username, password, nickname, activated) values ('user', '123', 'user', 1);

insert into authority (authority_name) values ('ROLE_USER');
insert into authority (authority_name) values ('ROLE_ADMIN');

insert into user_authority (user_id, authority_name) values (1, 'ROLE_USER');
insert into user_authority (user_id, authority_name) values (1, 'ROLE_ADMIN');
insert into user_authority (user_id, authority_name) values (2, 'ROLE_USER');
