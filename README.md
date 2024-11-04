# Projeto Android - Teste com Kotlin

Este projeto é uma aplicação básica de Android desenvolvida em **Kotlin**, exibindo uma mensagem de boas-vindas personalizada. Ele demonstra o uso de **IntelliJ IDEA** para criar e testar um dispositivo Android virtual (emulador).

---

## Tecnologias Utilizadas

| Tecnologia         | Descrição                                                                           |
|--------------------|-------------------------------------------------------------------------------------|
| **Kotlin**         | Linguagem de programação usada para desenvolver a aplicação Android.                |
| **Android**        | Sistema operacional para o qual a aplicação é desenvolvida e testada.               |
| **IntelliJ IDEA**  | IDE usada para codificar, compilar e executar o projeto.                           |
| **Git**            | Ferramenta de versionamento para controlar as mudanças no código-fonte.             |

---

## Estrutura do Código

### Classe MainActivity

A classe `MainActivity` configura a exibição inicial da aplicação e define uma função que retorna uma mensagem de boas-vindas personalizada.

```kotlin
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Usando funções Kotlin e exibição no TextView
        val mensagem = getMensagemPersonalizada("Usuário")
        binding.textView.text = mensagem // Acessando o TextView via Data Binding
    }

    // Função que demonstra o uso de String Templates e Interpolação
    private fun getMensagemPersonalizada(nome: String): String {
        return "Bem-vindo(a), $nome! Este é um exemplo de Kotlin básico no Android."
    }
}
```


XML
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:gravity="center">

  <TextView
      android:id="@+id/textView"
      android:layout_width="wrap_content"
      android:layout_height="wrap_content"
      android:textSize="18sp"
      android:text="Hello World!" />
</LinearLayout>


## Funcionalidades Demonstradas

| Funcionalidade             | Descrição                                                                                     |
|----------------------------|-----------------------------------------------------------------------------------------------|
| **Data Binding**           | Facilita o acesso ao `TextView` no layout XML diretamente a partir do código Kotlin.          |
| **String Templates**       | Utiliza interpolação para exibir uma mensagem personalizada no `TextView`.                    |
| **Configuração de Emulador** | Simulação do aplicativo em um dispositivo Android virtual configurado pelo IntelliJ.         |
