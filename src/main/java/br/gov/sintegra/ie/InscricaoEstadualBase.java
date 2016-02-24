package br.gov.sintegra.ie;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 *
 * @author kaoe
 */
public abstract class InscricaoEstadualBase implements InscricaoEstadual {

	private final Pattern patternNumber = Pattern.compile("[0-9]");

	protected boolean isNumero(String numero) {
		return patternNumber.matcher(numero).matches();
	}

	protected String limpar(String numero, String regEx) {
		return numero.toUpperCase().replaceAll(regEx, "");
	}

	protected int toInt(String num) {
		return Integer.parseInt(num);
	}

	protected String toStr(int num) {
		return Integer.toString(num);
	}

	protected Integer[] split(String numero) {
		List<Integer> itens = new ArrayList<Integer>();
		for (int i = 0; i < numero.length(); i++) {
			String digito = numero.substring(i, i + 1);
			if (isNumero(digito)) {
				itens.add(toInt(digito));
			}
		}
		return itens.toArray(new Integer[0]);
	}

	protected Integer[] multiplicar(Integer[] numeros, Integer[] multiplicadores) {
		Integer[] resultado = new Integer[multiplicadores.length];
		for (int i = 0; i < multiplicadores.length; i++) {
			int multiplicador = multiplicadores[i];
			int numero = numeros.length > i ? numeros[i] : 0;
			resultado[i] = numero * multiplicador;
		}
		return resultado;
	}

	protected int somar(Integer[] numeros) {
		int resultdado = 0;
		for (int num : numeros) {
			resultdado += num;
		}
		return resultdado;
	}

	protected int reduzir(Integer[] numeros) {
		int resultdado = 0;
		for (int num : numeros) {
			if (num < 10) {
				resultdado += num;
			} else {
				resultdado += reduzir(split(toStr(num)));
			}
		}
		return resultdado;
	}

	protected int right(int numero) {
		String num = toStr(numero);
		if (num.length() == 1)
			return numero;
		return toInt(num.substring(num.length() - 1, num.length()));
	}

	protected int round(double num) {
		return (int) num;
	}

	protected int dezena(int num) {
		if (num % 10d == 0)
			return num;
		int digito = round(num / 10d);
		return (digito + 1) * 10;
	}

	protected int modulo11(int numero) {
		return numero % 11;
	}

	protected int modulo10(int numero) {
		return numero % 10;
	}

	protected int modulo9(int numero) {
		return numero % 9;
	}

	protected boolean in(int num, Integer... lista) {
		for (int i : lista) {
			if (num == i)
				return true;
		}
		return false;
	}

	public abstract boolean validar(String numero);

}
