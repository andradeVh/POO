### Faça um diagrama de classes UML para um jogo

```mermaid
classDiagram
    direction LR
    class Aviao{
        - tripulantes: int
        - passageiros: int
        - qtdCombustivel: int
        - qtdMotores: ArrayList~Motor~
        + Aviao(t: int, p: int, c: int, tipoMotor: String, qtdMotores: int)
        + isLigado() boolean
        + ligadoDesligado() boolean
        
    }
    
    class Motor{
        - tipoMotor: String
        - ligado: boolean
        + Motor(tipoMotor: String)
        + isLigado() boolean
        + ligadoDesligado() boolean
    }

Aviao "1" *-- "1..8" Motor

```