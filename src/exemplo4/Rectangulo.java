package exemplo4;
public class Rectangulo {
    private float base;
    private float altura;
    //contructores
    public Rectangulo(){
    }
    
    public Rectangulo(float ba,float al){
    base=ba;
    altura=al;
    }
    //metodos de acceso
    public void setBase(float ba){
        base=ba;
    }
    public float getBase(){
        return base;

    }
    public void setAltura(float al){
        altura=al;
    }
    public float getAltura(){
        return altura;
    }
    
    public float calcularArea(float ba, float al){
       /*float area=ba*al;
       return area;*/ 
       return ba*al;
    }
    
    public float calcularPerimetro(){
        return 2*(base+altura);
        
    }
}



       

