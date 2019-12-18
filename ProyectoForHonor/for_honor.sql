CREATE TABLE IF NOT EXISTS faccion (faccion_id integer PRIMARY KEY AUTO_INCREMENT, 
                                    nombre_faccion text NOT NULL,
                                    lore text NOT NULL);
                                    
CREATE TABLE IF NOT EXISTS personaje (personaje_id integer PRIMARY KEY AUTO_INCREMENT,
                                      nombre_personaje text NOT NULL,
                                      ataque integer,
                                      defensa integer,
                                      faccion_id integer,
                                      FOREIGN KEY (faccion_id) REFERENCES faccion(faccion_id));
                                      
INSERT INTO faccion (nombre_faccion, lore) VALUES('Caballeros','Los caballeros tienen un pasado muy violento');
INSERT INTO faccion (nombre_faccion, lore) VALUES('Vikingos','Los vikingos les gusta el valhalla');
INSERT INTO faccion (nombre_faccion, lore) VALUES('Samurais','Los samurais viven en las sombras');

INSERT INTO personaje (nombre_personaje, ataque, defensa, faccion_id) VALUES('Caballero1','20','40','1');
INSERT INTO personaje (nombre_personaje, ataque, defensa, faccion_id) VALUES('Caballero2','30','50','1');
INSERT INTO personaje (nombre_personaje, ataque, defensa, faccion_id) VALUES('Vikingo1','40','30','2');
INSERT INTO personaje (nombre_personaje, ataque, defensa, faccion_id) VALUES('Vikingo2','10','70','2');
INSERT INTO personaje (nombre_personaje, ataque, defensa, faccion_id) VALUES('Samurai1','15','20','3');
INSERT INTO personaje (nombre_personaje, ataque, defensa, faccion_id) VALUES('Samurai2','35','38','3');