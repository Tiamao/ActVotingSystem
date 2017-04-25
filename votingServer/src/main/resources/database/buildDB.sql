CREATE DATABASE voting

USE voting;

CREATE TABLE user (
userID int NOT NULL AUTO_INCREMENT,
fname varchar(20) NOT NULL,
lname varchar(20) NOT NULL,
pesel varchar(11) NOT NULL,
password varchar(20) NOT NULL,
PRIMARY KEY (userID)
);

CREATE TABLE sphere(
sphereID int NOT NULL PRIMARY KEY AUTO_INCREMENT,
name varchar(50),
description varchar (255)
);

CREATE TABLE act (
actID int NOT NULL PRIMARY KEY AUTO_INCREMENT,
name varchar(50) NOT NULL,
description varchar(255),
sphereID int NOT NULL,
FOREIGN KEY (sphereID) REFERENCES sphere(sphereID)
);

CREATE TABLE proxy(
proxyID int NOT NULL PRIMARY KEY AUTO_INCREMENT,
ownUserID int NOT NULL,
sphereID int NOT NULL,
FOREIGN KEY (sphereID) REFERENCES sphere(sphereID),
FOREIGN KEY (ownUserID) REFERENCES user(userID)
);

CREATE TABLE userSphereProxy(
uspID int NOT NULL PRIMARY KEY AUTO_INCREMENT,
userID int NOT NULL,
sphereID int NOT NULL,
proxyID int NOT NULL,
FOREIGN KEY (sphereID) REFERENCES sphere(sphereID),
FOREIGN KEY (userID) REFERENCES user(userID),
FOREIGN KEY (proxyID) REFERENCES proxy(proxyID)
);

CREATE TABLE vote(
voteID int NOT NULL PRIMARY KEY AUTO_INCREMENT,
actID int NOT NULL,
deadline date,
vote boolean,
userID int NOT NULL,
isProxy boolean,
FOREIGN KEY (actID) REFERENCES act(actID),
FOREIGN KEY (userID) REFERENCES user(userID)
);






