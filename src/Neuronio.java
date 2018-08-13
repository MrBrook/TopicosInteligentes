public class Neuronio {

    private double pesos[];

    private double bias;

    private FuncaoAtivacao funcaoAtivacao;

    public Neuronio (int numEntradas){
        configuraPesos(numEntradas);
        this.funcaoAtivacao = new FuncaoAtivacao.Limiar();

    }

    public void configuraPesos(int numEntradas){
        this.pesos = new double[numEntradas] ;
        for (int i = 0;i < numEntradas;++i){
            pesos[i] = Math.random();
        }
        this.bias = Math.random();
    }

    public double getSaida(double entrada[]){
        double saida=0;

        for(int i=0;i<entrada.length;++i){
            saida+= entrada[i]*pesos[i];
        }
        saida = saida + bias;


        return funcaoAtivacao.getValor(saida);
    }

    public void setFuncaoAtivacao(FuncaoAtivacao funcaoAtivacao){
        this.funcaoAtivacao = funcaoAtivacao;
    }
    public void setPesos(double pesos[]){
        this.pesos = pesos;
    }

    public void setBias(double bias){
        this.bias = bias;
    }




}
