public interface FuncaoAtivacao {

    double getValor(double juncaoAditiva);

    public class Limiar implements FuncaoAtivacao{
        @Override
        public double getValor(double juncaoAditiva) {
            if(juncaoAditiva >= 0){
                return 1;
            }else {
                return 0;
            }
        }
    }
    public class Sigmoide implements FuncaoAtivacao{

        private double inclinacao;

        public Sigmoide(double inclinacao){
            this.inclinacao = inclinacao;
        }
        public double getValor(double juncaAditiva){
            return 1/(1+Math.exp(-inclinacao*juncaAditiva));
        }
    }

}
