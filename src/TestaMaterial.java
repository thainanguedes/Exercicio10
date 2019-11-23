
public class TestaMaterial {
    
    public static void main(String[] args) {
        
      try {
          Material m1 = new Material("Celular", -2);
      }catch(QuantidadeInvalidaException ex){
          System.out.println(ex.getMessage());
      }
    }
}
