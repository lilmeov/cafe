create table cafe (
                       id serial NOT NULL,
                       name varchar (50) NOT NULL,
                       description varchar (50) NOT NULL,
                       image bytea,
                       rating int NOT NULL,
                       comment varchar (400) NOT NULL,
                       PRIMARY KEY (id)
);