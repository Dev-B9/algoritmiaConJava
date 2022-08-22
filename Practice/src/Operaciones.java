import java.util.Scanner;

import javax.swing.JOptionPane;

import java.text.DecimalFormat;

public class Operaciones {

// 2. Haga el siguiente algoritmo y descubra cual es el valor de cada variable.	
	
	public void part2() {

		int a = 4;
		int b = -5;
		int c = 9;


		System.out.println("El resultado de A es: " + (a-2 + b*(b+3)-c));
		System.out.println("El resultado de B es: " + c);
		System.out.println("El resultado de C es: " +  (a*b) + 2);

		System.out.println();

	}
	
// 3. Calcular el 15% de un valor constante.
// 4. Modificar el algoritmo anterior para que muestre el 15% de un valor ingresado por el usuario

	public void part3_4() {

		@SuppressWarnings("resource")
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese un número");
		int valor = leer.nextInt();
		int porcentaje = 15;
		double result = valor  * porcentaje;
		
		System.out.println();
		
		System.out.println("El 15% del valor ingresado es: "+ result/100 + "%");


		System.out.println();

	}

	
// 5. Calcular el nuevo salario de un obrero si obtuvo un incremento del 25% sobre su salario anterior.
	
	public void part5_25(){
		
		@SuppressWarnings("resource")
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese el salario: ");
		int salario = leer.nextInt();
		
		System.out.println("Ingrese el incremento de su salario anterior: ");
		int incremento = leer.nextInt();
		
		double porcentaje =  incremento;
		
		double division = porcentaje / 100;
		
		double result = division * salario;
		
		double suma = result + salario;
		

		
		System.out.println("El pago final es: " + Math.round(suma));
		
		System.out.println();
	}
	
//6. Cree un algoritmo que reciba como entrada el sueldo de una persona y sus horas extras trabajadas y luego imprima el Sueldo total de esta persona dado que cada hora extra vale $3000.
	
	
	public void part6(){
		
		@SuppressWarnings("resource")
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese el sueldo: ");
		int sueldo = leer.nextInt();
		
		System.out.println("Ingrese horas extras trabajadas: ");
		int horasExtras = leer.nextInt();
		
		int pagoFinal = horasExtras * 3000 + sueldo;
		
		System.out.println("Su sueldo total es: " + pagoFinal);
		
	}
	
	
// 7. Cree un algoritmo que calcule e imprima lo que debe pagar un paciente a un hospital debido a un tratamiento teniendo como entradas el costo del tratamiento, 
	//el número de días de hospitalización y el costo de los medicamentos. 
	//Cada día de hospitalización cuesta $100000.
	
	public void part7(){
		
		@SuppressWarnings("resource")
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese costo tratamiento: ");
		int costoTratamiento = leer.nextInt();
		
		System.out.println("Ingrese numero de dias de hospitalizacion: ");
		int numDias = leer.nextInt();
		
		System.out.println("Ingrese el costo de medicamentos: ");
		int costoMedicamentos = leer.nextInt();
		
		int costoPorDia = numDias * 100000;
		
		int pagoFinal = costoTratamiento + costoPorDia + costoMedicamentos;
		
		System.out.println("Su sueldo total es: " + pagoFinal);
		
		System.out.println();
		
	}
	
	
// 8. Halle el área de un triángulo rectángulo si su base y altura son de un valor desconocido (área=(base*altura)/2).
	
	public void part8() {
		
		@SuppressWarnings("resource")
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese número de base: ");
		int base = leer.nextInt();
		
		System.out.println("Ingrese número de altura: ");
		int altura= leer.nextInt();
		
		int area = (base * altura) / 2;
		
		System.out.println("El area es: " + area + "cm²");
		
		System.out.println();
		
	}
	
	
// 9. Determine el valor de x obtenido para la siguiente ecuación: x=a+b2a
	
	
	public void part9(){
		
		int a = 5;
		int b = 5;
		
		int valorX = (a+ (b *2 * a));
		
		System.out.println("resultado de x: " + valorX);
		
	}
	
	
// 10. Haga un algoritmo que sume 3 números decimales e imprima el resultado.
	
// 11. 
	
	
	
	public void part10_11() {
		
		
		double num1 = 2.5;
		
		double num2= 3.8;
		
		double num3= 4.5;
		
		System.out.println("desea multiplicar su resultado por 2?: ");
		
		@SuppressWarnings("resource")
		
		Scanner leer = new Scanner(System.in);
		
		String respuesta = leer.nextLine();
		
		
		if (respuesta.equals("si")) {
			double suma = (num1 + num2 + num3) * 2;
			System.out.println("La suma de los 3 números decimales y multiplicados por 2 es: " + suma);
		} else {
			double suma = num1 + num2 + num3;
			System.out.println("La suma de los 3 números decimales es: " + suma);
		}
		

		System.out.println();
		
	}
	

	
// 12. Crea un algoritmo que calcule e imprima el promedio de 3 notas parciales
	public void part12() {
		
		@SuppressWarnings("resource")
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese nota 1: ");
		double nota1 = leer.nextDouble();
		
		System.out.println("Ingrese nota 2: ");
		double nota2 = leer.nextDouble();
		
		System.out.println("Ingrese nota 3: ");
		double nota3 = leer.nextDouble();
		
		double notaPromedio = (nota1 + nota2+ nota3) / 3;
		
		System.out.println("Su promedio es: " + Math.floor(notaPromedio));
		
	}
	
// 13. 
	
