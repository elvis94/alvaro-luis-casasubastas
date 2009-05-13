create table "DAD".CLIENTES
(
	USUARIO VARCHAR(20) not null primary key,
	CLAVE VARCHAR(20) not null,
	EMAIL VARCHAR(100) not null unique,
	NOMBRE VARCHAR(100) not null,
	APELLIDOS VARCHAR(100),
	DIRECCION VARCHAR(150) not null,
	CIUDAD VARCHAR(25) not null,
	PAIS VARCHAR(25) not null
)

create table "DAD".SUBASTAS
(
	ID INTEGER generated always as identity not null primary key,
	SUBASTADOR VARCHAR(20) not null references CLIENTES(USUARIO) on delete cascade,
	NOMBRE VARCHAR(100) not null unique,
	DESCRIPCION VARCHAR(500),
	CATEGORIA VARCHAR(20) default 'ninguna' not null,
	PRECIO_SALIDA DOUBLE not null,
	PUJA_ACTUAL DOUBLE,
	PRECIO_COMPRA DOUBLE not null,
	FECHA_SALIDA TIMESTAMP not null,
	FECHA_CIERRE TIMESTAMP not null,
	FECHA_PUJA_ACTUAL TIMESTAMP,
	PUJADOR_ACTUAL VARCHAR(20) references CLIENTES(USUARIO) on delete cascade
)

INSERT INTO SUBASTAS
	 (NOMBRE,SUBASTADOR,DESCRIPCION,CATEGORIA,PRECIO_SALIDA,PUJA_ACTUAL,PRECIO_COMPRA,FECHA_SALIDA,FECHA_CIERRE,FECHA_PUJA_ACTUAL,PUJADOR_ACTUAL)
VALUES
	('Abrelatas','pepe','Un abrelatas corriente y moliente','utensilios',2,0,12,CURRENT_TIMESTAMP,'2009-05-15 00:00:00','2009-03-20 00:00:00','pepe')

-- Consultar las subastas abiertas (FECHA_CIERRE después de AHORA)
SELECT * FROM DAD.SUBASTAS WHERE fecha_cierre > CURRENT_TIMESTAMP

-- Ejemplo
--INSERT INTO SUBASTAS
--	 (NOMBRE,SUBASTADOR,DESCRIPCION,CATEGORIA,PRECIO_SALIDA,PUJA_ACTUAL,PRECIO_COMPRA,FECHA_SALIDA,FECHA_CIERRE,FECHA_PUJA_ACTUAL,PUJADOR_ACTUAL)
--VALUES
--	('Abrelatas','pepe','Un abrelatas corriente y moliente','utensilios',2,0,12,'2009-03-11','2009-05-15','2009-03-20','pepe')


--create table "DAD".ARTICULOS
--(
--	ID INTEGER generated always as identity not null primary key,
--	NOMBRE VARCHAR(100) not null,
--	DESCRIPCION VARCHAR(500),
--	CATEGORIA VARCHAR(20) default 'ninguna' not null
--)

--create table "DAD".SUBASTAS
--(
--	SUBASTADOR VARCHAR(20) not null references CLIENTES(USUARIO),
--	ID_ARTICULO INTEGER not null references ARTICULOS(ID),
--	PRECIO_SALIDA REAL,
--	PUJA_ACTUAL REAL,
--	PRECIO_COMPRA REAL,
--	FECHA_SALIDA DATE,
--	FECHA_CIERRE DATE,
--	FECHA_PUJA_ACTUAL DATE,
--	PUJADOR_ACTUAL VARCHAR(20) references CLIENTES(USUARIO),
--	primary key(SUBASTADOR,ID_ARTICULO)
--)
