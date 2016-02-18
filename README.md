# java-web-sample

Projeto demo java web servlet 3.1


## Pré requisitos
* Java 8 (http://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html)
* Apache Maven (http://mirror.nbtelecom.com.br/apache/maven/maven-3/3.3.9/binaries/apache-maven-3.3.9-bin.zip)
* Apache Tomcat (http://tomcat.apache.org/download-80.cgi)
* Eclipse Mars (http://www.eclipse.org/downloads/packages/eclipse-ide-java-developers/mars1)

## Build do projeto
* Faça git clone deste repositório ou se preferir, faça o download clicando em **Download ZIP** na página principal do projeto. Descompacte em um diretório de sua preferência
* Abra o eclipse, e importe o projeto acessando: **File -> Import -> Existing Maven Projects** - e selecione o projeto descompactado na seção anterior
* Aguarde o maven baixar as dependências para o seu repositório local
* Abra o arquivo **pom.xml** e altere a propriedade **deploy.path** para o caminho de instalação do seu Apache Tomcat
* Abra o prompt de comando e entre no diretório do projeto
* Rode o comando **mvn clean compile war:exploded**
* Entre na pasta **bin** do diretório de instalação do Apache Tomcat*
* Para windows rode o comando:  **startup.bat** / linux: **sh startup.sh**
* Para acessar o app, abra o browser e informe a url **http://localhost:8080/java-web-sample**
* Para parar o servidor, rode o comando **shutdown.bat** no windows / linux: **sh shutdown.sh**

