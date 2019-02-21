
object PromedioVectores {
  
  //Metodo que se encarga de sacar el promedio de cada parcial
  def promedioPorParcial(calificaciones : Array[Array [Int]]) : Array[Int] ={
    var promedioParcial = new Array[Int](6)
    
    for(i <- 0 until calificaciones.length){
      for(j <- 0 until calificaciones.length){
        
        promedioParcial(i) += calificaciones(i)(j)
      }
    }
    for(i <- 0 until calificaciones.length){
      
      promedioParcial(i) = promedioParcial(i)/promedioParcial.length
      
    }
    return promedioParcial
  }//fin del metodo promedio parcial
  
 //Metodo que se encarga de sacar el promedio de cada materia
  def promedioPorMateria(calificaciones : Array[Array [Int]]) : Array[Int] ={
    
    var promedioMateria = new Array[Int](6)
    
    for(i <- 0 until calificaciones.length){
      for(j <- 0 until calificaciones.length){
        
        promedioMateria(j) += calificaciones(i)(j)
      }
    }
    for(i <- 0 until calificaciones.length){
      
      promedioMateria(i) = promedioMateria(i)/promedioMateria.length
      
    }
    return promedioMateria
  }//fin del metodo promedio materia
  
  
//Metodo que se encarga de sacar el promedio general 
  def promedioGeneral(calificaciones : Array[Array [Int]]) : Int ={
    
    var promedioGeneral = new Array[Int](6)
    var promedioTotal = 0
    
    for(i <- 0 until calificaciones.length){
      for(j <- 0 until calificaciones.length){
        
        promedioGeneral(i) += calificaciones(i)(j)
      }
    }
    for(i <- 0 until promedioGeneral.length){
      
      promedioTotal += promedioGeneral(i)
      
    }
    return promedioTotal /(promedioGeneral.length * promedioGeneral.length)
  }//fin del metodo promedio general
  
  
  def main(args: Array[String]): Unit = {
    
     var calificaciones = new Array[Array [Int]](6)
     
    calificaciones(0) = Array(70, 70, 70, 70, 70, 70)
    calificaciones(1) = Array(80, 80, 80, 80, 80, 80)
    calificaciones(2) = Array(90, 90, 90, 90, 90, 90)
    calificaciones(3) = Array(100, 100, 100, 100, 100, 100)
    calificaciones(4) = Array(70, 80, 90, 100, 60, 50)
    calificaciones(5) = Array(100, 90, 100, 90, 100, 90)
    
    for(i <- 0 until promedioPorParcial(calificaciones).length){
     println("El promedio del parcial es igual a: "+promedioPorParcial(calificaciones)(i))
    }
    
    println("--------------------------------------------------------------------------")
    
    for(i <- 0 until promedioPorMateria(calificaciones).length){
    println("El promedio de la materia es igual a: "+promedioPorMateria(calificaciones)(i))
    }
    
   println("--------------------------------------------------------------------------")
   println("El promedio general de todas las materias es igual a: " + promedioGeneral(calificaciones))
   
  }//fin del metodo main
}//fin della clase general