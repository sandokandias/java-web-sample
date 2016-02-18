# java-web-sample

Projeto demo java web servlet 3.1


## Pré requisitos
* Java 8 (http://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html)
* Apache Maven (http://mirror.nbtelecom.com.br/apache/maven/maven-3/3.3.9/binaries/apache-maven-3.3.9-bin.zip)
* Apache Tomcat (http://tomcat.apache.org/download-80.cgi)
* Eclipse Mars (http://www.eclipse.org/downloads/packages/eclipse-ide-java-developers/mars1)

## Build do projeto
1. Faça git clone deste repositório ou se preferir, faça o download clicando em **Download ZIP** na página principal do projeto. Descompacte em um diretório de sua preferência
2. Abra o eclipse, e importe o projeto acessando: **File -> Import -> Existing Maven Projects** - e selecione o projeto descompactado na seção anterior
3. Aguarde o maven baixar as dependências para o seu repositório local
4. Abra o arquivo **pom.xml** e altere a propriedade **deploy.path** para o caminho de instalação do seu Apache Tomcat
5. Abra o prompt de comando e entre no diretório do projeto
6. Rode o comando **mvn clean compile war:exploded** e aguarde o maven compilar e realizar o deploy do seu war explodido
7. Certifique-se que a aplicação foi copiada para a pasta **webapps** do diretório de instalação do seu Apache Tomcat 
8. Ainda no prompt de comando, entre na pasta **bin** do diretório de instalação do Apache Tomcat
9. Para windows rode o comando:  **startup.bat** / linux: **sh startup.sh**
10. Para acessar o app, abra o browser e informe a url **http://localhost:8080/java-web-sample**
11. Para parar o servidor, rode o comando **shutdown.bat** no windows / linux: **sh shutdown.sh**

