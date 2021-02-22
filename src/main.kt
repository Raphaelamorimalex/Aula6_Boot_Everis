const val MAX_MES = 10
const val MIN_MES = 2
fun main(){
   val mes= listOf(1,2,3,4,5,6,7,8,9,10,11,12)
   val numero =(1..12).random()
   println(numero)
   println(numero in mes)
   println("O mes está nos parametros")
   println(numero <= MAX_MES && numero >= MIN_MES)
}