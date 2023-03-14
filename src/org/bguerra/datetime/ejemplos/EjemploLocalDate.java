package org.bguerra.datetime.ejemplos;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class EjemploLocalDate {
    public static void main(String[] args) {

        LocalDate fechaactual = LocalDate.now();
        System.out.println("Fecha Actual " + fechaactual);
        System.out.println("Dia: " + fechaactual.getDayOfMonth());
        //System.out.println("Mes: " + fechaactual.getMonth());
        Month mes = fechaactual.getMonth();
        System.out.println("Mes: " + mes);
        System.out.println("Numero del mes: " + mes.getValue());
        System.out.println("Mes español: " + mes.getDisplayName(TextStyle.FULL, new Locale("es", "ES")));

        DayOfWeek diaSemana = fechaactual.getDayOfWeek();
        System.out.println("Numero del dia: " + diaSemana.getValue());
        System.out.println("Nombre del dia: " + diaSemana.getDisplayName(TextStyle.FULL, new Locale("es", "ES")));

        System.out.println("Año: " + fechaactual.getYear());
        System.out.println("Dia del año: " + fechaactual.getDayOfYear());
        System.out.println("Era: " + fechaactual.getEra());

        fechaactual = LocalDate.of(2022, 11, 22);
        System.out.println("Fecha Actual: " + fechaactual);

        fechaactual = LocalDate.of(2022, Month.DECEMBER, 22);
        System.out.println("Fecha Actual: " + fechaactual);

        fechaactual = LocalDate.parse("2022-07-29");
        System.out.println("Fecha Actual: " + fechaactual);

        LocalDate diaDelManiana = LocalDate.now().plusDays(1);
        System.out.println("diaDelManiana = " + diaDelManiana);

        LocalDate mesAnterioMismoDia = LocalDate.now().minusMonths(1);
        System.out.println("mesAnterioMismoDia = " + mesAnterioMismoDia);

        LocalDate mesAnterioMismoDia2 = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("mesAnterioMismoDia2 = " + mesAnterioMismoDia2);

        DayOfWeek miercoles = LocalDate.parse("2022-11-22").getDayOfWeek();
        System.out.println("miercoles = " + miercoles);

        int once = LocalDate.of(2022, 11, 11).getDayOfMonth();
        System.out.println("once = " + once);

        boolean esBisiesto = LocalDate.now().isLeapYear();
        System.out.println("esBisiesto = " + esBisiesto);

        boolean esAntes = LocalDate.of(2020, 11, 11).isBefore(LocalDate.parse("2022-11-10"));
        System.out.println("esAntes = " + esAntes);

        boolean esDespues = LocalDate.parse("2020-11-23").isAfter(LocalDate.parse("2020-11-10"));
        System.out.println("esDespues = " + esDespues);

        esDespues = LocalDate.now().isAfter(LocalDate.now().minusDays(1));
        System.out.println("esDespues = " + esDespues);
    }
}