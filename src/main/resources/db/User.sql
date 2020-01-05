create table USER
(
    ID           INTEGER default NEXT VALUE FOR "PUBLIC"."SYSTEM_SEQUENCE_B9BDA4DA_EA82_42FB_BEC7_02EF0629E70F" auto_increment,
    ACCOUNT_ID   VARCHAR(100),
    NAME         VARCHAR(50),
    TOKEN        CHAR(36),
    GMT_CREATE   BIGINT,
    GMT_MODEFIED BIGINT,
    constraint USER_PK
        primary key (ID)
);

