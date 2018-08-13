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


    }
}
