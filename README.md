# Lojas Rede | Sistema de Login e Cadastro de Usuário 🔐

Um aplicativo simples feito em Kotlin no Android Studio para gerenciar o **login** e **cadastro** de usuários. Ele demonstra como o usuário pode informar **nome**, **e-mail** e **senha**, e como esses dados são persistidos localmente usando a **Room Persistence Library**. Ideal para iniciantes em Android que desejam praticar conceitos de interface, fluxo de telas e armazenamento local de dados.

## 🚀 Como Executar

1.  Abra o projeto no **Android Studio**.
2.  Aguarde o **Gradle sincronizar**.
3.  Execute em um **emulador** ou **dispositivo real**.

## ▶️ Executando o App

-   Ao iniciar, a tela principal será a de **Login**.
-   Para **cadastrar um novo usuário**:
    -   Pressione o botão "**Cadastrar-se**".
    -   Preencha os campos: **Nome Completo**, **Email** e **Senha**.
    -   Pressione o botão "**Cadastrar**".
    -   Você será redirecionado para a tela de Login com uma mensagem de sucesso (ou aviso, se o e-mail já existir).
-   Para **fazer login**:
    -   Na tela de Login, preencha "Login (e-mail ou usuário)" e "Senha" com uma conta cadastrada.
    -   Pressione o botão "**Logar**".
    -   Após um login bem-sucedido, você será levado a uma tela de boas-vindas que exibirá o nome do usuário.
-   Na tela de boas-vindas, você pode usar o botão "**Voltar para o Login**" para retornar à tela inicial.

## 📁 Estrutura do Projeto

LojasRedeKotlin/ \
├── app/ \
│   └── src/ \
│       └── main/ \
│           ├── java/br/dominio/lojasrede12302120/ \
│           │   ├── MainActivity.kt               \
│           │   ├── CadastroActivity.kt           \
│           │   ├── HomeActivity.kt               \
│           │   ├── model/ \
│           │   │   └── Usuario.kt                \
│           │   └── repository/ \
│           │       ├── AppDataBase.kt            \
│           │       └── dao/ \
│           │           └── UsuarioDAO.kt         \
│           ├── res/ \
│           │   ├── layout/activity_main.xml     \
│           │   ├── layout/activity_cadastro.xml   \
│           │   ├── layout/activity_home.xml      \
│           │   └── values/ \
│           │       ├── colors.xml             
│           │       └── themes.xml                \
│           └── AndroidManifest.xml               \
├── build.gradle.kts (Project) \
├── app/build.gradle.kts (Module: app)          
└── README.md                                   

## ✨ Melhorias Futuras

-   Validação de campos mais robusta (formato de e-mail, força da senha, etc).
-   Utilização de ViewModels e LiveData para um padrão arquitetural mais avançado.
-   Integração com serviços de autenticação (ex: Firebase Authentication).
-   Recuperação de senha.
-   Interface mais rica com elementos de Material Design avançados.

## 👤 Autor

Feito com ❤️ por [odiasdev](https://github.com/odiasdev)
