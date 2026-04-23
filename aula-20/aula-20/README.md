### Sistema para gestão de Agenda telefônica


```mermaid
classDiagram
    class App{
        - agenda: Agenda
        + main()
        +menu()
    }
    class Agenda{
        
    }

    class Contato{

    }
    
    class Telefone{
        
    }

    class Email{
        
    }
    App "1" *-- "1" Agenda
    Agenda "1" *-- "0..*" Contato
    Contato "1" *-- "1" Telefone
    Contato "1" *-- "1" Email

```
