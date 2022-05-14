CREATE TABLE rate (
                        id serial NOT NULL ,
                        rate INT  NOT NULL,
                        cafe_id INT references cafe(id),
                        user_id INT references users(id),
                        PRIMARY KEY (id)
);