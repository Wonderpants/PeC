Fazer em Java um programa que leia um número inteiro entre 0 e 20 (inclusive) que
representa uma classificação na escala 0-20. De seguida o utilizador indica para a
classificação introduzida, qual a classificação qualitativa correspondente. A interface do
programa será baseada num menu de opções:
(C) Inserir classificação
(M) Mau
(I) Insuficiente
(S) Suficiente
(B) Bom
(MB) Muito Bom
(F) Fim
Só deverá ser possível executar as opções M, I, S, B e MB se a classificação numérica
tiver sido previamente inserida na opção C. Se o utilizador escolher corretamente a
classificação qualitativa de acordo com a classificação numérica, o programa apresenta a
mensagem “Classificação correta”, caso contrário apresenta a mensagem “Classificação
incorreta”.
As classificações qualitativas são consideradas da forma seguinte:
Mau – 0 a 4
Insuficiente – 5 a 9
Suficiente – 10 a 13
Bom – 14 a 17
Muito Bom – 18 a 20
O programa deverá verificar se a classificação inserida é válida, ou seja, se está no
intervalo [0, 20]. Se for inserida uma classificação inválida na opção C, o programa
deverá pedir um novo valor.
