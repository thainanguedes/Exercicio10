
public class ConversorDeTemperatura {
    
  public double converterParaCelsius(double farenheit) throws MenorQueZeroAbsolutoException{
      if(farenheit < -459.67){
          
          throw new MenorQueZeroAbsolutoException("Temperatura Invalida");
          
      }
      
      double temp =(farenheit -32 )/1.8;
       return temp;
  }
  public double converterParaFarenheit(double celsius) throws MenorQueZeroAbsolutoException{
      if (celsius < -273.15){
          
          throw new MenorQueZeroAbsolutoException("Temperatura Invalida");
      }
      double temp =(celsius * 1.8)+ 32;
      return temp;
  }
}
