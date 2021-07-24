DROP TABLE CITIES IF EXISTS;
CREATE TABLE CITIES (NAP_CITY_ID VARCHAR(4),
                                         NAP_DIVIDED_CITY NUMBER(1),
                                         NAP_ZIP NUMBER(7),
                                         NAP_FONETIC VARCHAR(100),
                                         NAP_FONETIC2 VARCHAR(100) ,
                                         MT_ZIP7 NUMBER(7) ,
                                         MT_DIVISION_CODE NUMBER(9) ,
                                         MT_DIVISION_RATE NUMBER(1) ,
                                         MT_POST_CITY_ID NUMBER(6) ,
                                         MT_PRV_CITY_NAME  VARCHAR(50),
                                         MT_POST_UPD_DATE DATE,
                                         NAP_PARENT_CITY_ID VARCHAR(4) );







DROP TABLE STREETS IF EXISTS;
CREATE TABLE STREETS (NAP_CITY_ID VARCHAR(4),
                                              NAP_STREET_ID NUMBER(4),
                                              NAP_STREET_NAME VARCHAR(17),
                                              NAP_STREET_FONETIC VARCHAR(20),
                                              NAP_STREET_FONETIC2 VARCHAR(20),
                                              DOAR_STREET_ID VARCHAR(20),
                                              NAP_STREET_NICK VARCHAR(17),
                                              NAP_STREET_APPROVAL_F VARCHAR(1),
                                              MT_POST_CITY_ID NUMBER(6),
                                              MT_POST_STREET_NUM NUMBER(6),
                                              MT_PRV_STREET_NAME VARCHAR(20),
                                              MT_POST_UPD_DATE DATE,
                                              ROW_LASTMANT_DDTM DATETIME);




DELETE  FROM  STREETS WHERE  NAP_CITY_ID =  1  ;
INSERT INTO STREETS VALUES  ('1',123,'ANAVIM', 'ANAVIM','ANAVIM','A42A','ANV','a',123456,123455,'STREETS PREVIOUS',CURRENT_DATE,CURRENT_TIME);

INSERT INTO CITIES VALUES  ('1',3,2, 'ANAVIM','ANAVIM',123,445,1,1234,'CITY PREVIOUS',CURRENT_DATE,'PRNT');
SELECT * FROM CITIES;


SELECT CITIES.NAP_CITY_ID, CITIES.NAP_FONETIC, STREETS.NAP_STREET_NAME , STREETS.NAP_STREET_ID  FROM CITIES LEFT JOIN STREETS  ON  CITIES.NAP_CITY_ID = STREETS.NAP_CITY_ID;

SELECT CITIES.NAP_CITY_ID, CITIES.NAP_FONETIC, STREETS.NAP_STREET_NAME , STREETS.NAP_STREET_ID  FROM CITIES LEFT JOIN STREETS  ON  CITIES.NAP_CITY_ID = STREETS.NAP_CITY_ID  WHERE  CITIES.NAP_CITY_ID=1;



SELECT CITIES.NAP_CITY_ID, CITIES.NAP_FONETIC, STREETS.NAP_STREET_NAME , STREETS.NAP_STREET_ID
                                         FROM CITIES LEFT JOIN STREETS  ON  CITIES.NAP_CITY_ID = STREETS.NAP_CITY_ID
                                         WHERE  CITIES.NAP_CITY_ID=? AND
                                         CITIES.NAP_FONETIC = ? AND
                                         STREETS.NAP_STREET_ID=? AND
                                         NAP_STREET_ID=?;

