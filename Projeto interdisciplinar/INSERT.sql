INSERT INTO cliente
VALUES (1, 'Mauricio Alves', '238.123.092-50','malves@gmail.com'),
(2, 'Francisco Almeida', '431.951.372-53','fran.almeida@yahoo.com'),
(3, 'Monique Toricelli', '298.369.398-96','niquet@hotmail.com'),
(4, 'Bianca Lima', '794.648.976-89','bialima689@hotmail.com');
INSERT INTO servico
VALUES (1, 'Pagamentos'),
(2, 'Emprestimos'),
(3, 'Investimentos'),
(4, 'Conta')
;

INSERT INTO cargo 
VALUES (1,'Contador','B'),
(2,'Atendente','B' ),
(3,'Gerente','A' ),
(4,'Segurança','C' );
INSERT INTO categoria
VALUES (1, 'normal'),
(2, 'prioritario'),
(3, 'emergencial');
INSERT INTO senha
VALUES (1,"PAG36", 2, 1, 'Wed Dec 14 19:11:22 BRT 2022'),
(2,"INV33", 1, 1, 'Mon Dec 05 19:44:34 BRT 2022'),
(3,"CONT44", 2, 2, 'Dec 05 19:21:25 BRT 2022');
INSERT INTO funcionario
VALUES (1, 'Paulo Silva', '290.093.880-50','paulinho@gmail.com',1),
(2, 'Maria Juliana', '061.571.428-55','mariS24@gmail.com',1),
(3, 'Manuela Aldeia Mantas', '245.393.698-06','manu_Mantas@hotmail.com',2),
(4, 'Bárbara Teixeira Abasto', '534.687.398-85','teixeira_abasto44@gmail.com',3);

INSERT INTO guiche
VALUES (1, 'fgf' , 1 , 1, 2),
(2, 'fgf' , 1 , 1, 2),
(3, 'fgf' , 1 , 1, 2);

INSERT INTO avaliacao
VALUES (1, 5, null,1),
(2, 3, null,3),
(3, 4, null,3),
(4, 5, null,2);

INSERT INTO atendimento
VALUES (1,"a", '12:00:00' , '12:30:00' , '2022/09/10', 2, 1,1,2,3,1),
(2,"b", '10:00:00' , '11:30:00' , '2022/09/05', 1, 1,1,2,3,1),
(3,"c", '14:00:00' , '14:30:00' , '2022/09/23', 2, 2,1,2,3,1);




select * from ATENDIMENTO;
select * from AVALIACAO;
select * from servico;
select * from categoria;


select* from guiche;
select * from senha;
select * from CARGO;
select * from historicoatendimento;
select * from SENHA;
select * from funcionario;
select * from CLIENTE;



