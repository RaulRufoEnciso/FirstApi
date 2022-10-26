INSERT INTO ALUMNOS (ID, DNI, EMAIL, GRUPO, NAME, SINCE, SURNAME) VALUES (001, '12345678N', 'rrufo@firsapi.net', 'DAW 2', 'Raul', '2003-09-28', 'Rufo' );
INSERT INTO ALUMNOS (ID, DNI, EMAIL, GRUPO, NAME, SINCE, SURNAME) VALUES (002, '12345678T', 'emiranda@firsapi.net', 'DAM 2', 'Javier', '2001-06-18', 'Miranda' );
INSERT INTO ALUMNOS (ID, DNI, EMAIL, GRUPO, NAME, SINCE, SURNAME) VALUES (003, '12345678S', 'gjimenez@firsapi.net', 'ASIX 2', 'Guillem', '1998-07-01', 'Jimenez' );

INSERT INTO FP (ID, EMAIL, NAME, SURNAME) VALUES (004, 'rrufo@firsapi.net', 'Raul', 'Rufo' );
INSERT INTO FP (ID, EMAIL, NAME, SURNAME) VALUES (005, 'emiranda@firsapi.net', 'Javier', 'Miranda' );
INSERT INTO FP (ID, EMAIL, NAME, SURNAME) VALUES (006, 'gjimenez@firsapi.net', 'Guillem', 'Jimenez' );

INSERT INTO HORARIOS (ID, FP, H_ENTRADA, H_SALIDA) VALUES (007, 'DAW', '9', '21');
INSERT INTO HORARIOS (ID, FP, H_ENTRADA, H_SALIDA) VALUES (008, 'DAM', '9', '21');
INSERT INTO HORARIOS (ID, FP, H_ENTRADA, H_SALIDA) VALUES (009, 'ASIX', '9', '21');

INSERT INTO CURSOS (ID, ANO, AULA, CFGS, CURS, GRUPO) VALUES (0010,  'DAW', 'DAW2', 1, '21', 'diurno');
INSERT INTO CURSOS (ID, ANO, AULA, CFGS, CURS, GRUPO) VALUES (0011,  'DAM', 'DAM2', 2, '23', 'diurno');
INSERT INTO CURSOS (ID, ANO, AULA, CFGS, CURS, GRUPO) VALUES (0012,  'ASIX', 'ASIX2', 1, '22', 'diurno');

INSERT INTO UFS (ID, MODULO, TIEMPO, ALUMNOS_REG) VALUES (0013, 'M07', 155, 19 );
INSERT INTO UFS (ID, MODULO, TIEMPO, ALUMNOS_REG) VALUES (0014, 'M07', 145, 18 );
INSERT INTO UFS (ID, MODULO, TIEMPO, ALUMNOS_REG) VALUES (0015, 'M07', 135, 17 );