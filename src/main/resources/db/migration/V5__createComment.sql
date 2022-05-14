CREATE TABLE comment(
                         id serial NOT NULL ,
                         comment varchar (300) NOT NULL,
                         cafe_id INT references cafe(id),
                         user_id INT references users(id),
                         PRIMARY KEY (id)
);