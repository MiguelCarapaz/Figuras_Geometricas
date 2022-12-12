public class Main {
    public static void main(String[] args) {
        //Instancias
        Figura_Geometrica fig_cuadrado = new Figura_Geometrica();
        Figura_Geometrica fig_triangulo = new Figura_Geometrica();
        Figura_Geometrica fig_regtangulo = new Figura_Geometrica();
        //
        Figura_Geometrica menu_de_figuras = new Figura_Geometrica();
        Figura_Geometrica menu_de_opciones = new Figura_Geometrica();
        //
        int op_figuras = 0;
        boolean salir = false;
        //
        while(!salir){
            switch (menu_de_opciones.menu()){
                case 1: //Caso para calcular las areas de las figuras
                    op_figuras = menu_de_figuras.menu_figuras();
                    if (op_figuras == 1){
                        fig_cuadrado.cuadrado_areas(fig_cuadrado);
                    }
                    if (op_figuras == 2){
                        fig_triangulo.triangulo_area(fig_triangulo);
                    }
                    if (op_figuras == 3){
                        fig_regtangulo.rectangulo_area(fig_regtangulo);
                    }
                    break;
                case 2: //Caso para calcular los perimetros de las figuras
                    op_figuras = menu_de_figuras.menu_figuras();
                    if (op_figuras == 1){
                        fig_cuadrado.cuadrado_perimetro(fig_cuadrado);
                    }
                    if (op_figuras == 2){
                        op_figuras = menu_de_figuras.menu_triangulos();
                        if (op_figuras == 5 ){
                            fig_triangulo.triangulo_perimetro_equi(fig_triangulo);
                        }
                        else if (op_figuras == 6) {
                            fig_triangulo.triangulo_perimetro_iso(fig_triangulo);
                        }
                        else if (op_figuras == 7){
                            fig_triangulo.triangulo_perimetro_esca(fig_triangulo);
                        }
                    }
                    if (op_figuras == 3){
                        fig_regtangulo.rectangulo_perimetro(fig_regtangulo);
                    }
                    break;
                case 3: //Caso para calcular los volumenes de las figuras
                    op_figuras = menu_de_figuras.menu_volumenes();
                    if (op_figuras == 5){
                        fig_cuadrado.cubo_volumen(fig_cuadrado);
                    }
                    if (op_figuras == 6){
                        fig_triangulo.triangulo_volumen(fig_triangulo);
                    }
                    if (op_figuras == 7){
                        fig_regtangulo.piramide_volumen(fig_regtangulo);
                    }
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida, intente de nuevo");
            }//Fin switch
        }//Fin del bucle
    }
}