	public void part13() {
		
		@SuppressWarnings("resource")
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre: ");
		String nombre = leer.nextLine();
		
		System.out.println("Ingrese su apellido: ");
		String apellido = leer.nextLine();
		
		System.out.println("Ingrese su profesión: ");
		String profesion = leer.nextLine();
		
		System.out.println("Ingrese documento de identidad: ");
		int identidad = leer.nextInt();
		
		System.out.println("Ingrese su edad");
		int edad = leer.nextInt();
		
		System.out.println();
	
		
		System.out.println(" Datos ingresados: \n Nombre completo: " + nombre + apellido + "\n Documento: " + identidad + "\n Edad: "+ edad + "\n Profesion: " + profesion + "\n \n Bienvenido !!");
		 
		
	}
	
	
// 16. Dado el precio de un artıculo, la cantidad de artículos a comprar y el valor entregado por el cliente, calcular la devuelta (si le alcanza) o 
//	imprimir un mensaje que le indique que le hace falta dinero para pagar la cuenta.
	
// cuenta = cantidad x precio
// devuelta = valorPagado- cuenta

	public void part16() {
		
		int cantidad = 5;
		
		int precio = 5000;
		
		int cuenta = cantidad * precio;
		
		int valorPagado = 2500;
		
		int devuelta = valorPagado - cuenta;
		
		if( devuelta < valorPagado) {
			System.out.println("No te alcanza, te faltan: " + Math.abs(devuelta));
		} else {
			System.out.println("Si le alcanza");
		}
	}
	
	
// 17. Crear un algoritmo que imprima el nombre, apellido, documento de identidad, edad y profesión, teléfono de una persona de la siguiente manera: 
	
	
	public void part17() {
		@SuppressWarnings("resource")
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre: ");
		String nombre = leer.nextLine();
		
		System.out.println("Ingrese su apellido: ");
		String apellido = leer.nextLine();
		
		System.out.println("Ingrese su profesión: ");
		String profesion = leer.nextLine();
		
		System.out.println("Ingrese documento de identidad: ");
		int identidad = leer.nextInt();
		
		System.out.println("Ingrese su edad:");
		int edad = leer.nextInt();
		
		System.out.println("Ingrese su teléfono: ");
		long telefono = leer.nextLong();
		
		
		
		System.out.println();
	
		
		System.out.println(" Datos ingresados: \n \n Nombre completo: " + nombre  + " " + apellido + "\n Documento: " + identidad + "\n Edad: "
		+ edad + "\n Profesion: " + profesion + "\n Teléfono: " + telefono + "\n \n Bienvenido !!");
		
		
	}
	
	
// 21. Algoritmo que calcule lo que gana un empleado con base a las horas trabajadas teniendo en cuenta que cada hora se paga a 2000, 
	// adicionalmente se le realiza unos descuentos con respecto a un impuesto de seguridad del 10% sobre su salario.
	
	public void part21() {
		
	
		
		int horas = 0;
		
		horas = Integer.parseInt(JOptionPane.showInputDialog("cuantas horas trabajaste?"));
		
		double paga =  horas * 2000;
		
		double porcentaje = 0.1;
		
		double result = porcentaje * paga;
		
		double suma = paga - result;
		
		System.out.println("Su salario descontando el impuesto de seguridad es: " + Math.round(suma));
		
		
	}
	
	
	
	
// 26. Dado un numero natural n, calcular la suma de los primeros n números naturales.
	
	public void part26() {
	
		int natural = 0;
		
		natural = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número natural: "));
		
		int suma =  natural * (natural + 1) / 2;
		
		System.out.println("La suma de n es: " + suma);
		
	}

	
// 27. De un estudiante conocemos la nota 1, la nota 2, la nota de trabajos y el Examen final
// Calcular la nota definitiva (notaDefinitiva) aplicando los porcentajes 20%, 20%, 30% y 30%,respectivamente 
// Tenga en cuenta que 20% equivale a 0.2 y 30% es igual a 0.3.

	public void part27(){
		
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese nota 1: ");
		double nota1 = leer.nextDouble()* 0.2;
		
		System.out.println("Ingrese nota 2: ");
		double nota2 = leer.nextDouble()* 0.2;
		
		System.out.println("Ingrese nota de trabajos: ");
		double notaTrabajos = leer.nextDouble()* 0.3;
		
		System.out.println("Ingrese nota de examen final: ");
		double examenFinal = leer.nextDouble()* 0.3;
		
		double notaFinal = nota1+ nota2 + notaTrabajos + examenFinal;
		
		System.out.println("Su nota definitiva es: " + notaFinal);
	}
	
// 28. Calcular el rendimiento de un CDT en una entidad financiera, conociendo el monto, el plazo en días y la tasa de interés anual 
//	Observe que por tener el plazo en días, la tasa de interés anual se divide entre 360.	
	
