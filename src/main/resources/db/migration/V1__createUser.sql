create table users (
                       id serial NOT NULL,
                       username varchar (50) NOT NULL,
                       password varchar (250) NOT NULL,
                       enabled boolean NOT NULL,
                       PRIMARY KEY (id)
);