# Sistema de Reservas de Quadras para Centros Esportivos

## Configuração dos arquivos properties

Este projeto utiliza **Spring Profiles** para separar configurações de ambiente e evitar o envio de dados sensíveis para o repositório.

---

## Configuração principal

O arquivo `application.properties` está incluído no repositório e contém apenas configurações que **não possuem dados sensíveis**.

Conteúdo:

```
spring.application.name=centroesportivo
spring.profiles.active=${APP_PROFILE:test}
spring.jpa.open-in-view=false

cors.origins=${CORS_ORIGINS:http://localhost:5173,http://localhost:3000}
```

O perfil ativo da aplicação pode ser alterado utilizando a variável de ambiente:

```
APP_PROFILE
```

Exemplo:

```
APP_PROFILE=test
```

---

## Configuração do profile de teste

Para facilitar a configuração do ambiente local, o projeto possui o arquivo de exemplo:

```
application-test.properties.example
```

Este arquivo contém um **exemplo de configuração do banco de dados**.

### Como configurar

1. Copie o arquivo:

```
application-test.properties.example
```

2. Renomeie para:

```
application-test.properties
```

3. Configure as credenciais do seu banco de dados local.

---

## Observação

Arquivos contendo **credenciais ou configurações específicas de ambiente** não devem ser enviados para o repositório.