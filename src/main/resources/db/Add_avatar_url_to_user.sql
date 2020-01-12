alter table USER drop column AVATAR_URL;

alter table USER
	add avatar_url varchar(100);

