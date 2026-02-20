## Configuração inicial para uso do Git
Para que o Git registre quem é o autor de cada alteração no histórico do projeto, é obrigatório configurar um nome de usuário e um endereço de e-mail. Sem essas informações, o Git impedirá a realização de commits, pois cada "ponto de salvamento" no histórico precisa estar vinculado a uma identidade para fins de rastreabilidade e colaboração.

### Configuração de nome de usuário e e-mail no Git
Utilize os comandos abaixo no seu terminal para definir suas credenciais globalmente:

```bash
# Define o nome que aparecerá nos seus commits
git config --global user.name "Seu Nome"
# Define o e-mail vinculado à sua conta do GitHub
git config --global user.email "seu-email@exemplo.com"
```

### Criando Personal Access Token (PAT) no GitHub
O Personal Access Token (PAT) é uma alternativa segura ao uso de senhas tradicionais para autenticação no GitHub via linha de comando ou API. Com fim de aumentar a segurança e permitir um controle mais refinado sobre quais permissões cada aplicação possui.

Passo a passo para criar um PAT:

1. No GitHub, clique na sua foto de perfil no canto superior direito e selecione *Settings* .

1. No menu lateral esquerdo, role até o fim e clique em *Developer settings*.

1. Selecione *Personal access tokens* e, em seguida, *Tokens (classic)*.

1. Clique no botão *Generate new token* (escolha a opção *Generate new token (classic)*).

1. Dê um nome ao *token* no campo *Note* (ex: "Acesso Notebook").

1. Defina a expiração e selecione os escopos (permissões) necessários (geralmente a opção repo é a principal).

1. Clique em *Generate token* no final da página.

1. **Importante:** Copie o *token* gerado imediatamente. Você não poderá vê-lo novamente após fechar a página.

### Salvar em cache as credenciais do PAT

Digitar o PAT toda vez que você fizer um git push ou git pull é um processo repetitivo e moroso. Para otimizar o fluxo de trabalho, podemos configurar o Git para armazenar essas credenciais temporariamente na memória (cache), evitando a necessidade de reautenticação constante durante uma sessão de trabalho.

Para salvar suas credenciais em cache por 1 hora (3600 segundos), utilize o seguinte comando:

```bash
git config --global credential.helper 'cache --timeout=3600'
```

## Qual a diferença entre git merge e git rebase?
Ambos os comandos servem para integrar mudanças de uma branch para outra, mas eles o fazem de maneiras distintas:

- Git Merge: Cria um novo "commit de mesclagem" (merge commit) que une as histórias das duas branches. Ele preserva o histórico original e a cronologia exata de quando as branches se separaram e se uniram.

- Git Rebase: "Reescreve" o histórico ao mover os commits da sua branch atual para o topo da branch de destino. Isso resulta em uma linha do tempo linear e limpa, sem commits de merge extras.