	public void part28(){
		
		DecimalFormat formateador = new DecimalFormat("0.00");
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese monto: ");
		double monto = leer.nextDouble();
		
		System.out.println("Ingrese interés anual");
		double interes = leer.nextDouble();
		
		System.out.println("Ingrese plazo en días");
		double plazo = leer.nextDouble();
		
		double division = (monto * interes * plazo) / 360;
		
		System.out.println("El rendimiento del CDT es: " + formateador.format(division));	
		
	}
	
	
	
	public void part10_ciclo1() {
		
		double array [] = new double [] {2.5, 3.8, 4.5};
		
		double suma = 0;
		
		for (double i = 0 ; i < array.length; i++) {
			suma += array[(int) i];
		}
		
		System.out.println("La suma de los 3 números decimales es: "+suma);
		System.out.println();
	}
	
	


// Segundo ciclo for ejercicio: 11. 
	
	public void ciclo2(){
		
		double array [] = new double [] {2.5, 3.8, 4.5};
		double suma = 0;
		
		for (double i = 0 ; i < array.length; i++) {
			suma   += array[(int) i] * 2;
		}
		
		System.out.println("El resultado es: "+ suma);
		System.out.println();
	}

	
	
	

// Primer ciclo while ejercicio: 12.
	
	public void ciclo3() {

			@SuppressWarnings("resource")
			
			Scanner leer = new Scanner(System.in);
			
			System.out.println("Desea calcular el promedio?: si o no");
			String respuesta = leer.nextLine().toLowerCase();
					
			while (respuesta.equals("si")) {
				
				System.out.println("Ingrese nota 1: ");
				double nota1 = leer.nextDouble();
				
				System.out.println("Ingrese nota 2: ");
				double nota2 = leer.nextDouble();
			
				System.out.println("Ingrese nota 3: ");
				double nota3 = leer.nextDouble();
				
				double result = (nota1 + nota2 + nota3) / 3;
				
				System.out.println(result);
				break;
			
			} System.out.println("Hasta luego !!");
			
		}
	
// Segundo ciclo while ejercicio: 27. 
	
	public void ciclo4() {
		
		
		@SuppressWarnings("resource")
	
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Desea calcular la nots definitiva ?: si o no");
		String respuesta = leer.nextLine().toLowerCase();
		
		while ( respuesta.equals("si")) {
		System.out.println("Ingrese nota 1: ");
		double nota1 = leer.nextDouble()* 0.2;
		
		System.out.println("Ingrese nota 2: ");
		double nota2 = leer.nextDouble()* 0.2;
		
		System.out.println("Ingrese nota de trabajos: ");
		double notaTrabajos = leer.nextDouble()* 0.3;
		
		System.out.println("Ingrese nota de examen final: ");
		double examenFinal = leer.nextDouble()* 0.3;
		
		double notaFinal = nota1+ nota2 + notaTrabajos + examenFinal;
		
		System.out.println("Su nota definitiva es: " + notaFinal);
		break;
		
		} System.out.println("vuelve pronto");
	}
	
	
// Primer ciclo do-while ejercicio: 4.
	public void ciclo5() {
		
		
		@SuppressWarnings("resource")
		Scanner leer = new Scanner(System.in);
		String respuesta;
		
		
		
	
		do 
		{
			System.out.println("Te gustaria calcular el porcentaje de un valor?: si o no");
			respuesta = leer.next().toLowerCase();
			switch (respuesta) {
			
			case "si":
				System.out.println("Ingrese valor 1");
				int valor1 = leer.nextInt();
				
				System.out.println("Ingrese el porcentaje a completar");
				double porcentaje = leer.nextInt();	
				
				double multp = valor1 * porcentaje;
			
				System.out.println("el porcentaje de su valor es: " + multp / 100);
				System.out.println("--------------------------");
				respuesta="";
				break;
			case "no":
				System.out.println("CHAO!");
				
				break;
			default:
				break;
			}
			
		} while (respuesta!="no");
	}
		
			
	
	
	
//	9. Determine el valor de x obtenido para la siguiente ecuación: x=a+b2a.	
	
	public void ciclo6() {
		
		
		@SuppressWarnings("resource")
		Scanner leer = new Scanner(System.in);
		String respuesta;
		
		do 
		{
			System.out.println("Te gustaria obtener el valor de x?: si o no");
			respuesta = leer.next().toLowerCase();
			
			switch (respuesta) {
			case "si":
				System.out.println("Ingrese valor de A:");
				int valorA = leer.nextInt();
				
				System.out.println("Ingrese valor de B:");
				int valorB = leer.nextInt();	
				
				int proceso = (valorA +(valorB * 2 * valorA));
				
				//x=a+b2a
			
				System.out.println("El resultado de x es: " + proceso );
				break;
			case "no":
				System.out.println("chao!");
				break;
			default:
				break;
			}
			
		} while (respuesta!="no"); 
		
			
			
			} 
		
	}


	
	














