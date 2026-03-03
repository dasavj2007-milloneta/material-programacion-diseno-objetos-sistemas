

public class Operaciones {
    public String CambiarGenero(boolean gen){
        if(gen==true){
            return "Masculino";
        }else if(gen==false){
            return "Femenino";
        }else{
            return "Género sin identificar";
        }
    }
}
