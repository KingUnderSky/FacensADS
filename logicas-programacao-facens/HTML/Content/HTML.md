# HTML

> _Todo documento HTML começa com uma declaração de tipo: <!DOCTYPE html>_  _E o documento começa em si com <html>  e termina com </html>._ _A parte visível do HTML está em <body> e </body>._
>
> **Regras inicias para HTML: **
>
> - Nunca use elementos com tamanhos fixos muito largos como imagens maiores que o que o usuário pode ver no dispositivo.
> - Nunca deixe um conteúdo perder qualidade em dispositivos específicos ao mudar entre dispositivos móveis.
> - Use CSS para aplicar estilos para pequenas telas e grandes telas.

## Estrutura de uma Página HTML

**A estrutura funciona da seguinte forma:**

```html
<!DOCTYPE html>
<html>
	<head>
   	 	<title>Título da página</title>
	</head>
	<body>
        <h1>Isso é um Título</h1>
        <p>Isso é um parágrafo</p>
        <p>Isso é um outro parágrafo</p>        
	</body>
</html>
```

> **Nota: ** _doctype é utilizado para indicar ao navegador que o arquivo é um HTML. O conteúdo dentro de **body** irá aparecer no navegador. O conteúdo dentro de **title** será mostrado na tab da página e na barra de título do navegador._

## <!DOCTYPE>

> _Essa declaração ajuda o navegador a mostrar as páginas da web corretamente. Ele deve aparecer apenas uma vez, no topo da página, **antes de qualquer tag HTML**_. _Essa declaração deve ser feita em maiúsculo._

**_No HTML5, a declaração é feita da seguinte forma:_**

<DOCTYPE html>

## Elementos HTML

> _Um elemento html é definido por uma tag inicial, o conteúdo e a tag final:_

**_exemplos:_**

- Montagem -_<tagname> conteúdo </tagname>_
- h1 - <h1>Meu primeiro título</h1>
- p - <p>Meu primeiro parágrafo</p>

> _Alguns elementos HTML não tem conteúdo._ **exemplo: ** <br>_Esses elementos são chamados de elementos vazios, eles não possuem tag de fechamento._



### Principais Elementos

- **head = **nele estão as meta informações da página HTML.

- **title = **nele está o título da página, que se encontra na barra de título do navegador e na aba da página.

- **body = ** este elemento define o corpo do documento, e é um container por assim dizer para todos os conteúdos visíveis da página, como os heading, paragraphs, images, hyperlinks, tables, lists, etc.

- **section** = representa uma seção genérica de conteúdo quando não houver um elemento mais específico para isso.

- **header** = é o cabeçalho da página ou de uma seção de página e normalmente contém logotipos, menus, campos de busca.

- **article** = representa um conteúdo independente e de maior relevância dentro de uma página, como um post de blog, uma notícia em uma barra lateral ou em um bloco de comentários. Um article pode conter outros elementos como header, cabeçalhos, parágrafos e imagens.

- **aside** = é uma seção que engloba conteúdos relacionados ao conteúdo principal, como artigos relacionados, biografia do autor e publicidade. normalmente são representadas como barras laterais.

- **footer** = esse elemento representa o rodapé do conteúdo ou de parte dele, pois ele é aceito dentro de vários elementos, como article e section e até do body. Exemplos de conteúdo de um <footer> são informações de autor e links relacionados.

- **h1-h6** = eles existem antes mesmo da versão 5 do HTML e não são específicos para semântica, mas servem para especificar semântica. São utilizados para marcar a importância dos títulos, sendo **h1** o mais importante e **h6** o menos. Dica: use apenas um **h1** por página, pois ele representa o objetivo da sua página. O **h1** define um cabeçalho grande

