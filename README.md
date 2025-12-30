# Estudo de ActionBar e Temas com Material 3

Este projeto é um estudo prático e evolutivo sobre como implementar e personalizar a `TopAppBar` (a evolução da `ActionBar`) e os temas de um aplicativo Android, utilizando os componentes do Material Design 3.

O código foi desenvolvido como uma adaptação e modernização dos conceitos apresentados no livro de desenvolvimento Android de Ricardo R. Lacheta, atualizando as práticas para as bibliotecas e estilos mais recentes.

## ✨ Funcionalidades e Conceitos Aprendidos

Este projeto cobre desde a criação básica de uma `TopAppBar` até a personalização avançada de cores e temas.

### 1. Estrutura Básica da TopAppBar
- **Tema "NoActionBar"**: O projeto utiliza um tema que herda de `Theme.Material3.DayNight.NoActionBar`, permitindo que a `TopAppBar` seja adicionada e controlada diretamente no layout da `Activity`.
- **Componente `MaterialToolbar`**: A `com.google.android.material.appbar.MaterialToolbar` é utilizada como a `TopAppBar` principal do aplicativo.

### 2. Menus e Navegação
- **Criação de Menu**: O menu de opções da barra é definido em `res/menu/menu_main.xml`.
- **Manipulação de Cliques**: O `onOptionsItemSelected` na `Activity` é usado para identificar e responder aos cliques nos itens de menu.
- **Navegação entre Telas**: Foi implementada a navegação para uma `SecondActivity` através de um ícone na `TopAppBar`, utilizando `Intent`.
- **Botão "Voltar" (Up Button)**: A `SecondActivity` possui um botão de "voltar" na `TopAppBar` para retornar à tela principal.

### 3. Personalização de Cores e Temas
- **Sistema de Cores do Material 3**: O projeto demonstra o uso de atributos de tema (`?attr/`) para criar um design consistente.
- **Cores do Tema**: O arquivo `res/values/themes.xml` é usado para definir as cores globais do aplicativo, como `colorPrimary` e `colorOnPrimary`.
- **Estilo Individual de Componente**: A `TopAppBar` da `MainActivity` recebeu uma cor de fundo específica (`@color/my_awesome_red`) diretamente no arquivo de layout XML, demonstrando como sobrescrever o tema global.
- **Controle da Barra de Status (`StatusBar`)**: A cor da barra de status do sistema (onde fica o relógio) é personalizada através do atributo `android:statusBarColor` no tema, mostrando como unificar (ou não) a cor com a `TopAppBar`.
- **Definição de Cores**: Novas cores foram adicionadas e gerenciadas no arquivo `res/values/colors.xml`.

## 🚀 Como executar

1.  Clone este repositório.
2.  Abra o projeto no Android Studio.
3.  Compile e execute em um emulador ou dispositivo físico.
