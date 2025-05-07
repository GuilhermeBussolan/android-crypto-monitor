Sobre o app: O Android Crypto Monitor é um app Android feito em Kotlin que mostra os preços das criptomoedas em tempo real, usando uma API pública. Ele foi criado durante as aulas e terminado como forma de checkpoint, com a ideia de aprender o básico de desenvolvimento mobile e como conectar um app com serviços da web. 

Alteração: 
![Image](https://github.com/user-attachments/assets/1a8308cb-eeea-488d-9511-3a43b219df19)
Esse trecho de código configura o botão de atualizar (Refresh) na tela. Primeiro, ele pega o botão btn_refresh com o findViewById(). Depois, coloca um ouvinte de clique (setOnClickListener) pra que sempre que o botão for clicado, a função makeRestCall() seja chamada e os dados sejam atualizados no app. 


Alteração: 
![Image](https://github.com/user-attachments/assets/6fa2daec-c0f6-4c5c-a7c2-8af273f626ca) 
![Image](https://github.com/user-attachments/assets/b04ed67b-e015-45c3-a517-c7e6cd62e9b9)
A função makeRestCall() é usada para buscar o preço mais recente da criptomoeda. Ela faz isso pela internet. Se der tudo certo, ela mostra o valor atualizado e a data na tela. 
Se tiver algum problema na resposta, aparece uma mensagem de erro. E se acontecer algum erro inesperado, o app também mostra uma mensagem avisando o que deu errado. 


Alteração: 
![Image](https://github.com/user-attachments/assets/6448727e-7663-4a84-a120-628430f29000)
A interface MercadoBitcoinService serve para configurar a conexão com o site do Mercado Bitcoin. Nela, a função getTicker() faz uma busca pelo preço do Bitcoin usando um endereço específico da internet. O app usa o Retrofit pra facilitar essa comunicação com a API, e como a função é “suspensa”, ela pode rodar em segundo plano sem travar o app enquanto espera a resposta. 


Alteração: 
![Image](https://github.com/user-attachments/assets/7853df30-2278-458a-80b8-26889a47a4cd)
A classe MercadoBitcoinServiceFactory serve pra montar e devolver uma versão pronta do serviço que fala com a API do Mercado Bitcoin. No método create(), ela configura o endereço da API e um conversor que transforma os dados recebidos em algo que o app entende direitinho. Depois disso, ela entrega esse serviço pronto pra usar, como na função getTicker() que pega o preço do Bitcoin. 


Alteração: 
![Image](https://github.com/user-attachments/assets/dd6ee18e-00aa-4476-97b9-b2a87699fd51)
Esse trecho define o layout de uma tela no Android. Ele diz que o layout vai ocupar toda a altura da tela (match_parent) e que os elementos dentro dele vão ficar organizados na vertical, ou seja, um embaixo do outro. Também tem o xmlns:tools que é só pra ajudar durante o desenvolvimento no Android Studio — ele não afeta o funcionamento do app, só serve pra mostrar dicas ou exemplos enquanto você monta a interface. 


Alteração: 
![Image](https://github.com/user-attachments/assets/dd60fbf3-c226-4405-8a1b-9cdc825007e7)
No arquivo de strings, as chaves label_value e label_date foram atualizadas. Antes, label_value mostrava um valor fixo de "145.766,73 R$", e label_date exibia uma data e hora específicas, tipo "17/04/23 13:54h". Depois da mudança, label_value ficou com o valor padrão "R$ 0,00", só pra ter algo inicial antes de atualizar com os dados reais. Já label_date passou a mostrar "dd/mm/yyyy hh:mm:ss", que é só um modelo genérico que vai ser preenchido de verdade quando os dados chegarem. 


Alteração: 
![Image](https://github.com/user-attachments/assets/5504bcb6-8d4d-4d68-b862-2b47432346f4)
Aqui, a versão do Android Gradle Plugin foi atualizada de "8.3.1" para "8.8.0". 


Alteração: 
![Image](https://github.com/user-attachments/assets/9515ae54-cc2c-4ba8-90ef-fabde2f113d9)
Foi feita uma atualização na versão do Gradle no arquivo de configuração, trocando o link do "gradle-8.4-bin.zip" para "gradle-8.10.2-bin.zip". Isso faz com que o projeto use a versão mais nova do Gradle. 


OBS: Não consegui rodar o código pois não consegui instalar o emulador no meu pc.  
![Image](https://github.com/user-attachments/assets/47d4c353-8e9e-4a86-9466-93841f3ae878)
