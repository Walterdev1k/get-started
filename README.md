# get-started

Comandos Utilizados

Aqui está a explicação resumida de cada comando para integrar diretórios locais com remoto no GitHub.

echo "# DiferencaIdade" >> README.md → Cria um arquivo README.md com o texto # DiferencaIdade (um título em Markdown).

git init → Inicializa um repositório Git na pasta atual (cria a estrutura oculta .git/).

git add README.md → Adiciona o arquivo README.md ao Staging Area (preparação para o commit).

git commit -m "first commit" → Cria um commit com as alterações adicionadas, usando a mensagem "first commit".

git branch -M main → Renomeia a branch padrão (geralmente master) para main (convenção moderna).

git remote add origin https://github.com/User/Diretório(repositório).git → Vincula o repositório local a um repositório remoto (GitHub) chamado origin.

git push -u origin main → Envia (push) os commits locais para o repositório remoto (origin), na branch main. → O -u define origin/main como upstream (rastreamento automático).

Resumo Geral: Esses comandos criam um novo projeto Git, adicionam um README.md, fazem o primeiro commit e o enviam para um repositório remoto no GitHub.


*****************************************************************************************************************************


walter-domiciano:~/development/Exercicios$ cd get-started
walter-domiciano:~/development/Exercicios/get-started(git:master)$ git branch -M main
walter-domiciano:~/development/Exercicios/get-started(git:main)$ echo "# get-started" >> README.md
walter-domiciano:~/development/Exercicios/get-started(git:main)$ git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/Walterdev1k/get-started.git
git push -u origin main
Reinitialized existing Git repository in /home/walter-domiciano/development/Exercicios/get-started/.git/
[main (root-commit) d2d5721] first commit
 3 files changed, 9 insertions(+)
 create mode 100644 README.md
 create mode 100644 src/main/java/AnotherClass.java
 create mode 100644 src/main/java/Java21.java
Enumerating objects: 8, done.
Counting objects: 100% (8/8), done.
Delta compression using up to 4 threads
Compressing objects: 100% (4/4), done.
Writing objects: 100% (8/8), 531 bytes | 531.00 KiB/s, done.
Total 8 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
To https://github.com/Walterdev1k/get-started.git
 * [new branch]      main -> main
branch 'main' set up to track 'origin/main'.
walter-domiciano:~/development/Exercicios/get-started(git:main)$ ls
get-started.iml  out  README.md  src

