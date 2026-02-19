<p align="center">
  <img src="https://i.ibb.co/C5M86XqF/logo.png" width="120" alt="Onde Estacionei Logo" />
</p>

<h1 align="center">Onde Estacionei?</h1>

<p align="center">
  Nunca mais perca seu carro. Salve, visualize e navegue até seu veículo com um único toque.
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Kotlin-7F52FF?style=flat-square&logo=kotlin&logoColor=white" alt="Kotlin" />
  <img src="https://img.shields.io/badge/Android-3DDC84?style=flat-square&logo=android&logoColor=white" alt="Android" />
  <img src="https://img.shields.io/badge/Jetpack%20Compose-4285F4?style=flat-square&logo=jetpackcompose&logoColor=white" alt="Jetpack Compose" />
  <img src="https://img.shields.io/badge/Material%203-757575?style=flat-square&logo=material-design&logoColor=white" alt="Material 3" />
  <img src="https://img.shields.io/badge/Room-FF6F00?style=flat-square&logo=sqlite&logoColor=white" alt="Room" />
  <img src="https://img.shields.io/badge/DataStore-4285F4?style=flat-square&logo=google&logoColor=white" alt="DataStore" />
  <img src="https://img.shields.io/badge/Retrofit-48B983?style=flat-square&logo=square&logoColor=white" alt="Retrofit" />
  <img src="https://img.shields.io/badge/OkHttp-3E4348?style=flat-square&logo=square&logoColor=white" alt="OkHttp" />
  <img src="https://img.shields.io/badge/Google%20Maps-4285F4?style=flat-square&logo=googlemaps&logoColor=white" alt="Google Maps" />
  <img src="https://img.shields.io/badge/OpenRouteService-6DB33F?style=flat-square&logo=openstreetmap&logoColor=white" alt="OpenRouteService" />
  <img src="https://img.shields.io/badge/WorkManager-FF6F00?style=flat-square&logo=google&logoColor=white" alt="WorkManager" />
  <img src="https://img.shields.io/badge/Glance%20Widget-3DDC84?style=flat-square&logo=android&logoColor=white" alt="Glance" />
</p>

---

## 📖 Sobre o Projeto

Quem nunca passou minutos preciosos procurando o carro em um estacionamento de shopping, em uma rua desconhecida ou no meio da multidão de um grande evento? Esse momento de incerteza pode ser frustrante e consumir um tempo valioso.

**Onde Estacionei?** é um assistente de estacionamento minimalista e confiável. Com apenas um toque, o usuário salva a localização exata do veículo. Ao retornar, o aplicativo exibe a posição do carro e a localização atual do usuário em um mapa interativo, traçando a melhor rota para o reencontro.

**Público-alvo:** motoristas que frequentam grandes centros urbanos, shoppings, aeroportos e eventos — onde encontrar o carro pode se tornar um desafio real.

---

## ✨ Funcionalidades

- [x] **Salvar localização com um toque** — Registra a posição GPS atual diretamente pela tela principal
- [x] **Mapa interativo** — Exibe a localização do carro e do usuário via Google Maps
- [x] **Navegação a pé / de carro** — Traça a rota em tempo real entre o usuário e o veículo
- [x] **Geocodificação reversa** — Converte coordenadas GPS em endereços legíveis
- [x] **Notas e detalhes** — Permite salvar informações extras como andar e número da vaga
- [x] **Histórico de locais** — Listagem e exclusão de registros salvos localmente
- [x] **Tema escuro / claro** — Interface adaptável com Material 3
- [x] **App Widget** — Salve sua localização diretamente pela tela inicial, sem abrir o app

---

## 🖼️ Screenshots

> As imagens abaixo ilustram as principais telas da aplicação.

| Tela Principal - Light Model | Tela Principal - Dark Model |
|:-:|:-:|
| ![Home](screenshots/home-light.png) | ![Map](screenshots/home-dark.png) |

| Tela de Rota - Light Model | Tela de Rota - Dark Model |
|:-:|:-:|
| ![Home](screenshots/route-light.png) | ![Map](screenshots/route-dark.png) |

| Tela de Histórico | Adicionar nota |
|:-:|:-:|
| ![Home](screenshots/history.png) | ![Map](screenshots/note-dialog.png) |
---

## 🏗️ Arquitetura

O projeto segue a arquitetura **MVVM (Model-View-ViewModel)** e é construído com o ecossistema moderno do Android.

| Camada | Tecnologia |
|---|---|
| **Linguagem** | Kotlin 2.0.21 |
| **UI** | Jetpack Compose + Material 3 |
| **Banco de dados** | Room |
| **Preferências** | DataStore |
| **Rede** | Retrofit + OkHttp |
| **Mapas** | Google Maps Compose |
| **Localização** | Play Services Location (Fused Location Provider) |
| **Rotas** | OpenRouteService API |
| **Permissões** | Accompanist Permissions |
| **Navegação** | Navigation Compose |
| **Background** | WorkManager |
| **Widget** | Glance |
| **Splash** | Core Splashscreen |

---

## 🚀 Como Executar

### Pré-requisitos

- Android Studio instalado
- Chaves de API do **Google Maps** e **OpenRouteService**

### 1. Clone o repositório
```bash
git clone git@github.com:profBruno-UFC-Qx/classroom-mobile-final-onde-estacionei.git
```

### 2. Acesse o diretório do projeto
```bash
cd classroom-mobile-final-onde-estacionei/ondeestacionei/
```

### 3. Abra no Android Studio
```bash
studio .
```

### 4. Configure as chaves de API

Por segurança, as chaves de API não estão incluídas no repositório — provedores como Google e OpenRouteService revogam chaves detectadas em repositórios públicos automaticamente.

Após obter suas chaves, localize o arquivo `local.properties` na raiz do projeto e adicione ao final:
```properties
MAPS_API_KEY=SUA_CHAVE_AQUI
ORS_API_KEY=SUA_CHAVE_AQUI
```

### 5. Execute o app

Conecte um dispositivo ou inicie um emulador e pressione **Run** no Android Studio.

---

## 📄 Licença

Este projeto foi desenvolvido para fins acadêmicos.
