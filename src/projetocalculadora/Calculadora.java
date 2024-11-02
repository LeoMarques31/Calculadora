package projetocalculadora;

public class Calculadora {
		private double n1;
		private double n2;
		private double resultado;
		private String operador;
		private boolean statusCalculadoraLigada;

		public Calculadora(double n1, double n2, double resultado, String operador, boolean statusCalculadoraLigada) {
			super();
			this.n1 = 0;
			this.n2 = 0;
			this.resultado = 0;
			this.operador = "";
			this.statusCalculadoraLigada = false;
		}

		public Calculadora() {
			super();
		}

		public void ligarCalculadora(String ligar) {
			if (getStatusCalculadoraLigada() && !ligar.equalsIgnoreCase("L")) {
				System.out.println("Opção errada! pressionea a tecla [ L ] para ligar. ");

			} else {
				System.out.println("CALCULADORA LIGADA!");
			}
			setStatusCalculadoraLigada(true);
		}

		public void desligarCalculadora(String desligar) {
			if (getStatusCalculadoraLigada() && !desligar.equalsIgnoreCase("D")) {
				System.out.println("Opção errada! pressione a tecla [ D ] para ligar. ");

			} else {
				System.out.println("CALCULADORA DESLIGADA!");
			}
		}

		public void multiplicar() {
			if (getStatusCalculadoraLigada()) {
				if (this.operador.equalsIgnoreCase("X")) {
					this.resultado = n1 * n2;
					System.out.println("RESULTADO = " + resultado);
					// System.out.println("Resultado da Multiplicação de " + n1 + " X " + n2 + " = "
					// + resultado);

				} else {
					System.out.println("A calculadora não está ligada.");
				}
			}
		}

		public void dividir() {
			if (getStatusCalculadoraLigada()) {
				if (getOperador().equals("/")) {
					if (n2 != 0) {
						resultado = n1 / n2;
						System.out.printf("RESULTADO = %.2f ", resultado);
						// System.out.println("Resultado da Divisão de " + n1 + " / " + n2 + " = "
						// +resultado);

					} else {
						System.out.println("Erro: Divisão por zero não é permitida.");
					}
				}
			} else {
				System.out.println("A calculadora não está ligada.");
			}
		}

		public void somar() {
			if (getStatusCalculadoraLigada()) {
				if (getOperador().equals("+")) {
					this.resultado = n1 + n2;
					System.out.println("RESULTADO = " + resultado);
					// System.out.println("Resultado da Soma de " + n1 + " + " + n2 + " = " +
					// resultado);
				}
			} else {
				System.out.println("A calculadora não está ligada.");
			}
		}

		public void subtrair() {
			if (getStatusCalculadoraLigada()) {
				if (getOperador().equals("-")) {
					this.resultado = n1 - n2;
					System.out.println("RESULTADO = " + resultado);
				}
			} else {
				System.out.println("A calculadora não está ligada.");
			}
		}

		public double getN1() {
			return n1;
		}

		public void setN1(double n1) {
			this.n1 = n1;
		}

		public double getN2() {
			return n2;
		}

		public void setN2(double n2) {
			this.n2 = n2;
		}

		public double getResultado() {
			return resultado;
		}

		public void setResultado(double resultado) {
			this.resultado = resultado;
		}

		public String getOperador() {
			return operador;
		}

		public void setOperador(String opedador) {
			this.operador = opedador;
		}

		public boolean getStatusCalculadoraLigada() {
			return statusCalculadoraLigada;
		}

		public void setStatusCalculadoraLigada(boolean statusCalculadoraLigada) {
			this.statusCalculadoraLigada = statusCalculadoraLigada;
		}

	}


