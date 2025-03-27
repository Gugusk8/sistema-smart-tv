public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada ? " + smartTv.ligada);

        smartTv.desligada();
        System.out.println("Novo Status -> TV ligada ? " + smartTv.ligada);

        smartTv.diminuiVolume();
        smartTv.diminuiVolume();
        smartTv.diminuiVolume();
        smartTv.aumentarVolume();           
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal Atual : " + smartTv.canal);

        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.aumentarCanal();
        System.out.println("Canal Atual : " + smartTv.canal);


    }
}

