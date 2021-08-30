## Utilizando PostgreSQL localmente através do Docker: 

- Links de instalação:

# Windows: https://desktop.docker.com/win/stable/amd64/Docker%20Desktop%20Installer.exe?utm_source=docker&utm_medium=webreferral&utm_campaign=dd-smartbutton&utm_location=header

# Linux: https://hub.docker.com/search?offering=community&operating_system=linux&q=&type=edition
 Complemento: sudo curl -L "https://github.com/docker/compose/releases/download/1.25.0/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose 

# Mac: https://hub.docker.com/editions/community/docker-ce-desktop-mac?utm_source=docker&utm_medium=webreferral&utm_campaign=dd-smartbutton&utm_location=header
--------------------------------------------------------
#1: Baixar arquivo e colocá-lo na pasta do projeto a ser executado.
Arquivo: docker-compose.yml

#2: Ajustar o caminho do volume no docker-compose

#3: Após acessar o camino do arquivo pelo terminal, executar o seguinte comando: 

- Windows: docker-compose up -c
- Linux:  sudo docker-compose up -c

#4: Para veridicar se a rede foi criada com sucesso:
- Windows: docker network ls
- Linux: sudo docker network ls

#5: Caso todas as etapas tenham sido concluídas com sucesso, basta concectar pelo gerenciador de sua preferencia. 




