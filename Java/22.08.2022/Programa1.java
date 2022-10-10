public class Programa1 {
    
    int valorX, valorY;

    public Programa1(int valorX, int valorY){

        this.valorX = valorX;
        this.valorY = valorY;
    }

    public int getValorX(){
        return valorX;
    }

    public int getValorY(){
        return valorY;
    }

    public int getCalculo(){
        return this.getValorX()+this.getValorY();
    }
    
    public int getDiv(){
        return this.getValorX()/this.getValorY();
    }

    public int getMulti(){
        return this.getValorX()*this.getValorY();
    }
    
    public int getSub(){
        return this.getValorX()-this.getValorY();
    }
    
    public static void main(String[] args) {
        tarefa1 obj = new tarefa1(10,2);
        System.out.println(obj.getCalculo());
        System.out.println(obj.getDiv());
        System.out.println(obj.getMulti());
        System.out.println(obj.getSub());
    }

}