- **Meta Tags** = Auxiliam o mecanismo de busca a encontrar o site. Mas não só isso. Elas devem estar entre as tags <head></head>, mesmo local onde fica a tag <title></title>. = exemplo meta tag <meta name="author" content="Ettore Alessandro Rollo" />

  

  ## Meta Tags

  - **http-equiv** = serve para controlar as ações do navegador, tendo mesmo efeito da tag HTTP utilizado no cabeçalho. A tag keyword pode ser utilizada aqui.

  - **name** = são usadas quando os tipos não correspondem com http. Mas alguns buscadores não checam esses tipos de tag. A tag keyword pode ser utilizada aqui.

  - **dublin core** = outro tipo de meta tags mais flexíveis.

    ### Atribuições aos Meta Tags

    - **author** = para indicar o autor da página, geralmente o dev ou a empresa dev. É utilizada com o tipo name.

    -  **cache-control** = essa tag utiliza http-equiv e é reconhecida apenas pelo http 1.1, e no seu atributo content, são permitidos os seguintes valores:

       

      _**public**: dados da página podem ser armazenados e utilizados por diferentes usuários._

      _**private**: é o contrário do public, o cache é armazenado para um usuário específico._

      _**no-cache:** A página não armazena cache._

      _**no-store: **É feito um cache temporário, a página não é arquivada._

      **Exemplo de Uso cache Control:** <meta http-equiv="cache-control" content="no-cache" />

    - **contet-language: **Indica as linguagens usadas na página. É útil para categorizar a página conforme o idioma. É usado com http-equiv:

      **Exemplo de Uso content-language:** <meta http-equiv="content-language" content="pt-br, en-US, fr" />

    - **content-type:** Essa tag é uma das mais importantes. Ela define o tipo de conteúdo da página, assim fica fácil saber se iremos abrir um HTML ou um PDF.

      **Exemplo de Uso content-type: **<meta http-equiv="content-type" content="text/html; charset=UTF-8" />

    - **copyright:** Declara os direitos autorais da página: <meta name="copyright" content="@ 2021 KingUnderSky" />

    - **description:** Contém uma descrição como o nome já diz, da página, um resumo do que se trata, para os mecanismos de busca.

    - **expires: **A data e a hora depois dos quais o documento vai ser expirado. Data 0 considera como agora, fazendo com que seja forçada uma nova checagem a cada visita do robô de busca.

    - **keywords: **são as palavras chaves da página, categoriza os conteúdos.

    - **pragma:no-cache:** esse atributo faz com que o navegador não armazene a página em cache. A diferença desse para cache control é que ele funciona em todas as versões http.

      **Exemplo de Uso pragma:no-cache: ** <meta http-equiv="pragma" content="no-cache" />

    - **refresh: **Especifica o tempo em que o browser atualize a página de forma automática, pode até redirecionar para outra url após esse tempo. <meta http-equiv="refresh" content="15;url=http://www.siteexemplo.com" />
  
    - **viewport: **É a área visível pelo usuário da página. Essa área varia de dispositivo para dispositivo, e será menor para mobile e maior para computadores. Para resolver o problema de páginas web com tamanhos fixos, essa metatag faz um scaled down na página toda. Não é perfeito mas é uma correção rápida. <meta name="viewport" contet="width=device-width, initial-scale=1.0"> _**Onde:** width=device-width define a pagina para seguir o tamanho da tela do dispositivo. initial-scale=1.0 define o zomm inicial da página quando ela for carregada pelo navegador._

  ## Tags para textos

  - **p** = utilizado para escrever parágrafos, porém é possível também adicionar imagens e vídeos neles, além de outros conteúdos.

  ## Tags para Links

  **a** = uma âncora, que interliga conteúdos na web

  href = hyperlink que a âncora aponta

  montagem normal <_a href="hyperlink"_></_a_>

  <a 

  target="_blank">

  link </a>

  ## Tags para imagem

  _img_

  _img src="img/avatar.jpg"_

  _img alt="Descrição"_

  ### Tags listas

  - **ul** = lista onde a ordem não é importante

  - **ol** = ordem é importante
  
  - **li** = item da lista

## Web Browsers

> _O propósito para existirem navegadores web (google chrome, edge, firefox, safari, opera) é para leitura de documentos HTML e mostrar eles corretamente para o usuário._

**_Um navegador não mostra as tags HTML, mas usam elas para determinar como mostrar o documento._**



