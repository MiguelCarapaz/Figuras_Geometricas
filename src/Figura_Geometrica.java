import java.util.Scanner;
public class Figura_Geometrica {
    //Atributos
    float base, altura, total,lados,lado2,largo;
    Scanner entrada = new Scanner(System.in);
    //Constructor
    public Figura_Geometrica(){
        base = 0;
        altura = 0;
        total = 0;
        lados = 0;
        lado2 = 0;
        largo = 0;
    }
    int menu(){
        int op = -1;
        while ((op < 0) || (op > 4)) {
            System.out.println("1.- CALCULAR EL AREA");
            System.out.println("2.- CALCULAR EL PERIMETRO");
            System.out.println("3.- CALCULAR EL VOLUMEN");
            System.out.println("4.- SALIR");

            System.out.print("Ingrese la opcion: ");
            op = entrada.nextInt();

            if((op < 0) || (op > 4)){
                System.out.println("Opcion no valida");
            }
        }
        return op;
    }
    int menu_figuras(){
        int op = -1;
        while ((op < 0) || (op > 3)) {
            System.out.println("1.- Cuadrados");
            System.out.println("2.- Triangulos");
            System.out.println("3.- Rectangulos");
            System.out.print("Ingrese la opcion: ");
            op = entrada.nextInt();
            if((op < 0) || (op > 3)){
                System.out.println("Opcion no valida");
            }
        }
        return op;
    }
    int menu_triangulos(){
        int op = -1;
        while ((op < 5) || (op > 7)) {
            System.out.println("5.- Equilatero");
            System.out.println("6.- Isoseles");
            System.out.println("7.- Escaleno");

            System.out.print("Ingrese la opcion: ");
            op = entrada.nextInt();

            if((op < 5) || (op > 7)){
                System.out.println("Opcion no valida");
            }
        }
        return op;
    }
    int menu_volumenes(){
        int op = -1;
        while ((op < 5) || (op > 7)) {
            System.out.println("5.- Cubo");
            System.out.println("6.- Prisma triangular");
            System.out.println("7.- Piramide");
            System.out.print("Ingrese la opcion: ");
            op = entrada.nextInt();

            if((op < 5) || (op > 7)){
                System.out.println("Opcion no valida");
            }
        }
        return op;
    }
    //Metodos
    public void cuadrado_areas(Figura_Geometrica datos1){
        System.out.println("Ingrese la base del cuadrado");
        datos1.setBase(entrada.nextFloat());
        System.out.println("Ingrese la altura del cuadrado");
        datos1.setAltura(entrada.nextFloat());
        if (getBase() != getAltura()){
            System.out.println("Si la base o la altura son diferentes, no es un cuadrado");
        }
        else {
            total = getAltura() * getBase();
            System.out.println("El area del cuadrado es: " +Math.round(total));
        }
    }
    public void triangulo_area(Figura_Geometrica datos2){
        System.out.println("Ingrese la base del triangulo");
        datos2.setBase(entrada.nextFloat());
        System.out.println("Ingrese la altura del triangulo");
        datos2.setAltura(entrada.nextFloat());
        total = (getBase() * getAltura()) / 2;
        System.out.println("El area del triangulo es: " + total);
    }
    public void rectangulo_area(Figura_Geometrica datos3){
        System.out.println("Ingrese la base del regtangulo");
        datos3.setBase(entrada.nextFloat());
        System.out.println("Ingrese la altura del regtangulo");
        datos3.setAltura(entrada.nextFloat());
        total = getBase() * getAltura();
        System.out.println("El area del regtangulo es: " + total);

    }
    public void cuadrado_perimetro(Figura_Geometrica datos4){
        System.out.println("Ingrese la dimension del cuadrado");
        datos4.setLados(entrada.nextFloat());
        total = getLados() + getLados() + getLados() + getLados();
        System.out.println("El perimetro del cuadrado es: " +  total);
    }
    public void triangulo_perimetro_equi(Figura_Geometrica datos5){
        System.out.println("Ingrese el lado del triangulo");
        datos5.setLados(entrada.nextFloat());
        total = getLados() * 3;
        System.out.println("El perimetro del triangulo equilatero es: " + total);
    }
    public void triangulo_perimetro_iso(Figura_Geometrica datos5){
        System.out.println("Ingrese el valor de los lados del triangulo");
        datos5.setLados(entrada.nextFloat());
        System.out.println("Ingrese la base del triangulo");
        datos5.setBase(entrada.nextFloat());
        total = (2 * getLados()) + getBase();
        System.out.println("El perimetro del triangulo isoseles es: " + total);
    }
    public void triangulo_perimetro_esca(Figura_Geometrica datos5){
        System.out.println("Ingrese el primer lado del triangulo");
        datos5.setLados(entrada.nextFloat());
        System.out.println("Ingrese el segundo lado del triangulo");
        datos5.setLado2(entrada.nextFloat());
        System.out.println("Ingrese el tercer lado del triangulo");
        datos5.setBase(entrada.nextFloat());
        total = getLados() + getLado2() + getBase();
        System.out.println("El perimetro del triangulo escaleno es: " + total);
    }
    public void rectangulo_perimetro(Figura_Geometrica datos6){
        System.out.println("Ingrese la altura del rectangulo");
        datos6.setAltura(entrada.nextFloat());
        System.out.println("Ingrese la base del rectangulo");
        datos6.setBase(entrada.nextFloat());
        total = getAltura() + getAltura() + getBase() + getBase();
        System.out.println("El perimetro del regtangulo es: " +  total);
    }
    public void cubo_volumen(Figura_Geometrica datos7){
        System.out.println("Ingrese la dimencion de los lados del cubo:");
        datos7.setLados(entrada.nextFloat());
        total = getLados() * getLados() * getLados();
        System.out.println("El volumen del cubo es de: " + total);
    }
    public void triangulo_volumen(Figura_Geometrica datos8){
        System.out.println("Ingrese la base: ");
        datos8.setBase(entrada.nextFloat());
        System.out.println("Ingrese la altura: ");
        datos8.setAltura(entrada.nextFloat());
        System.out.println("Ingrese el largo: ");
        datos8.setLargo(entrada.nextFloat());
        total = (getBase() * getAltura()) / 2 ;
        total *= getLargo();
        System.out.println("El volumen del prisma triangular es: " + total);
    }
    public void piramide_volumen(Figura_Geometrica datos9){
        System.out.println("Ingrese la altura: ");
        datos9.setAltura(entrada.nextFloat());
        System.out.println("Ingrese el lado: ");
        datos9.setLados(entrada.nextFloat());
        total = (((getLados() * getLados()) * getAltura()) / 3);
        System.out.println("El volumen de la piramide es: " + total);
    }
    //SETTER AND GETTER

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public float getLados() {
        return lados;
    }

    public void setLados(float lados) {
        this.lados = lados;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}