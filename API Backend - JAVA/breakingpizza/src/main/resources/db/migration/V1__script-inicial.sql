CREATE TABLE cliente (
   id serial NOT NULL,
   nome varchar (255) NOT NULL,
   valor numeric (255) NOT NULL,
   CONSTRAINT cliente_pkey PRIMARY KEY (id)
);