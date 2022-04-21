@startuml
package "POOp9" #DDDDDD{
class serVivo{
    -nombre:String
    -edad:int
    -peso:float
    +dormir()
    +come()
}
class mascota{
    -color:String
    -raza:String
    -tamaño:char
    +jugar()
    +correr()
}
abstract class claseAbstracta{
    +metodoAbstracto:String
}
interface interfaz{
    +metodo:double
}

serVivo <|-- mascota
}
@enduml