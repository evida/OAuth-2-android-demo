# eVida.pt Oauth 2 mobile example

Neste repositório é possível encontrar um projecto Android que serve de biblioteca exemplo para a interacção com os módulos de autenticação e autorização da eVida, obtendo o OAuth Access Token necessário a fazer pedidos de informação protegida.

É fornecido também um projecto demonstrativo de como é possível utilizar essa biblioteca.

As instruções apresentadas aplicam-se ao `Eclipse Development Environment Indigo Service Release 2` com `ADT plugin` versão 0.9.7 ou superior.

##Requisitos

* Registar aplicação no portal [eVida.pt](evida.pt) e obter os respectivos `Consumer Key` e `Consumer Secret`.

## Instruções para a biblioteca


1. No Eclipse, criar um novo projecto a partir de código existente (`New->Project->Android->Android Project from Existing code`), utilizando a directoria "EvidaResources", e defini-lo como biblioteca, caso não esteja (http://developer.android.com/tools/projects/projects-eclipse.html#SettingUpLibraryProject);

2. Alterar as variáveis `CONSUMER_KEY` e `CONSUMER_SECRET` no *package* `resources`, ficheiro `OAuthConstants.java` para as chaves obtidas na plataforma;


## Instruções para o projecto demonstrativo


1. No Eclipse, criar um novo projecto a partir de código existente (`New->Project->Android->Android Project from Existing code`), utilizando a directoria *OAuth2Demo*;

2. Nas propriedades do projecto, assegurar que o projecto/biblioteca apresentado anteriormente está correctamente configurado como biblioteca.
