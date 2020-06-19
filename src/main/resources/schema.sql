CREATE TABLE USERS(
    id bigint PRIMARY KEY,
    name varchar(30) NOT NULL,
    surname varchar(50) NOT NULL,
    age smallint NOT NULL,
    nick varchar(50) NOT NULL,
    password varchar(100) NOT NULL
    );

CREATE TABLE POSTS(
    id bigserial PRIMARY KEY,
    title varchar(200) NOT NULL,
    content varchar(2000),
    created timestamp NOT NULL,
    createdBy bigint REFERENCES USERS(id) NOT NULL
    );

CREATE TABLE COMMENTS(
    id bigserial PRIMARY KEY,
    postId bigint REFERENCES POSTS(id),
    content varchar(2000),
    created timestamp NOT NULL,
    createdBy bigint REFERENCES USERS(id) NOT NULL
    );

