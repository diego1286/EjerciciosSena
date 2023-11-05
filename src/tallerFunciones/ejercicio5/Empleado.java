package tallerFunciones.ejercicio5;

public class Empleado {
        private String nombre;
        private int horasTrabajadasQuincena;
        private double valorHoraOrdinaria;
        private int horasOrdinarias;
        private int horasExtras;
        private double valorHoraOrdinariaQuincena;
        private double valorHoraExtraNocturna;
        private double valorHoraExtraDominical;
        private double valorHorasExtras;
        private double valorTotalPagado;

        public Empleado(String nombre, int horasTrabajadasQuincena) {
            this.nombre = nombre;
            this.horasTrabajadasQuincena = horasTrabajadasQuincena;
            calcularValores();
        }

        private void calcularValores() {
            if (horasTrabajadasQuincena <= 60) {
                valorHoraOrdinaria = 7000.0;
            } else {
                valorHoraOrdinaria = 10000.0;
            }

            if (horasTrabajadasQuincena > 80) {
                horasOrdinarias = 80;
                horasExtras = horasTrabajadasQuincena - 80;
            } else {
                horasOrdinarias = horasTrabajadasQuincena;
                horasExtras = 0;
            }

            valorHoraOrdinariaQuincena = horasOrdinarias * valorHoraOrdinaria;
            valorHoraExtraNocturna = calcularValorHoraExtraNocturna(horasExtras);
            valorHoraExtraDominical = calcularValorHoraExtraDominical(horasExtras);
            valorHorasExtras = valorHoraExtraNocturna + valorHoraExtraDominical;
            valorTotalPagado = valorHoraOrdinariaQuincena + valorHorasExtras;
        }

        private double calcularValorHoraExtraNocturna(int horasExtras) {
            if (horasExtras <= 8) {
                return horasExtras * valorHoraOrdinaria * 1.25;
            } else {
                return 8 * valorHoraOrdinaria * 1.25 + (horasExtras - 8) * valorHoraOrdinaria * 1.75;
            }
        }

        private double calcularValorHoraExtraDominical(int horasExtras) {
            if (horasExtras <= 8) {
                return horasExtras * valorHoraOrdinaria * 1.25;
            } else {
                return 8 * valorHoraOrdinaria * 1.25 + (horasExtras - 8) * valorHoraOrdinaria * 1.75;
            }
        }

        public void mostrarInformacion() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Horas Trabajadas en la Quincena: " + horasTrabajadasQuincena);
            System.out.println("Valor Hora Ordinaria: " + valorHoraOrdinaria);
            System.out.println("Horas Ordinarias: " + horasOrdinarias);
            System.out.println("Horas Extras: " + horasExtras);
            System.out.println("Valor Hora Ordinaria Quincena: " + valorHoraOrdinariaQuincena);
            System.out.println("Valor Hora Extra Nocturna: " + valorHoraExtraNocturna);
            System.out.println("Valor Hora Extra Dominical: " + valorHoraExtraDominical);
            System.out.println("Valor Horas Extras: " + valorHorasExtras);
            System.out.println("Valor Total Pagado: " + valorTotalPagado);
            System.out.println();
        }

}

