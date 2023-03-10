package Tarea_6;

import java.time.LocalTime;

public class DriverReloj {
    public static void main(String[] args) {
        LocalTime  local = LocalTime.now();
Reloj wacho = new Reloj(local.getHour(),local.getMinute(),local.getSecond());
    wacho.mostrar();
    wacho.programarAlarma(12,37,0);
        for (int i = 0; i < 50; i++) {
            wacho.avanzar();
            wacho.mostrar();
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
