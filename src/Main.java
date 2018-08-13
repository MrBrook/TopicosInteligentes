public class Main {

    public static void main(String[] arg){

        Neuronio neuronio = new Neuronio(2);

        neuronio.setBias(0);
        neuronio.setFuncaoAtivacao(new FuncaoAtivacao.Sigmoide(200));
        neuronio.setPesos(new double[]{-1,-1});

        System.out.println("Classe = "+neuronio.getSaida(new double[]{1,1}));
        System.out.println("Classe = "+neuronio.getSaida(new double[]{2,1}));
        System.out.println("Classe = "+neuronio.getSaida(new double[]{0,-2}));
        System.out.println("Classe = "+neuronio.getSaida(new double[]{-1,-1}));
        System.out.println("Classe = "+neuronio.getSaida(new double[]{-2,-2}));


        Neuronio neuronio1 = new Neuronio(1);

        neuronio1.setBias(3);
        neuronio1.setPesos(new double[]{2});
        
        neuronio1.setFuncaoAtivacao(new FuncaoAtivacao() {
            @Override
            public double getValor(double juncaoAditiva) {
                return juncaoAditiva;
            }
        });

        System.out.println("Classe 2 = "+neuronio1.getSaida(new double[]{0}));
        System.out.println("Classe 2 = "+neuronio1.getSaida(new double[]{1}));
        System.out.println("Classe 2 = "+neuronio1.getSaida(new double[]{2}));
        System.out.println("Classe 2 = "+neuronio1.getSaida(new double[]{3}));
        System.out.println("Classe 2 = "+neuronio1.getSaida(new double[]{4}));


    }
}
