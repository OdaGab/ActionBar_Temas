# ActionBar e Temas com Material 3

Este projeto é um estudo prático sobre como implementar e personalizar uma `TopAppBar` (a evolução da `ActionBar`) utilizando os componentes do Material Design 3 em uma aplicação Android nativa.

O código foi desenvolvido como uma adaptação e modernização dos conceitos apresentados no livro de desenvolvimento Android de Ricardo R. Lacheta, atualizando as práticas para as bibliotecas e estilos mais recentes recomendados pelo Google.

## ✨ Funcionalidades

- Implementação de uma `MaterialToolbar` para servir como `TopAppBar`.
- Uso de um tema baseado no Material 3 (`Theme.Material3.DayNight.NoActionBar`).
- Criação de um menu de opções (`res/menu/menu_main.xml`).
- Inflação do menu na `TopAppBar` e manipulação de eventos de clique nos itens.

## 🛠️ Como foi construído

O projeto segue uma estrutura simples, focada em demonstrar a configuração da `TopAppBar`:

1.  **Configuração do Tema**: O tema principal do app em `res/values/themes.xml` foi definido para herdar de `Theme.Material3.DayNight.NoActionBar`, nos dando controle total sobre a barra de topo da aplicação.

2.  **Layout da Atividade**: No arquivo `res/layout/activity_main.xml`, a `com.google.android.material.appbar.MaterialToolbar` foi adicionada para servir como a barra de topo visual.

3.  **Criação do Menu**: Foi criado o arquivo `res/menu/menu_main.xml` para declarar os itens que deveriam aparecer no menu, como "Pesquisar" e "Configurações", definindo como e quando eles deveriam ser exibidos (ícone ou no menu flutuante).

4.  **Lógica na `MainActivity.kt`**:
    - A `MaterialToolbar` do layout é encontrada e configurada como a `SupportActionBar` da atividade.
    - O método `onCreateOptionsMenu` é sobrescrito para "inflar" (carregar) o arquivo de menu `menu_main.xml` na toolbar.
    - O método `onOptionsItemSelected` é sobrescrito para capturar os cliques nos itens de menu e executar uma ação (neste caso, exibir um `Toast`).

## 🚀 Como executar

1.  Clone este repositório.
2.  Abra o projeto no Android Studio.
3.  Compile e execute em um emulador ou dispositivo físico.
