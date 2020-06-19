CREATE TABLE T_ELEMENT
(
    GUID VARCHAR NOT NULL PRIMARY KEY
);

CREATE TABLE T_PACKAGE
(
    GUID    VARCHAR  NOT NULL PRIMARY KEY,
    NAME    VARCHAR NOT NULL,
    CREATED DATE    NOT NULL,
    CHANGED DATE    NOT NULL,
    FOREIGN KEY (GUID) REFERENCES T_ELEMENT (GUID)
);

CREATE TABLE T_CLASS
(
    GUID    VARCHAR  NOT NULL PRIMARY KEY,
    NAME    VARCHAR NOT NULL,
    CREATED DATE    NOT NULL,
    CHANGED DATE    NOT NULL,
    FOREIGN KEY (GUID) REFERENCES T_ELEMENT (GUID)
);

CREATE TABLE T_PROPERTY
(
    GUID    VARCHAR  NOT NULL PRIMARY KEY,
    NAME    VARCHAR NOT NULL,
    CREATED DATE    NOT NULL,
    CHANGED DATE    NOT NULL,
    FOREIGN KEY (GUID) REFERENCES T_ELEMENT (GUID)
);

CREATE TABLE T_ENUMERATION
(
    GUID    VARCHAR  NOT NULL PRIMARY KEY,
    NAME    VARCHAR NOT NULL,
    CREATED DATE    NOT NULL,
    CHANGED DATE    NOT NULL,
    FOREIGN KEY (GUID) REFERENCES T_ELEMENT (GUID)
);

CREATE TABLE T_ASSOCIATION
(
    ID  SERIAL PRIMARY KEY,
    GUID1   VARCHAR  NOT NULL,
    GUID2   VARCHAR  NOT NULL,
    NAME    VARCHAR NOT NULL,
    CREATED DATE    NOT NULL,
    CHANGED DATE    NOT NULL,
    FOREIGN KEY (GUID1) REFERENCES T_ELEMENT (GUID),
    FOREIGN KEY (GUID2) REFERENCES T_ELEMENT (GUID)
);

CREATE TABLE T_TEXT
(
    UID        BIGINT  NOT NULL PRIMARY KEY,
    CREATED    DATE    NOT NULL,
    CHANGED    DATE    NOT NULL,
    GUID       VARCHAR  NOT NULL,
    LANG       VARCHAR NOT NULL,
    TEXT       VARCHAR NOT NULL,
    TEXT_SHORT VARCHAR NOT NULL,
    TEXT_LONG  VARCHAR NOT NULL,
    FOREIGN KEY (GUID) REFERENCES T_ELEMENT (GUID)
);

CREATE TABLE T_TECHNAME
(
    UID     BIGINT  NOT NULL PRIMARY KEY,
    CREATED DATE    NOT NULL,
    CHANGED DATE    NOT NULL,
    GUID    VARCHAR  NOT NULL,
    NAME    VARCHAR NOT NULL,
    FOREIGN KEY (GUID) REFERENCES T_ELEMENT (GUID)
);
