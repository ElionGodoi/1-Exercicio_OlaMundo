package cursoUdemy;

public class Aula_52_OperadorTernário {
public static void main(String[] args) {
	
double temperaturaCorporal = 34;

String situacaoAtual1 = temperaturaCorporal<=35 ? "Hipotermia":"normal";
String situacaoAtual2 = temperaturaCorporal>35 && temperaturaCorporal<=37.5 ? "normal": situacaoAtual1;
String situacaoAtual3 = temperaturaCorporal>37.5 && temperaturaCorporal<=39.5 ? "febre": situacaoAtual2;
String situacaoAtual4 = temperaturaCorporal>39.5 && temperaturaCorporal<=41 ? "febre alta": situacaoAtual3;
String situacaoAtual5 = temperaturaCorporal>41  ? "Hipertermia": situacaoAtual4;
System.out.println(situacaoAtual5);


System.out.println("______________________________________________________");


double  nota = 8.8;
boolean bomComportamento = true;
String temDesconto = nota>8 && bomComportamento ? "sim.": "não.";

System.out.println("Tem desconto: "+temDesconto);




}
}
