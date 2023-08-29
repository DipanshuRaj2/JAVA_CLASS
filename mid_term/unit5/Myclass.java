import java.io.Serializable;

    class Myclass implements Serializable{ 
        String s;
        int i;
        double d;
        public Myclass(String s, int i ,double d){
            this.s = s;
            this.i = i;
            this.d = d;
        }
        public String toString(){
            return "s= "+s+ "; i=" + i + ";d="+d;
        }
    }

