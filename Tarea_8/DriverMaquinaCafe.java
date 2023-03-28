package Tarea_8;

public class DriverMaquinaCafe {
    public static void main(String[] args) {
        MaquinaCafe cafetera = new MaquinaCafe();
        cafetera.mostrarDeposito();
        cafetera.vasosActuales();
        cafetera.hacerAmericano();
        cafetera.hacerCapuchino();
        cafetera.hacerExpreso();
        cafetera.hacerAmericano();
        cafetera.hacerCapuchino();
        cafetera.hacerExpreso();
        cafetera.hacerAmericano();
        cafetera.hacerCapuchino();
        cafetera.hacerExpreso();
        cafetera.hacerAmericano();
        cafetera.hacerCapuchino();
        cafetera.hacerExpreso();
        cafetera.hacerAmericano();
        cafetera.hacerCapuchino();
        cafetera.hacerExpreso();
        cafetera.hacerAmericano();
        cafetera.hacerCapuchino();
        cafetera.hacerExpreso();
        cafetera.mostrarDeposito();
        cafetera.vasosActuales();
        cafetera.hacerAmericano();
        cafetera.hacerCapuchino();
        cafetera.hacerExpreso();
        cafetera.hacerAmericano();
        cafetera.hacerCapuchino();
        cafetera.hacerExpreso();
        cafetera.hacerAmericano();
        cafetera.hacerCapuchino();
        cafetera.hacerExpreso();
        cafetera.hacerAmericano();
        cafetera.hacerCapuchino();
        cafetera.hacerExpreso();
        cafetera.hacerAmericano();
        cafetera.hacerCapuchino();
        cafetera.hacerExpreso();
        cafetera.hacerAmericano();
        cafetera.hacerCapuchino();
        cafetera.hacerExpreso();
        cafetera.mostrarDeposito();
        cafetera.vasosActuales();
        cafetera.hacerAmericano();
        cafetera.hacerCapuchino();
        cafetera.hacerExpreso();
        cafetera.hacerAmericano();
        cafetera.hacerCapuchino();
        cafetera.hacerExpreso();
        cafetera.hacerAmericano();
        cafetera.hacerCapuchino();
        cafetera.hacerExpreso();
        cafetera.hacerAmericano();
        cafetera.hacerCapuchino();
        cafetera.hacerExpreso();
        cafetera.hacerAmericano();
        cafetera.hacerCapuchino();
        cafetera.hacerExpreso();
        cafetera.hacerAmericano();
        cafetera.hacerCapuchino();
        cafetera.hacerExpreso();
        if (cafetera.getVasos() > 0 && cafetera.getAgua() > 100 && cafetera.getCafe() > 100 && cafetera.getCrema() > 100 ) {
            System.out.println("La maquina ya no tiene vasos dispinibles pero si recursos para seguir sirviendo");
            cafetera.mostrarDeposito();
            cafetera.vasosActuales();
        } else {
            System.out.println("La maquina todavia tiene vasos para seguir sirviendo pero no recursos:");
            cafetera.mostrarDeposito();
            cafetera.vasosActuales();
        }
        cafetera.mostrarDeposito();
        cafetera.vasosActuales();
    }
}
